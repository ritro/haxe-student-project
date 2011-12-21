package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.parseFunction;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.tree.utils.Environment;
import haxe.tree.utils.HaxeTreeLinker;
import haxe.tree.utils.HaxeType;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

public class AssignOperationTests
{
    private AssignOperationNode getAssignment(HaxeTree tree)
    {
        for (HaxeTree i : tree.getChildren())
        {
            if (i instanceof AssignOperationNode)
            {
                return (AssignOperationNode)i;
            }
            else if (i.getChildCount() > 0)
            {
                AssignOperationNode result = getAssignment(i);
                if (result != null)
                {
                    return result;
                }
            }
        }
        
        return null;
    }
    
    ///
    /// Type Interference test.
    ///
    HaxeTreeLinker linker = new HaxeTreeLinker();

    @Test
    public void testIntToFloat() throws RecognitionException 
    {
        HaxeTree tree = parseFunction("function main() { var x:Int; x=123.1;}");
        linker.visit(tree, new Environment());
        AssignOperationNode node = getAssignment(tree);
        
        HaxeType firstType = node.getLeftOperand().getHaxeType();
        HaxeType secondType = node.getRightOperand().getHaxeType(); 
        assertTrue(!HaxeType.isAvailableAssignement(firstType, secondType));
    }
    
    @Test
    public void testFloatToInt() throws RecognitionException 
    {
        HaxeTree tree = parseFunction("function main() { var x:Int; x=123;}");
        linker.visit(tree, new Environment());
        AssignOperationNode node = getAssignment(tree);

        HaxeType firstType = node.getLeftOperand().getHaxeType();
        HaxeType secondType = node.getRightOperand().getHaxeType(); 
        assertTrue(HaxeType.isAvailableAssignement(secondType, firstType));
    }

}
