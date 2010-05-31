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

// TODO: Auto-generated Javadoc
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
	public String getLinkText(Object node) {
		// TODO Replace the following with an implementation suitable to your
		// language and reference types
		// if (node instanceof VarUsage) {
		// return ((VarUsage) node).getVarType().getFullTypeName();
		// }
		return "qwerqwerqwer";
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
	public Object getLinkTarget(Object node, IParseController controller) {
		// START_HERE
		// TODO Replace the following with an implementation suitable for your
		// language and reference types

		// NOTE: The code shown in this method body works with the
		// example grammar used in the IMP language-service templates.
		// It may be adaptable for use with other languages. HOWEVER,
		// this particular code is not essential to reference resolvers
		// in general, and the user should provide an implementation
		// that is appropriate to the language and AST structure for
		// which the service is being defined.

		if (node instanceof VarUsage && controller.getCurrentAst() != null) {
			// ExtendedCommonTree tree;// =
			// (HaxeParseController)controller).getCurrentAst();
			ExtendedCommonTree result;
			try {
				// result = ((ExtendedCommonTree) controller.getCurrentAst())
				// .getDeclarationNode((ExtendedCommonTree) node);
				result = ((ExtendedCommonTree) node)
						.getDeclarationNode((ExtendedCommonTree) node);
			} catch (Exception e) {
				return null;
			}
			return result;
		}
		return null;

		// if (node instanceof Iidentifier && controller.getCurrentAst() !=
		// null) {
		// identifier id = (identifier) node;
		// HaxeParser parser = (HaxeParser) ((SimpleLPGParseController)
		// controller)
		// .getParser();
		// SymbolTable<IAst> symtab = parser.getEnclosingSymbolTable(id);
		// return symtab.findDeclaration(id.toString());
		// }

	}
}
