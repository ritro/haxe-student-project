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
							+ ((VarDeclaration) commonTree).getHaxeType()
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
	public void calculateScopes(final BlockScopeNode blockScope){
		if (getBlockScope() != null) {
			getBlockScope().calculateScopes(blockScope);
			if (!getHaxeType().equals(HaxeType.haxeUndefined)){
				HaxeTree returnNode = null;
				for (HaxeTree tree: getBlockScope().getChildren())
					if (tree.getText().equals("return"))
						returnNode = tree;
				if (returnNode == null) //Missing Return Statement
					this.commitError("Function should return value."); //FIXME not haxe message
				else //Return type Not valid	
					if (!returnNode.getHaxeType().equals(getHaxeType()))//FIXME ---//----
						returnNode.getChild(0).commitError("Returned value doesn't match function value");
			}else{
				//FIXME ?? this.setHaxeType(getBlockScope().getHaxeType())
			}		
		}
	}
	
	/**
	 * Creating class outline
	 */
	@Override
	public void accept(final HaxeModelVisitor visitor){
		visitor.visit(this);/*
		for (HaxeTree child : this.getBlockScope().getChildren()) {
			child.accept(visitor);
		}*/
		visitor.endVisit(this);
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
