package tests;


import static junit.framework.Assert.assertTrue;
import static utils.TestHelper.*;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import tree.HaxeTree;
import tree.expression.Binary;
import tree.expression.Constant;
import tree.expression.Usage;
import tree.utils.Environment;
import tree.utils.Linker;
import tree.utils.TypeUtils;
import utils.TestHelper;

public class BinaryOperationTests
{
    ///
    /// Parser Tests
    ///
    /*
    private final Mockery context = new JUnit4Mockery();
        
    private MockInterface mockInterface;

    private final static double DELTA = 0.001;        

        @Before
        public void setUp() {
         mockInterface = context.mock(MockInterface.class);
        }

        @Test
        public void testKineticEnergy() {
         EinsteinFormulaImpl einsteinFormula = new EinsteinFormulaImpl() {
          double energy(final double mass) {
           return (Double) mockInterface.mockMethod(mass);
          }
         };
         
         final double restMass = 10.0;
         final double velocity = 100000000.0;
         final double expectedEnergy = 5.4601175017849928E16;
         final double mockRestEnergy = 8.987551787368178E17;

         context.checking(new Expectations() { {
          one(mockInterface).mockMethod(restMass);
          will(returnValue(mockRestEnergy));
         } });*/
         
    //PLUS
    @Test
    public void testBinOpPlus() throws RecognitionException {
        HaxeTree tree = parseExpression("x+y");
        assertTrue(tree instanceof Binary);
    }
    
    //NUMERABLE
    @Test
    public void testBinOpMinus() throws RecognitionException {
        HaxeTree tree = parseExpression("x-y");
        assertTrue(tree instanceof Binary);
    }
    
    @Test
    public void testBinOpPersent() throws RecognitionException {
        HaxeTree tree = parseExpression("x%y");
        assertTrue(tree instanceof Binary);
    }
    
    @Test
    public void testBinOpMultiply() throws RecognitionException {
        HaxeTree tree = parseExpression("x*y");
        assertTrue(tree instanceof Binary);
    }
    
    //DIVIDE
    @Test
    public void testBinOpDivide() throws RecognitionException {
        HaxeTree tree = parseExpression("x/y");
        assertTrue(tree instanceof Binary);
    }
    
    //SHIFTS    
    @Test    
    public void testBinOpShiftLeft() throws RecognitionException {
        HaxeTree tree = parseExpression("x<<y");
        assertTrue(tree instanceof Binary);
    }
    
    @Test
    public void testBinOpShiftRight() throws RecognitionException {
        HaxeTree tree = parseExpression("x>>y");
        assertTrue(tree instanceof Binary);
    }
    
    @Test
    public void testBinOpShiftStrongRight() throws RecognitionException {
        HaxeTree tree = parseExpression("x>>>y");
        assertTrue(tree instanceof Binary);
    }
    
    //OTHER BITWISE    
    @Test    
    public void testBinOpBitwiseOR() throws RecognitionException {
        HaxeTree tree = parseExpression("x|y");
        assertTrue(tree instanceof Binary);
    }
    
    @Test
    public void testBinOpBitwiseAnd() throws RecognitionException {
        HaxeTree tree = parseExpression("x&y");
        assertTrue(tree instanceof Binary);
    }
    
    @Test
    public void testBinOpBitwiseNot() throws RecognitionException {
        HaxeTree tree = parseExpression("x^y");
        assertTrue(tree instanceof Binary);
    }
    
    //COMPARISONS    
    @Test    
    public void testBinOpEquals() throws RecognitionException {
        HaxeTree tree = parseExpression("x==y");
        assertTrue(tree instanceof Binary);
    }
    
    @Test
    public void testBinOpNotEqual() throws RecognitionException {
        HaxeTree tree = parseExpression("x!=y");
        assertTrue(tree instanceof Binary);
    }
    
    @Test
    public void testBinOpBigger() throws RecognitionException {
        HaxeTree tree = parseExpression("x>y");
        assertTrue(tree instanceof Binary);
    }
    
    @Test
    public void testBinOpLess() throws RecognitionException {
        HaxeTree tree = parseExpression("x<y");
        assertTrue(tree instanceof Binary);
    }
    
    @Test
    public void testBinOpBiggerOrEqual() throws RecognitionException {
        HaxeTree tree = parseExpression("x>=y");
        assertTrue(tree instanceof Binary);
    }
    
    @Test
    public void testBinOpLessOrEqual() throws RecognitionException {
        HaxeTree tree = parseExpression("x<=y");
        assertTrue(tree instanceof Binary);
    }
    
    //Boolean
    @Test
    public void testBinOpAnd() throws RecognitionException {
        HaxeTree tree = parseExpression("x&&y");
        assertTrue(tree instanceof Binary);
    }
    
    @Test
    public void testBinOpOr() throws RecognitionException {
        HaxeTree tree = parseExpression("x||y");
        assertTrue(tree instanceof Binary);
    }
    
    @Test
    public void testBinOpIter() throws RecognitionException {
        HaxeTree tree = parseExpression("x...y");
        assertTrue(tree instanceof Binary);
    }
    
    //
    // Comples Expressions
    //
    
    // With Parenthesis
    @Test
    public void testBinOpWithParenthesis() throws RecognitionException {
        HaxeTree tree = parseExpression("z*(x*y)");
        assertTrue(tree instanceof Binary);
        assertTrue(tree.getChildCount() == 2);
        Binary binaryNode = (Binary)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof Usage);
        assertTrue(binaryNode.getRightOperand() instanceof Binary);
    }
    
    // Priority without parenthesis
    @Test
    public void testBinOpPriority1() throws RecognitionException {
        HaxeTree tree = parseExpression("z || x && y");
        Binary binaryNode = (Binary)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof Usage);
        assertTrue(binaryNode.getRightOperand() instanceof Binary);
    }
    
    @Test
    public void testBinOpPriority2() throws RecognitionException {
        HaxeTree tree = parseExpression("z && x != y");
        Binary binaryNode = (Binary)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof Usage);
        assertTrue(binaryNode.getRightOperand() instanceof Binary);
    }
    
    @Test
    public void testBinOpPriority3() throws RecognitionException {
        HaxeTree tree = parseExpression("z <= x|y");
        Binary binaryNode = (Binary)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof Usage);
        assertTrue(binaryNode.getRightOperand() instanceof Binary);
    }
    
    @Test
    public void testBinOpPriority8() throws RecognitionException {
        HaxeTree tree = parseExpression("z ... x >= y");
        Binary binaryNode = (Binary)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof Usage);
        assertTrue(binaryNode.getRightOperand() instanceof Binary);
    }
    
    @Test
    public void testBinOpPriority4() throws RecognitionException {
        HaxeTree tree = parseExpression("z | x << y");
        Binary binaryNode = (Binary)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof Usage);
        assertTrue(binaryNode.getRightOperand() instanceof Binary);
    }
    
    @Test
    public void testBinOpPriority5() throws RecognitionException {
        HaxeTree tree = parseExpression("z << x + y");
        Binary binaryNode = (Binary)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof Usage);
        assertTrue(binaryNode.getRightOperand() instanceof Binary);
    }
    
    @Test
    public void testBinOpPriority6() throws RecognitionException {
        HaxeTree tree = parseExpression("z << x + y");
        Binary binaryNode = (Binary)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof Usage);
        assertTrue(binaryNode.getRightOperand() instanceof Binary);
    }
    
    @Test
    public void testBinOpPriority7() throws RecognitionException {
        HaxeTree tree = parseExpression("z - x * y");
        Binary binaryNode = (Binary)tree;
        assertTrue(binaryNode.getLeftOperand() instanceof Usage);
        assertTrue(binaryNode.getRightOperand() instanceof Binary);
    }
    
    //
    // Type interference tests
    //    
    Linker linker = new Linker();

    @Test
    public void testIntAfterAdditionExpectiong() throws RecognitionException 
    {
        HaxeTree tree = parseFunction("function main() { var x; x=123 + 1; }");
        linker.visit(tree, new Environment());
        Binary node = TestHelper.getBinaryExpression(tree);
        
        assertTrue(node.getHaxeType() == TypeUtils.getInt());
    }
    
    @Test
    public void testFloatAfterAdditionExpectiong() throws RecognitionException 
    {
        HaxeTree tree = parseFunction("function main() { var x; x=123.1 + 1; }");
        linker.visit(tree, new Environment());
        Binary node = TestHelper.getBinaryExpression(tree);
        
        assertTrue(node.getHaxeType() == TypeUtils.getFloat());
    }
    
    @Test
    public void testStringAfterAdditionExpectiong() throws RecognitionException 
    {
        HaxeTree tree = parseFunction("function main() { var x; x=123 + \" monkeys\"; }");
        linker.visit(tree, new Environment());
        Binary node = TestHelper.getBinaryExpression(tree);
        
        assertTrue(node.getHaxeType() == TypeUtils.getString());
    }
}
