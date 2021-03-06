package tree.utils;

import imp.parser.antlr.HaxeParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import tree.ErrorNode;
import tree.Function;
import tree.HaxeTree;
import tree.Module;
import tree.TypeTag;
import tree.expression.Array;
import tree.expression.Assignment;
import tree.expression.Binary;
import tree.expression.Constant;
import tree.expression.Declaration;
import tree.expression.MethodCall;
import tree.expression.NewNode;
import tree.expression.Slice;
import tree.expression.Unary;
import tree.expression.Usage;
import tree.expression.Declaration.DeclarationType;
import tree.statement.BlockScope;
import tree.statement.For;
import tree.statement.IfNode;
import tree.statement.Return;
import tree.statement.While;
import tree.type.Class;
import tree.type.Enum;
import tree.type.HaxeType;
import workspace.Activator;
import workspace.ProjectManager;
import workspace.elements.AbstractHaxeProject;
import workspace.elements.CodeFile;
import workspace.elements.HaxeLibProject;

public class Linker extends AbstractHaxeTreeVisitor
{
    private HashMap<String, HaxeTree> imports;
    private List<String> usings;
    private enum ScopeTypes {Class, Function};
    private ScopeTypes currentScope = ScopeTypes.Class;
    private AbstractHaxeProject project;
    private HashMap<String, HaxeType> currentFileTypes = null;
    private boolean isLibProject = false;
    private String currentPackage = null;
    private ProjectManager projectManager = null;
    
    public Linker(AbstractHaxeProject abstractHaxeProject)
    {
        this();
        project = abstractHaxeProject;
        if (project instanceof HaxeLibProject)
        {
            isLibProject = true;
        }
    }
    
    public Linker()
    {
        initialize();
    }
    
    @Override
    public void visit(HaxeTree t)
    {
        initialize();
        try
        {
            super.visit(t);
        }
        catch (Exception e)
        {
            String message = "HaxeTreeLinker.visit: " + e.getMessage();
            Activator.logger.error(message);
        }
    }
    
    private void initialize()
    {
        imports = new HashMap<String, HaxeTree>(); 
        usings = new ArrayList<String>();
        currentScope = ScopeTypes.Class;
        currentFileTypes = new HashMap<String, HaxeType>();
        projectManager = Activator.getProjectManager();
    }
    
    /**
     * @param data - current environment or parent class
     * @return
     */
    private HaxeTree getDeclaration(final Object data, final String text)
    {
        HaxeTree decl = null;
        if (data instanceof Environment)
        {
            Environment env = (Environment)data;
            decl = env.get(text);
        }
        else if (data instanceof HaxeType)
        {
            HaxeType clas = (HaxeType) data;
            decl = clas.getDeclaration(text);
        }
        
        return decl;
    }
    
    /**
     * When a type name is found, the following lookup is performed, in this order:
     * 1. current class type parameters
     * 2. standard types (with the help of HaxeTypeUtils)
     * 3. types declared in the current file
     * 4. types declared in imported files (if the searched package is empty)
     * 5. the corresponding file is loaded and the type is searched inside it
     */
    private HaxeType getType(final String shortTypeName, final Object local)
    {
        // we can have here only environment because all TYPES we use
        // should be imported in this file
        // but the defend from fools should be everywhere ... ?
        if (!(local instanceof Environment))
        {
            return null;
        }
        Environment env = (Environment)local;
        HaxeType thisType = (HaxeType)env.get("this");
        // only classes can have type params
        if (thisType instanceof Class)
        {
            Class cclass = (Class)thisType;
            // 1. search in current class type params
            for (HaxeType type : cclass.getParameterTypes())
            {
                if (type.getText().equals(shortTypeName))
                {
                    return type;
                }
            }
        }
        HaxeType result = null;
        if (!isLibProject)
        {
            // 2. search in Standart Types
            result = TypeUtils.getStandartTypeByName(shortTypeName);
            if (result != null)
            {
                return result;
            }
        }
        else
        {
            result = TypeUtils.getStandartTypeByName(
                    shortTypeName, 
                    (HaxeLibProject)project);
            if (result != null)
            {
                return result;
            }
        }
        // 3.types in the current file
        result = currentFileTypes.get(shortTypeName);
        if (result != null)
        {
            return result;
        }
        // 4. types declared in imported files
        // TODO: What means - "if the searched package is empty"?
        HaxeTree node = imports.get(shortTypeName);
        if (node != null)
        {
            for (HaxeTree child : node.getChildren())
            {
                if (child instanceof HaxeType && 
                        child.getText().equals(shortTypeName))
                {
                    return (HaxeType)child;
                }
            }
        }
        for (HaxeTree modul: imports.values())
        {
            if (modul == null)
            {
                continue;
            }
            for (HaxeTree child : modul.getChildren())
            {
                if (child instanceof HaxeType && 
                        child.getText().equals(shortTypeName))
                {
                    return (HaxeType)child;
                }
            } 
        }
        // 5. the corresponding file is loaded and the type is searched inside it
        
        return null;
    }
    
    @Override
    protected void visit(Assignment node, Object data)
    {
        HaxeTree leftOperand = node.getLeftOperand();
        HaxeTree rightOperand = node.getRightOperand();
        
        visit(leftOperand, data);
        visit(rightOperand, data);
        
        if (leftOperand.isUndefinedType())
        {
            leftOperand.setHaxeType(rightOperand.getHaxeType());
        }
        
        node.setHaxeType(leftOperand.getHaxeType(true));
    }

    @Override
    protected void visit(Array node, final Object data)
    {
        if (node.getChildCount() == 0)
        {
            return;
        }
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(Constant node, Object data)
    {
        // nothing to write here?  
    }

    @Override
    protected void visit(Return node, Object data)
    {
        Environment declarations = (Environment)data;
        // due to Antlr grammar the places there Return wasn't
        // expected already marked as Error nodes - so there
        // is no variant that function will be null
        Function function = TreeUtils.getParentFunction(node);
        node.setFunction(function);
        
        HaxeTree expression = node.getExpression();
        if (expression == null)
        {
            return;
        }
        visit(expression, declarations);
        //HaxeType exprType = expression.getHaxeType();
        
        // if here is Undefined - then some return node already
        // tryed to set it's type and failed due to unknown type
        // of expression - we should leave it as it is
        if (function == null
                || function.getHaxeType() != null)
        {
            return;
        }
        function.setHaxeType(node.getHaxeType());
    }

    @Override
    protected void visit(Binary node, Object data)
    {
        Environment declarations = (Environment)data;
        HaxeTree leftNode = node.getLeftOperand();
        HaxeTree rightNode = node.getRightOperand();
        
        visit(leftNode, declarations);
        visit(rightNode, declarations);
        
        HaxeType definedType = node.defineResultType();
        if (definedType != null)
        {
            node.setHaxeType(definedType);
        }
    }
    
    protected void visit(Unary node, Object data)
    {
        visit(node.getExpression(), data);
    }

    @Override
    protected void visitUnknown(HaxeTree node, Object data)
    {
        /*
        CommonToken token = node.getToken();
        if (token != null && token.getType() == HaxeParser.TYPE_TAG) 
        {
            HaxeTree child = node.getChild(0);
            if (child != null)
            {
                String typeName = child.getText();
                HaxeType type = getType(typeName, data);
            }
        }*/ 
        
        String name = node.getText();
        // import
    	// Note: Importing multiple types with wildcards is NOT supported 
    	// in haXe import flash.display.*;
        if (name.equals("import"))
        {
            addImport(node.getChild(0), false);
        }
        else if (name.equals("using"))
        {
            addImport(node.getChild(0), true);
        }
    }
    
    protected void addImport(HaxeTree node, final boolean addToUsings)
    {
        String longName = node.getText();
    	String shortName = longName.substring(longName.lastIndexOf('.') + 1);

        if (project == null)
        {
            return;
        }
        CodeFile file = project.getFile(longName);
        HaxeTree ast = null;
        if (file == null && projectManager.getHaxeLib() != null)
        {
            file = projectManager.getHaxeLib().getFile(longName);
        }
        if (file != null)
        {
            ast = file.getAst();
        }

        imports.put(shortName, ast);
        if (addToUsings)
        {
        	usings.add(shortName);
        }
    }
    
    protected void visitMemberUse(Usage node, Object data)
    {
        HaxeTree decl = null;
        if (data instanceof Class)
        {
            Class parent = (Class)data;
            decl = parent.getDeclaration(node.getText());
        }
        node.setDeclarationNode(decl);

        if (!node.isFieldUse() && !(
                decl instanceof Class ||
                decl instanceof Enum)) //+ interface ??
        {
            return;
        }
        
        HaxeTree child = node.getChild(0).getChild(0);
        // slices and methcalls
        if (child instanceof MethodCall ||
                child instanceof Slice)
        {
            visit(child, decl);
        }
        // dot ident
        else 
        {
            visitMemberUse((Usage)child,  decl);
        }
    }

    @Override
    protected void visit(BlockScope node, Object data)
    {
        if (node == null)
        {
            return;
        }
        Environment declarations = (Environment)data;
        ArrayList<Function> functions = new ArrayList<Function>();
        
        if (currentScope == ScopeTypes.Class)
        {            
            //note that for classes we can only have
            //function varDecl Right brace as members
            
            for (HaxeTree tree : node.getChildren()) 
            {
                if (tree instanceof Function)
                {
                    Function function = (Function)tree;
                    functions.add(function);
                    declarations.put(function);
                }
                else 
                {
                    visit(tree, declarations);
                }
            }
            
            for (Function function : functions)
            {
                visit(function, declarations);
            }
        }
        else
        {
            // varDecl, Brace, VarUse, Assign, IfNode    
            visitAllChildren(node, declarations);            
        }
        
    }

    @Override
    protected void visit(NewNode node, Object data)
    {
        // visit the params if there are any
        for (HaxeTree child : node.getChildren())
        {
            if (child.getChildIndex() == 0)
            {
                continue;
            }
            visit(child, data);
        }
        
        HaxeTree object = node.getObjectWhichIsCreated();
        String name = object.getText();
        HaxeTree declaration = null;
        for (String pack : imports.keySet())
        {
            // imports like a.b.c
            if (pack.equals(name))
            {
            	HaxeTree pDeclaration = imports.get(pack);
            	if (!(pDeclaration instanceof Class))
            	{
            		// TODO and what to do?
            		return;
            	}
            	declaration = pDeclaration;
            	break;
            }
        }
        // same package (without import) is not possible by 
        // same reasons as not possible to import using Wildcards
        node.setDeclarationNode(declaration);
    }

    @Override
    protected void visit(MethodCall node, Object data)
    {
        if (node.isFieldUse())
        {
            visit(node.getChild(node.getChildCount() - 1), data);
        }
        
        HaxeTree declaration = null;
        List<HaxeTree> params = node.getParameters();
        
        for (HaxeTree param : params)
        {
            visit(param, data);
        }
        
        if (data instanceof Environment)
        {
            Environment declarations = (Environment)data;
            HaxeType currClass = (HaxeType)declarations.get("this");
            declaration = currClass.getDeclaration(node.getText());
        }
        else if (data instanceof HaxeType)
        {
            declaration = ((HaxeType) data).getDeclaration(node.getChild(0).getText());
        }
        
        if ( declaration == null || !(declaration instanceof Function))
        {
            return;
        }
        
        List<Declaration> declParams = 
                ((Function)declaration).getParametersAsDeclarations();
        
        // TODO: whtat about optional params?
        if (declParams.size() != params.size())
        {
            return;
        }
        
        for (int i = 0; i < params.size(); i++)
        {
            HaxeType ctype = params.get(i).getHaxeType(true);
            HaxeType dType = declParams.get(i).getHaxeType(true);
            if (ctype != null && !ctype.equals(dType))
            {
                return;
            }
        }
        node.setDeclarationNode(declaration);
    }

    @Override
    protected void visit(Slice node, final Object data)
    {
        for (HaxeTree child : node.getParameters())
        {
            visit(child, data);
        }
        
        if (node.isFieldUse())
        {
            visit(node.getChild(node.getChildCount() -1), data);
        }
    }

    @Override
    protected void visit(Usage node, Object data)
    {
        // search for declaration
        // 1 - local vars - last declared
        String name = node.getText();
        HaxeTree declaration = getDeclaration(data, name);
        // 2 - class member, inherit fields????
        // 3 - curr class static fields???
        // 4 - enums declared
        if (declaration == null)
        {
            // imports
            declaration = getType(name, data);
        }
        
        node.setDeclarationNode(declaration);
        
        // check if it is dotident and CAN have a member
        if (!node.isFieldUse() && !(
                declaration instanceof Class ||
                declaration instanceof Enum)) //+ interface ??
        {
            return;
        }
        HaxeTree child = node.getChild(0).getChild(0);
        // slices and methcalls
        // TODO: here we should send not the Declaration
        // but the HaxeTree found by type name
        if (child instanceof MethodCall ||
                child instanceof Slice)
        {
            visit(child, declaration.getHaxeType());
        }
        // dot ident
        else
        {
            visitMemberUse((Usage)child,  declaration.getHaxeType());
        }
    }

    @Override
    protected void visit(ErrorNode node, Object data)
    {
        // do nothing here
    }

    @Override
    protected void visit(Declaration node, Object data)
    {
        node.setPackage(currentPackage);
        if (currentScope == ScopeTypes.Class)
        {
            node.setDeclaratonType(DeclarationType.ClassVarDeclaration);
        }
        
        Environment declarations = (Environment)data;
        declarations.put(node);   
        
        for (HaxeTree tree : node.getChildren()) 
        {
            if (tree == null || tree.getToken() == null)
            {
                continue;
            }
            if (tree instanceof TypeTag && tree.getChildCount() != 0) 
            {
                String typeName = tree.getChild(0).getText();
                HaxeType type = getType(typeName, declarations);
                node.setHaxeType(type);
            }
        }

        node.updateInfo();
        HaxeTree initialization = node.getInitializationNode();
        if (initialization == null)
        {
            return;
        }
        visit(initialization, declarations);
        HaxeType type = node.getHaxeType();
        if (type == null)
        {
            node.setHaxeType(initialization.getHaxeType(true));
        }
    }

    @Override
    protected void visit(Function node, Object data)
    {
        Environment funEnv = new Environment((Environment)data);
        
        node.setPackage(currentPackage);
        for (HaxeTree child : node.getChildren())
        {
            if (child.getToken().getType() == HaxeParser.TYPE_TAG) 
            {
                HaxeTree cchild = node.getChild(0);
                if (cchild != null)
                {
                    String typeName = cchild.getText();
                    HaxeType type = getType(typeName, data);
                    node.setHaxeType(type);
                }
            }
        }
        currentScope = ScopeTypes.Function;
        for (Declaration x: node.getParametersAsDeclarations())
        {
            x.setDeclaratonType(DeclarationType.FunctionParameter);
            x.updateInfo();
            visit(x, funEnv);
        }
        
        node.updateInfo();        
        
        BlockScope blockScope = node.getBlockScope();

        visit(blockScope, funEnv);
        if (node.isUndefinedType())
        {
            node.setHaxeType(TypeUtils.getVoid());
        }
        endVisit();
    }

    @Override
    protected void visit(Class node, Object data)
    {
        // class D extends A, implements B, implements C
        for (HaxeTree child : node.getChildren())
        {
            if (child.getType() == HaxeParser.EXTENDS)
            {
                HaxeTree found = child.getChild(0);
                if (found == null)
                {
                    continue;
                }
                HaxeType type = getType(found.getText(), data);
                node.setParentToExtend(type);
                node.addToTypeHierarchy(type);
            }
            if (child.getType() == HaxeParser.IMPLEMENT_LIST)
            {
                for (HaxeTree impl : child.getChildren())
                {
                    if (impl == null)
                    {
                        continue;
                    }
                    HaxeType type = getType(impl.getText(), data);
                    node.addToTypeHierarchy(type);
                }
            }
        }
        Environment env = (Environment)data;
        env.putWithCustomName("this", node);
        HaxeTree inherits = node.getParentToExtend();
        if (inherits != null)
        {
            env.putWithCustomName("super", inherits);
        }
        
        BlockScope blockScope = node.getBlockScope();
        
        visit(blockScope, env);
    }
    
    private void endVisit()
    {
        currentScope = ScopeTypes.Class;
    }

    @Override
    protected void visit(IfNode node, Object data)
    {
        Environment declarations = (Environment)data;
        int thisIndex = node.getChildIndex();
        int maxIndex = node.parent.getChildCount();
        
        if (node.parent instanceof BlockScope)
        {
            node.setIfLastInScope(thisIndex == maxIndex - 1);           
        }
        
        HaxeTree ifBlock = node.getIfBlock();
        HaxeTree elseBlock = node.getElseBlock();
        
        visit(ifBlock, declarations);
        
        if (!node.isLastInScope())
        {
            node.setHaxeType(TypeUtils.getVoid());
            return;
        }
        
        if (elseBlock == null)
        {
            // If there is no else, and the if expression is false, 
            // then the entire expression has type Void. 
            // TODO check for if expr is false and setting the type accordingly?
            return;
        }
        
        visit(elseBlock, declarations);
        
        HaxeType type = ifBlock.getHaxeType();
        HaxeType elseType = elseBlock.getHaxeType();
        if (elseType != null && elseType.equals(type))
        {
            // If there is an else, then expr-1 and expr-2 must be of the same type and 
            // this will be the type of the if expression
            // TODO: maybe equals not the right part - available assignment?
            node.setHaxeType(type);          
        }
    }

    @Override
    protected void visit(For node, final Object data)
    {
        visitAllChildren(node, data);
        node.setHaxeType(node.getScope().getHaxeType());
    }

    @Override
    protected void visit(While node, final Object data)
    {
        visitAllChildren(node, data);
        node.setHaxeType(node.getScope().getHaxeType());
    }

    @Override
    protected void visit(Module node, Object data)
    {
        currentPackage = node.getFullPackage();
        for (HaxeTree child : node.getChildren())
        {
            if (child instanceof HaxeType)
            {
                currentFileTypes.put(child.getText(), (HaxeType)child);
            }
        }
        for (HaxeTree child : node.getChildren())
        {
            data = new Environment();
            visit(child, data);            
        }
    }
}
