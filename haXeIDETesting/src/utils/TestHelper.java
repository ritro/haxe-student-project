package utils;

import static junit.framework.Assert.assertEquals;

import imp.parser.antlr.HaxeLexer;
import imp.parser.antlr.HaxeParser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import junit.framework.Assert;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import tree.Function;
import tree.HaxeTree;
import tree.HaxeTreeAdaptor;
import tree.expression.Assignment;
import tree.expression.Binary;

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
	 * Finds function with specified name inside the AST which have 
	 * MODULE type - that means it is a result of parsing the text
	 * with usual for haXe files structure.
	 * @param name of the function
	 * @param moduleAst to search in
	 * @return found FunctionNode or null
	 */
	public static Function getFunctionByName(String name, HaxeTree moduleAst)
	{
	    for (HaxeTree i : moduleAst.getChildren())
        {
            if (i instanceof Function && i.getText().equals(name))
            {
                return (Function)i;
            }
            else if (i.getChildCount() > 0)
            {
                Function result = getFunctionByName(name, i);
                if (result != null)
                {
                    return result;
                }
            }
        }
        
        return null;
	}
	
    /**
     * Will return the first occurence (and the most top) of an 
     * binary expr in the Tree and
     * it's children, so be sure to give this function the AST with
     * binary expr you need going first.
     * @param tree to search in
     * @return binary expr node or null
     */
    public static Binary getBinaryExpression(HaxeTree tree)
    {
        for (HaxeTree i : tree.getChildren())
        {
            if (i instanceof Binary)
            {
                return (Binary)i;
            }
            else if (i.getChildCount() > 0)
            {
                Binary result = getBinaryExpression(i);
                if (result != null)
                {
                    return result;
                }
            }
        }
        
        return null;
    }    

    /**
     * Will return the first occurence of an assignment in the Tree and
     * it's children, so be sure to give this function the AST with
     * assignment you need going first.
     * @param tree to search in
     * @return assignment node or null
     */
    public static Assignment getAssignment(HaxeTree tree)
    {
        for (HaxeTree i : tree.getChildren())
        {
            if (i instanceof Assignment)
            {
                return (Assignment)i;
            }
            else if (i.getChildCount() > 0)
            {
                Assignment result = getAssignment(i);
                if (result != null)
                {
                    return result;
                }
            }
        }
        
        return null;
    }
}
