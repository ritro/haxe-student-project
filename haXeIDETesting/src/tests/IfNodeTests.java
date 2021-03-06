package tests;
import static junit.framework.Assert.assertTrue;
import static utils.TestHelper.parseStatement;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import tree.HaxeTree;
import tree.expression.Assignment;
import tree.expression.MethodCall;
import tree.statement.IfNode;

public class IfNodeTests
{
    @Test
    public void parseSimpleIfWithBlock() throws RecognitionException {
        HaxeTree tree = parseStatement("if(true){ doSmth(); }");
        assertTrue(tree instanceof IfNode);
    }
    
    @Test
    public void parseSimpleIFWithBlockAndExprInIf() throws RecognitionException {
        HaxeTree tree = parseStatement("if(a==b){ doSmth(); }");
        assertTrue(tree instanceof IfNode);
    }
    
    @Test
    public void parseSimpleIfWithoutBlockAndExprAfter() throws RecognitionException {
        HaxeTree tree = parseStatement("if(true) doSmth(); doSmth2();");
        assertTrue(tree.getChild(1).getChildCount() == 1);
    }
    
    @Test
    public void parseIfWithoutBlocksWithElse() throws RecognitionException {
        HaxeTree tree = parseStatement("if(a==b) doSmth() else doSmth();");
        assertTrue(tree instanceof IfNode);
    }
    
    @Test
    public void parseAssignExprAQuickIfExpr() throws RecognitionException {
        HaxeTree tree = parseStatement("a = (a==b)? doSmth() : doSmth();");
        assertTrue(tree.getChild(1) instanceof IfNode);
    }
    
    @Test
    public void parseIfWithoutBlocksAndWithSimpleIfInElseBranch() throws RecognitionException {
        HaxeTree tree = parseStatement(
                "if(p.x > 0) p.x = 0 else " + 
                    " if(s.x < screen.x) p.x = screen.x - bo.x;");
        assertTrue(tree instanceof IfNode);
        HaxeTree elseNode = ((IfNode)tree).getElseBlock();
        assertTrue(elseNode instanceof IfNode);
    }
    
    @Test
    public void parseSimpleIfWithAssignNewClassExpr() throws RecognitionException {
        HaxeTree tree = parseStatement("if (_instance == null) _instance = new DataManager();");
        assertTrue(tree instanceof IfNode);
        assertTrue(((IfNode)tree).getIfBlock() instanceof Assignment);
    }
    
    @Test
    public void parseSimpleIfWithAssignNewClassExprWithParams() throws RecognitionException {
        HaxeTree tree = parseStatement("if(style.up!=null) s9gUp = S9G(style.up, style.rect);");
        assertTrue(tree instanceof IfNode);
        HaxeTree ifBlock = ((IfNode)tree).getIfBlock();
        assertTrue(ifBlock instanceof Assignment);
        assertTrue(((Assignment)ifBlock).getRightOperand().getChildCount() == 3);
    }
    
    @Test
    public void parseDeepEmbendedIfsWithElse() throws RecognitionException {
        HaxeTree tree = parseStatement(
                "if(rolled&&pressed) changeDown() else if(!rolled&&!pressed) changeUp() else changeOver();");
        assertTrue(tree instanceof IfNode);
        HaxeTree ifBlock = ((IfNode)tree).getElseBlock();
        assertTrue(((IfNode)ifBlock).getElseBlock() instanceof MethodCall);
    }
}
