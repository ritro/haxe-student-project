package haxe.tree.utils;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;

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
    
    public static void commitCastError(HaxeTree node, HaxeType type)
    {
        node.commitError(node.getHaxeType().toString() + " should be " + type.toString());
    }

}
