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
package tree;

import imp.parser.antlr.HaxeParser;

import java.util.ArrayList;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.imp.parser.IMessageHandler;

import antlr.Parser;

import tree.expression.MethodCall;
import tree.expression.Slice;
import tree.type.HaxeType;

public class HaxeTree extends GenericCommonTree<HaxeTree> 
{
	protected static IMessageHandler messageHandler = null;
	protected HaxeType haxeType = null;
	private boolean isDuplicate = false;

	/**
	 * Contains most left position of tree/subtree
	 */
	protected int mostLeftPosition = -1;
	protected int mostRightPosition = -1;

	public static final int SUFFIX_EXPR_TYPE = HaxeParser.SUFFIX_EXPR;
	
	public boolean isFieldUse()
	{
	    return getChildCount() > 0 && getChild(getChildCount() - 1).getText().equals(".");
	}
	
	public boolean isDuplicate()
	{
	    return isDuplicate;
	}
	
	public void setDuplicate(boolean isDuplicate)
	{
	    this.isDuplicate = isDuplicate;
	}
    
    public boolean setHaxeType(HaxeType type)
    {
        haxeType = type;
        return true;
    }

    public HaxeType getHaxeType() 
    {
        return haxeType; 
    }
    
    /**
     * If flag 'takeLastPossible' is set to true then
     * returns the type of the last object taken by
     * field uses, method calls and so on.
     * e.g.: obj.field1.method() will return the type of "method" call
     * @return type of the last accessed object or simple haxeType
     * for other types of Nodes
     */
    public HaxeType getHaxeType(boolean takeLastPossible) 
    {
        if (!takeLastPossible)
        {
            return getHaxeType();            
        }
        
        if (isFieldUse())
        {
            return getChild(0).getChild(0).getHaxeType(true);
        } 
        else if (this instanceof MethodCall)
        {
            return ((MethodCall)this).getHaxeType(true);
        }
        else if (this instanceof Slice)
        {
            return ((Slice)this).getHaxeType(true);
        }
        return getHaxeType();
    }
    
    public Module getModule()
    {
        if (this instanceof Module)
        {
            return (Module) this;
        }
        if (getParent() == null)
        {
            return null;
        }
        return getParent().getModule();
    }
    
    public String getPackage()
    {
        if (getParent() == null)
        {
            return "";
        }
        
        return getParent().getPackage();
    }

    /**
     * Gets the all children of current node and
     * all children of his children ... 
     * @return the all children starting from that
     * node
     */
    public ArrayList<HaxeTree> getAllChildren() 
    {
        ArrayList<HaxeTree> childs = new ArrayList<HaxeTree>();
        if (getChildCount() == 0) 
        {
            childs.add(this);//???????? FIXME
            return childs;            
        } 
        for (HaxeTree child : getChildren()) 
        {
            childs.addAll(child.getAllChildren());
        }
        return childs;
    }

	public static void setMessageHandler(final IMessageHandler messageHandler) {
		HaxeTree.messageHandler = messageHandler;
	}

	public static IMessageHandler getMessageHandler() {
		return messageHandler;
	}
	
	/**
	 * Calculates most right position for current tree only. 
	 */
	protected void calculateMostRightPosition()
	{
	    if (isFieldUse())
        {
            mostRightPosition = 
                    getAllChildren().get(getChildCount() - 1).getMostRightPosition();
            return;
        }

        CommonToken token = getToken();
        assert (token != null);

        mostRightPosition = 
                getTokenStartIndex() + token.getText().length();

        for (HaxeTree commonTree : getChildren())
        {
            mostRightPosition = Math.max(
                    mostRightPosition, 
                    commonTree.getMostRightPosition());
        }
	}
	
	/**
	 * Calculates most left position for current tree only. 
	 */
	protected void calculateMostLeftPosition()
	{
	    int type = token.getType();
	    if (type == HaxeParser.PROPERTY_DECL ||
	            type == HaxeParser.PARAM_LIST ||
	            type == HaxeParser.TYPE_PARAM ||
	            type == HaxeParser.TYPE_CONSTRAIN ||
	            type == HaxeParser.IMPLEMENT_LIST ||
	            type == HaxeParser.DECL_ATTR_LIST)
	    {
	        // for proper position counting while this types
	        // will not have a separate class we will do this
	        // TODO: make classes for this types
	        mostLeftPosition = 100500;
	    }
	    else
	    {
	        mostLeftPosition = getTokenStartIndex();
	    }
	    for (HaxeTree commonTree : getChildren()) 
		{
			int possibleMLP = 
					commonTree.getMostLeftPosition();
			if (mostLeftPosition > possibleMLP) 
			{
				mostLeftPosition = possibleMLP;
			}
		}
	}
	
	protected String typeToString()
	{
	    HaxeType type = getHaxeType();
	    return type == null ? "null" : type.getShortTypeName();
	}
    
    /**
     * Returns the info about node in that form:
     * '<'node name'>' [name in text] : 
     * type '<'left position, right position'>'
     */
    public String toString(final String className)
    {
        return String.format(
                    "%s [%s] : %s <%s,%s>", 
                    className,
                    getText(),
                    typeToString(),
                    getMostLeftPosition(),
                    getMostRightPosition());
    }
    
    /**
     * Use this instead of MostLeftPosition for
     * actions like renaming or call hierarchy.
     */
    public int getIdentifierOffset()
    {
        return getMostLeftPosition();
    }
    
    /**
     * Use this instead of MostRightPosition - MostLeftPosition 
     * for actions like renaming or call hierarchy.
     */
    public int getIdentifierLength()
    {
        return getMostRightPosition() - getMostLeftPosition() + 1;
    }

	/**
	 * Gets the most left position. If it is undefined
	 * then if tries to calculate it first. For multiword
	 * structures like 'public function N()' it will return
	 * the offset of the first letter of the word 'public'.
	 * @return the most left position
	 */
	public int getMostLeftPosition() 
	{
		if (mostLeftPosition == -1)
		{
			calculateMostLeftPosition();
		}
		
		return mostLeftPosition;
	}

	/**
	 * Gets most right position. If it is undefined
	 * then if tries to calculate it first. Fro multiword
	 * structures like 'public function N():Int' it will
	 * return the offset after the last letter int the word
	 * 'Int'.
	 * @return the most right position
	 */
    public final int getMostRightPosition()
    {
        if (mostRightPosition == -1)
        {
            calculateMostRightPosition();
        }        
        
        return mostRightPosition;
    }
    
    public final int getLength()
    {
        return getMostLeftPosition() - getMostRightPosition();
    }

	public HaxeTree(){}

	public HaxeTree(final Token t) 
	{
		super(t);
	}

	public HaxeTree(final int ttype) 
	{
	    this(new CommonToken(ttype));
	}

    public HaxeTree(final int ttype, final String type) 
    {
        this(new CommonToken(ttype, type));
    }

    /**
	 * Printing error messages in eclipse's text editor 
	 * (red circles at the left).
	 */	
	public void commitError(final String message) {
	    if (messageHandler == null)
	    {
	        return;
	    }
	    messageHandler.handleSimpleMessage(
	            message, 
	            getMostLeftPosition(), 
	            getMostRightPosition(),
	            0, 0, 1, 1);
	}
	
	public boolean isUndefinedType()
	{
	    return isUndefinedType(false);
	}
	
    public boolean isUndefinedType(boolean checkLastType)
    {
        return getHaxeType() == null;
    }
	
	/**
	 * Then we see symbol we are not expected to see
	 * commit this error.
	 * Official haxe error text used.
	 */
	public void commitUnexpectedError()
	{
	    commitError("Unexpected " + getText());
	}
}
