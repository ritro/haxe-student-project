package tree;

import imp.parser.antlr.HaxeParser;

public interface INodeWithModifier
{
    static final int DECL_ATTR_LIST = HaxeParser.DECL_ATTR_LIST;
    
    public Modifiers getModifier();
    public void updateModifier();
}
