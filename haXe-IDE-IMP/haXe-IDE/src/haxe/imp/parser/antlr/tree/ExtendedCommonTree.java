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
import haxe.imp.parser.antlr.main.TinyHaxeTry1Lexer;
import haxe.imp.parser.antlr.main.TinyHaxeTry1Parser;
import haxe.imp.parser.antlr.tree.exceptions.AlreadyDeclaredVarDeclarationException;
import haxe.imp.parser.antlr.tree.exceptions.HaxeCastException;
import haxe.imp.parser.antlr.tree.exceptions.NotDeclaredVarUsageException;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclaration;
import haxe.imp.parser.antlr.tree.specific.VarUsage;
import haxe.imp.parser.antlr.utils.HaxeType;
import haxe.imp.treeModelBuilder.HaxeTreeModelBuilder.HaxeModelVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.eclipse.imp.parser.IMessageHandler;

// TODO: Auto-generated Javadoc
/**
 * The Class ExtendedCommonTree.
 * 
 * @author Anatoly Kondratyev
 */
public class ExtendedCommonTree extends CommonTree {

	/** The auxiliary. */
	private boolean auxiliary = false;

	private static IMessageHandler messageHandler;

	/**
	 * В данный момент будут использоваться в основном для узлов, которые
	 * <code>auxilary == true</code>. Дают самую левую и самую правую координату
	 * поддерева
	 */
	private int mostLeftPosition = -1;
	private int mostRightPosition = -1;

	/**
	 * Next two fields is used to determine if mostLeft/RightPosition calculated
	 * correctly
	 */
	private boolean isMostLeftPositionChecked = false;
	private boolean isMostRightPositionChecked = false;

	/**
	 * The Enum boolOperations.
	 * 
	 * @author Anatoly Kondratyev
	 */
	private enum boolOperations {

		/** The PLUS. */
		PLUS,
		/** The MINUS. */
		MINUS,
		/** The MULTY. */
		MULTY,
		/** The DIV. */
		DIV,
		/** The PERCENT. */
		PERCENT
	};

	/** The Constant PARAM_LIST_TYPE. */
	public static final int PARAM_LIST_TYPE = (new ArrayList<String>(Arrays
			.asList(TinyHaxeTry1Parser.tokenNames)))
			.indexOf(TreeTokens.PARAM_LIST.toString());

	/** The Constant TYPE_TAG_TYPE. */
	public static final int TYPE_TAG_TYPE = (new ArrayList<String>(Arrays
			.asList(TinyHaxeTry1Parser.tokenNames)))
			.indexOf(TreeTokens.TYPE_TAG.toString());

	/** The Constant SUFFIX_EXPR_TYPE. */
	public static final int SUFFIX_EXPR_TYPE = (new ArrayList<String>(Arrays
			.asList(TinyHaxeTry1Parser.tokenNames)))
			.indexOf(TreeTokens.SUFFIX_EXPR.toString());

	/** The Constant VAR_INIT_TYPE. */
	public static final int VAR_INIT_TYPE = (new ArrayList<String>(Arrays
			.asList(TinyHaxeTry1Parser.tokenNames)))
			.indexOf(TreeTokens.VAR_INIT.toString());

	/** The Constant MODULE_TYPE. */
	public static final int MODULE_TYPE = (new ArrayList<String>(Arrays
			.asList(TinyHaxeTry1Parser.tokenNames))).indexOf(TreeTokens.MODULE
			.toString());

	/** The Constant ENUM_TYPE. */
	public static final int ENUM_TYPE = (new ArrayList<String>(Arrays
			.asList(TinyHaxeTry1Parser.tokenNames))).indexOf(TreeTokens.ENUM
			.toString());

	/**
	 * Checks if is auxiliary.
	 * 
	 * @return the auxiliary
	 */
	public boolean isAuxiliary() {
		return this.auxiliary;
	}

	/**
	 * Sets the auxiliary.
	 * 
	 * @param auxiliary
	 *            the auxiliary to set
	 */
	public void setAuxiliary(final boolean auxiliary) {
		this.auxiliary = auxiliary;
	}

	/**
	 * @param messageHandler
	 *            the messageHandler to set
	 */
	public static void setMessageHandler(final IMessageHandler messageHandler) {
		ExtendedCommonTree.messageHandler = messageHandler;
	}

	/**
	 * @return the messageHandler
	 */
	public static IMessageHandler getMessageHandler() {
		return messageHandler;
	}

	public int getMostLeftPosition() {
		if (this instanceof BlockScopeNode) {
			return ((BlockScopeNode) this).getlBracketPosition();
		} else if (this.auxiliary == true) {
			if (this.mostLeftPosition == -1 && this.getChildCount() > 0) {
				this.mostLeftPosition = this.getChild(0).getMostLeftPosition();
			}
			return this.mostLeftPosition;
		} else {
			if (this.mostLeftPosition == -1) {
				this.mostLeftPosition = this.getToken().getStartIndex();
				if (this.getChildCount() > 0) {
					for (ExtendedCommonTree commonTree : this.getChildren()) {
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

	public void setMostLeftPosition(final int mostLeftPosition) {
		this.mostLeftPosition = mostLeftPosition;
	}

	public int getMostRightPosition() {
		if (this instanceof BlockScopeNode) {
			return ((BlockScopeNode) this).getrBracketPosition();
		} else if (this.auxiliary == true) {
			if (this.mostRightPosition == -1 && this.getChildCount() > 0) {
				this.mostRightPosition = this
						.getChild(this.getChildCount() - 1)
						.getMostRightPosition();
			}
			return this.mostRightPosition;
		} else {

			if (this.mostRightPosition == -1) {
				this.mostRightPosition = this.getToken().getStartIndex()
						+ this.getToken().getText().length();
				if (this.getChildCount() > 0) {
					for (ExtendedCommonTree commonTree : this.getChildren()) {
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

	public void setMostRightPosition(final int mostRightPosition) {
		this.mostRightPosition = mostRightPosition;
	}

	/**
	 * Instantiates a new extended common tree.
	 */
	public ExtendedCommonTree() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new extended common tree.
	 * 
	 * @param node
	 *            the node
	 */
	public ExtendedCommonTree(final CommonTree node) {
		super(node);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new extended common tree.
	 * 
	 * @param t
	 *            the t
	 */
	public ExtendedCommonTree(final Token t) {
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
	public ExtendedCommonTree(final int ttype, final Token t,
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
	public ExtendedCommonTree(final int ttype, final String type,
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
	public ExtendedCommonTree(final int ttype, final boolean auxiliary) {
		System.out.println("Extended: " + ttype);
		this.token = new CommonToken(ttype);
		this.auxiliary = auxiliary;
	}

	/**
	 * Instantiates a new extended common tree.
	 * 
	 * @param ttype
	 *            the ttype
	 */
	public ExtendedCommonTree(final int ttype) {
		this.token = new CommonToken(ttype);
	}

	/**
	 * Printing error messages in eclipse's text editor (as red circles at the
	 * left)
	 * 
	 * @param message
	 * @param offset
	 * @param length
	 */
	private void commitError(final String message, final int offset,
			final int length) {
		messageHandler.handleSimpleMessage(message, offset,
				offset + length - 1, 0, 0, 0, 0);
	}

	/**
	 * Calculating scopes in tree. Should be applied only to module
	 * 
	 * @throws AlreadyDeclaredVarDeclarationException
	 *             the already declared var declaration exception
	 * @throws NotDeclaredVarUsageException
	 *             the not declared var usage exception
	 */
	public void calculateScopes() {
		if (this.getChildCount() > 0) {
			for (ExtendedCommonTree tree : this.getChildren()) {
				if (tree instanceof ClassNode) {
					((ClassNode) tree).getBlockScope().calculateScopes(
							((ClassNode) tree).getBlockScope());
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
			if (this.token.getType() == MODULE_TYPE) {
				visitor.visit(this);
				for (ExtendedCommonTree child : this.getChildren()) {
					child.accept(visitor);
				}
				visitor.endVisit(this);
			} else if (this instanceof FunctionNode) {
				visitor.visit(this);
				visitor.endVisit(this);
			} else if (this instanceof ClassNode) {
				visitor.visit(this);
				for (ExtendedCommonTree child : this.getChildren()) {
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
					for (ExtendedCommonTree child : this.getChildren()) {
						child.accept(visitor);
					}
					visitor.endVisit(this);
				} else {
					for (ExtendedCommonTree child : this.getChildren()) {
						child.accept(visitor);
					}
				}
			} else if (this.token.getType() == ENUM_TYPE) {
				visitor.visit(this);
				for (ExtendedCommonTree child : this.getChildren()) {
					child.accept(visitor);
				}
				visitor.endVisit(this);
			}
		} catch (NullPointerException nullPointerException) {
			System.out
					.println("Exception caught from invocation of language-specific tree model builder implementation");
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
			if (this.token.getType() == MODULE_TYPE) {
				for (ExtendedCommonTree child : this.getChildren()) {
					child.accept(visitor);
				}
			} else if (this instanceof FunctionNode) {
				visitor.visit(this);
				// visitor.endVisit(this);
			} else if (this instanceof ClassNode) {
				visitor.visit(this);
				for (ExtendedCommonTree child : this.getChildren()) {
					child.accept(visitor);
				}
				// visitor.endVisit(this);
			} else if (this instanceof BlockScopeNode) {
				boolean isParentClass = (this.parent instanceof ClassNode);
				if (!isParentClass) {
					// visitor.visit(this, false);
					for (ExtendedCommonTree child : this.getChildren()) {
						child.accept(visitor);
					}
					// visitor.endVisit(this);
				} else {
					for (ExtendedCommonTree child : this.getChildren()) {
						child.accept(visitor);
					}
				}
			} else if (this.token.getType() == ENUM_TYPE) {
				visitor.visit(this);
				for (ExtendedCommonTree child : this.getChildren()) {
					child.accept(visitor);
				}
				// visitor.endVisit(this);
			} else if (this.token.getType() == TinyHaxeTry1Lexer.COMMENT) {
				visitor.visit(this);
			}
		} catch (NullPointerException nullPointerException) {
			System.out
					.println("Exception caught from invocation of language-specific tree model builder implementation");
		}
	}

	/**
	 * Calculate scopes.
	 * 
	 * @param blockScope
	 *            the block scope
	 * @throws AlreadyDeclaredVarDeclarationException
	 *             the already declared var declaration exception
	 * @throws NotDeclaredVarUsageException
	 *             the not declared var usage exception
	 * @throws HaxeCastException
	 *             the haxe cast exception
	 */
	protected void calculateScopes(final BlockScopeNode blockScope)
			throws HaxeCastException {
		if (this instanceof BlockScopeNode) {
			BlockScopeNode thisAsBlockScope = (BlockScopeNode) this;
			thisAsBlockScope.setDeclaredVars(blockScope.getDeclaredVarsClone());

			if (this.getParent() instanceof FunctionNode) {
				ArrayList<VarUsage> params = ((FunctionNode) this.getParent())
						.getParametersAsVarUsage();

				ArrayList<VarUsage> united = new ArrayList<VarUsage>(
						thisAsBlockScope.getDeclaredVarsClone());
				united.addAll(params);
				thisAsBlockScope.setDeclaredVars(united);
			} else if (this.getParent() instanceof ClassNode) {
				ArrayList<VarUsage> varsFromClass = ((ClassNode) this
						.getParent()).getAllDeclaredVars();
				varsFromClass.addAll(thisAsBlockScope.getDeclaredVarsClone());
				thisAsBlockScope.setDeclaredVars(varsFromClass);
			}
			if (this.getChildCount() > 0) {
				for (ExtendedCommonTree tree : this.getChildren()) {
					tree.calculateScopes(thisAsBlockScope);
				}
			}
		} else if (this instanceof VarDeclaration) {
			VarDeclaration declarationTree = (VarDeclaration) this;
			declarationTree.getVarNameNode().setHaxeType(
					declarationTree.getVarType());
			VarUsage varUsage = declarationTree.getVarNameNode().getClone();

			ExtendedCommonTree varInitNode = declarationTree.getVAR_INIT_NODE();
			if (varInitNode != null) {
				if (varInitNode.getChildCount() > 0) {
					for (ExtendedCommonTree tree : varInitNode.getChildren()) {
						tree.calculateScopes(blockScope);
					}
				}
			}

			if (varUsage.getHaxeType().equals(HaxeType.haxeUndefined)) {
				// Попробовать посчитать тип выражения
			}
			if (blockScope.getDeclaredVarsClone().contains(varUsage)) {
				this.commitError("Var is already declared",
						((CommonToken) varUsage.getToken()).getStartIndex(),
						((CommonToken) varUsage.getToken()).getText().length());
				// throw new AlreadyDeclaredVarDeclarationException();
			} else {
				// TODO could be used without cloning
				ArrayList<VarUsage> united = new ArrayList<VarUsage>(blockScope
						.getDeclaredVarsClone());
				united.add(varUsage);
				blockScope.setDeclaredVars(united);
			}
		} else if (this instanceof AssignOperationNode) {
			// 1. Пройтись по всем сыновьям, и всем использованиям переменным
			// присвоить необходимый тип.
			if (this.getChildCount() > 0) {
				for (ExtendedCommonTree tree : this.getChildren()) {
					tree.calculateScopes(blockScope);
				}
			}

			HaxeType leftPart = ((VarUsage) this.getChild(0)).getHaxeType();
			HaxeType rightPart = this.getTypeOfOperation(this.getChild(1));

			if (HaxeType.isAvailableAssignement(leftPart, rightPart)) {
				if (!leftPart.equals(rightPart)) {
					// ((VarUsage) this.getChild(0)).setVarType(rightPart);
					// blockScope.getDeclaredVars().indexOf(arg0)
				}
			} else {
				this.commitError(this.getText() + ": cast problems", this
						.getToken().getStartIndex(), this.getToken().getText()
						.length());
				return;
				// throw new HaxeCastException(this);
			}

		} else if (this instanceof VarUsage) {
			VarUsage thisAsVarUsage = (VarUsage) this;
			if (thisAsVarUsage.getHaxeType().equals(
					HaxeType.haxeNotYetRecognized)) {

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
					// throw new NotDeclaredVarUsageException(thisAsVarUsage);
				}
			}
		} else if (this instanceof FunctionNode) {
			BlockScopeNode funcBlockScopeNode = ((FunctionNode) this)
					.getBlockScope();
			if (funcBlockScopeNode != null) {
				funcBlockScopeNode.calculateScopes(blockScope);
			}
		} else {
			if (this.getChildren() != null) {
				for (ExtendedCommonTree tree : this.getChildren()) {
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
	private HaxeType getTypeOfOperation(final ExtendedCommonTree leftNode,
			final ExtendedCommonTree rightNode, final boolOperations operator)
			throws HaxeCastException {
		HaxeType leftType = this.getTypeOfOperation(leftNode);
		HaxeType rightType = this.getTypeOfOperation(rightNode);
		switch (operator) {
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
				// throw new HaxeCastException(
				// (ExtendedCommonTree) leftNode.parent);
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

				// throw new HaxeCastException(
				// (ExtendedCommonTree) leftNode.parent);
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

				// throw new HaxeCastException(
				// (ExtendedCommonTree) leftNode.parent);
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

				// throw new HaxeCastException(
				// (ExtendedCommonTree) leftNode.parent);
			}
		}
		}
		throw new HaxeCastException((ExtendedCommonTree) leftNode.parent);
	}

	/**
	 * Gets the type of operation.
	 * 
	 * @param node
	 *            the node
	 * @return the type of operation
	 * @throws HaxeCastException
	 *             the haxe cast exception
	 */
	private HaxeType getTypeOfOperation(final ExtendedCommonTree node)
			throws HaxeCastException {
		if (node instanceof VarUsage) {
			return ((VarUsage) node).getHaxeType();
		} else if (node instanceof ExtendedCommonTree) {
			if (node.getType() == SUFFIX_EXPR_TYPE) {
				/**
				 * TODO Проверять корректность передаваемых аргументов
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
			}
		}
		return HaxeType.haxeUndefined;
	}

	/**
	 * The Class Pair.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public class Pair {

		/** The begin. */
		private int begin = -1;

		/** The end. */
		private int end = -1;

		/**
		 * Gets the begin.
		 * 
		 * @return the begin
		 */
		public int getBegin() {
			return this.begin;
		}

		/**
		 * Sets the begin.
		 * 
		 * @param begin
		 *            the new begin
		 */
		public void setBegin(final int begin) {
			this.begin = begin;
		}

		/**
		 * Gets the end.
		 * 
		 * @return the end
		 */
		public int getEnd() {
			return this.end;
		}

		/**
		 * Sets the end.
		 * 
		 * @param end
		 *            the new end
		 */
		public void setEnd(final int end) {
			this.end = end;
		}

		/**
		 * Instantiates a new pair.
		 * 
		 * @param begin
		 *            the begin
		 * @param end
		 *            the end
		 */
		public Pair(final int begin, final int end) {
			super();
			this.begin = begin;
			this.end = end;
		}

		/**
		 * Instantiates a new pair.
		 */
		public Pair() {
			super();
		}

		/**
		 * Surrounds.
		 * 
		 * @param value
		 *            the value
		 * @return true, if successful
		 */
		public boolean surrounds(final int value) {
			return (this.begin <= value && this.end > value) ? true : false;
		}
	}

	/**
	 * Метод нужен для подсчета отступа и длины узла для тех узлов, которые
	 * <code>auxilary==true</code>. Для обычных узлов я прост осмотрю
	 * соответсвующий токен, для дополнительных - смотрю первого и последнего
	 * сына. Считается, что дополнительные узлы не могут быть листьями.
	 * 
	 * @return the region for node
	 */
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
	}

	/**
	 * Get most-inner node of AST tree by it's offset.
	 * 
	 * @param offset
	 *            the offset
	 * @return the node by position
	 */
	public ExtendedCommonTree getNodeByPosition(final int offset) {
		if (this.getChildCount() > 0) {
			for (ExtendedCommonTree child : this.getChildren()) {
				int mostLeft = child.getMostLeftPosition();
				int mostRight = child.getMostRightPosition();
				if (child.getMostLeftPosition() <= offset
						&& offset <= child.getMostRightPosition()) {
					return child.getNodeByPosition(offset);
				}
			}
		}
		return this;
		// ArrayList<ExtendedCommonTree> nodes = this.getChildCount() > 0 ?
		// (ArrayList<ExtendedCommonTree>) (this
		// .getChildren()).clone()
		// : new ArrayList<ExtendedCommonTree>();
		//
		// CommonToken token = (CommonToken) this.getToken();
		//
		// if (!this.auxiliary) {
		// if (token.getStartIndex() <= offset
		// && (token.getStartIndex() + token.getText().length()) > offset) {
		// return this;
		// } else {
		// ExtendedCommonTree pretender = nodes.size() > 0 ? nodes.get(0)
		// : null;
		// for (int i = 0; i <= nodes.size() - 1; i++) {
		// pretender = nodes.get(i);
		// if (pretender.getRegionForNode().surrounds(offset)) {
		// return pretender.getNodeByPosition(offset);
		// } else if (pretender.getRegionForNode().getBegin() > offset) {
		// if (pretender.getChildCount() > 0) {
		// if (pretender.getChild(0).getRegionForNode()
		// .getBegin() < pretender.getRegionForNode()
		// .getBegin()) {
		// return pretender.getChild(0).getNodeByPosition(
		// offset);
		// }
		// } else {
		// if (i >= 1) {
		// return nodes.get(i - 1).getNodeByPosition(
		// offset);
		// } else {
		// return this;
		// }
		// }
		// } else if (pretender.doTreeContainsOffsetInNode(offset)) {
		// return pretender.getNodeWithOffset(offset);
		// }
		// }
		// return pretender;
		// }
		// } else {
		// if (nodes.size() > 0) {
		// ExtendedCommonTree pretender = nodes.get(0);
		// for (int i = 0; i <= nodes.size() - 1; i++) {
		// pretender = nodes.get(i);
		// if (pretender.getRegionForNode().surrounds(offset)) {
		// return pretender.getNodeByPosition(offset);
		// } else if (pretender.getRegionForNode().getBegin() > offset) {
		// if (i == 0) {
		// return this;
		// } else {
		// return nodes.get(i - 1).getNodeByPosition(offset);
		// }
		// }
		// }
		// return pretender.getNodeByPosition(offset);
		// } else {
		// return this;
		// }
		// }
	}

	/**
	 * Do tree contains offset in node.
	 * 
	 * @param offset
	 *            the offset
	 * @return true, if successful
	 */
	private boolean doTreeContainsOffsetInNode(final int offset) {
		CommonToken commonToken = (CommonToken) this.getToken();
		if (commonToken != null) {
			if (commonToken.getStartIndex() <= offset
					&& commonToken.getStartIndex()
							+ commonToken.getText().length() > offset) {
				return true;
			} else {
				if (this.getChildCount() > 0) {
					for (ExtendedCommonTree commonTree : this.getChildren()) {
						if (commonTree.doTreeContainsOffsetInNode(offset)) {
							return true;
						}
					}
				} else {
					return false;
				}
			}
		}
		return false;
	}

	/**
	 * Gets the node with offset.
	 * 
	 * @param offset
	 *            the offset
	 * @return the node with offset
	 */
	private ExtendedCommonTree getNodeWithOffset(final int offset) {
		CommonToken commonToken = (CommonToken) this.getToken();
		if (commonToken.getStartIndex() <= offset
				&& commonToken.getStartIndex() + commonToken.getText().length() > offset) {
			return this;
		} else {
			if (this.getChildCount() > 0) {
				for (ExtendedCommonTree commonTree : this.getChildren()) {
					if (commonTree.getNodeWithOffset(offset) != null) {
						return commonTree.getNodeWithOffset(offset);
					}
				}
			} else {
				return null;
			}
		}
		return null;
	}

	/**
	 * Gets the node by position.
	 * 
	 * @param line
	 *            the line
	 * @param posInLine
	 *            the pos in line
	 * @return the node by position
	 */
	@SuppressWarnings("unchecked")
	public ExtendedCommonTree getNodeByPosition(final int line,
			final int posInLine) {
		ArrayList<ExtendedCommonTree> nodes = (ArrayList<ExtendedCommonTree>) (this
				.getChildren()).clone();

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
			System.out.println("Fail on first part");
			return null;
		} else {
			for (int i = nodes.size() - 1; i >= 0; i--) {
				if (nodes.get(i).getLine() != line) {
					nodes.remove(i);
				}
			}
			Collections.sort(nodes, new ComparatorByPosInLine());
			ExtendedCommonTree pretender = null;
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
	}

	/**
	 * Gets the declaration node.
	 * 
	 * @param usageNode
	 *            the usage node
	 * @return the declaration node
	 */
	public ExtendedCommonTree getDeclarationNode(
			final ExtendedCommonTree usageNode) {
		ExtendedCommonTree parent = (ExtendedCommonTree) this.getParent();
		if (parent != null) {
			ExtendedCommonTree declaration = null;
			if (this instanceof VarDeclaration) {
				if (this.isDeclaration(usageNode)) {
					return declaration = this;
				}
			} else if (this instanceof FunctionNode) {
				if (((FunctionNode) this).getFunctionName().equals(
						usageNode.getText())) {
					return this;
				} else {
					ExtendedCommonTree params = ((FunctionNode) this)
							.getParamListNode();
					if (params != null) {
						declaration = usageNode.isDeclaredIn(params
								.getChildren());
					}
				}
			} else if (this instanceof ClassNode) {
				if (this.isClassDeclaration(usageNode)) {
					declaration = this;
				}
			}
			if (declaration != null) {
				return declaration;
			}
			int index = parent.getChildren().indexOf(this);
			if (index > 0) {
				return (parent.getChild(index - 1))
						.getDeclarationNode(usageNode);
			} else {
				if (parent instanceof BlockScopeNode) {
					// Если предок блока это класс, то, возможно, переменная
					// была определена после использования
					if (parent.getParent() instanceof ClassNode) {
						ExtendedCommonTree paramDeclaration = usageNode
								.isDeclaredIn((parent).getChildren());
						if (paramDeclaration != null) {
							return paramDeclaration;
						}
					}
				}
				return parent.getDeclarationNode(usageNode);
			}
		} else {
			return new ExtendedCommonTree(0);
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
	private ExtendedCommonTree isDeclaredIn(
			final List<ExtendedCommonTree> declarations) {
		for (ExtendedCommonTree tree : declarations) {
			if (tree.isDeclaration(this) || tree.isFuncDeclaration(this)
					|| tree.isClassDeclaration(this)) {
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
	private boolean isDeclaration(final ExtendedCommonTree usage) {
		return ((this instanceof VarDeclaration)
				&& (this.getChildren() != null) && (this.getChild(0).getText()
				.equals(usage.getText())));
	}

	/**
	 * Checks if is func declaration.
	 * 
	 * @param usage
	 *            the usage
	 * @return true, if is func declaration
	 */
	private boolean isFuncDeclaration(final ExtendedCommonTree usage) {
		return ((this instanceof FunctionNode) && (this.getChild(0).getText()
				.equals(usage.getText())));
	}

	/**
	 * Checks if is class declaration.
	 * 
	 * @param usage
	 *            the usage
	 * @return true, if is class declaration
	 */
	private boolean isClassDeclaration(final ExtendedCommonTree usage) {
		return ((this instanceof ClassNode) && (this.getChild(0).getText()
				.equals(usage.getText())));
	}

	/**
	 * Gets the all children.
	 * 
	 * @return the all children
	 */
	public ArrayList<ExtendedCommonTree> getAllChildren() {
		ArrayList<ExtendedCommonTree> childs = new ArrayList<ExtendedCommonTree>();
		if (this.getChildCount() != 0) {
			for (ExtendedCommonTree child : this.getChildren()) {
				childs.addAll(child.getAllChildren());
			}
		} else {
			childs.add(this);
		}
		return childs;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<ExtendedCommonTree> getAvailableVars() {
		if (this instanceof BlockScopeNode) {
			ArrayList arrayList = ((BlockScopeNode) this).getDeclaredVars();
			return arrayList;
		} else {
			if (this.getParent() != null) {
				return ((ExtendedCommonTree) this.getParent())
						.getAvailableVars();
			} else {
				return new ArrayList<ExtendedCommonTree>();
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
			} else if (arg0.getCharPositionInLine() > arg1
					.getCharPositionInLine()) {
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
	public ArrayList<ExtendedCommonTree> getChildren() {
		return (ArrayList<ExtendedCommonTree>) super.getChildren();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.runtime.tree.BaseTree#getChild(int)
	 */
	@Override
	public ExtendedCommonTree getChild(final int i) {
		// TODO Auto-generated method stub
		return (ExtendedCommonTree) super.getChild(i);
	}

	@Override
	public CommonToken getToken() {
		// TODO Auto-generated method stub
		return (CommonToken) super.getToken();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.runtime.tree.CommonTree#toString()
	 */
	@Override
	public String toString() {
		int startOffset = this.getMostLeftPosition();
		int endOffset = this.getMostRightPosition();
		return super.toString() + "(" + this.auxiliary + ") " + startOffset
				+ "-" + endOffset;

		// return "intValue haxe.primaryTypes.Int";
	}

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
	private void printTree(final ExtendedCommonTree t, final int indent) {
		if (t != null) {
			StringBuffer sb = new StringBuffer(indent);
			for (int i = 0; i < indent; i++) {
				sb = sb.append("   ");
			}
			for (int i = 0; i < t.getChildCount(); i++) {
				System.out.println(sb.toString() + t.getChild(i).toString()
						+ t.getChild(i).getText());
				this.printTree(t.getChild(i), indent + 1);
			}
		}
	}

}
