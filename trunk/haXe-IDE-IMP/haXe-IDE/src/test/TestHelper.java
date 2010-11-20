package test;

import static junit.framework.Assert.assertEquals;

import java.io.IOException;

import junit.framework.Assert;
import haxe.imp.parser.antlr.main.TinyHaxeTry1Lexer;
import haxe.imp.parser.antlr.main.TinyHaxeTry1Parser;
import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.tree.ExtendedTreeAdaptor;

import org.antlr.runtime.ANTLRFileStream;
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
	public static TinyHaxeTry1Parser createHaxeParser(final String path) {
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
	
	public static ExtendedCommonTree parseHaxeFile(final String filename) throws RecognitionException {
		TinyHaxeTry1Parser parser = createHaxeParser(pathToTests + filename);
		TinyHaxeTry1Parser.module_return parserResult = parser.module();
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		return (ExtendedCommonTree) parserResult.getTree();
	}
	
	public static void assertTreeSize(int size, ExtendedCommonTree tree) {
		assertEquals(size, tree.getChildCount());
		//assertEquals(size, tree.getChildren().size());
	}	
	/**
	 * Prints the tree.
	 * 
	 * @param t
	 *            the t
	 */
	public static void printTree(final ExtendedCommonTree t) {
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
	private static void printTree(final ExtendedCommonTree t, final int indent) {
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
