package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.*;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.BinaryExpressionNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.tree.utils.Environment;
import haxe.tree.utils.HaxeTreeLinker;
import haxe.tree.utils.PrimaryHaxeType;

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
    
    @Test
    public void testBinOpIter() throws RecognitionException {
        HaxeTree tree = parseExpression("1...2");
        assertTrue(tree instanceof BinaryExpressionNode);
    }
    
    //
    // Comples Expressions
    //
    
    // With Parenthesis
    @Test
    public void testBinOpWithParenthesis() throws RecognitionException {
        HaxeTree tree = parseExpression("3*(1*2)");
        assertTrue(tree instanceof BinaryExpressionNode);
        assertTrue(tree.getChildCount() == 2);
        BinaryExpressionNode binaryNode = (BinaryExpressionNode)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof ConstantNode);
        assertTrue(binaryNode.getRightOperand() instanceof BinaryExpressionNode);
    }
    
    // Priority without parenthesis
    @Test
    public void testBinOpPriority1() throws RecognitionException {
        HaxeTree tree = parseExpression("3 || 1 && 2");
        BinaryExpressionNode binaryNode = (BinaryExpressionNode)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof ConstantNode);
        assertTrue(binaryNode.getRightOperand() instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpPriority2() throws RecognitionException {
        HaxeTree tree = parseExpression("3 && 1 != 2");
        BinaryExpressionNode binaryNode = (BinaryExpressionNode)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof ConstantNode);
        assertTrue(binaryNode.getRightOperand() instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpPriority3() throws RecognitionException {
        HaxeTree tree = parseExpression("3 <= 1|2");
        BinaryExpressionNode binaryNode = (BinaryExpressionNode)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof ConstantNode);
        assertTrue(binaryNode.getRightOperand() instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpPriority8() throws RecognitionException {
        HaxeTree tree = parseExpression("3 ... 1 >= 2");
        BinaryExpressionNode binaryNode = (BinaryExpressionNode)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof ConstantNode);
        assertTrue(binaryNode.getRightOperand() instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpPriority4() throws RecognitionException {
        HaxeTree tree = parseExpression("3 | 1 << 2");
        BinaryExpressionNode binaryNode = (BinaryExpressionNode)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof ConstantNode);
        assertTrue(binaryNode.getRightOperand() instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpPriority5() throws RecognitionException {
        HaxeTree tree = parseExpression("3 << 1 + 2");
        BinaryExpressionNode binaryNode = (BinaryExpressionNode)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof ConstantNode);
        assertTrue(binaryNode.getRightOperand() instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpPriority6() throws RecognitionException {
        HaxeTree tree = parseExpression("3 << 1 + 2");
        BinaryExpressionNode binaryNode = (BinaryExpressionNode)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof ConstantNode);
        assertTrue(binaryNode.getRightOperand() instanceof BinaryExpressionNode);
    }
    
    @Test
    public void testBinOpPriority7() throws RecognitionException {
        HaxeTree tree = parseExpression("3 - 1 * 2");
        BinaryExpressionNode binaryNode = (BinaryExpressionNode)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof ConstantNode);
        assertTrue(binaryNode.getRightOperand() instanceof BinaryExpressionNode);
    }
    
    //
    // Type interference tests
    //    
    HaxeTreeLinker linker = new HaxeTreeLinker();

    @Test
    public void testIntAfterAdditionExpectiong() throws RecognitionException 
    {
        HaxeTree tree = parseFunction("function main() { var x; x=123 + 1; }");
        linker.visit(tree, new Environment());
        BinaryExpressionNode node = TestHelper.getBinaryExpression(tree);
        
        assertTrue(node.getHaxeType() == PrimaryHaxeType.haxeInt);
    }
    
    @Test
    public void testFloatAfterAdditionExpectiong() throws RecognitionException 
    {
        HaxeTree tree = parseFunction("function main() { var x; x=123.1 + 1; }");
        linker.visit(tree, new Environment());
        BinaryExpressionNode node = TestHelper.getBinaryExpression(tree);
        
        assertTrue(node.getHaxeType() == PrimaryHaxeType.haxeFloat);
    }
    
    @Test
    public void testStringAfterAdditionExpectiong() throws RecognitionException 
    {
        HaxeTree tree = parseFunction("function main() { var x; x=123 + \" monkeys\"; }");
        linker.visit(tree, new Environment());
        BinaryExpressionNode node = TestHelper.getBinaryExpression(tree);
        
        assertTrue(node.getHaxeType() == PrimaryHaxeType.haxeString);
    }
}
