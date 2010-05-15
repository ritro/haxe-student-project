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

import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;

import java.util.HashMap;
import java.util.List;

import org.eclipse.imp.preferences.PreferenceValueParser.AbstractVisitor;
import org.eclipse.imp.services.base.FolderBase;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;

// TODO: Auto-generated Javadoc
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
		public void unimplementedVisitor(String s) {
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
		public boolean visit(ExtendedCommonTree n) {
			int start = 0;
			int len = 0;
			/**
			 * TODO Поскольку комментов нет в AST-дереве, я их и тут отловить не
			 * могу. Так что, заготовка для этого была сделана зря
			 */
			// if (n.getType() == TinyHaxeTry1Lexer.COMMENT) {
			// CommonToken commonToken = (CommonToken) n.getToken();
			// start = commonToken.getStartIndex();
			// len = commonToken.getText().length();
			// makeAnnotation(start, len);
			// return true;
			// } else
			if (n instanceof ClassNode) {
				ClassNode classNode = (ClassNode) n;
				BlockScopeNode blockScopeNode = classNode.getBlockScope();
				start = blockScopeNode.getlBracketPosition();
				len = blockScopeNode.getrBracketPosition() - start;
				makeAnnotation(start, len);
				return true;
			} else if (n instanceof FunctionNode) {
				FunctionNode functionNode = (FunctionNode) n;
				BlockScopeNode blockScopeNode = functionNode.getBlockScope();
				start = blockScopeNode.getlBracketPosition();
				len = blockScopeNode.getrBracketPosition() - start;
				makeAnnotation(start, len);
				return true;
			}

			return false;

		}
	};

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.services.base.FolderBase#sendVisitorToAST(java.util.HashMap
	 * , java.util.List, java.lang.Object)
	 */
	@Override
	protected void sendVisitorToAST(
			HashMap<Annotation, Position> newAnnotations,
			List<Annotation> annotations, Object ast) {
		// TODO Auto-generated method stub
		HaxeFoldingVisitor visitor = new HaxeFoldingVisitor();
		ExtendedCommonTree node = (ExtendedCommonTree) ast;
		node.accept(visitor);
	}

}
