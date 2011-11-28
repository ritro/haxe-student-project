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
import haxe.imp.parser.antlr.utils.Environment;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.parser.antlr.utils.PrimaryHaxeType;

import org.antlr.runtime.Token;

/**
 * The Class VarUsage.
 * 
 * @author kondratyev
 */
public class ReturnNode extends HaxeTree 
{
    private FunctionNode function = null;

	/**
	 * Instantiates a new var usage.
	 * 
	 * @param t
	 *            the t
	 */
	public ReturnNode(final Token t) {
		super(t);
	}
	
	/**
	 * 
	 * @return if getText != null then getText, else lastchild.getText
	 */
	@Override
	public String getText() {
		if (this.getChildCount() == 0) 
			return super.getText();
		
		return getExpression().getText();
	}
	
	@Override
	public void calculateScopes(Environment declarations)
	{
	    // due to Antlr grammar the places there Return wasnt
	    // expected already marked as Error nodes - so there
	    // is no variant that function will be null
	    setFunction(declarations.getLastFunction());
	    
	    HaxeTree expression = getExpression();
	    //nothing to do anymore
	    if (expression == null)
	    {
	        return;
	    }
	    expression.calculateScopes(declarations);
	}
	
	@Override
	public void reportErrors()
	{
        HaxeTree expression = getExpression();
        HaxeType type = getHaxeType();
        
	    if (function != null && type == PrimaryHaxeType.haxeVoid)
	    {
	        commitError("Void should be " + type.toString());
	        return;
	    }
	    
	    if (function.getHaxeType() != type)
	    {
	        expression.commitError(expression.getHaxeType()
	                + " should be " + type);
	    }	    
	}
	
	public void setFunction(FunctionNode function)
	{
	    this.function = function;
	}
	
	@Override
	public HaxeType getHaxeType()
	{
	    HaxeTree expression = getExpression(); 
	    if (expression == null)
        {
	        setHaxeType(PrimaryHaxeType.haxeVoid);
        }
	    else
	    {
	        setHaxeType(expression.getHaxeType());
	    }
	    return super.getHaxeType();
	}
	
	/**
	 * Gets the expression which will be
	 * returned.
	 * @return Returning expression or null
	 * if nothing being returned.
	 */
	private HaxeTree getExpression()
	{
	    if (getChildCount() == 0 )
	    {
	        return null;
	    }
	    
	    return getChild(0);
	}
}
