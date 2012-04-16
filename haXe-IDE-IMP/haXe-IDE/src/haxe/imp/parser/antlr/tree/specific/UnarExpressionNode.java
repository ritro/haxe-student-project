package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.tree.utils.HaxeType;
import haxe.tree.utils.PrimaryHaxeType;

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
    
    @Override
    public HaxeType getHaxeType()
    {
        if (haxeType != PrimaryHaxeType.haxeUndefined)
        {
            super.getHaxeType();
        }
        HaxeTree expr = getExpression();
        if (getExpression() == null || token == null)
        {
            // will return Undefined
            return super.getHaxeType();
        }
        HaxeType exprType = expr.getHaxeType();
        if (exprType == PrimaryHaxeType.haxeUndefined)
        {
            return exprType;
        }
        UnarOperations opType = getOperationTypeByToken(token.getText());
        switch(opType)
        {
            case NUMERABLE:
                if (exprType == PrimaryHaxeType.haxeInt
                            || exprType == PrimaryHaxeType.haxeFloat)
                {
                    setHaxeType(exprType);
                }
                break;
            case NOT: 
                if (exprType == PrimaryHaxeType.haxeBool)
                {
                    setHaxeType(exprType);
                }
                break;
            case TILDE:
                // TODO should think about INT 32 restriction (for Neko)
                if (exprType == PrimaryHaxeType.haxeInt)
                {
                    setHaxeType(exprType);
                }
            default: return super.getHaxeType();
        }
        return super.getHaxeType();
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
