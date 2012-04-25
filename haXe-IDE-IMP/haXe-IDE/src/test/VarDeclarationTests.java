package test;

import static org.junit.Assert.assertTrue;
import static test.TestHelper.parseStatement;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import tree.HaxeTree;
import tree.specific.ConstantNode;
import tree.specific.DeclarationNode;
import tree.specific.type.HaxeType;
import tree.utils.HaxeTypeUtils;

public class VarDeclarationTests
{
    // Parser tests (for local variable declarations)
    @Test
    public void parseDeclarationSimple() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var x : Int;");
        
        assertTrue(tree instanceof DeclarationNode);
    }
    
    @Test
    public void parseDeclarationList() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var x,c,z : Int;");
        
        assertTrue(tree.getChildCount() == 3);
        assertTrue(tree.getChild(0) instanceof DeclarationNode);
        assertTrue(tree.getChild(1) instanceof DeclarationNode);
        assertTrue(tree.getChild(2) instanceof DeclarationNode);
    }
    
    @Test
    public void parseDeclarationList2() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var x,c: Int, z : Int;");
        
        assertTrue(tree.getChildCount() == 3);
        assertTrue(tree.getChild(0) instanceof DeclarationNode);
        assertTrue(tree.getChild(1) instanceof DeclarationNode);
        assertTrue(tree.getChild(2) instanceof DeclarationNode);
    }
    
    
    @Test
    public void parseDeclarationListFields() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var x,c : Int = 5;");
        DeclarationNode firstDecl = (DeclarationNode)tree.getChild(0);
        DeclarationNode secondDecl = (DeclarationNode)tree.getChild(1);
        firstDecl.updateInfo();
        secondDecl.updateInfo();
        
        HaxeType intType = HaxeTypeUtils.getInt();
        assertTrue(!firstDecl.getHaxeType().equals(secondDecl.getHaxeType()));
        assertTrue(secondDecl.getHaxeType().equals(intType));
        assertTrue(!firstDecl.getHaxeType().equals(intType));
        
        assertTrue(secondDecl.getChild(secondDecl.getChildCount()-1).getChild(0) instanceof ConstantNode);
    }
    
    @Test
    public void parseDeclarationWithProperties() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var x(getter,setter) : Int;");
        
        assertTrue(tree instanceof DeclarationNode);
    }
    
    @Test
    public void parseDecWithComplexTypeWithExtention() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var jsons:Array<{path:String, json:Dynamic, finished:Bool}>;");
        // TODO
        assertTrue(tree instanceof DeclarationNode);
    }
    
    @Test
    public void parseInitOfDeclWithDotExprAndParams() throws RecognitionException 
    {
        HaxeTree tree = parseStatement("var count:Int = Std.int(sum);");
        // TODO
        assertTrue(tree instanceof DeclarationNode);
    }
    
    // global declarations
    
    @Test
    public void parseDeclarationWithManyAttributes() throws RecognitionException
    {
        HaxeTree tree = parseStatement("public static inline var NaN = Math.NaN;");
        // TODO
        assertTrue(tree instanceof DeclarationNode);
    }
}


