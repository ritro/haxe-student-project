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
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.utils.Environment;
import haxe.imp.parser.antlr.utils.HaxeType;

import org.antlr.runtime.Token;

/**
 * The Class AssignOperationNode.
 * Type of the Assignment is type of assigned
 * expression.
 * @author kondratyev
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
	
    public AssignOperationNode(final Token t) {
        super(t);
    }

	public AssignOperationNode(final int ttype, final Token token) {
		super(token);
	}
	
	public void calculateScopes(Environment environment)
	{
        HaxeTree leftOperand = getLeftOperand();
        HaxeTree rightOperand = getRightOperand();
        
	    leftOperand.calculateScopes(environment);
        rightOperand.calculateScopes(environment);
	    
	    HaxeType assignmentType;
	    BoolOperations operationType = getOperationType();
	    
	    // null = means we have simple assignment
	    if (operationType != null)
	    {
	        assignmentType = defineResultType(operationType);
	        if (assignmentType == null)
	        {
	            commitInvalidAssignmentError();
	            return;
	        }
	    }
	    else
	    {
	        assignmentType = rightOperand.getHaxeType();	        
	    }
	    
	    setHaxeType(assignmentType);
	    if (leftOperand.ifUndefinedType())
	    {
	        leftOperand.setHaxeType(assignmentType);
	    }
	}
	
	@Override
	public void reportErrors()
	{
        HaxeTree leftOperand = getLeftOperand();
        HaxeTree rightOperand = getRightOperand();
        
        leftOperand.reportErrors();
        rightOperand.reportErrors();
        
        if (!HaxeType.isAvailableAssignement(
        		leftOperand.getHaxeType(), 
        		rightOperand.getHaxeType()))
        {
        	commitCastError();
        }
	}

    /**
     * The right part's type is not appropriate.
     */
    public void commitIncorrectTypeError()
    {
    	getRightOperand().commitError(
    			getRightOperand().getText() 
                + " should be "
                + getHaxeType().getShortTypeName());
    }

    /**
     * Then assignment is not in the right form.
     * TODO not really this class message - 
     * 		error nodes should have this
     * This is haxe official error message.
     */
    public void commitInvalidAssignmentError()
    {
        commitError("Invalid assign.");
    }
}
