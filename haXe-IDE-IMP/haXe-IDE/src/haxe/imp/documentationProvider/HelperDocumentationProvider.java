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
package haxe.imp.documentationProvider;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IDocumentationProvider;

/**
 * The Class HelperDocumentationProvider.
 * 
 * @author Anatoly Kondratyev
 */
public class HelperDocumentationProvider implements IDocumentationProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.services.IDocumentationProvider#getDocumentation(java
	 * .lang.Object, org.eclipse.imp.parser.IParseController)
	 */
	@Override
	public String getDocumentation(final Object target,
			final IParseController parseController) {
		// TODO Documentation can be also used
		return null;
	}
}
