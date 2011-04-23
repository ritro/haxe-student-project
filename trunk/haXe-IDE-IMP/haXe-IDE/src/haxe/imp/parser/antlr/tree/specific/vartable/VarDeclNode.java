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
package haxe.imp.parser.antlr.tree.specific.vartable;

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * The Class VarUsage.
 * 
 * @author kondratyev
 */
public class VarDeclNode extends HaxeTree {
	
	public enum VarType {ClassVarDecl, FunctionVarDecl, FunctionParam, NotDefined};
	private HaxeType haxeType = HaxeType.haxeUndefined;
	private VarType declType = VarType.NotDefined;
	private CommonToken blockScope;
	
	public CommonToken getScopeToken() {
		return blockScope;
	}

	public VarType getDeclType() {
		return declType;
	}

	@Override
	public String getText(){
		return super.getText();
	}
	
	@Override
	public HaxeType getHaxeType() {
		return haxeType;
	}
	
	public boolean ifUndefinedType(){
		return this.getHaxeType().equals(HaxeType.haxeUndefined);
	}
	
	@Override
	public boolean setHaxeType(final HaxeType varType) {
		this.haxeType = varType;
		return true;
	}
	
	public String getNameWithType() {
		return this.getText() + " : " + this.getHaxeType().getTypeName();
	}

	public VarDeclNode(CommonToken token, CommonToken blockScope) {
		super(token);
		this.blockScope = blockScope;
	}
	
	public VarDeclNode(VarDeclarationNode vd, CommonToken blockScope){
		super(vd.getVarNameNode().getToken());	
		this.blockScope = blockScope;
		try {
			for (HaxeTree tree : this.getChildren()) {
				if ( tree.getToken().getType() == TYPE_TAG_TYPE) {
					this.setHaxeType(
							(HaxeType.tryGetPrimaryType(tree.getChild(0).getText()) != null)?
							HaxeType.tryGetPrimaryType(tree.getChild(0).getText()) :
							new HaxeType(tree.getChild(0).getText()));
					break;
				}
			}
		} catch (NullPointerException nullPointerException) {
			System.out.println("Problems on getting varType");
		}
		/*
		HaxeTree varInitNode = this.getVAR_INIT_NODE();
		if (varInitNode != null) {
			if (varInitNode.getChildCount() > 0) {
				for (HaxeTree tree : varInitNode.getChildren()) {
					tree.calculateScopes(blockScope);
				}
			}
		}*/
	}
	
	public VarDeclNode(VarType type, CommonToken token, CommonToken blockScope) {
		super(token);
		this.blockScope = blockScope;
		this.declType = type;
	}
	
	@Override
	public void printTree(){
		System.out.println("ScopeVarDeclNode_"+"Name: " + getText() + ", type: "+ getHaxeType());
	}
	
	/**
	 * Creating class outline
	 */
	@Override
	public void accept(final HaxeModelVisitor visitor){
		visitor.visit(this);
		visitor.endVisit(this);
	}

	public String getTextWithType() {
		if (this.getDeclType() == VarType.FunctionParam) {
			return "some function param-not impelemented";
		}
		return this.getText() + " : " + this.getHaxeType().getTypeName();
	}
}
