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
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.tree.specific.vartable.DeclaredVarsTable;
import haxe.imp.parser.antlr.tree.specific.vartable.FunctionDeclNode;
import haxe.imp.parser.antlr.tree.specific.vartable.VarDeclNode;
import haxe.imp.parser.antlr.tree.specific.vartable.VarUseNode;
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

/**
 * The Class ExtendedCommonTree.
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeTree extends CommonTree {

	/** The auxiliary. */
	private boolean auxiliary = false;
	private static IMessageHandler messageHandler;

	/**
	 * Contains most left position of tree/subtree
	 */
	private int mostLeftPosition = -1;

	/** The most right position. */
	private int mostRightPosition = -1;

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
		return this.auxiliary;
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
	 * Gets the most left position.
	 * 
	 * @return the most left position
	 */
	public int getMostLeftPosition() {
		if (this.auxiliary == true) {
			if (this.mostLeftPosition == -1 && this.getChildCount() > 0) {
				this.mostLeftPosition = this.getChild(0).getMostLeftPosition();
			}
			return this.mostLeftPosition;
		} else {
			if (this.mostLeftPosition == -1) {
				this.mostLeftPosition = this.getToken().getStartIndex();
				if (this.getChildCount() > 0) {
					for (HaxeTree commonTree : this.getChildren()) {
						if (this.mostLeftPosition > commonTree
								.getMostLeftPosition()) {
							this.mostLeftPosition = commonTree
									.getMostLeftPosition();
						}
					}
				}
			}
			return this.mostLeftPosition;
		}
	}

	/**
	 * Sets the most left position.
	 * 
	 * @param mostLeftPosition
	 *            the new most left position
	 */
	public void setMostLeftPosition(final int mostLeftPosition) {
		this.mostLeftPosition = mostLeftPosition;
	}

	/**
	 * Gets the most right position.
	 * Overidden for some nodes
	 * 
	 * @return the most right position
	 */
	public int getMostRightPosition() {
		if (this.auxiliary == true) {
			if (this.mostRightPosition == -1 && this.getChildCount() > 0) {
				this.mostRightPosition = this
						.getChild(this.getChildCount() - 1)
						.getMostRightPosition();
			}
			return this.mostRightPosition;
		} else {
			if (this.mostRightPosition == -1) {
				assert(this.getToken() != null);

				this.mostRightPosition = this.getToken().getStartIndex()
						+ this.getToken().getText().length()-1;
				if (this.getChildCount() > 0) {
					for (HaxeTree commonTree : this.getChildren()) {
						if (this.mostRightPosition < commonTree
								.getMostRightPosition()) {
							this.mostRightPosition = commonTree
									.getMostRightPosition();
						}
					}
				}
			}

			return this.mostRightPosition;
		}
	}

	/**
	 * Sets the most right position.
	 * 
	 * @param mostRightPosition
	 *            the new most right position
	 */
	public void setMostRightPosition(final int mostRightPosition) {
		this.mostRightPosition = mostRightPosition;
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
		this.token = t;
		this.auxiliary = auxiliary;
	}

	public HaxeTree(final int ttype, final String type,
			final boolean auxiliary) {
		this.token = new CommonToken(ttype, type);
		this.auxiliary = auxiliary;
	}

	public HaxeTree(final int ttype, final boolean auxiliary) {
		this.token = new CommonToken(ttype);
		this.auxiliary = auxiliary;
	}

	public HaxeTree(final int ttype) {
		this.token = new CommonToken(ttype);
	}

	/**
	 * Printing error messages in eclipse's text editor (as red circles at the
	 * left).
	 * 
	 * @param message
	 *            the message
	 * @param offset
	 *            the offset
	 * @param length
	 *            the length
	 */
	public void commitError(final String message, final int offset,
			final int length) {
		messageHandler.handleSimpleMessage(message, offset,
				offset + length - 1, 0, 0, 0, 0);
	}
	
	public void commitError(final String message) {
		messageHandler.handleSimpleMessage(message, 
				this.getMostLeftPosition(), this.getMostRightPosition(),
				0, 0, 0, 0);
	}
	
	private void commitCastError(){
		this.commitError(this.getText() + ": cast problems");
	}

	protected DeclaredVarsTable declaredVars;
	public DeclaredVarsTable getDeclaredVars() {
		return this.declaredVars;
	}

	public void calculateScope() {
		declaredVars = new DeclaredVarsTable();

		if (this.getChildCount() > 0) {
			for (HaxeTree tree : this.getChildren()) {
				if (tree instanceof ClassNode ||
					tree instanceof EnumNode)
					declaredVars.addAll(tree.calculateScopes()); 
			}
		}
	}
	
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
			if (this.token != null) {
				if (this.token.getType() == MODULE_TYPE) {
					visitor.visit(this);
					for (VarDeclNode child : this.getDeclaredVars().getDeclaredVars()) {
						child.accept(visitor);
					}
					/*
					for (HaxeTree child : this.getChildren()) {
						child.accept(visitor);
					}*/
					visitor.endVisit(this);
				} /*
				if (this instanceof ClassNode){
					visitor.visit(this); //FIXME!!!
					for (ScopeVarDeclNode child : this.getDeclaredVars().getDeclaredVars()) {
						if (this.getBlockScope() != null &&
							child.getScopeToken().equals(this.getBlockScope().getToken()))
							child.accept(visitor);
					}
					visitor.endVisit(this);
				}*/
			}
		} catch (NullPointerException nullPointerException) {
			System.out
					.println("Exception caught from invocation of language-specific tree model builder implementation");
			nullPointerException.printStackTrace();
			//throw nullPointerException;
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
	 * The Pair Class.
	 * @author Anatoly Kondratyev
	 */
	public class Pair {

		private int begin = -1;
		private int end = -1;


		public int getBegin() {
			return this.begin;
		}

		public void setBegin(final int begin) {
			this.begin = begin;
		}

		public int getEnd() {
			return this.end;
		}

		public void setEnd(final int end) {
			this.end = end;
		}

		public Pair(final int begin, final int end) {
			super();
			this.begin = begin;
			this.end = end;
		}

		public Pair() {
			super();
		}

		public boolean surrounds(final int value) {
			return (this.begin <= value && this.end > value) ? true : false;
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
	public HaxeTree getDeclarationNode(
			final HaxeTree usageNode) {
		HaxeTree parent = (HaxeTree) this.getParent();
		if (parent != null) {
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
		} else {
			return new HaxeTree(0);
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

	/**
	 * Gets the available vars.
	 * 
	 * @return the available vars
	 */
	/*@SuppressWarnings("unchecked")
	public ArrayList<HaxeTree> getAvailableVars() {
		if (this instanceof BlockScopeNode) {
			ArrayList arrayList = ((BlockScopeNode) this).getDeclaredVars();
			return arrayList;
		} else {
			if (this.getParent() != null) {
				return ((HaxeTree) this.getParent())
						.getAvailableVars();
			} else {
				return new ArrayList<HaxeTree>();
			}
		}
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.runtime.tree.BaseTree#getChild(int)
	 */
	@Override
	public HaxeTree getChild(final int i) {
		// TODO Auto-generated method stub
		return (HaxeTree) super.getChild(i);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.runtime.tree.CommonTree#getToken()
	 */
	@Override
	public CommonToken getToken() {
		// TODO Auto-generated method stub
		return (CommonToken) super.getToken();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.runtime.tree.CommonTree#toString()
	 
	@Override
	public String toString() {
		int startOffset = this.getMostLeftPosition();
		int endOffset = this.getMostRightPosition();
		return super.toString() + "(" + this.auxiliary + ") " + startOffset
				+ "-" + endOffset;

		// return "intValue haxe.primaryTypes.Int";
	}*/

	/**
	 * Prints full tree into console.
	 */
	public void printTree() {
		declaredVars.print();
		this.printTree(this, 0);
	}

	/**
	 * Prints the tree.
	 * 
	 * @param t
	 *            the t
	 * @param indent
	 *            the indent
	 */
	private void printTree(final HaxeTree t, final int indent) {
		if (t != null) {
			StringBuffer sb = new StringBuffer(indent);
			for (int i = 0; i < indent; i++) {
				sb = sb.append("   ");
			}
			for (int i = 0; i < t.getChildCount(); i++) {
					System.out.print(sb.toString());
				if (t.getChild(i) instanceof AssignOperationNode ||
					t.getChild(i) instanceof VarUsageNode ||
					t.getChild(i) instanceof ConstantNode)
					t.getChild(i).printTree();
				else
				if (t.getChild(i) instanceof BlockScopeNode){
					System.out.println("Block scope "+ t.getText());
				}else
					System.out.println(t.getChild(i).getText());
				this.printTree(t.getChild(i), indent + 1);
			}
		}
	}
	
	public boolean setHaxeType(HaxeType type){
		return false;
	}
	
	//only first lvl
	public void calculateTypes(){ //begin with module
		BlockScopeNode blockScope = null; 
		if (this.getChildCount() > 0) {
			for (HaxeTree tree : this.getChildren()) {
				blockScope = tree.getBlockScope();
				if (blockScope != null) {
					blockScope.calculateTypes();
				} else
					tree.calculateTypes();
			}
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
		
		return HaxeType.haxeNotYetRecognized;
	}
	
	private HaxeType getUnarOperationType(){
		if (this.ifNumOperation() &&
			this.getChild(0).getHaxeType().isNumericType()) //+/*- can be used thiw other types??
				return this.getChild(0).getHaxeType();
		//else commit Error???
		return HaxeType.haxeNotYetRecognized;
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
