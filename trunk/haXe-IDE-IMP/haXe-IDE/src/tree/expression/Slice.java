package tree.expression;


import org.antlr.runtime.Token;

import tree.HaxeTree;
import tree.type.HaxeType;

public class Slice extends ParametersContainer
{
    private boolean haveNoName = false;
    
    public Slice(
            final int callOrSlice, 
            final Token lBracket, 
            final Token rBracket,
            final boolean isNoName) 
    {
        super(callOrSlice, "Slice", lBracket, rBracket);
        haveNoName = isNoName;
    }

    @Override
    public String getText()
    {
        if (!haveNoName)
        {
            return super.getText();
        }
        
        return "";
    }
    
    @Override
    protected void calculateMostLeftPosition()
    {
        if (haveNoName)
        {
            mostLeftPosition =  leftParen.getStartIndex();
        }
        else
        {
            mostLeftPosition = getChild(0).getMostLeftPosition();
        }
    }
    
    @Override
    public HaxeTree getDeclarationNode()
    {
        if (haveNoName)
        {
            HaxeTree parent = getParent();
            if (!(parent instanceof MethodCall))
            {
                return null;
            }
            return ((MethodCall)parent).getDeclarationNode();
        }
        return ((Usage)getChild(0)).getDeclarationNode();
    }
    
    @Override
    public void setDeclarationNode(HaxeTree declaration)
    {
        if (haveNoName)
        {
            // TODO: not quete right
            return;
        }
        ((Usage)getChild(0)).setDeclarationNode(declaration);
    }
    
    @Override
    public HaxeType getHaxeType(boolean takeLastPossible)
    {
        if (!takeLastPossible)
        {
            return super.getHaxeType();
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
    
    public boolean isHaveName()
    {
        return !haveNoName;
    }
    
    public String toString()
    {
        return String.format(
                "slice : %s <%s, %s>", 
                getHaxeType() == null ? "null" : getHaxeType().toString(),
                getMostLeftPosition(),
                getMostRightPosition());
    }
}
