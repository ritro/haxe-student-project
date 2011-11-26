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
package haxe.imp.parser.antlr.utils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Class HaxeType.
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeType {

	private static final String HAXE_PRIMARY_TYPES_PATH = "haxe.primaryTypes";
	private ArrayList<HaxeType> classHierarchy = new ArrayList<HaxeType>();
	private ArrayList<HaxeType> implementedTypes = new ArrayList<HaxeType>();

	private String typeName;
	private String fullTypeName;

	public static ArrayList<String> primaryTypes = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			this.addAll(Arrays.asList(new String[] { "Int", "Number", "Float",
					"String", "Void", "Object", "Bool"}));//,, "Unknown<0>" "Undefined", "Dynamic" 
		}
	};

	/** Primary Haxe Types. */
	public static final HaxeType haxeFloat;
	public static final HaxeType haxeInt;
	public static final HaxeType haxeVoid;
	public static final HaxeType haxeBool;
	public static final HaxeType haxeString;
	public static final HaxeType haxeDynamic;
	public static final HaxeType haxeObject;
	public static final HaxeType haxeUndefined;
	//Unknown<0> - special value usable for any type with behavior diff from Dynamic
	//NULL have this type and it used only(?) for it
	public static final HaxeType haxeUnknown;
	public static final HaxeType haxeEnum;

	static {
		haxeString = new HaxeType(HAXE_PRIMARY_TYPES_PATH, "String");
		haxeFloat = new HaxeType(HAXE_PRIMARY_TYPES_PATH, "Float");
		haxeFloat.setClassHierarchy(new ArrayList<HaxeType>() {
			private static final long serialVersionUID = 1L;
			{
				this.add(haxeString);
			}
		});
		haxeInt = new HaxeType(HAXE_PRIMARY_TYPES_PATH, "Int");
		haxeInt.setClassHierarchy(new ArrayList<HaxeType>() {
			private static final long serialVersionUID = 1L;
			{
				this.add(haxeFloat);
			}
		});
		haxeVoid = new HaxeType(HAXE_PRIMARY_TYPES_PATH, "Void");
		haxeBool = new HaxeType(HAXE_PRIMARY_TYPES_PATH, "Bool");
		haxeDynamic = new HaxeType(HAXE_PRIMARY_TYPES_PATH, "Dynamic");
		haxeObject = new HaxeType("haxe", "Object");
		haxeUndefined = new HaxeType("haxe", "Undefined");
		haxeUnknown = new HaxeType("haxe" , "Unknown<0>");
		haxeUnknown.setClassHierarchy(new ArrayList<HaxeType>() {
			private static final long serialVersionUID = 1L;
			{
				this.add(haxeString);
				this.add(haxeObject);
			}
		});
		haxeEnum = new HaxeType("haxe" , "Enum");
	}

	/**
	 * @param type
	 *            the type
	 * @param type2
	 *            the type2
	 * @return true, if successful
	 */
	public static boolean areBothNumbers(
	        final HaxeType type,final HaxeType type2) 
	{
		return ((type.equals(haxeInt) || type.equals(haxeFloat)) && (type2
				.equals(haxeInt) || type2.equals(haxeFloat)));
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
		if (child.getClassHierarchy() != null){
			if (child.getClassHierarchy().contains(parent)) {
				return true;
			} else
				for (HaxeType i : child.getClassHierarchy())
					if (isExtendedClass(parent, i))
						return true;
		}
		
		return false;
	}

	public boolean isNumericType()
	{
		return (equals(haxeInt) || equals(haxeFloat));
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
	 * Gets the implemented types.
	 * 
	 * @return the implementedTypes
	 *//*
	public ArrayList<HaxeType> getImplementedTypes() {
		return this.implementedTypes;
	}

	/**
	 * Sets the implemented types.
	 * 
	 * @param implementedTypes
	 *            the implementedTypes to set
	 *//*
	public void setImplementedTypes(final ArrayList<HaxeType> implementedTypes) {
		this.implementedTypes = implementedTypes;
	}*/

	/**
	 * Gets the type name.
	 * 
	 * @return the typeName
	 */
	public String getShortTypeName() {
		return typeName;
	}

	/**
	 * Sets the type name.
	 * 
	 * @param typeName
	 *            the typeName to set
	 */
	public void setTypeName(final String typeName) {
		this.typeName = typeName;
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
	 * Used for creating primary types.
	 */
	private HaxeType(
	        final String pathToType, final String shortTypeName) 
	{ 
	    fullTypeName = pathToType + "." + shortTypeName;
        typeName = shortTypeName;
	}

	/**
	 * Instantiates a new haxe type.
	 * @param typeName - if you expect to create a whole new type
	 * provide a full name, else you can use a short name - the type
	 * properties will be copied from already existing type.
	 */
	public HaxeType(final String typeName) 
	{
	    HaxeType primatyType = tryGetPrimaryType(typeName);
	    if (primatyType != null)
	    {
	        setIdenticalProperties(primatyType);
	    }
		else if (typeName.equalsIgnoreCase("Undefined")) 
		{
			setIdenticalProperties(haxeUndefined);
		}
		fullTypeName = typeName;
		this.typeName = (typeName.lastIndexOf(".") == -1) 
		        ? typeName
				: typeName.substring(typeName.lastIndexOf(".") + 1);
	}
	
	/**
	 * Identifies if the Name is actualy a primary type name.
	 * @param typeName - name to check for primary type.
	 * @return Instance of haxe primary type or null.
	 */
	public static HaxeType tryGetPrimaryType(final String typeName)
	{
		//FIXME "Object"?? "Number"??
		if (typeName.equalsIgnoreCase(haxeInt.typeName) 
		        || typeName.equals(haxeInt.fullTypeName)) 
		{
			return haxeInt;
		} 
		else if (typeName.equalsIgnoreCase(haxeFloat.typeName) 
                || typeName.equals(haxeFloat.fullTypeName)) 
		{
			return haxeFloat;
		} 
		else if (typeName.equalsIgnoreCase(haxeString.typeName) 
                || typeName.equals(haxeString.fullTypeName)) 
		{
			return haxeString;
		} 
		else if (typeName.equalsIgnoreCase(haxeBool.typeName) 
                || typeName.equals(haxeBool.fullTypeName)) 
		{
			return haxeBool;
		}
		else if (typeName.equalsIgnoreCase(haxeVoid.typeName) 
                || typeName.equals(haxeVoid.fullTypeName)) 
		{
			return haxeVoid;
		}
		return null;
	}

	/**
	 * Sets properties identical to some already known type.
	 * Usually to some primaty type.
	 * @param type - from which properties will be copied.
	 */
	private void setIdenticalProperties(final HaxeType type) {
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
	public boolean equals(final Object arg0) {
		/**
		 * FIXME 
		 */
		return ((HaxeType) arg0).getShortTypeName().equals(this.getShortTypeName());
	}

}
