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
import haxe.imp.parser.antlr.utils.HaxeType;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * The Class VarUsage.
 * 
 * @author kondratyev
 */
public class VarUsage extends HaxeTree {

	/** The var type. */
	private HaxeType haxeType = HaxeType.haxeNotYetRecognized;

	/**
	 * Sets the var type.
	 * 
	 * @param varType
	 *            the varType to set
	 */
	public void setHaxeType(final HaxeType varType) {
		this.haxeType = varType;
	}

	/**
	 * Gets the var type.
	 * 
	 * @return the varType
	 */
	public HaxeType getHaxeType() {
		return this.haxeType;
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
	public VarUsage(final CommonTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param t
	 *            the t
	 */
	public VarUsage(final Token t) {
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
	public VarUsage(final int ttype, final Token t, final String varType) {
		this.token = t;
		if (varType.equals("INT")) {
			this.setHaxeType(HaxeType.haxeInt);
		} else if (varType.equals("FLOAT")) {
			this.setHaxeType(HaxeType.haxeFloat);
		} else if (varType.equals("STRING")) {
			this.setHaxeType(HaxeType.haxeString);
		} else if (varType.equals("VOID")) {
			this.setHaxeType(HaxeType.haxeVoid);
		} else if (varType.equals("BOOL")) {
			this.setHaxeType(HaxeType.haxeBool);
		} else if (varType.equals("DYNAMIC")) {
			this.setHaxeType(HaxeType.haxeDynamic);
		} else {
			this.setHaxeType(HaxeType.haxeUndefined);
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
	public VarUsage(final int ttype, final Token t, final boolean auxiliary) {
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
	public VarUsage(final int ttype, final String type, final boolean auxiliary) {
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
	public VarUsage(final int ttype, final boolean auxiliary) {
		super(ttype, auxiliary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param ttype
	 *            the ttype
	 */
	public VarUsage(final int ttype) {
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
	public VarUsage(final int ttype, final Token t) {
		this.token = new CommonToken(ttype);
	}

	/**
	 * Gets the clone.
	 * 
	 * @return the clone
	 */
	public VarUsage getClone() {
		VarUsage varUsage = new VarUsage(this.getToken());
		varUsage.setHaxeType(this.getHaxeType());
		return varUsage;
	}

	/**
	 * Gets the text with type.
	 * 
	 * @return the text with type
	 */
	public String getTextWithType() {
		if (this.getParent() instanceof FunctionNode) {
			return ((FunctionNode) this.getParent())
					.getFullNameWithParameters();
		}
		return this.getText() + " : " + this.getHaxeType().getTypeName();
	}

}
