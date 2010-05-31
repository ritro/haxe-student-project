/**
 * 
 */
package test;

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
import org.junit.Test;

/**
 * @author kondratyev
 * 
 */
public class TestNodeLookUp {

	@Test
	public void testGetNodeByOffset() {
		String path = "./src/test/getNodeByOffset";
		TinyHaxeTry1Parser parser = this.createParserLexerForFile(path);
		ExtendedCommonTree tree = new ExtendedCommonTree();
		try {
			TinyHaxeTry1Parser.module_return parserResult = parser.module();
			tree = (ExtendedCommonTree) parserResult.getTree();
		} catch (RecognitionException e) {
			e.printStackTrace();
			fail("Exception on Recognition");
		}
		printTree(tree);
		System.out.println("");
		for (int i = 122; i < 173; i++) {
			System.out.println(i + ") " + tree.getNodeByPosition(i));
		}
		// assertEquals(0, parser.getNumberOfSyntaxErrors());
		// assertEquals("For Switch01", 5, (tree).getChildren().size());
	}

	/**
	 * Creates the parser lexer for file.
	 * 
	 * @param path
	 *            the path
	 * @return the tiny haxe try1 parser
	 */
	private TinyHaxeTry1Parser createParserLexerForFile(final String path) {
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
	private static void printTree(final ExtendedCommonTree t) {
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
	private static void printTree(final ExtendedCommonTree t, final int indent) {
		if (t != null) {
			StringBuffer sb = new StringBuffer(indent);
			for (int i = 0; i < indent; i++) {
				sb = sb.append("   ");
			}
			for (int i = 0; i < t.getChildCount(); i++) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				printTree(t.getChild(i), indent + 1);
			}
		}
	}

}
