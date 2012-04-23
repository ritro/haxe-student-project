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
package tree;

import imp.parser.antlr.main.HaxeParser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.eclipse.imp.parser.IMessageHandler;

import tree.specific.HaxeType;
import tree.specific.MethodCallNode;
import tree.specific.SliceNode;
import tree.specific.VarUsageNode;

public class HaxeTree extends CommonTree 
{
	private static IMessageHandler messageHandler = null;
	private boolean auxiliary = false;
	private boolean isDuplicate = false;
	protected HaxeType haxeType = null;

	/**
	 * Contains most left position of tree/subtree
	 */
	protected int mostLeftPosition = -1;
	protected int mostRightPosition = -1;

	public static final int SUFFIX_EXPR_TYPE = HaxeParser.SUFFIX_EXPR;
	
		
	public boolean isAuxiliary() { 
		return auxiliary;
	}

	public void setAuxiliary(final boolean auxiliary) {
		this.auxiliary = auxiliary;
	}
	
	public boolean isFieldUse()
	{
	    return getChildCount() > 0 && getChild(getChildCount() - 1).getText().equals(".");
	}
	
	public boolean isDuplicate()
	{
	    return isDuplicate;
	}
	
	public void setDuplicate(boolean isDuplicate)
	{
	    this.isDuplicate = isDuplicate;
	}
    
    public boolean setHaxeType(HaxeType type)
    {
        haxeType = type;
        return true;
    }

    public HaxeType getHaxeType() 
    {
        return haxeType; 
    }
    
    /**
     * If flag 'takeLastPossible' is set to true then
     * returns the type of the last object taken by
     * field uses, method calls and so on.
     * e.g.: obj.field1.method() will return the type of "method" call
     * @return type of the last accessed object or simple haxeType
     * for other types of Nodes
     */
    public HaxeType getHaxeType(boolean takeLastPossible) 
    {
        if (!takeLastPossible)
        {
            return getHaxeType();            
        }
        
        if (isFieldUse())
        {
            return getChild(0).getChild(0).getHaxeType(true);
        } 
        else if (this instanceof MethodCallNode)
        {
            return ((MethodCallNode)this).getHaxeType(true);
        }
        else if (this instanceof SliceNode)
        {
            return ((SliceNode)this).getHaxeType(true);
        }
        return getHaxeType();
    }
    
    public String getPackage()
    {
        if (getChildCount()>0 && getChild(0).getText().equals("package"))
        {
            return getChild(0).getChild(0).getText();
        }
        
        return "";
    }
    
    public HaxeTree getLastChildFromAll()
    {
        ArrayList<HaxeTree> children = getAllChildren();
        return children.get(children.size()-1);
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public List<HaxeTree> getChildren() 
    {
        List<HaxeTree> res = (List<HaxeTree>)super.getChildren();
        
        if (res == null) return new ArrayList<HaxeTree>();
        
        return res;
    }

    /**
     * Gets the all children of current node and
     * all children of his children ... 
     * @return the all children starting from that
     * node
     */
    public ArrayList<HaxeTree> getAllChildren() 
    {
        ArrayList<HaxeTree> childs = new ArrayList<HaxeTree>();
        if (getChildCount() == 0) 
        {
            childs.add(this);//???????? FIXME
            return childs;            
        } 
        for (HaxeTree child : getChildren()) 
        {
            childs.addAll(child.getAllChildren());
        }
        return childs;
    }

    @Override
    public HaxeTree getChild(final int i) 
    {
        return (HaxeTree) super.getChild(i);
    }

    @Override
    public CommonToken getToken() 
    {
        return (CommonToken) super.getToken();
    }

	public static void setMessageHandler(final IMessageHandler messageHandler) {
		HaxeTree.messageHandler = messageHandler;
	}

	public static IMessageHandler getMessageHandler() {
		return messageHandler;
	}
	
	/**
	 * Calculates most right position for current tree only. 
	 */
	protected void calculateMostRightPosition()
	{
	    if (isFieldUse())
        {
            mostRightPosition = 
                    getAllChildren().get(getChildCount() - 1).getMostRightPosition();
            return;
        }

        CommonToken token = getToken();
        assert (token != null);

        mostRightPosition = 
                token.getStartIndex() + token.getText().length();

        for (HaxeTree commonTree : getChildren())
        {
            mostRightPosition = Math.max(
                    mostRightPosition, 
                    commonTree.getMostRightPosition());
        }
	}
	
	/**
	 * Calculates most left position for current tree only. 
	 */
	protected void calculateMostLeftPosition()
	{
	    mostLeftPosition = getToken().getStartIndex();
		for (HaxeTree commonTree : getChildren()) 
		{
			int possibleMLP = 
					commonTree.getMostLeftPosition();
			if (mostLeftPosition > possibleMLP) 
			{
				mostLeftPosition = possibleMLP;
			}
		}
	}

	/**
	 * Gets the most left position. If it is undefined
	 * then if tries to calculate it first.
	 * @return the most left position
	 */
	public int getMostLeftPosition() 
	{
		if (mostLeftPosition == -1)
		{
			calculateMostLeftPosition();
		}
		
		return mostLeftPosition;
	}

	/**
	 * Gets most right position. If it is undefined
	 * then if tries to calculate it first.
	 * @return the most right position
	 */
    public final int getMostRightPosition()
    {
        if (mostRightPosition == -1)
        {
            calculateMostRightPosition();
        }        
        
        return mostRightPosition;
    }
    
    public final int getLength()
    {
        return getMostLeftPosition() - getMostRightPosition();
    }

	/**
	 * Instantiates a new extended common tree.
	 */
	public HaxeTree() 
	{
	}

	public HaxeTree(final CommonTree node) 
	{
		super(node);
	}

	public HaxeTree(final Token t) 
	{
		super(t);
	}

	public HaxeTree(final int ttype) 
	{
	    this(new CommonToken(ttype));
	}

    public HaxeTree(final int ttype, final String type) 
    {
        this(new CommonToken(ttype, type));
    }

    public HaxeTree(int ttype, Token token) 
    {
        this(token);
    }
    

    public HaxeTree(int suffixExpr, String string, Token lPAREN242,
            Token rPAREN244) 
    {
        this(suffixExpr, string);
    }

    /**
	 * Printing error messages in eclipse's text editor 
	 * (red circles at the left).
	 */	
	public void commitError(final String message) {
	    if (messageHandler == null)
	    {
	        return;
	    }
	    messageHandler.handleSimpleMessage(
	            message, 
	            getMostLeftPosition(), 
	            getMostRightPosition(),
	            0, 0, 1, 1);
	}
	
	public HaxeTree getParent()
	{
	    Tree parent = super.getParent();
	    if (parent == null)
	    {
	        return null;
	    }
		return (HaxeTree) parent;
	}

	/**
	 * Метод нужен для подсчета отступа и длины узла для тех узлов, которые
	 * <code>auxilary==true</code>. Для обычных узлов я просто смотрю
	 * соответсвующий токен, для дополнительных - смотрю первого и последнего
	 * сына. Считается, что дополнительные узлы не могут быть листьями.
	 * 
	 * Use getMostLeft/Right instead
	 * 
	 * @return the region for node
	 *//*
	@Deprecated
	public Pair getRegionForNode() {
		int begin;
		int end;
		if (this.auxiliary) {
			try {
				begin = this.getChild(0).getRegionForNode().getBegin();
			} catch (NullPointerException e) {
				begin = this.getToken().getStartIndex();
			}
			try {
				end = this.getChild(this.getChildCount() - 1)
						.getRegionForNode().getEnd();
			} catch (NullPointerException e) {
				end = this.getToken().getStartIndex()
						+ this.getToken().getText().length();
			}
		} else {
			try {
				begin = this.getToken().getStartIndex();
				end = this.getToken().getStartIndex()
						+ this.getToken().getText().length();
			} catch (NullPointerException nullPointerException) {
				//
				System.out.println("Problems on calculating region for node");
				begin = 0;
				end = 0;
			}
		}
		return new Pair(begin, end);
	}*/

	/**
	 * Get most-inner node of AST tree by it's offset. 
	 * @param offset
	 *            the offset
	 * @return the node by position
	 */
	public HaxeTree getNodeByPosition(final int offset) 
	{
	    //FIXME for suffix nodes maybe not that good to
	    //take the most inner node?
		for (HaxeTree child : this.getChildren()) {
			if (child.getMostLeftPosition() <= offset
					&& offset <= child.getMostRightPosition()) {
				return child.getNodeByPosition(offset);
			}
		}
		return this;
	}

	/**
	 * Gets the node by position.
	 * 
	 * Use <code>getNodeByPosition(int offset)</code> instead
	 * 
	 * @param line
	 *            the line
	 * @param posInLine
	 *            the pos in line
	 * @return the node by position
	 *//*
	@Deprecated
	public HaxeTree getNodeByPosition(final int line, final int posInLine) {
		List<HaxeTree> nodes = new ArrayList<HaxeTree>(this.getChildren());

		if (this.getLine() != line) {
			Collections.sort(nodes, new ComparatorByLines());
			for (int i = 0; i <= nodes.size() - 2; i++) {
				if (nodes.get(i).getLine() <= line
						&& line < nodes.get(i + 1).getLine()) {
					return nodes.get(i).getNodeByPosition(line, posInLine);
				}
			}
			if (nodes.get(nodes.size() - 1).getLine() <= line) {
				if (nodes.get(nodes.size() - 1).getChildren() != null) {
					return nodes.get(nodes.size() - 1).getNodeByPosition(line, posInLine);
				} else {
					return this;
				}
			}
			return null;
		} else {
			for (int i = nodes.size() - 1; i >= 0; i--) {
				if (nodes.get(i).getLine() != line) {
					nodes.remove(i);
				}
			}
			Collections.sort(nodes, new ComparatorByPosInLine());
			HaxeTree pretender = null;
			for (int i = 0; i <= nodes.size() - 2; i++) {
				if (nodes.get(i).getCharPositionInLine() <= posInLine
						&& posInLine < nodes.get(i + 1).getCharPositionInLine()) {
					pretender = nodes.get(i);
					break;
				}
			}
			if (nodes.get(nodes.size() - 1).getCharPositionInLine() <= posInLine) {
				pretender = nodes.get(nodes.size() - 1);
			}
			if (pretender == null) {
				return nodes.get(0).getNodeByPosition(line, posInLine);
			}

			if (pretender.getCharPositionInLine()
					+ pretender.getTokenStopIndex() - pretender.getTokenStartIndex() - 1
					+ pretender.getText().length()
						> posInLine
					&& pretender.getCharPositionInLine() <= posInLine
					&& pretender.auxiliary == false) {
				return pretender;
			} else {
				if (pretender.getChildren() != null) {
					return pretender.getNodeByPosition(line, posInLine);
				} else {
					return this;
				}
			}
		}
	}*/

	/**
	 * Gets the declaration node. 
	 * @param usageNode
	 *            the usage node
	 * @return the declaration node
	 */
	public HaxeTree getDeclarationNode(final HaxeTree usageNode) 
	{
		if (usageNode instanceof VarUsageNode)
		{
		    return ((VarUsageNode)usageNode).getDeclarationNode();
		}		

		return new HaxeTree(0);
	}
	
	public boolean ifUndefinedType()
	{
	    return ifUndefinedType(false);
	}
	
    public boolean ifUndefinedType(boolean checkLastType)
    {
        return getHaxeType() == null;
    }
	
	/**
	 * Then we see symbol we are not expected to see
	 * commit this error.
	 * Official haxe error text used.
	 */
	public void commitUnexpectedError()
	{
	    commitError("Unexpected " + getText());
	}
}
