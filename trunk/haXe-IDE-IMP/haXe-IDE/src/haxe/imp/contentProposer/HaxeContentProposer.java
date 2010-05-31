package haxe.imp.contentProposer;

import haxe.imp.parser.HaxeParseController;
import haxe.imp.parser.antlr.main.TinyHaxeTry1Lexer;
import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.tree.specific.VarUsage;

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

public class HaxeContentProposer implements IContentProposer {

	@Override
	public ICompletionProposal[] getContentProposals(
			final IParseController controller, final int offset,
			final ITextViewer viewer) {
		ExtendedCommonTree sourceNode = null;
		String sourceString = null;

		HaxeParseController haxeController = (HaxeParseController) controller;
		try {
			sourceNode = ((ExtendedCommonTree) controller.getCurrentAst())
					.getNodeByPosition(offset);
			sourceString = "";
			System.out.println(sourceNode);
		} catch (NullPointerException nullPointerException) {
			CommonToken sourceToken = this.getTokenAtPosition(haxeController
					.getTokenStream(), offset);
			sourceString = sourceToken.getText();
			if (sourceToken.getType() == TinyHaxeTry1Lexer.COMMENT) {
				return null;
			}
			int shiftedOffset = offset - 1;
			while (sourceNode == null && shiftedOffset > 0) {
				try {
					sourceNode = ((ExtendedCommonTree) controller
							.getCurrentAst()).getNodeByPosition(shiftedOffset);
				} catch (NullPointerException e) {
					shiftedOffset--;
				}
			}
			if (shiftedOffset == 0) {
				return null;
			}
		}
		ArrayList<ExtendedCommonTree> availableVars = this.filterVars(
				sourceNode.getAvailableVars(), sourceString);
		return this.createSourceProposals(availableVars, sourceString, offset);
		// SourceProposal sourceProposal = new SourceProposal("intValue : Int",
		// "intValue", "int", offset);
		//
		// return new SourceProposal[] {
		// new SourceProposal("Int", "int", offset),
		// sourceProposal,
		// new SourceProposal("intSecondValue : Int", "intSecondValue",
		// "int", offset) };

	}

	/** FIXME use binary search */
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

	private ArrayList<ExtendedCommonTree> filterVars(
			final ArrayList<ExtendedCommonTree> vars, final String prefix) {
		ArrayList<ExtendedCommonTree> result = new ArrayList<ExtendedCommonTree>();
		for (ExtendedCommonTree commonTree : vars) {
			if (commonTree.getText().startsWith(prefix)) {
				result.add(commonTree);
			}
		}
		return result;
	}

	private SourceProposal[] createSourceProposals(
			final ArrayList<ExtendedCommonTree> availableVars,
			final String prefix, final int offset) {

		Set<ComparableSourceProposal> result = new TreeSet<ComparableSourceProposal>();
		for (ExtendedCommonTree commonTree : availableVars) {
			VarUsage usage = (VarUsage) commonTree;
			// result.add(new ComparableSourceProposal(commonTree.getText(),
			// prefix, offset));
			//			
			result.add(new ComparableSourceProposal(usage.getTextWithType(),
					usage.getText(), prefix, offset));
		}
		return result.toArray(new SourceProposal[0]);
	}

	private class ComparableSourceProposal extends SourceProposal implements
			Comparable<ComparableSourceProposal> {

		public ComparableSourceProposal(final String newText,
				final String prefix, final int offset) {
			super(newText, prefix, offset);
		}

		public ComparableSourceProposal(final String proposal,
				final String newText, final String prefix, final int offset,
				final int cursorLoc) {
			super(proposal, newText, prefix, offset, cursorLoc);
			// TODO Auto-generated constructor stub
		}

		public ComparableSourceProposal(final String proposal,
				final String newText, final String prefix, final int offset) {
			super(proposal, newText, prefix, offset);
			// TODO Auto-generated constructor stub
		}

		public ComparableSourceProposal(final String proposal,
				final String newText, final String prefix, final Region region,
				final int cursorLoc, final String addlInfo) {
			super(proposal, newText, prefix, region, cursorLoc, addlInfo);
			// TODO Auto-generated constructor stub
		}

		public ComparableSourceProposal(final String proposal,
				final String newText, final String prefix, final Region region,
				final int cursorLoc) {
			super(proposal, newText, prefix, region, cursorLoc);
			// TODO Auto-generated constructor stub
		}

		public ComparableSourceProposal(final String proposal,
				final String newText, final String prefix, final Region region,
				final String addlInfo) {
			super(proposal, newText, prefix, region, addlInfo);
			// TODO Auto-generated constructor stub
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
