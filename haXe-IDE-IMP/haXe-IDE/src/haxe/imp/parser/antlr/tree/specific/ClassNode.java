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

import haxe.imp.parser.antlr.main.TinyHaxeTry1Parser.inheritListOpt_return;
import haxe.imp.parser.antlr.main.TinyHaxeTry1Parser.inherit_return;
import haxe.imp.parser.antlr.main.TinyHaxeTry1Parser.typeTagOpt_return;
import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.utils.HaxeType;

import java.util.ArrayList;

import org.antlr.runtime.Token;

// TODO: Auto-generated Javadoc
/**
 * The Class ClassNode.
 * 
 * @author Anatoly Kondratyev
 */
public class ClassNode extends ExtendedCommonTree {

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
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new class node.
	 * 
	 * @param node
	 *            the node
	 */
	public ClassNode(final ExtendedCommonTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new class node.
	 * 
	 * @param t
	 *            the t
	 */
	public ClassNode(final Token t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the block scope.
	 * 
	 * @return the block scope
	 */
	public BlockScopeNode getBlockScope() {
		for (ExtendedCommonTree tree : (ArrayList<ExtendedCommonTree>) this
				.getChildren()) {
			if (tree instanceof BlockScopeNode) {
				return (BlockScopeNode) tree;
			}
		}
		return null;
	}
	
	public ExtendedCommonTree getInherits() {
		for (ExtendedCommonTree tree : (ArrayList<ExtendedCommonTree>) this
				.getChildren()) {
			if (tree.getType() == 11) {
				return (ExtendedCommonTree) tree;
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
			for (ExtendedCommonTree tree : blockScopeNode.getChildren()) {
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
							((ExtendedCommonTree) functionTree.getChild(0))
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
