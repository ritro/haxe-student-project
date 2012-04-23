package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.parseFunction;

import imp.parser.antlr.tree.HaxeTree;

import java.util.ArrayList;


import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import tree.specific.FunctionNode;
import tree.specific.VarDeclarationNode;

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
