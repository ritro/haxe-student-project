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

import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import java.util.ArrayList;

import org.antlr.runtime.Token;

// TODO: Auto-generated Javadoc
/**
 * The Class ClassNode.
 * 
 * @author Anatoly Kondratyev
 */
public class EnumNode extends HaxeTree {

	/** The class name. */
	private String enumName = "";

	/**
	 * Gets the class name.
	 * 
	 * @return the class name
	 */
	public String getEnumName() {
		if (this.enumName.equals("")) {
			this.enumName = this.getText();
		}
		return this.enumName;
	}

	/**
	 * Instantiates a new class node.
	 */
	public EnumNode() {
		super();
	}

	/**
	 * @param node
	 *            the node
	 */
	public EnumNode(final HaxeTree node) {
		super(node);
	}

	/**
	 * Instantiates a new class node.
	 * 
	 * @param t
	 *            the t
	 */
	public EnumNode(final Token t) {
		super(t);
	}
	
	/**
	 * Gets the block scope.
	 * 
	 * @return the block scope
	 */
	public BlockScopeNode getBlockScope() {
		for (HaxeTree tree : (ArrayList<HaxeTree>) this
				.getChildren()) {
			if (tree instanceof BlockScopeNode) {
				return (BlockScopeNode) tree;
			}
		}
		return null;
	}

	public HaxeTree getInherits() {
		for (HaxeTree tree : (ArrayList<HaxeTree>) this
				.getChildren()) {
			if (tree.getType() == HaxeParser.INHERIT_LIST_OPT) {
				return (HaxeTree) tree;
			}
		}
		return null;
	}
	
	/**
	 * class D extends A, implements B, implements C {} 
	 * Каждый экземпляр D будет иметь тип D, но также имеет типы A , B и C.
	 * 
	 * @return Class Name type with implemented types record for each class/interface  
	 * it extended/implemented
	 */
	@Override
	public HaxeType getHaxeType(){
		//TODO????
		return HaxeType.haxeEnum;
	}
	
	/**
	 * Creating class outline
	 */
	@Override
	public void accept(final HaxeModelVisitor visitor){
		visitor.visit(this);
		for (HaxeTree child : this.getBlockScope().getChildren()) {
			child.accept(visitor);
		}
		visitor.endVisit(this);
	}

	/**
	 * Gets the all declared vars.
	 * 
	 * @return the all declared vars
	 */
	public ArrayList<HaxeTree> getAllMembers() {
		ArrayList<HaxeTree> list = new ArrayList<HaxeTree>();

		for (HaxeTree x: this.getBlockScope().getChildren())
			if (x instanceof VarDeclaration)
				list.add(x);
		return list;
	}

}
