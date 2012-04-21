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
import haxe.tree.utils.HaxeTypeUtils;

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
	
	public void setFunction(FunctionNode function)
	{
	    this.function = function;
	}
    
    public FunctionNode getFunction()
    {
        return function;
    }
	
	@Override
	public HaxeType getHaxeType()
	{
	    HaxeTree expression = getExpression(); 
	    if (expression == null)
        {
	        setHaxeType(HaxeTypeUtils.getVoid());
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
	public HaxeTree getExpression()
	{
	    if (getChildCount() == 0 )
	    {
	        return null;
	    }
	    
	    return getChild(0);
	}
	
	public String toString()
	{
	    String type = haxeType == null ? "null" : haxeType.toString();
	    return 
	            "return : " + 
	            type;
	}
}
