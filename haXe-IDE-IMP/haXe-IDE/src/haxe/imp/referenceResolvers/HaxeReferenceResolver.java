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
package haxe.imp.referenceResolvers;

import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.tree.specific.VarUsage;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IReferenceResolver;

/**
 * The Class HaxeReferenceResolver.
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeReferenceResolver implements IReferenceResolver {

	/**
	 * Instantiates a new haxe reference resolver.
	 */
	public HaxeReferenceResolver() {
	}

	/**
	 * Get the text associated with the given node for use in a link from (or
	 * to) that node.
	 * 
	 * @param node
	 *            the node
	 * @return the link text
	 */
	public String getLinkText(final Object node) {
		// TODO Replace the following with an implementation suitable to your
		// language and reference types
		return node.toString();
	}

	/**
	 * Get the target for the given source node in the AST produced by the given
	 * Parse Controller.
	 * 
	 * @param node
	 *            the node
	 * @param controller
	 *            the controller
	 * @return the link target
	 */
	public Object getLinkTarget(final Object node,
			final IParseController controller) {
		// START_HERE
		// TODO Replace the following with an implementation suitable for your
		// language and reference types

		if (node instanceof VarUsage && controller.getCurrentAst() != null) {
			ExtendedCommonTree result;
			try {
				result = ((ExtendedCommonTree) node)
						.getDeclarationNode((ExtendedCommonTree) node);
			} catch (Exception e) {
				return null;
			}
			return result;
		}
		return null;
	}
}