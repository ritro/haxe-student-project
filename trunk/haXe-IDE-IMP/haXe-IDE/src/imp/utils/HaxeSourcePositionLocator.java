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
package imp.utils;

import lpg.runtime.IAst;

import org.antlr.runtime.CommonToken;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.imp.editor.ModelTreeNode;
import org.eclipse.imp.model.ICompilationUnit;
import org.eclipse.imp.model.ISourceProject;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.parser.ISourcePositionLocator;

import tree.HaxeTree;
import tree.utils.HaxeTreeUtils;
import workspace.Activator;

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
	public HaxeSourcePositionLocator(final IParseController parseController) {
		this.fParseController = parseController;
	}

	@Override
	public Object findNode(final Object astRoot, final int offset) 
	{
		return HaxeTreeUtils.getNodeByOffset(offset, 0, (HaxeTree)astRoot);
	}

	@Override
	public Object findNode(
	        final Object astRoot, final int startOffset,
			final int endOffset) 
	{
		return HaxeTreeUtils.getNodeByOffset(
		        startOffset, 
		        endOffset - startOffset, 
		        (HaxeTree)astRoot);
	}

	@Override
	public int getEndOffset(final Object entity) 
	{
	    try
	    {
    		if (entity instanceof CommonToken) 
    		{
    		    CommonToken token = (CommonToken) entity;
    		    String text = token.getText();
    		    if (text == null)
    		    {
    		        return token.getStartIndex();
    		    }
    			return token.getStartIndex() + token.getText().length() - 1;
    		} 
    		else if (entity instanceof HaxeTree) 
    		{
                CommonToken token = ((HaxeTree) entity).getToken();
                String text = token.getText();
                if (text == null)
                {
                    return token.getStartIndex();
                }
                return token.getStartIndex() + token.getText().length() - 1;
    		} 
    		else 
    		{
    			throw new RuntimeException();
    		}
	    }
	    catch (NullPointerException e)
	    {
	        String message = 
	                "HaxeSourcePositionLocator.getEndOffset nullPointerException: " + e.getMessage();
	        System.out.println(message);
	        Activator.logger.error(message);
	        return -1;
	    }
	}

	@Override
	public int getLength(final Object entity) 
	{
		if (entity instanceof CommonToken) {
			return ((CommonToken) entity).getText().length();
		} else if (entity instanceof HaxeTree) {
			CommonToken commonToken = (CommonToken) ((HaxeTree) entity)
					.getToken();
			return commonToken.getText().length();
		} else {
			throw new RuntimeException();
		}
	}

	@Override
	public IPath getPath(final Object node) {
		if (node instanceof IAst) {
			IAst node1 = (IAst) node;
			return this.fParseController.getProject().getRawProject().getFile(
					node1.getLeftIToken().getILexStream().getFileName())
					.getFullPath();
		}
		if (node instanceof ICompilationUnit) {
			ICompilationUnit cu = (ICompilationUnit) node;
			return cu.getPath();
		}
		if (node instanceof HaxeTree) {
			ISourceProject iSourceProject = fParseController.getProject();
			IPath result = this.fParseController.getPath();
			Path tmp = new Path(fParseController.getProject().getName()
					+ "/" + result.toString());
			return tmp;
		}
		throw new RuntimeException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.parser.ISourcePositionLocator#getStartOffset(java.lang
	 * .Object)
	 */
	@Override
	public int getStartOffset(final Object entity) {
		if (entity instanceof CommonToken) {
			return ((CommonToken) entity).getStartIndex();
		} else if (entity instanceof HaxeTree) {
			CommonToken commonToken = (CommonToken) ((HaxeTree) entity)
					.getToken();
			return commonToken.getStartIndex();
		} else if (entity instanceof ModelTreeNode) {
			return getStartOffset(((ModelTreeNode) entity).getASTNode());
		} else {
			throw new RuntimeException();
		}
	}

}
