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
 * The Class DoWhileNode.
 * 
 * @author Anatoly Kondratyev
 */
public class DoWhileNode extends HaxeTree {

	public DoWhileNode() {
		super();
	}

	public DoWhileNode(final HaxeTree node) {
		super(node);
	}

	public DoWhileNode(final Token t) {
		super(t);
	}
}