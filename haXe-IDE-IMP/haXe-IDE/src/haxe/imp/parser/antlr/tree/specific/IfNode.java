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

import org.antlr.runtime.Token;

/**
 * The Class IfNode.
 * 
 * @author Anatoly Kondratyev
 */
public class IfNode extends HaxeTree {

	public IfNode() {
		super();
	}

	public IfNode(final HaxeTree node) {
		super(node);
	}

	public IfNode(final Token t) {
		super(t);
	}

	/**
	 * f( expr-cond ) expr-1 [else expr-2]
	 * @return expr-cond
	 */
	public HaxeTree getCondition(){
		return this.getChild(0);
	}
	
	/**
	 * f( expr-cond ) expr-1 [else expr-2]
	 * @return expr-1
	 */
	public HaxeTree getIfTrue(){
		return this.getChild(1);
	}
	
	/**
	 * f( expr-cond ) expr-1 [else expr-2]
	 * @return expr-2
	 */
	public HaxeTree getIfFalse(){
		return (this.getChildCount() == 3)? 
			this.getChild(2).getChild(0) : //currently ElSe word is the third node
			null;
	}
	/**
	 * If there is no else, and the if expression is false, then the entire expression has type Void. 
	 * If there is an else, then expr-1 and expr-2 must be of the same type and 
	 * this will be the type of the if expression 
	 * As an exception, if an if block is not supposed to return any value (like in the middle of a Block)
	 * then both expr-1 and expr-2 can have different types and the if block type will be Void.
	 */
	@Override
	public HaxeType getHaxeType(){
		//TODO Should check if IF is the last in scope block(->have no ifFalse) in another place
		if (getIfFalse() != null && 
			getIfFalse().getHaxeType().equals(getIfTrue().getHaxeType()))
			return getIfFalse().getHaxeType();
		else return HaxeType.haxeVoid;
	}
}
