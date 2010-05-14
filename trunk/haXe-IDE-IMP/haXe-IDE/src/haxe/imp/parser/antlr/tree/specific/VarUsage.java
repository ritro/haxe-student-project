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

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

// TODO: Auto-generated Javadoc
/**
 * The Class VarUsage.
 * 
 * @author kondratyev
 */
public class VarUsage extends ExtendedCommonTree {

	/** The var type. */
	private HaxeType varType = HaxeType.haxeNotYetRecognized;

	/**
	 * Sets the var type.
	 * 
	 * @param varType
	 *            the varType to set
	 */
	public void setVarType(HaxeType varType) {
		this.varType = varType;
	}

	/**
	 * Gets the var type.
	 * 
	 * @return the varType
	 */
	public HaxeType getVarType() {
		return varType;
	}

	/**
	 * Instantiates a new var usage.
	 */
	public VarUsage() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param node
	 *            the node
	 */
	public VarUsage(CommonTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param t
	 *            the t
	 */
	public VarUsage(Token t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param t
	 *            the t
	 * @param varType
	 *            the var type
	 */
	public VarUsage(int ttype, Token t, String varType) {
		// System.out.println(varType);
		this.token = t;
		if (varType.equals("INT")) {
			this.setVarType(HaxeType.haxeInt);
		} else if (varType.equals("FLOAT")) {
			this.setVarType(HaxeType.haxeFloat);
		} else if (varType.equals("STRING")) {
			this.setVarType(HaxeType.haxeString);
		} else if (varType.equals("VOID")) {
			this.setVarType(HaxeType.haxeVoid);
		} else if (varType.equals("BOOL")) {
			this.setVarType(HaxeType.haxeBool);
		} else if (varType.equals("DYNAMIC")) {
			this.setVarType(HaxeType.haxeDynamic);
		} else {
			this.setVarType(HaxeType.haxeUndefined);
		}
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param t
	 *            the t
	 * @param auxiliary
	 *            the auxiliary
	 */
	public VarUsage(int ttype, Token t, boolean auxiliary) {
		super(ttype, t, auxiliary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param type
	 *            the type
	 * @param auxiliary
	 *            the auxiliary
	 */
	public VarUsage(int ttype, String type, boolean auxiliary) {
		super(ttype, type, auxiliary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param auxiliary
	 *            the auxiliary
	 */
	public VarUsage(int ttype, boolean auxiliary) {
		super(ttype, auxiliary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param ttype
	 *            the ttype
	 */
	public VarUsage(int ttype) {
		super(ttype);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param t
	 *            the t
	 */
	public VarUsage(int ttype, Token t) {
		this.token = new CommonToken(ttype);
	}

	/**
	 * Gets the clone.
	 * 
	 * @return the clone
	 */
	public VarUsage getClone() {
		VarUsage varUsage = new VarUsage(this.getToken());
		varUsage.setVarType(this.getVarType());
		return varUsage;
	}

}
