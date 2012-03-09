package haxe.imp.parser.antlr.tree.specific;

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
}
