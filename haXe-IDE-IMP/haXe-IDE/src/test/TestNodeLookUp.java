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

import static test.TestHelper.assertTreeSize;
import static test.TestHelper.parseHaxeFile;
import haxe.imp.parser.antlr.tree.HaxeTree;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

/**
 * The Class TestNodeLookUp.
 * 
 * @author kondratyev
 */
public class TestNodeLookUp {

	/**
	 * Test get node by offset.
	 * TODO: implement test
	 * @throws RecognitionException 
	 */
	@Test
	public void testGetNodeByOffset() throws RecognitionException {
		HaxeTree tree = parseHaxeFile("getNodeByOffset.hx");

		System.out.println("");		
		for (int i = 0; i < 173; i++) {
			System.out.println(i + ") " + tree.getNodeByPosition(i));
		}

		assertTreeSize(1, tree);
	}

}
