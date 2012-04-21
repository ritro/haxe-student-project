package haxe.tree.utils;

import haxe.imp.parser.antlr.tree.specific.HaxeType;

import java.util.List;

public class HaxeTypeUtils
{
    public static HaxeType getInt()
    {
        return getLibTypeByName("Int");
    }

    public static HaxeType getFloat()
    {
        return getLibTypeByName("Float");
    }
    
    public static HaxeType getString()
    {
        return getLibTypeByName("String");
    }

    public static HaxeType getArray()
    {
        return getLibTypeByName("Array");
    }

    public static HaxeType getBool()
    {
        return getLibTypeByName("Bool");
    }

    public static HaxeType getVoid()
    {
        return getLibTypeByName("Void");
    }
    
    public static HaxeType getUnknown()
    {
        return getLibTypeByName("Unknown");
    }
    
    public static HaxeType getLibTypeByName(final String shorName)
    {
        return null;
    }

    /**
     * Checks if it is available to assign var with the second type
     * to the var with first type. The first type should be the same
     * or wider than the first type. E.g. for (Float, Int) it will 
     * return true, but for (Int, Float) it will return false.
     * 
     * @return true, if is available assignement
     */
    public static boolean isAvailableAssignement(
            final HaxeType type1, final HaxeType type2) 
    {
        if (type1.equals(type2) || isExtendedClass(type1, type2)) 
        {
            return true;
        }
        return false;
    }

    /**
     * Checks if first type is extended second type.
     * The type hierarchy of the second type or one of the
     * typs from his hierarchy should contain the first type.
     * 
     * E.g. for Float (1st argument) and Int (2nd argument)
     * it will return true, but for same types but in another
     * order it will return false.
     * 
     * @return true, if is extended class
     */
    public static boolean isExtendedClass(
            final HaxeType parent, final HaxeType child) 
    {
        if (child.getTypeHierarchy() == null)
        {
            return false;
        }
        
        if (child.getTypeHierarchy().contains(parent)) 
        {
            return true;
        } 
        else for (HaxeType i : child.getTypeHierarchy())
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
        List<HaxeType> type1Hierarchy = type1.getTypeHierarchy();
        if (type1Hierarchy != null && type1Hierarchy.contains(type2))
        {
            return type2;
        }
        
        List<HaxeType> type2Hierarchy = type2.getTypeHierarchy();
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

    //perform normal or physical comparisons between two 
    //expressions sharing a common type. Returns Bool.
    public static boolean isComparable(
            final HaxeType type,final HaxeType type2)
    {
        // TODO what with this?
        return false;
    }
    
    public static boolean areBothNumbers(
            final HaxeType type,final HaxeType type2) 
    {
        HaxeType floatType = getFloat();
        
        // Int have Float in its type hierarchy so if we check
        // just for float it will mean that type can have int
        // as a parent, not just float
        return isAvailableAssignement(floatType, type) &&
                isAvailableAssignement(floatType, type2);
    }
}
