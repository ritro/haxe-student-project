package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.HaxeTree;

import org.antlr.runtime.Token;

public class MethodCallNode extends ParametersContainerNode
{
    public MethodCallNode(
            final int callOrSlice, final Token lParen, final Token rParen) 
    {
        super(callOrSlice, lParen, rParen);
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
}
