package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.HaxeTree;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

public class ParametersContainerNode extends VarUsageNode
{
    protected CommonToken leftParen = null;
    protected CommonToken rightParen = null;
    private List<HaxeTree> parameters = null;

    public ParametersContainerNode(
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
    
    @Override
    protected void calculateMostRightPosition()
    {
        mostRightPosition = rightParen.getStopIndex();
    }
}
