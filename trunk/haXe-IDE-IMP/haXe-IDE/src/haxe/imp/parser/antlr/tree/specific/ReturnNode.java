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
import haxe.imp.parser.antlr.tree.specific.vartable.DeclaredVarsTable;
import haxe.imp.parser.antlr.utils.HaxeType;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * The Class VarUsage.
 * 
 * @author kondratyev
 */
public class ReturnNode extends HaxeTree {
	
	private HaxeType haxeType = HaxeType.haxeUndefined;

	/**
	 * Sets the var type.
	 * 
	 * @param varType
	 *            the varType to set
	 */
	@Override
	public boolean setHaxeType(final HaxeType varType) {
		this.haxeType = varType;
		return true;
	}
	
	/**
	 * Gets the var type.
	 * 
	 * @return the varType
	 */
	@Override
	public HaxeType getHaxeType() {
		return this.getChild(0).getHaxeType();
	}
	
	@Override
	public void printTree(){
		System.out.println("Return"+ "{"+getHaxeType().getTypeName()+'}');
	}

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param t
	 *            the t
	 */
	public ReturnNode(final Token t) {
		this.token = t;
	}
	
	/**
	 * 
	 * @return if getText != null then getText, else lastchild.getText
	 */
	@Override
	public String getText() {
		if (this.getChildCount() == 0) 
			return super.getText();
		
		return this.getChild(0).getText();//.getAllChildren().get(this.getAllChildren().size()-1)
	}

	public ReturnNode(final int ttype, final boolean auxiliary) {
		super(ttype, auxiliary);
	}
	
	@Override
	public DeclaredVarsTable calculateScopes(){
		return null;
	}

}
