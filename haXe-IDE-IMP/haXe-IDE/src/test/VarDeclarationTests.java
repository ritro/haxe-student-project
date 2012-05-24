package test;

import static org.junit.Assert.assertTrue;
import static test.TestHelper.parseStatement;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import tree.HaxeTree;
import tree.expression.Constant;
import tree.expression.Declaration;
import tree.type.HaxeType;
import tree.utils.TypeUtils;

public class VarDeclarationTests
{
    // Parser tests (for local variable declarations)
    @Test
    public void parseDeclarationSimple() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var x : Int;");
        
        assertTrue(tree instanceof Declaration);
    }
    
    @Test
    public void parseDeclarationList() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var x,c,z : Int;");
        
        assertTrue(tree.getChildCount() == 3);
        assertTrue(tree.getChild(0) instanceof Declaration);
        assertTrue(tree.getChild(1) instanceof Declaration);
        assertTrue(tree.getChild(2) instanceof Declaration);
    }
    
    @Test
    public void parseDeclarationList2() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var x,c: Int, z : Int;");
        
        assertTrue(tree.getChildCount() == 3);
        assertTrue(tree.getChild(0) instanceof Declaration);
        assertTrue(tree.getChild(1) instanceof Declaration);
        assertTrue(tree.getChild(2) instanceof Declaration);
    }
    
    
    @Test
    public void parseDeclarationListFields() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var x,c : Int = 5;");
        Declaration firstDecl = (Declaration)tree.getChild(0);
        Declaration secondDecl = (Declaration)tree.getChild(1);
        firstDecl.updateInfo();
        secondDecl.updateInfo();
        
        HaxeType intType = TypeUtils.getInt();
        assertTrue(!firstDecl.getHaxeType().equals(secondDecl.getHaxeType()));
        assertTrue(secondDecl.getHaxeType().equals(intType));
        assertTrue(!firstDecl.getHaxeType().equals(intType));
        
        assertTrue(secondDecl.getChild(secondDecl.getChildCount()-1).getChild(0) instanceof Constant);
    }
    
    @Test
    public void parseDeclarationWithProperties() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var x(getter,setter) : Int;");
        
        assertTrue(tree instanceof Declaration);
    }
    
    @Test
    public void parseDecWithComplexTypeWithExtention() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var jsons:Array<{path:String, json:Dynamic, finished:Bool}>;");
        // TODO
        assertTrue(tree instanceof Declaration);
    }
    
    @Test
    public void parseInitOfDeclWithDotExprAndParams() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var count:Int = Std.int(sum);");
        // TODO
        assertTrue(tree instanceof Declaration);
    }
    
    // global declarations
    
    @Test
    public void parseDeclarationWithManyAttributes() throws RecognitionException
    {
        HaxeTree tree = parseStatement("public static inline var NaN = Math.NaN;");
        // TODO
        assertTrue(tree instanceof Declaration);
    }
}


