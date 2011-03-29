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
			this.className = this.getChild(0).getText();
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
			if (tree.getType() == 11) {
				return (HaxeTree) tree;
			}
		}
		return null;
	}

	/**
	 * Gets the all declared vars.
	 * 
	 * @return the all declared vars
	 */
	public ArrayList<VarUsage> getAllDeclaredVars() {
		ArrayList<VarUsage> list = new ArrayList<VarUsage>();
		BlockScopeNode blockScopeNode = this.getBlockScope();
		if (blockScopeNode != null) {
			for (HaxeTree tree : blockScopeNode.getChildren()) {
				if (tree instanceof VarDeclaration) {
					VarDeclaration declarationTree = (VarDeclaration) tree;
					declarationTree.getVarNameNode().setHaxeType(
							declarationTree.getVarType());
					VarUsage varUsage = declarationTree.getVarNameNode()
							.getClone();
					list.add(varUsage);
				} else if (tree instanceof FunctionNode) {
					FunctionNode functionTree = (FunctionNode) tree;
					VarUsage usage = new VarUsage(
							((HaxeTree) functionTree.getChild(0))
									.getToken());
					usage.setHaxeType(functionTree.getFunctionReturnType());
					list.add(usage);
				} else if (tree instanceof ClassNode) {
					ClassNode classTree = (ClassNode) tree;
					VarUsage usage = new VarUsage(classTree.getChild(0)
							.getToken());
					/**
					 * FIXME while creating HaxeType, we shoul use ALL available
					 * information about it
					 */
					usage.setHaxeType(new HaxeType(classTree.getChild(0)
							.getToken().getText()));
					list.add(usage);
				}
			}
		}
		return list;
	}

}
