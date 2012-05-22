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
package tree;


import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;

import tree.specific.ErrorNode;

/**
 * The Class ExtendedTreeAdaptor.
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeTreeAdaptor extends CommonTreeAdaptor {

	@Override
	public Object create(final Token token) {
		return new HaxeTree(token);
	}

	@Override
	public Object dupNode(final Object t) {
		if (t == null) {
			return null;
		}
		return create(((HaxeTree) t).token);
	}

	@Override
	public Object errorNode(final TokenStream input, final Token start,
			final Token stop, final RecognitionException e) {
		ErrorNode t = new ErrorNode(input, start, stop, e);
		return t;
	}
}
