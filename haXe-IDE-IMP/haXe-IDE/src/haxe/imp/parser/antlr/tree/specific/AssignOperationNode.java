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
 * The Class AssignOperationNode.
 * 
 * @author kondratyev
 */
public class AssignOperationNode extends HaxeTree {
	
	public AssignOperationNode() {
		super();
	}
	
	@Override
	public void printTree(){
		System.out.println("AssignOperation"+ "{name=" +this.getText()+'}');
	}
//MB при создании - уже ищем тип -> залазим в вар декларатион и присваиваем там?

	public HaxeTree getLeftOperand(){
		// it could be not only VarUsage but also field access or slice
		return this.getChild(0);
	}
	
	public HaxeTree getRightOperand(){
		return this.getChild(1);
	}
	
	public AssignOperationNode(final CommonTree node) {
		super(node);
	}

	public AssignOperationNode(final Token t) {
		super(t);
	}

	public AssignOperationNode(final int ttype, final String type) {
		this.token = new CommonToken(ttype, type);
	}

	public AssignOperationNode(final int ttype, final Token token) {
		this.token = token;
	}

	public AssignOperationNode(final int ttype, final boolean auxiliary) {
		super(ttype, auxiliary);
	}

	public AssignOperationNode(final int ttype) {
		super(ttype);
	}

}
