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
package tree.expression;


import org.antlr.runtime.Token;

import tree.HaxeTree;
import tree.type.HaxeType;

public class Usage extends Expression
{
    private HaxeTree declaration = null;
    
	/**
	 * Sets type to declaration of that variable
	 * and all it's entries.
	 * @param varType - the varType to set
	 */
    @Override
	public boolean setHaxeType(final HaxeType varType) 
	{
        if (declaration == null)
        {
            return false;
        }
	    return declaration.setHaxeType(varType);
	}
	
	@Override
	public HaxeType getHaxeType()
	{
	    if (declaration == null)
	    {
	        return super.getHaxeType();
	    }
	    return declaration.getHaxeType();
	}

	/**
	 * Instantiates a new variable usage. 
	 * @param token - token.
	 */
	public Usage(final Token token) 
	{
		super(token);
	}
    

    /**
	 * 
	 * @return if getText != null then getText, else lastchild.getText
	 */
	@Override
	public String getText() 
	{
		return super.getText();
	}
	
	public HaxeTree getDeclarationNode()
	{
	    return declaration;
	}
	
	public void setDeclarationNode(HaxeTree declaration)
	{
	    this.declaration = declaration; 
	}
	
	public String toString()
	{
	    return toString("usage");
	}    
	
	public int getIdentifierOffset()
    {
        return getTokenStartIndex();
    }

    public int getIdentifierLength()
    {
        return getTokenStopIndex() - getTokenStartIndex();
    }
}
