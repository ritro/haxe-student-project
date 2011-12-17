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
package haxe.tree.utils;


import java.util.ArrayList;

/**
 * The Class HaxeType.
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeType {

	private ArrayList<HaxeType> classHierarchy = new ArrayList<HaxeType>();
	private ArrayList<HaxeType> implementedTypes = new ArrayList<HaxeType>();

	protected String typeName;
	protected String fullTypeName;

    /**
     * Gets the class hierarchy.
     * 
     * @return the classHierarchy
     */
    public ArrayList<HaxeType> getClassHierarchy() {
        return classHierarchy;
    }

    /**
     * Sets the class hierarchy.
     * 
     * @param classHierarchy
     *            the classHierarchy to set
     */
    public void setClassHierarchy(final ArrayList<HaxeType> classHierarchy) {
        this.classHierarchy = classHierarchy;
    }

    /**
     * Gets the type name.
     * 
     * @return the typeName
     */
    public String getShortTypeName() {
        return typeName;
    }

    /**
     * Gets the full type name.
     * 
     * @return the fullTypeName
     */
    public String getFullTypeName() {
        return fullTypeName;
    }

	/**
	 * Checks if is available assignement.
	 * 
	 * @return true, if is available assignement
	 */
	public static boolean isAvailableAssignement(
	        final HaxeType type1, final HaxeType type2) 
	{
		if (type1.equals(type2) || isExtendedClass(type1, type2)) {
			return true;
		}
		return false;
	}

	/**
	 * Checks if is extended class.
	 * 
	 * @return true, if is extended class
	 */
	public static boolean isExtendedClass(
	        final HaxeType parent, final HaxeType child) 
	{
		if (child.getClassHierarchy() != null)
		{
	        return false;
		}
		
		if (child.getClassHierarchy().contains(parent)) 
		{
			return true;
		} 
		else for (HaxeType i : child.getClassHierarchy())
		{
			if (isExtendedClass(parent, i))
				return true;
		}
		
		return false;
	}

	/**
	 * For two types returns the type which hierarhy consumes
	 * another type. 
	 * @return the common type or null if they have nothing in
	 * common
	 */
	public static HaxeType getCommonPrimaryType(
	        final HaxeType type1,
			final HaxeType type2) 
	{
	    // if the equal then this is the common type
	    if (type1.equals(type2))
	    {
	        return type1;
	    }
	    
	    // mb One of them is in the hierarchy of Other
	    // then Other is their common type
	    ArrayList<HaxeType> type1Hierarchy = type1.getClassHierarchy();
	    if (type1Hierarchy != null && type1Hierarchy.contains(type2))
	    {
	        return type2;
	    }
	    
        ArrayList<HaxeType> type2Hierarchy = type2.getClassHierarchy();
	    if (type2Hierarchy != null && type2Hierarchy.contains(type1))
	    {
	        return type1;
	    }
	    
	    // we have to look their hierarchies deeper
	    HaxeType typeFromHierarhy = null;
	    for (HaxeType type : type1Hierarchy)
	    {
	        typeFromHierarhy = getCommonPrimaryType(type, type2);
	    }
	    
	    if (typeFromHierarhy != null)
	    {
	        return typeFromHierarhy;
	    }
        
        for (HaxeType type : type2Hierarchy)
        {
            typeFromHierarhy = getCommonPrimaryType(type, type1);
        }
	    
	    return typeFromHierarhy;
	}
	
	/**
	 * Compares two types to detect if they can be compared (?)
	 * @return true if ...
	 */
	public static boolean ifCommonType(final HaxeType type1, final HaxeType type2)
	{
	    //FIXME implement
	    return false;
	}

	/**
	 * Sets properties identical to some already known type.
	 * Usually to some primaty type.
	 * @param type - from which properties will be copied.
	 */
	protected void setIdenticalProperties(final HaxeType type) {
		classHierarchy = type.classHierarchy;
		fullTypeName = type.fullTypeName;
		implementedTypes = type.implementedTypes;
		typeName = type.typeName;
	}

	@Override
	public String toString() {
		return getFullTypeName().length() != 0 
		        ? getFullTypeName()
				: getShortTypeName();
	}

	@Override
	public boolean equals(final Object arg0) 
	{
		/**
		 * FIXME 
		 */
	    HaxeType type = (HaxeType)arg0;
	    String shortName = type.getShortTypeName();
		return shortName.equals(getShortTypeName());
	}
	
	protected HaxeType(){};
	
    /**
     * Instantiates a new haxe type.
     * @param fullTypeName - if you expect to create a whole new type
     * provide a full name, else you can use a short name - the type
     * properties will be copied from already existing type.
     */
    public HaxeType(final String fullTypeName) 
    {
        HaxeType primatyType = PrimaryHaxeType.tryGetPrimaryType(fullTypeName);
        if (primatyType != null)
        {
            setIdenticalProperties(primatyType);
            return;
        }
        else if (fullTypeName.equalsIgnoreCase("Undefined")) 
        {
            setIdenticalProperties(PrimaryHaxeType.haxeUndefined);
            return;
        }
        this.fullTypeName = fullTypeName;
        typeName = extractShortName(fullTypeName);
    }
    
    protected String extractShortName(String fullTypeName)
    {
        int dotIndex = fullTypeName.lastIndexOf("."); 
        if (dotIndex == -1)
        {
            return fullTypeName;
        }
        return fullTypeName.substring(dotIndex + 1);
    }
}
