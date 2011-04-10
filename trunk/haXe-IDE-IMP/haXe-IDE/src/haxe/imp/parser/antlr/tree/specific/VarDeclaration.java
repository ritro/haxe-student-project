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
import haxe.imp.parser.antlr.tree.exceptions.HaxeCastException;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * The Class VarDeclaration.
 * 
 * @author Anatoly Kondratyev
 */
public class VarDeclaration extends HaxeTree {

	/** The name with type. */
	private String nameWithType = "";

	/**
	 * Gets the name with type.
	 * 
	 * @return the name with type
	 */
	public String getNameWithType() {
		if (this.nameWithType.equals("")) {
			this.nameWithType = this.getVarName() + " : "
					+ this.getHaxeType().getTypeName();
		}
		return this.nameWithType;
	}

	public VarDeclaration(final int ttype, final Token token) {
		this.token = token;
	}

	public VarDeclaration(final int ttype, final Token token,
			final boolean auxiliary) {
		this.token = token;
		this.setAuxiliary(auxiliary);
	}

	/**
	 * Returns node correspond for var name (in var tmp:Int = foo+bar; it will
	 * return node for "tmp").
	 * Also set type from declaration if previously not set;
	 * 
	 * @return the var name node
	 */
	public VarUsage getVarNameNode() {
		for (HaxeTree child : this.getChildren()) {
			if (child instanceof VarUsage) {
				return (VarUsage) child;
			}
		}
		System.out.println("No var name in var declaration");
		return (VarUsage) this.getChild(0);
	}

	/**
	 * Returns node correspond for var name (in var tmp:Int = foo+bar; it will
	 * return "tmp").
	 * 
	 * @return the var name
	 */
	public String getVarName() {
		return this.getVarNameNode().getText();
	}

	/**
	 * Gets the var type.
	 * 
	 * @return the var type
	 */
	@Override
	public HaxeType getHaxeType() {
		return this.getVarNameNode().getHaxeType();
	}
	
	public void trySetTypeFromDeclaration(){
		if (this.getVarNameNode().getHaxeType().equals(HaxeType.haxeNotYetRecognized)){
			try {
				for (HaxeTree tree : this.getChildren()) {
					if ( tree.getToken().getType() == TYPE_TAG_TYPE) {
						this.getVarNameNode().setHaxeType(
								(HaxeType.tryGetPrimaryType(tree.getChild(0).getText()) != null)?
								HaxeType.tryGetPrimaryType(tree.getChild(0).getText()) :
								new HaxeType(tree.getChild(0).getText()));
						return;
					}
				}
			} catch (NullPointerException nullPointerException) {
				System.out.println("Problems on getting varType");
			}
			this.getVarNameNode().setHaxeType(HaxeType.haxeUndefined);
		}
	}
	
	@Override
	public boolean setHaxeType(HaxeType type){
		this.getVarNameNode().setHaxeType(type);
			
		return true;
	}
	
	/**
	 * Creating class outline
	 */
	@Override
	public void accept(final HaxeModelVisitor visitor){
		visitor.visit(this);
		visitor.endVisit(this);
	}

	/**
	 * ???
	 * 
	 * @return the var init node
	 */
	public HaxeTree getVAR_INIT_NODE() {
		for (HaxeTree tree : (ArrayList<HaxeTree>) this
				.getChildren()) {
			Token token = (CommonToken) tree.getToken();
			if (token.getType() == VAR_INIT_TYPE) {
				return tree;
			}
		}
		return null;
	}
	
	@Override
	public void calculateScopes(final BlockScopeNode blockScope){
		this.trySetTypeFromDeclaration();
		VarUsage varUsage = getVarNameNode().getClone();

		HaxeTree varInitNode = this.getVAR_INIT_NODE();
		if (varInitNode != null) {
			if (varInitNode.getChildCount() > 0) {
				for (HaxeTree tree : varInitNode.getChildren()) {
					tree.calculateScopes(blockScope);
				}
			}
		}
		if (varUsage.getHaxeType().equals(HaxeType.haxeUndefined)) {
			/**(c)Haxe
			 * All Class variables must be declared with a type 
			 */
			if (blockScope.parent instanceof ClassNode){
				varUsage.commitError("Class var should have type");
			} else
			if (blockScope.parent instanceof EnumNode)
				this.setHaxeType(new HaxeType(blockScope.parent.getText()));
		}
		if (blockScope.doScopeContainsVarName(varUsage.getText())) {
			varUsage.commitError("Var is already declared");
		} else {
			blockScope.addToDeclaredVars(varUsage);
		}
	}
}
