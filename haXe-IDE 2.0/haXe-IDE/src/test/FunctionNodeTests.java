package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.parseFunction;

import java.util.ArrayList;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;

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
