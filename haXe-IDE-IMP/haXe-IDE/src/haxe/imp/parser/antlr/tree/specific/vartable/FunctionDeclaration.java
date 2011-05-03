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
	
	private VarDeclaration returnNode = null; //MB varUseNode??

	public VarDeclaration getReturnNode() {
		return returnNode;
	}
	
	public void setReturnNode(VarDeclaration node){
		returnNode = node;
	}
	
	public FunctionDeclaration(CommonToken token,int varNumber) {
		super(token,varNumber);		
	}
	
	@Override
	public String getNameWithType() {
		return "function " + this.getText() + "() : " + this.getHaxeType().getTypeName();
	}
	
	public void commitNullReturnError(){
		this.commitError(this.getText() + " should return value.");
	}
	
	@Override
	public void printTree(){
		System.out.print("FunDecl " + getText() + ", type: "+ getHaxeType().getTypeName() + 
                ", Num: " + getVarNumber());
		if (returnNode != null){
			System.out.print(" return: ");
			returnNode.printTree();
		} else {
			System.out.println();
		}
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
