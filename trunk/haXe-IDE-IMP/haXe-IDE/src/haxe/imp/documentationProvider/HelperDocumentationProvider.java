package haxe.imp.documentationProvider;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IDocumentationProvider;

public class HelperDocumentationProvider implements IDocumentationProvider {

	@Override
	public String getDocumentation(final Object target,
			final IParseController parseController) {
		// TODO Documentation can be also used
		return null;
	}
}
