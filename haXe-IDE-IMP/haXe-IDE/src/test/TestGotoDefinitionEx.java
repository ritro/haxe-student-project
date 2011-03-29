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
import static test.TestHelper.parseHaxeFile;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclaration;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

public class TestGotoDefinitionEx {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetDeclarationNode() throws RecognitionException {
		HaxeTree tree = parseHaxeFile("testGOTODef01.hx");
		HaxeTree iDecl = tree.getNodeByPosition(12, 23)
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
	 * @throws RecognitionException 
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testGetFunctionDeclarationNode() throws RecognitionException {
		HaxeTree tree = parseHaxeFile("testGOTODef02.hx");
		HaxeTree iDecl = tree.getNodeByPosition(9, 2)
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
	 * @throws RecognitionException 
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testGetClassDeclarationNode() throws RecognitionException {
		HaxeTree tree = parseHaxeFile("testGOTODef03.hx");

		HaxeTree iDecl = tree.getNodeByPosition(9, 2)
				.getDeclarationNode(tree.getNodeByPosition(9, 2));
		System.out.println(iDecl);
		assertEquals(3, iDecl.getLine());
		assertEquals(0, iDecl.getCharPositionInLine());
		assertEquals("Main", iDecl.getChild(0).getText());
		assertEquals(ClassNode.class, iDecl.getClass());
	}
}
