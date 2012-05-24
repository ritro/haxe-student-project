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

import imp.parser.antlr.HaxeParser;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

import tree.HaxeTree;
import tree.specific.NodeWithModifier;
import tree.specific.TypeTag;

public class Declaration extends NodeWithModifier 
{

    private enum PropertyAccessors
    {
        // method name that will be used as getter/setter
        FUNCTION,
        // the access is restricted from anywhere but its class' methods
        PRIVATE,
        // the access is a classic field access
        PUBLIC,
        // the access is done through a runtime-generated method
        DYNAMIC,
        // the access is never allowed, not even by means of Reflection
        // (not even from code within the same class)
        NEVER
    }
    
    private static final int PROPERTY_DECL = HaxeParser.PROPERTY_DECL;
	/** The name with type. */
	private String nameWithType = "";
	private PropertyAccessors setAccessor = null;
	private PropertyAccessors getAccessor = null;
    private boolean declaredWithoutType = false;
    protected DeclarationType declType  = DeclarationType.VarDeclaration;
    
    public enum DeclarationType
    {
        ClassVarDeclaration,// Class variable
        FunctionParameter,  // function parameter
        VarDeclaration      // other then class var declarations
    };

	/**
	 * Gets the name with type.
	 * 
	 * @return the name with type
	 */
	public String getNameWithType() {
		if (nameWithType.equals("")) {
			nameWithType = getText() + ": "
					+ getHaxeType().getShortTypeName();
		}
		return nameWithType;
	}

	public Declaration(final Token token) 
	{
	    super(token);
    }
	

    /**
	 * Returns node correspond for var name (in var tmp:Int = foo+bar; it will
	 * return "tmp").
	 * 
	 * @return the var name
	 */
	public String getText() 
	{
		return getToken().getText();
	}
    
    public boolean isDeclaredWithoutType()
    {
        return declaredWithoutType;
    }
	
	public boolean isProperty()
	{
	    return setAccessor != null || getAccessor != null;
	}
	
	public boolean isField()
	{
	    return setAccessor == null && getAccessor == null;
	}
    
    public void setDeclaratonType(DeclarationType type)
    {
        declType = type;
    }
	
	public DeclarationType getDeclaratonType()
	{
	    return declType;
	}
	
	public void updateInfo()
	{
	    HaxeTree init = getInitializationNode();
        if (init != null)
        {
            mostRightPosition = init.getMostRightPosition();
        }
	    updateInfoFromTags();
	    updateModifier();
	}

	public HaxeTree getInitializationNode() 
	{
		for (HaxeTree tree : getChildren()) 
		{
			if (tree.getToken().getType() == HaxeParser.EQ) 
			{
				return tree.getChild(0);
			}
		}
		return null;
	}
	
	private void updateInfoFromTags()
	{
        declaredWithoutType = true;
	    for (HaxeTree tree : getChildren()) 
	    {
	        int type = tree.getToken().getType();
            if (tree instanceof TypeTag) 
            {
                mostRightPosition = tree.getMostRightPosition();
                declaredWithoutType = false;
            } else if (type == PROPERTY_DECL
                    && tree.getChildCount() != 0)
            {
                getAccessor = getAccessor(tree.getChild(0).getText());
                setAccessor = getAccessor(tree.getChild(1).getText());
                mostRightPosition = tree.getChild(1).getMostRightPosition();
            }
        }
	}
	
	private static PropertyAccessors getAccessor(String str)
	{
	    if (str.equalsIgnoreCase("NULL"))
        {
            return PropertyAccessors.PRIVATE;
        }
        else if (str.equalsIgnoreCase("DYNAMIC"))
        {
            return PropertyAccessors.DYNAMIC;
        } 
        else if (str.equalsIgnoreCase("DEFAULT"))
        {
            return PropertyAccessors.PUBLIC;
        }
        else if (str.equalsIgnoreCase("NEVER"))
        {
            return PropertyAccessors.NEVER;
        }
	    
	    return PropertyAccessors.FUNCTION;
	}
	
	@Override
	protected void calculateMostLeftPosition()
	{
	    mostLeftPosition = ((CommonToken)token).getStartIndex();
	}
	
	@Override
	protected void calculateMostRightPosition()
	{
	    updateInfoFromTags();
	    if (mostRightPosition == -1)
	    {
	        mostRightPosition = ((CommonToken)token).getStopIndex();
	    }
	}
	
	@Override
	public boolean equals(Object obj)
	{
	    if (!(obj instanceof Declaration))
	    {
	        return false;
	    }
	    Declaration node = (Declaration)obj;
	    if (getText().equals(node.getText()) &&
	            token.equals(node.getToken()))
	    {
	        return true;
	    }
	    
	    return false;
	}
	
	@Override
	public String toString()
	{
	    return toString("declaration");
	}
}
