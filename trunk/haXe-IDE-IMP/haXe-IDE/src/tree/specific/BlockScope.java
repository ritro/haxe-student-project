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
package tree.specific;


import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import tree.HaxeTree;
import tree.specific.type.HaxeType;
import tree.utils.TypeUtils;

/**
 * Blocks can execute several expressions.
 * @author kondratyev
 *          Savenko Maria
 */
public class BlockScope extends HaxeTree {

	private int leftBracketPosition = -1;
	private int rightBracketPosition = -1;

	/**
	 * Gets the left bracket position in original text. 
	 * @return the left bracket position
	 */
	public int getLeftBracketPosition() 
	{
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
        rightBracketPosition = 
                    lastchild.getMostRightPosition();
	}

	/**
	 * Gets the right bracket position in 
	 * original text.
	 * @return the right bracket position
	 */
	public int getRBracketPosition() 
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
	    mostRightPosition = getRBracketPosition();
	}
	
	/**
	 * A block evaluates to the TYPE of the last expression of the block.
	 * As an exception, the empty block { } evaluates to Void.
	 */
	@Override
	public HaxeType getHaxeType()
	{
	    if (haxeType != null)
	    {
	        return super.getHaxeType();
	    }
	    int childCount = getChildCount();
	    if (childCount == 0)
	    {
	        setHaxeType(TypeUtils.getVoid());
	    }
	    else
	    {
	        HaxeTree lastChild = getChild(childCount - 1);
	        setHaxeType(lastChild.getHaxeType());
	    }
	    
        return super.getHaxeType();
	}
	
	@Override
	public String getText()
	{
	    return parent.getText();
	}

    public BlockScope(int blockScope, final Token lBracket, final Token rBracket) 
    {
        super(blockScope, "BlockScope");
        leftBracketPosition = ((CommonToken) lBracket).getStartIndex();
        rightBracketPosition = ((CommonToken) rBracket).getStopIndex();
    }
}
