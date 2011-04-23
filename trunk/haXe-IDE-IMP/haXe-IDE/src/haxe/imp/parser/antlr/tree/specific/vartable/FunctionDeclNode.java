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

import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;

/**
 * The Class VarUsage.
 * 
 * @author kondratyev
 */
public class FunctionDeclNode extends VarDeclNode {
	
	public FunctionDeclNode(CommonToken token,CommonToken blockScope) {
		super(token,blockScope);		
	}
	
	@Override
	public String getNameWithType() {
		return "function " + this.getText() + "() : " + this.getHaxeType().getTypeName();
	}
	
	@Override
	public void printTree(){
		System.out.println("FunDecl " + getText() + ", type: "+ getHaxeType());
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
