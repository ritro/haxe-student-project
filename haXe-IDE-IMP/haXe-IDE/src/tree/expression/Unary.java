package tree.expression;


import org.antlr.runtime.Token;

import tree.HaxeTree;
import tree.type.HaxeType;
import tree.utils.TypeUtils;

public class Unary extends Expression
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
    
    private void tryDefineType()
    {
        HaxeTree expr = getExpression();
        if (getExpression() == null || token == null)
        {
            return;
        }
        HaxeType exprType = expr.getHaxeType();
        if (exprType == null)
        {
            return;
        }
        UnarOperations opType = getOperationTypeByToken(token.getText());
        switch(opType)
        {
            case NUMERABLE:
                if (exprType == TypeUtils.getInt()
                            || exprType == TypeUtils.getFloat())
                {
                    setHaxeType(exprType);
                }
                break;
            case NOT: 
                if (exprType == TypeUtils.getBool())
                {
                    setHaxeType(exprType);
                }
                break;
            case TILDE:
                // TODO should think about INT 32 restriction (for Neko)
                if (exprType == TypeUtils.getInt())
                {
                    setHaxeType(exprType);
                }
                break;
            default: break;
        }
    }
    
    @Override
    public HaxeType getHaxeType()
    {
        if (haxeType != null)
        {
            super.getHaxeType();
        }
        tryDefineType();
        return super.getHaxeType();
    }
    
    public HaxeTree getExpression()
    {
        return getChild(0);
    }
    
    public Unary(final Token token)
    {
        super(token);
    }
    
    public String toString()
    {
        return toString("unar expr");
    }
}
