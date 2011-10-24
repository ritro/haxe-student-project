package haxe.imp.parser.antlr.tree.specific.vartable;

import org.antlr.runtime.CommonToken;

public class BinaryExpression extends VarDeclaration
{
    private VarDeclaration leftOperand;
    private VarDeclaration rigtOperand; //later will be changed
    private OperatorClasses operator;
    
    public enum OperatorClasses
    {
        StringNumeric,  //+
        Numeric,        //*-/%
        Logic           //&& || 
    }
    
    public BinaryExpression(CommonToken token) {
        super(token);
    }

    public BinaryExpression(
            VarDeclaration leftOperand, 
            VarDeclaration rightOperand, 
            OperatorClasses operator, CommonToken token)
    {
        super(token);
        this.leftOperand = leftOperand;
        this.rigtOperand = rightOperand;
        this.operator = operator;
    }    

    @Override
    public void printTree()
    {
        leftOperand.printTree();
        System.out.println("      " + operator.toString());
        rigtOperand.printTree();
    }
}
