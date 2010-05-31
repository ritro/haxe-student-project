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
			defaultAttribute, processorCommand;

	/**
	 * Instantiates a new haxe token colorer.
	 */
	public HaxeTokenColorer() {
		super();
		// TODO Define text attributes for the various token types that will
		// have their text colored
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.services.base.TokenColorerBase#getColoring(org.eclipse
	 * .imp.parser.IParseController, java.lang.Object)
	 */
	@Override
	public TextAttribute getColoring(final IParseController controller,
			final Object o) {
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
			return this.functionAttribute;
		case CHARLITERAL:
		case STRINGLITERAL:
			return this.stringAttribute;
		case INT:
		case FLOAT:
		case BOOLEAN:
			return this.numberAttribute;
		case COMMENT:
			return this.commentAttribute;
		case PROCESSORCOMMAND:
			return this.processorCommand;
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
