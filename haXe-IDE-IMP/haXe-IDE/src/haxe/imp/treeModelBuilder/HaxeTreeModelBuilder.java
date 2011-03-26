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
	public void visitTree(final Object root) {
		if (root == null) {
			return;
		}
		ExtendedCommonTree rootNode = (ExtendedCommonTree) root;
		HaxeModelVisitor visitor = new HaxeModelVisitor();

		rootNode.accept(visitor);
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
		public void unimplementedVisitor(final String s) {
			System.out.println("unemplementedVisitor \n" + s);
		}

		/**
		 * Visit.
		 * 
		 * @param n
		 *            the n
		 * @return true, if successful
		 */
		public boolean visit(final Object n) {
			//pushSubItem(n);//???why not this
			HaxeTreeModelBuilder.this.pushSubItem(n);
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
		public boolean visit(final ExtendedCommonTree node,
				final boolean doCreateSubItem) {
			if (doCreateSubItem) {
				HaxeTreeModelBuilder.this.createSubItem(node);
			} else {
				HaxeTreeModelBuilder.this.pushSubItem(node);
			}
			return true;
		}

		/**
		 * End visit.
		 * 
		 * @param n
		 *            the n
		 */
		public void endVisit(final Object n) {
			//popSubItem();//???why not this
			HaxeTreeModelBuilder.this.popSubItem();
		}
	}
}
