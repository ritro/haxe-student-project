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
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.VarUsage;
import haxe_ide.Activator;

import java.util.List;

import lpg.runtime.IToken;

import org.eclipse.imp.editor.AnnotationHoverBase;
import org.eclipse.imp.language.ServiceFactory;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.parser.ISourcePositionLocator;
import org.eclipse.imp.parser.SimpleLPGParseController;
import org.eclipse.imp.services.IDocumentationProvider;
import org.eclipse.imp.services.IHoverHelper;
import org.eclipse.imp.services.IReferenceResolver;
import org.eclipse.imp.services.base.HoverHelperBase;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.ISourceViewer;

/**
 * The Class HaxeHoverHelper.
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeHoverHelper extends HoverHelperBase implements IHoverHelper {

	/** The resolver. */
	IReferenceResolver fResolver = null;

	/**
	 * Tmp.
	 * 
	 * @return the extended common tree
	 */
	public HaxeTree tmp() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.imp.services.IHoverHelper#getHoverHelpAt(org.eclipse.imp.
	 * parser.IParseController, org.eclipse.jface.text.source.ISourceViewer,
	 * int)
	 */
	public String getHoverHelpAt(final IParseController parseController,
			final ISourceViewer srcViewer, final int offset) {
		// If there are any annotations associated with the line that contains
		// the given offset, return those
		try {
			List<Annotation> annotations = AnnotationHoverBase.getSourceAnnotationsForLine(
					srcViewer, srcViewer.getDocument().getLineOfOffset(offset));
			if (annotations != null && annotations.size() > 0) {
				// Some annotations have no text, such as breakpoint
				// annotations;
				// if that's all we have, then don't bother returning it
				String msg = AnnotationHoverBase
						.formatAnnotationList(annotations);
				if (msg != null) {
					return msg;
				}
			}
		} catch (BadLocationException e) {
			return "??? (BadLocationException for annotation)";
		}

		// Otherwise, return a message determined directly or indirectly based
		// on the node whose representation occurs at the given offset

		Object ast = parseController.getCurrentAst();
		if (ast == null) {
			return null;
		}

		// Declare variables used in formulating the message
		Object sourceNode = null; // node at current hover point
		Object targetNode = null; // node referenced from current hover point
		Object helpNode = null; // node for which a help message is to be constructed
		String msg = null; // the help message for helpNode

		// Get the node at the given offset; no node implies no message
		ISourcePositionLocator nodeLocator = parseController
				.getSourcePositionLocator();
		sourceNode = nodeLocator.findNode(ast, offset);
		if (sourceNode == null) {
			return null;
		}

		// Check whether there is a reference resolver for the identified
		// source node; if so, attempt to get the node that is referenced by
		// the source node, on the assumption that the referenced node should
		// be the basis for the help message (e.g., as a decl for an identifier)

		// At the moment this part is scipped, and helpCover insformation is
		// always shown connected to current node

		/*
		 * if (true) { if (this.fResolver == null && this.fLanguage != null) {
		 * try { this.fResolver = ServiceFactory.getInstance()
		 * .getReferenceResolver(this.fLanguage); } catch (Exception e) {
		 * Activator .getInstance() .writeErrorMsg(
		 * "Exception getting Reference Resolver service from service factory");
		 * this.fResolver = null; } } if (this.fResolver != null) { targetNode =
		 * this.fResolver.getLinkTarget(sourceNode, parseController); } }
		 */

		// If the target node is not null, provide help based on that;
		// otherwise, provide help based on the source node
		if (targetNode != null) {
			helpNode = targetNode;
		} else {
			helpNode = sourceNode;
		}

		// Now need to determine whether the help message should be determined
		// based on the text represented by the node or based on some separate
		// text provided through an IDocumentationProvider

		// Check whether there is a documentation provider for the language;
		// if so, check whether it provides documentation for the help node;
		// if so, return that documentation
		IDocumentationProvider docProvider = null;
		if (this.fLanguage != null && true) {
			try {
				docProvider = ServiceFactory.getInstance()
						.getDocumentationProvider(this.fLanguage);

			} catch (Exception e) {
				Activator
						.getInstance()
						.writeErrorMsg(
								"Exception getting Documentation Provider Service from service factory");
				this.fResolver = null;
			}
		}
		if (docProvider != null) {
			msg = (docProvider != null) ? docProvider.getDocumentation(
					helpNode, parseController) : null;
			if (msg != null) {
				return msg;
			}
		}

		// Otherwise, base the help message on the text that is represented
		// by the help node
		/** TODO add help cover for class nodes */
		if (helpNode instanceof VarUsage) {
			VarUsage def = (VarUsage) helpNode;
			msg = def.getHaxeType().getFullTypeName() + " " + def.getText();
		}else if (helpNode instanceof FunctionNode
				|| ((HaxeTree) helpNode).getParent() instanceof FunctionNode) {
			FunctionNode def = (FunctionNode) ((helpNode instanceof FunctionNode) ? helpNode
					: ((HaxeTree) helpNode).getParent());
			msg = def.getFullNameWithParameters();
		}else if (helpNode instanceof HaxeTree && ((HaxeTree)helpNode).parent instanceof VarUsage){
			VarUsage def = (VarUsage)((HaxeTree)helpNode).parent;
			msg = def.getHaxeType().getFullTypeName() + " " + def.getText();
		}
		return msg;
	}

	/**
	 * Gets the substring.
	 * 
	 * @param parseController
	 *            the parse controller
	 * @param start
	 *            the start
	 * @param end
	 *            the end
	 * @return the substring
	 */
	public static String getSubstring(final IParseController parseController,
			final int start, final int end) {
		return new String(((SimpleLPGParseController) parseController)
				.getParser().getIPrsStream().getInputChars(), start, end
				- start + 1);
	}

	/**
	 * Gets the substring.
	 * 
	 * @param parseController
	 *            the parse controller
	 * @param token
	 *            the token
	 * @return the substring
	 */
	public static String getSubstring(final IParseController parseController,
			final IToken token) {
		return getSubstring(parseController, token.getStartOffset(), token
				.getEndOffset());
	}

}
