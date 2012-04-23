package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.parseFunction;

import imp.parser.antlr.tree.HaxeTree;
import imp.parser.antlr.tree.specific.FunctionNode;
import imp.parser.antlr.tree.specific.VarDeclarationNode;

import java.util.ArrayList;


import org.antlr.runtime.RecognitionException;
import org.junit.Test;

public class FunctionNodeTests
{

    @Test
    public void testIntToFloat() throws RecognitionException 
    {
        HaxeTree tree = parseFunction("function main(x:Int, y:Float) {}");
        
        ArrayList<VarDeclarationNode> firstType = ((FunctionNode)tree).getParametersAsDeclarations();
        assertTrue(firstType.size() == 2);
    }
}
