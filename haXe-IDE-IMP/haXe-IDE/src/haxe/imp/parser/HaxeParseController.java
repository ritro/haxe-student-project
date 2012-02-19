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
package haxe.imp.parser;

import haxe.imp.parser.antlr.main.HaxeLexer;
import haxe.imp.parser.antlr.main.HaxeParser;
import haxe.imp.parser.antlr.tree.HaxeTree;
import haxe.imp.parser.antlr.tree.HaxeTreeAdaptor;
import haxe.tree.utils.HaxeTreeErrorProvider;
import haxe.tree.utils.HaxeTreeLinker;
import haxe.tree.utils.HaxeTreePrinter;

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
import org.eclipse.imp.parser.SimpleAnnotationTypeInfo;
import org.eclipse.imp.services.IAnnotationTypeInfo;
import org.eclipse.imp.services.ILanguageSyntaxProperties;
import org.eclipse.jface.text.IRegion;

import workspace.Activator;

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
 * 
 * @author of currently this version is Anatoly Kondratyev
 *         (anatoly.kondratyev@googlemail.com)
 */
public class HaxeParseController implements IParseController {

    /** The current ast. */
    private HaxeTree currentAST = new HaxeTree();

    /** The token stream. */
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
     * The path to the file containing the source being parsed by this.
     * {@link IParseController}.
     */
    protected IPath fFilePath;

    /**
     * The {@link IMessageHandler} to which parser/compiler messages are
     * directed.
     */
    protected IMessageHandler handler;

    /** The source position locator. */
    private ISourcePositionLocator fSourcePositionLocator;

    @Override
    public IAnnotationTypeInfo getAnnotationTypeInfo() {
        return new SimpleAnnotationTypeInfo();
    }

    @Override
    public Object getCurrentAst() {
        return this.currentAST;
    }

    @Override
    public Language getLanguage() {
        return this.fLanguage;
    }

    @Override
    public IPath getPath() {
        return this.fFilePath;
    }

    @Override
    public ISourceProject getProject() {
        return this.fProject;
    }

    @Override
    public ISourcePositionLocator getSourcePositionLocator() {
        if (this.fSourcePositionLocator == null) {
            this.fSourcePositionLocator = new HaxeSourcePositionLocator(this);
        }
        return this.fSourcePositionLocator;
    }

    @Override
    public ILanguageSyntaxProperties getSyntaxProperties() {
        // TODO Auto-generated method stub
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Iterator getTokenIterator(final IRegion region) {
        InnerCommonTokenIterator commonTokenIterator = new InnerCommonTokenIterator(
                this.tokenStream, region);
        return commonTokenIterator;
    }

    /**
     * Gets the token stream.
     * 
     * @return the token stream
     */
    public CommonTokenStream getTokenStream() {
        return this.tokenStream;
    }

    /**
     * The Class InnerCommonTokenIterator.
     * 
     * @author Anatoly Kondratyev
     */
    private class InnerCommonTokenIterator implements Iterator<Object> {

        /** The common tokens. */
        private ArrayList<CommonToken> commonTokens = new ArrayList<CommonToken>();

        /** The current token number. */
        private int currentTokenNumber = -1;

        /** The begin. */
        private int begin = 0;

        /** The end. */
        private int end = 0;

        /**
         * Instantiates a new inner common token iterator.
         * 
         * @param commonTokenStream
         *            the common token stream
         * @param region
         *            the region
         */
        @SuppressWarnings("unchecked")
        public InnerCommonTokenIterator(
                final CommonTokenStream commonTokenStream, final IRegion region) {
            this.commonTokens = (ArrayList<CommonToken>) commonTokenStream
                    .getTokens();
            this.begin = region.getOffset();
            this.end = region.getOffset() + region.getLength();
        }

        @Override
        public boolean hasNext() {
            if (this.currentTokenNumber + 1 >= this.commonTokens.size()) {
                return false;
            } else if (this.commonTokens.get(this.currentTokenNumber + 1)
                    .getStartIndex() < this.end) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            this.currentTokenNumber++;
            return this.commonTokens.get(this.currentTokenNumber);
        }

        @Override
        public void remove() {
            this.commonTokens.remove(this.currentTokenNumber);
        }

    }

    @Override
    public void initialize(final IPath filePath, final ISourceProject project,
            final IMessageHandler handler) {
        this.fProject = project;
        this.fFilePath = filePath;
        this.handler = handler;
    }

    /**
     * Do parse.
     * 
     * @param contents
     *            the contents
     */
    private void doParse(final String contents) {
        HaxeLexer lexer = new HaxeLexer(new ANTLRStringStream(contents));
        this.tokenStream = new CommonTokenStream(lexer);
        this.tokenStream.getTokens();
        System.out.print("Parsing file...");
        HaxeParser parser = new HaxeParser(this.tokenStream);
        parser.setTreeAdaptor(new HaxeTreeAdaptor());
        this.currentAST = new HaxeTree();

        try {
            HaxeParser.module_return parserResult = parser.module();
            this.currentAST = (HaxeTree) parserResult.getTree();
            System.out.println("success!");
            HaxeTree.setMessageHandler(handler);
            handler.clearMessages();
        } catch (RecognitionException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object parse(final String input, final IProgressMonitor monitor) {
        currentAST = null;
        doParse(input);

        linkAndMarkErrors();
        
        return currentAST;
    }
    
    private void linkAndMarkErrors()
    {        
        HaxeTreeLinker linker = new HaxeTreeLinker();
        linker.visit(currentAST);
        
        HaxeTreeErrorProvider eProvider = new HaxeTreeErrorProvider();
        eProvider.visit(currentAST);
        
        HaxeTreePrinter printer = new HaxeTreePrinter();
        printer.visit(currentAST);
    }

}
