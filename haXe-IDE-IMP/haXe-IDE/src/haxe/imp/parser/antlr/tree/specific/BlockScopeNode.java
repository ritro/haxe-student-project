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

import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.utils.HaxeType;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * Blocks can execute several expressions.
 * @author kondratyev
 */
public class BlockScopeNode extends HaxeTree {

	/**
	 * Each BlockScope contains Nodes representing vars, that could be used in
	 * current scope.
	 */
	private ArrayList<VarUsage> declaredVars = new ArrayList<VarUsage>();

	/** The l bracket position. */
	private int lBracketPosition;

	/** The r bracket position. */
	private int rBracketPosition;

	/**
	 * Gets the declared vars.
	 * 
	 * @return the declaredVars
	 */
	public ArrayList<VarUsage> getDeclaredVars() {
		return this.declaredVars;
	}

	/**
	 * Sets the declared vars.
	 * 
	 * @param declaredVars
	 *            the declaredVars to set
	 */
	public void setDeclaredVars(final ArrayList<VarUsage> declaredVars) {
		this.declaredVars = declaredVars;
	}

	/**
	 * Gets the l bracket position.
	 * 
	 * @return the l bracket position
	 */
	public int getlBracketPosition() {
		return this.lBracketPosition;
	}

	/**
	 * Gets the r bracket position.
	 * 
	 * @return the r bracket position
	 */
	public int getrBracketPosition() {
		if (this.getChildCount() > 0) {
			//return this.rBracketPosition;
			HaxeTree lastchild = getChildren().get(getChildCount()-1);
			if (lastchild.getType() == HaxeParser.RBRACE) {
				return lastchild.getToken().getStopIndex();
			} else {
				// no right brace - return something
				return lastchild.getMostRightPosition();
			}
		} else {
			return this.lBracketPosition;
		}
	}

	/**
	 * Sets the r bracket position.
	 * 
	 * @param rBracketPosition
	 *            the new r bracket position
	 */
	public void setrBracketPosition(final int rBracketPosition) {
		this.rBracketPosition = rBracketPosition;
	}
	
	@Override
	public int getMostLeftPosition() {
		return this.getlBracketPosition();
	}
	
	@Override
	public int getMostRightPosition() {
		return this.getrBracketPosition();
	}
	
	/**
	 * A block evaluates to the TYPE of the last expression of the block.
	 * As an exception, the empty block { } evaluates to Void.
	 */
	@Override
	public HaxeType getHaxeType(){
		return (this.getChildCount()>0)? 
				this.getChild(this.getChildCount()-1).getHaxeType() :
					HaxeType.haxeVoid;
	}
	
	/*
	 * A block evaluates to the VALUE of the last expression of the block
	 
	@Override
	public HaxeTree getValue(){
		return this.getChild(this.getChildCount()-1);
	}*/

	public BlockScopeNode() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new block scope node.
	 * 
	 * @param node
	 *            the node
	 */
	public BlockScopeNode(final CommonTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new block scope node.
	 * 
	 * @param t
	 *            the t
	 */
	public BlockScopeNode(final Token t) {
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
	public BlockScopeNode(final int ttype, final Token t,
			final boolean auxiliary) {
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
	public BlockScopeNode(final int ttype, final String type,
			final boolean auxiliary) {
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
	public BlockScopeNode(final int ttype, final boolean auxiliary) {
		super(ttype, auxiliary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new block scope node.
	 * 
	 * @param ttype
	 *            the ttype
	 */
	public BlockScopeNode(final int ttype) {
		super(ttype);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new block scope node.
	 * 
	 * @param blockScope
	 *            the block scope
	 * @param string
	 *            the string
	 * @param b
	 *            the b
	 * @param lBracket
	 *            the l bracket
	 */
	public BlockScopeNode(final int blockScope, final String string,
			final boolean b, final Token lBracket) {
		super(blockScope, string, b);
		this.lBracketPosition = ((CommonToken) lBracket).getStartIndex();
	}

	/**
	 * Checks if there is var with such name in current scope.
	 * 
	 * @param varName
	 *            the var name
	 * @return true, if successful
	 */
	public boolean doScopeContainsVarName(final String varName) {
		for (HaxeTree usage : this.declaredVars) {
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
	public HaxeType getVarInScopeType(final String varName) {
		for (HaxeTree usage : this.declaredVars) {
			if (usage.getText().equals(varName)) {
				return ((VarUsage) usage).getHaxeType();
			}
		}
		return HaxeType.haxeUndefined;
	}
}
