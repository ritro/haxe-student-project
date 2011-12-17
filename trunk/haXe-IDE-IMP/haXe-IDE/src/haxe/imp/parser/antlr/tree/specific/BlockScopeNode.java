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
import haxe.tree.utils.HaxeType;
import haxe.tree.utils.PrimaryHaxeType;


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
}
