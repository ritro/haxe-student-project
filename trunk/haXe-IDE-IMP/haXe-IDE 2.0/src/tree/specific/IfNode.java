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

import imp.parser.antlr.tree.HaxeTree;

import org.antlr.runtime.Token;

/**
 * The Class IfNode.
 * 
 * @author Anatoly Kondratyev
 */
public class IfNode extends HaxeTree 
{
    
    private boolean ifLastInTheScope = false;
    
	public IfNode(final Token t) 
	{
		super(t);
	}

	/**
	 * f( expr-cond ) expr-1 [else expr-2]
	 * @return expr-cond
	 */
	public HaxeTree getCondition()
	{
		return getChild(0);
	}
	
	/**
	 * f( expr-cond ) expr-1 [else expr-2]
	 * @return expr-1
	 */
	public HaxeTree getIfBlock()
	{
		return getChild(1);
	}
	
	/**
	 * f( expr-cond ) expr-1 [else expr-2]
	 * @return expr-2
	 */
	public HaxeTree getElseBlock()
	{
		return getChildCount() == 3
		        ? getChild(2) //currently ElSe word is the third node
		        : null;
	}
	
	public void setIfLastInScope(boolean value)
	{
	    ifLastInTheScope = value;
	}
    
    /**
     * If an if block is not supposed to return any value 
     * (like in the middle of a Block) then both expr-1 
     * and expr-2 can have different types and the if 
     * block type will be Void.
     * @return true if this node is last in the parent
     * block.
     */
    public boolean isLastInScope()
    {
        return ifLastInTheScope;
    }
}
