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
 * The Class AssignOperationNode.
 * 
 * @author kondratyev
 */
public class AssignOperationNode extends HaxeTree {

	/**
	 * Gets the left part of equation.
	 * @return Left part of equation.
	 */
	public HaxeTree getLeftOperand()
	{
		// it could be not only VarUsage but also field access or slice
		return getChild(0);
	}
	
	/**
	 * Gets the right part of equation.
	 * @return Right part of equation.
	 */
	public HaxeTree getRightOperand()
	{
		return getChild(1);
	}

	public AssignOperationNode(final int ttype, final Token token) {
		this.token = token;
	}

	public AssignOperationNode(final int ttype, final boolean auxiliary) {
		super(ttype, auxiliary);
	}
	
	public void calculateScopes(Environment environment)
	{
	    getRightOperand().calculateScopes(environment);
	    getLeftOperand().calculateScopes(environment);
	    //FIXME chechk types
	}

    /**
     * The right part's type is not appropriate.
     */
    public void commitIncorrectTypeError()
    {
        commitError(getText() 
                + " should be "
                + getHaxeType().getShortTypeName());
    }

    /**
     * Then assignment is not in the right form.
     * This is haxe official error.
     */
    public void commitInvalidAssignmentError()
    {
        commitError("Invalid assign.");
    }
}
