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

public class HaxeTokenColorer extends TokenColorerBase implements
		HaxeParsersym, ITokenColorer {

	/** The default attribute. */
	protected final TextAttribute functionAttribute, keywordAttribute,
			numberAttribute, commentAttribute, stringAttribute,
			defaultAttribute, processorCommand;

	/**
	 * Define text attributes for the various token types that will
	 * have their text colored
	 */
	public HaxeTokenColorer() {
		super();
		
		Display display = Display.getDefault();
		this.keywordAttribute = new TextAttribute(display
				.getSystemColor(SWT.COLOR_DARK_MAGENTA), null, SWT.BOLD);
		this.functionAttribute = new TextAttribute(display
				.getSystemColor(SWT.COLOR_DARK_RED), null, SWT.BOLD);
		this.defaultAttribute = new TextAttribute(display
				.getSystemColor(SWT.COLOR_BLACK));
		this.numberAttribute = new TextAttribute(display
				.getSystemColor(SWT.COLOR_DARK_RED));
		this.commentAttribute = new TextAttribute(display
				.getSystemColor(SWT.COLOR_DARK_GREEN));
		this.stringAttribute = new TextAttribute(display
				.getSystemColor(SWT.COLOR_BLUE));
		this.processorCommand = new TextAttribute(display
				.getSystemColor(SWT.COLOR_DARK_GRAY));
	}
	
	@Override
	public TextAttribute getColoring(final IParseController controller,
									final Object o) {
		if (o == null) {
			return null;
		}

		CommonToken token = (CommonToken) o;
		switch (token.getType()) {
		case FUNCTION:
		case CLASS:
		case PACKAGE:
		case STATIC:
		case VOID:
		case NEW:
		case IMPORT:
		case IMPLEMENTS:
		case EXTENDS:
		case RETURN:
		case DEFAULT:
		case CAST:
		case THROW:
		case INTERFACE:
		case VAR:
		case PUBLIC:
		case PRIVATE:
		case IN:
		case ENUM:
		case TRUE:
		case FALSE:
		case CASE:
		case FOR:
		case IF:
		case ELSE:
		case TRY:
		case CATCH:
		case WHILE:
			return this.functionAttribute;
		case CHARLITERAL:
		case STRINGLITERAL:
			return this.stringAttribute;
		case INT:
		case FLOAT:
		case BOOLEAN:
		case NULL:
		case FLOATNUM:
			return this.numberAttribute;
		case COMMENT:
			return this.commentAttribute;
		//case PREPROCESSOR_DIRECTIVE:
		//	return this.processorCommand;
		default:
			return this.defaultAttribute;
		}
	}

	/**
	 * Calculate damage extent.
	 * 
	 * @param seed
	 *            the seed
	 * @return the i region
	 */
	public IRegion calculateDamageExtent(final IRegion seed) {
		return seed;
	}
}
