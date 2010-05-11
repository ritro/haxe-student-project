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

// TODO: Auto-generated Javadoc
/**
 * The Class HaxeType.
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeType {
    
    /** The Constant HAXE_PRIMARY_TYPES_PATH. */
    private static final String HAXE_PRIMARY_TYPES_PATH = "haxe.primaryTypes";
    
    /** The class hierarchy. */
    private ArrayList<HaxeType> classHierarchy = new ArrayList<HaxeType>();
    
    /** The implemented types. */
    private ArrayList<HaxeType> implementedTypes = new ArrayList<HaxeType>();
    
    /** The type name. */
    private String typeName;
    
    /** The full type name. */
    private String fullTypeName;
    
    /** The primary types. */
    public static ArrayList<String> primaryTypes = new ArrayList<String>() {
        private static final long serialVersionUID = 1L;
        {
            addAll(Arrays.asList(new String[] { "Int", "Number", "Float", "String",
                    "void", "Object", "Bool" }));
        }
    };

    /** The Constant haxeFloat. */
    public static final HaxeType haxeFloat;
    
    /** The Constant haxeInt. */
    public static final HaxeType haxeInt;
    
    /** The Constant haxeVoid. */
    public static final HaxeType haxeVoid;
    
    /** The Constant haxeBool. */
    public static final HaxeType haxeBool;
    
    /** The Constant haxeString. */
    public static final HaxeType haxeString;
    
    /** The Constant haxeDynamic. */
    public static final HaxeType haxeDynamic;
    
    /** The Constant haxeObject. */
    public static final HaxeType haxeObject;
    
    /** The Constant haxeNotYetRecognized. */
    public static final HaxeType haxeNotYetRecognized;
    
    /** The Constant haxeUndefined. */
    public static final HaxeType haxeUndefined;

    static {
        haxeFloat = new HaxeType(HAXE_PRIMARY_TYPES_PATH + ".Float");
        haxeInt = new HaxeType(HAXE_PRIMARY_TYPES_PATH + ".Int");
        haxeInt.setClassHierarchy(new ArrayList<HaxeType>() {
            private static final long serialVersionUID = 1L;
            {
                add(haxeFloat);
            }
        });
        haxeVoid = new HaxeType(HAXE_PRIMARY_TYPES_PATH + ".Void");
        haxeBool = new HaxeType(HAXE_PRIMARY_TYPES_PATH + ".Bool");
        haxeString = new HaxeType(HAXE_PRIMARY_TYPES_PATH + ".String");
        haxeDynamic = new HaxeType(HAXE_PRIMARY_TYPES_PATH + ".Dynamic");
        haxeObject = new HaxeType("haxe.Object");
        haxeNotYetRecognized = new HaxeType("haxe.notYetRecognized");
        haxeUndefined = new HaxeType("haxe.Undefined");
    }

    /**
	 * Are both numbers.
	 * 
	 * @param type
	 *            the type
	 * @param type2
	 *            the type2
	 * @return true, if successful
	 */
    public static boolean areBothNumbers(HaxeType type, HaxeType type2) {
        return ((type.equals(haxeInt) || type.equals(haxeFloat)) && (type2
                .equals(haxeInt) || type2.equals(haxeFloat)));
    }

    /**
	 * Checks if is available assignement.
	 * 
	 * @param type1
	 *            the type1
	 * @param type2
	 *            the type2
	 * @return true, if is available assignement
	 */
    public static boolean isAvailableAssignement(HaxeType type1, HaxeType type2) {
        if (type1.equals(type2)) {
            return true;
        } else if (isExtendedClass(type1, type2)) {
            return true;
        }
        return false;
    }

    /**
	 * Checks if is extended class.
	 * 
	 * @param parent
	 *            the parent
	 * @param child
	 *            the child
	 * @return true, if is extended class
	 */
    public static boolean isExtendedClass(HaxeType parent, HaxeType child) {
        if (child.getClassHierarchy().contains(parent)) {
            return true;
        }
        return false;
    }

    /**
	 * Applied in case when user is sure, that both of parameters are numbers. (
	 * <code>areBothNumbers</code> returning true)
	 * 
	 * @param type1
	 *            the type1
	 * @param type2
	 *            the type2
	 * @return the common number type
	 */
    public static HaxeType getCommonNumberType(HaxeType type1, HaxeType type2) {
        if (type1.equals(haxeInt) && type2.equals(haxeInt)) {
            return haxeInt;
        } else
            return haxeFloat;
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
    public void setClassHierarchy(ArrayList<HaxeType> classHierarchy) {
        this.classHierarchy = classHierarchy;
    }

    /**
	 * Gets the implemented types.
	 * 
	 * @return the implementedTypes
	 */
    public ArrayList<HaxeType> getImplementedTypes() {
        return implementedTypes;
    }

    /**
	 * Sets the implemented types.
	 * 
	 * @param implementedTypes
	 *            the implementedTypes to set
	 */
    public void setImplementedTypes(ArrayList<HaxeType> implementedTypes) {
        this.implementedTypes = implementedTypes;
    }

    /**
	 * Gets the type name.
	 * 
	 * @return the typeName
	 */
    public String getTypeName() {
        return typeName;
    }

    /**
	 * Sets the type name.
	 * 
	 * @param typeName
	 *            the typeName to set
	 */
    public void setTypeName(String typeName) {
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
	 * Sets the full type name.
	 * 
	 * @param fullTypeName
	 *            the fullTypeName to set
	 */
    public void setFullTypeName(String fullTypeName) {
        this.fullTypeName = fullTypeName;
    }

    /**
	 * Instantiates a new haxe type.
	 * 
	 * @param fullTypeName
	 *            the full type name
	 */
    public HaxeType(String fullTypeName) {
        if (fullTypeName.equals("Int")) {
            setIdenticalProperties(haxeInt);
        } else if (fullTypeName.equals("FLOAT")) {
            setIdenticalProperties(haxeFloat);
        } else if (fullTypeName.equals("STRING")) {
            setIdenticalProperties(haxeString);
        } else if (fullTypeName.equals("BOOL")) {
            setIdenticalProperties(haxeBool);
        } else if (fullTypeName.equals("void")) {
            setIdenticalProperties(haxeVoid);
        } else {
            this.fullTypeName = fullTypeName;
            this.typeName = (fullTypeName.lastIndexOf(".") == -1) ? fullTypeName
                    : fullTypeName.substring(fullTypeName.lastIndexOf("."));
        }
    }

    /**
	 * Sets the identical properties.
	 * 
	 * @param type
	 *            the new identical properties
	 */
    private void setIdenticalProperties(HaxeType type) {
        this.classHierarchy = type.classHierarchy;
        this.fullTypeName = type.fullTypeName;
        this.implementedTypes = type.implementedTypes;
        this.typeName = type.typeName;
    }

    /**
	 * Instantiates a new haxe type.
	 */
    public HaxeType() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.getFullTypeName().length() != 0 ? this.getFullTypeName() : this
                .getTypeName();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object arg0) {
        /**
         * FIXME ÐŸÑ€Ð¾Ð²ÐµÑ€Ñ�Ñ‚ÑŒ Ð¸ Ð¿Ð¾Ð»Ð½Ñ‹Ð¹ Ð¿ÑƒÑ‚ÑŒ Ñ‚Ð¾Ð¶Ðµ
         */
        return ((HaxeType) arg0).getTypeName().equals(this.getTypeName());
    }

}
