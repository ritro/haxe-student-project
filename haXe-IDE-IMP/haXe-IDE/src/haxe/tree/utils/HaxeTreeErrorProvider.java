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
        // TODO Auto-generated method stub

    }

    @Override
    protected void visit(VarDeclarationNode node, Object data)
    {
        if (node.ifUndefinedType() && 
                node.getDeclaratonType() == DeclarationType.ClassVarDeclaration)
        {
            node.commitClassUndefinedTypeError();
        }
    }

    @Override
    protected void visit(VarUsageNode node, Object data)
    {
        if (node.getDeclarationNode() == null)
        {
            //FIXME packets, classes, else?
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
        
        if (!HaxeType.isAvailableAssignement(
                leftOperand.getHaxeType(), 
                rightOperand.getHaxeType()))
        {
            node.commitCastError();
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
        HaxeTree expression = node.getExpression();
        HaxeType type = node.getHaxeType();
        
        if (node.getFunction() != null && type == PrimaryHaxeType.haxeVoid)
        {
            node.commitError("Void should be " + type.toString());
            return;
        }
        
        if (node.getFunction().getHaxeType() != type)
        {
            expression.commitError(expression.getHaxeType()
                    + " should be " + type);
        }
    }

    @Override
    protected void visit(BinaryExpressionNode node, Object data)
    {
        // TODO Auto-generated method stub

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
