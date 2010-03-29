package test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

import java.io.IOException;

import junit.framework.Assert;
import main.main.TinyHaxeTry1Lexer;
import main.main.TinyHaxeTry1Parser;
import main.tree.ExtendedCommonTree;
import main.tree.ExtendedTreeAdaptor;
import main.tree.specific.ClassNode;
import main.tree.specific.FunctionNode;
import main.tree.specific.VarDeclaration;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.BeforeClass;
import org.junit.Test;

public class testGOTODefinition {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void testGetDeclarationNode() {
        String path = "./src/test/testGOTODef01";
        TinyHaxeTry1Parser parser = createParserLexerForFile(path);
        ExtendedCommonTree tree = new ExtendedCommonTree();
        try {
            TinyHaxeTry1Parser.module_return parserResult = parser.module();
            tree = (ExtendedCommonTree) parserResult.getTree();
        } catch (RecognitionException e) {
            e.printStackTrace();
            fail("Exception on ClassRecognition");
        }
        printTree(tree);
        assertEquals(0, parser.getNumberOfSyntaxErrors());
        ExtendedCommonTree iDecl = tree.getNodeByPosition(12, 23).getDeclarationNode(
                tree.getNodeByPosition(12, 23));
        assertEquals(11, iDecl.getLine());
        assertEquals(2, iDecl.getCharPositionInLine());
        assertEquals("i", iDecl.getChild(0).getText());
        assertEquals(VarDeclaration.class, iDecl.getClass());

        iDecl = tree.getNodeByPosition(11, 14).getDeclarationNode(
                tree.getNodeByPosition(11, 14));
        assertEquals(9, iDecl.getLine());
        assertEquals(29, iDecl.getCharPositionInLine());
        assertEquals("tmp", iDecl.getChild(0).getText());
        assertEquals(VarDeclaration.class, iDecl.getClass());

        iDecl = tree.getNodeByPosition(13, 2).getDeclarationNode(
                tree.getNodeByPosition(13, 2));
        assertEquals(7, iDecl.getLine());
        assertEquals(1, iDecl.getCharPositionInLine());
        assertEquals("foo", iDecl.getChild(0).getText());
        assertEquals(VarDeclaration.class, iDecl.getClass());

        iDecl = tree.getNodeByPosition(14, 2).getDeclarationNode(
                tree.getNodeByPosition(14, 2));
        assertEquals(17, iDecl.getLine());
        assertEquals(1, iDecl.getCharPositionInLine());
        assertEquals("bar", iDecl.getChild(0).getText());
        assertEquals(VarDeclaration.class, iDecl.getClass());
    }

    @Test
    public void testGetFunctionDeclarationNode() {
        String path = "./src/test/testGOTODef02";
        TinyHaxeTry1Parser parser = createParserLexerForFile(path);
        ExtendedCommonTree tree = new ExtendedCommonTree();
        try {
            TinyHaxeTry1Parser.module_return parserResult = parser.module();
            tree = (ExtendedCommonTree) parserResult.getTree();
        } catch (RecognitionException e) {
            e.printStackTrace();
            fail("Exception on ClassRecognition");
        }
        printTree(tree);
        assertEquals(0, parser.getNumberOfSyntaxErrors());
        ExtendedCommonTree iDecl = tree.getNodeByPosition(9, 2).getDeclarationNode(
                tree.getNodeByPosition(9, 2));
        assertEquals(12, iDecl.getLine());
        assertEquals(1, iDecl.getCharPositionInLine());
        assertEquals("tmpFunct", iDecl.getChild(0).getText());
        assertEquals(FunctionNode.class, iDecl.getClass());

        iDecl = tree.getNodeByPosition(14, 2).getDeclarationNode(
                tree.getNodeByPosition(14, 2));
        System.out.println(iDecl);
        assertEquals(12, iDecl.getLine());
        assertEquals(1, iDecl.getCharPositionInLine());
        assertEquals("tmpFunct", iDecl.getChild(0).getText());
        assertEquals(FunctionNode.class, iDecl.getClass());
    }

    @Test
    public void testGetClassDeclarationNode() {
        String path = "./src/test/testGOTODef03";
        TinyHaxeTry1Parser parser = createParserLexerForFile(path);
        ExtendedCommonTree tree = new ExtendedCommonTree();
        try {
            TinyHaxeTry1Parser.module_return parserResult = parser.module();
            tree = (ExtendedCommonTree) parserResult.getTree();
        } catch (RecognitionException e) {
            e.printStackTrace();
            fail("Exception on ClassRecognition");
        }
        printTree(tree);
        assertEquals(0, parser.getNumberOfSyntaxErrors());

        ExtendedCommonTree iDecl = tree.getNodeByPosition(9, 2).getDeclarationNode(
                tree.getNodeByPosition(9, 2));
        System.out.println(iDecl);
        assertEquals(3, iDecl.getLine());
        assertEquals(0, iDecl.getCharPositionInLine());
        assertEquals("Main", iDecl.getChild(0).getText());
        assertEquals(ClassNode.class, iDecl.getClass());
    }

    /**
     * @param path
     * @return
     */
    private TinyHaxeTry1Parser createParserLexerForFile(String path) {
        ANTLRFileStream charStream = null;
        try {
            charStream = new ANTLRFileStream(path);
        } catch (IOException e1) {
            e1.printStackTrace();
            Assert.fail("Exception on reading file");
        }
        TinyHaxeTry1Lexer lexer = new TinyHaxeTry1Lexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        TinyHaxeTry1Parser parser = new TinyHaxeTry1Parser(tokenStream);
        parser.setTreeAdaptor(new ExtendedTreeAdaptor());
        return parser;
    }

    private static void printTree(ExtendedCommonTree t) {
        System.out.println();
        System.out.println("                    Tree: " + t.toString());
        printTree(t, 0);
    }

    private static void printTree(ExtendedCommonTree t, int indent) {
        if (t != null) {
            StringBuffer sb = new StringBuffer(indent);
            for (int i = 0; i < indent; i++)
                sb = sb.append("   ");
            for (int i = 0; i < t.getChildCount(); i++) {
                System.out.println(sb.toString() + t.getChild(i).toString()
                        + t.getChild(i).getText());
                printTree((ExtendedCommonTree) t.getChild(i), indent + 1);
            }
        }
    }

}
