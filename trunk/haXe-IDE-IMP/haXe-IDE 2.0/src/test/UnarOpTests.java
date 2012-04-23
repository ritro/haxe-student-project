package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.parseExpression;
import imp.parser.antlr.tree.HaxeTree;
import imp.parser.antlr.tree.specific.UnarExpressionNode;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

public class UnarOpTests
{
    ///
    /// Parcer
    ///
    @Test
    public void testUnarOpNot() throws RecognitionException {
        HaxeTree tree = parseExpression("!x");
        assertTrue(tree instanceof UnarExpressionNode);
    }
    
    @Test
    public void testUnarOpSub() throws RecognitionException {
        HaxeTree tree = parseExpression("-x");
        assertTrue(tree instanceof UnarExpressionNode);
    }
    
    @Test
    public void testUnarOpIncrement() throws RecognitionException {
        HaxeTree tree = parseExpression("++x");
        assertTrue(tree instanceof UnarExpressionNode);
    }
    
    @Test
    public void testUnarOpIncrement2() throws RecognitionException {
        HaxeTree tree = parseExpression("x++");
        assertTrue(tree instanceof UnarExpressionNode);
    }
    
    @Test
    public void testUnarOpDecrement() throws RecognitionException {
        HaxeTree tree = parseExpression("--x");
        assertTrue(tree instanceof UnarExpressionNode);
    }
    
    @Test
    public void testUnarOpDecrement2() throws RecognitionException {
        HaxeTree tree = parseExpression("x--");
        assertTrue(tree instanceof UnarExpressionNode);
    }
    
    @Test
    public void testUnarOpComplement() throws RecognitionException {
        HaxeTree tree = parseExpression("~x");
        assertTrue(tree instanceof UnarExpressionNode);
    }
}
