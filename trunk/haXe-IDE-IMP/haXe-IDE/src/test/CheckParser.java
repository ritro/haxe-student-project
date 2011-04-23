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

import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.HaxeTree;

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

	public static HaxeTree parseFunctionFile(final String filename) throws RecognitionException {
		HaxeParser parser = createHaxeParser(pathToTests + filename);
		HaxeParser.funcDecl_return parserResult = parser.funcDecl();
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		return (HaxeTree) parserResult.getTree();
	}
	
	@Test
	public void testAssignment() throws RecognitionException{
		parseClass("testSimpleAssignmentGlobal.hx");
		parseClass("testSimpleAssignmentLocal.hx");
		parseClass("testSimpleAssignmentLocal2.hx");
	}
	
	@Test
	public void checkInvalidAssigment() {
		HaxeParser parser = createHaxeParser(pathToTests + "checkAssigments.hx");
		assertEquals(7, parser.getNumberOfSyntaxErrors());
	}
	
	@Test
	public void testFunction() throws RecognitionException {
		assertTreeSize(2, parseFunctionFile("testFunction01"));
		assertTreeSize(4, parseFunctionFile("testFunction02"));
		assertTreeSize(5, parseFunctionFile("testFunction03"));
		assertTreeSize(4, parseFunctionFile("testFunction04"));
	}

	public static HaxeTree parseClass(final String filename) throws RecognitionException {
		HaxeParser parser = createHaxeParser(pathToTests + filename);
		HaxeParser.classDecl_return parserResult = parser.classDecl();
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		return (HaxeTree) parserResult.getTree();
	}
	
	@Test
	public void testClass() throws RecognitionException {
		assertTreeSize(1, parseClass("testClass01"));
		assertTreeSize(2, parseClass("testClass02"));
	}

	public static HaxeTree parseStatement(final String filename) throws RecognitionException {
		HaxeParser parser = createHaxeParser(pathToTests + filename);
		HaxeParser.statement_return parserResult = parser.statement();
		assertEquals(0, parser.getNumberOfSyntaxErrors());
		return (HaxeTree) parserResult.getTree();
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
		parseStatement("testWhile01").printTree();
		assertTreeSize(2, parseStatement("testWhile01"));
		assertTreeSize(2, parseStatement("testWhile02"));
	}

	@Test
	public void testSwitchStatement() throws RecognitionException {
		assertTreeSize(5, parseStatement("testSwitch01"));
	}
	
}