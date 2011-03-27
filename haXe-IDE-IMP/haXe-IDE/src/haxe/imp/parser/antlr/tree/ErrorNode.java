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

import org.antlr.runtime.CommonToken;

/**
 * The Class ExtendedErrorNode.
 * 
 * @author Anatoly Kondratyev
 */
public class ErrorNode extends HaxeTree {

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
	public ErrorNode(final TokenStream input, final Token start,
			final Token stop, final RecognitionException e) {
		this.delegate = new CommonErrorNode(input, start, stop, e);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.runtime.tree.CommonTree#isNil()
	 */
	@Override
	public boolean isNil() {
		return this.delegate.isNil();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.runtime.tree.CommonTree#getType()
	 */
	@Override
	public int getType() {
		return this.delegate.getType();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.runtime.tree.CommonTree#getText()
	 */
	@Override
	public String getText() {
		return this.delegate.getText();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see haxe.imp.parser.antlr.tree.ExtendedCommonTree#toString()
	 */
	@Override
	public String toString() {
		return this.delegate.toString();
	}
	
	@Override
	public int getMostLeftPosition() {
		return ((CommonToken)delegate.start).getStartIndex();
	}
	
	@Override
	public int getMostRightPosition() {
		return ((CommonToken)delegate.stop).getStopIndex();
	}
}
