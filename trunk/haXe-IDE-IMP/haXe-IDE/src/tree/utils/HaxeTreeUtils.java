package tree.utils;

import tree.HaxeTree;
import tree.specific.Function;

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
}
