package tree.statement;

import org.antlr.runtime.Token;

import tree.HaxeTree;

public class Statement extends HaxeTree
{

    public Statement(final int type, final String name) 
    {
        super(type, name);
    }

    public Statement(final Token t) 
    {
        super(t);
    }

}
