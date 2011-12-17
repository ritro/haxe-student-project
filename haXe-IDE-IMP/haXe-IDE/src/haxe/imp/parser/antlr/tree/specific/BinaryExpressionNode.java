package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.BinaryOperaionContainer;
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

}
