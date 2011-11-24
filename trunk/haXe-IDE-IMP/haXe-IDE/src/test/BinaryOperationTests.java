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
    
    @Test
    public void testBinOpPlus() throws RecognitionException {
        HaxeTree tree = parseExpression("1+2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpMinus() throws RecognitionException {
        HaxeTree tree = parseExpression("1-2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpDivide() throws RecognitionException {
        HaxeTree tree = parseExpression("1/2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpMultiply() throws RecognitionException {
        HaxeTree tree = parseExpression("1*2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpPersent() throws RecognitionException {
        HaxeTree tree = parseExpression("1%2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpEquals() throws RecognitionException {
        HaxeTree tree = parseExpression("1==2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpWithParenthesis() throws RecognitionException {
        HaxeTree tree = parseExpression("3*(1*2)");
        assertTrue(tree instanceof BinaryExpressionNode);
        assertTrue(tree.getChildCount() == 2);
        assertTrue(tree.getChild(0) instanceof ConstantNode);
        assertTrue(tree.getChild(1) instanceof BinaryExpressionNode);
    }

}
