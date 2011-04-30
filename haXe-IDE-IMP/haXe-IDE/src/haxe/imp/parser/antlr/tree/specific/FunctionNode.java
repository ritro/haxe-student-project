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
import haxe.imp.parser.antlr.tree.specific.vartable.DeclaredVarsTable;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclNode;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclNode.VarType;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

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
							+ ((VarDeclarationNode) commonTree).getHaxeType()
									.getTypeName();
					comma = ", ";
				}
			}
			this.fullNameWithParameters = this.getFunctionName() + "("
					+ parameters + ") : "
					+ this.getHaxeType().getTypeName();
		}
		return this.fullNameWithParameters;
	}

	public FunctionNode(final Token t) {
		super(t);
	}

	/**
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
	 * @return the param list node
	 */
	public HaxeTree getReturnNode() {
		for (HaxeTree tree : this.getBlockScope().getChildren()) {
			if (tree instanceof ReturnNode) {
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
	public ArrayList<VarUsageNode> getParametersAsVarUsage() {
		ArrayList<VarUsageNode> list = new ArrayList<VarUsageNode>();
		HaxeTree parameters = this.getParamListNode();
		if (parameters != null) {
			for (HaxeTree varDecl : parameters.getChildren()) {
				VarDeclarationNode varDeclarationNode = (VarDeclarationNode) varDecl;
				VarUsageNode varUsageNode = varDeclarationNode.getVarNameNode().getClone();
				list.add(varUsageNode);
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
	
	@Override
	public HaxeType getHaxeType(){
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
	
	@Override
	public DeclaredVarsTable calculateScopes(){	
		DeclaredVarsTable declaredVars = new DeclaredVarsTable();
		for (VarUsageNode x: getParametersAsVarUsage())
			declaredVars.addToDeclaredVars(new VarDeclNode(VarType.FunctionParam,
											x.getToken(), getBlockScope().getToken()));
		
		if (getBlockScope() != null) {
			declaredVars.addAll(getBlockScope().calculateScopes());
		}
		return declaredVars;
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
