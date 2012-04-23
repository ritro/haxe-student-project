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
package imp.utils;

import imp.parser.HaxeParseController;
import imp.parser.antlr.main.HaxeLexer;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.imp.editor.SourceProposal;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.IContentProposer;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

import tree.HaxeTree;
import tree.specific.ClassNode;
import tree.specific.FunctionNode;
import tree.specific.VarDeclarationNode;
import tree.utils.Environment;

/**
 * The Class HaxeContentProposer.
 * 
 * @author Anatoly Kondratyev
 */
public class HaxeContentProposer implements IContentProposer {

	@Override
	public ICompletionProposal[] getContentProposals(
			final IParseController controller, final int offset,
			final ITextViewer viewer) {
		HaxeTree sourceNode = null;
		String sourceString = null;

		HaxeParseController haxeController = (HaxeParseController) controller;
		try {
			sourceNode = 
			        ((HaxeTree) controller.getCurrentAst())
					.getNodeByPosition(offset);
			sourceString = "";
			System.out.println(sourceNode);
		} catch (NullPointerException nullPointerException) {
			CommonToken sourceToken = 
			        getTokenAtPosition(haxeController.getTokenStream(), offset);
			sourceString = sourceToken.getText();
			if (sourceToken.getType() == HaxeLexer.COMMENT) {
				return null;
			}
			int shiftedOffset = offset - 1;
			while (sourceNode == null && shiftedOffset > 0) {
				try {
					sourceNode = ((HaxeTree) controller
							.getCurrentAst()).getNodeByPosition(shiftedOffset);
				} catch (NullPointerException e) {
					shiftedOffset--;
				}
			}
			if (shiftedOffset == 0) {
				return null;
			}
		}
		//TODO look in the Environment
		Environment availableProposals = filterVars(sourceNode, sourceString);
		return createSourceProposals(availableProposals, sourceString, offset);
	}

	/**
	 * FIXME use binary search.
	 * 
	 * @param commonTokenStream
	 *            the common token stream
	 * @param offset
	 *            the offset
	 * @return the token at position
	 */
	@SuppressWarnings("unchecked")
	private CommonToken getTokenAtPosition(
			final CommonTokenStream commonTokenStream, final int offset) {
		for (CommonToken commonToken : (ArrayList<CommonToken>) commonTokenStream
				.getTokens()) {
			if ((commonToken.getStartIndex() <= offset)
					&& (offset <= commonToken.getStartIndex()
							+ commonToken.getText().length())) {
				return commonToken;
			}
		}
		return null;
	}

	/**
	 * Make a list of available proposals for
	 * sertain node.
	 * @param nodeToStart - node, the search will
	 * be started from.
	 * @param prefix - the found nodes' name should
	 * begin with.
	 * @return the array list
	 */
	private Environment filterVars(
			final HaxeTree nodeToStart, final String prefix) 
	{
	    Environment result = new Environment();
		HaxeTree parent = nodeToStart.getParent();
		if (parent == null)
		{
		    return result;
		}
		result.putAll(filterVars(parent, prefix));
		for (HaxeTree commonTree : parent.getAllChildren()) 
		{
			if (commonTree.getText().startsWith(prefix)
			        && (commonTree instanceof VarDeclarationNode
			        || commonTree instanceof ClassNode
			        || commonTree instanceof FunctionNode)) 
			{
				result.put(commonTree);
			}
		}
		return result;
	}

	/**
	 * Creates the source proposals.
	 * 
	 * @param availableVars
	 *            the available vars
	 * @param prefix
	 *            the prefix
	 * @param offset
	 *            the offset
	 * @return the source proposal[]
	 */
	private SourceProposal[] createSourceProposals(
			final Environment availableVars,
			final String prefix, final int offset) {

		Set<ComparableSourceProposal> result = new TreeSet<ComparableSourceProposal>();
		for (HaxeTree commonTree : availableVars.values()) {
			VarDeclarationNode usage = (VarDeclarationNode) commonTree;
			result.add(new ComparableSourceProposal(
			        usage.getHaxeType().toString(),
					usage.getText(), prefix, offset));
		}
		return result.toArray(new SourceProposal[0]);
	}

	/**
	 * The Class ComparableSourceProposal.
	 * 
	 * @author Anatoly Kondratyev
	 */
	private class ComparableSourceProposal extends SourceProposal implements
			Comparable<ComparableSourceProposal> {

		/**
		 * Instantiates a new comparable source proposal.
		 * 
		 * @param newText
		 *            the new text
		 * @param prefix
		 *            the prefix
		 * @param offset
		 *            the offset
		 */
		public ComparableSourceProposal(final String newText,
				final String prefix, final int offset) {
			super(newText, prefix, offset);
		}

		/**
		 * Instantiates a new comparable source proposal.
		 * 
		 * @param proposal
		 *            the proposal
		 * @param newText
		 *            the new text
		 * @param prefix
		 *            the prefix
		 * @param offset
		 *            the offset
		 * @param cursorLoc
		 *            the cursor loc
		 */
		public ComparableSourceProposal(final String proposal,
				final String newText, final String prefix, final int offset,
				final int cursorLoc) {
			super(proposal, newText, prefix, offset, cursorLoc);
		}

		/**
		 * Instantiates a new comparable source proposal.
		 * 
		 * @param proposal
		 *            the proposal
		 * @param newText
		 *            the new text
		 * @param prefix
		 *            the prefix
		 * @param offset
		 *            the offset
		 */
		public ComparableSourceProposal(final String proposal,
				final String newText, final String prefix, final int offset) {
			super(proposal, newText, prefix, offset);
		}

		/**
		 * Instantiates a new comparable source proposal.
		 * 
		 * @param proposal
		 *            the proposal
		 * @param newText
		 *            the new text
		 * @param prefix
		 *            the prefix
		 * @param region
		 *            the region
		 * @param cursorLoc
		 *            the cursor loc
		 * @param addlInfo
		 *            the addl info
		 */
		public ComparableSourceProposal(final String proposal,
				final String newText, final String prefix, final Region region,
				final int cursorLoc, final String addlInfo) {
			super(proposal, newText, prefix, region, cursorLoc, addlInfo);
		}

		/**
		 * Instantiates a new comparable source proposal.
		 * 
		 * @param proposal
		 *            the proposal
		 * @param newText
		 *            the new text
		 * @param prefix
		 *            the prefix
		 * @param region
		 *            the region
		 * @param cursorLoc
		 *            the cursor loc
		 */
		public ComparableSourceProposal(final String proposal,
				final String newText, final String prefix, final Region region,
				final int cursorLoc) {
			super(proposal, newText, prefix, region, cursorLoc);
		}

		/**
		 * Instantiates a new comparable source proposal.
		 * 
		 * @param proposal
		 *            the proposal
		 * @param newText
		 *            the new text
		 * @param prefix
		 *            the prefix
		 * @param region
		 *            the region
		 * @param addlInfo
		 *            the addl info
		 */
		public ComparableSourceProposal(final String proposal,
				final String newText, final String prefix, final Region region,
				final String addlInfo) {
			super(proposal, newText, prefix, region, addlInfo);
		}

		@Override
		/*
		 * FIXME this method is not accurate, but I need it just to implement
		 * Comparable interface (just for using Sets)
		 */
		public int compareTo(final ComparableSourceProposal o) {
			if (this.getDisplayString().equals(o.getDisplayString())) {
				return 0;
			} else {
				return 1;
			}
		}

	}

}
