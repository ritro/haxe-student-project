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
package tree.statement;


import org.antlr.runtime.Token;

import tree.HaxeTree;

/**
 * The Class ForNode.
 * Tree: FOR<ForNode>^ LPAREN! expr IN! iterExpr RPAREN! statement
 * 
 * @author Anatoly Kondratyev
 */
public class For extends Statement 
{	
    public For(final Token t) 
	{
		super(t);
	}
	
	public HaxeTree getScope()
	{
	    return getChild(2);
	}
	
	/**
	 * Variable which will have the iterator's current value.
	 * This will be the Usage in any case (not the Declaration)
	 */
	public HaxeTree getLocalVariable()
	{
	    return getChild(0);
	}
	
	public HaxeTree getIterator()
	{
	    return getChild(1);
	}
}
