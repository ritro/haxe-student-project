package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.parseExpression;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import tree.HaxeTree;
import tree.expression.UnarExpression;

public class UnarOpTests
{
    ///
    /// Parcer
    ///
    @Test
    public void testUnarOpNot() throws RecognitionException {
        HaxeTree tree = parseExpression("!x");
        assertTrue(tree instanceof UnarExpression);
    }
    
    @Test
    public void testUnarOpSub() throws RecognitionException {
        HaxeTree tree = parseExpression("-x");
        assertTrue(tree instanceof UnarExpression);
    }
    
    @Test
    public void testUnarOpIncrement() throws RecognitionException {
        HaxeTree tree = parseExpression("++x");
        assertTrue(tree instanceof UnarExpression);
    }
    
    @Test
    public void testUnarOpIncrement2() throws RecognitionException {
        HaxeTree tree = parseExpression("x++");
        assertTrue(tree instanceof UnarExpression);
    }
    
    @Test
    public void testUnarOpDecrement() throws RecognitionException {
        HaxeTree tree = parseExpression("--x");
        assertTrue(tree instanceof UnarExpression);
    }
    
    @Test
    public void testUnarOpDecrement2() throws RecognitionException {
        HaxeTree tree = parseExpression("x--");
        assertTrue(tree instanceof UnarExpression);
    }
    
    @Test
    public void testUnarOpComplement() throws RecognitionException {
        HaxeTree tree = parseExpression("~x");
        assertTrue(tree instanceof UnarExpression);
    }
}
