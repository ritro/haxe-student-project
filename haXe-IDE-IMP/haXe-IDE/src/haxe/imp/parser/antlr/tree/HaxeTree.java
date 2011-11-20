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
package haxe.imp.parser.antlr.tree;

import static haxe.imp.parser.antlr.utils.HaxeType.areBothNumbers;
import static haxe.imp.parser.antlr.utils.HaxeType.getCommonNumberType;
import haxe.imp.foldingUpdater.HaxeFoldingUpdater.HaxeFoldingVisitor;
import haxe.imp.parser.antlr.main.HaxeLexer;
import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.exceptions.HaxeCastException;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.EnumNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.utils.Environment;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.eclipse.imp.parser.IMessageHandler;

public class HaxeTree extends CommonTree 
{
	private static IMessageHandler messageHandler;
	private boolean auxiliary = false;
	protected HaxeType haxeType = HaxeType.haxeUndefined;

	/**
	 * Contains most left position of tree/subtree
	 */
	protected int mostLeftPosition = -1;
	protected int mostRightPosition = -1;

	private enum boolOperations {
		PLUS,
		MINUS,
		MULTY,
		DIV,
		EQ,
		PERCENT
	};

	public static final int TYPE_TAG_TYPE = HaxeParser.TYPE_TAG;
	public static final int SUFFIX_EXPR_TYPE = HaxeParser.SUFFIX_EXPR;
		
	public boolean isAuxiliary() { 
		return auxiliary;
	}

	public void setAuxiliary(final boolean auxiliary) {
		this.auxiliary = auxiliary;
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
	 * Calculates most right position for current tree only
	 * if position wasn't calculated before. 
	 */
	protected void calculateMostRightPosition()
	{
	    if (auxiliary == true && getChildCount() > 0)
        {
            mostRightPosition = 
                    getChild(getChildCount() - 1).getMostRightPosition();
            return;
        }

        CommonToken token = getToken();
        assert (token != null);

        mostRightPosition = token.getStartIndex() 
                + token.getText().length() - 1;

        for (HaxeTree commonTree : getChildren())
        {
            mostRightPosition = Math.max(
                    mostRightPosition, 
                    commonTree.getMostRightPosition());
        }
	}

	/**
	 * Gets the most left position.
	 * 
	 * @return the most left position
	 */
	public int getMostLeftPosition() {
		if (isAuxiliary()) {
			if (mostLeftPosition == -1 && getChildCount() > 0) {
				mostLeftPosition = getChild(0).getMostLeftPosition();
			}
			return mostLeftPosition;
		} else {
			if (mostLeftPosition == -1) {
				mostLeftPosition = getToken().getStartIndex();
				if (getChildCount() > 0) {
					for (HaxeTree commonTree : this.getChildren()) {
						if (mostLeftPosition > commonTree
								.getMostLeftPosition()) {
							mostLeftPosition = commonTree
									.getMostLeftPosition();
						}
					}
				}
			}
			return this.mostLeftPosition;
		}
	}

	/**
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

	/**
	 * Instantiates a new extended common tree.
	 */
	public HaxeTree() {
	}

	public HaxeTree(final CommonTree node) {
		super(node);
	}

	public HaxeTree(final Token t) {
		super(t);
	}

	public HaxeTree(final int ttype, final Token t,
			final boolean auxiliary) {
	    this(t);
	    setAuxiliary(auxiliary);
	}

	public HaxeTree(final int ttype, final String type,
			final boolean auxiliary) {
	    this(ttype, new CommonToken(ttype, type), auxiliary);
	}

	public HaxeTree(final int ttype, final boolean auxiliary) {
	    this(ttype, new CommonToken(ttype), auxiliary);
	}

	public HaxeTree(final int ttype) {
	    this(ttype, false);
	}

	/**
	 * Printing error messages in eclipse's text editor (red circles at the
	 * left).
	 */	
	public void commitError(final String message) {
	    messageHandler.handleSimpleMessage(
	            message, 
	            getMostLeftPosition(), 
	            getMostRightPosition(),
	            0, 0, 1, 1);
	}
	
	private void commitCastError(){
		commitError(getText() + ": cast problems");
	}
	
	/**
	 * According to the node type, makes the Declaration Vars
	 * table for all vars met in that node. The method should
	 * be implemented for each of node type separately.
	 * @return vars table for current node.
	 */
	/*
	 * It is the stub. The same method will be implemented
	 * in classes nested from HaxedTree.
	 * @return null
	 */
	public void calculateScopes(Environment declaration) 
	{
	    for (HaxeTree tree : getChildren()) 
        {
            //hight levels only this
            if (tree instanceof ClassNode
                    || tree instanceof EnumNode)
            {
                tree.calculateScopes();
            }
        }
	}
	
	public void calculateExpressionScopes(Environment declaration)
	{
	    if (!ifNumOperation())
	    {
	        //FIXME may just a var
	        return;
	    }
	}
	
	/**
	 * Run the scope calculations with empty environment.
	 */
	public final void calculateScopes()
	{
	    calculateScopes(new Environment());
	}
	
	public HaxeTree getParent(){
		return (HaxeTree)super.getParent();
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
        return haxeType.equals(HaxeType.haxeUndefined);
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
	
	//this is regarding Binaty Expt until special will be done in ANTLR
	private boolean ifNumOperation(){
		return (getText().equals("+")||
				getText().equals("-")||
				getText().equals("*")||
				getText().equals("/"));
	}
	
	private boolOperations getBoolOperation(){
		if (getText().equals("+"))
			return boolOperations.PLUS;
		else if (getText().equals("-"))
			return boolOperations.MINUS;
		else if (getText().equals("*"))
			return boolOperations.MULTY;
		else if (getText().equals("/"))
			return boolOperations.DIV;
		else if (getText().equals("="))
			return boolOperations.EQ;
		
		return null;
	}
	
	private HaxeType getUnarOperationType(){
		if (this.ifNumOperation() &&
			this.getChild(0).getHaxeType().isNumericType()) //+/*- can be used thiw other types??
				return this.getChild(0).getHaxeType();
		//else commit Error???
		return HaxeType.haxeUndefined;
	}
	
	private HaxeType getBoolOperationType() throws HaxeCastException {
		HaxeTree leftNode = this.getChild(0);
		HaxeTree rightNode = this.getChild(1);
		HaxeType leftType = leftNode.getHaxeType();
		HaxeType rightType = rightNode.getHaxeType();

		switch (this.getBoolOperation()) {
		case EQ:
		case PLUS: {
			if (leftType.equals(HaxeType.haxeString)|| 
				rightType.equals(HaxeType.haxeString)) {
				return HaxeType.haxeString;
			} else if (areBothNumbers(leftType, rightType)) {
				return getCommonNumberType(leftType, rightType);
			} else {
				this.commitCastError();
				return HaxeType.haxeObject;
			}
		}
		case DIV: {
			if (areBothNumbers(leftType, rightType)) {
				return HaxeType.haxeFloat;
			} else {
				this.commitCastError();
				return HaxeType.haxeObject;
			}
		}
		case MINUS: {
			if (areBothNumbers(leftType, rightType)) {
				return getCommonNumberType(leftType, rightType);
			} else {
				this.commitCastError();
				return HaxeType.haxeObject;
			}
		}
		case MULTY: {
			if (areBothNumbers(leftType, rightType)) {
				if (leftType.equals(HaxeType.haxeInt)
						&& rightType.equals(HaxeType.haxeInt)) {
					return HaxeType.haxeInt;
				}
				return HaxeType.haxeFloat;
			} else {
				this.commitCastError();
				return HaxeType.haxeObject;
			}
		}
		}
		throw new HaxeCastException((HaxeTree) leftNode.parent);
	}

}
