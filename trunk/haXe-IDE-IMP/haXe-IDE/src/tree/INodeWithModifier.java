package tree;

import java.util.ArrayList;

import imp.parser.antlr.HaxeParser;

public interface INodeWithModifier
{
    static final int DECL_ATTR_LIST = HaxeParser.DECL_ATTR_LIST;
    
    public ArrayList<Modifiers> getModifiers();
    public void updateModifier();
}
