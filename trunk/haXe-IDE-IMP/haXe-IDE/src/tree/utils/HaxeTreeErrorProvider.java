package tree.utils;


import java.util.List;

import tree.HaxeTree;
import tree.specific.ArrayNode;
import tree.specific.AssignOperationNode;
import tree.specific.BinaryExpressionNode;
import tree.specific.BlockScopeNode;
import tree.specific.ConstantNode;
import tree.specific.ErrorNode;
import tree.specific.ForNode;
import tree.specific.FunctionNode;
import tree.specific.IfNode;
import tree.specific.MethodCallNode;
import tree.specific.NewNode;
import tree.specific.ReturnNode;
import tree.specific.SliceNode;
import tree.specific.UnarExpressionNode;
import tree.specific.DeclarationNode;
import tree.specific.VarUsageNode;
import tree.specific.WhileNode;
import tree.specific.DeclarationNode.DeclarationType;
import tree.specific.type.ClassNode;
import tree.specific.type.HaxeType;
import workspace.Activator;

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
    protected void visit(final DeclarationNode node, Object data)
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
        if (!HaxeTypeUtils.isAvailableAssignement(type, initType))
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
            if (!ctype.equals(HaxeTypeUtils.getInt()))
            {
                ErrorPublisher.commitCastError(child, HaxeTypeUtils.getInt());
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
        else if (!HaxeTypeUtils.isAvailableAssignement(
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
        HaxeType type = HaxeTypeUtils.getUnknown();
        for (HaxeTree child : node.getChildren())
        {
            HaxeType ctype = child.getHaxeType(true);
            if (child.getChildIndex() == 0)
            {
                type = ctype;
                continue;
            }
            if (HaxeTypeUtils.isAvailableAssignement(type, ctype))
            {
                continue;
            }
            else if (HaxeTypeUtils.isAvailableAssignement(ctype, type))
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
                ? HaxeTypeUtils.getVoid() : function.getHaxeType();
        if (!HaxeTypeUtils.isAvailableAssignement(funType, type))
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
        if (node.getHaxeType() != null)
        {
            return;
        }
        HaxeTree expr = node.getExpression();
        if (expr.ifUndefinedType(true))
        {
            visit(expr, data);
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
        if (node.getHaxeType() != null)
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

        HaxeType bool = HaxeTypeUtils.getBool();
        if (!condition.getHaxeType().equals(bool))
        {
            ErrorPublisher.commitCastError(condition, bool);
        }
    }

    @Override
    protected void visitHighLevel(final HaxeTree node, Object data)
    {
        visitAllChildren(node, data);
    }
}
