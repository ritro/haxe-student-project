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

import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.HaxeTree;

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

	/**
	 * Gets the class name.
	 * 
	 * @return the class name
	 */
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
	}
	
	public HaxeTree getParentToExtend()
	{
	    return extention;
	}
	
	/**
	 * class D extends A, implements B, implements C {} 
	 * Каждый экземпляр D будет иметь тип D, но также имеет типы A , B и C.
	 * 
	 * @return Class Name type with implemented types record for each class/interface  
	 * it extended/implemented
	 */
	public void analizeInherits()
	{
	    for (HaxeTree child : getChildren())
	    {
	        if (child.getType() == HaxeParser.EXTENDS)
	        {
	            HaxeTree found = child.getChild(0);
	            if (found instanceof HaxeType)
	            {
	                extention = (HaxeType)found;
	                addToTypeHierarchy(extention);
	            }
	        }
	        if (child.getType() == HaxeParser.IMPLEMENT_LIST)
	        {
	            for (HaxeTree type : child.getChildren())
	            {
	                if (type instanceof HaxeType)
	                {
	                    addToTypeHierarchy((HaxeType)type);
	                }
	            }
	        }
	    }
	}
	
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
}
