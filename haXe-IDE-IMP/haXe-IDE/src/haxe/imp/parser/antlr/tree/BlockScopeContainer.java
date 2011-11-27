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
    private BlockScopeNode blockScope = null;
    
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
        if (blockScope != null)
        {
            return blockScope;
        }
        
        for (HaxeTree tree : getChildren()) 
        {
            if (tree instanceof BlockScopeNode) 
            {
                blockScope = (BlockScopeNode) tree;
            }
        }
        
        return blockScope;
    }
}
