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
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * The Class VarUsage.
 * 
 * @author kondratyev
 */
public class ScopeVarDeclNode extends HaxeTree {
	
	private HaxeType haxeType = HaxeType.haxeUndefined;
	private String name = "?";

	public String getName() {
		return name;
	}
	
	@Override
	public String getText(){
		return name;
	}
	
	@Override
	public HaxeType getHaxeType() {
		return haxeType;
	}
	
	public boolean ifUndefinedType(){
		return this.getHaxeType().equals(HaxeType.haxeUndefined);
	}
	
	@Override
	public boolean setHaxeType(final HaxeType varType) {
		this.haxeType = varType;
		return true;
	}
	
	public String getNameWithType() {
		return this.getName() + " : " + this.getHaxeType().getTypeName();
	}

	public ScopeVarDeclNode(String name, CommonToken token) {
		super(token);
		this.name = name;
	}
	
	@Override
	public void printTree(){
		System.out.println("ScopeVarDeclNode_"+"Name: " +getName() + ", type: "+ getHaxeType());
	}
	
	/**
	 * Creating class outline
	 */
	@Override
	public void accept(final HaxeModelVisitor visitor){
		visitor.visit(this);
		visitor.endVisit(this);
	}
}
