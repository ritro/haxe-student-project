package haxe.imp.hoverHelper;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IReferenceResolver;

public class HelperReferenceResolver implements IReferenceResolver {

	public HelperReferenceResolver() {
	}

	/**
	 * Get the text associated with the given node for use in a link from (or
	 * to) that node
	 */
	public String getLinkText(final Object node) {
		// TODO Replace the following with an implementation suitable to your
		// language and reference types
		return node.toString();
	}

	/**
	 * Get the target for the given source node in the AST produced by the given
	 * Parse Controller.
	 */
	public Object getLinkTarget(final Object node,
			final IParseController controller) {
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

		// if (node instanceof Iidentifier && controller.getCurrentAst() !=
		// null) {
		// identifier id = (identifier) node;
		// HaxeParser parser = (HaxeParser) ((SimpleLPGParseController)
		// controller)
		// .getParser();
		// SymbolTable<IAst> symtab = parser.getEnclosingSymbolTable(id);
		// return symtab.findDeclaration(id.toString());
		// }

		return null;
	}
}
