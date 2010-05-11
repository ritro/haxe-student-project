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
package haxe.imp.parser;

import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import lpg.runtime.IAst;

import org.antlr.runtime.CommonToken;
import org.eclipse.core.runtime.IPath;
import org.eclipse.imp.model.ICompilationUnit;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.parser.ISourcePositionLocator;

// TODO: Auto-generated Javadoc
/**
 * NOTE: This version of the ISourcePositionLocator is for use when the Source
 * Position Locator and corresponding Parse Controller are generated separately
 * from a corresponding set of LPG grammar templates and possibly in the absence
 * of the lexer, parser, and AST-related types that would be generated from
 * those templates. To enable compilation of the Locator and Controller, dummy
 * types have been defined as member types of the Controller in place of
 * possibly missing lexer, parser, and AST-related types. This version of the
 * Node Locator refers to some of those types. When those types are replaced by
 * real implementation types, the Locator must be modified to refer to those.
 * Apart from statements to import needed types from the Parse Controller, this
 * SourcePositionLocator is the same as that used with LPG.
 * 
 * @see the corresponding ParseController type
 * 
 * @author Stan Sutton (suttons@us.ibm.com)
 * @since May 15, 2007
 */
public class HaxeSourcePositionLocator implements ISourcePositionLocator {

	/** The parse controller. */
	private final IParseController fParseController;

	/**
	 * Instantiates a new haxe source position locator.
	 * 
	 * @param parseController
	 *            the parse controller
	 */
	public HaxeSourcePositionLocator(IParseController parseController) {
		fParseController = parseController;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.parser.ISourcePositionLocator#findNode(java.lang.Object,
	 * int)
	 */
	@Override
	public Object findNode(Object astRoot, int offset) {
		return ((ExtendedCommonTree) astRoot).getNodeByPosition(offset);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.parser.ISourcePositionLocator#findNode(java.lang.Object,
	 * int, int)
	 */
	@Override
	public Object findNode(Object astRoot, int startOffset, int endOffset) {
		// TODO use endOffset
		return ((ExtendedCommonTree) astRoot).getNodeByPosition(startOffset);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.parser.ISourcePositionLocator#getEndOffset(java.lang.
	 * Object)
	 */
	@Override
	public int getEndOffset(Object entity) {
		if (entity instanceof CommonToken) {
			return ((CommonToken) entity).getStartIndex()
					+ ((CommonToken) entity).getText().length() - 1;
		} else if (entity instanceof ExtendedCommonTree) {
			CommonToken commonToken = (CommonToken) ((ExtendedCommonTree) entity)
					.getToken();
			return commonToken.getStartIndex() + commonToken.getText().length()
					- 1;
		} else {
			throw new RuntimeException();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.parser.ISourcePositionLocator#getLength(java.lang.Object)
	 */
	@Override
	public int getLength(Object entity) {
		if (entity instanceof CommonToken) {
			return ((CommonToken) entity).getText().length();
		} else if (entity instanceof ExtendedCommonTree) {
			CommonToken commonToken = (CommonToken) ((ExtendedCommonTree) entity)
					.getToken();
			return commonToken.getText().length();
		} else {
			throw new RuntimeException();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.parser.ISourcePositionLocator#getPath(java.lang.Object)
	 */
	@Override
	public IPath getPath(Object node) {
		if (node instanceof IAst) {
			IAst node1 = (IAst) node;
			return fParseController.getProject().getRawProject().getFile(
					node1.getLeftIToken().getILexStream().getFileName())
					.getFullPath();
		}
		if (node instanceof ICompilationUnit) {
			ICompilationUnit cu = (ICompilationUnit) node;
			return cu.getPath();
		}
		throw new RuntimeException();
		// return new Path("");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.parser.ISourcePositionLocator#getStartOffset(java.lang
	 * .Object)
	 */
	@Override
	public int getStartOffset(Object entity) {
		if (entity instanceof CommonToken) {
			return ((CommonToken) entity).getStartIndex();
		} else if (entity instanceof ExtendedCommonTree) {
			CommonToken commonToken = (CommonToken) ((ExtendedCommonTree) entity)
					.getToken();
			return commonToken.getStartIndex();
		} else {
			throw new RuntimeException();
		}
	}

}
