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
package haxe.imp.hoverHelper;

import haxe.imp.parser.antlr.tree.HaxeTree;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IReferenceResolver;

/**
 * The Class HelperReferenceResolver.
 * 
 * @author Anatoly Kondratyev
 */
public class HelperReferenceResolver implements IReferenceResolver {

	/**
	 * Instantiates a new helper reference resolver.
	 */
	public HelperReferenceResolver() {
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
		return ((HaxeTree)node).getText();
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
		//???
		return ((HaxeTree)controller.getCurrentAst()).getDeclarationNode((HaxeTree)node);
	}
}
