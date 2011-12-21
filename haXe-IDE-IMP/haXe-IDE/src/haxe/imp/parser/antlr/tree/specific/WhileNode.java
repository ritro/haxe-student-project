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

import haxe.imp.parser.antlr.tree.BlockScopeContainer;

import org.antlr.runtime.Token;

/**
 * The Class WhileNode.
 * 
 * @author Anatoly Kondratyev
 */
public class WhileNode extends BlockScopeContainer 
{
	public WhileNode(final Token token) 
	{
		super(token);
	}

}
