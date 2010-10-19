/*******************************************************************************
 * Copyright (c) 2009 Anatoly Kondratyev (anatoly.kondratyev@googlemail.com)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU General Public License, version 2
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-2.0.html
 *
 * Contributors:
 *    Anatoly Kondratyev (anatoly.kondratyev@googlemail.com)
 *******************************************************************************/
package test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import haxe.imp.parser.antlr.main.TinyHaxeTry1Lexer;
import haxe.imp.parser.antlr.main.TinyHaxeTry1Parser;
import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.tree.ExtendedTreeAdaptor;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclaration;

import java.io.IOException;

import junit.framework.Assert;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class testGOTODefinition.
 * 
 * @author Anatoly Kondratyev
 */
public class testGOTODefinition {

	/**
	 * Sets the up before class.
	 * 
	 * @throws Exception
	 *             the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Test get declaration node.
	 */
	@SuppressWarnings("deprecation")
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
		ExtendedCommonTree iDecl = tree.getNodeByPosition(12, 23)
				.getDeclarationNode(tree.getNodeByPosition(12, 23));
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

	/**
	 * Test get function declaration node.
	 */
	@SuppressWarnings("deprecation")
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
		ExtendedCommonTree iDecl = tree.getNodeByPosition(9, 2)
				.getDeclarationNode(tree.getNodeByPosition(9, 2));
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

	/**
	 * Test get class declaration node.
	 */
	@SuppressWarnings("deprecation")
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

		ExtendedCommonTree iDecl = tree.getNodeByPosition(9, 2)
				.getDeclarationNode(tree.getNodeByPosition(9, 2));
		System.out.println(iDecl);
		assertEquals(3, iDecl.getLine());
		assertEquals(0, iDecl.getCharPositionInLine());
		assertEquals("Main", iDecl.getChild(0).getText());
		assertEquals(ClassNode.class, iDecl.getClass());
	}

	/**
	 * Creates the parser lexer for file.
	 * 
	 * @param path
	 *            the path
	 * @return the tiny haxe try1 parser
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

	/**
	 * Prints the tree.
	 * 
	 * @param t
	 *            the t
	 */
	private static void printTree(ExtendedCommonTree t) {
		System.out.println();
		System.out.println("                    Tree: " + t.toString());
		printTree(t, 0);
	}

	/**
	 * Prints the tree.
	 * 
	 * @param t
	 *            the t
	 * @param indent
	 *            the indent
	 */
	private static void printTree(ExtendedCommonTree t, int indent) {
		if (t != null) {
			StringBuffer sb = new StringBuffer(indent);
			for (int i = 0; i < indent; i++)
				sb = sb.append("   ");
			for (int i = 0; i < t.getChildCount(); i++) {
				System.out.println(sb.toString() + t.getChild(i).toString()
						+ t.getChild(i).getText());
				printTree(t.getChild(i), indent + 1);
			}
		}
	}

}
