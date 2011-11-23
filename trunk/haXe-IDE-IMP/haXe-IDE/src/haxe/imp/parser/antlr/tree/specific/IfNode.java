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

import org.antlr.runtime.Token;

/**
 * The Class IfNode.
 * 
 * @author Anatoly Kondratyev
 */
public class IfNode extends HaxeTree 
{
    
    private boolean ifLastInTheScope = false;
    
	public IfNode(final Token t) 
	{
		super(t);
	}

	/**
	 * f( expr-cond ) expr-1 [else expr-2]
	 * @return expr-cond
	 */
	public HaxeTree getCondition()
	{
		return getChild(0);
	}
	
	/**
	 * f( expr-cond ) expr-1 [else expr-2]
	 * @return expr-1
	 */
	public HaxeTree getIfBlock()
	{
		return getChild(1);
	}
	
	/**
	 * f( expr-cond ) expr-1 [else expr-2]
	 * @return expr-2
	 */
	public HaxeTree getElseBlock()
	{
		return getChildCount() == 3
		        ? getChild(2) //currently ElSe word is the third node
		        : null;
	}
	
	public void setIfLastInScope(boolean value)
	{
	    ifLastInTheScope = value;
	}
	
	@Override
	public void calculateScopes(Environment declarations)
    {
	    int thisIndex = getChildIndex();
	    int maxIndex = parent.getChildCount();
	    if (parent instanceof BlockScopeNode)
	    {
	        //Last in all Blockscopes always '}'
	        ifLastInTheScope = thisIndex == maxIndex - 2;	        
	    }
	    else
	    {
	        ifLastInTheScope = thisIndex == maxIndex - 1;
	    }
		
	    HaxeTree ifBlock = getIfBlock();
	    HaxeTree elseBlock = getElseBlock();
	    
	    ifBlock.calculateScopes(declarations);
	    
	    if (!ifLastInTheScope)
	    {
	        // If an if block is not supposed to return any value 
	        // (like in the middle of a Block)
	        // then both expr-1 and expr-2 can have different types 
	        // and the if block type will be Void.
	        setHaxeType(HaxeType.haxeVoid);
	        return;
	    }
	    
	    if (elseBlock == null)
        {
	        // If there is no else, and the if expression is false, 
	        // then the entire expression has type Void. 
	        // TODO check for if expr is false and setting the type accordingly?
            return;
        }
	    
	    elseBlock.calculateScopes(declarations);
	    
	    HaxeType type = ifBlock.getHaxeType();
	    if (elseBlock.getHaxeType().equals(type))
	    {
	        // If there is an else, then expr-1 and expr-2 must be of the same type and 
	        // this will be the type of the if expression
	        setHaxeType(type);	        
	    }
	    else
	    {
	        commitError("The blocks returns different value types.");	        
	    }
    }
}
