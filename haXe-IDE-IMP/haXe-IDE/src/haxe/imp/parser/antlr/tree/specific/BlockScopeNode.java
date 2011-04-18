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

	/**
	 * Each BlockScope contains Nodes representing vars, that could be used in
	 */
	private ArrayList<ScopeVarDeclNode> declaredVars = new ArrayList<ScopeVarDeclNode>();

	private int lBracketPosition;
	private int rBracketPosition;

	/**
	 * Gets the declared vars.
	 * 
	 * @return the declaredVars
	 */
	public ArrayList<ScopeVarDeclNode> getDeclaredVars() {
		return this.declaredVars;
	}

	/**
	 * Sets the declared vars.
	 * 
	 * @param declaredVars
	 *            the declaredVars to set
	 */
	public void setDeclaredVars(final ArrayList<ScopeVarDeclNode> declaredVars) {
		this.declaredVars = declaredVars;
	}
	
	public void addToDeclaredVars(final ScopeVarDeclNode declaredVar){
		for (ScopeVarDeclNode x : declaredVars)
			if (x instanceof ScopeVarDeclNode &&
				x.getName().equals(declaredVar.getName())){
				declaredVars.remove(x);
				break;
			}
		this.declaredVars.add(declaredVar);
	}
	
	public void addToDeclaredVars(final ScopeFunDeclNode declaredVar){
		this.declaredVars.add(declaredVar);
	}
	
	public void addToDeclaredVars(final ScopeVarUseNode declaredVar){
		this.declaredVars.add(declaredVar);
	}
	
	public ScopeVarDeclNode findDeclaredVar(CommonToken token){
		for (ScopeVarDeclNode x: getDeclaredVars())
			if (x.getToken().equals(token))
				return x;
		return null;
	}

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
	@Override
	public HaxeType getHaxeType(){
		return (this.getDeclaredVars().size() > 0) ? 
				this.getDeclaredVars().get((this.getDeclaredVars().size()-1)).getHaxeType() :
					HaxeType.haxeVoid;
	}

	public BlockScopeNode(final int blockScope, final String string,
			final boolean b, final Token lBracket) {
		super(blockScope, string, b);
		this.lBracketPosition = ((CommonToken) lBracket).getStartIndex();
	}

	/**
	 * Checks if there is var with such name in current scope.
	 * 
	 * @param varName
	 *            the var name
	 * @return true, if successful
	 */
	public boolean doScopeContainsVarName(final String varName) {
		for (HaxeTree usage : this.declaredVars) {
			if (usage.getText().equals(varName)) {
				return true;
			}
		}
		return false;
	}
	/*
	public void changeVarType(VarUsage varUsage){
		if (!this.doScopeContainsVarName(varUsage.getText()))
			return;

		this.addToDeclaredVars(varUsage);
		if (getParentBlockScope() != null)
			getParentBlockScope().changeVarType(varUsage);
	}
	
	private BlockScopeNode getParentBlockScope(){
		parent = (HaxeTree) this.getParent();
		while (parent != null)
			if (parent instanceof BlockScopeNode)
				return (BlockScopeNode)parent;
			else 
				parent = (HaxeTree) parent.getParent();
		
		return null;
	}*/
	
	/**
	 * Creating class outline
	 */
	@Override
	public void accept(final HaxeModelVisitor visitor){
		/*boolean isParentClass = (this.parent instanceof ClassNode)||
								(this.parent instanceof EnumNode);
		if (!isParentClass) {
			visitor.visit(this, false);
			for (HaxeTree child : this.getChildren()) {
				child.accept(visitor);
			}
			visitor.endVisit(this);
		} else {*/
			// vars to outline
			for (ScopeVarDeclNode child : this.getDeclaredVars()) {
				child.accept(visitor);
			}
			//searching for functions
			for (HaxeTree child : this.getChildren()) {
				child.accept(visitor);
			}
		//}
	}	

	/**
	 * Return type of var as it stores in scope.
	 * 
	 * @param varName
	 *            the var name
	 * @return the var in scope type
	 */
	public HaxeType getVarType(final String varName) {
		for (HaxeTree usage : this.declaredVars) {
			if (usage.getText().equals(varName)) {
				return ((VarUsage) usage).getHaxeType();
			}
		}
		return HaxeType.haxeUndefined;
	}
	
	@Override //Is it right to rewrite params???
	public void calculateScopes(final BlockScopeNode blockScope){
		setDeclaredVars(((ArrayList<ScopeVarDeclNode>)(blockScope.getDeclaredVars().clone())));

		if (this.getParent() instanceof FunctionNode) {
			ArrayList<VarUsage> params = ((FunctionNode) this.getParent())
					.getParametersAsVarUsage();
			
			for (VarUsage x : params)
				addToDeclaredVars(new ScopeVarDeclNode(x.getText(), 
											x.getToken()));
		}

		if (this.getChildCount() > 0) {
			for (HaxeTree tree : this.getChildren()) {
				tree.calculateScopes(this);
			}
		}
	}
	
	@Override
	public void calculateTypes(){
		for (ScopeVarDeclNode tree : this.getDeclaredVars()) {
			if (tree instanceof ScopeFunDeclNode) {
				
			} else
			if (tree instanceof ScopeVarUseNode){
				
			} else
			if (tree instanceof ScopeVarDeclNode){
				
			}
		}
	}
}
