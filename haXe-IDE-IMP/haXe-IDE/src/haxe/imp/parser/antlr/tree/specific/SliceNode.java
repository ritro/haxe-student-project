package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.HaxeTree;

import org.antlr.runtime.Token;

public class SliceNode extends ParametersContainerNode
{
    private boolean haveNoName = false;
    
    public SliceNode(
            final int callOrSlice, 
            final Token lBracket, 
            final Token rBracket,
            final boolean isNoName) 
    {
        super(callOrSlice, lBracket, rBracket);
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
            // TODO: not quete right
            return null;
        }
        return ((VarUsageNode)getChild(0)).getDeclarationNode();
    }
    
    @Override
    public void setDeclarationNode(HaxeTree declaration)
    {
        if (haveNoName)
        {
            // TODO: not quete right
            return;
        }
        ((VarUsageNode)getChild(0)).setDeclarationNode(declaration);
    }
    
    public boolean isHaveName()
    {
        return !haveNoName;
    }
}
