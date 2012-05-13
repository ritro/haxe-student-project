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
package tree.specific;

import imp.parser.antlr.HaxeParser;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import tree.HaxeTree;
import tree.Modifiers;

/**
 * The Class FunctionNode.
 * 
 * @author Anatoly Kondratyev
 */
public class Function extends NodeWithScopeAndModifier
{
    private static final int PARAM_LIST_TYPE = HaxeParser.PARAM_LIST;

	/** The full name with parameters. */
	private String fullNameWithParameters = "";
	
	/**
	 * Generates the string containing function
	 * name, function type, all parameters and 
	 * their's types.
	 */
	private void generateNameWithParameters()
	{
	    ArrayList<Declaration> paramList = 
	            getParametersAsDeclarations();
		String parameters = "";
		String comma = "";
		for (Declaration commonTree : paramList) 
		{
			parameters += comma
			        + commonTree.getHaxeType().getShortTypeName();
			comma = ", ";
		}
		fullNameWithParameters = getText() + " ("
				+ parameters + "): "
				+ typeToString();
	}

	/**
	 * Gets the full name with parameters.
	 * 
	 * @return the full name with parameters
	 */
	public String getFullNameWithParameters() 
	{
		if (fullNameWithParameters.equals("")) 
		{
		    generateNameWithParameters();
		}
		return fullNameWithParameters;
	}

	public Function(final Token t) {
		super(t);
	}

	/**
	 * @return the param list node
	 */
	public HaxeTree getParamListNode() {
		for (HaxeTree tree : getChildren()) 
		{
			Token token = (CommonToken) tree.getToken();
			if (token.getType() == PARAM_LIST_TYPE) {
				return tree;
			}
		}
		return null;
	}

	/**
	 * Gets the parameters as var usage.
	 * FIXME
	 * @return the parameters as var usage
	 */ 
	public ArrayList<Declaration> getParametersAsDeclarations() {
		ArrayList<Declaration> list = new ArrayList<Declaration>();
		HaxeTree parameters = getParamListNode();
		if (parameters == null)
		{
		    return list;
		}
		for (HaxeTree varDecl : parameters.getChildren()) 
		{
			list.add((Declaration) varDecl);
		}
		return list;
	}
	
	/**
	 * Constructor is the not-static function called "new".
	 * @return true - if it is constructor
	 */
	public boolean isConstructor()
	{
	    if (getText().equals("new") && modifier != Modifiers.STATIC)
	    {
	        return true;
	    }
	    
	    return false;
	}

	/**
	 * Gets the function name. 
	 * @return Only the function name.
	 */
	@Override
	public String getText() 
	{
		return getChild(0).getText();
	}
	
	@Override
	public String toString()
	{
	    return toString("function");
	}
	
	public void updateInfo()
	{
	    updateModifier();
	}
}
