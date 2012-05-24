package tree.expression;


import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import tree.HaxeTree;

public class ParametersContainer extends Usage
{
    protected CommonToken leftParen = null;
    protected CommonToken rightParen = null;
    private List<HaxeTree> parameters = null;

    public ParametersContainer(
            final int callOrSlice, final String name, 
            final Token lParen, final Token rParen) 
    {
        super(new CommonToken(callOrSlice, name));
        leftParen = (CommonToken) lParen;
        rightParen = (CommonToken) rParen;
    }
    
    @Override
    public String getText()
    {
        return getChild(0).getText();
    }
    
    public List<HaxeTree> getParameters()
    {
       if (parameters != null)
       {
           return parameters;
       }
       
       parameters = new ArrayList<HaxeTree>();
       for (HaxeTree child : getChildren())
       {
           if (child.getChildIndex() == 0 || 
                   child.getText().equals("."))
           {
               continue;
           }
           
           parameters.add(child);
       }
       
       return parameters;
    }
    
    public int getIdentifierOffset()
    {
        return getChild(0).getIdentifierOffset();
    }
    
    public int getIdentifierLength()
    {
        HaxeTree child =  getChild(0);
        return child.getIdentifierLength();
    }
    
    @Override
    protected void calculateMostRightPosition()
    {
        mostRightPosition = rightParen.getStopIndex();
    }
}
