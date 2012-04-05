package test;

import static junit.framework.Assert.assertTrue;
import static test.TestHelper.parseExpression;

import java.util.List;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.ArrayNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.MethodCallNode;
import haxe.imp.parser.antlr.tree.specific.NewNode;
import haxe.imp.parser.antlr.tree.specific.SliceNode;
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
    public void parseCallExpression() throws RecognitionException {
        HaxeTree tree = parseExpression("getArray()[3].getSomeClass().intField");
        assertTrue(tree instanceof MethodCallNode);
    }
    
    @Test
    public void parseCallExpression2() throws RecognitionException {
        HaxeTree tree = parseExpression("getArray().getSomeClass()");
        assertTrue(tree.getChild(1).getChild(0) instanceof MethodCallNode);
    }
    
    @Test
    public void parseSliceExpression() throws RecognitionException {
        HaxeTree tree = parseExpression("array[1]");
        assertTrue(tree instanceof SliceNode);
    }
    
    @Test
    public void parseVeryComplexExpression() throws RecognitionException {
        HaxeTree tree = parseExpression("loader.loadBytes" +
            "(" +
                "Type.createInstance" +
                "(" +
                    "Type.resolveClass" + "(mainClass,[])" + "," +
                    "new flash.system.LoaderContext" +
                    "(" +
                        "new flash.system.ApplicationDomain()" +
                    ")" +
                ")" +
            ")");
        assertTrue(tree.getAllChildren().size() == 7);
    }
    
    // dot expressions
    @Test
    public void parseDotExpression() throws RecognitionException {
        HaxeTree tree = parseExpression("some.this.some2");
        assertTrue(tree instanceof VarUsageNode);
    }
    
    // Arrays
    @Test
    public void parseEmptyArrayExpression() throws RecognitionException {
        HaxeTree tree = parseExpression("[]");
        assertTrue(tree instanceof ArrayNode);
    }
    
    @Test
    public void parseArrayExpression() throws RecognitionException {
        HaxeTree tree = parseExpression("[1,2]");
        assertTrue(tree.getChildCount() == 2);
        assertTrue(tree.getChild(0) instanceof ConstantNode);
    }
    
    // Type expressions and arrays classes    
    @Test
    public void parseArrayClassExpression() throws RecognitionException {
        HaxeTree tree = parseExpression("new Array()");
        assertTrue(tree instanceof NewNode);
        HaxeTree object = ((NewNode)tree).getObjectWhichIsCreated();
        assertTrue(object.getText().equals("Array"));
    }
    
    @Test
    public void parseArrayClassWithTypeExpression() throws RecognitionException {
        HaxeTree tree = parseExpression("new Array<T>()");
        assertTrue(tree instanceof NewNode);
        HaxeTree object = ((NewNode)tree).getObjectWhichIsCreated();
        assertTrue(object.getChild(0).getText().equals("TYPE_PARAM"));
    }
    
    @Test
    public void parseArrayClassWithParams() throws RecognitionException 
    {
        HaxeTree tree = parseExpression("new Array<T>(new Class())");
        assertTrue(tree instanceof NewNode);
        List<HaxeTree> params = ((NewNode)tree).getParameters();
        assertTrue(params.size() == 1 && params.get(0) instanceof NewNode);
    }
    
    @Test
    public void parseComplexType() throws RecognitionException {
        HaxeTree tree = parseExpression("new Hash<Array<T>>()");
        assertTrue(tree instanceof NewNode);
        HaxeTree object = ((NewNode)tree).getObjectWhichIsCreated();
        assertTrue(object.getChild(0).getChild(1).getChild(0).getText().equals("T"));
    }
    
    @Test
    public void parseComplexTypeWithFunTypeAsParam() throws RecognitionException {
        HaxeTree tree = parseExpression("new IntHash<Void->Void>();");
        assertTrue(tree instanceof NewNode);
        HaxeTree object = ((NewNode)tree).getObjectWhichIsCreated();
        // TODO
    }
}