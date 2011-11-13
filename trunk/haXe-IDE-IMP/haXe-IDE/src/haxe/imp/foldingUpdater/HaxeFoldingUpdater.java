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

import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;

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

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.imp.preferences.PreferenceValueParser.AbstractVisitor
		 * #unimplementedVisitor(java.lang.String)
		 */
		@Override
		public void unimplementedVisitor(final String s) {
		}

		// START_HERE
		//
		// Include visit(..) functions for various types of AST nodes that are
		// associated with folding. These functions should call one of the two
		// versions of makeAnnotation(..) that are defined in FolderBase. The
		// usual case is to call the version of makeAnnotation that creates a
		// folding annotation corresponding to the extent of a particular AST
		// node.
		// The other possibility is to create an annotation with an extent that
		// is explicitly provided. An example is shown below ...

		/**
		 * Visit.
		 * 
		 * @param n
		 *            the n
		 * @return true, if successful
		 */
		public boolean visit(final HaxeTree n) {
			int start = 0;
			int len = 0;
			if (n instanceof ClassNode) {
				ClassNode classNode = (ClassNode) n;
				BlockScopeNode blockScopeNode = classNode.getBlockScope();
				if (blockScopeNode != null) {
					start = blockScopeNode.getlBracketPosition();
					len = blockScopeNode.getrBracketPosition() - start; 
					assert(len > 0);
					HaxeFoldingUpdater.this.makeAnnotation(start, len);
					return true;
				}
			} else if (n instanceof FunctionNode) {
				FunctionNode functionNode = (FunctionNode) n;
				BlockScopeNode blockScopeNode = functionNode.getBlockScope();
				if (blockScopeNode != null) {
					start = blockScopeNode.getlBracketPosition();
					len = blockScopeNode.getrBracketPosition() - start;
					HaxeFoldingUpdater.this.makeAnnotation(start, len + 1);
					return true;
				} 
			}
			return false;

		}
	};

	@Override
	protected void sendVisitorToAST(
			final HashMap<Annotation, Position> newAnnotations,
			final List<Annotation> annotations, final Object ast) {
		HaxeFoldingVisitor visitor = new HaxeFoldingVisitor();
		HaxeTree node = (HaxeTree) ast;
		node.accept(visitor);
	}
}
