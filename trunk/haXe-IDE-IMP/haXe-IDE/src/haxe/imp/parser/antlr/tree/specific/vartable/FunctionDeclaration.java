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

import org.antlr.runtime.CommonToken;

public class FunctionDeclaration extends VarDeclaration {
	
	private VarDeclaration returnNode = null;

	public VarDeclaration getReturnNode() {
		return returnNode;
	}
	
	public void setReturnNode(VarDeclaration node){
		returnNode = node;
	}
	
	/**
	 * Creates new instance of Function Declaration with
	 * default variable number 0.
	 * @param functionToken - contains info about function name and
	 * position in the original text.
	 */
	public FunctionDeclaration(CommonToken functionToken) {
		super(functionToken);
		declType = VarType.FunctionDeclaration;
	}
	
	@Override
	public String getNameWithType() {
		return "function " + this.getText() + "() : " + this.getHaxeType().getTypeName();
	}
	
	/**
	 * If function should return some value but there is no return
	 * statement in the original text, this error should be
	 * committed.
	 */
	public void commitNullReturnError(){
		commitError(getText() + " should return value.");
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
