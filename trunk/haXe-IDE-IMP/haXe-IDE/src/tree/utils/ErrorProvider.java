package tree.utils;


import java.util.List;

import tree.ErrorNode;
import tree.Function;
import tree.HaxeTree;
import tree.Module;
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
import tree.type.ClassNode;
import tree.type.HaxeType;
import workspace.Activator;

public class ErrorProvider extends AbstractHaxeTreeVisitor
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
        BlockScope blockScope = node.getBlockScope();
        
        visit(blockScope, data);
    }

    @Override
    protected void visit(final Function node, Object data)
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
        
        BlockScope blockScope = node.getBlockScope();
        
        visit(blockScope, data);
    }

    @Override
    protected void visit(final Declaration node, Object data)
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
        HaxeType initType = initialization.getHaxeType(true);
        if (type == null || initType == null)
        {
            return;
        }
        if (!TypeUtils.isAvailableAssignement(type, initType))
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
    protected void visit(final MethodCall node, Object data)
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
    protected void visit(final Slice node, Object data)
    {
        if (node.isFieldUse())
        {
            visit(node.getChild(node.getChildCount() - 1), data);
        }
        
        for (HaxeTree child : node.getParameters())
        {
            visit(child, data);
            HaxeType ctype = child.getHaxeType(true);
            if (!ctype.equals(TypeUtils.getInt()))
            {
                ErrorPublisher.commitCastError(child, TypeUtils.getInt());
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
    protected void visit(final Usage node, Object data)
    {
        if (node.getDeclarationNode() == null)
        {
            ErrorPublisher.commitUndeclaredError(node);
            data = node;
            return;
        }
        
        if (!node.isUndefinedType())
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
    protected void visit(final Assignment node, Object data)
    {
        HaxeTree rightOperand = node.getRightOperand();
        
        if (node.isUndefinedType())
        {
            visit(rightOperand, data);
        }
        else if (!TypeUtils.isAvailableAssignement(
                node.getHaxeType(),
                rightOperand.getHaxeType(true)))
        {
            data = node;
            ErrorPublisher.commitInvalidAssignError(node);
            return;
        }
    }

    @Override
    protected void visit(final Array node, Object data)
    {
        if (!node.isUndefinedType())
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
        HaxeType type = TypeUtils.getUnknown();
        for (HaxeTree child : node.getChildren())
        {
            HaxeType ctype = child.getHaxeType(true);
            if (child.getChildIndex() == 0)
            {
                type = ctype;
                continue;
            }
            if (TypeUtils.isAvailableAssignement(type, ctype))
            {
                continue;
            }
            else if (TypeUtils.isAvailableAssignement(ctype, type))
            {
                type = ctype;
                continue;
            }
            ErrorPublisher.commitCastError(child, type);
        }
    }

    @Override
    protected void visit(final Constant node, Object data)
    {
        //seems it needs no errors
    }

    @Override
    protected void visit(final Return node, Object data)
    {
        HaxeType type = node.getHaxeType();
        Function function = node.getFunction();
        
        HaxeType funType = function == null 
                ? TypeUtils.getVoid() : function.getHaxeType();
        if (!TypeUtils.isAvailableAssignement(funType, type))
        {
            ErrorPublisher.commitCastError(node, funType);
        }
    }

    @Override
    protected void visit(final Binary node, Object data)
    {
        if (!node.isUndefinedType(true))
        {
            return;
        }
        
        HaxeTree leftOperand = node.getLeftOperand();
        HaxeTree rightOperand = node.getRightOperand();
        
        if (!leftOperand.isUndefinedType(true)
                && !rightOperand.isUndefinedType(true))
        {
            data = node;
            ErrorPublisher.commitCastError(
                    rightOperand,
                    leftOperand.getHaxeType());
            return;
        }
        
        if (leftOperand.isUndefinedType(true))
        {
            visit(leftOperand, data);            
        }        
        if (rightOperand.isUndefinedType(true))
        {
            visit(rightOperand, data);
        }
    }
    
    protected void visit(final Unary node, Object data)
    {
        if (node.getHaxeType() != null)
        {
            return;
        }
        HaxeTree expr = node.getExpression();
        if (expr.isUndefinedType(true))
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
    protected void visit(final BlockScope node, Object data)
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
        
        if (!ifBlock.isUndefinedType()
                && !elseBlock.isUndefinedType()
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
    protected void visit(final For node, Object data)
    {
        visitAllChildrenSeparatly(node, data);
        node.setHaxeType(node.getScope().getHaxeType());
    }

    @Override
    protected void visit(final While node, Object data)
    {
        HaxeTree condition = node.getCondition();
        
        visit(node.getScope(), data);
        node.setHaxeType(node.getScope().getHaxeType());
        
        if (condition.isUndefinedType())
        {
            visit(condition, data);
            return;
        }

        HaxeType bool = TypeUtils.getBool();
        if (!condition.getHaxeType().equals(bool))
        {
            ErrorPublisher.commitCastError(condition, bool);
        }
    }

    @Override
    protected void visit(final Module node, Object data)
    {
        visitAllChildren(node, data);
        
        String fileName = node.getText();
        for (HaxeTree child : node.getChildren())
        {
            if (child.getText().equals(fileName))
            {
                return;
            }
        }
        ErrorPublisher.commitWrongNameError(node);
    }
}
