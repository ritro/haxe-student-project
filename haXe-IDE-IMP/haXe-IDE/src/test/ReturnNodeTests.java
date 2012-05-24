package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.parseModule;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import tree.Function;
import tree.HaxeTree;
import tree.statement.Return;
import tree.type.HaxeType;
import tree.utils.Environment;
import tree.utils.Linker;
import tree.utils.TypeUtils;

public class ReturnNodeTests
{
    private Return getReturnNode(HaxeTree tree)
    {
        for (HaxeTree i : tree.getChildren())
        {
            if (i instanceof Return)
            {
                return (Return)i;
            }
            else if (i.getChildCount() > 0)
            {
                Return result = getReturnNode(i);
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
    Linker linker = new Linker();
    
    @Test
    public void testIntToFloatInReturnNode() throws RecognitionException 
    {
        HaxeTree tree = parseModule("class A { function main():Int { return 123.1;}}");
        linker.visit(tree, new Environment());
        
        Return returnNode = getReturnNode(tree);
        HaxeType type = returnNode.getHaxeType();
        Function function = returnNode.getFunction();    
        HaxeType funType = function.getHaxeType();
        
        assertTrue(!TypeUtils.isAvailableAssignement(funType, type));
    }
    
    @Test
    public void testFloatToIntInReturnNode() throws RecognitionException 
    {
        HaxeTree tree = parseModule("class A { function main():Float { return 123;}}");
        linker.visit(tree, new Environment());
        
        Return returnNode = getReturnNode(tree);
        HaxeType type = returnNode.getHaxeType();
        Function function = returnNode.getFunction();
        HaxeType funType = function.getHaxeType();
        
        assertTrue(TypeUtils.isAvailableAssignement(funType, type));
    }

}
