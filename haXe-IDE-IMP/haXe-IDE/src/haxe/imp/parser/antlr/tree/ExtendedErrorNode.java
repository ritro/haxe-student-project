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
package haxe.imp.parser.antlr.tree;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonErrorNode;

// TODO: Auto-generated Javadoc
/**
 * The Class ExtendedErrorNode.
 * 
 * @author Anatoly Kondratyev
 */
public class ExtendedErrorNode extends ExtendedCommonTree {
    
    /** The delegate. */
    org.antlr.runtime.tree.CommonErrorNode delegate;

    /**
	 * Instantiates a new extended error node.
	 * 
	 * @param input
	 *            the input
	 * @param start
	 *            the start
	 * @param stop
	 *            the stop
	 * @param e
	 *            the e
	 */
    public ExtendedErrorNode(TokenStream input, Token start, Token stop,
            RecognitionException e) {
        delegate = new CommonErrorNode(input, start, stop, e);
    }

    /* (non-Javadoc)
     * @see org.antlr.runtime.tree.CommonTree#isNil()
     */
    public boolean isNil() {
        return delegate.isNil();
    }

    /* (non-Javadoc)
     * @see org.antlr.runtime.tree.CommonTree#getType()
     */
    public int getType() {
        return delegate.getType();
    }

    /* (non-Javadoc)
     * @see org.antlr.runtime.tree.CommonTree#getText()
     */
    public String getText() {
        return delegate.getText();
    }

    /* (non-Javadoc)
     * @see haxe.imp.parser.antlr.tree.ExtendedCommonTree#toString()
     */
    public String toString() {
        return delegate.toString();
    }
}
