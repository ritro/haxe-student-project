package haxe.tree.utils;

import java.util.List;

import workspace.Activator;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.ArrayNode;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.ErrorNode;
import haxe.imp.parser.antlr.tree.specific.ForNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.MethodCallNode;
import haxe.imp.parser.antlr.tree.specific.NewNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.SliceNode;
import haxe.imp.parser.antlr.tree.specific.UnarExpressionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode.DeclarationType;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.tree.specific.WhileNode;

public class HaxeTreeErrorProvider extends AbstractHaxeTreeVisitor
{
    @Override
    public void visit(final HaxeTree t)
    {
        try
        {
            super.visit(t);
        }
        catch (Exception e)
        {
            String message = "HaxeTreeErrorProvider.visit: " + e.getMessage();
            e.printStackTrace();
            Activator.logger.error(message);
        }
    }
    
    public void visitAllChildrenSeparatly(final HaxeTree t, Object data)
    {
        if (t == null)
        {
            return;
        }
        for (HaxeTree child : t.getChildren()) 
        {
            // if there was errors in binOp, assignments and all
            // we remembered that here to make report only about
            // 1 error at a time in the same usage, but we should
            // clear the info for another usage
            data = null;
            visit(child, data);
        }
    }

    @Override
    protected void visit(final ClassNode node, Object data)
    {
        BlockScopeNode blockScope = node.getBlockScope();
        
        visit(blockScope, data);
    }

    @Override
    protected void visit(final FunctionNode node, Object data)
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
    protected void visit(final VarDeclarationNode node, Object data)
    {
        if (node.isDuplicate())
        {
            ErrorPublisher.commitDuplicateFieldError(node);
        }
        if (node.getDeclaratonType() == DeclarationType.ClassVarDeclaration
                && node.isDeclaredWithoutType())
        {
            ErrorPublisher.commitClassUndefinedTypeError(node);
        }
        
        HaxeTree initialization = node.getInitializationNode();
        if (initialization == null)
        {
            return;
        }
        HaxeType type = node.getHaxeType();
        HaxeType initType = initialization.getHaxeType();
        if (!HaxeType.isAvailableAssignement(type, initType))
        {
            ErrorPublisher.commitCastError(node, initType);
        }
    }

    @Override
    protected void visit(final NewNode node, Object data)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void visit(final MethodCallNode node, Object data)
    {
        if (node.isFieldUse())
        {
            visit(node.getChild(node.getChildCount() - 1), data);
        }

        List<HaxeTree> params = node.getParameters();
        for (HaxeTree child : params)
        {
            visit(child, data);
        }
        
        HaxeTree declaration = node.getDeclarationNode();
        if (declaration == null)
        {
            data = node;
            ErrorPublisher.commitUninitializedUsingError(node);
        }
    }

    @Override
    protected void visit(final SliceNode node, Object data)
    {
        if (node.isFieldUse())
        {
            visit(node.getChild(node.getChildCount() - 1), data);
        }
        
        for (HaxeTree child : node.getParameters())
        {
            visit(child, data);
            HaxeType ctype = child.getHaxeType(true);
            if (!ctype.equals(PrimaryHaxeType.haxeInt))
            {
                ErrorPublisher.commitCastError(child, PrimaryHaxeType.haxeInt);
            }
        }
        
        HaxeTree declaration = node.getDeclarationNode();
        if (declaration == null)
        {
            data = node;
            node.commitError("Undeclared Slice");
            return;
        }
        /*
        HaxeType type = declaration.getHaxeType();
        if (node.getParameters().size() != )
        {
            
        }*/
    }

    @Override
    protected void visit(final VarUsageNode node, Object data)
    {
        if (node.getDeclarationNode() == null)
        {
            ErrorPublisher.commitUndeclaredError(node);
            data = node;
            return;
        }
        
        if (!node.ifUndefinedType())
        {
            visit(node.getChild(0), data);
            return;
        }
        // FIXME - what about usage in Declarations?
        // look on parent isn't good looking
        data = node;
        ErrorPublisher.commitUninitializedUsingError(node);
    }

    @Override
    protected void visit(final AssignOperationNode node, Object data)
    {
        HaxeTree rightOperand = node.getRightOperand();
        
        if (node.ifUndefinedType())
        {
            visit(rightOperand, data);
        }
        else if (!HaxeType.isAvailableAssignement(
                node.getHaxeType(),
                rightOperand.getHaxeType(true)))
        {
            data = node;
            ErrorPublisher.commitInvalidAssignError(node);
            return;
        }
    }

    @Override
    protected void visit(final ArrayNode node, Object data)
    {
        if (!node.ifUndefinedType())
        {
            // empty array or all memeber's types can be assigned
            // to some common type
            return;
        }
        
        visitAllChildren(node, data);
        if (data != null)
        {
            // some member's type was undefined
            return;
        }
        // here we have...member's types are not from the same
        // hierarchy!
        HaxeType type = PrimaryHaxeType.haxeUnknown;
        for (HaxeTree child : node.getChildren())
        {
            HaxeType ctype = child.getHaxeType(true);
            if (child.getChildIndex() == 0)
            {
                type = ctype;
                continue;
            }
            if (HaxeType.isAvailableAssignement(type, ctype))
            {
                continue;
            }
            else if (HaxeType.isAvailableAssignement(ctype, type))
            {
                type = ctype;
                continue;
            }
            ErrorPublisher.commitCastError(child, type);
        }
    }

    @Override
    protected void visit(final ConstantNode node, Object data)
    {
        //seems it needs no errors
    }

    @Override
    protected void visit(final ReturnNode node, Object data)
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
    protected void visit(final BinaryExpressionNode node, Object data)
    {
        if (!node.ifUndefinedType(true))
        {
            return;
        }
        
        HaxeTree leftOperand = node.getLeftOperand();
        HaxeTree rightOperand = node.getRightOperand();
        
        if (!leftOperand.ifUndefinedType(true)
                && !rightOperand.ifUndefinedType(true))
        {
            data = node;
            ErrorPublisher.commitCastError(
                    rightOperand,
                    leftOperand.getHaxeType());
            return;
        }
        
        if (leftOperand.ifUndefinedType(true))
        {
            visit(leftOperand, data);            
        }        
        if (rightOperand.ifUndefinedType(true))
        {
            visit(rightOperand, data);
        }
    }
    
    protected void visit(final UnarExpressionNode node, Object data)
    {
        if (node.getHaxeType() != PrimaryHaxeType.haxeUndefined)
        {
            return;
        }
        HaxeTree expr = node.getExpression();
        if (expr.ifUndefinedType(true))
        {
            visit(node, data);
        }
        else
        {
            data = node;
            node.commitError("Illegal use of operation for that type");
        }
    }

    @Override
    protected void visit(final BlockScopeNode node, Object data)
    {
        visitAllChildrenSeparatly(node, data);
    }

    @Override
    protected void visit(final ErrorNode node, Object data)
    {
        node.commitUnexpectedError();
    }

    @Override
    protected void visitUnknown(final HaxeTree node, Object data)
    {
        // TODO Auto-generated method stub

    }

    @Override
    protected void visit(final IfNode node, Object data)
    {
        if (node.getHaxeType() != PrimaryHaxeType.haxeUndefined)
        {
            return;
        }
        
        HaxeTree ifBlock = node.getIfBlock();
        HaxeTree elseBlock = node.getElseBlock();
        
        if (!ifBlock.ifUndefinedType()
                && !elseBlock.ifUndefinedType()
                && node.isLastInScope())
        {
            data = node;
            node.commitError("The blocks returns different value types.");
            return;
        }
        visit(ifBlock, data);
        visit(elseBlock, data);
    }

    @Override
    protected void visit(final ForNode node, Object data)
    {
        visitAllChildrenSeparatly(node, data);
        node.setHaxeType(node.getScope().getHaxeType());
    }

    @Override
    protected void visit(final WhileNode node, Object data)
    {
        HaxeTree condition = node.getCondition();
        
        visit(node.getScope(), data);
        node.setHaxeType(node.getScope().getHaxeType());
        
        if (condition.ifUndefinedType())
        {
            visit(condition, data);
            return;
        }

        if (condition.getHaxeType() != PrimaryHaxeType.haxeBool)
        {
            ErrorPublisher.commitCastError(condition, PrimaryHaxeType.haxeBool);
        }
    }

    @Override
    protected void visitHighLevel(final HaxeTree node, Object data)
    {
        visitAllChildren(node, data);
    }
}
