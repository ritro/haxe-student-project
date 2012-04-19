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

import haxe.imp.parser.antlr.tree.HaxeTree;

import org.antlr.runtime.Token;

/**
 * The Class WhileNode.
 * Tree : WHILE[WhileNode]^ parExpression statement
 * 
 * @author Anatoly Kondratyev
 *         Maria Savenko
 */
public class WhileNode extends HaxeTree 
{
	public WhileNode(final Token token) 
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
