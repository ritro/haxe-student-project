package tree.utils;

import tree.HaxeTree;
import tree.specific.Assignment;
import tree.specific.Constant;
import tree.specific.Declaration;
import tree.specific.ErrorNode;
import tree.specific.Function;
import tree.specific.MethodCall;
import tree.specific.NewNode;
import tree.specific.Return;
import tree.specific.SliceNode;
import tree.specific.UnarExpression;
import tree.specific.Usage;
import tree.specific.type.ClassNode;
import tree.specific.type.EnumNode;
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

    public static boolean isNodeValidForUsageAnalysis(final HaxeTree node)
    {
    	if (HaxeTreeUtils.isNodeValidForCallAnalysis(node)
    			|| node instanceof ClassNode
    			|| node instanceof EnumNode
    			|| node instanceof Declaration)
    	{
    		return true;
    	}
    	
    	return false;
    }

    public static HaxeTree getValidNodeForUsageAnalysis(final HaxeTree supposedNode)
    {
        return HaxeTreeUtils.getValidNodeForUsageAnalysis(supposedNode, -1);
    }

    /**
     * Gets the node for which you can calculate usages from the node
     * the was under cursor for example.
     * @param offset - in most cases it is unneccassary but then you
     * want to take node from that side of equation (e.g.) there the cursor
     * is - then you should set offset
     */
    public static HaxeTree getValidNodeForUsageAnalysis(final HaxeTree supposedNode, final int offset)
    {
    	if (supposedNode == null || supposedNode instanceof ErrorNode 
    	        || supposedNode instanceof Constant)
    	{
    		return null;
    	}
    	if (isNodeValidForUsageAnalysis(supposedNode))
    	{
    		return supposedNode;
    	}
    	if (supposedNode instanceof Usage)
    	{
    		HaxeTree node = ((Usage)supposedNode).getDeclarationNode();
    		return getValidNodeForUsageAnalysis(node, offset);
    	}
    	// TODO getValidNodeForUsageAnalysis - what to do with DotIdents?
    	if (supposedNode instanceof Assignment)
    	{
    	    Assignment assign = (Assignment)supposedNode;
    	    HaxeTree node = null;
    	    if (offset == -1 || 
    	            assign.getToken().getStartIndex() + assign.getToken().getText().length() > offset)
    	    {
    	        node = assign.getLeftOperand();
    	    }
    	    else
    	    {
    	        node = assign.getRightOperand();
    	    }
    		return getValidNodeForUsageAnalysis(node, offset);
    	}
    	if (supposedNode instanceof SliceNode)
    	{
    		HaxeTree node = ((SliceNode)supposedNode).getDeclarationNode();
    		return getValidNodeForUsageAnalysis(node, offset);
    	}
    	if (supposedNode instanceof MethodCall)
    	{
    		HaxeTree node = ((MethodCall)supposedNode).getDeclarationNode();
    		return getValidNodeForUsageAnalysis(node, offset);
    	}
    	if (supposedNode instanceof NewNode)
    	{
    		HaxeTree node = ((NewNode)supposedNode).getObjectWhichIsCreated();
    		return getValidNodeForUsageAnalysis(node, offset);
    	}
    	if (supposedNode instanceof UnarExpression)
    	{
    		HaxeTree node = ((UnarExpression)supposedNode).getExpression();
    		return getValidNodeForUsageAnalysis(node, offset);
    	}
    	if (supposedNode instanceof Return)
    	{
    		HaxeTree node = ((Return)supposedNode).getExpression();
    		if (node == null)
    		{
    			return getValidNodeForUsageAnalysis(node, offset);
    		}
    		// if not it will return the parent by default algorithm
    	}
    	return getValidNodeForUsageAnalysis(supposedNode.getParent(), offset);
    }

    /**
     * Checks if node is valid for making a call hierarchy.
     */
    public static boolean isNodeValidForCallAnalysis(final HaxeTree node)
    {
        if (node == null || !(node instanceof Function))
        {
            return false;
        }
    	
    	return true;
    }

    /**
     * Gets the most upper node valid for making a call hierarchy. If 
     * supposed node isn't the one it will check the parent of the 
     * supposed node.
     * @param supposedNode node we are now on (the cursor is in that node
     * or selection was in that node)
     * @return valid node for making call hierarchy
     */
    public static HaxeTree getValidNodeForCallAnalysis(final HaxeTree supposedNode)
    {
    	if (supposedNode == null || supposedNode instanceof ErrorNode)
    	{
    		return null;
    	}
    	if (isNodeValidForCallAnalysis(supposedNode))
    	{
    		return supposedNode;
    	}
    	if (supposedNode instanceof NewNode)
    	{
    		// TODO by our logic here we should return function - not the
    		// class or type
    		HaxeTree node = ((NewNode)supposedNode).getObjectWhichIsCreated();
    		return getValidNodeForCallAnalysis(node);
    	}
    	if (supposedNode instanceof MethodCall)
    	{
    		HaxeTree node = ((MethodCall)supposedNode).getDeclarationNode();
    		return getValidNodeForCallAnalysis(node);
    	}
    	return getValidNodeForCallAnalysis(supposedNode.getParent());
    }

    public static HaxeTree getNodeByOffset(
            final int offset,final int length, final HaxeTree currentAST)
    {
        if (currentAST == null)
        {
            return null;
        }
        HaxeTree result = null;
        for (HaxeTree child : currentAST.getChildren())
        {
            result = getNodeByOffset(offset, length, child);
            if (result != null)
            {
                return result;
            }
        }
        if (currentAST.getMostLeftPosition() <= offset &&
                currentAST.getMostRightPosition() >= offset + length)
        {
            HaxeTree parent = currentAST.getParent();
            if (parent != null 
                    && ( parent instanceof MethodCall || parent instanceof SliceNode))
            {
                return parent;
            }
            return currentAST;
        }
        return null;
    }
}
