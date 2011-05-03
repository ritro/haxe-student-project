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
import haxe.imp.parser.antlr.tree.specific.vartable.DeclaredVarsTable;
import haxe.imp.parser.antlr.tree.specific.vartable.ClassDeclaration;
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
public class ClassNode extends HaxeTree {

	/** The class name. */
	private String className = "";

	/**
	 * Gets the class name.
	 * 
	 * @return the class name
	 */
	public String getClassName() {
		if (this.className.equals("")) {
			this.className = this.getText();
		}
		return this.className;
	}

	/**
	 * Instantiates a new class node.
	 */
	public ClassNode() {
		super();
	}

	/**
	 * @param node
	 *            the node
	 */
	public ClassNode(final HaxeTree node) {
		super(node);
	}

	/**
	 * Instantiates a new class node.
	 * 
	 * @param t
	 *            the t
	 */
	public ClassNode(final Token t) {
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
		//FIXME That's just name, not full name (missing packege declaration)
		HaxeType type = new HaxeType(this.getClassName()); 
		
		if (getInherits() == null)
			return type;

		ArrayList<HaxeType> list = new ArrayList<HaxeType>();
		for (HaxeTree i : getInherits().getChildren())
			list.add(new HaxeType(i.getChild(0).getText()));
		
		//FIXME not sure if I understood right - types from  Hierarhy and Implemented are the same?????
		type.setClassHierarchy(list);
		return type;
	}

	@Override
	public DeclaredVarsTable calculateScopes() {
	    DeclaredVarsTable declaredVars = new DeclaredVarsTable();

		if (getBlockScope() != null) {
			declaredVars.addAll(getBlockScope().calculateScopes());
		}
		
		return declaredVars;
	}

}