package imp.parser.antlr.tree;


import org.antlr.runtime.Token;

import tree.specific.HaxeType;
import tree.utils.HaxeTypeUtils;

public class BinaryOperaionContainer extends HaxeTree
{
    /**
     * Different types for Boolean Operations divided 
     * by their type extracting rules.
     * @author Savenko Maria
     */
    public enum BoolOperations {
        PLUS,
        NUMERABLE,
        DIVIDE,
        BITWISE,
        COMPARISON,
        BOOLEAN
    };
    
    private BoolOperations operationType = null;

    protected void setOperationType(BoolOperations type)
    {
        operationType = type;
    }
    
    public BoolOperations getOperationType()
    {
        if (operationType == null)
        {
            defineOperationType();
        }
        return operationType;
    }
	
	protected void calculateMostRightPosition()
	{
		mostRightPosition = 
				getRightOperand().getMostRightPosition();
	}
	
	protected void calculateMostLeftPosition()
	{
		mostLeftPosition = 
				getLeftOperand().getMostLeftPosition();
	}
    
    public void commitCastError(){
        commitError(getText() + ": cast problems");
    }    
    
    /**
     * From string tels which binary operation it is.
     * For Assignment Nodes NULL means - it is normal assignment
     * @param token - the operation token
     * @return BoolOperations member or null.
     */
    protected BoolOperations getOperationTypeByToken(String token)
    {
        switch (token)
        {
            case "+" : 
                return BoolOperations.PLUS;
            case "%" : 
            case "*" : 
            case "-" : 
                return BoolOperations.NUMERABLE;
            case "/" : 
                return BoolOperations.DIVIDE;
            //shifts
            case "<<":
            case ">>":
            case ">>>":
            //other
            case "|":
            case "&":
            case "^":
                return BoolOperations.BITWISE;
            case "==":
            case "!=":
            case ">":
            case "<":
            case ">=":
            case "<=":
                return BoolOperations.COMPARISON;
            case "&&":
            case "||":
                return BoolOperations.BOOLEAN;
        }
        
        //for Assignments null means - it is normal assignment
        return null;
    }
    
    public static HaxeType defineResultType(
            final BoolOperations operationType,
            final HaxeType leftType,
            final HaxeType rightType)
    {
        if (operationType == null || leftType == null || rightType == null)
        {
            return null;
        }
        HaxeType intType = HaxeTypeUtils.getInt();
        switch (operationType) 
        {
            //If both expressions are Int then return Int, else if both 
            //expressions are either Int or Float then return Float, else return String.
            case PLUS: 
                if (leftType.equals(intType) && rightType.equals(intType)) 
                {
                    return intType;
                }
                HaxeType floatType = HaxeTypeUtils.getFloat(); 
                if ((leftType.equals(intType) || rightType.equals(intType)) &&
                        (leftType.equals(floatType) || rightType.equals(floatType)))
                {
                    return floatType;
                }
                return HaxeTypeUtils.getString();
            //Divide two numbers, return Float.
            case DIVIDE:
                if (HaxeTypeUtils.areBothNumbers(leftType, rightType)) 
                {
                    return HaxeTypeUtils.getFloat();
                }
                break;
            // Return Int if both are Int and return Float 
            // if they are either both Float or mixed.
            case NUMERABLE:
                if (HaxeTypeUtils.areBothNumbers(leftType, rightType)) 
                {
                    return HaxeTypeUtils.getCommonPrimaryType(leftType, rightType);
                }
                break;
            // bitwise operations between two Int expressions. Returns Int.
            case BITWISE:
                if (leftType.equals(intType) && rightType.equals(intType))
                {
                    return intType;
                }
                break;
            //perform normal or physical comparisons between two 
            //expressions sharing a common type. Returns Bool.
            //TODO we can compare two strings ???????
            case COMPARISON:
                if (HaxeTypeUtils.isComparable(leftType, rightType))
                {
                    return HaxeTypeUtils.getBool();
                }
                break;
            //Both e1 and e2 must be Bool
            case BOOLEAN:
                HaxeType bool = HaxeTypeUtils.getBool();
                if (leftType.equals(bool) && rightType.equals(bool))
                {
                    return leftType;
                }
                break;
        }
        
        return null;
    }
    
    /**
     * Defines what type actually used and sets it
     * to the private variable.
     */
    protected void defineOperationType(){}
    
    /**
     * Gets left operand for Binary nodes and
     * variable before assign token for Assignment nodes.
     * @return
     */
    public HaxeTree getLeftOperand()
    {
        return getChild(0);
    }
    
    /**
     * Gets right operand for Binary nodes and
     * expression after assign token for Assignment node.
     * @return
     */
    public HaxeTree getRightOperand()
    {
        return getChild(1);
    }
    
    public BinaryOperaionContainer(Token token) 
    {
        super(token);
    }
}
