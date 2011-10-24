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
import haxe.imp.parser.antlr.tree.specific.vartable.ClassDeclaration;
import haxe.imp.parser.antlr.tree.specific.vartable.DeclaredVarsTable;
import haxe.imp.parser.antlr.tree.specific.vartable.FunctionDeclaration;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclaration;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclarationFactory;
import haxe.imp.parser.antlr.tree.specific.vartable.VarUse;


import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * Blocks can execute several expressions.
 * @author kondratyev
 */
/**
 * @author Savenko Maria
 *
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
	
	
	/* (non-Javadoc)
	 * @see haxe.imp.parser.antlr.tree.HaxeTree#calculateScopes()
	 * Checks met vars and according to the type calculates scopes
	 * for them or just insert into vars table.
	 */
	@Override
	public DeclaredVarsTable calculateScopes()
	{
		DeclaredVarsTable declaredVars = new DeclaredVarsTable();
		VarDeclarationFactory declaFactory = new VarDeclarationFactory();

		for (HaxeTree tree : this.getChildren()) 
		{
			if (tree instanceof ClassNode)
			{
			    ClassDeclaration scdn = new ClassDeclaration(this.getToken(), 0);
			    scdn.addAllToDeclaredVars(tree.calculateScopes());
			    
				declaredVars.tryAdd(scdn);
			}
			else if (tree instanceof FunctionNode)
			{
				FunctionDeclaration functionDeclaration = 
				        declaFactory.createFunctionDeclaration((FunctionNode)tree);
				declaredVars.tryAdd(functionDeclaration);
				declaredVars.addWithIncrease(tree.calculateScopes());
			}
			else if (tree instanceof VarDeclarationNode)
			{
				VarDeclarationNode node = (VarDeclarationNode)tree;
				
				VarDeclaration varDeclaration = 
				        declaFactory.createVarDeclaration(node, ifParentIsClass());
				//during declaration there could be an assignment for var
				VarUse varUse = 
				        declaFactory.createVarUse(node, varDeclaration);
				
				declaredVars.tryAdd(varDeclaration);
				if (varUse != null)
				{
				    declaredVars.tryAdd(varUse);
				}
			}
			else if (tree instanceof VarUsageNode)
			{
				VarUse vun = 
				        declaFactory.createVarUse(tree);
				declaredVars.tryAdd(vun);
			}
			else if (tree instanceof AssignOperationNode)
			{
				VarUse varWithAssignment = 
				        declaFactory.createVarUse((AssignOperationNode)tree);
				declaredVars.tryAdd(varWithAssignment);
			}
		}
		
		return declaredVars;
	}

}
