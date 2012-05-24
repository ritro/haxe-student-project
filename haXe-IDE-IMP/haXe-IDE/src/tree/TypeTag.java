package tree;

import org.antlr.runtime.CommonToken;

import tree.expression.Usage;

public class TypeTag extends Usage
{
    public TypeTag(int typeTag) 
    {
        super(new CommonToken(typeTag, "TypeTag"));
    }
    
    public TypeTag(int typeTag, String string, int lbrace, int rbrace) 
    {
        this(typeTag);
        
        mostLeftPosition = (new CommonToken(lbrace)).getStartIndex();
        mostRightPosition = (new CommonToken(rbrace)).getStopIndex();
        
        // TODO process the rest
    }
    
    public void calculateMostLeftPosition()
    {
        if (getChildCount() != 0)
        {
            mostLeftPosition = getChild(0).getMostLeftPosition();
        }
        // TODO ??
    }
    
    public void calculateMostRightPosition()
    {
        int childCount = getChildCount();
        if (childCount != 0)
        {
            mostRightPosition = getChild(childCount - 1).getMostRightPosition();
        }
        // TODO ??
    }

    public String toString()
    {
        return "typeTag";
    }

    public int getIdentifierOffset()
    {
        return getChild(0).getTokenStartIndex();
    }

    public int getIdentifierLength()
    {
        return getChild(0).getTokenStopIndex() - getIdentifierOffset();
    }
}
