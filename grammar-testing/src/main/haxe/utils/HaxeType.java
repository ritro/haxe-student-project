package main.haxe.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class HaxeType {
    private static final String HAXE_PRIMARY_TYPES_PATH = "haxe.primaryTypes";
    private ArrayList<HaxeType> classHierarchy = new ArrayList<HaxeType>();
    private ArrayList<HaxeType> implementedTypes = new ArrayList<HaxeType>();
    private String typeName;
    private String fullTypeName;
    public static ArrayList<String> primaryTypes = new ArrayList<String>() {
        private static final long serialVersionUID = 1L;
        {
            addAll(Arrays.asList(new String[] { "Int", "Number", "Float", "String",
                    "void", "Object", "Bool" }));
        }
    };

    public static final HaxeType haxeFloat;
    public static final HaxeType haxeInt;
    public static final HaxeType haxeVoid;
    public static final HaxeType haxeBool;
    public static final HaxeType haxeString;
    public static final HaxeType haxeDynamic;
    public static final HaxeType haxeObject;
    public static final HaxeType haxeNotYetRecognized;
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

    public static boolean areBothNumbers(HaxeType type, HaxeType type2) {
        return ((type.equals(haxeInt) || type.equals(haxeFloat)) && (type2
                .equals(haxeInt) || type2.equals(haxeFloat)));
    }

    public static boolean isAvailableAssignement(HaxeType type1, HaxeType type2) {
        if (type1.equals(type2)) {
            return true;
        } else if (isExtendedClass(type1, type2)) {
            return true;
        }
        return false;
    }

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
     * @param type2
     * @return
     */
    public static HaxeType getCommonNumberType(HaxeType type1, HaxeType type2) {
        if (type1.equals(haxeInt) && type2.equals(haxeInt)) {
            return haxeInt;
        } else
            return haxeFloat;
    }

    /**
     * @return the classHierarchy
     */
    public ArrayList<HaxeType> getClassHierarchy() {
        return classHierarchy;
    }

    /**
     * @param classHierarchy
     *            the classHierarchy to set
     */
    public void setClassHierarchy(ArrayList<HaxeType> classHierarchy) {
        this.classHierarchy = classHierarchy;
    }

    /**
     * @return the implementedTypes
     */
    public ArrayList<HaxeType> getImplementedTypes() {
        return implementedTypes;
    }

    /**
     * @param implementedTypes
     *            the implementedTypes to set
     */
    public void setImplementedTypes(ArrayList<HaxeType> implementedTypes) {
        this.implementedTypes = implementedTypes;
    }

    /**
     * @return the typeName
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     *            the typeName to set
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return the fullTypeName
     */
    public String getFullTypeName() {
        return fullTypeName;
    }

    /**
     * @param fullTypeName
     *            the fullTypeName to set
     */
    public void setFullTypeName(String fullTypeName) {
        this.fullTypeName = fullTypeName;
    }

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

    private void setIdenticalProperties(HaxeType type) {
        this.classHierarchy = type.classHierarchy;
        this.fullTypeName = type.fullTypeName;
        this.implementedTypes = type.implementedTypes;
        this.typeName = type.typeName;
    }

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
         * FIXME Проверять и полный путь тоже
         */
        return ((HaxeType) arg0).getTypeName().equals(this.getTypeName());
    }

}