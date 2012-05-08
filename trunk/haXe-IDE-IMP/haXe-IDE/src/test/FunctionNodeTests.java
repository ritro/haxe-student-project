package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.parseFunction;


import java.util.ArrayList;


import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import tree.HaxeTree;
import tree.specific.Function;
import tree.specific.Declaration;

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
