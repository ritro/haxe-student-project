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
package imp.utilsImplementations;

import imp.parser.antlr.main.HaxeLexer;
import imp.parser.antlr.main.HaxeParser;
import imp.parser.antlr.tree.BlockScopeContainer;
import imp.parser.antlr.tree.HaxeTree;
import imp.parser.antlr.tree.specific.BlockScopeNode;
import imp.parser.antlr.tree.specific.ClassNode;

import java.util.HashMap;
import java.util.List;

import org.eclipse.imp.parser.ISourcePositionLocator;
import org.eclipse.imp.preferences.PreferenceValueParser.AbstractVisitor;
import org.eclipse.imp.runtime.RuntimePlugin;
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
	
    public static final int MODULE_TYPE = HaxeParser.MODULE;

	@Override
	protected void sendVisitorToAST(
			final HashMap<Annotation, Position> newAnnotations,
			final List<Annotation> annotations, final Object ast) 
	{
		accept((HaxeTree) ast);
	}
	
	public void makeAnnotation(BlockScopeContainer node)
	{
	    int start = node.getMostLeftPosition();
        int len = node.getMostRightPosition() - start + 1;
        assert (len > 0);
        makeAnnotation(start, len);
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
                makeAnnotation((BlockScopeContainer)node);
                BlockScopeNode blockscope 
                    = ((BlockScopeContainer)node).getBlockScope();
                if (blockscope == null)
                {
                    return;
                }
                for (HaxeTree child : blockscope.getChildren()) 
                {
                    accept(child);
                }
            }
            // TODO add folding to imports
            else if (node.getToken() != null) 
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
                    //visitor.visit(node);
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
