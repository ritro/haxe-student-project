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
 * The Class SwitchNode.
 * 
 * @author Anatoly Kondratyev
 */
public class SwitchNode extends Statement 
{
	public SwitchNode(final Token t) 
	{
		super(t);
	}
}
