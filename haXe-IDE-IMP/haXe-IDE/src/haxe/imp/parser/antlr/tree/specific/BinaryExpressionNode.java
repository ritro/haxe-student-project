package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.BinaryOperaionContainer;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.utils.Environment;
import haxe.imp.parser.antlr.utils.HaxeType;

import org.antlr.runtime.Token;

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
    
    public BinaryExpressionNode(Token token) 
    {
        super(token);
    }
    
    @Override
    public void calculateScopes(Environment declarations)
    {
        HaxeTree leftNode = getLeftOperand();
        HaxeTree rightNode = getRightOperand();
        
        leftNode.calculateScopes(declarations);
        rightNode.calculateScopes(declarations);
        
        BoolOperations operationType = getOperationType();
        HaxeType definedType = defineResultType(operationType);
        if (definedType == null)
        {
            commitCastError();
        }
        else
        {
            setHaxeType(definedType);
        }
    }

}
