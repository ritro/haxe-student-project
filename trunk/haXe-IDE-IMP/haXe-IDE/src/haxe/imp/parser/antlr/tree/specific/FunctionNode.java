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

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * The Class FunctionNode.
 * 
 * @author Anatoly Kondratyev
 */
public class FunctionNode extends HaxeTree {

	/** The full name with parameters. */
	private String fullNameWithParameters = "";

	/**
	 * Gets the full name with parameters.
	 * 
	 * @return the full name with parameters
	 */
	public String getFullNameWithParameters() {
		if (this.fullNameWithParameters.equals("")) {
			HaxeTree paramList = this.getParamListNode();
			String parameters = "";
			String comma = "";
			if (paramList != null && paramList.getChildCount() != 0) {
				for (HaxeTree commonTree : paramList.getChildren()) {
					parameters += comma
							+ ((VarDeclaration) commonTree).getHaxeType()
									.getTypeName();
					comma = ", ";
				}
			}
			this.fullNameWithParameters = this.getFunctionName() + "("
					+ parameters + ") : "
					+ this.getFunctionReturnType().getTypeName();
		}
		return this.fullNameWithParameters;
	}

	/**
	 * Instantiates a new function node.
	 */
	public FunctionNode() {
		super();
	}

	/**
	 * Instantiates a new function node.
	 * 
	 * @param node
	 *            the node
	 */
	public FunctionNode(final HaxeTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new function node.
	 * 
	 * @param t
	 *            the t
	 */
	public FunctionNode(final Token t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the param list node.
	 * 
	 * @return the param list node
	 */
	public HaxeTree getParamListNode() {
		for (HaxeTree tree : (ArrayList<HaxeTree>) this
				.getChildren()) {
			Token token = (CommonToken) tree.getToken();
			if (token.getType() == PARAM_LIST_TYPE) {
				return tree;
			}
		}
		return null;
	}

	/**
	 * Gets the parameters as var usage.
	 * FIXME
	 * @return the parameters as var usage
	 */ 
	public ArrayList<VarUsage> getParametersAsVarUsage() {
		ArrayList<VarUsage> list = new ArrayList<VarUsage>();
		HaxeTree parameters = this.getParamListNode();
		if (parameters != null) {
			for (HaxeTree varDecl : parameters.getChildren()) {
				VarDeclaration varDeclaration = (VarDeclaration) varDecl;
				varDeclaration.trySetTypeFromDeclaration();
				VarUsage varUsage = varDeclaration.getVarNameNode().getClone();
				list.add(varUsage);
			}
		}
		return list;
	}

	/**
	 * Gets the function name.
	 * 
	 * @return the function name
	 */
	public String getFunctionName() {
		return this.getChild(0).getText();
	}

	/**
	 * Gets the function return type.
	 * 
	 * @return the function return type
	 */
	public HaxeType getFunctionReturnType() {
		try {
			for (HaxeTree tree : this.getChildren()) {
				if (tree.getToken().getType() == TYPE_TAG_TYPE) {
					return new HaxeType(tree.getChild(0).getText());
				}
			}
		} catch (NullPointerException nullPointerException) {
			return HaxeType.haxeUndefined;
		}
		return HaxeType.haxeUndefined;
	}

	/**
	 * Gets the block scope.
	 * 
	 * @return the block scope
	 */
	public BlockScopeNode getBlockScope() {
		if (this.getChildCount() > 0) {
			for (HaxeTree tree : this.getChildren()) {
				if (tree instanceof BlockScopeNode) {
					return (BlockScopeNode) tree;
				}
			}
		}
		return null;
	}
}
