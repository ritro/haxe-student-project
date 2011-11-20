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
package haxe.imp.foldingUpdater;

import haxe.imp.parser.antlr.main.HaxeLexer;
import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.BlockScopeContainer;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;

import java.util.HashMap;
import java.util.List;

import org.eclipse.imp.preferences.PreferenceValueParser.AbstractVisitor;
import org.eclipse.imp.services.base.FolderBase;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;

/**
 * This file provides a skeletal implementation of the language-dependent
 * aspects of a source-text folder. This implementation is generated from a
 * template that is parameterized with respect to the name of the language, the
 * package containing the language-specific types for AST nodes and
 * AbstractVisitors, and the name of the folder package and class.
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeFoldingUpdater extends FolderBase {

	/*
	 * A visitor for ASTs. Its purpose is to create ProjectionAnnotations for
	 * regions of text corresponding to various types of AST node or to text
	 * ranges computed from AST nodes. Projection annotations appear in the
	 * editor as the widgets that control folding.
	 */
	/**
	 * The Class HaxeFoldingVisitor.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public class HaxeFoldingVisitor extends AbstractVisitor {

		@Override
		public void unimplementedVisitor(final String s) {
		}

		/* 
		 * START_HERE
		 * 
		 * Include visit(..) functions for various types of AST nodes that are
		 * associated with folding. These functions should call one of the two
		 * versions of makeAnnotation(..) that are defined in FolderBase. The
		 * usual case is to call the version of makeAnnotation that creates a
		 * folding annotation corresponding to the extent of a particular AST
		 * node.
		 * The other possibility is to create an annotation with an extent that
		 * is explicitly provided. An example is shown below ... 
		 */

		/**
		 * Creates folding for nodes.
		 * @param node - the node to create folding.
		 * @return true, if successful
		 */
		public boolean visit(final HaxeTree node) 
		{
		    int start = node.getMostLeftPosition();
            int len = node.getMostRightPosition() - start;
            assert(len > 0);
            HaxeFoldingUpdater.this.makeAnnotation(start, len + 1);
			return true;
		}
	};
	
	private HaxeFoldingVisitor visitor = null;
	
    public static final int MODULE_TYPE = HaxeParser.MODULE;

	@Override
	protected void sendVisitorToAST(
			final HashMap<Annotation, Position> newAnnotations,
			final List<Annotation> annotations, final Object ast) {
		visitor = new HaxeFoldingVisitor();
		accept((HaxeTree) ast);
	}

    /**
     * Chooses according to the node type what nodes
     * should be visited to create folding.
     * @param node
     */
    private void accept(final HaxeTree node) 
    {
        try 
        {
            if (node instanceof BlockScopeContainer) 
            {
                BlockScopeNode blockscope 
                    = ((BlockScopeContainer)node).getBlockScope();
                if (blockscope != null) accept(blockscope);
            }
            else if (node instanceof BlockScopeNode)
            {
                visitor.visit((BlockScopeNode)node);
                for (HaxeTree child : node.getChildren()) 
                {
                    accept(child);
                }
            }
            else if (node.token != null) 
            {
                int tokenType = node.getToken().getType();
                //The root of all tree - users don't know about it
                if (tokenType == MODULE_TYPE) 
                {
                    for (HaxeTree child : node.getChildren()) 
                    {
                        accept(child);
                    }
                } 
                // TODO What is considered as comment?? 
                // (/**/ ; /// and // blocks not considered)
                // Maybe fix somewhere else needed?
                else if (tokenType == HaxeLexer.COMMENT) 
                {
                    visitor.visit(node);
                }
            }
        } 
        catch (NullPointerException nullPointerException) 
        {
            System.out.println(
                    "Exception caught from invocation of" + 
                    " language-specific tree model builder implementation");
            nullPointerException.printStackTrace();
        }
    }
}
