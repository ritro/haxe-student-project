package haxe.tree.utils;

import haxe.imp.parser.antlr.tree.HaxeTree;
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

public class HaxeTreeErrorProvider extends AbstractHaxeTreeVisitor
{

    @Override
    protected void visit(ClassNode node, Object data)
    {
        BlockScopeNode blockScope = node.getBlockScope();
        
        visit(blockScope, data);
    }

    @Override
    protected void visit(FunctionNode node, Object data)
    {
        if (node.isConstructor() && node.isDuplicate())
        {
            ErrorPublisher.commitDuplicateConstructorError(node);
        }
        else if (node.isDuplicate())
        {
            ErrorPublisher.commitDuplicateFieldError(node);
        }
        // making 'override' modifier of function 
        // even in class without
        // extending - shows no errors
        
        BlockScopeNode blockScope = node.getBlockScope();
        
        visit(blockScope, data);
    }

    @Override
    protected void visit(VarDeclarationNode node, Object data)
    {
        if (node.isDuplicate())
        {
            ErrorPublisher.commitDuplicateFieldError(node);
        }
        if (node.ifUndefinedType() && 
                node.getDeclaratonType() == DeclarationType.ClassVarDeclaration)
        {
            ErrorPublisher.commitClassUndefinedTypeError(node);
        }
    }

    @Override
    protected void visit(VarUsageNode node, Object data)
    {
        if (node.getDeclarationNode() == null)
        {
            node.commitUndeclaredError();
            return;
        }

        // FIXME - what about usage in Declarations?
        // look on parent isn't good looking
        if (node.ifUndefinedType())
        {
            node.commitUninitializedUsingError();
        }
    }

    @Override
    protected void visit(AssignOperationNode node, Object data)
    {
        HaxeTree leftOperand = node.getLeftOperand();
        HaxeTree rightOperand = node.getRightOperand();
        
        visit(leftOperand, data);
        visit(rightOperand, data);
        
        HaxeType firstType = leftOperand.getHaxeType();
        HaxeType secondType = rightOperand.getHaxeType();        
        if (data != null)
        {
            // we previosly marked error
            return;
        }
        else if (!HaxeType.isAvailableAssignement(firstType, secondType))
        {
            node.commitCastError();
        }
    }

    @Override
    protected void visit(ConstantNode node, Object data)
    {
        //seems it needs no errors yet
    }

    @Override
    protected void visit(ReturnNode node, Object data)
    {
        HaxeType type = node.getHaxeType();
        FunctionNode function = node.getFunction();
        
        HaxeType funType = function == null 
                ? PrimaryHaxeType.haxeVoid : function.getHaxeType();
        if (!HaxeType.isAvailableAssignement(funType, type))
        {
            ErrorPublisher.commitCastError(node, funType);
        }
    }

    @Override
    protected void visit(BinaryExpressionNode node, Object data)
    {
        HaxeTree leftOperand = node.getLeftOperand();
        HaxeTree rightOperand = node.getRightOperand();
        
        visit(leftOperand, data);
        visit(rightOperand, data);
        
        HaxeType firstType = leftOperand.getHaxeType();
        HaxeType secondType = rightOperand.getHaxeType();
        if (data != null)
        {
            return;
        }
        else if (!HaxeType.isAvailableAssignement(firstType, secondType) 
                && !HaxeType.isAvailableAssignement(secondType, firstType))
        {
            data = node;
            node.commitCastError();
        }
    }

    @Override
    protected void visit(BlockScopeNode node, Object data)
    {
        visitAllChildren(node, data);
    }

    @Override
    protected void visit(ErrorNode node, Object data)
    {
        // TODO Auto-generated method stub

    }

    @Override
    protected void visitUnknown(HaxeTree node, Object data)
    {
        // TODO Auto-generated method stub

    }

    @Override
    protected void visit(IfNode node, Object data)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void visitHighLevel(HaxeTree node, Object data)
    {
        visitAllChildren(node, data);
    }

}
