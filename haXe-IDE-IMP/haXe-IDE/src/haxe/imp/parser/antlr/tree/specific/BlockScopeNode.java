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
import haxe.imp.parser.antlr.tree.specific.vartable.ClassDeclaration;
import haxe.imp.parser.antlr.tree.specific.vartable.DeclaredVarsTable;
import haxe.imp.parser.antlr.tree.specific.vartable.FunctionDeclaration;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclaration;
import haxe.imp.parser.antlr.tree.specific.vartable.VarUse;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclaration.VarType;
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
/**
 * @author Ritro
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
	public DeclaredVarsTable calculateScopes(){		
		DeclaredVarsTable declaredVars = new DeclaredVarsTable();

		for (HaxeTree tree : this.getChildren()) 
		{
			if (tree instanceof ClassNode)
			{
			    ClassDeclaration scdn = new ClassDeclaration(this.getToken(), 0);
			    scdn.addAllToDeclaredVars(tree.calculateScopes());
			    
				declaredVars.addWithIncrease(scdn);
			}
			else if (tree instanceof FunctionNode)
			{
				FunctionDeclaration functionDeclaration = createFunctionDeclaration((FunctionNode)tree);
				declaredVars.addWithIncrease(functionDeclaration);
				declaredVars.addWithIncrease(tree.calculateScopes());
			}
			else if (tree instanceof VarDeclarationNode)
			{
				VarDeclarationNode node = (VarDeclarationNode)tree;
				
				VarDeclaration varDeclaration = createVarDeclaration(node);
				//during declaration there could be an assignment for var
				VarUse varUse = createVarUse(node, varDeclaration);
				
				if (!declaredVars.contains(varDeclaration))
				{
				    declaredVars.addWithIncrease(varDeclaration);
				}
				else
				{
					//The same block scope contains two variable declarations 
					//with the same variable name - such overlay is forbidden
					varDeclaration.commitError("Var is already declared");
				}
				
				if (varUse != null)
				{
				    declaredVars.addWithIncrease(varUse);
				}
			}
			else if (tree instanceof VarUse)
			{
				VarUse vun = new VarUse(tree.getChild(0), tree.getToken()); 
				vun.setHaxeType(tree.getHaxeType());
				declaredVars.addWithIncrease(vun);
			}
			else if (tree instanceof AssignOperationNode)
			{
				VarUse varWithAssignment = createVarUse((AssignOperationNode)tree);
				declaredVars.addWithIncrease(varWithAssignment);
			}
		}
		
		return declaredVars;
	}
	
	/**
	 * Creates declaration usable for Var Declaration Table 
	 * for Function from it's tree node.
	 * @param Function Node from tree.
	 * @return Ready to operate with Function Declaration.
	 */
	private FunctionDeclaration createFunctionDeclaration(FunctionNode node)
	{
		FunctionDeclaration functionDeclaration = new FunctionDeclaration(node.getChild(0).getToken(), 0);
		functionDeclaration.setHaxeType(node.getHaxeType());
		if (node.getReturnNode() != null)
		{
		    /*
			HaxeTree returnN =  ((FunctionNode)tree).getReturnNode();
			VarUse vun = new VarUse(returnN, returnN.getToken(), 
					this.getToken());
			vun.setHaxeType(returnN.getHaxeType());
			sfd.setReturnNode(vun);*///FIXME
		}
		return functionDeclaration;
	}
	
	/**
	 * Creates declaration usable for Var Declaration Table
	 * for Var node from it's tree node. It created only declaration
	 * of var and no info about it's value assignments during declaration.
	 * @param Var node.
	 * @return Ready to operate with Var Declaration.
	 */
	private VarDeclaration createVarDeclaration(VarDeclarationNode node)
	{
		VarDeclaration varDeclaration = new VarDeclaration(node,0);
		varDeclaration.setHaxeType(node.getHaxeType());
		
		if (this.ifParentIsClass())
			varDeclaration.setVarType(VarType.ClassVarDecl);
		else if (this.ifParentIsFunction())
			varDeclaration.setVarType(VarType.FunctionVarDecl);
			
		return varDeclaration;
	}
	
	/**
	 * Creates declaration of assignment for Var node from it's tree 
	 * node info and previously created declaration for this var.
	 * This declaration can be used in Var Declaration Table as normal
	 * Var Use.
	 * @param Vars node.
	 * @param Previously created varDeclaration for that var.
	 * @return Ready to operate with Var Usage or if where was
	 * no usage it returns Null.
	 */
	private VarUse createVarUse(VarDeclarationNode node, VarDeclaration varDeclaration)
	{
		HaxeTree init = node.getVAR_INIT_NODE();
		VarUse varUse = null;
		if (init != null &&
			!init.ifUndefinedType() &&//primary
			varDeclaration.getHaxeType().getClassHierarchy().contains(init.getHaxeType()))//Undef too
			varDeclaration.setHaxeType(init.getHaxeType());
		else if (init != null)
		{
			varUse = new VarUse(node.getChild(0), varDeclaration.getToken(), 0);
			varUse.setHaxeType(varDeclaration.getHaxeType());
			varUse.setAssignExpr(new VarUse(init, init.getToken(), 0)); 
			varUse.getAssignExpr().setHaxeType(init.getHaxeType());
		}
		
		return varUse;
	}
	
	/**
	 * Creates declaration for assigning var a new value.
	 * @param assignOperation
	 * @return Ready to operate with Var Usage.
	 */
	private VarUse createVarUse(AssignOperationNode assignOperation)
	{
		VarUse varBeforeEquation = new VarUse(
				assignOperation.getLeftOperand(), 
				assignOperation.getLeftOperand().getToken());
		VarUse varAfterEquation = new VarUse(
				assignOperation.getRightOperand(), 
				assignOperation.getRightOperand().getToken());
		varAfterEquation.setHaxeType(assignOperation.getRightOperand().getHaxeType());
		varBeforeEquation.setAssignExpr(varAfterEquation);
		return varBeforeEquation;
	}
}
