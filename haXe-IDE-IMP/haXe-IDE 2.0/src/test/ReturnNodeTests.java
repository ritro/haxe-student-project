package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.parseModule;
import imp.parser.antlr.tree.HaxeTree;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import tree.specific.FunctionNode;
import tree.specific.HaxeType;
import tree.specific.ReturnNode;
import tree.utils.Environment;
import tree.utils.HaxeTreeLinker;
import tree.utils.HaxeTypeUtils;

public class ReturnNodeTests
{
    private ReturnNode getReturnNode(HaxeTree tree)
    {
        for (HaxeTree i : tree.getChildren())
        {
            if (i instanceof ReturnNode)
            {
                return (ReturnNode)i;
            }
            else if (i.getChildCount() > 0)
            {
                ReturnNode result = getReturnNode(i);
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
    public void testIntToFloatInReturnNode() throws RecognitionException 
    {
        HaxeTree tree = parseModule("class A { function main():Int { return 123.1;}}");
        linker.visit(tree, new Environment());
        
        ReturnNode returnNode = getReturnNode(tree);
        HaxeType type = returnNode.getHaxeType();
        FunctionNode function = returnNode.getFunction();    
        HaxeType funType = function.getHaxeType();
        
        assertTrue(!HaxeTypeUtils.isAvailableAssignement(funType, type));
    }
    
    @Test
    public void testFloatToIntInReturnNode() throws RecognitionException 
    {
        HaxeTree tree = parseModule("class A { function main():Float { return 123;}}");
        linker.visit(tree, new Environment());
        
        ReturnNode returnNode = getReturnNode(tree);
        HaxeType type = returnNode.getHaxeType();
        FunctionNode function = returnNode.getFunction();
        HaxeType funType = function.getHaxeType();
        
        assertTrue(HaxeTypeUtils.isAvailableAssignement(funType, type));
    }

}
