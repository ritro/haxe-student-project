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
package imp.parser.antlr.tree.specific;

import imp.parser.antlr.tree.HaxeTree;

import java.util.ArrayList;
import java.util.List;


import org.antlr.runtime.Token;

/**
 * The Class ClassNode.
 * 
 * @author Anatoly Kondratyev
 *         Maria Savenko
 */
public class ClassNode extends HaxeType 
{
	/** The class name. */
	private String className = "";
	private HaxeType extention = null;
	private List<HaxeType> paramTypes = null;

	public String getClassName() 
	{
		if (className.equals("")) 
		{
			className = getText();
		}
		return className;
	}

	public ClassNode(final Token t) 
	{
		super(t);
		paramTypes = new ArrayList<HaxeType>();
	}
	
	public void addToParamTypes(final HaxeType type)
	{
	    paramTypes.add(type);
	}
	
	public List<HaxeType> getParameterTypes()
	{
	    return paramTypes;
	}
	
	public HaxeType getParentToExtend()
	{
	    return extention;
	}
	
	public void setParentToExtend(final HaxeType extend)
	{
	    extention = extend;
	}
	
	@Override
    public HaxeTree getDeclaration(final String name)
    {
        // 1 - class member, inherit fields
        // 2 - curr class static fields
        // 3 - enums declared
        for (HaxeTree child : getBlockScope().getChildren())
        {
            if (child.getText().equals(name))
            {
                return child;
            }
        }
        
        return null;
    }
    
	@Override
	public HaxeType getHaxeType()
	{
	    return this;
	}
    
    @Override
    public String toString()
    {
        return "class [" + getText() + "]";
    }
}
