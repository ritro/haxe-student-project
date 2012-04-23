package tree;

import imp.parser.antlr.main.HaxeParser;

import org.antlr.runtime.Token;

import tree.specific.BlockScopeNode;


/**
 * Classes which have block scopes inside should 
 * extend this class.
 * @author Savenko Maria
 */
public class BlockScopeContainer extends HaxeTree
{
    private BlockScopeNode blockScope = null;
    private static final int DECL_ATTR_LIST = HaxeParser.DECL_ATTR_LIST;
    
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
    
    @Override
    protected void calculateMostLeftPosition()
    {
        mostLeftPosition = getToken().getStartIndex();
        for (HaxeTree child : getChildren())
        {
            if (token.getType() == DECL_ATTR_LIST) 
            {
                for (HaxeTree attr : child.getChildren())
                {
                    int possibleMLP = 
                            attr.getMostLeftPosition();
                    if (mostLeftPosition > possibleMLP) 
                    {
                        mostLeftPosition = possibleMLP;
                    }
                }
            } 
        }
    }
    
    @Override
    protected void calculateMostRightPosition()
    {
        if (blockScope == null)
        {
            super.calculateMostRightPosition();
            return;
        }
        mostRightPosition = blockScope.getRBracketPosition();
    }
}
