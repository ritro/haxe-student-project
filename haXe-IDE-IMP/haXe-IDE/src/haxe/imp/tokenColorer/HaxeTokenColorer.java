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
package haxe.imp.tokenColorer;

import haxe.imp.parser.HaxeParsersym;

import org.antlr.runtime.CommonToken;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.ITokenColorer;
import org.eclipse.imp.services.base.TokenColorerBase;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

// TODO: Auto-generated Javadoc
/**
 * The Class HaxeTokenColorer.
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeTokenColorer extends TokenColorerBase implements
		HaxeParsersym, ITokenColorer {

	/** The default attribute. */
	protected final TextAttribute functionAttribute, keywordAttribute,
			numberAttribute, commentAttribute, stringAttribute,
			defaultAttribute;

	// protected final TextAttribute commentAttribute, stringAttribute;

	/**
	 * Instantiates a new haxe token colorer.
	 */
	public HaxeTokenColorer() {
		super();
		// TODO Define text attributes for the various token types that will
		// have their text colored
		//
		// NOTE: Colors (i.e., instances of org.eclipse.swt.graphics.Color) are
		// system resources
		// and are limited in number. THEREFORE, it is good practice to reuse
		// existing system Colors
		// or to allocate a fixed set of new Colors and reuse those. If new
		// Colors are instantiated
		// beyond the bounds of your system capacity then your Eclipse
		// invocation may cease to function
		// properly or at all.
		Display display = Display.getDefault();
		keywordAttribute = new TextAttribute(display
				.getSystemColor(SWT.COLOR_DARK_MAGENTA), null, SWT.BOLD);
		functionAttribute = new TextAttribute(display
				.getSystemColor(SWT.COLOR_DARK_RED), null, SWT.BOLD);
		defaultAttribute = new TextAttribute(display
				.getSystemColor(SWT.COLOR_BLACK));
		numberAttribute = new TextAttribute(display
				.getSystemColor(SWT.COLOR_DARK_RED));
		commentAttribute = new TextAttribute(display
				.getSystemColor(SWT.COLOR_DARK_GREEN));
		stringAttribute = new TextAttribute(display
				.getSystemColor(SWT.COLOR_BLUE));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.services.base.TokenColorerBase#getColoring(org.eclipse
	 * .imp.parser.IParseController, java.lang.Object)
	 */
	@Override
	public TextAttribute getColoring(IParseController controller, Object o) {
		if (o == null) {
			return null;
		}

		CommonToken token = (CommonToken) o;
		switch (token.getType()) {
		// START_HERE
		case FUNCTION:
		case STATIC:
		case CLASS:
		case VOID:
		case NEW:
		case PACKAGE:
		case IMPORT:
		case IMPLEMENTS:
		case EXTENDS:
		case RETURN:
		case DEFAULT:
		case CASE:
		case CAST:
		case INTERFACE:
		case VAR:
		case NULL:
		case PUBLIC:
		case PRIVATE:
		case IN:
		case ENUM:
		case TRUE:
		case FALSE:
			return functionAttribute;
		case CHARLITERAL:
		case STRINGLITERAL:
			return stringAttribute;
		case INT:
		case FLOAT:
		case BOOLEAN:
			return numberAttribute;
		case COMMENT:
			return commentAttribute;
		default:
			return defaultAttribute;
		}

		// IToken token = (IToken) o;
		// if (token.getKind() == TK_EOF_TOKEN)
		// return null;
		//
		// switch (token.getKind()) {
		// // START_HERE
		// case TK_IDENTIFIER:
		// return identifierAttribute;
		// case TK_NUMBER:
		// return numberAttribute;
		// case TK_DoubleLiteral:
		// return doubleAttribute;
		// // case TK_StringLiteral:
		// // return stringAttribute;
		// // case TK_SINGLE_LINE_COMMENT:
		// // return commentAttribute;
		// default:
		// if (((SimpleLPGParseController) controller).isKeyword(token
		// .getKind()))
		// return keywordAttribute;
		// return super.getColoring(controller, token);
		// }
	}

	/**
	 * Calculate damage extent.
	 * 
	 * @param seed
	 *            the seed
	 * @return the i region
	 */
	public IRegion calculateDamageExtent(IRegion seed) {
		return seed;
	}
}
