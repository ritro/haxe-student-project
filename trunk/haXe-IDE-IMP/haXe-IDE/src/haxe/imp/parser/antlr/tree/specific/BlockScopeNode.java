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

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

// TODO: Auto-generated Javadoc
/**
 * The Class BlockScopeNode.
 * 
 * @author kondratyev
 */
public class BlockScopeNode extends ExtendedCommonTree {

	/**
	 * Each BlockScope contains Nodes representing vars, that could be used in
	 * current scope.
	 */
	private ArrayList<VarUsage> declaredVars = new ArrayList<VarUsage>();

	/**
	 * Gets the declared vars clone.
	 * 
	 * @return the declaredVars
	 */

	/*
	 * public ArrayList<VarUsage> getDeclaredVars() { return this.declaredVars;
	 * }
	 */

	@SuppressWarnings("unchecked")
	public ArrayList<VarUsage> getDeclaredVarsClone() {
		return (ArrayList<VarUsage>) this.declaredVars.clone();
	}

	/**
	 * Gets the declared vars.
	 * 
	 * @return the declaredVars
	 */
	public ArrayList<VarUsage> getDeclaredVars() {
		return declaredVars;
	}

	/**
	 * Sets the declared vars.
	 * 
	 * @param declaredVars
	 *            the declaredVars to set
	 */
	public void setDeclaredVars(ArrayList<VarUsage> declaredVars) {
		this.declaredVars = declaredVars;
	}

	/**
	 * Instantiates a new block scope node.
	 */
	public BlockScopeNode() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new block scope node.
	 * 
	 * @param node
	 *            the node
	 */
	public BlockScopeNode(CommonTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new block scope node.
	 * 
	 * @param t
	 *            the t
	 */
	public BlockScopeNode(Token t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new block scope node.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param t
	 *            the t
	 * @param auxiliary
	 *            the auxiliary
	 */
	public BlockScopeNode(int ttype, Token t, boolean auxiliary) {
		super(ttype, t, auxiliary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new block scope node.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param type
	 *            the type
	 * @param auxiliary
	 *            the auxiliary
	 */
	public BlockScopeNode(int ttype, String type, boolean auxiliary) {
		super(ttype, type, auxiliary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new block scope node.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param auxiliary
	 *            the auxiliary
	 */
	public BlockScopeNode(int ttype, boolean auxiliary) {
		super(ttype, auxiliary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new block scope node.
	 * 
	 * @param ttype
	 *            the ttype
	 */
	public BlockScopeNode(int ttype) {
		super(ttype);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Checks if there is var with such name in current scope.
	 * 
	 * @param varName
	 *            the var name
	 * @return true, if successful
	 */
	public boolean doScopeContainsVarName(String varName) {
		for (VarUsage usage : declaredVars) {
			if (usage.getText().equals(varName)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Return type of var as it stores in scope.
	 * 
	 * @param varName
	 *            the var name
	 * @return the var in scope type
	 */
	public HaxeType getVarInScopeType(String varName) {
		for (VarUsage usage : declaredVars) {
			if (usage.getText().equals(varName)) {
				return usage.getVarType();
			}
		}
		return HaxeType.haxeUndefined;
	}

	// @Override
	// public String toString() {
	// /*
	// * String vars = ""; for (VarUsage usage : declaredVars) { vars += "[" +
	// * usage.getVarType() + " " + usage.getText() + "]" + ", "; } return
	// * super.toString() + "(" + this.getLine() + ", " +
	// * this.getCharPositionInLine() + ")" + "(" + vars + ") " +
	// * this.getClass();
	// */
	// return super.toString();
	// }
}
