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
import haxe.imp.parser.antlr.tree.exceptions.HaxeCastException;
import haxe.imp.parser.antlr.tree.specific.vartable.DeclaredVarsTable;
import haxe.imp.parser.antlr.tree.specific.vartable.FunctionDeclNode;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclNode;
import haxe.imp.parser.antlr.tree.specific.vartable.VarUseNode;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclNode.VarType;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * Blocks can execute several expressions.
 * @author kondratyev
 */
public class BlockScopeNode extends HaxeTree {

	private int lBracketPosition;
	private int rBracketPosition;

	/**
	 * Gets the l bracket position.
	 * 
	 * @return the l bracket position
	 */
	public int getlBracketPosition() {
		return this.lBracketPosition;
	}

	/**
	 * Gets the r bracket position.
	 * 
	 * @return the r bracket position
	 */
	public int getrBracketPosition() {
		if (this.getChildCount() > 0) {
			//return this.rBracketPosition;
			HaxeTree lastchild = getChildren().get(getChildCount()-1);
			if (lastchild.getType() == HaxeParser.RBRACE) {
				return lastchild.getToken().getStopIndex();
			} else {
				// no right brace - return something
				return lastchild.getMostRightPosition();
			}
		} else {
			return this.lBracketPosition;
		}
	}

	/**
	 * Sets the r bracket position.
	 * 
	 * @param rBracketPosition
	 *            the new r bracket position
	 */
	public void setrBracketPosition(final int rBracketPosition) {
		this.rBracketPosition = rBracketPosition;
	}
	
	@Override
	public int getMostLeftPosition() {
		return this.getlBracketPosition();
	}
	
	@Override
	public int getMostRightPosition() {
		return this.getrBracketPosition();
	}
	
	/**
	 * A block evaluates to the TYPE of the last expression of the block.
	 * As an exception, the empty block { } evaluates to Void.
	 */
	/*@Override
	public HaxeType getHaxeType(){
		return (this.getDeclaredVars().size() > 0) ? 
				this.getDeclaredVars().get((this.getDeclaredVars().size()-1)).getHaxeType() :
					HaxeType.haxeVoid;
	}*/

	public BlockScopeNode(final int blockScope, final String string,
			final boolean b, final Token lBracket) {
		super(blockScope, string, b);
		this.lBracketPosition = ((CommonToken) lBracket).getStartIndex();
	}
	
	private boolean ifParentIsClass(){
		HaxeTree parent = this.getParent();
		
		while (parent != null){
			if (parent instanceof ClassNode)
				return true;
			else if (parent instanceof FunctionNode ||
					 parent instanceof EnumNode)
				return false;
			else
				parent = parent.getParent();
		}
		
		return false;
	}
	
	private boolean ifParentIsFunction(){
		HaxeTree parent = this.getParent();
		
		while (parent != null){
			if (parent instanceof FunctionNode)
				return true;
			else if (parent instanceof ClassNode ||
					 parent instanceof EnumNode)
				return false;
			else
				parent = parent.getParent();
		}
		
		return false;
	}
	
	@Override
	public DeclaredVarsTable calculateScopes(){		
		DeclaredVarsTable declaredVars = new DeclaredVarsTable();

		if (this.getChildCount() > 0) {
			for (HaxeTree tree : this.getChildren()) {
				if (tree instanceof ClassNode)
					declaredVars.addAll(tree.calculateScopes());
				else 
				if (tree instanceof FunctionNode){
					FunctionDeclNode sfd = new FunctionDeclNode(tree.getChild(0).getToken(),
																this.getToken());
					sfd.setHaxeType(tree.getHaxeType());
					if (((FunctionNode)tree).getReturnNode() != null){
						HaxeTree returnN =  ((FunctionNode)tree).getReturnNode();
						VarUseNode vun = new VarUseNode(returnN, returnN.getToken(), 
								this.getToken());
						vun.setHaxeType(returnN.getHaxeType());
						sfd.setReturnNode(vun);
					}
					declaredVars.addToDeclaredVars(sfd);
					declaredVars.addAll(tree.calculateScopes());
				}
				else
				if (tree instanceof VarDeclarationNode){
					VarDeclNode dvt = new VarDeclNode((VarDeclarationNode)tree,this.getToken());
					dvt.setHaxeType(((VarDeclarationNode)tree).getHaxeType());
					
					if (this.ifParentIsClass())
						dvt.setVarType(VarType.ClassVarDecl);
					else if (this.ifParentIsFunction())
						dvt.setVarType(VarType.FunctionVarDecl);
						
					HaxeTree init = ((VarDeclarationNode)tree).getVAR_INIT_NODE();
					VarUseNode vun = null;
					if (init != null &&
						!init.getHaxeType().equals(HaxeType.haxeUndefined) &&//primary
						dvt.getHaxeType().getClassHierarchy().contains(init.getHaxeType()))//Undef too
						dvt.setHaxeType(init.getHaxeType());
					else if (init != null)
					{
						vun = new VarUseNode(tree.getChild(0), dvt.getToken(), this.getToken());
						vun.setHaxeType(dvt.getHaxeType());
						vun.setAssignExpr(new VarUseNode(init, init.getToken(), this.getToken())); 
						vun.getAssignExpr().setHaxeType(init.getHaxeType());
					}
					if (!declaredVars.ifVarExists(dvt))
						declaredVars.addToDeclaredVars(dvt);
					else 
						dvt.commitError("Var is already declared");
					if (vun != null)
						declaredVars.addToDeclaredVars(vun);
				}
				else
				if (tree instanceof VarUseNode){
					VarUseNode vun = new VarUseNode(tree.getChild(0), tree.getToken(), 
														this.getToken()); 
					vun.setHaxeType(tree.getHaxeType());
					declaredVars.addToDeclaredVars(vun);
				}
				else
				if (tree instanceof AssignOperationNode){
					VarUseNode vun = new VarUseNode(((AssignOperationNode)tree).getLeftOperand(), 
										((AssignOperationNode)tree).getLeftOperand().getToken(), 
										this.getToken());
					VarUseNode vun2 = new VarUseNode(((AssignOperationNode)tree).getRightOperand(), 
							((AssignOperationNode)tree).getRightOperand().getToken(), 
							this.getToken());
					vun2.setHaxeType(((AssignOperationNode)tree).getRightOperand().getHaxeType());
					vun.setAssignExpr(vun2);
					declaredVars.addToDeclaredVars(vun);
				}
			}
		}
		
		return declaredVars;
	}
}
