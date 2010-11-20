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

import haxe.imp.parser.antlr.main.TinyHaxeTry1Parser;
import haxe.imp.parser.antlr.tree.ExtendedCommonTree;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import static test.TestHelper.parseHaxeFile;
import static test.TestHelper.createHaxeParser;
import static test.TestHelper.assertTreeSize;
import static test.TestHelper.pathToTests;

/**
 * Parser tests
 * 
 * @author Anatoly Kondratyev
 */
public class CheckParser {
	@Test
	public void testModules() throws RecognitionException {
		assertTreeSize(3, parseHaxeFile("testModule.hx"));
		assertTreeSize(2, parseHaxeFile("testModule2.hx"));
	}

	public static ExtendedCommonTree parseFunction(final String filename) throws RecognitionException {
		TinyHaxeTry1Parser parser = createHaxeParser(pathToTests + filename);
		TinyHaxeTry1Parser.funcDecl_return parserResult = parser.funcDecl();
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		return (ExtendedCommonTree) parserResult.getTree();
	}
	
	@Test
	public void testFunction() throws RecognitionException {
		assertTreeSize(2, parseFunction("testFunction01"));
		assertTreeSize(4, parseFunction("testFunction02"));
		assertTreeSize(5, parseFunction("testFunction03"));
		assertTreeSize(4, parseFunction("testFunction04"));
	}

	public static ExtendedCommonTree parseClass(final String filename) throws RecognitionException {
		TinyHaxeTry1Parser parser = createHaxeParser(pathToTests + filename);
		TinyHaxeTry1Parser.classDecl_return parserResult = parser.classDecl();
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		return (ExtendedCommonTree) parserResult.getTree();
	}
	
	@Test
	public void testClass() throws RecognitionException {
		assertTreeSize(2, parseClass("testClass01"));
		assertTreeSize(3, parseClass("testClass02"));
	}

	public static ExtendedCommonTree parseStatement(final String filename) throws RecognitionException {
		TinyHaxeTry1Parser parser = createHaxeParser(pathToTests + filename);
		TinyHaxeTry1Parser.statement_return parserResult = parser.statement();
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		return (ExtendedCommonTree) parserResult.getTree();
	}
	
	@Test
	public void testIfStatement() throws RecognitionException {
		assertTreeSize(2, parseStatement("testIf01"));
		assertTreeSize(3, parseStatement("testIf02"));
		assertTreeSize(3, parseStatement("testIf03"));
	}

	@Test
	public void testForStatement() throws RecognitionException {
		assertTreeSize(2, parseStatement("testFor01"));
		assertTreeSize(2, parseStatement("testFor02"));
	}

	@Test
	public void testWhileStatement() throws RecognitionException {
		assertTreeSize(2, parseStatement("testWhile01"));
		assertTreeSize(2, parseStatement("testWhile02"));
	}

	@Test
	public void testSwitchStatement() throws RecognitionException {
		assertTreeSize(5, parseStatement("testSwitch01"));
	}
	
}
