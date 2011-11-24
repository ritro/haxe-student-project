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
        MINUS,
        MULTY,
        DIV,
        EQ,
        PERCENT
    };
    
    private BoolOperations operationType = null;
    
    private HaxeType getUnarOperationType(){
        if (ifNumericOperation() &&
            getChild(0).getHaxeType().isNumericType()) //+/*- can be used thiw other types??
                return this.getChild(0).getHaxeType();
        //else commit Error???
        return HaxeType.haxeUndefined;
    }
    
    private void defineOperationType()
    {
        String name = getText();
        switch (name)
        {
            case "+" : 
                operationType = BoolOperations.PLUS;
                break;
            case "-" : 
                operationType = BoolOperations.MINUS;
                break;
            case "*" : 
                operationType = BoolOperations.MULTY;
                break;
            case "/" : 
                operationType = BoolOperations.DIV;
                break;
            case "==":
                operationType = BoolOperations.EQ;
                break;
        }
    }
    
    private boolean ifNumericOperation(){
        return (operationType == BoolOperations.PLUS  ||
                operationType == BoolOperations.MINUS ||
                operationType == BoolOperations.MULTY ||
                operationType == BoolOperations.DIV);
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
            case EQ:
            case PLUS: 
            {
                if (HaxeType.primaryTypes.contains(leftType.getShortTypeName()) && 
                        HaxeType.primaryTypes.contains(rightType.getShortTypeName())) 
                {
                    definedType = getCommonPrimaryType(leftType, rightType);
                    break;
                } 
                
                commitCastError();
                // HaxeType.haxeObject; ???
            }
            case DIV: {
                if (areBothNumbers(leftType, rightType)) 
                {
                    definedType = HaxeType.haxeFloat;
                    break;
                } 

                commitCastError();
            } 
            case MINUS:
            case MULTY: {
                if (areBothNumbers(leftType, rightType)) 
                {
                    if (leftType.equals(HaxeType.haxeInt)
                            && rightType.equals(HaxeType.haxeInt)) {
                        definedType = HaxeType.haxeInt;
                    }
                    definedType = HaxeType.haxeFloat;
                    break;
                } 

                commitCastError();
            }
        }
        
        setHaxeType(definedType);
    }

}
