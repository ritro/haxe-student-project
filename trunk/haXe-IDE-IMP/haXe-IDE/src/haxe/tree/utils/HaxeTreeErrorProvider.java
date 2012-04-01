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
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.MethodCallNode;
import haxe.imp.parser.antlr.tree.specific.NewNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.SliceNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode.DeclarationType;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.tree.specific.WhileNode;

public class HaxeTreeErrorProvider extends AbstractHaxeTreeVisitor
{
    public void visitAllChildren(final HaxeTree t, Object data)
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
    protected void visit(NewNode node, Object data)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void visit(MethodCallNode node, Object data)
    {
        if (!node.ifUndefinedType())
        {
            if (node.isFieldUse())
            {
                visit(node.getChild(node.getChildCount() - 1), data);
            }
            for (HaxeTree child : node.getParameters())
            {
                visit(child, data);
            }
            return;
        }
        
        data = node;
        ErrorPublisher.commitUninitializedUsingError(node);
    }

    @Override
    protected void visit(SliceNode node, Object data)
    {
        if (!node.ifUndefinedType())
        {
            if (node.isFieldUse())
            {
                visit(node.getChild(node.getChildCount() - 1), data);
            }
            for (HaxeTree child : node.getParameters())
            {
                visit(child, data);
            }
            return;
        }
        
        data = node;
        ErrorPublisher.commitUninitializedUsingError(node);        
    }

    @Override
    protected void visit(VarUsageNode node, Object data)
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
    protected void visit(AssignOperationNode node, Object data)
    {
        HaxeTree leftOperand = node.getLeftOperand();
        HaxeTree rightOperand = node.getRightOperand();
        
        visit(rightOperand, data);
        HaxeType secondType = rightOperand.getHaxeType(); 
        
        if (!(leftOperand instanceof VarUsageNode ||
                leftOperand.getLastChildFromAll().getText().equals("Slice")))
        {
            // not valid expression
        }
        HaxeType firstType = leftOperand.getHaxeType();       
        if (data != null)
        {
            // we previosly marked error
            return;
        }
        else if (node.getHaxeType() == PrimaryHaxeType.haxeUndefined ||
                !HaxeType.isAvailableAssignement(firstType, secondType))
        {
            // TODO: here as in the bin op to provide more info
            // we somewhat should calculate - what operand (left or 
            // right or both) should be of what type according to the
            // operation type
            node.commitError("Illegal assignment");
        }
    }

    @Override
    protected void visit(ArrayNode node, Object data)
    {
        if (node.getChildCount() == 0)
        {
            return;
        }
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void visit(ConstantNode node, Object data)
    {
        //seems it needs no errors
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
        
        //HaxeType firstType = leftOperand.getHaxeType();
        //HaxeType secondType = rightOperand.getHaxeType();
        if (data != null)
        {
            //we already committed error in the lowest bin expr in tree
            return;
        }
        else //if (!HaxeType.isAvailableAssignement(firstType, secondType) 
             //   && !HaxeType.isAvailableAssignement(secondType, firstType))
            if (node.getHaxeType() == PrimaryHaxeType.haxeUndefined)
        {
            //undefined means - we couldn't extract the type while linking
            data = node;
            node.commitError("Illegal use of binary operation to operands with such types.");
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
        node.commitUnexpectedError();
    }

    @Override
    protected void visitUnknown(HaxeTree node, Object data)
    {
        // TODO Auto-generated method stub

    }

    @Override
    protected void visit(IfNode node, Object data)
    {
        HaxeTree ifBlock = node.getIfBlock();
        HaxeTree elseBlock = node.getElseBlock();  
        visit(ifBlock, data);
        visit(elseBlock, data);
        
        if (node.getHaxeType() == PrimaryHaxeType.haxeUndefined)
        {
            //HaxeType type = ifBlock.getHaxeType();
            //if (!elseBlock.getHaxeType().equals(type))
            //{
                // TODO: maybe equals not the right part - available assignment?
                node.commitError("The blocks returns different value types.");           
            //}          
        }
    }

    @Override
    protected void visit(ForNode node, Object data)
    {
        //TODO: iterator check ?
        visitUnknown(node.getScope(), data);
    }

    @Override
    protected void visit(WhileNode node, Object data)
    {
        HaxeTree condition = node.getCondition();
        visit(condition, data);
        // if data==null then there was no error while defining cond type
        // and condition Should have type
        if (data == null 
                && condition.getHaxeType() != PrimaryHaxeType.haxeBool)
        {
            //TODO: commit error
        }
        
        visitUnknown(node.getScope(), data);
    }

    @Override
    protected void visitHighLevel(HaxeTree node, Object data)
    {
        visitAllChildren(node, data);
    }

}
