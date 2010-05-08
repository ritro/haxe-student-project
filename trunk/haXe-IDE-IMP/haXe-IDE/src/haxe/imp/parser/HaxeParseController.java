package haxe.imp.parser;

import haxe.imp.parser.antlr.main.TinyHaxeTry1Lexer;
import haxe.imp.parser.antlr.main.TinyHaxeTry1Parser;
import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.tree.ExtendedTreeAdaptor;
import haxe_ide.Activator;

import java.util.ArrayList;
import java.util.Iterator;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.imp.language.Language;
import org.eclipse.imp.language.LanguageRegistry;
import org.eclipse.imp.model.ISourceProject;
import org.eclipse.imp.parser.IMessageHandler;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.parser.ISourcePositionLocator;
import org.eclipse.imp.services.IAnnotationTypeInfo;
import org.eclipse.imp.services.ILanguageSyntaxProperties;
import org.eclipse.jface.text.IRegion;

/**
 * NOTE: This version of the Parse Controller is for use when the Parse
 * Controller and corresponding Node Locator are generated separately from a
 * corresponding set of LPG grammar templates and possibly in the absence of the
 * lexer, parser, and AST-related types that would be generated from those
 * templates. It is assumed that either a) the Controller will be used with a
 * suitable set of lexer, parser, and AST-related types that are provided by
 * some means other than LPG, or b) the Controller will be used with a set of
 * lexer, parser, and AST types that have been, or will be, separately generated
 * based on LPG. In order to enable this version of the Parse Controller to
 * compile, dummy lexer, parser, and AST-related types have been included as
 * member types in the Controller. These types are not operational and are
 * merely placeholders for types that would support a functioning
 * implementation. Apart from the inclusion of these dummy types, this
 * representation of the Parse Controller is the same as that used with LPG.
 * 
 * @author Stan Sutton (suttons@us.ibm.com)
 * @since May 1, 2007 Addition of marker types
 * @since May 10, 2007 Conversion IProject -> ISourceProject
 * @since May 15, 2007 Addition of dummy types
 */
public class HaxeParseController implements IParseController {
	private ExtendedCommonTree currentAST = new ExtendedCommonTree();
	private CommonTokenStream tokenStream = new CommonTokenStream();
	/**
	 * The language of the source being parsed by this IParseController.
	 */
	protected Language fLanguage = LanguageRegistry
			.findLanguage(Activator.kLanguageID);

	/**
	 * The project containing the source being parsed by this IParseController.
	 * May be null if the source isn't actually part of an Eclipse project
	 * (e.g., a random bit of source text living outside the workspace).
	 */
	protected ISourceProject fProject;

	/**
	 * The path to the file containing the source being parsed by this
	 * {@link IParseController}.
	 */
	protected IPath fFilePath;

	/**
	 * The {@link IMessageHandler} to which parser/compiler messages are
	 * directed.
	 */
	protected IMessageHandler handler;

	private ISourcePositionLocator fSourcePositionLocator;

	@Override
	public IAnnotationTypeInfo getAnnotationTypeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getCurrentAst() {
		return currentAST;
	}

	@Override
	public Language getLanguage() {
		return fLanguage;
	}

	@Override
	public IPath getPath() {
		return fFilePath;
	}

	@Override
	public ISourceProject getProject() {
		return fProject;
	}

	@Override
	public ISourcePositionLocator getSourcePositionLocator() {
		if (fSourcePositionLocator == null) {
			fSourcePositionLocator = new HaxeSourcePositionLocator(this);
		}
		return fSourcePositionLocator;
	}

	@Override
	public ILanguageSyntaxProperties getSyntaxProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Iterator getTokenIterator(IRegion region) {
		InnerCommonTokenIterator commonTokenIterator = new InnerCommonTokenIterator(
				tokenStream, region);
		return commonTokenIterator;
	}

	private class InnerCommonTokenIterator implements Iterator<Object> {
		private ArrayList<CommonToken> commonTokens = new ArrayList<CommonToken>();
		private int currentTokenNumber = -1;
		private int begin = 0;
		private int end = 0;

		@SuppressWarnings("unchecked")
		public InnerCommonTokenIterator(CommonTokenStream commonTokenStream,
				IRegion region) {
			commonTokens = (ArrayList<CommonToken>) commonTokenStream
					.getTokens();
			begin = region.getOffset();
			end = region.getOffset() + region.getLength();
			// for (CommonToken token : commonTokens) {
			// if (token.getStopIndex() > begin) {
			// currentTokenNumber = commonTokens.indexOf(token);
			// break;
			// }
			// }
		}

		@Override
		public boolean hasNext() {
			if (currentTokenNumber + 1 >= commonTokens.size()) {
				return false;
			} else if (commonTokens.get(currentTokenNumber + 1).getStartIndex() < end) {
				return true;
			} else
				return false;
		}

		@Override
		public Object next() {
			currentTokenNumber++;
			return commonTokens.get(currentTokenNumber);
		}

		@Override
		public void remove() {
			commonTokens.remove(currentTokenNumber);
		}

	}

	@Override
	public void initialize(IPath filePath, ISourceProject project,
			IMessageHandler handler) {
		this.fProject = project;
		this.fFilePath = filePath;
		this.handler = handler;

	}

	private void doParse(String contents) {
		TinyHaxeTry1Lexer lexer = new TinyHaxeTry1Lexer(new ANTLRStringStream(
				contents));
		tokenStream = new CommonTokenStream(lexer);
		tokenStream.getTokens();
		System.out.print("Parsing file...");
		TinyHaxeTry1Parser parser = new TinyHaxeTry1Parser(tokenStream);
		parser.setTreeAdaptor(new ExtendedTreeAdaptor());
		currentAST = new ExtendedCommonTree();

		try {
			TinyHaxeTry1Parser.module_return parserResult = parser.module();
			currentAST = (ExtendedCommonTree) parserResult.getTree();
			System.out.println("succes!");
		} catch (RecognitionException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	@Override
	public Object parse(String input, IProgressMonitor monitor) {
		currentAST = null;
		doParse(input);
		return currentAST;
	}

}
