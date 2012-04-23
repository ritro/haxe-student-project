package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.parseFunction;
import imp.parser.antlr.tree.HaxeTree;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import tree.specific.AssignOperationNode;
import tree.specific.HaxeType;
import tree.utils.Environment;
import tree.utils.HaxeTreeLinker;
import tree.utils.HaxeTypeUtils;

public class AssignOperationTests
{    
    ///
    /// Type Interference test.
    ///
    HaxeTreeLinker linker = new HaxeTreeLinker();

    @Test
    public void testIntToFloat() throws RecognitionException 
    {
        HaxeTree tree = parseFunction("function main() { var x:Int; x=123.1;}");
        linker.visit(tree, new Environment());
        AssignOperationNode node = TestHelper.getAssignment(tree);
        
        HaxeType firstType = node.getLeftOperand().getHaxeType();
        HaxeType secondType = node.getRightOperand().getHaxeType(); 
        assertTrue(!HaxeTypeUtils.isAvailableAssignement(firstType, secondType));
    }
    
    @Test
    public void testFloatToInt() throws RecognitionException 
    {
        HaxeTree tree = parseFunction("function main() { var x:Int; x=123;}");
        linker.visit(tree, new Environment());
        AssignOperationNode node = TestHelper.getAssignment(tree);

        HaxeType firstType = node.getLeftOperand().getHaxeType();
        HaxeType secondType = node.getRightOperand().getHaxeType(); 
        assertTrue(HaxeTypeUtils.isAvailableAssignement(secondType, firstType));
    }
    
    @Test
    public void test() throws RecognitionException 
    {
        HaxeTree tree = TestHelper.parseExpression("");
    }
}