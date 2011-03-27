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

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * The Class AssignOperationNode.
 * 
 * @author kondratyev
 */
public class AssignOperationNode extends HaxeTree {

	/**
	 * Instantiates a new assign operation node.
	 */
	public AssignOperationNode() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new assign operation node.
	 * 
	 * @param node
	 *            the node
	 */
	public AssignOperationNode(final CommonTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new assign operation node.
	 * 
	 * @param t
	 *            the t
	 */
	public AssignOperationNode(final Token t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new assign operation node.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param t
	 *            the t
	 * @param auxiliary
	 *            the auxiliary
	 */
	public AssignOperationNode(final int ttype, final Token t,
			final boolean auxiliary) {
		super(ttype, t, auxiliary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new assign operation node.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param type
	 *            the type
	 * @param auxiliary
	 *            the auxiliary
	 */
	public AssignOperationNode(final int ttype, final String type,
			final boolean auxiliary) {
		super(ttype, type, auxiliary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new assign operation node.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param type
	 *            the type
	 */
	public AssignOperationNode(final int ttype, final String type) {
		this.token = new CommonToken(ttype, type);
	}

	/**
	 * Instantiates a new assign operation node.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param token
	 *            the token
	 */
	public AssignOperationNode(final int ttype, final Token token) {
		this.token = token;
	}

	/**
	 * Instantiates a new assign operation node.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param auxiliary
	 *            the auxiliary
	 */
	public AssignOperationNode(final int ttype, final boolean auxiliary) {
		super(ttype, auxiliary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new assign operation node.
	 * 
	 * @param ttype
	 *            the ttype
	 */
	public AssignOperationNode(final int ttype) {
		super(ttype);
		// TODO Auto-generated constructor stub
	}

}
