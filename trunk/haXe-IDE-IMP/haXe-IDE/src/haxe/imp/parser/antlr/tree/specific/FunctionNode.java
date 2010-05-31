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

import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.utils.HaxeType;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

// TODO: Auto-generated Javadoc
/**
 * The Class FunctionNode.
 * 
 * @author Anatoly Kondratyev
 */
public class FunctionNode extends ExtendedCommonTree {

	/** The full name with parameters. */
	private String fullNameWithParameters = "";

	/**
	 * Gets the full name with parameters.
	 * 
	 * @return the full name with parameters
	 */
	public String getFullNameWithParameters() {
		if (fullNameWithParameters.equals("")) {
			ExtendedCommonTree paramList = this.getParamListNode();
			String parameters = "";
			String comma = "";
			if (paramList != null && paramList.getChildCount() != 0) {
				for (ExtendedCommonTree commonTree : paramList.getChildren()) {
					parameters += comma
							+ ((VarDeclaration) commonTree).getVarType()
									.getTypeName();
					comma = ", ";
				}
			}
			fullNameWithParameters = this.getFunctionName() + "(" + parameters
					+ ") : " + getFunctionReturnType().getTypeName();
		}
		return fullNameWithParameters;
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
	public FunctionNode(ExtendedCommonTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new function node.
	 * 
	 * @param t
	 *            the t
	 */
	public FunctionNode(Token t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the param list node.
	 * 
	 * @return the param list node
	 */
	public ExtendedCommonTree getParamListNode() {
		for (ExtendedCommonTree tree : (ArrayList<ExtendedCommonTree>) this
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
	 * 
	 * @return the parameters as var usage
	 */
	public ArrayList<VarUsage> getParametersAsVarUsage() {
		ArrayList<VarUsage> list = new ArrayList<VarUsage>();
		ExtendedCommonTree parameters = this.getParamListNode();
		if (parameters != null) {
			for (ExtendedCommonTree varDecl : parameters.getChildren()) {
				VarDeclaration varDeclaration = (VarDeclaration) varDecl;
				varDeclaration.getVarNameNode().setHaxeType(
						varDeclaration.getVarType());
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
			for (ExtendedCommonTree tree : this.getChildren()) {
				if (tree.getToken().getType() == TYPE_TAG_TYPE) {
					/**
					 * FIXME Нужно находить название этого класса в объявлениях,
					 * если он не примитивный, и возвращать его копию.
					 */
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
			for (ExtendedCommonTree tree : this.getChildren()) {
				if (tree instanceof BlockScopeNode) {
					return (BlockScopeNode) tree;
				}
			}
		}
		return null;
	}
}
