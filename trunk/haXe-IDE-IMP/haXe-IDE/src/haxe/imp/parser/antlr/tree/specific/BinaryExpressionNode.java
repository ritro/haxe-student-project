package haxe.imp.parser.antlr.tree.specific;

import org.antlr.runtime.Token;

import haxe.imp.parser.antlr.tree.HaxeTree;

public class BinaryExpressionNode extends HaxeTree
{

    public BinaryExpressionNode(Token nextToken) 
    {
        super(nextToken);
    }

}
