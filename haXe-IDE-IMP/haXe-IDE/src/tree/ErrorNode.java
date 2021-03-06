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
import org.antlr.runtime.tree.CommonErrorNode;

import org.antlr.runtime.CommonToken;


/**
 * The Class ExtendedErrorNode.
 * 
 * @author Anatoly Kondratyev
 */
public class ErrorNode extends HaxeTree {

	/** The delegate. */
	org.antlr.runtime.tree.CommonErrorNode delegate;


	public ErrorNode(final TokenStream input, final Token start,
			final Token stop, final RecognitionException e) 
	{
		delegate = new CommonErrorNode(input, start, stop, e);
	}
	
	public ErrorNode(int throw1) {
        super(throw1);
    }

    @Override
	public CommonToken getToken()
	{
	    return (CommonToken)delegate.stop;
	}

	@Override
	public boolean isNil() {
		return delegate.isNil();
	}
	
	@Override
	public int getType() {
		return delegate.getType();
	}

	@Override
	public String getText() {
		return delegate.getText();
	}

	@Override
	public String toString() {
		return delegate.toString();
	}
	
	@Override
	public int getMostLeftPosition() {
		return ((CommonToken)delegate.start).getStartIndex();
	}
	
	@Override
	protected void calculateMostRightPosition() 
	{
		mostRightPosition = ((CommonToken)delegate.stop).getStopIndex();
	}
}
