package tree.specific;


import org.antlr.runtime.Token;

import tree.specific.type.HaxeType;

public class BinaryExpressionNode extends BinaryOperaionContainer
{    
    /**
     * Defines operationType variable value according
     * to the text name of this node. 
     */
    @Override
    protected void defineOperationType()
    {
        String name = getText();
        BoolOperations type = getOperationTypeByToken(name);
        // the result cannot be null here due to Antlr parser
        // error grammar notation
        setOperationType(type);
    }
    
    /**
     * Will return result type if all operands of valid types
     * for that operation or NULL (!) if they are not.
     */
    public HaxeType defineResultType()
    {
        BoolOperations operationType = getOperationType();
        HaxeType leftType = getLeftOperand().getHaxeType();
        HaxeType rightType = getRightOperand().getHaxeType();
        
        return super.defineResultType(operationType, leftType, rightType);
    }
    
    public BinaryExpressionNode(Token token) 
    {
        super(token);
    }
    
    public String toString()
    {
        return String.format(
                "binary expr [%s] : %s <%s, %s>", 
                getText(),
                getHaxeType() == null ? "null" : getHaxeType().toString(),
                getMostLeftPosition(),
                getMostRightPosition());
    }

}
