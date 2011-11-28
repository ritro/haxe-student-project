package haxe.imp.parser.antlr.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimaryHaxeType extends HaxeType
{
    private static final String HAXE_PRIMARY_TYPES_PATH = "haxe.primaryTypes";
    
    private static ArrayList<String> primaryTypes = new ArrayList<String>()
    {
        private static final long serialVersionUID = 1L;
        {
            this.addAll(Arrays.asList(new String[] 
            { 
                "Int", "Number", "Float",
                "String", "Void", "Object", 
                "Bool"}));//,, "Unknown<0>" "Undefined", "Dynamic" 
            }
    };

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
        haxeString = new PrimaryHaxeType("String");
        haxeFloat = new PrimaryHaxeType("Float");
        haxeFloat.setClassHierarchy(new ArrayList<HaxeType>() {
            private static final long serialVersionUID = 1L;
            {
                add(haxeString);
            }
        });
        haxeInt = new PrimaryHaxeType("Int");
        haxeInt.setClassHierarchy(new ArrayList<HaxeType>() {
            private static final long serialVersionUID = 1L;
            {
                add(haxeFloat);
            }
        });
        haxeVoid = new PrimaryHaxeType("Void");
        haxeBool = new PrimaryHaxeType("Bool");
        haxeDynamic = new PrimaryHaxeType("Dynamic");
        haxeObject = new PrimaryHaxeType("Object");
        haxeUndefined = new PrimaryHaxeType("Undefined");
        haxeUnknown = new PrimaryHaxeType("Unknown<0>");
        haxeUnknown.setClassHierarchy(new ArrayList<HaxeType>() {
            private static final long serialVersionUID = 1L;
            {
                add(haxeString);
                add(haxeObject);
            }
        });
        haxeEnum = new PrimaryHaxeType("Enum");
    }

    public static boolean isNumericType(final HaxeType type)
    {
        return (type.equals(haxeInt) || type.equals(haxeFloat));
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
        return isNumericType(type) && isNumericType(type2);
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
    
    public static boolean ifPrimaryType(String shortTypeName)
    {
        return primaryTypes.contains(shortTypeName);
    }
    
    private PrimaryHaxeType(final String shortTypeName) 
    {
        fullTypeName = HAXE_PRIMARY_TYPES_PATH + "." + shortTypeName;
        typeName = shortTypeName;
    }
}
