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
import org.antlr.runtime.tree.CommonTreeAdaptor;

// TODO: Auto-generated Javadoc
/**
 * The Class ExtendedTreeAdaptor.
 * 
 * @author Anatoly Kondratyev
 */
public class ExtendedTreeAdaptor extends CommonTreeAdaptor {
    
    /* (non-Javadoc)
     * @see org.antlr.runtime.tree.CommonTreeAdaptor#create(org.antlr.runtime.Token)
     */
    public Object create(Token token) {
        return new ExtendedCommonTree(token);
    }

    /* (non-Javadoc)
     * @see org.antlr.runtime.tree.CommonTreeAdaptor#dupNode(java.lang.Object)
     */
    public Object dupNode(Object t) {
        if (t == null) {
            return null;
        }
        return create(((ExtendedCommonTree) t).token);
    }

    /* (non-Javadoc)
     * @see org.antlr.runtime.tree.BaseTreeAdaptor#errorNode(org.antlr.runtime.TokenStream, org.antlr.runtime.Token, org.antlr.runtime.Token, org.antlr.runtime.RecognitionException)
     */
    public Object errorNode(TokenStream input, Token start, Token stop,
            RecognitionException e) {
        ExtendedErrorNode t = new ExtendedErrorNode(input, start, stop, e);
        return t;
    }
}
