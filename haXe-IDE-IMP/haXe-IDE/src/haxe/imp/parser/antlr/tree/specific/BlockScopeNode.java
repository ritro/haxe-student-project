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
import haxe.imp.parser.antlr.utils.Environment;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.parser.antlr.utils.PrimaryHaxeType;


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

	private int leftBracketPosition = -1;
	private int rightBracketPosition = -1;

	/**
	 * Gets the left bracket position in original text. 
	 * @return the left bracket position
	 */
	public int getLeftBracketPosition() {
		return leftBracketPosition;
	}
	
	private void calculateRightBracketPosition()
	{
	    int childCount = getChildCount();
	    if (childCount == 0) 
	    {
	        return;
	    }
	    
        HaxeTree lastchild = getChildren().get(childCount-1);
        if (lastchild.getType() == HaxeParser.RBRACE) 
        {
            rightBracketPosition = 
                    lastchild.getToken().getStopIndex();
        } else {
            // no right brace - return something
            rightBracketPosition = 
                    lastchild.getMostRightPosition();
        }
	}

	/**
	 * Gets the right bracket position in 
	 * original text.
	 * @return the right bracket position
	 */
	public int getrBracketPosition() 
	{
		if (rightBracketPosition == -1)
		{
		    calculateRightBracketPosition();
		}
		
		return rightBracketPosition;
	}
	
	@Override
	public int getMostLeftPosition() 
	{
		return getLeftBracketPosition();
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
	@Override
	public HaxeType getHaxeType()
	{
	    int childCount = getChildCount();
	    if (childCount == 0)
	    {
	        return PrimaryHaxeType.haxeVoid;
	    }
	    
	    HaxeTree lastChild = getChild(childCount - 1);
		return lastChild.getHaxeType();
	}

	public BlockScopeNode(final int blockScope, final String string,
			final boolean b, final Token lBracket) {
		super(blockScope, string, b);
		leftBracketPosition = ((CommonToken) lBracket).getStartIndex();
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
	            declarations.put(function);
            }
	        else if (checkForCommonClassMember(declarations, tree))
	        {
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
            if (checkForCommonClassMember(declarations, tree))
            {
                continue;
            }
            else if (tree instanceof VarUsageNode)
            {
                tree.calculateScopes(declarations);
            }
            else if (tree instanceof AssignOperationNode)
            {
                tree.calculateScopes(declarations);
            }
            else if (tree instanceof IfNode)
            {
                tree.calculateScopes(declarations);
            }
            else
            {
                tree.commitUnexpectedError();
            }
        }
	}
	
	@Override
	public void calculateScopes(Environment declarations)
	{
	    calculateFunctionScope(declarations);
	}
	
	private boolean checkForCommonClassMember(Environment declarations, HaxeTree tree)
	{
        if (tree instanceof VarDeclarationNode)
        {
            declarations.put(tree);
            tree.calculateScopes(declarations);
            return true;
        }
        else if (tree.getType() == HaxeParser.RBRACE)
        {
            //right braces were added separately as IMP
            //wasn't counting them as meaningful chars
            return true;
        }
        
        return false;
	}
	
	@Override
	public void reportErrors()
    {
	    for (HaxeTree tree : getChildren()) 
        {
	        tree.reportErrors();
        }
    }
}
