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
package haxe.imp.treeModelBuilder;

import haxe.imp.parser.antlr.tree.ExtendedCommonTree;

import org.eclipse.imp.preferences.PreferenceValueParser.AbstractVisitor;
import org.eclipse.imp.services.base.TreeModelBuilderBase;

// TODO: Auto-generated Javadoc
/**
 * The Class HaxeTreeModelBuilder.
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeTreeModelBuilder extends TreeModelBuilderBase {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.services.base.TreeModelBuilderBase#visitTree(java.lang
	 * .Object)
	 */
	@Override
	public void visitTree(Object root) {
		if (root == null)
			return;
		ExtendedCommonTree rootNode = (ExtendedCommonTree) root;
		HaxeModelVisitor visitor = new HaxeModelVisitor();

		rootNode.accept(visitor);
		// System.out.println("");
	}

	/**
	 * The Class HaxeModelVisitor.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public class HaxeModelVisitor extends AbstractVisitor {

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.imp.preferences.PreferenceValueParser.AbstractVisitor
		 * #unimplementedVisitor(java.lang.String)
		 */
		@Override
		public void unimplementedVisitor(String s) {
			System.out.println("unemplementedVisitor \n" + s);
		}

		/**
		 * Visit.
		 * 
		 * @param n
		 *            the n
		 * @return true, if successful
		 */
		public boolean visit(Object n) {
			// System.out.println("visit by \n" + n);
			pushSubItem(n);
			return true;
		}

		/**
		 * Visit.
		 * 
		 * @param node
		 *            the node
		 * @param doCreateSubItem
		 *            the do create sub item
		 * @return true, if successful
		 */
		public boolean visit(ExtendedCommonTree node, boolean doCreateSubItem) {
			// System.out.println("General visit \n" + node);
			if (doCreateSubItem) {
				createSubItem(node);
			} else {
				pushSubItem(node);
			}
			return true;
		}

		/**
		 * End visit.
		 * 
		 * @param n
		 *            the n
		 */
		public void endVisit(Object n) {
			// System.out.println("EndVisit by \n" + n);
			popSubItem();
		}
	}
}
