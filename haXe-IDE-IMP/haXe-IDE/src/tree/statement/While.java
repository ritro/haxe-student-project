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
 * The Class WhileNode.
 * Tree : WHILE[WhileNode]^ parExpression statement
 * 
 * @author Anatoly Kondratyev
 *         Maria Savenko
 */
public class While extends Statement 
{
	public While(final Token token) 
	{
		super(token);
	}
    
    public HaxeTree getScope()
    {
        // the existence of block should be checked during
        // syntax parsing
        return getChild(1);
    }
    
    public HaxeTree getCondition()
    {
        return getChild(0);
    }
}
