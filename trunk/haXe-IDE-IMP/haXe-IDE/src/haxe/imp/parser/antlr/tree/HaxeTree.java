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
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.EnumNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.tree.specific.vartable.ClassDeclaration;
import haxe.imp.parser.antlr.tree.specific.vartable.DeclaredVarsTable;
import haxe.imp.parser.antlr.tree.specific.vartable.FunctionDeclaration;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclaration;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclaration.VarType;
import haxe.imp.parser.antlr.tree.specific.vartable.VarUse;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.eclipse.imp.parser.IMessageHandler;

public class HaxeTree extends CommonTree 
{
	private static IMessageHandler messageHandler;
	private boolean auxiliary = false;

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

	public static final int PARAM_LIST_TYPE = HaxeParser.PARAM_LIST; 
	public static final int TYPE_TAG_TYPE = HaxeParser.TYPE_TAG;
	public static final int SUFFIX_EXPR_TYPE = HaxeParser.SUFFIX_EXPR;
	public static final int VAR_INIT_TYPE = HaxeParser.VAR_INIT;
	public static final int MODULE_TYPE = HaxeParser.MODULE;
	public static final int ENUM_TYPE = HaxeParser.ENUM;
	public static final int RETURN_TYPE = HaxeParser.RETURN;
		
	public boolean isAuxiliary() { 
		return auxiliary;
	}

	public void setAuxiliary(final boolean auxiliary) {
		this.auxiliary = auxiliary;
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
	            getMostRightPosition()
	            , 0, 0, 0, 0);
	}
	
	private void commitCastError(){
		commitError(getText() + ": cast problems");
	}

	protected DeclaredVarsTable declaredVars;
	public DeclaredVarsTable getDeclaredVars() {
		return declaredVars;
	}

	/**
	 * Creates Declared Vars table and fills 
	 * it with declarations of 
	 * classes,
	 * enums.
	 * As they are the most high instances which may be in
	 * a correct program.
	 */
	public void calculateScope() {
		declaredVars = new DeclaredVarsTable();

		for (HaxeTree tree : getChildren()) 
		{
		    //hight levels only this
			if (tree instanceof ClassNode)
			{
    		    ClassDeclaration declaration = 
    		            new ClassDeclaration(tree.getToken());
    		    declaration.setVarType(VarType.ClassDeclaration);
    		    declaration.addAllToDeclaredVars(tree.calculateScopes());
    		    declaredVars.tryAdd(declaration);
			}
			if (tree instanceof EnumNode)
			{
			    //FIXME not implemented yet
			    continue; 
			}
		}
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
	public DeclaredVarsTable calculateScopes() {
		return null;
	}
	
	public HaxeTree getParent(){
		return (HaxeTree)super.getParent();
	}

	/**
	 * Construction of outline
	 */
	//TODO complete for other nodes - 
	public void accept(final HaxeModelVisitor visitor) {
		try {
			if (token == null || token.getType() != MODULE_TYPE) 
			{
			    return;
			}
			visitor.visit(this);
			for (VarDeclaration child : this.getDeclaredVars()) {
				child.accept(visitor);
			}
			visitor.endVisit(this);
		} catch (NullPointerException nullPointerException) {
			System.out.println(
					"Exception caught from invocation of language-specific tree model builder implementation");
			nullPointerException.printStackTrace();
		}
	}

	public void accept(final HaxeFoldingVisitor visitor) {
		try {
			if (this instanceof FunctionNode) {
				visitor.visit(this);
				// visitor.endVisit(this);
			} else if (this instanceof ClassNode) {
				visitor.visit(this);
				for (HaxeTree child : this.getChildren()) {
					child.accept(visitor);
				}
				// visitor.endVisit(this);
			} else if (this instanceof BlockScopeNode) {
				boolean isParentClass = (this.parent instanceof ClassNode);
				if (!isParentClass) {
					// visitor.visit(this, false);
					for (HaxeTree child : this.getChildren()) {
						child.accept(visitor);
					}
					// visitor.endVisit(this);
				} else {
					for (HaxeTree child : this.getChildren()) {
						child.accept(visitor);
					}
				}
			} else if (this.token != null) {
				if (this.token.getType() == MODULE_TYPE) {
					for (HaxeTree child : this.getChildren()) {
						child.accept(visitor);
					}
				} else if (this.token.getType() == ENUM_TYPE) {
					visitor.visit(this);
					for (HaxeTree child : this.getChildren()) {
						child.accept(visitor);
					}
					// visitor.endVisit(this);
				} else if (this.token.getType() == HaxeLexer.COMMENT) {
					visitor.visit(this);
				}
			}
		} catch (NullPointerException nullPointerException) {
			System.out
					.println("Exception caught from invocation of language-specific tree model builder implementation");
			nullPointerException.printStackTrace();
		}
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
	 * 
	 * @param offset
	 *            the offset
	 * @return the node by position
	 */
	public HaxeTree getNodeByPosition(final int offset) {
		if (this.getChildCount() > 0) {
			for (HaxeTree child : this.getChildren()) {
				if (child.getMostLeftPosition() <= offset
						&& offset <= child.getMostRightPosition()) {
					return child.getNodeByPosition(offset);
				}
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
	public HaxeTree getNodeByPosition(final int line,
			final int posInLine) {
		List<HaxeTree> nodes = new ArrayList<HaxeTree>(
				this.getChildren());

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
					return nodes.get(nodes.size() - 1).getNodeByPosition(line,
							posInLine);
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
					+ pretender.getText().length() > posInLine
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
	 * 
	 * @param usageNode
	 *            the usage node
	 * @return the declaration node
	 */
	public HaxeTree getDeclarationNode(final HaxeTree usageNode) 
	{
		HaxeTree parent = (HaxeTree) this.getParent();
		
		if (parent == null) 
		{
		    return new HaxeTree(0);
		}
		
		if (this.isVarDeclaration(usageNode) ||
			this.isClassDeclaration(usageNode)){
			return this;
		} else
			if (this instanceof EnumNode){
				if (this.isEnumDeclaration(usageNode))
					return this;
				else{
					if (!((EnumNode) this).getAllMembers().isEmpty()) {
						HaxeTree declaration = usageNode.isDeclaredIn(
								((EnumNode) this).getAllMembers());
						if (declaration != null) return declaration;
					}
				}
			}			
		else 
			if (this instanceof FunctionNode){
				if (this.isFuncDeclaration(usageNode))
					return this;
				else {
					HaxeTree params = ((FunctionNode) this).getParamListNode();
					if (params != null) {
						HaxeTree declaration = usageNode.isDeclaredIn(params
								.getChildren());
						if (declaration != null) return declaration;
					}
				}
		}
//TODO:think about INSTANCES later ------------>however seems to work well
		int index = parent.getChildren().indexOf(this);
		if (index > 0) {
			return (parent.getChild(index - 1)).getDeclarationNode(usageNode);
		} else {
			if (parent instanceof BlockScopeNode) {
				if (parent.getParent() instanceof ClassNode) {
					HaxeTree declaration = usageNode.isDeclaredIn((parent).getChildren());
					if (declaration != null) {
						return declaration;
					}
				}
			}
			return parent.getDeclarationNode(usageNode);
		}	
	}

	/**
	 * Checks if it is declaration of current object in passed list. If not,
	 * returns null;
	 * 
	 * @param declarations
	 *            the declarations
	 * @return the extended common tree
	 */
	private HaxeTree isDeclaredIn(final List<HaxeTree> declarations) {
		for (HaxeTree tree : declarations) {
			if (tree.isVarDeclaration(this) || 
				tree.isFuncDeclaration(this)||
				tree.isClassDeclaration(this)||
				tree.isEnumDeclaration(this)) {
				return tree;
			}
		}
		return null;
	}

	/**
	 * Checks if this object is declaration of usage.
	 * 
	 * @param usage
	 *            the usage
	 * @return true, if is declaration
	 */
	private boolean isVarDeclaration(final HaxeTree usage) {
		return ((this instanceof VarDeclarationNode)&& 
				(this.getChildren() != null) && 
				(this.getChild(0).getText().equals(usage.getText())));
	}

	/**
	 * Checks if is func declaration.
	 * 
	 * @param usage
	 *            the usage
	 * @return true, if is func declaration
	 */
	private boolean isFuncDeclaration(final HaxeTree usage) {
		return ((this instanceof FunctionNode)&&
				(this.getChild(0).getText().equals(usage.getText()))); //getFunctonName?
	}

	/**
	 * Checks if is class declaration.
	 * 
	 * @param usage
	 *            the usage
	 * @return true, if is class declaration
	 */
	private boolean isClassDeclaration(final HaxeTree usage) {
		return ((this instanceof ClassNode) && (this.getText()
				.equals(usage.getText())));
	}

	/**
	 * Checks if is enum declaration.
	 * 
	 * @param usage
	 *            the usage
	 * @return true, if is enum declaration
	 */
	private boolean isEnumDeclaration(final HaxeTree usage) {
		return ((this instanceof EnumNode) && (this.getText()
				.equals(usage.getText())));
	}

	/**
	 * Gets the all children.
	 * 
	 * @return the all children
	 */
	public ArrayList<HaxeTree> getAllChildren() {
		ArrayList<HaxeTree> childs = new ArrayList<HaxeTree>();
		if (this.getChildCount() != 0) {
			for (HaxeTree child : this.getChildren()) {
				childs.addAll(child.getAllChildren());
			}
		} else {
			childs.add(this);
		}
		return childs;
	}
	
/*
	private class ComparatorByLines implements Comparator<CommonTree> {

		@Override
		public int compare(final CommonTree arg0, final CommonTree arg1) {
			if (arg0.getLine() < arg1.getLine()) {
				return -1;
			} else if (arg0.getLine() > arg1.getLine()) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
	private class ComparatorByPosInLine implements Comparator<CommonTree> {

		@Override
		public int compare(final CommonTree arg0, final CommonTree arg1) {
			if (arg0.getCharPositionInLine() < arg1.getCharPositionInLine()) {
				return -1;
			} else if (arg0.getCharPositionInLine() > arg1.getCharPositionInLine()) {
				return 1;
			} else {
				return 0;
			}
		}
	}*/

	@Override
	@SuppressWarnings("unchecked")
	public List<HaxeTree> getChildren() {
		List<HaxeTree> res = (List<HaxeTree>)super.getChildren();
		
		if (res == null) return new ArrayList<HaxeTree>();
		
		return res;
	}

	@Override
	public HaxeTree getChild(final int i) {
		// TODO Auto-generated method stub
		return (HaxeTree) super.getChild(i);
	}

	@Override
	public CommonToken getToken() {
		// TODO Auto-generated method stub
		return (CommonToken) super.getToken();
	}
	
	public boolean setHaxeType(HaxeType type){
		return false;
	}
	
	//only first lvl
	public void calculateTypes(){ //begin with module
		if (!getDeclaredVars().isEmpty()) {
		    getDeclaredVars().calculateTypes();
		}
	}
	
	public BlockScopeNode getBlockScope(){
		return null;
	}
	
	private boolean ifNumOperation(){
		return (this.getText().equals("+")||
				this.getText().equals("-")||
				this.getText().equals("*")||
				this.getText().equals("/"));
	}
    
    public boolean ifVarDeclaration(){
        return !(this instanceof ClassDeclaration||
                this instanceof VarUse ||
                this instanceof FunctionDeclaration);
    }

    public boolean ifUndefinedType(){
        return this.getHaxeType().equals(HaxeType.haxeUndefined);
    }
	
	private boolOperations getBoolOperation(){
		if (this.getText().equals("+"))
			return boolOperations.PLUS;
		else if (this.getText().equals("-"))
			return boolOperations.MINUS;
		else if (this.getText().equals("*"))
			return boolOperations.MULTY;
		else if (this.getText().equals("/"))
			return boolOperations.DIV;
		else if (this.getText().equals("="))
			return boolOperations.EQ;
		
		return null;
	}

	//FIXME not all special nodes have their own functions and not sure about HaxeTree
	public HaxeType getHaxeType() {
		if (this instanceof HaxeTree) {			
			if (this.getType() == SUFFIX_EXPR_TYPE ||
				this.getType() == RETURN_TYPE)
				return this.getChild(0).getHaxeType(); //?TODO??????? 
			else if (this.getChildCount() == 1) //prefix expr
				return this.getUnarOperationType();
			else //2 children -> bool operation
				return this.getBoolOperationType();
		}
		
		return HaxeType.haxeUndefined;
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
