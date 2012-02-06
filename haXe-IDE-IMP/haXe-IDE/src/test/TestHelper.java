package test;

import static junit.framework.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import junit.framework.Assert;
import haxe.imp.parser.antlr.main.HaxeLexer;
import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.HaxeTreeAdaptor;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public final class TestHelper {
	public final static String pathToTests = "./src/test/resources/";
	
	/**
	 * Creates the parser for file.
	 * 
	 * @param path  
	 * @return parser
	 */
	public static HaxeParser createHaxeParser(final String path) {
		ANTLRFileStream charStream = null;
		try {
			charStream = new ANTLRFileStream(path);
		} catch (IOException e1) {
			e1.printStackTrace();
			Assert.fail("Exception on reading file");
		}
		HaxeLexer lexer = new HaxeLexer(charStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		HaxeParser parser = new HaxeParser(tokenStream);
		parser.setTreeAdaptor(new HaxeTreeAdaptor());
		return parser;
	}	

	public static HaxeTree parseHaxeFile(final String filename) throws RecognitionException {
		HaxeParser parser = createHaxeParser(pathToTests + filename);
		HaxeParser.module_return parserResult = parser.module();
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		return (HaxeTree) parserResult.getTree();
	}

	public static HaxeParser createHaxeParser(final InputStream input) throws RecognitionException {
		ANTLRInputStream charStream = null;
		try {
			charStream = new ANTLRInputStream(input);
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail("Exception on reading input");
		}		
		HaxeLexer lexer = new HaxeLexer(charStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		HaxeParser parser = new HaxeParser(tokenStream);
		parser.setTreeAdaptor(new HaxeTreeAdaptor());
		return parser;
	}
	
	public static HaxeTree parseFunction(final String text) throws RecognitionException {
		InputStream is = null;
		try {
			is = new ByteArrayInputStream(text.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			Assert.fail("UnsupportedEncodingException");
		} 
		HaxeParser parser = createHaxeParser(is);
		HaxeParser.funcDecl_return parserResult = parser.funcDecl();
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		Assert.assertNotNull(parserResult.getTree());
		return (HaxeTree) parserResult.getTree();
	}

	public static HaxeTree parseExpression(final String text) throws RecognitionException {
		InputStream is = null;
		try {
			is = new ByteArrayInputStream(text.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			Assert.fail("UnsupportedEncodingException");
		} 
		HaxeParser parser = createHaxeParser(is);
		HaxeParser.expr_return parserResult = parser.expr();
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		Assert.assertNotNull(parserResult.getTree());
		return (HaxeTree) parserResult.getTree();
	}

	public static HaxeTree parseStatement(final String text) throws RecognitionException {
		InputStream is = null;
		try {
			is = new ByteArrayInputStream(text.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			Assert.fail("UnsupportedEncodingException");
		} 
		HaxeParser parser = createHaxeParser(is);
		HaxeParser.statement_return parserResult = parser.statement();
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		Assert.assertNotNull(parserResult.getTree());
		return (HaxeTree) parserResult.getTree();
	}

	public static HaxeTree parseModule(final String text) throws RecognitionException {
		InputStream is = null;
		try {
			is = new ByteArrayInputStream(text.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			Assert.fail("UnsupportedEncodingException");
		} 
		HaxeParser parser = createHaxeParser(is);
		HaxeParser.module_return parserResult = parser.module();
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		Assert.assertNotNull(parserResult.getTree());
		return (HaxeTree) parserResult.getTree();
	}
	
	public static void assertTreeSize(int size, HaxeTree tree) {
		assertEquals(size, tree.getChildCount());
	}	
	/**
	 * Prints the tree.
	 * 
	 * @param t
	 *            the t
	 */
	public static void printTree(final HaxeTree t) {
		System.out.println();
		System.out.println("                    Tree: " + t.toString());
		printTree(t, 0);

	}

	/**
	 * Prints the tree.
	 * 
	 * @param t       tree
	 * @param indent  indentation
	 */
	private static void printTree(final HaxeTree t, final int indent) {
		if (t != null) {
			StringBuffer sb = new StringBuffer(indent);
			for (int i = 0; i < indent; i++) {
				sb = sb.append("   ");
			}
			for (int i = 0; i < t.getChildCount(); i++) {
				System.out.println(sb.toString() + t.getChild(i).toString()
						+ t.getChild(i).getText());
				printTree(t.getChild(i), indent + 1);
			}
		}
	}
}
