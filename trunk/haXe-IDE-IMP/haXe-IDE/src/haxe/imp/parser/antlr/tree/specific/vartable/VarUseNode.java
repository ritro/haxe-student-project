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
	private VarDeclNode assignment = null;

	@Override
	public String getText() {
		return fullName.getText();
	}
	
	public VarDeclNode getAssignExpr() {
		return assignment;
	}
	
	public void setAssignExpr(VarDeclNode assignment) {
		this.assignment = assignment;
	}
	
	public VarUseNode(HaxeTree name, CommonToken token,CommonToken blockScope) {
		super(token,blockScope);
		fullName = name;
	}
	
	public void commitAssignmentError(){
		if (assignment.isNil())
			return;
		assignment.commitError(assignment.getHaxeType() + " should be " + this.getHaxeType().getTypeName());
	}
	
	@Override
	public void printTree(){
		if (assignment != null){
			System.out.println("Assignment");
			System.out.println("      Name: " + getText() + ", type: "+ getHaxeType());
			System.out.print("      ");
			assignment.printTree();
		}
		else{
			System.out.println("UseNode: " + getText() + ", type: "+ getHaxeType());
		}
	}
}
