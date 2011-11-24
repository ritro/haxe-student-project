package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.parseExpression;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

public class BinaryOperationTests
{
    ///
    /// Parser Tests
    ///
    
    //PLUS
    @Test
    public void testBinOpPlus() throws RecognitionException {
        HaxeTree tree = parseExpression("1+2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    //NUMERABLE
    @Test
    public void testBinOpMinus() throws RecognitionException {
        HaxeTree tree = parseExpression("1-2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpPersent() throws RecognitionException {
        HaxeTree tree = parseExpression("1%2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpMultiply() throws RecognitionException {
        HaxeTree tree = parseExpression("1*2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    //DIVIDE
    @Test
    public void testBinOpDivide() throws RecognitionException {
        HaxeTree tree = parseExpression("1/2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    //SHIFTS    
    @Test    
    public void testBinOpShiftLeft() throws RecognitionException {
        HaxeTree tree = parseExpression("1<<2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpShiftRight() throws RecognitionException {
        HaxeTree tree = parseExpression("1>>2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpShiftStrongRight() throws RecognitionException {
        HaxeTree tree = parseExpression("1>>>2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    //OTHER BITWISE    
    @Test    
    public void testBinOpBitwiseOR() throws RecognitionException {
        HaxeTree tree = parseExpression("1|2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpBitwiseAnd() throws RecognitionException {
        HaxeTree tree = parseExpression("1&2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpBitwiseNot() throws RecognitionException {
        HaxeTree tree = parseExpression("1^2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    //COMPARISONS    
    @Test    
    public void testBinOpEquals() throws RecognitionException {
        HaxeTree tree = parseExpression("1==2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpNotEqual() throws RecognitionException {
        HaxeTree tree = parseExpression("1!=2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpBigger() throws RecognitionException {
        HaxeTree tree = parseExpression("1>2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpLess() throws RecognitionException {
        HaxeTree tree = parseExpression("1<2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpBiggerOrEqual() throws RecognitionException {
        HaxeTree tree = parseExpression("1>=2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpLessOrEqual() throws RecognitionException {
        HaxeTree tree = parseExpression("1<=2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    //Boolean
    @Test
    public void testBinOpAnd() throws RecognitionException {
        HaxeTree tree = parseExpression("1&&2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpOr() throws RecognitionException {
        HaxeTree tree = parseExpression("1||2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    //
    // Comples Expressions
    //
    
    @Test
    public void testBinOpWithParenthesis() throws RecognitionException {
        HaxeTree tree = parseExpression("3*(1*2)");
        assertTrue(tree instanceof BinaryExpressionNode);
        assertTrue(tree.getChildCount() == 2);
        assertTrue(tree.getChild(0) instanceof ConstantNode);
        assertTrue(tree.getChild(1) instanceof BinaryExpressionNode);
    }

}
