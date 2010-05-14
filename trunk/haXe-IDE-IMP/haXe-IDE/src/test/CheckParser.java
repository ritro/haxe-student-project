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

import java.io.IOException;

import junit.framework.Assert;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class CheckParser.
 * 
 * @author Anatoly Kondratyev
 */
public class CheckParser {

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
	 * Test module.
	 */
	@Test
	public void testModule() {
		String path = "./src/test/testModule.txt";
		TinyHaxeTry1Parser parser = createParserLexerForFile(path);
		ExtendedCommonTree tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.module_return parserResult = parser.module();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on EmptyModuleRecognition");
		}
		printTree(tree);
		assertEquals(3, (tree).getChildren().size());
	}

	/**
	 * Test module.
	 */
	@Test
	public void testModule2() {
		String path = "./src/test/testModule2";
		TinyHaxeTry1Parser parser = createParserLexerForFile(path);
		ExtendedCommonTree tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.module_return parserResult = parser.module();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on EmptyModuleRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		assertEquals(2, (tree).getChildren().size());
	}

	/**
	 * Test function.
	 */
	@Test
	public void testFunction() {
		String path = "./src/test/testFunction01.txt";
		TinyHaxeTry1Parser parser = createParserLexerForFile(path);
		ExtendedCommonTree tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.funcDecl_return parserResult = parser.funcDecl();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on EmptyModuleRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		assertEquals("For Function01", 2, (tree).getChildren().size());

		path = "./src/test/testFunction02.txt";
		parser = createParserLexerForFile(path);
		try {
			TinyHaxeTry1Parser.funcDecl_return parserResult = parser.funcDecl();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			Assert.fail("Exception on EmptyModuleRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		Assert.assertEquals("For Function02", 4, (tree).getChildren().size());

		path = "./src/test/testFunction03.txt";
		parser = createParserLexerForFile(path);
		try {
			TinyHaxeTry1Parser.funcDecl_return parserResult = parser.funcDecl();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			Assert.fail("Exception on EmptyModuleRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		Assert.assertEquals("For Function03", 5, (tree).getChildren().size());

		path = "./src/test/testFunction04";
		parser = createParserLexerForFile(path);
		try {
			TinyHaxeTry1Parser.funcDecl_return parserResult = parser.funcDecl();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			Assert.fail("Exception on EmptyModuleRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		Assert.assertEquals("For Function04", 4, (tree).getChildren().size());
	}

	/**
	 * Test class.
	 */
	@Test
	public void testClass() {
		String path = "./src/test/testClass01.txt";
		TinyHaxeTry1Parser parser = createParserLexerForFile(path);
		ExtendedCommonTree tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.classDecl_return parserResult = parser
					.classDecl();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on ClassRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		assertEquals("For Class01", 2, (tree).getChildren().size());

		path = "./src/test/testClass02.txt";
		parser = createParserLexerForFile(path);
		tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.classDecl_return parserResult = parser
					.classDecl();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on ClassRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		assertEquals("For Class02", 3, (tree).getChildren().size());
	}

	/**
	 * Test if statement.
	 */
	@Test
	public void testIfStatement() {
		String path = "./src/test/testIf01";
		TinyHaxeTry1Parser parser = createParserLexerForFile(path);
		ExtendedCommonTree tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.statement_return parserResult = parser
					.statement();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on ClassRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		assertEquals("For if01", 2, (tree).getChildren().size());

		path = "./src/test/testIf02";
		parser = createParserLexerForFile(path);
		tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.statement_return parserResult = parser
					.statement();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on ClassRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		assertEquals("For if02", 3, (tree).getChildren().size());

		path = "./src/test/testIf03";
		parser = createParserLexerForFile(path);
		tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.statement_return parserResult = parser
					.statement();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on ClassRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		assertEquals("For if03", 3, (tree).getChildren().size());
	}

	/**
	 * Test for statement.
	 */
	@Test
	public void testForStatement() {
		String path = "./src/test/testFor01";
		TinyHaxeTry1Parser parser = createParserLexerForFile(path);
		ExtendedCommonTree tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.statement_return parserResult = parser
					.statement();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on ClassRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		assertEquals("For For01", 2, (tree).getChildren().size());

		path = "./src/test/testFor02";
		parser = createParserLexerForFile(path);
		tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.statement_return parserResult = parser
					.statement();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on ClassRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		assertEquals("For for02", 2, (tree).getChildren().size());
	}

	/**
	 * Test while statement.
	 */
	@Test
	public void testWhileStatement() {
		String path = "./src/test/testWhile01";
		TinyHaxeTry1Parser parser = createParserLexerForFile(path);
		ExtendedCommonTree tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.statement_return parserResult = parser
					.statement();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on ClassRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		assertEquals("For While01", 2, (tree).getChildren().size());

		path = "./src/test/testWhile02";
		parser = createParserLexerForFile(path);
		tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.statement_return parserResult = parser
					.statement();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on ClassRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		assertEquals("For While02", 2, (tree).getChildren().size());
	}

	/**
	 * Test switch statement.
	 */
	@Test
	public void testSwitchStatement() {
		String path = "./src/test/testSwitch01";
		TinyHaxeTry1Parser parser = createParserLexerForFile(path);
		ExtendedCommonTree tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.statement_return parserResult = parser
					.statement();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on ClassRecognition");
		}
		printTree(tree);
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		assertEquals("For Switch01", 5, (tree).getChildren().size());
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