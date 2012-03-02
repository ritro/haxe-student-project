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
import haxe.imp.parser.antlr.tree.BlockScopeContainer;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.tree.utils.HaxeType;
import haxe.tree.utils.PrimaryHaxeType;

import java.util.ArrayList;

import org.antlr.runtime.Token;

/**
 * The Class ClassNode.
 * 
 * @author Anatoly Kondratyev
 */
public class ClassNode extends BlockScopeContainer {

	/** The class name. */
	private String className = "";

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

	public ClassNode(final Token t) {
		super(t);
	}
	
	public HaxeTree getInherits() {
		for (HaxeTree tree : getChildren()) 
		{
			if (tree.getType() == HaxeParser.INHERIT_LIST) 
			{
				return tree;
			}
		}
		return null;
	}
	
	private void initializeHaxeType()
	{
		//FIXME That's just name, not full name (missing packege declaration)
	    HaxeType type = new HaxeType(getClassName()); 
		
		if (getInherits() != null)
		{
	        ArrayList<HaxeType> list = new ArrayList<HaxeType>();
	        for (HaxeTree i : getInherits().getChildren())
	            list.add(new HaxeType(i.getChild(0).getText()));

	        type.setClassHierarchy(list);
		}

        setHaxeType(type);    
	}
    
    public HaxeTree getDeclaration(String name)
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
	
	/**
	 * class D extends A, implements B, implements C {} 
	 * Каждый экземпляр D будет иметь тип D, но также имеет типы A , B и C.
	 * 
	 * @return Class Name type with implemented types record for each class/interface  
	 * it extended/implemented
	 */
	@Override
	public HaxeType getHaxeType()
	{
	    if (super.getHaxeType() == PrimaryHaxeType.haxeUndefined)
	    {
	        initializeHaxeType();
	    }

		return super.getHaxeType();
	}
}
