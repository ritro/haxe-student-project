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
package haxe.imp.parser.antlr.tree.specific;

import haxe.imp.parser.antlr.tree.HaxeTree;

import org.antlr.runtime.Token;

/**
 * The Class DoWhileNode.
 * 
 * @author Anatoly Kondratyev
 */
public class DoWhileNode extends HaxeTree {

	/**
	 * Instantiates a new do while node.
	 */
	public DoWhileNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new do while node.
	 * 
	 * @param node
	 *            the node
	 */
	public DoWhileNode(final HaxeTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new do while node.
	 * 
	 * @param t
	 *            the t
	 */
	public DoWhileNode(final Token t) {
		super(t);
		// TODO Auto-generated constructor stub
	}
}