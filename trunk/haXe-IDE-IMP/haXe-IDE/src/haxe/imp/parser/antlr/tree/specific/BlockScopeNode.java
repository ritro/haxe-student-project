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

import java.util.ArrayList;

import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.HaxeTree;


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
	 */
	public void calculateClassScope(Environment declarations)
	{
	    ArrayList<FunctionNode> functions = new ArrayList<FunctionNode>();
	    for (HaxeTree tree : getChildren()) 
        {
	        if (tree instanceof FunctionNode)
            {
	            FunctionNode function = (FunctionNode)tree;
	            functions.add(function);
	            declarations.add(function);
            }
	        else if (tree instanceof VarDeclarationNode)
            {
                tree.calculateScopes(declarations.addToCopy(tree));
            }
            else if (tree.getType() == HaxeParser.RBRACE)
            {
                //right braces were added separately as IMP
                //wasn't counting them as meaningful chars
                continue;
            }
	        else
	        {
	            tree.commitUnexpectedError();
	        }
        }
	    
	    for (FunctionNode function : functions)
	    {
	        function.calculateScopes(declarations);
	    }
	}
	
	/**
	 * We can meet Var Declarations, Var Usages,
	 * TODO - if, while, for scopes,
	 * assignments (local functions also assignments).
	 */
	public void calculateFunctionScope(Environment declarations)
	{
	    for (HaxeTree tree : getChildren()) 
        {
            if (tree instanceof VarDeclarationNode)
            {
                declarations.add(tree);
                tree.calculateScopes(declarations);
            }
            else if (tree instanceof VarUsageNode)
            {
                tree.calculateScopes(declarations);
            }
            else if (tree instanceof AssignOperationNode)
            {
                tree.calculateScopes(declarations);
            }
            else if (tree.getType() == HaxeParser.RBRACE)
            {
                //right braces were added separately as IMP
                //wasn't counting them as meaningful chars
                continue;
            }
            else
            {
                tree.commitUnexpectedError();
            }
        }
	}
	
    /*
    public void calculateTypes() {
        boolean ifChanged = false;
        
        do {
            ifChanged = false;
            for (VarDeclaration tree : this) {
                if (tree instanceof FunctionDeclaration) {
                    FunctionDeclaration fdn = (FunctionDeclaration) tree;
                    if (fdn.ifUndefinedType()) 
                    {
                        fdn.setHaxeType(HaxeType.haxeVoid); //??
                        ifChanged = true;
                    }
                } else if (tree instanceof ClassDeclaration) {
    
                } else if (tree instanceof VarUse) {
                    VarUse vun = (VarUse) tree;
                    if (vun.getAssignExpr() != null
                            && !vun.getAssignExpr().ifUndefinedType()
                            && vun.ifUndefinedType()) 
                    {
                        setDeclaredVarType(vun.getText(),vun.getVarNumber(), 
                                vun.getAssignExpr().getHaxeType());
                        ifChanged = true;
                    } else if (vun.getAssignExpr() == null) 
                    {
                        //do nothing??
                    }
                }
            }
        } while (ifChanged);
        markErrors();
    }
    
    public void markErrors()
    {
        for (VarDeclaration tree : this) {
            if (tree instanceof FunctionDeclaration) {
                FunctionDeclaration fdn = (FunctionDeclaration) tree;
                if (fdn.getHaxeType().equals(HaxeType.haxeVoid) 
                        && fdn.getReturnNode() != null) {
                    //fdn.getReturnNode().commitStrangeDecl();
                } else if (!fdn.getHaxeType().equals(HaxeType.haxeVoid) 
                           && fdn.getReturnNode() == null) {
                    fdn.commitNullReturnError();
                } else if (!fdn.getHaxeType().equals(HaxeType.haxeVoid) 
                           && !fdn.getReturnNode().ifUndefinedType() // check if right return type
                           && !fdn.getReturnNode().getHaxeType().equals(fdn.getHaxeType())) {
                         fdn.getReturnNode().commitIncorrectReturnTypeError();
                }
            } else if (tree instanceof ClassDeclaration) {

            } else if (tree instanceof VarUse) {
                VarUse vun = (VarUse) tree;
                if (findDeclaredVar(vun.getText()) == null)
                {
                    vun.commitUndeclaredError();
                } else if (vun.getAssignExpr() != null
                        && !vun.getAssignExpr().ifUndefinedType()
                        && !HaxeType.isAvailableAssignement(vun.getHaxeType(), 
                                vun.getAssignExpr().getHaxeType())) {
                    vun.commitIncorrectAssignmentError();
                }
            } else if (tree.getDeclType() == VarType.ClassVarDeclaration
                    && tree.ifUndefinedType())
                tree.commitClassUndefinedTypeError();
        }
    }*/
}
