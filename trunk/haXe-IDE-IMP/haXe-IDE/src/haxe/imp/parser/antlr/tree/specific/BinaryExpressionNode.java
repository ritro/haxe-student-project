package haxe.imp.parser.antlr.tree.specific;

import static haxe.imp.parser.antlr.utils.HaxeType.areBothNumbers;
import static haxe.imp.parser.antlr.utils.HaxeType.getCommonPrimaryType;

import org.antlr.runtime.Token;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.utils.Environment;
import haxe.imp.parser.antlr.utils.HaxeType;

public class BinaryExpressionNode extends HaxeTree
{
    private enum BoolOperations {
        PLUS,
        NUMERABLE,
        DIVIDE,
        BITWISE,
        COMPARISON,
        BOOLEAN
    };
    
    private BoolOperations operationType = null;
    
    private void defineOperationType()
    {
        String name = getText();
        switch (name)
        {
            case "+" : 
                operationType = BoolOperations.PLUS;
                break;
            case "%" : 
            case "*" : 
            case "-" : 
                operationType = BoolOperations.NUMERABLE;
                break;
            case "/" : 
                operationType = BoolOperations.DIVIDE;
                break;
            //shifts
            case "<<":
            case ">>":
            case ">>>":
            //other
            case "|":
            case "&":
            case "^":
                operationType = BoolOperations.BITWISE;
                break; 
            case "==":
            case "!=":
            case ">":
            case "<":
            case ">=":
            case "<=":
                operationType = BoolOperations.COMPARISON;
                break;
            case "&&":
            case "||":
                operationType = BoolOperations.BOOLEAN;
                break;
        }
    }
    
    private void commitCastError(){
        commitError(getText() + ": cast problems");
    }
    
    public BinaryExpressionNode(Token nextToken) 
    {
        super(nextToken);
    }
    
    public HaxeTree getLeftOperand()
    {
        return getChild(0);
    }
    
    public HaxeTree getRightOperand()
    {
        return getChild(1);
    }
    
    @Override
    public void calculateScopes(Environment declarations)
    {
        defineOperationType();
        
        HaxeTree leftNode = getLeftOperand();
        HaxeTree rightNode = getRightOperand();
        
        leftNode.calculateScopes(declarations);
        rightNode.calculateScopes(declarations);
        
        HaxeType definedType = getHaxeType();
        HaxeType leftType = leftNode.getHaxeType();
        HaxeType rightType = rightNode.getHaxeType();

        switch (operationType) 
        {
            //If both expressions are Int then return Int, else if both 
            //expressions are either Int or Float then return Float, else return String.
            case PLUS: 
                if (HaxeType.primaryTypes.contains(leftType.getShortTypeName()) && 
                        HaxeType.primaryTypes.contains(rightType.getShortTypeName())) 
                {
                    definedType = getCommonPrimaryType(leftType, rightType);
                    break;
                } 
                
                commitCastError();
                // HaxeType.haxeObject; ???
            //Divide two numbers, return Float.
            case DIVIDE:
                if (areBothNumbers(leftType, rightType)) 
                {
                    definedType = HaxeType.haxeFloat;
                    break;
                } 

                commitCastError();
            // Return Int if both are Int and return Float 
            // if they are either both Float or mixed.
            case NUMERABLE:
                if (areBothNumbers(leftType, rightType)) 
                {
                    definedType = getCommonPrimaryType(leftType, rightType);
                    break;
                } 

                commitCastError();
            // bitwise operations between two Int expressions. Returns Int.
            case BITWISE:
                if (leftType.equals(HaxeType.haxeInt) && rightType.equals(HaxeType.haxeInt))
                {
                    definedType = HaxeType.haxeInt;
                    break;
                }
                
                commitCastError();
            //perform normal or physical comparisons between two 
            //expressions sharing a common type. Returns Bool.
            //TODO we can compare two strings ???????
            case COMPARISON:
                if (HaxeType.ifCommonType(leftType, rightType))
                {
                    definedType = HaxeType.haxeBool;
                    break;
                }
                
                commitCastError();
            //Both e1 and e2 must be Bool
            case BOOLEAN:
                if (leftType.equals(HaxeType.haxeBool) && rightType.equals(HaxeType.haxeBool))
                {
                    definedType = leftType;
                    break;
                }
                
                commitCastError();
        }
        
        setHaxeType(definedType);
    }

}
