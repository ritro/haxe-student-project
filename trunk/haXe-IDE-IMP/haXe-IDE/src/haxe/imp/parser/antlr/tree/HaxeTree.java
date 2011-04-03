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
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclaration;
import haxe.imp.parser.antlr.tree.specific.VarUsage;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
						+ this.getToken().getText().length();
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
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new extended common tree.
	 * 
	 * @param node
	 *            the node
	 */
	public HaxeTree(final CommonTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new extended common tree.
	 * 
	 * @param t
	 *            the t
	 */
	public HaxeTree(final Token t) {
		super(t);
	}

	/**
	 * Instantiates a new extended common tree.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param t
	 *            the t
	 * @param auxiliary
	 *            the auxiliary
	 */
	public HaxeTree(final int ttype, final Token t,
			final boolean auxiliary) {
		this.token = t;
		this.auxiliary = auxiliary;
	}

	/**
	 * Instantiates a new extended common tree.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param type
	 *            the type
	 * @param auxiliary
	 *            the auxiliary
	 */
	public HaxeTree(final int ttype, final String type,
			final boolean auxiliary) {
		this.token = new CommonToken(ttype, type);
		this.auxiliary = auxiliary;
	}

	/**
	 * Instantiates a new extended common tree.
	 * 
	 * @param ttype
	 *            the ttype
	 * @param auxiliary
	 *            the auxiliary
	 */
	public HaxeTree(final int ttype, final boolean auxiliary) {
		this.token = new CommonToken(ttype);
		this.auxiliary = auxiliary;
	}

	/**
	 * Instantiates a new extended common tree.
	 * 
	 * @param ttype
	 *            the ttype
	 */
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
	private void commitError(final String message, final int offset,
			final int length) {
		messageHandler.handleSimpleMessage(message, offset,
				offset + length - 1, 0, 0, 0, 0);
	}

	/**
	 * Calculating scopes in tree. Should be applied only to module
	 * 
	 */
	public void calculateScopes() {
		if (this.getChildCount() > 0) {
			for (HaxeTree tree : this.getChildren()) {
				if (tree instanceof ClassNode) {
					BlockScopeNode blockScope = ((ClassNode) tree).getBlockScope();
					if (blockScope != null) {
						blockScope.calculateScopes(blockScope);
					}
					break;
				}
			}
		}
	}

	/**
	 * Accept.
	 * 
	 * @param visitor
	 *            the visitor
	 */

	public void accept(final HaxeModelVisitor visitor) {
		try {
			if (this instanceof FunctionNode) {
				visitor.visit(this);
				visitor.endVisit(this);
			} else if (this instanceof ClassNode) {
				visitor.visit(this);
				for (HaxeTree child : this.getChildren()) {
					child.accept(visitor);
				}
				visitor.endVisit(this);
			} else if (this instanceof VarDeclaration) {
				visitor.visit(this);
				visitor.endVisit(this);
			} else if (this instanceof BlockScopeNode) {
				boolean isParentClass = (this.parent instanceof ClassNode);
				if (!isParentClass) {
					visitor.visit(this, false);
					for (HaxeTree child : this.getChildren()) {
						child.accept(visitor);
					}
					visitor.endVisit(this);
				} else {
					for (HaxeTree child : this.getChildren()) {
						child.accept(visitor);
					}
				}
			} else if (this.token != null) {
				if (this.token.getType() == MODULE_TYPE) {
					visitor.visit(this);
					for (HaxeTree child : this.getChildren()) {
						child.accept(visitor);
					}
					visitor.endVisit(this);
				} else if (this.token.getType() == ENUM_TYPE) {
					visitor.visit(this);
					for (HaxeTree child : this.getChildren()) {
						child.accept(visitor);
					}
					visitor.endVisit(this);
				}
			}
		} catch (NullPointerException nullPointerException) {
			System.out
					.println("Exception caught from invocation of language-specific tree model builder implementation");
			nullPointerException.printStackTrace();
			//throw nullPointerException;
		}
	}

	/**
	 * Accept.
	 * 
	 * @param visitor
	 *            the visitor
	 */
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
	 * Calculate scopes. Also it calculate primitive types. Thi operaqtion
	 * should be also used before most operations on code (hyperlinking,
	 * help-covering, autocompletion)
	 * 
	 *  TODO: rewrite using override
	 *  
	 * @param blockScope
	 *            the block scope
	 * @throws HaxeCastException
	 *             the haxe cast exception
	 */
	protected void calculateScopes(final BlockScopeNode blockScope)
			throws HaxeCastException {
		if (this instanceof BlockScopeNode) {
			BlockScopeNode thisAsBlockScope = (BlockScopeNode) this;
			thisAsBlockScope.setDeclaredVars(blockScope.getDeclaredVars());

			if (this.getParent() instanceof FunctionNode) {
				ArrayList<VarUsage> params = ((FunctionNode) this.getParent())
						.getParametersAsVarUsage();

				ArrayList<VarUsage> united = new ArrayList<VarUsage>(
						thisAsBlockScope.getDeclaredVars());
				united.addAll(params);
				thisAsBlockScope.setDeclaredVars(united);
			} else if (this.getParent() instanceof ClassNode) {
				ArrayList<VarUsage> varsFromClass = ((ClassNode) this
						.getParent()).getAllDeclaredVars();
				varsFromClass.addAll(thisAsBlockScope.getDeclaredVars());
				thisAsBlockScope.setDeclaredVars(varsFromClass);
			}
			if (this.getChildCount() > 0) {
				for (HaxeTree tree : this.getChildren()) {
					tree.calculateScopes(thisAsBlockScope);
				}
			}
		} else if (this instanceof VarDeclaration) {
			VarDeclaration declarationTree = (VarDeclaration) this;
			declarationTree.getVarNameNode().setHaxeType(
					declarationTree.getHaxeType());
			VarUsage varUsage = declarationTree.getVarNameNode().getClone();

			HaxeTree varInitNode = declarationTree.getVAR_INIT_NODE();
			if (varInitNode != null) {
				if (varInitNode.getChildCount() > 0) {
					for (HaxeTree tree : varInitNode.getChildren()) {
						tree.calculateScopes(blockScope);
					}
				}
			}
			if (varUsage.getHaxeType().equals(HaxeType.haxeUndefined)) {
					//TODO Trying to calculate type
			}
			if (blockScope.getDeclaredVars().contains(varUsage)) {
				this.commitError("Var is already declared",
						((CommonToken) varUsage.getToken()).getStartIndex(),
						((CommonToken) varUsage.getToken()).getText().length());
			} else {
				// TODO could be used without cloning
				ArrayList<VarUsage> united = new ArrayList<VarUsage>(blockScope
						.getDeclaredVars());
				united.add(varUsage);
				blockScope.setDeclaredVars(united);
			}
		}else if (this instanceof VarUsage) {
			VarUsage thisAsVarUsage = (VarUsage) this;
			if (thisAsVarUsage.getHaxeType().equals(
					HaxeType.haxeNotYetRecognized)) {
				if (!thisAsVarUsage.isAuxiliary()){					
					if (blockScope.doScopeContainsVarName(thisAsVarUsage.getText())) {
						thisAsVarUsage.setHaxeType(blockScope
								.getVarInScopeType(thisAsVarUsage.getText()));
					} else {
						this.commitError(thisAsVarUsage.getText()
								+ " is not declared", ((CommonToken) thisAsVarUsage
								.getToken()).getStartIndex(),
								((CommonToken) thisAsVarUsage.getToken()).getText()
										.length());
						return;
					}
				}
				else{
					//simple identifier
					if (//thisAsVarUsage.getChildCount()==1 &&
						thisAsVarUsage.getChild(0).getChildCount()==0){
						if (blockScope.doScopeContainsVarName(thisAsVarUsage.getText())) {
							thisAsVarUsage.setHaxeType(blockScope
									.getVarInScopeType(thisAsVarUsage.getText()));
						} else {
							this.commitError(thisAsVarUsage.getText()
									+ " is not declared", thisAsVarUsage.getMostLeftPosition(),
									thisAsVarUsage.getMostRightPosition()-
															thisAsVarUsage.getMostLeftPosition());
							return;
						}}
					else{
						//TODO здесь искать по пакетам, параметрам других классов и тп
						this.commitError(thisAsVarUsage.getText()+ " can't yet define Those", 
								thisAsVarUsage.getMostLeftPosition(),
								thisAsVarUsage.getMostRightPosition()-
															thisAsVarUsage.getMostLeftPosition());
						return;
					}
				}
			}
		}else if (this instanceof AssignOperationNode) {
			if (this.getChildCount() > 0) {
				for (HaxeTree tree : this.getChildren()) {
					tree.calculateScopes(blockScope);
				}
			}
			AssignOperationNode thisAsAssignNode = (AssignOperationNode)this;
			HaxeType leftPart = (thisAsAssignNode.getLeftOperand()).getHaxeType();			
			HaxeType rightPart = this.getTypeOfOperation(thisAsAssignNode.getRightOperand());
			if (!HaxeType.isAvailableAssignement(leftPart, rightPart)) {
				//длинна and offset is right, проверять всплыв подск где то в другом месте
				this.commitError("Can't cast "+
						((VarUsage)this.getChild(1)).getText()+" of type "+ rightPart.getTypeName()
						+" to type "+leftPart.getTypeName(), 
						this.getToken().getStartIndex(), 
												this.getToken().getText().length());
				return;
			}
		} else if (this instanceof FunctionNode) {
			BlockScopeNode funcBlockScopeNode = ((FunctionNode) this)
					.getBlockScope();
			if (funcBlockScopeNode != null) {
				funcBlockScopeNode.calculateScopes(blockScope);
			}
		} else {
			if (this.getChildren() != null) {
				for (HaxeTree tree : this.getChildren()) {
					tree.calculateScopes(blockScope);
				}
			}
		}
	}

	/**
	 * Gets the type of operation.
	 * 
	 * @param leftNode
	 *            the left node
	 * @param rightNode
	 *            the right node
	 * @param operator
	 *            the operator
	 * @return the type of operation
	 * @throws HaxeCastException
	 *             the haxe cast exception
	 */
	private HaxeType getTypeOfOperation(final HaxeTree leftNode,
			final HaxeTree rightNode, final boolOperations operator)
			throws HaxeCastException {
		HaxeType leftType = this.getTypeOfOperation(leftNode);
		HaxeType rightType = this.getTypeOfOperation(rightNode);
		switch (operator) {
		case EQ:
		case PLUS: {
			if (leftType.equals(HaxeType.haxeString)
					|| rightType.equals(HaxeType.haxeString)) {
				return HaxeType.haxeString;
			} else if (areBothNumbers(leftType, rightType)) {
				return getCommonNumberType(leftType, rightType);
			} else {
				this.commitError(leftNode.parent.getText() + ": cast problems",
						((CommonToken) leftNode.parent.getToken())
								.getStartIndex(), leftNode.parent.getToken()
								.getText().length());
				return HaxeType.haxeObject;
			}
		}
		case DIV: {
			if (areBothNumbers(leftType, rightType)) {
				return HaxeType.haxeFloat;
			} else {
				this.commitError(leftNode.parent.getText() + ": cast problems",
						((CommonToken) leftNode.parent.getToken())
								.getStartIndex(), leftNode.parent.getToken()
								.getText().length());
				return HaxeType.haxeObject;
			}
		}
		case MINUS: {
			if (areBothNumbers(leftType, rightType)) {
				return getCommonNumberType(leftType, rightType);
			} else {
				this.commitError(leftNode.parent.getText() + ": cast problems",
						((CommonToken) leftNode.parent.getToken())
								.getStartIndex(), leftNode.parent.getToken()
								.getText().length());
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
				this.commitError(leftNode.parent.getText() + ": cast problems",
						((CommonToken) leftNode.parent.getToken())
								.getStartIndex(), leftNode.parent.getToken()
								.getText().length());
				return HaxeType.haxeObject;
			}
		}
		}
		throw new HaxeCastException((HaxeTree) leftNode.parent);
	}

	/**
	 * Gets the type of operation.
	 * 
	 * @param node
	 *            the node
	 * @return the type of operation
	 * @throws HaxeCastException
	 */
	private HaxeType getTypeOfOperation(final HaxeTree node)
			throws HaxeCastException {
		if (node instanceof VarUsage) {
			return node.getHaxeType();
		} else if (node instanceof HaxeTree) {
			if (node.getType() == SUFFIX_EXPR_TYPE) {
				/**
				 * TODO check types of arguments
				 */
				return ((VarUsage) node.getChild(0)).getHaxeType();
			} else if (node.getText().equals("+")) {
				return this.getTypeOfOperation(node.getChild(0), node
						.getChild(1), boolOperations.PLUS);
			} else if (node.getText().equals("-")) {
				return this.getTypeOfOperation(node.getChild(0), node
						.getChild(1), boolOperations.MINUS);
			} else if (node.getText().equals("*")) {
				return this.getTypeOfOperation(node.getChild(0), node
						.getChild(1), boolOperations.MULTY);
			} else if (node.getText().equals("/")) {
				return this.getTypeOfOperation(node.getChild(0), node
						.getChild(1), boolOperations.DIV);
			} else if (node.getText().equals("=")) {
				return this.getTypeOfOperation(node.getChild(0), node
						.getChild(1), boolOperations.EQ);
			} 
		}
		return HaxeType.haxeUndefined;
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
				this.isClassDeclaration(usageNode)) {
				return this;
			} else 
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
				tree.isClassDeclaration(this)) {
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
		return ((this instanceof VarDeclaration)&& 
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
		return ((this instanceof ClassNode) && (this.getChild(0).getText()
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
	@SuppressWarnings("unchecked")
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

	/**
	 * The Class ComparatorByLines.
	 * 
	 * @author Anatoly Kondratyev
	 */
	private class ComparatorByLines implements Comparator<CommonTree> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
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

	/**
	 * The Class ComparatorByPosInLine.
	 * 
	 * @author Anatoly Kondratyev
	 */
	private class ComparatorByPosInLine implements Comparator<CommonTree> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
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
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.runtime.tree.BaseTree#getChildren()
	 */
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
				if (t.getChild(i) instanceof AssignOperationNode)
					((AssignOperationNode)t.getChild(i)).printTree();
				else
				if (t.getChild(i) instanceof VarUsage)
					((VarUsage)t.getChild(i)).printTree();
				else
					System.out.println(t.getChild(i).getText());
				this.printTree(t.getChild(i), indent + 1);
			}
		}
	}

	//FIXME not all special nodes have their own functions
	public HaxeType getHaxeType() {
		if (this instanceof BlockScopeNode)
			return ((BlockScopeNode)this).getHaxeType();
		else if (this instanceof VarUsage)
			return ((VarUsage)this).getHaxeType();
		else if (this instanceof VarDeclaration)
			return ((VarDeclaration)this).getHaxeType();
		else if (this instanceof ClassNode)
			return ((ClassNode)this).getHaxeType();
		
		return HaxeType.haxeNotYetRecognized;
	}

}
