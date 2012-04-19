package haxe.imp.parser.antlr.tree;

import haxe.imp.parser.antlr.main.HaxeParser;

public interface INodeWithModifier
{
    static final int DECL_ATTR_LIST = HaxeParser.DECL_ATTR_LIST;
    
    public Modifiers getModifier();
    public void updateModifier();
}
