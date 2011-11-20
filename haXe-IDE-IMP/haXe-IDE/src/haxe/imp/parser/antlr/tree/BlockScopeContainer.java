package haxe.imp.parser.antlr.tree;

import org.antlr.runtime.Token;

import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;

/**
 * Classes which have block scopes inside should 
 * extend this class.
 * @author Savenko Maria
 */
public class BlockScopeContainer extends HaxeTree
{
    public BlockScopeContainer(Token t) 
    {
        super(t);
    }
    

    /**
     * Gets block scope from current tree. 
     * @return Found block scope or null.
     */
    public BlockScopeNode getBlockScope()
    {
        for (HaxeTree tree : getChildren()) 
        {
            if (tree instanceof BlockScopeNode) 
            {
                return (BlockScopeNode) tree;
            }
        }
        return null;
    }
}
