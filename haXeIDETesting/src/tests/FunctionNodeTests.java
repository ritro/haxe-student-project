package tests;
import static junit.framework.Assert.assertTrue;
import static utils.TestHelper.parseFunction;

import java.util.ArrayList;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import tree.Function;
import tree.HaxeTree;
import tree.expression.Declaration;

public class FunctionNodeTests
{

    @Test
    public void testIntToFloat() throws RecognitionException 
    {
        HaxeTree tree = parseFunction("function main(x:Int, y:Float) {}");
        
        ArrayList<Declaration> firstType = ((Function)tree).getParametersAsDeclarations();
        assertTrue(firstType.size() == 2);
    }
}
