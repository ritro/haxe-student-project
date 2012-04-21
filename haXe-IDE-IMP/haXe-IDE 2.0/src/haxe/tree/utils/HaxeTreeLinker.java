package haxe.tree.utils;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.ArrayNode;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.EnumNode;
import haxe.imp.parser.antlr.tree.specific.ErrorNode;
import haxe.imp.parser.antlr.tree.specific.ForNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.HaxeType;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.MethodCallNode;
import haxe.imp.parser.antlr.tree.specific.NewNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.SliceNode;
import haxe.imp.parser.antlr.tree.specific.UnarExpressionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.WhileNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode.DeclarationType;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import imp.parser.antlr.main.HaxeParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.runtime.CommonToken;

import workspace.Activator;
import workspace.elements.HaxeProject;

public class HaxeTreeLinker extends AbstractHaxeTreeVisitor
{
    private HashMap<String, HaxeTree> imports;
    private List<String> usings;
    private enum ScopeTypes {Class, Function};
    private ScopeTypes currentScope = ScopeTypes.Class;
    private HaxeProject project;
    private HashMap<String, HaxeType> currentFileTypes = null;
    
    public HaxeTreeLinker(HaxeProject proj)
    {
        this();
        project = proj;
    }
    
    public HaxeTreeLinker()
    {
        initialize();
    }
    
    @Override
    public void visit(final HaxeTree t)
    {
        initialize();
        try
        {
            super.visit(t);
        }
        catch (Exception e)
        {
            String message = "HaxeTreeLinker.visit: " + e.getMessage();
            e.printStackTrace();
            Activator.logger.error(message);
        }
    }
    
    private void initialize()
    {
        imports = new HashMap<String, HaxeTree>(); 
        usings = new ArrayList<String>();
        currentScope = ScopeTypes.Class;
        currentFileTypes = new HashMap<String, HaxeType>();
    }
    
    /**
     * @param data - current environment or parent class
     * @return
     */
    private HaxeTree getDeclaration(Object data, String text)
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
        
        return null;
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
        if (!(thisType instanceof ClassNode))
        {
            return null;
        }
        ClassNode cclass = (ClassNode)thisType;
        // 1. search in current class type params
        for (HaxeType type : cclass.getParameterTypes())
        {
            if (type.getText().equals(shortTypeName))
            {
                return type;
            }
        }
        // 2. search in Standart Types
        HaxeType result = 
                HaxeTypeUtils.getStandartTypeByName(shortTypeName);
        if (result != null)
        {
            return result;
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
    protected void visit(final AssignOperationNode node, Object data)
    {
        HaxeTree leftOperand = node.getLeftOperand();
        HaxeTree rightOperand = node.getRightOperand();
        
        visit(leftOperand, data);
        visit(rightOperand, data);
        
        if (!leftOperand.ifUndefinedType())
        {
            leftOperand.setHaxeType(rightOperand.getHaxeType());
        }
        
        node.setHaxeType(leftOperand.getHaxeType(true));
    }

    @Override
    protected void visit(final ArrayNode node, final Object data)
    {
        if (node.getChildCount() == 0)
        {
            return;
        }
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(ConstantNode node, Object data)
    {
        // nothing to write here?  
    }

    @Override
    protected void visit(ReturnNode node, Object data)
    {
        Environment declarations = (Environment)data;
        // due to Antlr grammar the places there Return wasn't
        // expected already marked as Error nodes - so there
        // is no variant that function will be null
        FunctionNode function = declarations.getLastFunction();
        node.setFunction(function);
        
        HaxeTree expression = node.getExpression();
        if (expression == null)
        {
            return;
        }
        visit(expression, declarations);
        HaxeType exprType = expression.getHaxeType();
        
        // if here is Undefined - then some return node already
        // tryed to set it's type and failed due to unknown type
        // of expression - we should leave it as it is
        if (function == null
                || !function.getHaxeType().equals(HaxeTypeUtils.getVoid())
                || function.getHaxeType() != null)
        {
            return;
        }
        function.setHaxeType(node.getHaxeType());
    }

    @Override
    protected void visit(final BinaryExpressionNode node, Object data)
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
    
    protected void visit(final UnarExpressionNode node, Object data)
    {
        visit(node.getExpression(), data);
    }

    @Override
    protected void visitUnknown(HaxeTree node, Object data)
    {
        CommonToken token = node.getToken();
        if (token != null && token.getType() == HaxeParser.TYPE_TAG) 
        {
            HaxeTree child = node.getChild(0);
            if (child != null)
            {
                String typeName = child.getText();
                HaxeType type = getType(typeName, data);
            }
        } 
        
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
    
    protected void addImport(final HaxeTree node, final boolean addToUsings)
    {
        String longName = node.getText();
    	String shortName = longName.substring(longName.lastIndexOf('.') + 1);
        // here i should retrieve ast of imported file, if it's out project
        // file, for flash and others libs still null
        if (project == null)
        {
            return;
        }
        HaxeTree ast = project.getFileAST(shortName, longName);
        if (ast == null)
        {
            // TODO: search in haxe libs
        }
        // TODO: if shortName already exists - error, not to import such
        imports.put(shortName, ast);
        if (addToUsings)
        {
        	usings.add(shortName);
        }
        // if no file found - how to mark error?
        // 1-check if import package just slightly wrong
        // 2-maybe there is no at all such file - mark error
    }
    
    protected void visitMemberUse(VarUsageNode node, Object data)
    {
        HaxeTree decl = null;
        if (data instanceof ClassNode)
        {
            ClassNode parent = (ClassNode)data;
            decl = parent.getDeclaration(node.getText());
        }
        node.setDeclarationNode(decl);

        if (!node.isFieldUse() && !(
                decl instanceof ClassNode ||
                decl instanceof EnumNode)) //+ interface ??
        {
            return;
        }
        
        HaxeTree child = node.getChild(0).getChild(0);
        // slices and methcalls
        if (child instanceof MethodCallNode ||
                child instanceof SliceNode)
        {
            visit(child, decl);
        }
        // dot ident
        else 
        {
            visitMemberUse((VarUsageNode)child,  decl);
        }
    }

    @Override
    protected void visit(BlockScopeNode node, Object data)
    {
        if (node == null)
        {
            return;
        }
        Environment declarations = (Environment)data;
        ArrayList<FunctionNode> functions = new ArrayList<FunctionNode>();
        
        if (currentScope == ScopeTypes.Class)
        {            
            //note that for classes we can only have
            //function varDecl Right brace as members
            
            for (HaxeTree tree : node.getChildren()) 
            {
                if (tree instanceof FunctionNode)
                {
                    FunctionNode function = (FunctionNode)tree;
                    functions.add(function);
                    declarations.put(function);
                }
                else 
                {
                    visit(tree, declarations);
                }
            }
            
            for (FunctionNode function : functions)
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
            if (pack.endsWith("." + name))
            {
            	HaxeTree pDeclaration = imports.get(pack);
            	if (!(pDeclaration instanceof ClassNode))
            	{
            		// TODO and what to do?
            		return;
            	}
            	//if (object.getChildCount() != pDeclaration.getc)
            	{
            		
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
    protected void visit(final MethodCallNode node, Object data)
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
            declaration = declarations.get(node.getText());
        }
        else if (data instanceof ClassNode)
        {
            declaration = ((HaxeTree) data).getDeclarationNode(node.getChild(0));
        }
        
        if ( declaration == null || !(declaration instanceof FunctionNode))
        {
            return;
        }
        
        List<VarDeclarationNode> declParams = 
                ((FunctionNode)declaration).getParametersAsDeclarations();
        
        // TODO: whtat about optional params?
        if (declParams.size() != params.size())
        {
            return;
        }
        
        for (int i = 0; i < params.size(); i++)
        {
            HaxeType ctype = params.get(i).getHaxeType(true);
            HaxeType dType = declParams.get(i).getHaxeType(true);
            if (!ctype.equals(dType))
            {
                return;
            }
        }
        node.setDeclarationNode(declaration);
    }

    @Override
    protected void visit(final SliceNode node, final Object data)
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
    protected void visit(VarUsageNode node, Object data)
    {
        // search for declaration
        // 1 - local vars - last declared
        Environment declarations = (Environment)data;
        HaxeTree declaration = declarations.get(node.getText());
        // 2 - class member, inherit fields????
        // 3 - curr class static fields???
        // 4 - enums declared
        if (declaration == null)
        {
            // imports
            declaration = imports.get(node.getText());
        }
        
        node.setDeclarationNode(declaration);
        
        // check if it is dotident and CAN have a member
        if (!node.isFieldUse() && !(
                declaration instanceof ClassNode ||
                declaration instanceof EnumNode)) //+ interface ??
        {
            return;
        }
        HaxeTree child = node.getChild(0).getChild(0);
        // slices and methcalls
        // TODO: here we should send not the Declaration
        // but the HaxeTree found by type name
        if (child instanceof MethodCallNode ||
                child instanceof SliceNode)
        {
            visit(child, declaration);
        }
        // dot ident
        else
        {
            visitMemberUse((VarUsageNode)child,  declaration);
        }
    }

    @Override
    protected void visit(final ErrorNode node, Object data)
    {
        // do nothing here
    }

    @Override
    protected void visit(final VarDeclarationNode node, Object data)
    {
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
            if (tree.getToken().getType() == HaxeParser.TYPE_TAG
                    && tree.getChildCount() != 0) 
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
            node.setHaxeType(initialization.getHaxeType());
        }
    }

    @Override
    protected void visit(final FunctionNode node, Object data)
    {
        Environment funEnv = new Environment((Environment)data);
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
        for (VarDeclarationNode x: node.getParametersAsDeclarations())
        {
            x.setDeclaratonType(DeclarationType.FunctionParameter);
            x.updateInfo();
            funEnv.put(x);
        }
        
        node.updateInfo();        
        
        BlockScopeNode blockScope = node.getBlockScope();

        currentScope = ScopeTypes.Function;
        visit(blockScope, funEnv);
        endVisit();
    }

    @Override
    protected void visit(final ClassNode node, Object data)
    {
        node.analizeInherits();
        Environment env = (Environment)data;
        env.putWithCustomName("this", node);
        HaxeTree inherits = node.getParentToExtend();
        if (inherits != null)
        {
            env.putWithCustomName("super", inherits);
        }
        
        BlockScopeNode blockScope = node.getBlockScope();
        
        visit(blockScope, env);
    }
    
    private void endVisit()
    {
        currentScope = ScopeTypes.Class;
    }

    @Override
    protected void visit(final IfNode node, Object data)
    {
        Environment declarations = (Environment)data;
        int thisIndex = node.getChildIndex();
        int maxIndex = node.parent.getChildCount();
        
        if (node.parent instanceof BlockScopeNode)
        {
            node.setIfLastInScope(thisIndex == maxIndex - 1);           
        }
        
        HaxeTree ifBlock = node.getIfBlock();
        HaxeTree elseBlock = node.getElseBlock();
        
        visit(ifBlock, declarations);
        
        if (!node.isLastInScope())
        {
            node.setHaxeType(HaxeTypeUtils.getVoid());
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
        if (elseBlock.getHaxeType().equals(type))
        {
            // If there is an else, then expr-1 and expr-2 must be of the same type and 
            // this will be the type of the if expression
            // TODO: maybe equals not the right part - available assignment?
            node.setHaxeType(type);          
        }
    }

    @Override
    protected void visit(final ForNode node, final Object data)
    {
        visitAllChildren(node, data);
        node.setHaxeType(node.getScope().getHaxeType());
    }

    @Override
    protected void visit(final WhileNode node, final Object data)
    {
        visitAllChildren(node, data);
        node.setHaxeType(node.getScope().getHaxeType());
    }

    @Override
    protected void visitHighLevel(final HaxeTree node, Object data)
    {
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
