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

import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.utils.HaxeType;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

// TODO: Auto-generated Javadoc
/**
 * The Class VarDeclaration.
 * 
 * @author Anatoly Kondratyev
 */
public class VarDeclaration extends ExtendedCommonTree {
	private String nameWithType = "";

	public String getNameWithType() {
		if (nameWithType.equals("")) {
			nameWithType = this.getVarName() + " : "
					+ this.getVarType().getTypeName();
		}
		return nameWithType;
	}

	/**
	 * Instantiates a new var declaration.
	 */
	public VarDeclaration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var declaration.
	 * 
	 * @param node
	 *            the node
	 */
	public VarDeclaration(CommonTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var declaration.
	 * 
	 * @param t
	 *            the t
	 */
	public VarDeclaration(Token t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var declaration.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param type
	 *            the type
	 * @param auxiliary
	 *            the auxiliary
	 */
	public VarDeclaration(int ttype, String type, boolean auxiliary) {
		super(ttype, type, auxiliary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var declaration.
	 * 
	 * @param ttype
	 *            the ttype
	 */
	public VarDeclaration(int ttype) {
		super(ttype);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var declaration.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param token
	 *            the token
	 */
	public VarDeclaration(int ttype, Token token) {
		this.token = token;
	}

	/**
	 * Instantiates a new var declaration.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param token
	 *            the token
	 * @param auxiliary
	 *            the auxiliary
	 */
	public VarDeclaration(int ttype, Token token, boolean auxiliary) {
		this.token = token;
		this.setAuxiliary(auxiliary);
	}

	/**
	 * Returns node correspond for var name (in var tmp:Int = foo+bar; it will
	 * return node for "tmp").
	 * 
	 * @return the var name node
	 */
	public VarUsage getVarNameNode() {
		for (ExtendedCommonTree child : this.getChildren()) {
			if (child instanceof VarUsage) {
				return (VarUsage) child;
			}
		}
		System.out.println("No var name in var declaration");
		return (VarUsage) this.getChild(0);
	}

	/**
	 * Returns node correspond for var name (in var tmp:Int = foo+bar; it will
	 * return "tmp").
	 * 
	 * @return the var name
	 */
	public String getVarName() {
		return this.getVarNameNode().getText();
	}

	/**
	 * Gets the var type.
	 * 
	 * @return the var type
	 */
	public HaxeType getVarType() {
		for (ExtendedCommonTree tree : (ArrayList<ExtendedCommonTree>) this
				.getChildren()) {
			Token token = (CommonToken) tree.getToken();
			if (token.getType() == TYPE_TAG_TYPE) {
				/**
				 * FIXME Нужно находить название этого класса в объявлениях,
				 * если он не примитивный, и возвращать его копию.
				 */
				// if
				// (HaxeType.primaryTypes.contains(tree.getChild(0).getText())){
				// return HaxeType
				// }
				return new HaxeType(tree.getChild(0).getText());
			}
		}
		return HaxeType.haxeUndefined;
	}

	/**
	 * Gets the vA r_ ini t_ node.
	 * 
	 * @return the vA r_ ini t_ node
	 */
	public ExtendedCommonTree getVAR_INIT_NODE() {
		for (ExtendedCommonTree tree : (ArrayList<ExtendedCommonTree>) this
				.getChildren()) {
			Token token = (CommonToken) tree.getToken();
			if (token.getType() == VAR_INIT_TYPE) {
				return tree;
			}
		}
		return null;
	}
}
