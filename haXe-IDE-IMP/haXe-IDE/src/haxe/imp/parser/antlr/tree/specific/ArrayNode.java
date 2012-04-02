package haxe.imp.parser.antlr.tree.specific;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

public class ArrayNode extends ConstantNode
{   
    private CommonToken leftBracket = null;
    private CommonToken rightBracket = null;
    
    public ArrayNode(
            final int ttype, final Token lbToken, final Token rbToken) 
    {
        super(new CommonToken(ttype, "Array"));
        leftBracket = (CommonToken) lbToken;
        rightBracket = (CommonToken) rbToken;
    }
    
    @Override
    public String getText()
    {
        return "Array";
    }
    
    @Override
    protected void calculateMostRightPosition()
    {
        mostRightPosition = rightBracket.getStopIndex();
    }
    
    @Override
    protected void calculateMostLeftPosition()
    {
        mostLeftPosition = leftBracket.getStartIndex();
    }
}
