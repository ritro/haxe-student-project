package tree.specific;

import imp.parser.antlr.tree.HaxeTree;

import org.antlr.runtime.Token;

public class MethodCallNode extends ParametersContainerNode
{
    public MethodCallNode(
            final int callOrSlice, final Token lParen, final Token rParen) 
    {
        super(callOrSlice, "MethodCall", lParen, rParen);
    }
    
    @Override
    protected void calculateMostLeftPosition()
    {
        mostLeftPosition = getChild(0).getMostLeftPosition();
    }
    
    @Override
    public HaxeTree getDeclarationNode()
    {
        return super.getDeclarationNode(getChild(0));
    }
    
    @Override    
    public void setDeclarationNode(HaxeTree declaration)
    {
        ((VarUsageNode)getChild(0)).setDeclarationNode(declaration); 
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
        return String.format(
                "method call [%s] : %s <%s, %s>", 
                getText(),
                getHaxeType() == null ? "null" : getHaxeType().toString(),
                getMostLeftPosition(),
                getMostRightPosition());
    }
}
