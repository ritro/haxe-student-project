package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.HaxeTree;

import org.antlr.runtime.Token;

public class UnarExpressionNode extends HaxeTree
{
    public enum UnarOperations {
        NUMERABLE, //++ --  and - with int and float only
        NOT, //! only bool
        TILDE //ones compliment of the Int (work only with 32 int - so don't work on Neko)
    };
    
    protected UnarOperations getOperationTypeByToken(String token)
    {
        switch (token)
        {
            case "++" : 
            case "--" : 
            case "-" : 
                return UnarOperations.NUMERABLE;
            case "!" : 
                return UnarOperations.NOT;
            case "~":
                return UnarOperations.TILDE;
        }
        
        //for Assignments null means - it is normal assignment
        return null;
    }
    
    public HaxeTree getExpression()
    {
        return getChild(0);
    }
    
    public UnarExpressionNode(final Token token)
    {
        super(token);
    }
}
