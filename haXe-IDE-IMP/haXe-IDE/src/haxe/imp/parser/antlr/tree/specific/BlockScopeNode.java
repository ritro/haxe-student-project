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
import org.eclipse.jdt.internal.compiler.lookup.MostSpecificExceptionMethodBinding;

/**
 * Blocks can execute several expressions.
 * @author kondratyev
 */
/**
 * @author Savenko Maria
 *
 */
public class BlockScopeNode extends HaxeTree {

	private int lBracketPosition = -1;
	private int rBracketPosition = -1;

	/**
	 * Gets the l bracket position.
	 * 
	 * @return the l bracket position
	 */
	public int getlBracketPosition() {
		return this.lBracketPosition;
	}
	
	private void calculateRightBracketPosition()
	{
	    if (getChildCount() == 0) 
	    {
	        return;
	    }
	    
        HaxeTree lastchild = getChildren().get(getChildCount()-1);
        if (lastchild.getType() == HaxeParser.RBRACE) 
        {
            rBracketPosition = 
                    lastchild.getToken().getStopIndex();
        } else {
            // no right brace - return something
            rBracketPosition = 
                    lastchild.getMostRightPosition();
        }
	}

	/**
	 * Gets the r bracket position.
	 * 
	 * @return the r bracket position
	 */
	public int getrBracketPosition() {
		if (rBracketPosition == -1)
		{
		    calculateRightBracketPosition();
		}
		
		return rBracketPosition;
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
		return getlBracketPosition();
	}
	
	@Override
	protected void calculateMostRightPosition()
	{
	    mostRightPosition = getrBracketPosition();
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
		lBracketPosition = ((CommonToken) lBracket).getStartIndex();
	}
	
	/**
	 * We can have Variable Declarations with defined type, 
	 * function declarations. TODO what else?
	 * @return Variable table for class.
	 */
	public DeclaredVarsTable calculateClassScope()
	{
	    DeclaredVarsTable declaredVars = new DeclaredVarsTable();
	    
	    for (HaxeTree tree : getChildren()) 
        {
	        if (tree instanceof FunctionNode)
            {
                FunctionDeclaration functionDeclaration = 
                        VarDeclarationFactory.createFunctionDeclaration((FunctionNode)tree);
                declaredVars.tryAdd(functionDeclaration);
                declaredVars.addWithIncrease(tree.calculateScopes());
            }
	        else if (tree instanceof VarDeclarationNode)
            {
                VarDeclarationNode node = (VarDeclarationNode)tree;
                
                VarDeclaration varDeclaration = 
                        VarDeclarationFactory.createClassVarDeclaration(node);
                //during declaration there could be an assignment for var
                VarUse varUse = 
                        VarDeclarationFactory.createVarUse(node);
                
                declaredVars.tryAdd(varDeclaration);
                if (varUse != null)
                {
                    declaredVars.tryAdd(varUse);
                }
            }
            else if (tree.getType() == HaxeParser.RBRACE)
            {
                //right braces were added separately as IMP
                //wasn't counting them as meaningful chars
                continue;
            }
	        else
	        {
	            tree.commitError("Not supposed be here. (?)");
	        }
        }
	    
	    return declaredVars;
	}
	
	/**
	 * We can meet Var Declarations, Var Usages,
	 * TODO - if, while, for scopes,
	 * assignments (local functions also assignments).
	 * @return
	 */
	public DeclaredVarsTable calculateFunctionScope()
	{
	    DeclaredVarsTable declaredVars = new DeclaredVarsTable();
	    for (HaxeTree tree : getChildren()) 
        {
            if (tree instanceof VarDeclarationNode)
            {
                VarDeclarationNode node = (VarDeclarationNode)tree;
                
                VarDeclaration varDeclaration = 
                        VarDeclarationFactory.createFunctionVarDeclaration(node);
                //during declaration there could be an assignment for var
                VarUse varUse = 
                        VarDeclarationFactory.createVarUse(node);
                
                declaredVars.tryAdd(varDeclaration);
                if (varUse != null)
                {
                    declaredVars.tryAdd(varUse);
                }
            }
            else if (tree instanceof VarUsageNode)
            {
                VarUse vun = 
                        VarDeclarationFactory.createVarUse(tree);
                declaredVars.tryAdd(vun);
            }
            else if (tree instanceof AssignOperationNode)
            {
                VarUse varWithAssignment = 
                        VarDeclarationFactory.createVarUse((AssignOperationNode)tree);
                declaredVars.tryAdd(varWithAssignment);
            }
            else if (tree.getType() == HaxeParser.RBRACE)
            {
                //right braces were added separately as IMP
                //wasn't counting them as meaningful chars
                continue;
            }
            else
            {
                tree.commitError("Not supposed be here. (?)");
            }
        }
	    
	    return declaredVars;
	}

}
