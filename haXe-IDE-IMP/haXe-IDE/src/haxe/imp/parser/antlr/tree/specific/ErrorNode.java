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
			final Token stop, final RecognitionException e) {
		this.delegate = new CommonErrorNode(input, start, stop, e);
	}

	@Override
	public boolean isNil() {
		return this.delegate.isNil();
	}
	
	@Override
	public int getType() {
		return this.delegate.getType();
	}

	@Override
	public String getText() {
		return this.delegate.getText();
	}

	@Override
	public String toString() {
		return this.delegate.toString();
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
