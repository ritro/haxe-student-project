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

import imp.parser.antlr.main.HaxeParser;
import imp.parser.antlr.tree.HaxeTree;
import imp.parser.antlr.tree.Modifiers;
import imp.parser.antlr.tree.NodeWithScopeAndModifier;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

/**
 * The Class FunctionNode.
 * 
 * @author Anatoly Kondratyev
 */
public class FunctionNode extends NodeWithScopeAndModifier
{
    private static final int PARAM_LIST_TYPE = HaxeParser.PARAM_LIST;
    private static final int TYPE_TAG_TYPE = HaxeParser.TYPE_TAG;

	/** The full name with parameters. */
	private String fullNameWithParameters = "";
	
	/**
	 * Generates the string containing function
	 * name, function type, all parameters and 
	 * their's types.
	 */
	private void generateNameWithParameters()
	{
	    ArrayList<VarDeclarationNode> paramList = 
	            getParametersAsDeclarations();
		String parameters = "";
		String comma = "";
		for (VarDeclarationNode commonTree : paramList) 
		{
			parameters += comma
			        + commonTree.getHaxeType().getShortTypeName();
			comma = ", ";
		}
		fullNameWithParameters = getText() + " ("
				+ parameters + "): "
				+ getHaxeType().getShortTypeName();
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

	public FunctionNode(final Token t) {
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
	public ArrayList<VarDeclarationNode> getParametersAsDeclarations() {
		ArrayList<VarDeclarationNode> list = new ArrayList<VarDeclarationNode>();
		HaxeTree parameters = getParamListNode();
		if (parameters == null)
		{
		    return list;
		}
		for (HaxeTree varDecl : parameters.getChildren()) 
		{
			list.add((VarDeclarationNode) varDecl);
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
	    return "function [" + getText() + "]";
	}
	
	public void updateInfo()
	{
	    updateModifier();
	}
}
