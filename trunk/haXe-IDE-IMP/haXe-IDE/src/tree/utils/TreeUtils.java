package tree.utils;

import tree.ErrorNode;
import tree.Function;
import tree.HaxeTree;
import tree.expression.Assignment;
import tree.expression.Constant;
import tree.expression.Declaration;
import tree.expression.MethodCall;
import tree.expression.NewNode;
import tree.expression.Slice;
import tree.expression.Unary;
import tree.expression.Usage;
import tree.statement.Return;
import tree.type.ClassNode;
import tree.type.EnumNode;
import tree.type.HaxeType;

public abstract class TreeUtils
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
    	if (TreeUtils.isNodeValidForCallAnalysis(node)
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
        return TreeUtils.getValidNodeForUsageAnalysis(supposedNode, -1);
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
    	HaxeTree node = null;
    	if (supposedNode instanceof Usage)
    	{
    		node = ((Usage)supposedNode).getDeclarationNode();
    	}
    	// TODO getValidNodeForUsageAnalysis - what to do with DotIdents?
    	else if (supposedNode instanceof Assignment)
    	{
    	    Assignment assign = (Assignment)supposedNode;
    	    if (offset == -1 || 
    	            assign.getToken().getStartIndex() + assign.getToken().getText().length() > offset)
    	    {
    	        node = assign.getLeftOperand();
    	    }
    	    else
    	    {
    	        node = assign.getRightOperand();
    	    }
    	}
    	else if (supposedNode instanceof Slice)
    	{
    		node = ((Slice)supposedNode).getDeclarationNode();
    	}
    	else if (supposedNode instanceof MethodCall)
    	{
    		node = ((MethodCall)supposedNode).getDeclarationNode();
    	}
    	else if (supposedNode instanceof NewNode)
    	{
    		node = ((NewNode)supposedNode).getObjectWhichIsCreated();
    	}
    	else if (supposedNode instanceof Unary)
    	{
    		node = ((Unary)supposedNode).getExpression();
    	}
    	else if (supposedNode instanceof Return)
    	{
    		node = ((Return)supposedNode).getExpression();
    		if (node == null)
    		{
    			return null;
    		}
    		// if not it will return the parent by default algorithm
    	}
    	if (node != null)
    	{
    	    return getValidNodeForUsageAnalysis(node, offset);
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
    	if (supposedNode instanceof ClassNode)
    	{
    	    HaxeTree node = ((ClassNode)supposedNode).getConstructor();
            return getValidNodeForCallAnalysis(node);
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
                    && ( parent instanceof MethodCall || parent instanceof Slice))
            {
                return parent;
            }
            return currentAST;
        }
        return null;
    }
}
