package haxe.tree.utils;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.BinaryOperaionContainer.BoolOperations;
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
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.MethodCallNode;
import haxe.imp.parser.antlr.tree.specific.NewNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.SliceNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.WhileNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode.DeclarationType;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import workspace.elements.HaxeProject;

public class HaxeTreeLinker extends AbstractHaxeTreeVisitor
{
    private HashMap<String, HaxeTree> imports;
    private enum ScopeTypes {Class, Function};
    private ScopeTypes currentScope = ScopeTypes.Class;
    private HaxeProject project;
    
    public HaxeTreeLinker(HaxeProject proj)
    {
        this();
        project = proj;
    }
    
    public HaxeTreeLinker()
    {
        imports = new HashMap<String, HaxeTree>();
    }
    
    @Override
    public void visit(final HaxeTree t)
    {
        imports = new HashMap<String, HaxeTree>(); 
        currentScope = ScopeTypes.Class;
        super.visit(t);
    }
    
    @Override
    protected void visit(AssignOperationNode node, Object data)
    {
        HaxeTree leftOperand = node.getLeftOperand();
        HaxeTree rightOperand = node.getRightOperand();
        
        visit(leftOperand, data);
        visit(rightOperand, data);
        
        HaxeType assignmentType;
        BoolOperations operationType = node.getOperationType();
        
        // null = means we have simple assignment
        if (operationType != null)
        {
            assignmentType = node.defineResultType(operationType);
            if (assignmentType == null)
            {
                //node.commitInvalidAssignmentError();
                return;
            }
        }
        else
        {
            assignmentType = rightOperand.getHaxeType();            
        }
        
        node.setHaxeType(assignmentType);
        if (leftOperand.ifUndefinedType())
        {
            leftOperand.setHaxeType(assignmentType);
        }
    }

    @Override
    protected void visit(ArrayNode node, Object data)
    {
        if (node.getChildCount() == 0)
        {
            return;
        }
        // TODO: find links for child objects
    }

    @Override
    protected void visit(ConstantNode node, Object data)
    {
        // TODO: nothing to write here?  
    }

    @Override
    protected void visit(ReturnNode node, Object data)
    {
        Environment declarations = (Environment)data;
        // due to Antlr grammar the places there Return wasnt
        // expected already marked as Error nodes - so there
        // is no variant that function will be null
        node.setFunction(declarations.getLastFunction());
        
        HaxeTree expression = node.getExpression();
        visit(expression, declarations);
    }

    @Override
    protected void visit(BinaryExpressionNode node, Object data)
    {
        Environment declarations = (Environment)data;
        HaxeTree leftNode = node.getLeftOperand();
        HaxeTree rightNode = node.getRightOperand();
        
        visit(leftNode, declarations);
        visit(rightNode, declarations);
        
        BoolOperations operationType = node.getOperationType();
        HaxeType definedType = node.defineResultType(operationType);
        if (definedType != null)
        {
            node.setHaxeType(definedType);
        }
    }

    @Override
    protected void visitUnknown(HaxeTree node, Object data)
    {
        // import
        if (node.getText().equals("import"))
        {
            String longName = node.getChild(0).getText();
            String shortName = longName.substring(longName.lastIndexOf('.') + 1);
            // here i should retrieve ast of imported file, if it's out project
            // file, for flash and others libs still null
            if (project == null)
            {
                return;
            }
            HaxeTree ast = project.getFileAST(longName);
            if (ast == null)
            {
                // TODO: search in haxe libs
            }
            // TODO: if shortName already exists - error, not to import such
            imports.put(shortName, ast);
            // if no file found - how to mark error?
            // 1-check if import pachage just slightly wrong
            // 2-maybe there is no at all such file - mark error
        }
        //else if (node.getText().equals("using"))
        {
            // TODO
        }
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
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(MethodCallNode node, Object data)
    {
        HaxeTree declaration = null;
        if (data instanceof Environment)
        {
            Environment declarations = (Environment)data;
            declaration = declarations.get(node.getText());
        }
        else if (data instanceof ClassNode)
        {
            declaration = ((HaxeTree) data).getDeclarationNode(node.getChild(0));
        }
        
        node.setDeclarationNode(declaration);
        
        // TODO: fixing needed for - transfer env or parent class!
        /*for (HaxeTree child : node.getParameters())
        {
            visit(child, data);
        }
        
        if (node.isFieldUse())
        {
            visit(node.getChild(node.getChildCount() -1), data);
        }*/
    }

    @Override
    protected void visit(SliceNode node, Object data)
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
            // importes
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
    protected void visit(ErrorNode node, Object data)
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

        node.updateInfo();
        HaxeTree initialization = node.getInitializationNode();
        if (initialization == null)
        {
            return;
        }
        visit(initialization, declarations);
        HaxeType type = node.getHaxeType();
        if (type == PrimaryHaxeType.haxeUndefined)
        {
            node.setHaxeType(initialization.getHaxeType());
        }
    }

    @Override
    protected void visit(final FunctionNode node, Object data)
    {
        Environment funEnv = new Environment((Environment)data);
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
    protected void visit(ClassNode node, Object data)
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
    protected void visit(IfNode node, Object data)
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
        
        if (!node.getIfLastInScope())
        {
            // If an if block is not supposed to return any value 
            // (like in the middle of a Block)
            // then both expr-1 and expr-2 can have different types 
            // and the if block type will be Void.
            node.setHaxeType(PrimaryHaxeType.haxeVoid);
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
    protected void visit(ForNode node, Object data)
    {
        // TODO Auto-generated method stub
        visitUnknown(node, data);
    }

    @Override
    protected void visit(WhileNode node, Object data)
    {
        // TODO Auto-generated method stub
        visitUnknown(node, data);
    }

    @Override
    protected void visitHighLevel(HaxeTree node, Object data)
    {
        if (data == null)
        {
            data = new Environment();
        }
        visitAllChildren(node, data);
    }
}