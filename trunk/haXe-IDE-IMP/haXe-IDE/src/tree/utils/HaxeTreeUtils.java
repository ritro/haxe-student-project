package tree.utils;

import tree.HaxeTree;
import tree.specific.Function;
import tree.specific.type.HaxeType;

public abstract class HaxeTreeUtils
{
    public static Function getParentFunction(final HaxeTree node)
    {
        if (node == null)
        {
            return null;
        }
        if (node instanceof Function)
        {
            return (Function)node;
        }
        return getParentFunction(node.getParent());
    }
    
    public static HaxeType getParentType(final HaxeTree node)
    {
        if (node == null)
        {
            return null;
        }
        if (node instanceof HaxeType)
        {
            return (HaxeType)node;
        }
        return getParentType(node.getParent());
    }
}
