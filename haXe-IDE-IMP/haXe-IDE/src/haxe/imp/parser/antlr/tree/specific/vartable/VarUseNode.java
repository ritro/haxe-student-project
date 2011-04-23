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
package haxe.imp.parser.antlr.tree.specific.vartable;

import org.antlr.runtime.CommonToken;

import haxe.imp.parser.antlr.tree.HaxeTree;

/**
 * The Class VarUsage.
 * 
 * @author kondratyev
 */
public class VarUseNode extends VarDeclNode {
	
	private HaxeTree fullName;

	@Override
	public String getText() {
		return fullName.getText();
	}
	
	public VarUseNode(HaxeTree name, CommonToken token,CommonToken blockScope) {
		super(token,blockScope);
		fullName = name;
	}
	
	@Override
	public void printTree(){
		System.out.println("ScopeVarUseNode_"+"Name: " + getText() + ", type: "+ getHaxeType());
	}
}
