package haxe.tree.utils;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;

/**
 * Contains only official haXe error messages.
 * @author Savenko Maria
 */
public class ErrorPublisher
{   
    private static void commitDuplicateFieldError(HaxeTree node)
    {
        node.commitError(
                "Duplicate class field declaration : " + node.getText());
    }
    
    public static void commitDuplicateFieldError(FunctionNode node)
    {
        commitDuplicateFieldError((HaxeTree)node);
    }
    
    public static void commitDuplicateConstructorError(FunctionNode node)
    {
        node.commitError("Duplicate constructor");
    }
    
    public static void commitDuplicateFieldError(VarDeclarationNode node)
    {
        commitDuplicateFieldError((HaxeTree)node);
    }

    public static void commitClassUndefinedTypeError(VarDeclarationNode node)
    {
        node.commitError(
                "Type requared for member variable : " + node.getText());
    }
    
    /**
     * Commits invalid cast of the node-argument type to the type-argumanet error.
     * The node-argument will be underlined with red.
     * @param node - to commit error about.
     */
    public static void commitCastError(HaxeTree node, HaxeType type)
    {
        commitCastError(node, node.getHaxeType(), type);
    }
    
    /**
     * Commits error on the node (it will be underlined with red) about
     * the type it should be. Use it then you must underline the node higher, or
     * of different type then the "typeIs" you want to mention in error message.
     * @param node - node to commit error about.
     * @param typeIs - node's type to mention in message
     */
    public static void commitCastError(HaxeTree node, HaxeType typeIs, HaxeType typeShouldBe)
    {
        node.commitError(typeIs.toString() + " should be " + typeShouldBe.toString());
    }

    public static void commitInvalidBinaryOpError(BinaryExpressionNode node)
    {
        String binaryOp = node.getOperationType().toString();
        node.commitError("Cannot " + binaryOp + " " + 
                node.getLeftOperand().getHaxeType() + " and " + 
                node.getRightOperand().getHaxeType());
    }    
    
    /**
     * Error when we using defined, but not initialized variable.
     */
    public static void commitUninitializedUsingError(VarUsageNode node)
    {
        node.commitError(
                "Local variable " 
                + node.getText() 
                + " used without being initialized");
    }

    /**
     * Error then user variable wan't declared before.
     */
    public static void commitUndeclaredError(VarUsageNode node)
    {
        node.commitError(node.getText() + " is not declared.");
    }
}
