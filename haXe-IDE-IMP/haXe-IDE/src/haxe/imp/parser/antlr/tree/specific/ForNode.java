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
 * The Class ForNode.
 * 
 * @author Anatoly Kondratyev
 */
public class ForNode extends HaxeTree {

	/**
	 * Instantiates a new for node.
	 */
	public ForNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new for node.
	 * 
	 * @param node
	 *            the node
	 */
	public ForNode(final HaxeTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new for node.
	 * 
	 * @param t
	 *            the t
	 */
	public ForNode(final Token t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

}
