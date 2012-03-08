package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.parseExpression;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.tree.utils.HaxeTreePrinter;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

public class ExpressionTests
{
    ///
    /// Parcer
    ///
    
    HaxeTreePrinter printer = new HaxeTreePrinter();
    
    // Call and slices
    @Test
    public void testCallExpression() throws RecognitionException {
        HaxeTree tree = parseExpression("getArray()[3].getSomeClass().intField");
        assertTrue(tree.getText().equals("MethodCall"));
    }
    
    @Test
    public void testCallExpression2() throws RecognitionException {
        HaxeTree tree = parseExpression("getArray().getSomeClass()");
        assertTrue(tree.getChild(1).getChild(0).getText().equals("MethodCall"));
    }
    
    @Test
    public void testSliceExpression() throws RecognitionException {
        HaxeTree tree = parseExpression("array[1]");
        assertTrue(tree.getText().equals("Slice"));
    }
    
    @Test
    public void testVeryComplexExpression() throws RecognitionException {
        HaxeTree tree = parseExpression("loader.loadBytes" +
            "(" +
                "Type.createInstance" +
                "(" +
                    "Type.resolveClass" + "(mainClass,[5,5])" + "," +
                    "new flash.system.LoaderContext" +
                    "(" +
                        "new flash.system.ApplicationDomain()" +
                    ")" +
                ")" +
            ")");
        printer.visit(tree);
        assertTrue(true);
    }
    
    // dot expressions
    @Test
    public void testDotExpression() throws RecognitionException {
        HaxeTree tree = parseExpression("some.this.some2");
        assertTrue(tree instanceof VarUsageNode);
    }
    
    //
    @Test
    public void testArrayExpression() throws RecognitionException {
        //HaxeTree tree = parseExpression("x = [1,2];");
        //HaxeTree tree = parseExpression("lo.t(Type.cr(Type.res(mainClass),[]), new f.s.Lo(new fl.sy.App()));");
    }
    
}
