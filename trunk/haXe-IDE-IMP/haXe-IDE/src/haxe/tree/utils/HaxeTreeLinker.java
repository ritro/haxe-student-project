package haxe.tree.utils;

import haxe.imp.parser.antlr.tree.BinaryOperaionContainer;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.BinaryOperaionContainer.BoolOperations;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.ErrorNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode.DeclarationType;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;

import java.util.ArrayList;

public class HaxeTreeLinker extends AbstractHaxeTreeVisitor
{
    private enum ScopeTypes {Class, Function};
    private ScopeTypes currentScope = ScopeTypes.Class;

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
                node.commitInvalidAssignmentError();
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
    protected void visit(ConstantNode node, Object data)
    {
        // TODO Auto-generated method stub        
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
        if (definedType == null)
        {
            node.commitCastError();
        }
        else
        {
            node.setHaxeType(definedType);
        }
    }

    @Override
    protected void visitUnknown(HaxeTree node, Object data)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void visit(BlockScopeNode node, Object data)
    {
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
    protected void visit(VarUsageNode node, Object data)
    {
        Environment declarations = (Environment)data;
        HaxeTree declaration = declarations.get(node.getText());
        
        node.setDeclarationNode(declaration);
    }

    @Override
    protected void visit(ErrorNode node, Object data)
    {
        node.commitUnexpectedError();
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

        node.tryExtractType();
        VarUsageNode varUsage = node.getVarNameNode();
        varUsage.setDeclarationNode(node);
        HaxeTree initialization = node.getVAR_INIT_NODE();
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
        else if (!HaxeType.isAvailableAssignement(type, initialization.getHaxeType()))
        {
            varUsage.commitError(
                    initialization.getHaxeType() + " should be " + type);
        }
    }

    @Override
    protected void visit(final FunctionNode node, Object data)
    {
        Environment funEnv = new Environment((Environment)data);
        for (VarDeclarationNode x: node.getParametersAsDeclarations())
        {
            x.setDeclaratonType(DeclarationType.FunctionParameter);
            funEnv.put(x);
        }
        
        BlockScopeNode blockScope = node.getBlockScope();

        currentScope = ScopeTypes.Function;
        visit(blockScope, funEnv);
        endVisit();
    }

    @Override
    protected void visit(ClassNode node, Object data)
    {
        BlockScopeNode blockScope = node.getBlockScope();
        
        visit(blockScope, data);
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
            //Last in all Blockscopes always '}'
            node.setIfLastInScope(thisIndex == maxIndex - 2);           
        }
        else
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
            node.setHaxeType(type);          
        }
        else
        {
            node.commitError("The blocks returns different value types.");           
        }
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
