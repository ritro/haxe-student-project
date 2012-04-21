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

import haxe.imp.parser.antlr.tree.BinaryOperaionContainer;

import org.antlr.runtime.Token;

/**
 * Example of assignment: x += 5.
 * 
 * @author kondratyev
 *         Maria Savenko
 */
public class AssignOperationNode extends BinaryOperaionContainer 
{
    @Override
    protected void defineOperationType()
    {
        String name = getText();
        String operationName = name.substring(0, Math.max(0, name.length() - 1));
        BoolOperations type = getOperationTypeByToken(operationName);
        // there is no way that can be not one of the following
        // types after this operation 
        // - PLUS, NUMERABLE, DIVIDE, BITWISE, Null
        setOperationType(type);
    }
    
    /**
     * Will return result type if all operands of valid types
     * for that operation or NULL (!) if they are not.
     */
    public HaxeType defineResultType()
    {
        BoolOperations operationType = getOperationType();
        HaxeType leftType = getLeftOperand().getHaxeType();
        HaxeType rightType = getRightOperand().getHaxeType();
        
        return super.defineResultType(operationType, leftType, rightType);
    }
	
    public AssignOperationNode(final Token t) 
    {
        super(t);
    }

	public AssignOperationNode(final int ttype, final Token token) 
	{
		super(token);
	}
	
	@Override
	public String toString()
	{
	    return "Assign [" + getText() + "]";
	}
}
