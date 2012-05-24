package tree.expression;

import org.antlr.runtime.Token;

import tree.HaxeTree;
import tree.type.HaxeType;

public class MethodCall extends ParametersContainer
{
    public MethodCall(
            final int callOrSlice, final Token lParen, final Token rParen) 
    {
        super(callOrSlice, "MethodCall", lParen, rParen);
    }
    
    @Override
    protected void calculateMostLeftPosition()
    {
        mostLeftPosition = getChild(0).getMostLeftPosition();
    }
    
    public HaxeTree getDeclarationNode()
    {
        HaxeTree usage = getChild(0);
        if (usage instanceof Usage)
        {
            return ((Usage)usage).getDeclarationNode();
        }
        return new HaxeTree(0);
    }
    
    @Override  
    public void setDeclarationNode(HaxeTree declaration)
    {
        ((Usage)getChild(0)).setDeclarationNode(declaration); 
    }
    
    @Override
    public HaxeType getHaxeType(boolean takeLastPossible)
    {
        if (!takeLastPossible)
        {  
            return getHaxeType();
        }
        
        if (isFieldUse())
        {
            return getChild(getChildCount() - 1).getHaxeType(true);
        }
        HaxeTree decl = getDeclarationNode();
        if (decl != null)
        {
            return decl.getHaxeType(true);
        }
        return getHaxeType();
    }
    
    @Override
    public HaxeType getHaxeType()
    {
        if (getDeclarationNode() == null)
        {
            return super.getHaxeType();
        }
        return getDeclarationNode().getHaxeType();
    }
    
    public String toString()
    {
        return toString("method call");
    }
}
