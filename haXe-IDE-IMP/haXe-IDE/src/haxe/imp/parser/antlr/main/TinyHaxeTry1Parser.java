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

package haxe.imp.parser.antlr.main;

import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.DoWhileNode;
import haxe.imp.parser.antlr.tree.specific.ForNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.SwitchNode;
import haxe.imp.parser.antlr.tree.specific.TryNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclaration;
import haxe.imp.parser.antlr.tree.specific.VarUsage;
import haxe.imp.parser.antlr.tree.specific.WhileNode;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

// TODO: Auto-generated Javadoc
/**
 * The Class TinyHaxeTry1Parser.
 * 
 * @author Anatoly Kondratyev
 */
public class TinyHaxeTry1Parser extends Parser {
    
    /** The Constant tokenNames. */
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROPERTY_DECL", "MODULE", "SUFFIX_EXPR", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG", "TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "DECL_ATTR_LIST", "VAR_INIT", "ASSIGN_OPERATOR", "PACKAGE", "SEMI", "IDENTIFIER", "DOT", "IMPORT", "PUBLIC", "PRIVATE", "STATIC", "INLINE", "DYNAMIC", "OVERRIDE", "COMMA", "QUES", "EQ", "PLUSEQ", "SUBEQ", "SLASHEQ", "PERCENTEQ", "AMPEQ", "FUNCTION", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "PP_IF", "BANG", "PP_ELSEIF", "PP_ELSE", "PP_END", "PP_ERROR", "COLON", "MINUS_BIGGER", "VOID", "INT", "FLOAT", "BOOLEAN", "LT", "GT", "GTGT", "NEW", "IF", "ELSE", "FOR", "IN", "WHILE", "DO", "TRY", "SWITCH", "LBRACE", "RBRACE", "RETURN", "THROW", "BREAK", "CONTINUE", "CASE", "DEFAULT", "CATCH", "ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ", "BAR", "AMP", "CARET", "LTLT", "GTGTGT", "PLUS", "SUB", "STAR", "SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "TILDE", "NULL", "CAST", "ENUM", "VAR", "EXTERN", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "TYPEDEF", "LONGLITERAL", "INTLITERAL", "STRINGLITERAL", "CHARLITERAL", "FLOATNUM", "TRUE", "FALSE", "WS", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "EscapeSequence", "ABSTRACT", "BYTE", "CHAR", "CONST", "DOUBLE", "FINAL", "FINALLY", "GOTO", "INSTANCEOF", "LONG", "NATIVE", "PROTECTED", "SHORT", "STRICTFP", "SUPER", "THIS", "THROWS", "TRANSIENT", "VOLATILE", "STAREQ", "BAREQ", "CARETEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "MONKEYS_AT", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "LTLTEQ", "GTGTEQ", "GTGTGTEQ", "INTNUM", "EXPONENT", "COMMENT", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ"
    };
    
    /** The Constant CAST. */
    public static final int CAST=93;
    
    /** The Constant FUNCTION. */
    public static final int FUNCTION=34;
    
    /** The Constant PACKAGE. */
    public static final int PACKAGE=15;
    
    /** The Constant EXPONENT. */
    public static final int EXPONENT=152;
    
    /** The Constant LT. */
    public static final int LT=51;
    
    /** The Constant STAR. */
    public static final int STAR=86;
    
    /** The Constant WHILE. */
    public static final int WHILE=59;
    
    /** The Constant FLOATNUM. */
    public static final int FLOATNUM=106;
    
    /** The Constant CONST. */
    public static final int CONST=119;
    
    /** The Constant OCTAL_ESC. */
    public static final int OCTAL_ESC=156;
    
    /** The Constant CASE. */
    public static final int CASE=69;
    
    /** The Constant CHAR. */
    public static final int CHAR=118;
    
    /** The Constant NEW. */
    public static final int NEW=54;
    
    /** The Constant EXTERN. */
    public static final int EXTERN=96;
    
    /** The Constant DO. */
    public static final int DO=60;
    
    /** The Constant EOF. */
    public static final int EOF=-1;
    
    /** The Constant GTGT. */
    public static final int GTGT=53;
    
    /** The Constant BREAK. */
    public static final int BREAK=67;
    
    /** The Constant LBRACKET. */
    public static final int LBRACKET=37;
    
    /** The Constant FINAL. */
    public static final int FINAL=121;
    
    /** The Constant RPAREN. */
    public static final int RPAREN=36;
    
    /** The Constant IMPORT. */
    public static final int IMPORT=19;
    
    /** The Constant SUBSUB. */
    public static final int SUBSUB=89;
    
    /** The Constant STAREQ. */
    public static final int STAREQ=135;
    
    /** The Constant CARET. */
    public static final int CARET=81;
    
    /** The Constant THIS. */
    public static final int THIS=131;
    
    /** The Constant RETURN. */
    public static final int RETURN=65;
    
    /** The Constant DOUBLE. */
    public static final int DOUBLE=120;
    
    /** The Constant MONKEYS_AT. */
    public static final int MONKEYS_AT=144;
    
    /** The Constant BARBAR. */
    public static final int BARBAR=73;
    
    /** The Constant VAR. */
    public static final int VAR=95;
    
    /** The Constant VOID. */
    public static final int VOID=47;
    
    /** The Constant SUPER. */
    public static final int SUPER=130;
    
    /** The Constant GOTO. */
    public static final int GOTO=123;
    
    /** The Constant EQ. */
    public static final int EQ=28;
    
    /** The Constant COMMENT. */
    public static final int COMMENT=153;
    
    /** The Constant AMPAMP. */
    public static final int AMPAMP=74;
    
    /** The Constant VAR_INIT. */
    public static final int VAR_INIT=13;
    
    /** The Constant LTLTEQ. */
    public static final int LTLTEQ=148;
    
    /** The Constant QUES. */
    public static final int QUES=27;
    
    /** The Constant EQEQ. */
    public static final int EQEQ=75;
    
    /** The Constant HexPrefix. */
    public static final int HexPrefix=112;
    
    /** The Constant PP_IF. */
    public static final int PP_IF=39;
    
    /** The Constant PERCENTDBBQ. */
    public static final int PERCENTDBBQ=140;
    
    /** The Constant RBRACE. */
    public static final int RBRACE=64;
    
    /** The Constant STATIC. */
    public static final int STATIC=22;
    
    /** The Constant PRIVATE. */
    public static final int PRIVATE=21;
    
    /** The Constant BLOCK_SCOPE. */
    public static final int BLOCK_SCOPE=7;
    
    /** The Constant SWITCH. */
    public static final int SWITCH=62;
    
    /** The Constant NULL. */
    public static final int NULL=92;
    
    /** The Constant GTGTEQ. */
    public static final int GTGTEQ=149;
    
    /** The Constant STRICTFP. */
    public static final int STRICTFP=129;
    
    /** The Constant ELSE. */
    public static final int ELSE=56;
    
    /** The Constant NATIVE. */
    public static final int NATIVE=126;
    
    /** The Constant ELLIPSIS. */
    public static final int ELLIPSIS=72;
    
    /** The Constant THROWS. */
    public static final int THROWS=132;
    
    /** The Constant INT. */
    public static final int INT=48;
    
    /** The Constant SLASHEQ. */
    public static final int SLASHEQ=31;
    
    /** The Constant INTLITERAL. */
    public static final int INTLITERAL=103;
    
    /** The Constant PERCENTBB. */
    public static final int PERCENTBB=146;
    
    /** The Constant TRY. */
    public static final int TRY=61;
    
    /** The Constant LongSuffix. */
    public static final int LongSuffix=111;
    
    /** The Constant LONGLITERAL. */
    public static final int LONGLITERAL=102;
    
    /** The Constant PERCENTLL. */
    public static final int PERCENTLL=145;
    
    /** The Constant BANGEQQ. */
    public static final int BANGEQQ=143;
    
    /** The Constant WS. */
    public static final int WS=109;
    
    /** The Constant PERCENTDLQ. */
    public static final int PERCENTDLQ=138;
    
    /** The Constant INHERIT_LIST_OPT. */
    public static final int INHERIT_LIST_OPT=11;
    
    /** The Constant CHARLITERAL. */
    public static final int CHARLITERAL=105;
    
    /** The Constant GT. */
    public static final int GT=52;
    
    /** The Constant INLINE. */
    public static final int INLINE=23;
    
    /** The Constant CATCH. */
    public static final int CATCH=71;
    
    /** The Constant FALSE. */
    public static final int FALSE=108;
    
    /** The Constant EscapeSequence. */
    public static final int EscapeSequence=115;
    
    /** The Constant THROW. */
    public static final int THROW=66;
    
    /** The Constant DYNAMIC. */
    public static final int DYNAMIC=24;
    
    /** The Constant PROTECTED. */
    public static final int PROTECTED=127;
    
    /** The Constant CLASS. */
    public static final int CLASS=97;
    
    /** The Constant PP_ELSEIF. */
    public static final int PP_ELSEIF=41;
    
    /** The Constant BAREQ. */
    public static final int BAREQ=136;
    
    /** The Constant PP_ELSE. */
    public static final int PP_ELSE=42;
    
    /** The Constant IntegerNumber. */
    public static final int IntegerNumber=110;
    
    /** The Constant AMP. */
    public static final int AMP=80;
    
    /** The Constant PLUSPLUS. */
    public static final int PLUSPLUS=90;
    
    /** The Constant LBRACE. */
    public static final int LBRACE=63;
    
    /** The Constant TYPE_PARAM_OPT. */
    public static final int TYPE_PARAM_OPT=10;
    
    /** The Constant LTEQ. */
    public static final int LTEQ=78;
    
    /** The Constant SUBEQ. */
    public static final int SUBEQ=30;
    
    /** The Constant GTGTGT. */
    public static final int GTGTGT=83;
    
    /** The Constant Exponent. */
    public static final int Exponent=114;
    
    /** The Constant FOR. */
    public static final int FOR=57;
    
    /** The Constant SUFFIX_EXPR. */
    public static final int SUFFIX_EXPR=6;
    
    /** The Constant SUB. */
    public static final int SUB=85;
    
    /** The Constant FLOAT. */
    public static final int FLOAT=49;
    
    /** The Constant ABSTRACT. */
    public static final int ABSTRACT=116;
    
    /** The Constant MINUS_BIGGER. */
    public static final int MINUS_BIGGER=46;
    
    /** The Constant PERCENTDBQ. */
    public static final int PERCENTDBQ=139;
    
    /** The Constant HexDigit. */
    public static final int HexDigit=113;
    
    /** The Constant PLUSEQ. */
    public static final int PLUSEQ=29;
    
    /** The Constant LPAREN. */
    public static final int LPAREN=35;
    
    /** The Constant IF. */
    public static final int IF=55;
    
    /** The Constant INTNUM. */
    public static final int INTNUM=151;
    
    /** The Constant ESC_SEQ. */
    public static final int ESC_SEQ=157;
    
    /** The Constant PP_END. */
    public static final int PP_END=43;
    
    /** The Constant BOOLEAN. */
    public static final int BOOLEAN=50;
    
    /** The Constant SLASH. */
    public static final int SLASH=87;
    
    /** The Constant IN. */
    public static final int IN=58;
    
    /** The Constant GTGTGTEQ. */
    public static final int GTGTGTEQ=150;
    
    /** The Constant IMPLEMENTS. */
    public static final int IMPLEMENTS=100;
    
    /** The Constant CONTINUE. */
    public static final int CONTINUE=68;
    
    /** The Constant COMMA. */
    public static final int COMMA=26;
    
    /** The Constant AMPEQ. */
    public static final int AMPEQ=33;
    
    /** The Constant TRANSIENT. */
    public static final int TRANSIENT=133;
    
    /** The Constant IDENTIFIER. */
    public static final int IDENTIFIER=17;
    
    /** The Constant TILDE. */
    public static final int TILDE=91;
    
    /** The Constant BANGEQ. */
    public static final int BANGEQ=76;
    
    /** The Constant PLUS. */
    public static final int PLUS=84;
    
    /** The Constant RBRACKET. */
    public static final int RBRACKET=38;
    
    /** The Constant DOT. */
    public static final int DOT=18;
    
    /** The Constant LTLT. */
    public static final int LTLT=82;
    
    /** The Constant BYTE. */
    public static final int BYTE=117;
    
    /** The Constant PERCENT. */
    public static final int PERCENT=88;
    
    /** The Constant VOLATILE. */
    public static final int VOLATILE=134;
    
    /** The Constant DECL_ATTR_LIST. */
    public static final int DECL_ATTR_LIST=12;
    
    /** The Constant ASSIGN_OPERATOR. */
    public static final int ASSIGN_OPERATOR=14;
    
    /** The Constant TYPEDEF. */
    public static final int TYPEDEF=101;
    
    /** The Constant UNICODE_ESC. */
    public static final int UNICODE_ESC=155;
    
    /** The Constant EQEQEQ. */
    public static final int EQEQEQ=141;
    
    /** The Constant DEFAULT. */
    public static final int DEFAULT=70;
    
    /** The Constant HEX_DIGIT. */
    public static final int HEX_DIGIT=154;
    
    /** The Constant SHORT. */
    public static final int SHORT=128;
    
    /** The Constant BANG. */
    public static final int BANG=40;
    
    /** The Constant INSTANCEOF. */
    public static final int INSTANCEOF=124;
    
    /** The Constant PP_ERROR. */
    public static final int PP_ERROR=44;
    
    /** The Constant GTEQ. */
    public static final int GTEQ=77;
    
    /** The Constant MODULE. */
    public static final int MODULE=5;
    
    /** The Constant TRUE. */
    public static final int TRUE=107;
    
    /** The Constant SEMI. */
    public static final int SEMI=16;
    
    /** The Constant COLON. */
    public static final int COLON=45;
    
    /** The Constant PARAM_LIST. */
    public static final int PARAM_LIST=8;
    
    /** The Constant PERCENTLESQ. */
    public static final int PERCENTLESQ=142;
    
    /** The Constant ENUM. */
    public static final int ENUM=94;
    
    /** The Constant FINALLY. */
    public static final int FINALLY=122;
    
    /** The Constant PERCENTEQ. */
    public static final int PERCENTEQ=32;
    
    /** The Constant PROPERTY_DECL. */
    public static final int PROPERTY_DECL=4;
    
    /** The Constant OVERRIDE. */
    public static final int OVERRIDE=25;
    
    /** The Constant STRINGLITERAL. */
    public static final int STRINGLITERAL=104;
    
    /** The Constant CARETEQ. */
    public static final int CARETEQ=137;
    
    /** The Constant PERCENTBBB. */
    public static final int PERCENTBBB=147;
    
    /** The Constant INTERFACE. */
    public static final int INTERFACE=98;
    
    /** The Constant LONG. */
    public static final int LONG=125;
    
    /** The Constant EXTENDS. */
    public static final int EXTENDS=99;
    
    /** The Constant PUBLIC. */
    public static final int PUBLIC=20;
    
    /** The Constant TYPE_TAG. */
    public static final int TYPE_TAG=9;
    
    /** The Constant BAR. */
    public static final int BAR=79;

    // delegates
    // delegators


        /**
	 * Instantiates a new tiny haxe try1 parser.
	 * 
	 * @param input
	 *            the input
	 */
    public TinyHaxeTry1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        
        /**
		 * Instantiates a new tiny haxe try1 parser.
		 * 
		 * @param input
		 *            the input
		 * @param state
		 *            the state
		 */
        public TinyHaxeTry1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[249+1];
             
             
        }
        
    /** The adaptor. */
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    /**
	 * Sets the tree adaptor.
	 * 
	 * @param adaptor
	 *            the new tree adaptor
	 */
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    
    /**
	 * Gets the tree adaptor.
	 * 
	 * @return the tree adaptor
	 */
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    /* (non-Javadoc)
     * @see org.antlr.runtime.BaseRecognizer#getTokenNames()
     */
    public String[] getTokenNames() { return TinyHaxeTry1Parser.tokenNames; }
    
    /* (non-Javadoc)
     * @see org.antlr.runtime.BaseRecognizer#getGrammarFileName()
     */
    public String getGrammarFileName() { return "C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g"; }


    /**
	 * The Class module_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class module_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:1: module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList ) ;
    /**
	 * Module.
	 * 
	 * @return the tiny haxe try1 parser.module_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.module_return module() throws RecognitionException {
        TinyHaxeTry1Parser.module_return retval = new TinyHaxeTry1Parser.module_return();
        retval.start = input.LT(1);
        int module_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.myPackage_return myPackage1 = null;

        TinyHaxeTry1Parser.topLevelList_return topLevelList2 = null;


        RewriteRuleSubtreeStream stream_myPackage=new RewriteRuleSubtreeStream(adaptor,"rule myPackage");
        RewriteRuleSubtreeStream stream_topLevelList=new RewriteRuleSubtreeStream(adaptor,"rule topLevelList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:19: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:21: ( myPackage )? topLevelList
            {
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:21: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module119);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_topLevelList_in_module122);
            topLevelList2=topLevelList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_topLevelList.add(topLevelList2.getTree());


            // AST REWRITE
            // elements: topLevelList, myPackage
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 46:45: -> ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList )
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:47: ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(MODULE, "MODULE", true), root_1);

                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:91: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();
                adaptor.addChild(root_1, stream_topLevelList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, module_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "module"

    /**
	 * The Class topLevelList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class topLevelList_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevelList"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:1: topLevelList : ( topLevel )* ;
    /**
	 * Top level list.
	 * 
	 * @return the tiny haxe try1 parser.top level list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.topLevelList_return topLevelList() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelList_return retval = new TinyHaxeTry1Parser.topLevelList_return();
        retval.start = input.LT(1);
        int topLevelList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.topLevel_return topLevel3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:19: ( ( topLevel )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:22: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:22: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT||LA2_0==PP_IF||(LA2_0>=PP_ELSEIF && LA2_0<=PP_ERROR)||LA2_0==ENUM||(LA2_0>=EXTERN && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:23: topLevel
            	    {
            	    pushFollow(FOLLOW_topLevel_in_topLevelList156);
            	    topLevel3=topLevel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevel3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, topLevelList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "topLevelList"

    /**
	 * The Class topLevel_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class topLevel_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevel"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:51:1: topLevel : ( myImport | pp | topLevelDecl );
    /**
	 * Top level.
	 * 
	 * @return the tiny haxe try1 parser.top level_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.topLevel_return topLevel() throws RecognitionException {
        TinyHaxeTry1Parser.topLevel_return retval = new TinyHaxeTry1Parser.topLevel_return();
        retval.start = input.LT(1);
        int topLevel_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.myImport_return myImport4 = null;

        TinyHaxeTry1Parser.pp_return pp5 = null;

        TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl6 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:51:19: ( myImport | pp | topLevelDecl )
            int alt3=3;
            switch ( input.LA(1) ) {
            case IMPORT:
                {
                alt3=1;
                }
                break;
            case PP_IF:
            case PP_ELSEIF:
            case PP_ELSE:
            case PP_END:
            case PP_ERROR:
                {
                alt3=2;
                }
                break;
            case ENUM:
            case EXTERN:
            case CLASS:
            case INTERFACE:
            case TYPEDEF:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:51:21: myImport
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_myImport_in_topLevel175);
                    myImport4=myImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, myImport4.getTree());

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:52:25: pp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_topLevel201);
                    pp5=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp5.getTree());

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:53:25: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topLevelDecl_in_topLevel227);
                    topLevelDecl6=topLevelDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelDecl6.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, topLevel_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "topLevel"

    /**
	 * The Class myPackage_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class myPackage_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "myPackage"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) ;
    /**
	 * My package.
	 * 
	 * @return the tiny haxe try1 parser.my package_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.myPackage_return myPackage() throws RecognitionException {
        TinyHaxeTry1Parser.myPackage_return retval = new TinyHaxeTry1Parser.myPackage_return();
        retval.start = input.LT(1);
        int myPackage_StartIndex = input.index();
        Object root_0 = null;

        Token PACKAGE7=null;
        Token SEMI9=null;
        TinyHaxeTry1Parser.dotIdent_return dotIdent8 = null;


        Object PACKAGE7_tree=null;
        Object SEMI9_tree=null;
        RewriteRuleTokenStream stream_PACKAGE=new RewriteRuleTokenStream(adaptor,"token PACKAGE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_dotIdent=new RewriteRuleSubtreeStream(adaptor,"rule dotIdent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:21: ( PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:23: PACKAGE dotIdent SEMI
            {
            PACKAGE7=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage246); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE.add(PACKAGE7);

            pushFollow(FOLLOW_dotIdent_in_myPackage248);
            dotIdent8=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent8.getTree());
            SEMI9=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage250); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI9);



            // AST REWRITE
            // elements: dotIdent, PACKAGE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 55:45: -> ^( PACKAGE dotIdent )
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:48: ^( PACKAGE dotIdent )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PACKAGE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_dotIdent.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, myPackage_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "myPackage"

    /**
	 * The Class qualifiedIdentifier_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class qualifiedIdentifier_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedIdentifier"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:58:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
    /**
	 * Qualified identifier.
	 * 
	 * @return the tiny haxe try1 parser.qualified identifier_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        TinyHaxeTry1Parser.qualifiedIdentifier_return retval = new TinyHaxeTry1Parser.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        Object root_0 = null;

        Token a=null;
        Token ident=null;
        Token DOT10=null;

        Object a_tree=null;
        Object ident_tree=null;
        Object DOT10_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:5: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:9: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:9: (a= IDENTIFIER -> $a)
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:12: a= IDENTIFIER
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier281); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(a);



            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 59:27: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:37: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DOT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:41: DOT ident= IDENTIFIER
            	    {
            	    DOT10=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier297); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT10);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier301); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(ident);



            	    // AST REWRITE
            	    // elements: DOT, qualifiedIdentifier, ident
            	    // token labels: ident
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_ident=new RewriteRuleTokenStream(adaptor,"token ident",ident);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 59:63: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:67: ^( DOT $qualifiedIdentifier $ident)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_ident.nextNode());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, qualifiedIdentifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualifiedIdentifier"

    /**
	 * The Class myImport_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class myImport_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "myImport"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:62:1: myImport : IMPORT dotIdent SEMI ;
    /**
	 * My import.
	 * 
	 * @return the tiny haxe try1 parser.my import_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.myImport_return myImport() throws RecognitionException {
        TinyHaxeTry1Parser.myImport_return retval = new TinyHaxeTry1Parser.myImport_return();
        retval.start = input.LT(1);
        int myImport_StartIndex = input.index();
        Object root_0 = null;

        Token IMPORT11=null;
        Token SEMI13=null;
        TinyHaxeTry1Parser.dotIdent_return dotIdent12 = null;


        Object IMPORT11_tree=null;
        Object SEMI13_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:62:21: ( IMPORT dotIdent SEMI )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:62:23: IMPORT dotIdent SEMI
            {
            root_0 = (Object)adaptor.nil();

            IMPORT11=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_myImport343); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPORT11_tree = (Object)adaptor.create(IMPORT11);
            root_0 = (Object)adaptor.becomeRoot(IMPORT11_tree, root_0);
            }
            pushFollow(FOLLOW_dotIdent_in_myImport346);
            dotIdent12=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent12.getTree());
            SEMI13=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport348); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, myImport_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "myImport"

    /**
	 * The Class access_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class access_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "access"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:66:1: access : ( PUBLIC | PRIVATE );
    /**
	 * Access.
	 * 
	 * @return the tiny haxe try1 parser.access_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.access_return access() throws RecognitionException {
        TinyHaxeTry1Parser.access_return retval = new TinyHaxeTry1Parser.access_return();
        retval.start = input.LT(1);
        int access_StartIndex = input.index();
        Object root_0 = null;

        Token set14=null;

        Object set14_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:66:19: ( PUBLIC | PRIVATE )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set14=(Token)input.LT(1);
            if ( (input.LA(1)>=PUBLIC && input.LA(1)<=PRIVATE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set14));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, access_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "access"

    /**
	 * The Class declAttr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class declAttr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declAttr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:69:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
    /**
	 * Decl attr.
	 * 
	 * @return the tiny haxe try1 parser.decl attr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.declAttr_return declAttr() throws RecognitionException {
        TinyHaxeTry1Parser.declAttr_return retval = new TinyHaxeTry1Parser.declAttr_return();
        retval.start = input.LT(1);
        int declAttr_StartIndex = input.index();
        Object root_0 = null;

        Token STATIC15=null;
        Token INLINE16=null;
        Token DYNAMIC17=null;
        Token OVERRIDE18=null;
        TinyHaxeTry1Parser.access_return access19 = null;


        Object STATIC15_tree=null;
        Object INLINE16_tree=null;
        Object DYNAMIC17_tree=null;
        Object OVERRIDE18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:69:19: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
            int alt5=5;
            switch ( input.LA(1) ) {
            case STATIC:
                {
                alt5=1;
                }
                break;
            case INLINE:
                {
                alt5=2;
                }
                break;
            case DYNAMIC:
                {
                alt5=3;
                }
                break;
            case OVERRIDE:
                {
                alt5=4;
                }
                break;
            case PUBLIC:
            case PRIVATE:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:69:21: STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    STATIC15=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr435); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC15_tree = (Object)adaptor.create(STATIC15);
                    adaptor.addChild(root_0, STATIC15_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:70:24: INLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    INLINE16=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr460); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE16_tree = (Object)adaptor.create(INLINE16);
                    adaptor.addChild(root_0, INLINE16_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:71:25: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    DYNAMIC17=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr486); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC17_tree = (Object)adaptor.create(DYNAMIC17);
                    adaptor.addChild(root_0, DYNAMIC17_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:72:25: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    OVERRIDE18=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE18_tree = (Object)adaptor.create(OVERRIDE18);
                    adaptor.addChild(root_0, OVERRIDE18_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:73:25: access
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_access_in_declAttr538);
                    access19=access();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, access19.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, declAttr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "declAttr"

    /**
	 * The Class declAttrList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class declAttrList_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declAttrList"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ ) ;
    /**
	 * Decl attr list.
	 * 
	 * @return the tiny haxe try1 parser.decl attr list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.declAttrList_return declAttrList() throws RecognitionException {
        TinyHaxeTry1Parser.declAttrList_return retval = new TinyHaxeTry1Parser.declAttrList_return();
        retval.start = input.LT(1);
        int declAttrList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.declAttr_return declAttr20 = null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:19: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:21: ( declAttr )+
            {
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:21: ( declAttr )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=PUBLIC && LA6_0<=OVERRIDE)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:22: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList553);
            	    declAttr20=declAttr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declAttr.add(declAttr20.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);



            // AST REWRITE
            // elements: declAttr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 75:33: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ )
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:36: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(DECL_ATTR_LIST, "DECL_ATTR_LIST", true), root_1);

                if ( !(stream_declAttr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_declAttr.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttr.nextTree());

                }
                stream_declAttr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, declAttrList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "declAttrList"

    /**
	 * The Class paramList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class paramList_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramList"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ ) | );
    /**
	 * Param list.
	 * 
	 * @return the tiny haxe try1 parser.param list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.paramList_return paramList() throws RecognitionException {
        TinyHaxeTry1Parser.paramList_return retval = new TinyHaxeTry1Parser.paramList_return();
        retval.start = input.LT(1);
        int paramList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA22=null;
        TinyHaxeTry1Parser.param_return param21 = null;

        TinyHaxeTry1Parser.param_return param23 = null;


        Object COMMA22_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:19: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ ) | )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENTIFIER||LA8_0==QUES) ) {
                alt8=1;
            }
            else if ( (LA8_0==RPAREN) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:21: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList594);
                    param21=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param21.getTree());
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:27: ( COMMA param )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:28: COMMA param
                    	    {
                    	    COMMA22=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList597); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA22);

                    	    pushFollow(FOLLOW_param_in_paramList599);
                    	    param23=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_param.add(param23.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: param
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:42: -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:45: ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(PARAM_LIST, "PARAM_LIST", true), root_1);

                        if ( !(stream_param.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_param.hasNext() ) {
                            adaptor.addChild(root_1, stream_param.nextTree());

                        }
                        stream_param.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:80:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, paramList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "paramList"

    /**
	 * The Class param_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class param_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:1: param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER,true] IDENTIFIER ( typeTagOpt )? ( varInit )? ( QUES )? ) ;
    /**
	 * Param.
	 * 
	 * @return the tiny haxe try1 parser.param_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.param_return param() throws RecognitionException {
        TinyHaxeTry1Parser.param_return retval = new TinyHaxeTry1Parser.param_return();
        retval.start = input.LT(1);
        int param_StartIndex = input.index();
        Object root_0 = null;

        Token QUES24=null;
        Token IDENTIFIER25=null;
        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt26 = null;

        TinyHaxeTry1Parser.varInit_return varInit27 = null;


        Object QUES24_tree=null;
        Object IDENTIFIER25_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_QUES=new RewriteRuleTokenStream(adaptor,"token QUES");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:19: ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER,true] IDENTIFIER ( typeTagOpt )? ( varInit )? ( QUES )? ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:20: ( QUES )? IDENTIFIER typeTagOpt varInit
            {
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:20: ( QUES )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==QUES) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0: QUES
                    {
                    QUES24=(Token)match(input,QUES,FOLLOW_QUES_in_param638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES24);


                    }
                    break;

            }

            IDENTIFIER25=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param641); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER25);

            pushFollow(FOLLOW_typeTagOpt_in_param643);
            typeTagOpt26=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt26.getTree());
            pushFollow(FOLLOW_varInit_in_param645);
            varInit27=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varInit.add(varInit27.getTree());


            // AST REWRITE
            // elements: QUES, typeTagOpt, IDENTIFIER, varInit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 81:56: -> ^( VAR[$IDENTIFIER,true] IDENTIFIER ( typeTagOpt )? ( varInit )? ( QUES )? )
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:59: ^( VAR[$IDENTIFIER,true] IDENTIFIER ( typeTagOpt )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, IDENTIFIER25, true), root_1);

                adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:120: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:132: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:141: ( QUES )?
                if ( stream_QUES.hasNext() ) {
                    adaptor.addChild(root_1, stream_QUES.nextNode());

                }
                stream_QUES.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, param_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "param"

    /**
	 * The Class id_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class id_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:84:1: id : IDENTIFIER ;
    /**
	 * Id.
	 * 
	 * @return the tiny haxe try1 parser.id_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.id_return id() throws RecognitionException {
        TinyHaxeTry1Parser.id_return retval = new TinyHaxeTry1Parser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER28=null;

        Object IDENTIFIER28_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:84:4: ( IDENTIFIER )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:84:6: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id680); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER28_tree = new VarUsage(IDENTIFIER28) ;
            adaptor.addChild(root_0, IDENTIFIER28_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, id_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "id"

    /**
	 * The Class dotIdent_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class dotIdent_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotIdent"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:1: dotIdent : ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* ;
    /**
	 * Dot ident.
	 * 
	 * @return the tiny haxe try1 parser.dot ident_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.dotIdent_return dotIdent() throws RecognitionException {
        TinyHaxeTry1Parser.dotIdent_return retval = new TinyHaxeTry1Parser.dotIdent_return();
        retval.start = input.LT(1);
        int dotIdent_StartIndex = input.index();
        Object root_0 = null;

        Token DOT30=null;
        TinyHaxeTry1Parser.id_return ident = null;

        TinyHaxeTry1Parser.id_return id29 = null;


        Object DOT30_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:9: ( ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:11: ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
            {
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:11: ( id -> id )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:12: id
            {
            pushFollow(FOLLOW_id_in_dotIdent694);
            id29=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id29.getTree());


            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:15: -> id
            {
                adaptor.addChild(root_0, stream_id.nextTree());

            }

            retval.tree = root_0;}
            }

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:22: ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DOT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:23: DOT ident= id
            	    {
            	    DOT30=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent702); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT30);

            	    pushFollow(FOLLOW_id_in_dotIdent706);
            	    ident=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id.add(ident.getTree());


            	    // AST REWRITE
            	    // elements: ident, DOT, dotIdent
            	    // token labels: 
            	    // rule labels: retval, ident
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident",ident!=null?ident.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 87:36: -> ^( DOT $dotIdent $ident)
            	    {
            	        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:38: ^( DOT $dotIdent $ident)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_ident.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, dotIdent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotIdent"

    /**
	 * The Class assignOp_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class assignOp_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:110:1: assignOp : ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] );
    /**
	 * Assign op.
	 * 
	 * @return the tiny haxe try1 parser.assign op_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.assignOp_return assignOp() throws RecognitionException {
        TinyHaxeTry1Parser.assignOp_return retval = new TinyHaxeTry1Parser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token EQ31=null;
        Token PLUSEQ32=null;
        Token SUBEQ33=null;
        Token SLASHEQ34=null;
        Token PERCENTEQ35=null;
        Token AMPEQ36=null;

        Object EQ31_tree=null;
        Object PLUSEQ32_tree=null;
        Object SUBEQ33_tree=null;
        Object SLASHEQ34_tree=null;
        Object PERCENTEQ35_tree=null;
        Object AMPEQ36_tree=null;
        RewriteRuleTokenStream stream_SUBEQ=new RewriteRuleTokenStream(adaptor,"token SUBEQ");
        RewriteRuleTokenStream stream_SLASHEQ=new RewriteRuleTokenStream(adaptor,"token SLASHEQ");
        RewriteRuleTokenStream stream_PERCENTEQ=new RewriteRuleTokenStream(adaptor,"token PERCENTEQ");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_AMPEQ=new RewriteRuleTokenStream(adaptor,"token AMPEQ");
        RewriteRuleTokenStream stream_PLUSEQ=new RewriteRuleTokenStream(adaptor,"token PLUSEQ");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:110:9: ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] )
            int alt11=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt11=1;
                }
                break;
            case PLUSEQ:
                {
                alt11=2;
                }
                break;
            case SUBEQ:
                {
                alt11=3;
                }
                break;
            case SLASHEQ:
                {
                alt11=4;
                }
                break;
            case PERCENTEQ:
                {
                alt11=5;
                }
                break;
            case AMPEQ:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:110:11: EQ
                    {
                    EQ31=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ31);



                    // AST REWRITE
                    // elements: EQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:14: -> EQ[$EQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(EQ, EQ31));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:111:11: PLUSEQ
                    {
                    PLUSEQ32=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSEQ.add(PLUSEQ32);



                    // AST REWRITE
                    // elements: PLUSEQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 111:19: -> PLUSEQ[$PLUSEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PLUSEQ, PLUSEQ32));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:112:11: SUBEQ
                    {
                    SUBEQ33=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBEQ.add(SUBEQ33);



                    // AST REWRITE
                    // elements: SUBEQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 112:17: -> SUBEQ[$SUBEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SUBEQ, SUBEQ33));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:113:11: SLASHEQ
                    {
                    SLASHEQ34=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp799); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASHEQ.add(SLASHEQ34);



                    // AST REWRITE
                    // elements: SLASHEQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:19: -> SLASHEQ[$SLASHEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SLASHEQ, SLASHEQ34));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:114:4: PERCENTEQ
                    {
                    PERCENTEQ35=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERCENTEQ.add(PERCENTEQ35);



                    // AST REWRITE
                    // elements: PERCENTEQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:4: -> PERCENTEQ[$PERCENTEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PERCENTEQ, PERCENTEQ35));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:116:4: AMPEQ
                    {
                    AMPEQ36=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMPEQ.add(AMPEQ36);



                    // AST REWRITE
                    // elements: AMPEQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:10: -> AMPEQ[$AMPEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(AMPEQ, AMPEQ36));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, assignOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignOp"

    /**
	 * The Class funcLit_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class funcLit_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcLit"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:125:1: funcLit : FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION paramList ( typeTagOpt )? block ) ;
    /**
	 * Func lit.
	 * 
	 * @return the tiny haxe try1 parser.func lit_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.funcLit_return funcLit() throws RecognitionException {
        TinyHaxeTry1Parser.funcLit_return retval = new TinyHaxeTry1Parser.funcLit_return();
        retval.start = input.LT(1);
        int funcLit_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION37=null;
        Token LPAREN38=null;
        Token RPAREN40=null;
        TinyHaxeTry1Parser.paramList_return paramList39 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt41 = null;

        TinyHaxeTry1Parser.block_return block42 = null;


        Object FUNCTION37_tree=null;
        Object LPAREN38_tree=null;
        Object RPAREN40_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:125:19: ( FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION paramList ( typeTagOpt )? block ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:125:21: FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block
            {
            FUNCTION37=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit868); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION37);

            LPAREN38=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit870); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN38);

            pushFollow(FOLLOW_paramList_in_funcLit872);
            paramList39=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList39.getTree());
            RPAREN40=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit874); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN40);

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:125:54: ( typeTagOpt )?
            int alt12=2;
            switch ( input.LA(1) ) {
                case COLON:
                    {
                    alt12=1;
                    }
                    break;
                case LBRACE:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (synpred21_TinyHaxeTry1()) ) {
                        alt12=1;
                    }
                    }
                    break;
                case SEMI:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (synpred21_TinyHaxeTry1()) ) {
                        alt12=1;
                    }
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0: typeTagOpt
                    {
                    pushFollow(FOLLOW_typeTagOpt_in_funcLit876);
                    typeTagOpt41=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt41.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_funcLit879);
            block42=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block42.getTree());


            // AST REWRITE
            // elements: block, paramList, FUNCTION, typeTagOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 125:72: -> ^( FUNCTION paramList ( typeTagOpt )? block )
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:125:75: ^( FUNCTION paramList ( typeTagOpt )? block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                adaptor.addChild(root_1, stream_paramList.nextTree());
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:125:110: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, funcLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcLit"

    /**
	 * The Class arrayLit_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class arrayLit_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLit"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:127:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
    /**
	 * Array lit.
	 * 
	 * @return the tiny haxe try1 parser.array lit_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.arrayLit_return arrayLit() throws RecognitionException {
        TinyHaxeTry1Parser.arrayLit_return retval = new TinyHaxeTry1Parser.arrayLit_return();
        retval.start = input.LT(1);
        int arrayLit_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACKET43=null;
        Token RBRACKET45=null;
        TinyHaxeTry1Parser.exprListOpt_return exprListOpt44 = null;


        Object LBRACKET43_tree=null;
        Object RBRACKET45_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:127:18: ( LBRACKET exprListOpt RBRACKET )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:127:20: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            LBRACKET43=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit912); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit915);
            exprListOpt44=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt44.getTree());
            RBRACKET45=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit917); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, arrayLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayLit"

    /**
	 * The Class pp_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class pp_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pp"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:134:1: pp : ( ppIf | ppElseIf | ppElse | ppEnd | ppError );
    /**
	 * Pp.
	 * 
	 * @return the tiny haxe try1 parser.pp_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.pp_return pp() throws RecognitionException {
        TinyHaxeTry1Parser.pp_return retval = new TinyHaxeTry1Parser.pp_return();
        retval.start = input.LT(1);
        int pp_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.ppIf_return ppIf46 = null;

        TinyHaxeTry1Parser.ppElseIf_return ppElseIf47 = null;

        TinyHaxeTry1Parser.ppElse_return ppElse48 = null;

        TinyHaxeTry1Parser.ppEnd_return ppEnd49 = null;

        TinyHaxeTry1Parser.ppError_return ppError50 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:134:19: ( ppIf | ppElseIf | ppElse | ppEnd | ppError )
            int alt13=5;
            switch ( input.LA(1) ) {
            case PP_IF:
                {
                alt13=1;
                }
                break;
            case PP_ELSEIF:
                {
                alt13=2;
                }
                break;
            case PP_ELSE:
                {
                alt13=3;
                }
                break;
            case PP_END:
                {
                alt13=4;
                }
                break;
            case PP_ERROR:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:134:21: ppIf
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppIf_in_pp945);
                    ppIf46=ppIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppIf46.getTree());

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:135:25: ppElseIf
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppElseIf_in_pp971);
                    ppElseIf47=ppElseIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppElseIf47.getTree());

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:136:25: ppElse
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppElse_in_pp997);
                    ppElse48=ppElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppElse48.getTree());

                    }
                    break;
                case 4 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:25: ppEnd
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppEnd_in_pp1023);
                    ppEnd49=ppEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppEnd49.getTree());

                    }
                    break;
                case 5 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:138:25: ppError
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppError_in_pp1049);
                    ppError50=ppError();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppError50.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, pp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pp"

    /**
	 * The Class ppIf_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class ppIf_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppIf"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:140:1: ppIf : ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER );
    /**
	 * Pp if.
	 * 
	 * @return the tiny haxe try1 parser.pp if_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.ppIf_return ppIf() throws RecognitionException {
        TinyHaxeTry1Parser.ppIf_return retval = new TinyHaxeTry1Parser.ppIf_return();
        retval.start = input.LT(1);
        int ppIf_StartIndex = input.index();
        Object root_0 = null;

        Token PP_IF51=null;
        Token IDENTIFIER52=null;
        Token PP_IF53=null;
        Token BANG54=null;
        Token IDENTIFIER55=null;

        Object PP_IF51_tree=null;
        Object IDENTIFIER52_tree=null;
        Object PP_IF53_tree=null;
        Object BANG54_tree=null;
        Object IDENTIFIER55_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:140:19: ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==PP_IF) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==IDENTIFIER) ) {
                    alt14=1;
                }
                else if ( (LA14_1==BANG) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:140:21: PP_IF IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_IF51=(Token)match(input,PP_IF,FOLLOW_PP_IF_in_ppIf1071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_IF51_tree = (Object)adaptor.create(PP_IF51);
                    adaptor.addChild(root_0, PP_IF51_tree);
                    }
                    IDENTIFIER52=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1073); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER52_tree = (Object)adaptor.create(IDENTIFIER52);
                    adaptor.addChild(root_0, IDENTIFIER52_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:25: PP_IF BANG IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_IF53=(Token)match(input,PP_IF,FOLLOW_PP_IF_in_ppIf1099); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_IF53_tree = (Object)adaptor.create(PP_IF53);
                    adaptor.addChild(root_0, PP_IF53_tree);
                    }
                    BANG54=(Token)match(input,BANG,FOLLOW_BANG_in_ppIf1101); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANG54_tree = (Object)adaptor.create(BANG54);
                    adaptor.addChild(root_0, BANG54_tree);
                    }
                    IDENTIFIER55=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER55_tree = (Object)adaptor.create(IDENTIFIER55);
                    adaptor.addChild(root_0, IDENTIFIER55_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, ppIf_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ppIf"

    /**
	 * The Class ppElseIf_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class ppElseIf_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppElseIf"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:143:1: ppElseIf : ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER );
    /**
	 * Pp else if.
	 * 
	 * @return the tiny haxe try1 parser.pp else if_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.ppElseIf_return ppElseIf() throws RecognitionException {
        TinyHaxeTry1Parser.ppElseIf_return retval = new TinyHaxeTry1Parser.ppElseIf_return();
        retval.start = input.LT(1);
        int ppElseIf_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ELSEIF56=null;
        Token IDENTIFIER57=null;
        Token PP_ELSEIF58=null;
        Token BANG59=null;
        Token IDENTIFIER60=null;

        Object PP_ELSEIF56_tree=null;
        Object IDENTIFIER57_tree=null;
        Object PP_ELSEIF58_tree=null;
        Object BANG59_tree=null;
        Object IDENTIFIER60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:143:19: ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==PP_ELSEIF) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==IDENTIFIER) ) {
                    alt15=1;
                }
                else if ( (LA15_1==BANG) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:143:21: PP_ELSEIF IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_ELSEIF56=(Token)match(input,PP_ELSEIF,FOLLOW_PP_ELSEIF_in_ppElseIf1121); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_ELSEIF56_tree = (Object)adaptor.create(PP_ELSEIF56);
                    adaptor.addChild(root_0, PP_ELSEIF56_tree);
                    }
                    IDENTIFIER57=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1123); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER57_tree = (Object)adaptor.create(IDENTIFIER57);
                    adaptor.addChild(root_0, IDENTIFIER57_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:144:24: PP_ELSEIF BANG IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_ELSEIF58=(Token)match(input,PP_ELSEIF,FOLLOW_PP_ELSEIF_in_ppElseIf1148); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_ELSEIF58_tree = (Object)adaptor.create(PP_ELSEIF58);
                    adaptor.addChild(root_0, PP_ELSEIF58_tree);
                    }
                    BANG59=(Token)match(input,BANG,FOLLOW_BANG_in_ppElseIf1150); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANG59_tree = (Object)adaptor.create(BANG59);
                    adaptor.addChild(root_0, BANG59_tree);
                    }
                    IDENTIFIER60=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1152); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER60_tree = (Object)adaptor.create(IDENTIFIER60);
                    adaptor.addChild(root_0, IDENTIFIER60_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, ppElseIf_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ppElseIf"

    /**
	 * The Class ppElse_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class ppElse_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppElse"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:146:1: ppElse : PP_ELSE ;
    /**
	 * Pp else.
	 * 
	 * @return the tiny haxe try1 parser.pp else_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.ppElse_return ppElse() throws RecognitionException {
        TinyHaxeTry1Parser.ppElse_return retval = new TinyHaxeTry1Parser.ppElse_return();
        retval.start = input.LT(1);
        int ppElse_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ELSE61=null;

        Object PP_ELSE61_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:146:19: ( PP_ELSE )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:146:21: PP_ELSE
            {
            root_0 = (Object)adaptor.nil();

            PP_ELSE61=(Token)match(input,PP_ELSE,FOLLOW_PP_ELSE_in_ppElse1172); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PP_ELSE61_tree = (Object)adaptor.create(PP_ELSE61);
            adaptor.addChild(root_0, PP_ELSE61_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, ppElse_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ppElse"

    /**
	 * The Class ppEnd_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class ppEnd_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppEnd"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:148:1: ppEnd : PP_END ;
    /**
	 * Pp end.
	 * 
	 * @return the tiny haxe try1 parser.pp end_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.ppEnd_return ppEnd() throws RecognitionException {
        TinyHaxeTry1Parser.ppEnd_return retval = new TinyHaxeTry1Parser.ppEnd_return();
        retval.start = input.LT(1);
        int ppEnd_StartIndex = input.index();
        Object root_0 = null;

        Token PP_END62=null;

        Object PP_END62_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:148:19: ( PP_END )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:148:21: PP_END
            {
            root_0 = (Object)adaptor.nil();

            PP_END62=(Token)match(input,PP_END,FOLLOW_PP_END_in_ppEnd1193); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PP_END62_tree = (Object)adaptor.create(PP_END62);
            adaptor.addChild(root_0, PP_END62_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, ppEnd_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ppEnd"

    /**
	 * The Class ppError_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class ppError_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppError"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:1: ppError : PP_ERROR ;
    /**
	 * Pp error.
	 * 
	 * @return the tiny haxe try1 parser.pp error_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.ppError_return ppError() throws RecognitionException {
        TinyHaxeTry1Parser.ppError_return retval = new TinyHaxeTry1Parser.ppError_return();
        retval.start = input.LT(1);
        int ppError_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ERROR63=null;

        Object PP_ERROR63_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:19: ( PP_ERROR )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:21: PP_ERROR
            {
            root_0 = (Object)adaptor.nil();

            PP_ERROR63=(Token)match(input,PP_ERROR,FOLLOW_PP_ERROR_in_ppError1212); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PP_ERROR63_tree = (Object)adaptor.create(PP_ERROR63);
            adaptor.addChild(root_0, PP_ERROR63_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, ppError_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ppError"

    /**
	 * The Class typeTag_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class typeTag_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeTag"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:1: typeTag : COLON funcType ;
    /**
	 * Type tag.
	 * 
	 * @return the tiny haxe try1 parser.type tag_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.typeTag_return typeTag() throws RecognitionException {
        TinyHaxeTry1Parser.typeTag_return retval = new TinyHaxeTry1Parser.typeTag_return();
        retval.start = input.LT(1);
        int typeTag_StartIndex = input.index();
        Object root_0 = null;

        Token COLON64=null;
        TinyHaxeTry1Parser.funcType_return funcType65 = null;


        Object COLON64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:9: ( COLON funcType )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:11: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            COLON64=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1225); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_typeTag1228);
            funcType65=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType65.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, typeTag_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeTag"

    /**
	 * The Class typeTagOpt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class typeTagOpt_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeTagOpt"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:158:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag ) | );
    /**
	 * Type tag opt.
	 * 
	 * @return the tiny haxe try1 parser.type tag opt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeTagOpt_return retval = new TinyHaxeTry1Parser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeTag_return typeTag66 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:2: ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag ) | )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==COLON) ) {
                alt16=1;
            }
            else if ( (LA16_0==EOF||LA16_0==SEMI||LA16_0==COMMA||LA16_0==EQ||LA16_0==RPAREN||LA16_0==LBRACE) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:4: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt1240);
                    typeTag66=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag66.getTree());


                    // AST REWRITE
                    // elements: typeTag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:12: -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:15: ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(TYPE_TAG, "TYPE_TAG", true), root_1);

                        adaptor.addChild(root_1, stream_typeTag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:161:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, typeTagOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeTagOpt"

    /**
	 * The Class typeList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class typeList_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeList"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:163:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );
    /**
	 * Type list.
	 * 
	 * @return the tiny haxe try1 parser.type list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.typeList_return typeList() throws RecognitionException {
        TinyHaxeTry1Parser.typeList_return retval = new TinyHaxeTry1Parser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA68=null;
        Token COMMA71=null;
        TinyHaxeTry1Parser.funcType_return funcType67 = null;

        TinyHaxeTry1Parser.funcType_return funcType69 = null;

        TinyHaxeTry1Parser.typeConstraint_return typeConstraint70 = null;

        TinyHaxeTry1Parser.typeConstraint_return typeConstraint72 = null;


        Object COMMA68_tree=null;
        Object COMMA71_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:163:9: ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:163:11: funcType ( COMMA funcType )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_typeList1265);
                    funcType67=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType67.getTree());
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:163:20: ( COMMA funcType )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            int LA17_2 = input.LA(2);

                            if ( (synpred29_TinyHaxeTry1()) ) {
                                alt17=1;
                            }


                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:163:21: COMMA funcType
                    	    {
                    	    COMMA68=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1268); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_funcType_in_typeList1271);
                    	    funcType69=funcType();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType69.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:4: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeConstraint_in_typeList1279);
                    typeConstraint70=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint70.getTree());
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:19: ( COMMA typeConstraint )*
                    loop18:
                    do {
                        int alt18=2;
                        alt18 = dfa18.predict(input);
                        switch (alt18) {
                    	case 1 :
                    	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:20: COMMA typeConstraint
                    	    {
                    	    COMMA71=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1282); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList1285);
                    	    typeConstraint72=typeConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint72.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, typeList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeList"

    /**
	 * The Class funcType_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class funcType_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcType"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:1: funcType : ( ( type ) ( MINUS_BIGGER type )* | VOID );
    /**
	 * Func type.
	 * 
	 * @return the tiny haxe try1 parser.func type_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.funcType_return funcType() throws RecognitionException {
        TinyHaxeTry1Parser.funcType_return retval = new TinyHaxeTry1Parser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token MINUS_BIGGER74=null;
        Token VOID76=null;
        TinyHaxeTry1Parser.type_return type73 = null;

        TinyHaxeTry1Parser.type_return type75 = null;


        Object MINUS_BIGGER74_tree=null;
        Object VOID76_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:9: ( ( type ) ( MINUS_BIGGER type )* | VOID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==EOF||(LA21_0>=SEMI && LA21_0<=IDENTIFIER)||LA21_0==IMPORT||LA21_0==DYNAMIC||(LA21_0>=COMMA && LA21_0<=AMPEQ)||(LA21_0>=LPAREN && LA21_0<=RPAREN)||(LA21_0>=RBRACKET && LA21_0<=PP_IF)||(LA21_0>=PP_ELSEIF && LA21_0<=MINUS_BIGGER)||(LA21_0>=INT && LA21_0<=GTGT)||LA21_0==IN||(LA21_0>=LBRACE && LA21_0<=RBRACE)||(LA21_0>=ELLIPSIS && LA21_0<=PERCENT)||LA21_0==ENUM||(LA21_0>=EXTERN && LA21_0<=TYPEDEF)) ) {
                alt21=1;
            }
            else if ( (LA21_0==VOID) ) {
                int LA21_2 = input.LA(2);

                if ( (synpred33_TinyHaxeTry1()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:11: ( type ) ( MINUS_BIGGER type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:11: ( type )
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:12: type
                    {
                    pushFollow(FOLLOW_type_in_funcType1300);
                    type73=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type73.getTree());

                    }

                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:18: ( MINUS_BIGGER type )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==MINUS_BIGGER) ) {
                            int LA20_2 = input.LA(2);

                            if ( (synpred32_TinyHaxeTry1()) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:19: MINUS_BIGGER type
                    	    {
                    	    MINUS_BIGGER74=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1304); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_funcType1307);
                    	    type75=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type75.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:168:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID76=(Token)match(input,VOID,FOLLOW_VOID_in_funcType1314); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID76_tree = (Object)adaptor.create(VOID76);
                    adaptor.addChild(root_0, VOID76_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, funcType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcType"

    /**
	 * The Class type_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class type_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:1: type : ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | );
    /**
	 * Type.
	 * 
	 * @return the tiny haxe try1 parser.type_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.type_return type() throws RecognitionException {
        TinyHaxeTry1Parser.type_return retval = new TinyHaxeTry1Parser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token INT79=null;
        Token FLOAT80=null;
        Token DYNAMIC81=null;
        Token BOOLEAN82=null;
        Token VOID83=null;
        TinyHaxeTry1Parser.anonType_return anonType77 = null;

        TinyHaxeTry1Parser.dotIdent_return dotIdent78 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam84 = null;


        Object INT79_tree=null;
        Object FLOAT80_tree=null;
        Object DYNAMIC81_tree=null;
        Object BOOLEAN82_tree=null;
        Object VOID83_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:6: ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
                    int alt22=7;
                    switch ( input.LA(1) ) {
                    case LBRACE:
                        {
                        alt22=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt22=2;
                        }
                        break;
                    case INT:
                        {
                        alt22=3;
                        }
                        break;
                    case FLOAT:
                        {
                        alt22=4;
                        }
                        break;
                    case DYNAMIC:
                        {
                        alt22=5;
                        }
                        break;
                    case BOOLEAN:
                        {
                        alt22=6;
                        }
                        break;
                    case VOID:
                        {
                        alt22=7;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }

                    switch (alt22) {
                        case 1 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:9: anonType
                            {
                            pushFollow(FOLLOW_anonType_in_type1326);
                            anonType77=anonType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonType77.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:20: dotIdent
                            {
                            pushFollow(FOLLOW_dotIdent_in_type1330);
                            dotIdent78=dotIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent78.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:30: INT
                            {
                            INT79=(Token)match(input,INT,FOLLOW_INT_in_type1333); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INT79_tree = (Object)adaptor.create(INT79);
                            adaptor.addChild(root_0, INT79_tree);
                            }

                            }
                            break;
                        case 4 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:35: FLOAT
                            {
                            FLOAT80=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type1336); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            FLOAT80_tree = (Object)adaptor.create(FLOAT80);
                            adaptor.addChild(root_0, FLOAT80_tree);
                            }

                            }
                            break;
                        case 5 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:42: DYNAMIC
                            {
                            DYNAMIC81=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_type1339); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DYNAMIC81_tree = (Object)adaptor.create(DYNAMIC81);
                            adaptor.addChild(root_0, DYNAMIC81_tree);
                            }

                            }
                            break;
                        case 6 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:50: BOOLEAN
                            {
                            BOOLEAN82=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1341); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BOOLEAN82_tree = (Object)adaptor.create(BOOLEAN82);
                            adaptor.addChild(root_0, BOOLEAN82_tree);
                            }

                            }
                            break;
                        case 7 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:58: VOID
                            {
                            VOID83=(Token)match(input,VOID,FOLLOW_VOID_in_type1343); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            VOID83_tree = (Object)adaptor.create(VOID83);
                            adaptor.addChild(root_0, VOID83_tree);
                            }

                            }
                            break;

                    }

                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:64: ( typeParam )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==LT) ) {
                            int LA23_2 = input.LA(2);

                            if ( (synpred40_TinyHaxeTry1()) ) {
                                alt23=1;
                            }


                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:65: typeParam
                    	    {
                    	    pushFollow(FOLLOW_typeParam_in_type1347);
                    	    typeParam84=typeParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam84.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:173:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    /**
	 * The Class typeParam_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class typeParam_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeParam"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:175:1: typeParam : LT ( type | typeList ) ( GT | GTGT | ) ;
    /**
	 * Type param.
	 * 
	 * @return the tiny haxe try1 parser.type param_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.typeParam_return typeParam() throws RecognitionException {
        TinyHaxeTry1Parser.typeParam_return retval = new TinyHaxeTry1Parser.typeParam_return();
        retval.start = input.LT(1);
        int typeParam_StartIndex = input.index();
        Object root_0 = null;

        Token LT85=null;
        Token GT88=null;
        Token GTGT89=null;
        TinyHaxeTry1Parser.type_return type86 = null;

        TinyHaxeTry1Parser.typeList_return typeList87 = null;


        Object LT85_tree=null;
        Object GT88_tree=null;
        Object GTGT89_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:2: ( LT ( type | typeList ) ( GT | GTGT | ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:4: LT ( type | typeList ) ( GT | GTGT | )
            {
            root_0 = (Object)adaptor.nil();

            LT85=(Token)match(input,LT,FOLLOW_LT_in_typeParam1365); if (state.failed) return retval;
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:8: ( type | typeList )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:9: type
                    {
                    pushFollow(FOLLOW_type_in_typeParam1369);
                    type86=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type86.getTree());

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:14: typeList
                    {
                    pushFollow(FOLLOW_typeList_in_typeParam1371);
                    typeList87=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList87.getTree());

                    }
                    break;

            }

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:24: ( GT | GTGT | )
            int alt26=3;
            switch ( input.LA(1) ) {
            case GT:
                {
                int LA26_1 = input.LA(2);

                if ( (synpred43_TinyHaxeTry1()) ) {
                    alt26=1;
                }
                else if ( (true) ) {
                    alt26=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
                }
                break;
            case GTGT:
                {
                int LA26_2 = input.LA(2);

                if ( (synpred44_TinyHaxeTry1()) ) {
                    alt26=2;
                }
                else if ( (true) ) {
                    alt26=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case SEMI:
            case IMPORT:
            case COMMA:
            case QUES:
            case EQ:
            case PLUSEQ:
            case SUBEQ:
            case SLASHEQ:
            case PERCENTEQ:
            case AMPEQ:
            case LPAREN:
            case RPAREN:
            case RBRACKET:
            case PP_IF:
            case PP_ELSEIF:
            case PP_ELSE:
            case PP_END:
            case PP_ERROR:
            case COLON:
            case MINUS_BIGGER:
            case LT:
            case IN:
            case LBRACE:
            case RBRACE:
            case ELLIPSIS:
            case BARBAR:
            case AMPAMP:
            case EQEQ:
            case BANGEQ:
            case GTEQ:
            case LTEQ:
            case BAR:
            case AMP:
            case CARET:
            case LTLT:
            case GTGTGT:
            case PLUS:
            case SUB:
            case STAR:
            case SLASH:
            case PERCENT:
            case ENUM:
            case EXTERN:
            case CLASS:
            case INTERFACE:
            case EXTENDS:
            case IMPLEMENTS:
            case TYPEDEF:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:25: GT
                    {
                    GT88=(Token)match(input,GT,FOLLOW_GT_in_typeParam1375); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:29: GTGT
                    {
                    GTGT89=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParam1378); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:35: 
                    {
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, typeParam_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeParam"

    /**
	 * The Class typeParamOpt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class typeParamOpt_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeParamOpt"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:181:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam ) | );
    /**
	 * Type param opt.
	 * 
	 * @return the tiny haxe try1 parser.type param opt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeParamOpt_return retval = new TinyHaxeTry1Parser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam90 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:2: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam ) | )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LT) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred45_TinyHaxeTry1()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==EOF||LA27_0==SEMI||(LA27_0>=COMMA && LA27_0<=AMPEQ)||(LA27_0>=LPAREN && LA27_0<=RPAREN)||LA27_0==RBRACKET||LA27_0==COLON||LA27_0==GT||LA27_0==IN||(LA27_0>=LBRACE && LA27_0<=RBRACE)||(LA27_0>=ELLIPSIS && LA27_0<=PERCENT)||(LA27_0>=EXTENDS && LA27_0<=IMPLEMENTS)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:4: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1401);
                    typeParam90=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam90.getTree());


                    // AST REWRITE
                    // elements: typeParam
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 182:13: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:15: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT", true), root_1);

                        adaptor.addChild(root_1, stream_typeParam.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:184:9: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, typeParamOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeParamOpt"

    /**
	 * The Class typeConstraint_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class typeConstraint_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeConstraint"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:186:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint IDENTIFIER typeList ) ;
    /**
	 * Type constraint.
	 * 
	 * @return the tiny haxe try1 parser.type constraint_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.typeConstraint_return typeConstraint() throws RecognitionException {
        TinyHaxeTry1Parser.typeConstraint_return retval = new TinyHaxeTry1Parser.typeConstraint_return();
        retval.start = input.LT(1);
        int typeConstraint_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER91=null;
        Token COLON92=null;
        Token LPAREN93=null;
        Token RPAREN95=null;
        TinyHaxeTry1Parser.typeList_return typeList94 = null;


        Object IDENTIFIER91_tree=null;
        Object COLON92_tree=null;
        Object LPAREN93_tree=null;
        Object RPAREN95_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:186:19: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint IDENTIFIER typeList ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:186:21: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER91=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1442); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER91);

            COLON92=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1444); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON92);

            LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1446); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN93);

            pushFollow(FOLLOW_typeList_in_typeConstraint1448);
            typeList94=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList94.getTree());
            RPAREN95=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1450); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN95);



            // AST REWRITE
            // elements: IDENTIFIER, typeList, typeConstraint
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 186:61: -> ^( $typeConstraint IDENTIFIER typeList )
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:186:64: ^( $typeConstraint IDENTIFIER typeList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                adaptor.addChild(root_1, stream_typeList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, typeConstraint_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeConstraint"

    /**
	 * The Class functionReturn_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class functionReturn_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionReturn"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) ;
    /**
	 * Function return.
	 * 
	 * @return the tiny haxe try1 parser.function return_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.functionReturn_return functionReturn() throws RecognitionException {
        TinyHaxeTry1Parser.functionReturn_return retval = new TinyHaxeTry1Parser.functionReturn_return();
        retval.start = input.LT(1);
        int functionReturn_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION97=null;
        Token NEW98=null;
        Token LPAREN99=null;
        Token RPAREN101=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList96 = null;

        TinyHaxeTry1Parser.paramList_return paramList100 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt102 = null;

        TinyHaxeTry1Parser.block_return block103 = null;


        Object FUNCTION97_tree=null;
        Object NEW98_tree=null;
        Object LPAREN99_tree=null;
        Object RPAREN101_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:191:2: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:191:4: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
            {
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:191:4: ( declAttrList )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=PUBLIC && LA28_0<=OVERRIDE)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_functionReturn1474);
                    declAttrList96=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList96.getTree());

                    }
                    break;

            }

            FUNCTION97=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionReturn1477); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION97);

            NEW98=(Token)match(input,NEW,FOLLOW_NEW_in_functionReturn1479); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW98);

            LPAREN99=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionReturn1481); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN99);

            pushFollow(FOLLOW_paramList_in_functionReturn1483);
            paramList100=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList100.getTree());
            RPAREN101=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionReturn1485); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN101);

            pushFollow(FOLLOW_typeTagOpt_in_functionReturn1487);
            typeTagOpt102=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt102.getTree());
            pushFollow(FOLLOW_block_in_functionReturn1489);
            block103=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block103.getTree());


            // AST REWRITE
            // elements: FUNCTION, block, typeTagOpt, paramList, NEW, declAttrList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 191:72: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block )
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:191:75: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                adaptor.addChild(root_1, stream_NEW.nextNode());
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:191:104: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:191:118: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:191:129: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, functionReturn_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionReturn"

    /**
	 * The Class statement_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class statement_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:194:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO parExpression statement ) | TRY block catchStmtList -> ^( TRY block catchStmtList ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH expr ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI );
    /**
	 * Statement.
	 * 
	 * @return the tiny haxe try1 parser.statement_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.statement_return statement() throws RecognitionException {
        TinyHaxeTry1Parser.statement_return retval = new TinyHaxeTry1Parser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Token SEMI106=null;
        Token IF108=null;
        Token ELSE110=null;
        Token FOR111=null;
        Token LPAREN112=null;
        Token IN113=null;
        Token RPAREN114=null;
        Token WHILE116=null;
        Token DO119=null;
        Token WHILE121=null;
        Token SEMI123=null;
        Token TRY124=null;
        Token SWITCH127=null;
        Token LPAREN128=null;
        Token RPAREN130=null;
        Token LBRACE131=null;
        Token RBRACE133=null;
        Token RETURN134=null;
        Token SEMI136=null;
        Token THROW137=null;
        Token SEMI139=null;
        Token BREAK140=null;
        Token IDENTIFIER141=null;
        Token SEMI142=null;
        Token CONTINUE143=null;
        Token IDENTIFIER144=null;
        Token SEMI145=null;
        Token SEMI147=null;
        Token IDENTIFIER148=null;
        Token COLON149=null;
        Token SEMI151=null;
        TinyHaxeTry1Parser.statement_return st1 = null;

        TinyHaxeTry1Parser.statement_return st2 = null;

        TinyHaxeTry1Parser.expr_return exp1 = null;

        TinyHaxeTry1Parser.expr_return exp2 = null;

        TinyHaxeTry1Parser.block_return block104 = null;

        TinyHaxeTry1Parser.assignExpr_return assignExpr105 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl107 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression109 = null;

        TinyHaxeTry1Parser.statement_return statement115 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression117 = null;

        TinyHaxeTry1Parser.statement_return statement118 = null;

        TinyHaxeTry1Parser.statement_return statement120 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression122 = null;

        TinyHaxeTry1Parser.block_return block125 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList126 = null;

        TinyHaxeTry1Parser.expr_return expr129 = null;

        TinyHaxeTry1Parser.caseStmt_return caseStmt132 = null;

        TinyHaxeTry1Parser.expr_return expr135 = null;

        TinyHaxeTry1Parser.expr_return expr138 = null;

        TinyHaxeTry1Parser.expr_return expr146 = null;

        TinyHaxeTry1Parser.statement_return statement150 = null;


        Object SEMI106_tree=null;
        Object IF108_tree=null;
        Object ELSE110_tree=null;
        Object FOR111_tree=null;
        Object LPAREN112_tree=null;
        Object IN113_tree=null;
        Object RPAREN114_tree=null;
        Object WHILE116_tree=null;
        Object DO119_tree=null;
        Object WHILE121_tree=null;
        Object SEMI123_tree=null;
        Object TRY124_tree=null;
        Object SWITCH127_tree=null;
        Object LPAREN128_tree=null;
        Object RPAREN130_tree=null;
        Object LBRACE131_tree=null;
        Object RBRACE133_tree=null;
        Object RETURN134_tree=null;
        Object SEMI136_tree=null;
        Object THROW137_tree=null;
        Object SEMI139_tree=null;
        Object BREAK140_tree=null;
        Object IDENTIFIER141_tree=null;
        Object SEMI142_tree=null;
        Object CONTINUE143_tree=null;
        Object IDENTIFIER144_tree=null;
        Object SEMI145_tree=null;
        Object SEMI147_tree=null;
        Object IDENTIFIER148_tree=null;
        Object COLON149_tree=null;
        Object SEMI151_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_THROW=new RewriteRuleTokenStream(adaptor,"token THROW");
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_caseStmt=new RewriteRuleSubtreeStream(adaptor,"rule caseStmt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_catchStmtList=new RewriteRuleSubtreeStream(adaptor,"rule catchStmtList");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:195:2: ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO parExpression statement ) | TRY block catchStmtList -> ^( TRY block catchStmtList ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH expr ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI )
            int alt34=16;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:195:4: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement1525);
                    block104=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block104.getTree());

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:196:4: assignExpr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_statement1530);
                    assignExpr105=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr105.getTree());
                    SEMI106=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1532); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:197:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_statement1538);
                    varDecl107=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl107.getTree());

                    }
                    break;
                case 4 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:198:4: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF108=(Token)match(input,IF,FOLLOW_IF_in_statement1543); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF108);

                    pushFollow(FOLLOW_parExpression_in_statement1545);
                    parExpression109=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression109.getTree());
                    pushFollow(FOLLOW_statement_in_statement1549);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:198:35: ( ELSE st2= statement )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==ELSE) ) {
                        int LA29_1 = input.LA(2);

                        if ( (synpred50_TinyHaxeTry1()) ) {
                            alt29=1;
                        }
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:198:36: ELSE st2= statement
                            {
                            ELSE110=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1552); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE110);

                            pushFollow(FOLLOW_statement_in_statement1556);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ELSE, st1, parExpression, IF, st2
                    // token labels: 
                    // rule labels: retval, st1, st2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_st1=new RewriteRuleSubtreeStream(adaptor,"rule st1",st1!=null?st1.tree:null);
                    RewriteRuleSubtreeStream stream_st2=new RewriteRuleSubtreeStream(adaptor,"rule st2",st2!=null?st2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:57: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:198:60: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new IfNode(stream_IF.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:198:92: ( ^( ELSE $st2) )?
                        if ( stream_ELSE.hasNext()||stream_st2.hasNext() ) {
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:198:92: ^( ELSE $st2)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_st2.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_ELSE.reset();
                        stream_st2.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:199:4: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    FOR111=(Token)match(input,FOR,FOLLOW_FOR_in_statement1595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR111);

                    LPAREN112=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1597); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN112);

                    pushFollow(FOLLOW_expr_in_statement1601);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
                    IN113=(Token)match(input,IN,FOLLOW_IN_in_statement1603); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN113);

                    pushFollow(FOLLOW_expr_in_statement1607);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
                    RPAREN114=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1609); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN114);

                    pushFollow(FOLLOW_statement_in_statement1611);
                    statement115=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement115.getTree());


                    // AST REWRITE
                    // elements: FOR, statement, exp2, exp1, IN
                    // token labels: 
                    // rule labels: retval, exp2, exp1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_exp2=new RewriteRuleSubtreeStream(adaptor,"rule exp2",exp2!=null?exp2.tree:null);
                    RewriteRuleSubtreeStream stream_exp1=new RewriteRuleSubtreeStream(adaptor,"rule exp1",exp1!=null?exp1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:55: -> ^( FOR ^( IN $exp1 $exp2) statement )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:199:58: ^( FOR ^( IN $exp1 $exp2) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ForNode(stream_FOR.nextToken()), root_1);

                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:199:73: ^( IN $exp1 $exp2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_exp1.nextTree());
                        adaptor.addChild(root_2, stream_exp2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:200:4: WHILE parExpression statement
                    {
                    WHILE116=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE116);

                    pushFollow(FOLLOW_parExpression_in_statement1639);
                    parExpression117=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression117.getTree());
                    pushFollow(FOLLOW_statement_in_statement1641);
                    statement118=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement118.getTree());


                    // AST REWRITE
                    // elements: parExpression, WHILE, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:34: -> ^( WHILE parExpression statement )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:200:37: ^( WHILE parExpression statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new WhileNode(stream_WHILE.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:201:4: DO statement WHILE parExpression SEMI
                    {
                    DO119=(Token)match(input,DO,FOLLOW_DO_in_statement1659); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO119);

                    pushFollow(FOLLOW_statement_in_statement1661);
                    statement120=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement120.getTree());
                    WHILE121=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1663); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE121);

                    pushFollow(FOLLOW_parExpression_in_statement1665);
                    parExpression122=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression122.getTree());
                    SEMI123=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1667); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI123);



                    // AST REWRITE
                    // elements: statement, parExpression, DO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:42: -> ^( DO parExpression statement )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:201:45: ^( DO parExpression statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new DoWhileNode(stream_DO.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:202:4: TRY block catchStmtList
                    {
                    TRY124=(Token)match(input,TRY,FOLLOW_TRY_in_statement1685); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY.add(TRY124);

                    pushFollow(FOLLOW_block_in_statement1687);
                    block125=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block125.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_statement1689);
                    catchStmtList126=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList126.getTree());


                    // AST REWRITE
                    // elements: block, TRY, catchStmtList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:28: -> ^( TRY block catchStmtList )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:202:31: ^( TRY block catchStmtList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TryNode(stream_TRY.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_catchStmtList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:203:4: SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
                    {
                    SWITCH127=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement1707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH127);

                    LPAREN128=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN128);

                    pushFollow(FOLLOW_expr_in_statement1711);
                    expr129=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr129.getTree());
                    RPAREN130=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN130);

                    LBRACE131=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement1715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE131);

                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:203:37: ( caseStmt )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=CASE && LA30_0<=DEFAULT)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statement1717);
                    	    caseStmt132=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_caseStmt.add(caseStmt132.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    RBRACE133=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement1720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE133);



                    // AST REWRITE
                    // elements: caseStmt, expr, SWITCH
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 203:54: -> ^( SWITCH expr ( caseStmt )+ )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:203:57: ^( SWITCH expr ( caseStmt )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new SwitchNode(stream_SWITCH.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        if ( !(stream_caseStmt.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_caseStmt.hasNext() ) {
                            adaptor.addChild(root_1, stream_caseStmt.nextTree());

                        }
                        stream_caseStmt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:204:4: RETURN ( expr )? SEMI
                    {
                    RETURN134=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1739); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN134);

                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:204:11: ( expr )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==IDENTIFIER||(LA31_0>=QUES && LA31_0<=LPAREN)||LA31_0==LBRACKET||LA31_0==BANG||(LA31_0>=LT && LA31_0<=GT)||LA31_0==NEW||LA31_0==LBRACE||(LA31_0>=ELLIPSIS && LA31_0<=CAST)||(LA31_0>=LONGLITERAL && LA31_0<=FALSE)) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==SEMI) ) {
                        int LA31_2 = input.LA(2);

                        if ( (synpred58_TinyHaxeTry1()) ) {
                            alt31=1;
                        }
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:204:12: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1742);
                            expr135=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr135.getTree());

                            }
                            break;

                    }

                    SEMI136=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1746); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI136);



                    // AST REWRITE
                    // elements: expr, RETURN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:23: -> ^( RETURN ( expr )? )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:204:26: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:204:35: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:205:4: THROW expr SEMI
                    {
                    THROW137=(Token)match(input,THROW,FOLLOW_THROW_in_statement1759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW137);

                    pushFollow(FOLLOW_expr_in_statement1761);
                    expr138=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr138.getTree());
                    SEMI139=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1763); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI139);



                    // AST REWRITE
                    // elements: expr, THROW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:20: -> ^( THROW expr )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:205:23: ^( THROW expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_THROW.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:206:4: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK140=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1776); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK140);

                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:206:10: ( IDENTIFIER )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==IDENTIFIER) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:206:11: IDENTIFIER
                            {
                            IDENTIFIER141=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1779); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER141);


                            }
                            break;

                    }

                    SEMI142=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1783); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI142);



                    // AST REWRITE
                    // elements: BREAK, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:29: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:206:32: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:206:40: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:207:4: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE143=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1797); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE143);

                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:207:13: ( IDENTIFIER )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==IDENTIFIER) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:207:14: IDENTIFIER
                            {
                            IDENTIFIER144=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1800); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER144);


                            }
                            break;

                    }

                    SEMI145=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1804); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI145);



                    // AST REWRITE
                    // elements: IDENTIFIER, CONTINUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:32: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:207:35: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:207:46: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:208:4: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement1818);
                    expr146=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr146.getTree());
                    SEMI147=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1821); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:4: IDENTIFIER COLON statement
                    {
                    IDENTIFIER148=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER148);

                    COLON149=(Token)match(input,COLON,FOLLOW_COLON_in_statement1829); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON149);

                    pushFollow(FOLLOW_statement_in_statement1831);
                    statement150=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement150.getTree());


                    // AST REWRITE
                    // elements: COLON, IDENTIFIER, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 209:31: -> ^( COLON IDENTIFIER statement )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:34: ^( COLON IDENTIFIER statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_COLON.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:210:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI151=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1846); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    /**
	 * The Class parExpression_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class parExpression_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parExpression"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:213:1: parExpression : LPAREN expr RPAREN ;
    /**
	 * Par expression.
	 * 
	 * @return the tiny haxe try1 parser.par expression_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.parExpression_return parExpression() throws RecognitionException {
        TinyHaxeTry1Parser.parExpression_return retval = new TinyHaxeTry1Parser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN152=null;
        Token RPAREN154=null;
        TinyHaxeTry1Parser.expr_return expr153 = null;


        Object LPAREN152_tree=null;
        Object RPAREN154_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:214:5: ( LPAREN expr RPAREN )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:214:9: LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN152=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1867); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_parExpression1870);
            expr153=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr153.getTree());
            RPAREN154=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1872); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, parExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parExpression"

    /**
	 * The Class block_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class block_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:217:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* ) | SEMI );
    /**
	 * Block.
	 * 
	 * @return the tiny haxe try1 parser.block_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.block_return block() throws RecognitionException {
        TinyHaxeTry1Parser.block_return retval = new TinyHaxeTry1Parser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE155=null;
        Token RBRACE157=null;
        Token SEMI158=null;
        TinyHaxeTry1Parser.blockStmt_return blockStmt156 = null;


        Object LBRACE155_tree=null;
        Object RBRACE157_tree=null;
        Object SEMI158_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:217:15: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* ) | SEMI )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LBRACE) ) {
                alt36=1;
            }
            else if ( (LA36_0==SEMI) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:217:17: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE155=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block1894); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE155);

                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:217:24: ( blockStmt )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=SEMI && LA35_0<=IDENTIFIER)||(LA35_0>=PUBLIC && LA35_0<=OVERRIDE)||(LA35_0>=QUES && LA35_0<=LPAREN)||LA35_0==LBRACKET||LA35_0==BANG||(LA35_0>=LT && LA35_0<=GT)||(LA35_0>=NEW && LA35_0<=IF)||LA35_0==FOR||(LA35_0>=WHILE && LA35_0<=LBRACE)||(LA35_0>=RETURN && LA35_0<=CONTINUE)||(LA35_0>=ELLIPSIS && LA35_0<=CAST)||(LA35_0>=VAR && LA35_0<=CLASS)||(LA35_0>=LONGLITERAL && LA35_0<=FALSE)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:217:25: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block1897);
                    	    blockStmt156=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt156.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    RBRACE157=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block1901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE157);



                    // AST REWRITE
                    // elements: blockStmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:44: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:217:46: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true), root_1);

                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:217:96: ( blockStmt )*
                        while ( stream_blockStmt.hasNext() ) {
                            adaptor.addChild(root_1, stream_blockStmt.nextTree());

                        }
                        stream_blockStmt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:218:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI158=(Token)match(input,SEMI,FOLLOW_SEMI_in_block1919); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    /**
	 * The Class blockStmt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class blockStmt_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockStmt"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:221:1: blockStmt : ( varDecl | classDecl | statement );
    /**
	 * Block stmt.
	 * 
	 * @return the tiny haxe try1 parser.block stmt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.blockStmt_return blockStmt() throws RecognitionException {
        TinyHaxeTry1Parser.blockStmt_return retval = new TinyHaxeTry1Parser.blockStmt_return();
        retval.start = input.LT(1);
        int blockStmt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl159 = null;

        TinyHaxeTry1Parser.classDecl_return classDecl160 = null;

        TinyHaxeTry1Parser.statement_return statement161 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:222:2: ( varDecl | classDecl | statement )
            int alt37=3;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:222:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_blockStmt1932);
                    varDecl159=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl159.getTree());

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:223:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_blockStmt1937);
                    classDecl160=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl160.getTree());

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:224:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStmt1942);
                    statement161=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement161.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, blockStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockStmt"

    /**
	 * The Class breakStmt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class breakStmt_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStmt"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:228:1: breakStmt : BREAK SEMI ;
    /**
	 * Break stmt.
	 * 
	 * @return the tiny haxe try1 parser.break stmt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.breakStmt_return breakStmt() throws RecognitionException {
        TinyHaxeTry1Parser.breakStmt_return retval = new TinyHaxeTry1Parser.breakStmt_return();
        retval.start = input.LT(1);
        int breakStmt_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK162=null;
        Token SEMI163=null;

        Object BREAK162_tree=null;
        Object SEMI163_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:228:19: ( BREAK SEMI )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:228:21: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            BREAK162=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt1973); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK162_tree = (Object)adaptor.create(BREAK162);
            adaptor.addChild(root_0, BREAK162_tree);
            }
            SEMI163=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt1975); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, breakStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakStmt"

    /**
	 * The Class continueStmt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class continueStmt_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueStmt"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:230:1: continueStmt : CONTINUE SEMI ;
    /**
	 * Continue stmt.
	 * 
	 * @return the tiny haxe try1 parser.continue stmt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.continueStmt_return continueStmt() throws RecognitionException {
        TinyHaxeTry1Parser.continueStmt_return retval = new TinyHaxeTry1Parser.continueStmt_return();
        retval.start = input.LT(1);
        int continueStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE164=null;
        Token SEMI165=null;

        Object CONTINUE164_tree=null;
        Object SEMI165_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:230:19: ( CONTINUE SEMI )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:230:21: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE164=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt1990); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE164_tree = (Object)adaptor.create(CONTINUE164);
            adaptor.addChild(root_0, CONTINUE164_tree);
            }
            SEMI165=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt1992); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, continueStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueStmt"

    /**
	 * The Class caseStmt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class caseStmt_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseStmt"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:1: caseStmt : ( CASE exprList COLON statement -> ^( CASE exprList statement ) | DEFAULT COLON statement -> ^( DEFAULT statement ) );
    /**
	 * Case stmt.
	 * 
	 * @return the tiny haxe try1 parser.case stmt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.caseStmt_return caseStmt() throws RecognitionException {
        TinyHaxeTry1Parser.caseStmt_return retval = new TinyHaxeTry1Parser.caseStmt_return();
        retval.start = input.LT(1);
        int caseStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CASE166=null;
        Token COLON168=null;
        Token DEFAULT170=null;
        Token COLON171=null;
        TinyHaxeTry1Parser.exprList_return exprList167 = null;

        TinyHaxeTry1Parser.statement_return statement169 = null;

        TinyHaxeTry1Parser.statement_return statement172 = null;


        Object CASE166_tree=null;
        Object COLON168_tree=null;
        Object DEFAULT170_tree=null;
        Object COLON171_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:9: ( CASE exprList COLON statement -> ^( CASE exprList statement ) | DEFAULT COLON statement -> ^( DEFAULT statement ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==CASE) ) {
                alt38=1;
            }
            else if ( (LA38_0==DEFAULT) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:11: CASE exprList COLON statement
                    {
                    CASE166=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE166);

                    pushFollow(FOLLOW_exprList_in_caseStmt2005);
                    exprList167=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList167.getTree());
                    COLON168=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2007); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON168);

                    pushFollow(FOLLOW_statement_in_caseStmt2009);
                    statement169=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement169.getTree());


                    // AST REWRITE
                    // elements: exprList, CASE, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:41: -> ^( CASE exprList statement )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:44: ^( CASE exprList statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_exprList.nextTree());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:234:4: DEFAULT COLON statement
                    {
                    DEFAULT170=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2024); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT170);

                    COLON171=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2026); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON171);

                    pushFollow(FOLLOW_statement_in_caseStmt2028);
                    statement172=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement172.getTree());


                    // AST REWRITE
                    // elements: DEFAULT, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 234:28: -> ^( DEFAULT statement )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:234:30: ^( DEFAULT statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DEFAULT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, caseStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "caseStmt"

    /**
	 * The Class defaultStmt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class defaultStmt_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultStmt"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:237:1: defaultStmt : DEFAULT COLON ;
    /**
	 * Default stmt.
	 * 
	 * @return the tiny haxe try1 parser.default stmt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.defaultStmt_return defaultStmt() throws RecognitionException {
        TinyHaxeTry1Parser.defaultStmt_return retval = new TinyHaxeTry1Parser.defaultStmt_return();
        retval.start = input.LT(1);
        int defaultStmt_StartIndex = input.index();
        Object root_0 = null;

        Token DEFAULT173=null;
        Token COLON174=null;

        Object DEFAULT173_tree=null;
        Object COLON174_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:237:19: ( DEFAULT COLON )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:237:21: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT173=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt2052); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT173_tree = (Object)adaptor.create(DEFAULT173);
            adaptor.addChild(root_0, DEFAULT173_tree);
            }
            COLON174=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt2054); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, defaultStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "defaultStmt"

    /**
	 * The Class catchStmtList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class catchStmtList_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchStmtList"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:239:1: catchStmtList : ( catchStmt catchStmtList | );
    /**
	 * Catch stmt list.
	 * 
	 * @return the tiny haxe try1 parser.catch stmt list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.catchStmtList_return catchStmtList() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmtList_return retval = new TinyHaxeTry1Parser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.catchStmt_return catchStmt175 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList176 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:239:19: ( catchStmt catchStmtList | )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==CATCH) ) {
                alt39=1;
            }
            else if ( (LA39_0==EOF||(LA39_0>=SEMI && LA39_0<=IDENTIFIER)||(LA39_0>=PUBLIC && LA39_0<=RBRACKET)||LA39_0==BANG||LA39_0==COLON||(LA39_0>=LT && LA39_0<=GT)||(LA39_0>=NEW && LA39_0<=DEFAULT)||(LA39_0>=ELLIPSIS && LA39_0<=CAST)||(LA39_0>=VAR && LA39_0<=CLASS)||(LA39_0>=EXTENDS && LA39_0<=IMPLEMENTS)||(LA39_0>=LONGLITERAL && LA39_0<=FALSE)) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:239:21: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catchStmt_in_catchStmtList2068);
                    catchStmt175=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt175.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList2070);
                    catchStmtList176=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList176.getTree());

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:241:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, catchStmtList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchStmtList"

    /**
	 * The Class catchStmt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class catchStmt_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchStmt"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:242:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH param block ) ;
    /**
	 * Catch stmt.
	 * 
	 * @return the tiny haxe try1 parser.catch stmt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.catchStmt_return catchStmt() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmt_return retval = new TinyHaxeTry1Parser.catchStmt_return();
        retval.start = input.LT(1);
        int catchStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CATCH177=null;
        Token LPAREN178=null;
        Token RPAREN180=null;
        TinyHaxeTry1Parser.param_return param179 = null;

        TinyHaxeTry1Parser.block_return block181 = null;


        Object CATCH177_tree=null;
        Object LPAREN178_tree=null;
        Object RPAREN180_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:242:19: ( CATCH LPAREN param RPAREN block -> ^( CATCH param block ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:242:21: CATCH LPAREN param RPAREN block
            {
            CATCH177=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2109); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH177);

            LPAREN178=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2111); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN178);

            pushFollow(FOLLOW_param_in_catchStmt2113);
            param179=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param179.getTree());
            RPAREN180=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2115); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN180);

            pushFollow(FOLLOW_block_in_catchStmt2117);
            block181=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block181.getTree());


            // AST REWRITE
            // elements: block, param, CATCH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 242:53: -> ^( CATCH param block )
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:242:56: ^( CATCH param block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CATCH.nextNode(), root_1);

                adaptor.addChild(root_1, stream_param.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, catchStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchStmt"

    /**
	 * The Class exprListOpt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class exprListOpt_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprListOpt"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:246:1: exprListOpt : ( exprList | );
    /**
	 * Expr list opt.
	 * 
	 * @return the tiny haxe try1 parser.expr list opt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.exprListOpt_return exprListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.exprListOpt_return retval = new TinyHaxeTry1Parser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.exprList_return exprList182 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:246:19: ( exprList | )
            int alt40=2;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
            case COMMA:
            case QUES:
            case EQ:
            case PLUSEQ:
            case SUBEQ:
            case SLASHEQ:
            case PERCENTEQ:
            case AMPEQ:
            case FUNCTION:
            case LPAREN:
            case LBRACKET:
            case BANG:
            case LT:
            case GT:
            case NEW:
            case LBRACE:
            case ELLIPSIS:
            case BARBAR:
            case AMPAMP:
            case EQEQ:
            case BANGEQ:
            case GTEQ:
            case LTEQ:
            case BAR:
            case AMP:
            case CARET:
            case LTLT:
            case GTGTGT:
            case PLUS:
            case SUB:
            case STAR:
            case SLASH:
            case PERCENT:
            case SUBSUB:
            case PLUSPLUS:
            case TILDE:
            case NULL:
            case CAST:
            case LONGLITERAL:
            case INTLITERAL:
            case STRINGLITERAL:
            case CHARLITERAL:
            case FLOATNUM:
            case TRUE:
            case FALSE:
                {
                alt40=1;
                }
                break;
            case RBRACKET:
                {
                int LA40_2 = input.LA(2);

                if ( (synpred73_TinyHaxeTry1()) ) {
                    alt40=1;
                }
                else if ( (true) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
                }
                break;
            case RPAREN:
                {
                int LA40_3 = input.LA(2);

                if ( (synpred73_TinyHaxeTry1()) ) {
                    alt40=1;
                }
                else if ( (true) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:246:21: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprList_in_exprListOpt2144);
                    exprList182=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList182.getTree());

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:248:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, exprListOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprListOpt"

    /**
	 * The Class exprList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class exprList_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:249:1: exprList : expr ( COMMA expr )* ;
    /**
	 * Expr list.
	 * 
	 * @return the tiny haxe try1 parser.expr list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.exprList_return exprList() throws RecognitionException {
        TinyHaxeTry1Parser.exprList_return retval = new TinyHaxeTry1Parser.exprList_return();
        retval.start = input.LT(1);
        int exprList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA184=null;
        TinyHaxeTry1Parser.expr_return expr183 = null;

        TinyHaxeTry1Parser.expr_return expr185 = null;


        Object COMMA184_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:249:19: ( expr ( COMMA expr )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:249:21: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList2184);
            expr183=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr183.getTree());
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:249:26: ( COMMA expr )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:249:27: COMMA expr
            	    {
            	    COMMA184=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2187); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_exprList2190);
            	    expr185=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr185.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, exprList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprList"

    /**
	 * The Class expr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class expr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:251:1: expr : assignExpr ;
    /**
	 * Expr.
	 * 
	 * @return the tiny haxe try1 parser.expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.expr_return expr() throws RecognitionException {
        TinyHaxeTry1Parser.expr_return retval = new TinyHaxeTry1Parser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.assignExpr_return assignExpr186 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:251:19: ( assignExpr )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:251:21: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr2214);
            assignExpr186=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr186.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    /**
	 * The Class assignExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class assignExpr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:253:1: assignExpr : iterExpr ( assignOp iterExpr )* ;
    /**
	 * Assign expr.
	 * 
	 * @return the tiny haxe try1 parser.assign expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.assignExpr_return assignExpr() throws RecognitionException {
        TinyHaxeTry1Parser.assignExpr_return retval = new TinyHaxeTry1Parser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr187 = null;

        TinyHaxeTry1Parser.assignOp_return assignOp188 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr189 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:253:19: ( iterExpr ( assignOp iterExpr )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:253:21: iterExpr ( assignOp iterExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iterExpr_in_assignExpr2230);
            iterExpr187=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr187.getTree());
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:253:30: ( assignOp iterExpr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=EQ && LA42_0<=AMPEQ)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:253:31: assignOp iterExpr
            	    {
            	    pushFollow(FOLLOW_assignOp_in_assignExpr2233);
            	    assignOp188=assignOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp188.getTree(), root_0);
            	    pushFollow(FOLLOW_iterExpr_in_assignExpr2236);
            	    iterExpr189=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr189.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, assignExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExpr"

    /**
	 * The Class iterExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class iterExpr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterExpr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:1: iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
    /**
	 * Iter expr.
	 * 
	 * @return the tiny haxe try1 parser.iter expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.iterExpr_return iterExpr() throws RecognitionException {
        TinyHaxeTry1Parser.iterExpr_return retval = new TinyHaxeTry1Parser.iterExpr_return();
        retval.start = input.LT(1);
        int iterExpr_StartIndex = input.index();
        Object root_0 = null;

        Token ELLIPSIS191=null;
        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr190 = null;

        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr192 = null;


        Object ELLIPSIS191_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:9: ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:11: ternaryExpr ( ELLIPSIS ternaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2249);
            ternaryExpr190=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr190.getTree());
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:23: ( ELLIPSIS ternaryExpr )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==ELLIPSIS) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:24: ELLIPSIS ternaryExpr
            	    {
            	    ELLIPSIS191=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2252); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELLIPSIS191_tree = (Object)adaptor.create(ELLIPSIS191);
            	    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS191_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2255);
            	    ternaryExpr192=ternaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr192.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, iterExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iterExpr"

    /**
	 * The Class ternaryExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class ternaryExpr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
    /**
	 * Ternary expr.
	 * 
	 * @return the tiny haxe try1 parser.ternary expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        TinyHaxeTry1Parser.ternaryExpr_return retval = new TinyHaxeTry1Parser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        Token QUES194=null;
        Token COLON196=null;
        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr193 = null;

        TinyHaxeTry1Parser.expr_return expr195 = null;

        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr197 = null;


        Object QUES194_tree=null;
        Object COLON196_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:19: ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:21: logicOrExpr ( QUES expr COLON logicOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2281);
            logicOrExpr193=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr193.getTree());
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:33: ( QUES expr COLON logicOrExpr )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==QUES) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:34: QUES expr COLON logicOrExpr
            	    {
            	    QUES194=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2284); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    QUES194_tree = (Object)adaptor.create(QUES194);
            	    root_0 = (Object)adaptor.becomeRoot(QUES194_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_in_ternaryExpr2287);
            	    expr195=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr195.getTree());
            	    COLON196=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2289); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2292);
            	    logicOrExpr197=logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr197.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, ternaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"

    /**
	 * The Class logicOrExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class logicOrExpr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicOrExpr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:261:1: logicOrExpr : ( logicAndExpr ) ( BARBAR logicAndExpr )* ;
    /**
	 * Logic or expr.
	 * 
	 * @return the tiny haxe try1 parser.logic or expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicOrExpr_return retval = new TinyHaxeTry1Parser.logicOrExpr_return();
        retval.start = input.LT(1);
        int logicOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BARBAR199=null;
        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr198 = null;

        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr200 = null;


        Object BARBAR199_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:261:19: ( ( logicAndExpr ) ( BARBAR logicAndExpr )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:261:21: ( logicAndExpr ) ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:261:21: ( logicAndExpr )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:261:22: logicAndExpr
            {
            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2310);
            logicAndExpr198=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr198.getTree());

            }

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:261:36: ( BARBAR logicAndExpr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==BARBAR) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:261:37: BARBAR logicAndExpr
            	    {
            	    BARBAR199=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2314); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR199_tree = (Object)adaptor.create(BARBAR199);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR199_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2317);
            	    logicAndExpr200=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr200.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, logicOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicOrExpr"

    /**
	 * The Class logicAndExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class logicAndExpr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicAndExpr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:263:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
    /**
	 * Logic and expr.
	 * 
	 * @return the tiny haxe try1 parser.logic and expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicAndExpr_return retval = new TinyHaxeTry1Parser.logicAndExpr_return();
        retval.start = input.LT(1);
        int logicAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token AMPAMP202=null;
        TinyHaxeTry1Parser.cmpExpr_return cmpExpr201 = null;

        TinyHaxeTry1Parser.cmpExpr_return cmpExpr203 = null;


        Object AMPAMP202_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:263:19: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:263:21: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:263:21: ( cmpExpr )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:263:22: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2334);
            cmpExpr201=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr201.getTree());

            }

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:263:31: ( AMPAMP cmpExpr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==AMPAMP) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:263:32: AMPAMP cmpExpr
            	    {
            	    AMPAMP202=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2338); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP202_tree = (Object)adaptor.create(AMPAMP202);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP202_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2341);
            	    cmpExpr203=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr203.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, logicAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicAndExpr"

    /**
	 * The Class cmpExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class cmpExpr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cmpExpr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:1: cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* ;
    /**
	 * Cmp expr.
	 * 
	 * @return the tiny haxe try1 parser.cmp expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.cmpExpr_return cmpExpr() throws RecognitionException {
        TinyHaxeTry1Parser.cmpExpr_return retval = new TinyHaxeTry1Parser.cmpExpr_return();
        retval.start = input.LT(1);
        int cmpExpr_StartIndex = input.index();
        Object root_0 = null;

        Token EQEQ205=null;
        Token BANGEQ206=null;
        Token GTEQ207=null;
        Token LTEQ208=null;
        Token GT209=null;
        Token LT210=null;
        TinyHaxeTry1Parser.bitExpr_return bitExpr204 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr211 = null;


        Object EQEQ205_tree=null;
        Object BANGEQ206_tree=null;
        Object GTEQ207_tree=null;
        Object LTEQ208_tree=null;
        Object GT209_tree=null;
        Object LT210_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:19: ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:21: ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:21: ( bitExpr )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:22: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2363);
            bitExpr204=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr204.getTree());

            }

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:31: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=LT && LA48_0<=GT)||(LA48_0>=EQEQ && LA48_0<=LTEQ)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:32: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
            	    {
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:32: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
            	    int alt47=6;
            	    switch ( input.LA(1) ) {
            	    case EQEQ:
            	        {
            	        alt47=1;
            	        }
            	        break;
            	    case BANGEQ:
            	        {
            	        alt47=2;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt47=3;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt47=4;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt47=5;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt47=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 47, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt47) {
            	        case 1 :
            	            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:33: EQEQ
            	            {
            	            EQEQ205=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2368); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ205_tree = (Object)adaptor.create(EQEQ205);
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ205_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:40: BANGEQ
            	            {
            	            BANGEQ206=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2372); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ206_tree = (Object)adaptor.create(BANGEQ206);
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ206_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:50: GTEQ
            	            {
            	            GTEQ207=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2377); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ207_tree = (Object)adaptor.create(GTEQ207);
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ207_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:58: LTEQ
            	            {
            	            LTEQ208=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2382); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ208_tree = (Object)adaptor.create(LTEQ208);
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ208_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:66: GT
            	            {
            	            GT209=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2387); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT209_tree = (Object)adaptor.create(GT209);
            	            root_0 = (Object)adaptor.becomeRoot(GT209_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:72: LT
            	            {
            	            LT210=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2392); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT210_tree = (Object)adaptor.create(LT210);
            	            root_0 = (Object)adaptor.becomeRoot(LT210_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2397);
            	    bitExpr211=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr211.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, cmpExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cmpExpr"

    /**
	 * The Class bitExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class bitExpr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitExpr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:267:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
    /**
	 * Bit expr.
	 * 
	 * @return the tiny haxe try1 parser.bit expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.bitExpr_return bitExpr() throws RecognitionException {
        TinyHaxeTry1Parser.bitExpr_return retval = new TinyHaxeTry1Parser.bitExpr_return();
        retval.start = input.LT(1);
        int bitExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BAR213=null;
        Token AMP215=null;
        Token CARET217=null;
        TinyHaxeTry1Parser.shiftExpr_return shiftExpr212 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr214 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr216 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr218 = null;


        Object BAR213_tree=null;
        Object AMP215_tree=null;
        Object CARET217_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:267:19: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:267:21: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:267:21: ( shiftExpr )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:267:22: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2419);
            shiftExpr212=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr212.getTree());

            }

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:267:33: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            loop49:
            do {
                int alt49=4;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    alt49=1;
                    }
                    break;
                case AMP:
                    {
                    alt49=2;
                    }
                    break;
                case CARET:
                    {
                    alt49=3;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:267:34: BAR shiftExpr
            	    {
            	    BAR213=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2423); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR213_tree = (Object)adaptor.create(BAR213);
            	    root_0 = (Object)adaptor.becomeRoot(BAR213_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2426);
            	    shiftExpr214=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr214.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:267:51: AMP shiftExpr
            	    {
            	    AMP215=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2430); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP215_tree = (Object)adaptor.create(AMP215);
            	    root_0 = (Object)adaptor.becomeRoot(AMP215_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2433);
            	    shiftExpr216=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr216.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:267:67: CARET shiftExpr
            	    {
            	    CARET217=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2436); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET217_tree = (Object)adaptor.create(CARET217);
            	    root_0 = (Object)adaptor.becomeRoot(CARET217_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2439);
            	    shiftExpr218=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr218.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, bitExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitExpr"

    /**
	 * The Class shiftExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class shiftExpr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:1: shiftExpr : ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* ;
    /**
	 * Shift expr.
	 * 
	 * @return the tiny haxe try1 parser.shift expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.shiftExpr_return shiftExpr() throws RecognitionException {
        TinyHaxeTry1Parser.shiftExpr_return retval = new TinyHaxeTry1Parser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LTLT220=null;
        Token GT222=null;
        Token GT223=null;
        Token GTGTGT225=null;
        TinyHaxeTry1Parser.addExpr_return addExpr219 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr221 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr224 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr226 = null;


        Object LTLT220_tree=null;
        Object GT222_tree=null;
        Object GT223_tree=null;
        Object GTGTGT225_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:19: ( ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:21: ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:21: ( addExpr )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:22: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2460);
            addExpr219=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr219.getTree());

            }

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:31: ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            loop50:
            do {
                int alt50=4;
                switch ( input.LA(1) ) {
                case GT:
                    {
                    int LA50_2 = input.LA(2);

                    if ( (LA50_2==GT) ) {
                        int LA50_5 = input.LA(3);

                        if ( (synpred90_TinyHaxeTry1()) ) {
                            alt50=2;
                        }


                    }


                    }
                    break;
                case LTLT:
                    {
                    alt50=1;
                    }
                    break;
                case GTGTGT:
                    {
                    alt50=3;
                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:32: LTLT addExpr
            	    {
            	    LTLT220=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2464); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT220_tree = (Object)adaptor.create(LTLT220);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT220_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2468);
            	    addExpr221=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr221.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:49: ( GT GT ) addExpr
            	    {
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:49: ( GT GT )
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:50: GT GT
            	    {
            	    GT222=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2473); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT222_tree = (Object)adaptor.create(GT222);
            	    adaptor.addChild(root_0, GT222_tree);
            	    }
            	    GT223=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2475); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT223_tree = (Object)adaptor.create(GT223);
            	    adaptor.addChild(root_0, GT223_tree);
            	    }

            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2480);
            	    addExpr224=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr224.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:69: GTGTGT addExpr
            	    {
            	    GTGTGT225=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2484); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT225_tree = (Object)adaptor.create(GTGTGT225);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT225_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2487);
            	    addExpr226=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr226.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, shiftExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftExpr"

    /**
	 * The Class addExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class addExpr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:273:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
    /**
	 * Adds the expr.
	 * 
	 * @return the tiny haxe try1 parser.add expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.addExpr_return addExpr() throws RecognitionException {
        TinyHaxeTry1Parser.addExpr_return retval = new TinyHaxeTry1Parser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUS228=null;
        Token SUB229=null;
        TinyHaxeTry1Parser.multExpr_return multExpr227 = null;

        TinyHaxeTry1Parser.multExpr_return multExpr230 = null;


        Object PLUS228_tree=null;
        Object SUB229_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:273:19: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:273:21: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:273:21: ( multExpr )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:273:22: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2510);
            multExpr227=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr227.getTree());

            }

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:273:32: ( ( PLUS | SUB ) multExpr )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=PLUS && LA52_0<=SUB)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:273:33: ( PLUS | SUB ) multExpr
            	    {
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:273:33: ( PLUS | SUB )
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==PLUS) ) {
            	        alt51=1;
            	    }
            	    else if ( (LA51_0==SUB) ) {
            	        alt51=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 51, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:273:34: PLUS
            	            {
            	            PLUS228=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2515); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS228_tree = (Object)adaptor.create(PLUS228);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS228_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:273:42: SUB
            	            {
            	            SUB229=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2520); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB229_tree = (Object)adaptor.create(SUB229);
            	            root_0 = (Object)adaptor.becomeRoot(SUB229_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2524);
            	    multExpr230=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr230.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, addExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    /**
	 * The Class multExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class multExpr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:275:1: multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
    /**
	 * Mult expr.
	 * 
	 * @return the tiny haxe try1 parser.mult expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.multExpr_return multExpr() throws RecognitionException {
        TinyHaxeTry1Parser.multExpr_return retval = new TinyHaxeTry1Parser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token STAR232=null;
        Token SLASH233=null;
        Token PERCENT234=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr231 = null;

        TinyHaxeTry1Parser.prefixExpr_return prefixExpr235 = null;


        Object STAR232_tree=null;
        Object SLASH233_tree=null;
        Object PERCENT234_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:275:19: ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:275:21: ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:275:21: ( prefixExpr )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:275:22: prefixExpr
            {
            pushFollow(FOLLOW_prefixExpr_in_multExpr2546);
            prefixExpr231=prefixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr231.getTree());

            }

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:275:34: ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=STAR && LA54_0<=PERCENT)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:275:35: ( STAR | SLASH | PERCENT ) prefixExpr
            	    {
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:275:35: ( STAR | SLASH | PERCENT )
            	    int alt53=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt53=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt53=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt53=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 53, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt53) {
            	        case 1 :
            	            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:275:36: STAR
            	            {
            	            STAR232=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2551); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR232_tree = (Object)adaptor.create(STAR232);
            	            root_0 = (Object)adaptor.becomeRoot(STAR232_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:275:42: SLASH
            	            {
            	            SLASH233=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2554); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH233_tree = (Object)adaptor.create(SLASH233);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH233_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:275:49: PERCENT
            	            {
            	            PERCENT234=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2557); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT234_tree = (Object)adaptor.create(PERCENT234);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT234_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2561);
            	    prefixExpr235=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr235.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, multExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    /**
	 * The Class prefixExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class prefixExpr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:277:1: prefixExpr : ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr );
    /**
	 * Prefix expr.
	 * 
	 * @return the tiny haxe try1 parser.prefix expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.prefixExpr_return prefixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.prefixExpr_return retval = new TinyHaxeTry1Parser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set236=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr237 = null;

        TinyHaxeTry1Parser.newExpr_return newExpr238 = null;

        TinyHaxeTry1Parser.cast_return cast239 = null;

        TinyHaxeTry1Parser.suffixExpr_return suffixExpr240 = null;


        Object set236_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:277:19: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr )
            int alt55=4;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                int LA55_1 = input.LA(2);

                if ( (synpred101_TinyHaxeTry1()) ) {
                    alt55=1;
                }
                else if ( (true) ) {
                    alt55=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;
                }
                }
                break;
            case NEW:
                {
                alt55=2;
                }
                break;
            case CAST:
                {
                alt55=3;
                }
                break;
            case EOF:
            case SEMI:
            case IDENTIFIER:
            case COMMA:
            case QUES:
            case EQ:
            case PLUSEQ:
            case SUBEQ:
            case SLASHEQ:
            case PERCENTEQ:
            case AMPEQ:
            case FUNCTION:
            case LPAREN:
            case RPAREN:
            case LBRACKET:
            case RBRACKET:
            case COLON:
            case LT:
            case GT:
            case IN:
            case LBRACE:
            case RBRACE:
            case ELLIPSIS:
            case BARBAR:
            case AMPAMP:
            case EQEQ:
            case BANGEQ:
            case GTEQ:
            case LTEQ:
            case BAR:
            case AMP:
            case CARET:
            case LTLT:
            case GTGTGT:
            case PLUS:
            case STAR:
            case SLASH:
            case PERCENT:
            case NULL:
            case LONGLITERAL:
            case INTLITERAL:
            case STRINGLITERAL:
            case CHARLITERAL:
            case FLOATNUM:
            case TRUE:
            case FALSE:
                {
                alt55=4;
                }
                break;
            case SUBSUB:
                {
                int LA55_5 = input.LA(2);

                if ( (synpred101_TinyHaxeTry1()) ) {
                    alt55=1;
                }
                else if ( (true) ) {
                    alt55=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 5, input);

                    throw nvae;
                }
                }
                break;
            case SUB:
                {
                int LA55_6 = input.LA(2);

                if ( (synpred101_TinyHaxeTry1()) ) {
                    alt55=1;
                }
                else if ( (true) ) {
                    alt55=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 6, input);

                    throw nvae;
                }
                }
                break;
            case BANG:
            case TILDE:
                {
                alt55=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:277:21: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    set236=(Token)input.LT(1);
                    if ( input.LA(1)==BANG||input.LA(1)==SUB||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set236));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2591);
                    prefixExpr237=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr237.getTree());

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:278:25: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_prefixExpr2617);
                    newExpr238=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr238.getTree());

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:279:25: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cast_in_prefixExpr2643);
                    cast239=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast239.getTree());

                    }
                    break;
                case 4 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:280:25: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr2669);
                    suffixExpr240=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr240.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, prefixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixExpr"

    /**
	 * The Class suffixExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class suffixExpr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "suffixExpr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB ) | value typeParamOpt );
    /**
	 * Suffix expr.
	 * 
	 * @return the tiny haxe try1 parser.suffix expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.suffixExpr_return suffixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.suffixExpr_return retval = new TinyHaxeTry1Parser.suffixExpr_return();
        retval.start = input.LT(1);
        int suffixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN242=null;
        Token RPAREN244=null;
        Token LBRACKET246=null;
        Token RBRACKET248=null;
        Token PLUSPLUS250=null;
        Token SUBSUB252=null;
        TinyHaxeTry1Parser.value_return value241 = null;

        TinyHaxeTry1Parser.exprListOpt_return exprListOpt243 = null;

        TinyHaxeTry1Parser.value_return value245 = null;

        TinyHaxeTry1Parser.expr_return expr247 = null;

        TinyHaxeTry1Parser.value_return value249 = null;

        TinyHaxeTry1Parser.value_return value251 = null;

        TinyHaxeTry1Parser.value_return value253 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt254 = null;


        Object LPAREN242_tree=null;
        Object RPAREN244_tree=null;
        Object LBRACKET246_tree=null;
        Object RBRACKET248_tree=null;
        Object PLUSPLUS250_tree=null;
        Object SUBSUB252_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:284:2: ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB ) | value typeParamOpt )
            int alt56=5;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:284:4: value LPAREN exprListOpt RPAREN
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2688);
                    value241=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value241.getTree());
                    LPAREN242=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_suffixExpr2690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN242);

                    pushFollow(FOLLOW_exprListOpt_in_suffixExpr2692);
                    exprListOpt243=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt243.getTree());
                    RPAREN244=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_suffixExpr2694); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN244);



                    // AST REWRITE
                    // elements: exprListOpt, value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 284:36: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:284:39: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:284:99: ( exprListOpt )?
                        if ( stream_exprListOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprListOpt.nextTree());

                        }
                        stream_exprListOpt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:4: value LBRACKET expr RBRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2714);
                    value245=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value245.getTree());
                    LBRACKET246=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_suffixExpr2716); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACKET246_tree = (Object)adaptor.create(LBRACKET246);
                    adaptor.addChild(root_0, LBRACKET246_tree);
                    }
                    pushFollow(FOLLOW_expr_in_suffixExpr2718);
                    expr247=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr247.getTree());
                    RBRACKET248=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_suffixExpr2720); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACKET248_tree = (Object)adaptor.create(RBRACKET248);
                    adaptor.addChild(root_0, RBRACKET248_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:286:4: value PLUSPLUS
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2725);
                    value249=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value249.getTree());
                    PLUSPLUS250=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr2727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS250);



                    // AST REWRITE
                    // elements: value, PLUSPLUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 286:19: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:286:21: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());
                        adaptor.addChild(root_1, stream_PLUSPLUS.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:287:4: value SUBSUB
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2745);
                    value251=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value251.getTree());
                    SUBSUB252=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr2747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSUB.add(SUBSUB252);



                    // AST REWRITE
                    // elements: value, SUBSUB
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 287:17: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:287:20: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());
                        adaptor.addChild(root_1, stream_SUBSUB.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:288:4: value typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2766);
                    value253=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value253.getTree());
                    pushFollow(FOLLOW_typeParamOpt_in_suffixExpr2768);
                    typeParamOpt254=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt254.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, suffixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "suffixExpr"

    /**
	 * The Class value_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class value_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:291:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );
    /**
	 * Value.
	 * 
	 * @return the tiny haxe try1 parser.value_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.value_return value() throws RecognitionException {
        TinyHaxeTry1Parser.value_return retval = new TinyHaxeTry1Parser.value_return();
        retval.start = input.LT(1);
        int value_StartIndex = input.index();
        Object root_0 = null;

        Token NULL258=null;
        Token LPAREN260=null;
        Token RPAREN263=null;
        TinyHaxeTry1Parser.funcLit_return funcLit255 = null;

        TinyHaxeTry1Parser.arrayLit_return arrayLit256 = null;

        TinyHaxeTry1Parser.objLit_return objLit257 = null;

        TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol259 = null;

        TinyHaxeTry1Parser.expr_return expr261 = null;

        TinyHaxeTry1Parser.statement_return statement262 = null;

        TinyHaxeTry1Parser.dotIdent_return dotIdent264 = null;


        Object NULL258_tree=null;
        Object LPAREN260_tree=null;
        Object RPAREN263_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:291:7: ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | )
            int alt58=8;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:291:9: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcLit_in_value2777);
                    funcLit255=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit255.getTree());

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:292:4: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLit_in_value2783);
                    arrayLit256=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit256.getTree());

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:293:14: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objLit_in_value2798);
                    objLit257=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit257.getTree());

                    }
                    break;
                case 4 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:294:14: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL258=(Token)match(input,NULL,FOLLOW_NULL_in_value2813); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL258_tree = (Object)adaptor.create(NULL258);
                    adaptor.addChild(root_0, NULL258_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:14: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elementarySymbol_in_value2828);
                    elementarySymbol259=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol259.getTree());

                    }
                    break;
                case 6 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:296:14: LPAREN ( expr | statement ) RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN260=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value2843); if (state.failed) return retval;
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:296:22: ( expr | statement )
                    int alt57=2;
                    alt57 = dfa57.predict(input);
                    switch (alt57) {
                        case 1 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:296:23: expr
                            {
                            pushFollow(FOLLOW_expr_in_value2847);
                            expr261=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr261.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:296:28: statement
                            {
                            pushFollow(FOLLOW_statement_in_value2849);
                            statement262=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement262.getTree());

                            }
                            break;

                    }

                    RPAREN263=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value2852); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:297:11: dotIdent
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotIdent_in_value2865);
                    dotIdent264=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent264.getTree());

                    }
                    break;
                case 8 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:299:9: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, value_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "value"

    /**
	 * The Class newExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class newExpr_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpr"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW type ( exprListOpt )? ) ;
    /**
	 * New expr.
	 * 
	 * @return the tiny haxe try1 parser.new expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.newExpr_return newExpr() throws RecognitionException {
        TinyHaxeTry1Parser.newExpr_return retval = new TinyHaxeTry1Parser.newExpr_return();
        retval.start = input.LT(1);
        int newExpr_StartIndex = input.index();
        Object root_0 = null;

        Token NEW265=null;
        Token LPAREN267=null;
        Token RPAREN269=null;
        TinyHaxeTry1Parser.type_return type266 = null;

        TinyHaxeTry1Parser.exprListOpt_return exprListOpt268 = null;


        Object NEW265_tree=null;
        Object LPAREN267_tree=null;
        Object RPAREN269_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:19: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW type ( exprListOpt )? ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:21: NEW type LPAREN exprListOpt RPAREN
            {
            NEW265=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr2910); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW265);

            pushFollow(FOLLOW_type_in_newExpr2912);
            type266=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type266.getTree());
            LPAREN267=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr2914); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN267);

            pushFollow(FOLLOW_exprListOpt_in_newExpr2916);
            exprListOpt268=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt268.getTree());
            RPAREN269=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr2918); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN269);



            // AST REWRITE
            // elements: exprListOpt, type, NEW
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 301:56: -> ^( NEW type ( exprListOpt )? )
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:58: ^( NEW type ( exprListOpt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_NEW.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:69: ( exprListOpt )?
                if ( stream_exprListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprListOpt.nextTree());

                }
                stream_exprListOpt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, newExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newExpr"

    /**
	 * The Class cast_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class cast_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cast"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:303:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) );
    /**
	 * Cast.
	 * 
	 * @return the tiny haxe try1 parser.cast_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.cast_return cast() throws RecognitionException {
        TinyHaxeTry1Parser.cast_return retval = new TinyHaxeTry1Parser.cast_return();
        retval.start = input.LT(1);
        int cast_StartIndex = input.index();
        Object root_0 = null;

        Token CAST270=null;
        Token LPAREN271=null;
        Token COMMA273=null;
        Token RPAREN275=null;
        Token CAST276=null;
        Token LPAREN277=null;
        Token RPAREN279=null;
        TinyHaxeTry1Parser.expr_return expr272 = null;

        TinyHaxeTry1Parser.funcType_return funcType274 = null;

        TinyHaxeTry1Parser.expr_return expr278 = null;


        Object CAST270_tree=null;
        Object LPAREN271_tree=null;
        Object COMMA273_tree=null;
        Object RPAREN275_tree=null;
        Object CAST276_tree=null;
        Object LPAREN277_tree=null;
        Object RPAREN279_tree=null;
        RewriteRuleTokenStream stream_CAST=new RewriteRuleTokenStream(adaptor,"token CAST");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:303:9: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==CAST) ) {
                int LA60_1 = input.LA(2);

                if ( (synpred117_TinyHaxeTry1()) ) {
                    alt60=1;
                }
                else if ( (true) ) {
                    alt60=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:303:11: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST270=(Token)match(input,CAST,FOLLOW_CAST_in_cast2940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST270);

                    LPAREN271=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast2942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN271);

                    pushFollow(FOLLOW_expr_in_cast2944);
                    expr272=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr272.getTree());
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:303:28: ( COMMA funcType )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==COMMA) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:303:29: COMMA funcType
                            {
                            COMMA273=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast2947); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA273);

                            pushFollow(FOLLOW_funcType_in_cast2949);
                            funcType274=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType274.getTree());

                            }
                            break;

                    }

                    RPAREN275=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast2953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN275);



                    // AST REWRITE
                    // elements: funcType, CAST, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 303:53: -> ^( CAST expr ( funcType )? )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:303:56: ^( CAST expr ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:303:68: ( funcType )?
                        if ( stream_funcType.hasNext() ) {
                            adaptor.addChild(root_1, stream_funcType.nextTree());

                        }
                        stream_funcType.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:4: CAST LPAREN expr RPAREN
                    {
                    CAST276=(Token)match(input,CAST,FOLLOW_CAST_in_cast2969); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST276);

                    LPAREN277=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast2971); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN277);

                    pushFollow(FOLLOW_expr_in_cast2973);
                    expr278=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr278.getTree());
                    RPAREN279=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast2975); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN279);



                    // AST REWRITE
                    // elements: expr, CAST
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 304:28: -> ^( CAST expr )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:30: ^( CAST expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, cast_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cast"

    /**
	 * The Class topLevelDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class topLevelDecl_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevelDecl"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:308:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    /**
	 * Top level decl.
	 * 
	 * @return the tiny haxe try1 parser.top level decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelDecl_return retval = new TinyHaxeTry1Parser.topLevelDecl_return();
        retval.start = input.LT(1);
        int topLevelDecl_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.classDecl_return classDecl280 = null;

        TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl281 = null;

        TinyHaxeTry1Parser.enumDecl_return enumDecl282 = null;

        TinyHaxeTry1Parser.typedefDecl_return typedefDecl283 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:308:19: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt61=4;
            switch ( input.LA(1) ) {
            case EXTERN:
            case CLASS:
                {
                alt61=1;
                }
                break;
            case INTERFACE:
                {
                alt61=2;
                }
                break;
            case ENUM:
                {
                alt61=3;
                }
                break;
            case TYPEDEF:
                {
                alt61=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:308:21: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_topLevelDecl2998);
                    classDecl280=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl280.getTree());

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:309:25: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl3024);
                    interfaceDecl281=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl281.getTree());

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:310:25: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl3050);
                    enumDecl282=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl282.getTree());

                    }
                    break;
                case 4 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:311:25: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl3076);
                    typedefDecl283=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl283.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, topLevelDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"

    /**
	 * The Class enumDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class enumDecl_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDecl"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:313:1: enumDecl : ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM IDENTIFIER typeParamOpt enumBody ) ;
    /**
	 * Enum decl.
	 * 
	 * @return the tiny haxe try1 parser.enum decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.enumDecl_return enumDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumDecl_return retval = new TinyHaxeTry1Parser.enumDecl_return();
        retval.start = input.LT(1);
        int enumDecl_StartIndex = input.index();
        Object root_0 = null;

        Token ENUM284=null;
        Token IDENTIFIER285=null;
        Token LBRACE287=null;
        Token RBRACE289=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt286 = null;

        TinyHaxeTry1Parser.enumBody_return enumBody288 = null;


        Object ENUM284_tree=null;
        Object IDENTIFIER285_tree=null;
        Object LBRACE287_tree=null;
        Object RBRACE289_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:313:19: ( ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM IDENTIFIER typeParamOpt enumBody ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:313:21: ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
            {
            ENUM284=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl3094); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM284);

            IDENTIFIER285=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl3096); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER285);

            pushFollow(FOLLOW_typeParamOpt_in_enumDecl3098);
            typeParamOpt286=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt286.getTree());
            LBRACE287=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl3100); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE287);

            pushFollow(FOLLOW_enumBody_in_enumDecl3102);
            enumBody288=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody288.getTree());
            RBRACE289=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl3104); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE289);



            // AST REWRITE
            // elements: ENUM, IDENTIFIER, enumBody, typeParamOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 313:73: -> ^( ENUM IDENTIFIER typeParamOpt enumBody )
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:313:76: ^( ENUM IDENTIFIER typeParamOpt enumBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                adaptor.addChild(root_1, stream_typeParamOpt.nextTree());
                adaptor.addChild(root_1, stream_enumBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, enumDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumDecl"

    /**
	 * The Class enumBody_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class enumBody_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumBody"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:315:1: enumBody : ( enumValueDecl )+ ;
    /**
	 * Enum body.
	 * 
	 * @return the tiny haxe try1 parser.enum body_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.enumBody_return enumBody() throws RecognitionException {
        TinyHaxeTry1Parser.enumBody_return retval = new TinyHaxeTry1Parser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl290 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:315:19: ( ( enumValueDecl )+ )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:315:21: ( enumValueDecl )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:315:21: ( enumValueDecl )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==IDENTIFIER||LA62_0==PP_IF||(LA62_0>=PP_ELSEIF && LA62_0<=PP_ERROR)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:315:22: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody3135);
            	    enumValueDecl290=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValueDecl290.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBody"

    /**
	 * The Class enumValueDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class enumValueDecl_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValueDecl"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:318:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER SEMI | pp );
    /**
	 * Enum value decl.
	 * 
	 * @return the tiny haxe try1 parser.enum value decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumValueDecl_return retval = new TinyHaxeTry1Parser.enumValueDecl_return();
        retval.start = input.LT(1);
        int enumValueDecl_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER291=null;
        Token LPAREN292=null;
        Token RPAREN294=null;
        Token SEMI295=null;
        Token IDENTIFIER296=null;
        Token SEMI297=null;
        TinyHaxeTry1Parser.paramList_return paramList293 = null;

        TinyHaxeTry1Parser.pp_return pp298 = null;


        Object IDENTIFIER291_tree=null;
        Object LPAREN292_tree=null;
        Object RPAREN294_tree=null;
        Object SEMI295_tree=null;
        Object IDENTIFIER296_tree=null;
        Object SEMI297_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:319:2: ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER SEMI | pp )
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==IDENTIFIER) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==LPAREN) ) {
                    alt63=1;
                }
                else if ( (LA63_1==SEMI) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA63_0==PP_IF||(LA63_0>=PP_ELSEIF && LA63_0<=PP_ERROR)) ) {
                alt63=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:319:4: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER291=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3154); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER291_tree = (Object)adaptor.create(IDENTIFIER291);
                    adaptor.addChild(root_0, IDENTIFIER291_tree);
                    }
                    LPAREN292=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl3156); if (state.failed) return retval;
                    pushFollow(FOLLOW_paramList_in_enumValueDecl3159);
                    paramList293=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList293.getTree());
                    RPAREN294=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl3161); if (state.failed) return retval;
                    SEMI295=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3164); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:320:4: IDENTIFIER SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER296=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3171); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER296_tree = (Object)adaptor.create(IDENTIFIER296);
                    adaptor.addChild(root_0, IDENTIFIER296_tree);
                    }
                    SEMI297=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3173); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:321:4: pp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_enumValueDecl3180);
                    pp298=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp298.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, enumValueDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"

    /**
	 * The Class varDeclList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class varDeclList_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclList"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:324:1: varDeclList : varDecl varDeclList ;
    /**
	 * Var decl list.
	 * 
	 * @return the tiny haxe try1 parser.var decl list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.varDeclList_return varDeclList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclList_return retval = new TinyHaxeTry1Parser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl299 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList300 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:324:19: ( varDecl varDeclList )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:324:21: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDecl_in_varDeclList3197);
            varDecl299=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl299.getTree());
            pushFollow(FOLLOW_varDeclList_in_varDeclList3199);
            varDeclList300=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList300.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, varDeclList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclList"

    /**
	 * The Class varDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class varDecl_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDecl"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:327:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? varDeclPartList ) ;
    /**
	 * Var decl.
	 * 
	 * @return the tiny haxe try1 parser.var decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.varDecl_return varDecl() throws RecognitionException {
        TinyHaxeTry1Parser.varDecl_return retval = new TinyHaxeTry1Parser.varDecl_return();
        retval.start = input.LT(1);
        int varDecl_StartIndex = input.index();
        Object root_0 = null;

        Token VAR302=null;
        Token SEMI304=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList301 = null;

        TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList303 = null;


        Object VAR302_tree=null;
        Object SEMI304_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_varDeclPartList=new RewriteRuleSubtreeStream(adaptor,"rule varDeclPartList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:327:19: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? varDeclPartList ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:327:21: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:327:21: ( declAttrList )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=PUBLIC && LA64_0<=OVERRIDE)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:327:22: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl3221);
                    declAttrList301=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList301.getTree());

                    }
                    break;

            }

            VAR302=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl3225); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR302);

            pushFollow(FOLLOW_varDeclPartList_in_varDecl3227);
            varDeclPartList303=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList303.getTree());
            SEMI304=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl3229); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI304);



            // AST REWRITE
            // elements: declAttrList, VAR, varDeclPartList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 327:62: -> ^( VAR[$VAR] ( declAttrList )? varDeclPartList )
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:327:64: ^( VAR[$VAR] ( declAttrList )? varDeclPartList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, VAR302), root_1);

                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:327:92: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                adaptor.addChild(root_1, stream_varDeclPartList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, varDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDecl"

    /**
	 * The Class varDeclPartList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class varDeclPartList_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPartList"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:330:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
    /**
	 * Var decl part list.
	 * 
	 * @return the tiny haxe try1 parser.var decl part list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclPartList_return retval = new TinyHaxeTry1Parser.varDeclPartList_return();
        retval.start = input.LT(1);
        int varDeclPartList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA306=null;
        TinyHaxeTry1Parser.varDeclPart_return varDeclPart305 = null;

        TinyHaxeTry1Parser.varDeclPart_return varDeclPart307 = null;


        Object COMMA306_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:330:19: ( varDeclPart ( COMMA varDeclPart )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:330:21: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3257);
            varDeclPart305=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart305.getTree());
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:330:33: ( COMMA varDeclPart )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==COMMA) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:330:34: COMMA varDeclPart
            	    {
            	    COMMA306=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList3260); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3263);
            	    varDeclPart307=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart307.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, varDeclPartList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPartList"

    /**
	 * The Class varDeclPart_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class varDeclPart_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPart"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:332:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
    /**
	 * Var decl part.
	 * 
	 * @return the tiny haxe try1 parser.var decl part_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.varDeclPart_return varDeclPart() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclPart_return retval = new TinyHaxeTry1Parser.varDeclPart_return();
        retval.start = input.LT(1);
        int varDeclPart_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER308=null;
        TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt309 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt310 = null;

        TinyHaxeTry1Parser.varInit_return varInit311 = null;


        Object IDENTIFIER308_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:332:19: ( IDENTIFIER propDeclOpt typeTagOpt varInit )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:332:20: IDENTIFIER propDeclOpt typeTagOpt varInit
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER308=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart3279); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER308_tree = new VarUsage(IDENTIFIER308) ;
            adaptor.addChild(root_0, IDENTIFIER308_tree);
            }
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3284);
            propDeclOpt309=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt309.getTree());
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3286);
            typeTagOpt310=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt310.getTree());
            pushFollow(FOLLOW_varInit_in_varDeclPart3288);
            varInit311=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit311.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, varDeclPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPart"

    /**
	 * The Class propDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class propDecl_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDecl"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:335:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2) ;
    /**
	 * Prop decl.
	 * 
	 * @return the tiny haxe try1 parser.prop decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.propDecl_return propDecl() throws RecognitionException {
        TinyHaxeTry1Parser.propDecl_return retval = new TinyHaxeTry1Parser.propDecl_return();
        retval.start = input.LT(1);
        int propDecl_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN312=null;
        Token COMMA313=null;
        Token RPAREN314=null;
        TinyHaxeTry1Parser.propAccessor_return a1 = null;

        TinyHaxeTry1Parser.propAccessor_return a2 = null;


        Object LPAREN312_tree=null;
        Object COMMA313_tree=null;
        Object RPAREN314_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:335:9: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:335:11: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN312=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl3298); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN312);

            pushFollow(FOLLOW_propAccessor_in_propDecl3302);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            COMMA313=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl3304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA313);

            pushFollow(FOLLOW_propAccessor_in_propDecl3308);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            RPAREN314=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl3310); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN314);



            // AST REWRITE
            // elements: a1, a2
            // token labels: 
            // rule labels: retval, a1, a2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.tree:null);
            RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 335:63: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2)
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:335:66: ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(PROPERTY_DECL, "PROPERTY_DECL", true), root_1);

                adaptor.addChild(root_1, stream_a1.nextTree());
                adaptor.addChild(root_1, stream_a2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, propDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propDecl"

    /**
	 * The Class propAccessor_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class propAccessor_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propAccessor"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:338:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    /**
	 * Prop accessor.
	 * 
	 * @return the tiny haxe try1 parser.prop accessor_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.propAccessor_return propAccessor() throws RecognitionException {
        TinyHaxeTry1Parser.propAccessor_return retval = new TinyHaxeTry1Parser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set315=null;

        Object set315_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:339:2: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set315=(Token)input.LT(1);
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==DYNAMIC||input.LA(1)==DEFAULT||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set315));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, propAccessor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propAccessor"

    /**
	 * The Class propDeclOpt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class propDeclOpt_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDeclOpt"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:345:1: propDeclOpt : ( propDecl | );
    /**
	 * Prop decl opt.
	 * 
	 * @return the tiny haxe try1 parser.prop decl opt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        TinyHaxeTry1Parser.propDeclOpt_return retval = new TinyHaxeTry1Parser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.propDecl_return propDecl316 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:346:2: ( propDecl | )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==LPAREN) ) {
                alt66=1;
            }
            else if ( (LA66_0==EOF||LA66_0==SEMI||LA66_0==COMMA||LA66_0==EQ||LA66_0==RPAREN||LA66_0==COLON||LA66_0==LBRACE) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:346:4: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propDecl_in_propDeclOpt3368);
                    propDecl316=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl316.getTree());

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:348:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, propDeclOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propDeclOpt"

    /**
	 * The Class varInit_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class varInit_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInit"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:350:1: varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] expr ) | );
    /**
	 * Var init.
	 * 
	 * @return the tiny haxe try1 parser.var init_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.varInit_return varInit() throws RecognitionException {
        TinyHaxeTry1Parser.varInit_return retval = new TinyHaxeTry1Parser.varInit_return();
        retval.start = input.LT(1);
        int varInit_StartIndex = input.index();
        Object root_0 = null;

        Token EQ317=null;
        TinyHaxeTry1Parser.expr_return expr318 = null;


        Object EQ317_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:350:9: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] expr ) | )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==EQ) ) {
                alt67=1;
            }
            else if ( (LA67_0==EOF||LA67_0==SEMI||LA67_0==COMMA||LA67_0==RPAREN) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:350:11: EQ expr
                    {
                    EQ317=(Token)match(input,EQ,FOLLOW_EQ_in_varInit3383); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ317);

                    pushFollow(FOLLOW_expr_in_varInit3385);
                    expr318=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr318.getTree());


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 350:19: -> ^( VAR_INIT[\"VAR_INIT\",true] expr )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:350:21: ^( VAR_INIT[\"VAR_INIT\",true] expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(VAR_INIT, "VAR_INIT", true), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:352:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, varInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varInit"

    /**
	 * The Class funcDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class funcDecl_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcDecl"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:354:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? ) );
    /**
	 * Func decl.
	 * 
	 * @return the tiny haxe try1 parser.func decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.funcDecl_return funcDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcDecl_return retval = new TinyHaxeTry1Parser.funcDecl_return();
        retval.start = input.LT(1);
        int funcDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION320=null;
        Token NEW321=null;
        Token LPAREN322=null;
        Token RPAREN324=null;
        Token FUNCTION328=null;
        Token IDENTIFIER329=null;
        Token LPAREN331=null;
        Token RPAREN333=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList319 = null;

        TinyHaxeTry1Parser.paramList_return paramList323 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt325 = null;

        TinyHaxeTry1Parser.block_return block326 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList327 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt330 = null;

        TinyHaxeTry1Parser.paramList_return paramList332 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt334 = null;

        TinyHaxeTry1Parser.block_return block335 = null;


        Object FUNCTION320_tree=null;
        Object NEW321_tree=null;
        Object LPAREN322_tree=null;
        Object RPAREN324_tree=null;
        Object FUNCTION328_tree=null;
        Object IDENTIFIER329_tree=null;
        Object LPAREN331_tree=null;
        Object RPAREN333_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:354:9: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? ) )
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:354:11: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:354:11: ( declAttrList )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( ((LA68_0>=PUBLIC && LA68_0<=OVERRIDE)) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl3410);
                            declAttrList319=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList319.getTree());

                            }
                            break;

                    }

                    FUNCTION320=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION320);

                    NEW321=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl3415); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW321);

                    LPAREN322=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN322);

                    pushFollow(FOLLOW_paramList_in_funcDecl3419);
                    paramList323=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList323.getTree());
                    RPAREN324=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3421); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN324);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3423);
                    typeTagOpt325=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt325.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3425);
                    block326=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block326.getTree());


                    // AST REWRITE
                    // elements: block, paramList, declAttrList, FUNCTION, NEW, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 354:79: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:354:82: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:354:111: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:354:125: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:354:136: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:355:4: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:355:4: ( declAttrList )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( ((LA69_0>=PUBLIC && LA69_0<=OVERRIDE)) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl3453);
                            declAttrList327=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList327.getTree());

                            }
                            break;

                    }

                    FUNCTION328=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION328);

                    IDENTIFIER329=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl3458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER329);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl3460);
                    typeParamOpt330=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt330.getTree());
                    LPAREN331=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3462); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN331);

                    pushFollow(FOLLOW_paramList_in_funcDecl3464);
                    paramList332=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList332.getTree());
                    RPAREN333=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3466); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN333);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3468);
                    typeTagOpt334=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt334.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3470);
                    block335=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block335.getTree());


                    // AST REWRITE
                    // elements: block, typeTagOpt, FUNCTION, paramList, IDENTIFIER, typeParamOpt, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 355:92: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:355:94: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:355:130: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:355:144: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:355:155: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        adaptor.addChild(root_1, stream_block.nextTree());
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:355:173: ( typeParamOpt )?
                        if ( stream_typeParamOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                        }
                        stream_typeParamOpt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, funcDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcDecl"

    /**
	 * The Class funcProtoDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcProtoDecl"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:358:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );
    /**
	 * Func proto decl.
	 * 
	 * @return the tiny haxe try1 parser.func proto decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcProtoDecl_return retval = new TinyHaxeTry1Parser.funcProtoDecl_return();
        retval.start = input.LT(1);
        int funcProtoDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION337=null;
        Token NEW338=null;
        Token LPAREN339=null;
        Token RPAREN341=null;
        Token SEMI343=null;
        Token FUNCTION345=null;
        Token IDENTIFIER346=null;
        Token LPAREN348=null;
        Token RPAREN350=null;
        Token SEMI352=null;
        Token FUNCTION353=null;
        Token NEW354=null;
        Token LPAREN355=null;
        Token RPAREN357=null;
        Token SEMI359=null;
        Token FUNCTION360=null;
        Token IDENTIFIER361=null;
        Token LPAREN363=null;
        Token RPAREN365=null;
        Token SEMI367=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList336 = null;

        TinyHaxeTry1Parser.paramList_return paramList340 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt342 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList344 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt347 = null;

        TinyHaxeTry1Parser.paramList_return paramList349 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt351 = null;

        TinyHaxeTry1Parser.paramList_return paramList356 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt358 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt362 = null;

        TinyHaxeTry1Parser.paramList_return paramList364 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt366 = null;


        Object FUNCTION337_tree=null;
        Object NEW338_tree=null;
        Object LPAREN339_tree=null;
        Object RPAREN341_tree=null;
        Object SEMI343_tree=null;
        Object FUNCTION345_tree=null;
        Object IDENTIFIER346_tree=null;
        Object LPAREN348_tree=null;
        Object RPAREN350_tree=null;
        Object SEMI352_tree=null;
        Object FUNCTION353_tree=null;
        Object NEW354_tree=null;
        Object LPAREN355_tree=null;
        Object RPAREN357_tree=null;
        Object SEMI359_tree=null;
        Object FUNCTION360_tree=null;
        Object IDENTIFIER361_tree=null;
        Object LPAREN363_tree=null;
        Object RPAREN365_tree=null;
        Object SEMI367_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:359:2: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) )
            int alt71=4;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:359:4: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3506);
                    declAttrList336=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList336.getTree());
                    FUNCTION337=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3508); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION337);

                    NEW338=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW338);

                    LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN339);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3514);
                    paramList340=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList340.getTree());
                    RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN341);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3518);
                    typeTagOpt342=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt342.getTree());
                    SEMI343=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI343);



                    // AST REWRITE
                    // elements: paramList, FUNCTION, declAttrList, typeTagOpt, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 359:70: -> ^( FUNCTION NEW paramList typeTagOpt declAttrList )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:359:73: ^( FUNCTION NEW paramList typeTagOpt declAttrList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        adaptor.addChild(root_1, stream_paramList.nextTree());
                        adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                        adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:360:4: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3539);
                    declAttrList344=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList344.getTree());
                    FUNCTION345=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION345);

                    IDENTIFIER346=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3543); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER346);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3545);
                    typeParamOpt347=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt347.getTree());
                    LPAREN348=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN348);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3549);
                    paramList349=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList349.getTree());
                    RPAREN350=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3551); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN350);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3553);
                    typeTagOpt351=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt351.getTree());
                    SEMI352=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI352);



                    // AST REWRITE
                    // elements: declAttrList, typeParamOpt, typeTagOpt, paramList, FUNCTION, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 360:90: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:360:92: ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_1, stream_paramList.nextTree());
                        adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                        adaptor.addChild(root_1, stream_declAttrList.nextTree());
                        adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:361:4: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION353=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION353);

                    NEW354=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3577); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW354);

                    LPAREN355=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN355);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3581);
                    paramList356=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList356.getTree());
                    RPAREN357=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3583); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN357);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3585);
                    typeTagOpt358=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt358.getTree());
                    SEMI359=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3587); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI359);



                    // AST REWRITE
                    // elements: NEW, FUNCTION, typeTagOpt, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 361:57: -> ^( FUNCTION NEW paramList typeTagOpt )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:361:60: ^( FUNCTION NEW paramList typeTagOpt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        adaptor.addChild(root_1, stream_paramList.nextTree());
                        adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:362:4: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION360=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3604); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION360);

                    IDENTIFIER361=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER361);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3608);
                    typeParamOpt362=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt362.getTree());
                    LPAREN363=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN363);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3612);
                    paramList364=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList364.getTree());
                    RPAREN365=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN365);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3616);
                    typeTagOpt366=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt366.getTree());
                    SEMI367=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI367);



                    // AST REWRITE
                    // elements: paramList, typeParamOpt, typeTagOpt, FUNCTION, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 362:77: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:362:79: ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_1, stream_paramList.nextTree());
                        adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                        adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, funcProtoDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"

    /**
	 * The Class classDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class classDecl_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDecl"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:365:1: classDecl : ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBodyScope RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    /**
	 * Class decl.
	 * 
	 * @return the tiny haxe try1 parser.class decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.classDecl_return classDecl() throws RecognitionException {
        TinyHaxeTry1Parser.classDecl_return retval = new TinyHaxeTry1Parser.classDecl_return();
        retval.start = input.LT(1);
        int classDecl_StartIndex = input.index();
        Object root_0 = null;

        Token EXTERN368=null;
        Token CLASS369=null;
        Token IDENTIFIER370=null;
        Token LBRACE373=null;
        Token RBRACE375=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt371 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt372 = null;

        TinyHaxeTry1Parser.classBodyScope_return classBodyScope374 = null;


        Object EXTERN368_tree=null;
        Object CLASS369_tree=null;
        Object IDENTIFIER370_tree=null;
        Object LBRACE373_tree=null;
        Object RBRACE375_tree=null;
        RewriteRuleTokenStream stream_EXTERN=new RewriteRuleTokenStream(adaptor,"token EXTERN");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:2: ( ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBodyScope RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:4: ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBodyScope RBRACE
            {
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:4: ( EXTERN )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==EXTERN) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0: EXTERN
                    {
                    EXTERN368=(Token)match(input,EXTERN,FOLLOW_EXTERN_in_classDecl3643); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTERN.add(EXTERN368);


                    }
                    break;

            }

            CLASS369=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl3646); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS369);

            IDENTIFIER370=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl3648); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER370);

            pushFollow(FOLLOW_typeParamOpt_in_classDecl3650);
            typeParamOpt371=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt371.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_classDecl3652);
            inheritListOpt372=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt372.getTree());
            LBRACE373=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classDecl3654); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE373);

            pushFollow(FOLLOW_classBodyScope_in_classDecl3656);
            classBodyScope374=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope374.getTree());
            RBRACE375=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classDecl3658); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE375);



            // AST REWRITE
            // elements: IDENTIFIER, inheritListOpt, CLASS, classBodyScope, typeParamOpt, EXTERN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 366:86: -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:88: ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ClassNode(stream_CLASS.nextToken()), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:118: ( EXTERN )?
                if ( stream_EXTERN.hasNext() ) {
                    adaptor.addChild(root_1, stream_EXTERN.nextNode());

                }
                stream_EXTERN.reset();
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:126: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:140: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:156: ( classBodyScope )?
                if ( stream_classBodyScope.hasNext() ) {
                    adaptor.addChild(root_1, stream_classBodyScope.nextTree());

                }
                stream_classBodyScope.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, classDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDecl"

    /**
	 * The Class classBodyScope_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class classBodyScope_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBodyScope"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:369:1: classBodyScope : classBody -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( classBody )? ) ;
    /**
	 * Class body scope.
	 * 
	 * @return the tiny haxe try1 parser.class body scope_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.classBodyScope_return classBodyScope() throws RecognitionException {
        TinyHaxeTry1Parser.classBodyScope_return retval = new TinyHaxeTry1Parser.classBodyScope_return();
        retval.start = input.LT(1);
        int classBodyScope_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.classBody_return classBody376 = null;


        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:370:2: ( classBody -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( classBody )? ) )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:370:4: classBody
            {
            pushFollow(FOLLOW_classBody_in_classBodyScope3692);
            classBody376=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBody.add(classBody376.getTree());


            // AST REWRITE
            // elements: classBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 370:14: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( classBody )? )
            {
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:370:17: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( classBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true), root_1);

                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:370:67: ( classBody )?
                if ( stream_classBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_classBody.nextTree());

                }
                stream_classBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, classBodyScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBodyScope"

    /**
	 * The Class classBody_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class classBody_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:373:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );
    /**
	 * Class body.
	 * 
	 * @return the tiny haxe try1 parser.class body_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.classBody_return classBody() throws RecognitionException {
        TinyHaxeTry1Parser.classBody_return retval = new TinyHaxeTry1Parser.classBody_return();
        retval.start = input.LT(1);
        int classBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl377 = null;

        TinyHaxeTry1Parser.classBody_return classBody378 = null;

        TinyHaxeTry1Parser.funcDecl_return funcDecl379 = null;

        TinyHaxeTry1Parser.classBody_return classBody380 = null;

        TinyHaxeTry1Parser.pp_return pp381 = null;

        TinyHaxeTry1Parser.classBody_return classBody382 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:374:2: ( varDecl classBody | funcDecl classBody | pp classBody | )
            int alt73=4;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:374:4: varDecl classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_classBody3717);
                    varDecl377=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl377.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody3719);
                    classBody378=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody378.getTree());

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:375:4: funcDecl classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcDecl_in_classBody3724);
                    funcDecl379=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl379.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody3726);
                    classBody380=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody380.getTree());

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:376:4: pp classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_classBody3731);
                    pp381=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp381.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody3733);
                    classBody382=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody382.getTree());

                    }
                    break;
                case 4 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:378:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, classBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBody"

    /**
	 * The Class interfaceDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class interfaceDecl_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDecl"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:380:1: interfaceDecl : INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
    /**
	 * Interface decl.
	 * 
	 * @return the tiny haxe try1 parser.interface decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceDecl_return retval = new TinyHaxeTry1Parser.interfaceDecl_return();
        retval.start = input.LT(1);
        int interfaceDecl_StartIndex = input.index();
        Object root_0 = null;

        Token INTERFACE383=null;
        Token LBRACE386=null;
        Token RBRACE388=null;
        TinyHaxeTry1Parser.type_return type384 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt385 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody387 = null;


        Object INTERFACE383_tree=null;
        Object LBRACE386_tree=null;
        Object RBRACE388_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:381:2: ( INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:381:4: INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            INTERFACE383=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl3753); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE383_tree = (Object)adaptor.create(INTERFACE383);
            adaptor.addChild(root_0, INTERFACE383_tree);
            }
            pushFollow(FOLLOW_type_in_interfaceDecl3755);
            type384=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type384.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl3757);
            inheritListOpt385=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt385.getTree());
            LBRACE386=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl3759); if (state.failed) return retval;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl3762);
            interfaceBody387=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody387.getTree());
            RBRACE388=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl3764); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, interfaceDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceDecl"

    /**
	 * The Class interfaceBody_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class interfaceBody_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceBody"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:384:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );
    /**
	 * Interface body.
	 * 
	 * @return the tiny haxe try1 parser.interface body_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.interfaceBody_return interfaceBody() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceBody_return retval = new TinyHaxeTry1Parser.interfaceBody_return();
        retval.start = input.LT(1);
        int interfaceBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl389 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody390 = null;

        TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl391 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody392 = null;

        TinyHaxeTry1Parser.pp_return pp393 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody394 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:385:2: ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | )
            int alt74=4;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:385:4: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_interfaceBody3777);
                    varDecl389=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl389.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3779);
                    interfaceBody390=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody390.getTree());

                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:386:4: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody3784);
                    funcProtoDecl391=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl391.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3786);
                    interfaceBody392=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody392.getTree());

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:387:4: pp interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_interfaceBody3791);
                    pp393=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp393.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3793);
                    interfaceBody394=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody394.getTree());

                    }
                    break;
                case 4 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:389:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, interfaceBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceBody"

    /**
	 * The Class inheritList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class inheritList_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritList"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:391:1: inheritList : inherit ( COMMA inherit )* ;
    /**
	 * Inherit list.
	 * 
	 * @return the tiny haxe try1 parser.inherit list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.inheritList_return inheritList() throws RecognitionException {
        TinyHaxeTry1Parser.inheritList_return retval = new TinyHaxeTry1Parser.inheritList_return();
        retval.start = input.LT(1);
        int inheritList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA396=null;
        TinyHaxeTry1Parser.inherit_return inherit395 = null;

        TinyHaxeTry1Parser.inherit_return inherit397 = null;


        Object COMMA396_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:392:2: ( inherit ( COMMA inherit )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:392:4: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inherit_in_inheritList3814);
            inherit395=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit395.getTree());
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:392:12: ( COMMA inherit )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==COMMA) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:392:13: COMMA inherit
            	    {
            	    COMMA396=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList3817); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inherit_in_inheritList3820);
            	    inherit397=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit397.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, inheritList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritList"

    /**
	 * The Class inheritListOpt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class inheritListOpt_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritListOpt"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:395:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList ) | );
    /**
	 * Inherit list opt.
	 * 
	 * @return the tiny haxe try1 parser.inherit list opt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.inheritListOpt_return retval = new TinyHaxeTry1Parser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.inheritList_return inheritList398 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:396:2: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList ) | )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=EXTENDS && LA76_0<=IMPLEMENTS)) ) {
                alt76=1;
            }
            else if ( (LA76_0==LBRACE) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:396:4: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt3838);
                    inheritList398=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList398.getTree());


                    // AST REWRITE
                    // elements: inheritList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 396:16: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:396:18: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT", true), root_1);

                        adaptor.addChild(root_1, stream_inheritList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:398:6: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, inheritListOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritListOpt"

    /**
	 * The Class inherit_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class inherit_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inherit"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:400:1: inherit : ( EXTENDS type -> ^( EXTENDS type ) | IMPLEMENTS type -> ^( IMPLEMENTS type ) );
    /**
	 * Inherit.
	 * 
	 * @return the tiny haxe try1 parser.inherit_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.inherit_return inherit() throws RecognitionException {
        TinyHaxeTry1Parser.inherit_return retval = new TinyHaxeTry1Parser.inherit_return();
        retval.start = input.LT(1);
        int inherit_StartIndex = input.index();
        Object root_0 = null;

        Token EXTENDS399=null;
        Token IMPLEMENTS401=null;
        TinyHaxeTry1Parser.type_return type400 = null;

        TinyHaxeTry1Parser.type_return type402 = null;


        Object EXTENDS399_tree=null;
        Object IMPLEMENTS401_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:400:9: ( EXTENDS type -> ^( EXTENDS type ) | IMPLEMENTS type -> ^( IMPLEMENTS type ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==EXTENDS) ) {
                alt77=1;
            }
            else if ( (LA77_0==IMPLEMENTS) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:400:11: EXTENDS type
                    {
                    EXTENDS399=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit3872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS399);

                    pushFollow(FOLLOW_type_in_inherit3874);
                    type400=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type400.getTree());


                    // AST REWRITE
                    // elements: EXTENDS, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 400:24: -> ^( EXTENDS type )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:400:27: ^( EXTENDS type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EXTENDS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:401:11: IMPLEMENTS type
                    {
                    IMPLEMENTS401=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit3894); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS401);

                    pushFollow(FOLLOW_type_in_inherit3896);
                    type402=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type402.getTree());


                    // AST REWRITE
                    // elements: type, IMPLEMENTS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 401:27: -> ^( IMPLEMENTS type )
                    {
                        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:401:30: ^( IMPLEMENTS type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IMPLEMENTS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, inherit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inherit"

    /**
	 * The Class typedefDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class typedefDecl_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedefDecl"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:404:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    /**
	 * Typedef decl.
	 * 
	 * @return the tiny haxe try1 parser.typedef decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.typedefDecl_return typedefDecl() throws RecognitionException {
        TinyHaxeTry1Parser.typedefDecl_return retval = new TinyHaxeTry1Parser.typedefDecl_return();
        retval.start = input.LT(1);
        int typedefDecl_StartIndex = input.index();
        Object root_0 = null;

        Token TYPEDEF403=null;
        Token IDENTIFIER404=null;
        Token EQ405=null;
        TinyHaxeTry1Parser.funcType_return funcType406 = null;


        Object TYPEDEF403_tree=null;
        Object IDENTIFIER404_tree=null;
        Object EQ405_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:405:2: ( TYPEDEF IDENTIFIER EQ funcType )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:405:4: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            TYPEDEF403=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl3923); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF403_tree = (Object)adaptor.create(TYPEDEF403);
            adaptor.addChild(root_0, TYPEDEF403_tree);
            }
            IDENTIFIER404=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl3925); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER404_tree = (Object)adaptor.create(IDENTIFIER404);
            adaptor.addChild(root_0, IDENTIFIER404_tree);
            }
            EQ405=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl3927); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ405_tree = (Object)adaptor.create(EQ405);
            adaptor.addChild(root_0, EQ405_tree);
            }
            pushFollow(FOLLOW_funcType_in_typedefDecl3929);
            funcType406=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType406.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, typedefDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typedefDecl"

    /**
	 * The Class typeExtend_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class typeExtend_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeExtend"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:408:1: typeExtend : GT funcType COMMA ;
    /**
	 * Type extend.
	 * 
	 * @return the tiny haxe try1 parser.type extend_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.typeExtend_return typeExtend() throws RecognitionException {
        TinyHaxeTry1Parser.typeExtend_return retval = new TinyHaxeTry1Parser.typeExtend_return();
        retval.start = input.LT(1);
        int typeExtend_StartIndex = input.index();
        Object root_0 = null;

        Token GT407=null;
        Token COMMA409=null;
        TinyHaxeTry1Parser.funcType_return funcType408 = null;


        Object GT407_tree=null;
        Object COMMA409_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:409:9: ( GT funcType COMMA )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:409:11: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            GT407=(Token)match(input,GT,FOLLOW_GT_in_typeExtend3948); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT407_tree = (Object)adaptor.create(GT407);
            adaptor.addChild(root_0, GT407_tree);
            }
            pushFollow(FOLLOW_funcType_in_typeExtend3950);
            funcType408=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType408.getTree());
            COMMA409=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend3952); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, typeExtend_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeExtend"

    /**
	 * The Class anonType_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class anonType_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonType"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:412:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
    /**
	 * Anon type.
	 * 
	 * @return the tiny haxe try1 parser.anon type_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.anonType_return anonType() throws RecognitionException {
        TinyHaxeTry1Parser.anonType_return retval = new TinyHaxeTry1Parser.anonType_return();
        retval.start = input.LT(1);
        int anonType_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE410=null;
        Token RBRACE416=null;
        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList411 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList412 = null;

        TinyHaxeTry1Parser.typeExtend_return typeExtend413 = null;

        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList414 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList415 = null;


        Object LBRACE410_tree=null;
        Object RBRACE416_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:412:9: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:412:11: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            LBRACE410=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType3963); if (state.failed) return retval;
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:413:4: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt79=4;
            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt79=1;
                }
                break;
            case IDENTIFIER:
                {
                alt79=2;
                }
                break;
            case PUBLIC:
            case PRIVATE:
            case STATIC:
            case INLINE:
            case DYNAMIC:
            case OVERRIDE:
            case VAR:
                {
                alt79=3;
                }
                break;
            case GT:
                {
                alt79=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:414:22: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:414:27: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType3998);
                    anonTypeFieldList411=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList411.getTree());

                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:415:26: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType4026);
                    varDeclList412=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList412.getTree());

                    }
                    break;
                case 4 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:416:27: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType4055);
                    typeExtend413=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend413.getTree());
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:416:38: ( | anonTypeFieldList | varDeclList )
                    int alt78=3;
                    switch ( input.LA(1) ) {
                    case RBRACE:
                        {
                        alt78=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt78=2;
                        }
                        break;
                    case PUBLIC:
                    case PRIVATE:
                    case STATIC:
                    case INLINE:
                    case DYNAMIC:
                    case OVERRIDE:
                    case VAR:
                        {
                        alt78=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }

                    switch (alt78) {
                        case 1 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:417:24: 
                            {
                            }
                            break;
                        case 2 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:417:25: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType4083);
                            anonTypeFieldList414=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList414.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:418:25: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType4109);
                            varDeclList415=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList415.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE416=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType4153); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, anonType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonType"

    /**
	 * The Class anonTypeFieldList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeFieldList"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:423:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
    /**
	 * Anon type field list.
	 * 
	 * @return the tiny haxe try1 parser.anon type field list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeFieldList_return retval = new TinyHaxeTry1Parser.anonTypeFieldList_return();
        retval.start = input.LT(1);
        int anonTypeFieldList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA418=null;
        TinyHaxeTry1Parser.anonTypeField_return anonTypeField417 = null;

        TinyHaxeTry1Parser.anonTypeField_return anonTypeField419 = null;


        Object COMMA418_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:424:2: ( anonTypeField ( COMMA anonTypeField )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:424:4: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4167);
            anonTypeField417=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField417.getTree());
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:424:18: ( COMMA anonTypeField )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==COMMA) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:424:19: COMMA anonTypeField
            	    {
            	    COMMA418=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList4170); if (state.failed) return retval;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4173);
            	    anonTypeField419=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField419.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, anonTypeFieldList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonTypeFieldList"

    /**
	 * The Class objLit_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class objLit_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLit"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:427:1: objLit : '{' objLitElemList '}' ;
    /**
	 * Obj lit.
	 * 
	 * @return the tiny haxe try1 parser.obj lit_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.objLit_return objLit() throws RecognitionException {
        TinyHaxeTry1Parser.objLit_return retval = new TinyHaxeTry1Parser.objLit_return();
        retval.start = input.LT(1);
        int objLit_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal420=null;
        Token char_literal422=null;
        TinyHaxeTry1Parser.objLitElemList_return objLitElemList421 = null;


        Object char_literal420_tree=null;
        Object char_literal422_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:427:8: ( '{' objLitElemList '}' )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:427:10: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal420=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit4185); if (state.failed) return retval;
            pushFollow(FOLLOW_objLitElemList_in_objLit4188);
            objLitElemList421=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList421.getTree());
            char_literal422=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit4190); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, objLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLit"

    /**
	 * The Class anonTypeField_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class anonTypeField_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeField"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:430:1: anonTypeField : IDENTIFIER COLON funcType ;
    /**
	 * Anon type field.
	 * 
	 * @return the tiny haxe try1 parser.anon type field_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.anonTypeField_return anonTypeField() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeField_return retval = new TinyHaxeTry1Parser.anonTypeField_return();
        retval.start = input.LT(1);
        int anonTypeField_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER423=null;
        Token COLON424=null;
        TinyHaxeTry1Parser.funcType_return funcType425 = null;


        Object IDENTIFIER423_tree=null;
        Object COLON424_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:431:2: ( IDENTIFIER COLON funcType )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:431:4: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER423=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField4202); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER423_tree = (Object)adaptor.create(IDENTIFIER423);
            adaptor.addChild(root_0, IDENTIFIER423_tree);
            }
            COLON424=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField4204); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_anonTypeField4207);
            funcType425=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType425.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, anonTypeField_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonTypeField"

    /**
	 * The Class objLitElemList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class objLitElemList_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElemList"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:434:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
    /**
	 * Obj lit elem list.
	 * 
	 * @return the tiny haxe try1 parser.obj lit elem list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.objLitElemList_return objLitElemList() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElemList_return retval = new TinyHaxeTry1Parser.objLitElemList_return();
        retval.start = input.LT(1);
        int objLitElemList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA427=null;
        TinyHaxeTry1Parser.objLitElem_return objLitElem426 = null;

        TinyHaxeTry1Parser.objLitElem_return objLitElem428 = null;


        Object COMMA427_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:435:2: ( objLitElem ( COMMA objLitElem )* )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:435:4: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_objLitElem_in_objLitElemList4223);
            objLitElem426=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem426.getTree());
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:435:15: ( COMMA objLitElem )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==COMMA) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:435:16: COMMA objLitElem
            	    {
            	    COMMA427=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList4226); if (state.failed) return retval;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList4229);
            	    objLitElem428=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem428.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, objLitElemList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLitElemList"

    /**
	 * The Class objLitElem_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class objLitElem_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElem"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:438:1: objLitElem : IDENTIFIER COLON expr ;
    /**
	 * Obj lit elem.
	 * 
	 * @return the tiny haxe try1 parser.obj lit elem_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.objLitElem_return objLitElem() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElem_return retval = new TinyHaxeTry1Parser.objLitElem_return();
        retval.start = input.LT(1);
        int objLitElem_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER429=null;
        Token COLON430=null;
        TinyHaxeTry1Parser.expr_return expr431 = null;


        Object IDENTIFIER429_tree=null;
        Object COLON430_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:439:9: ( IDENTIFIER COLON expr )
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:439:11: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER429=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem4250); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER429_tree = (Object)adaptor.create(IDENTIFIER429);
            adaptor.addChild(root_0, IDENTIFIER429_tree);
            }
            COLON430=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem4252); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_objLitElem4255);
            expr431=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr431.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, objLitElem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLitElem"

    /**
	 * The Class elementarySymbol_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
    public static class elementarySymbol_return extends ParserRuleReturnScope {
        
        /** The tree. */
        Object tree;
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.RuleReturnScope#getTree()
         */
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementarySymbol"
    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:442:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    /**
	 * Elementary symbol.
	 * 
	 * @return the tiny haxe try1 parser.elementary symbol_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        TinyHaxeTry1Parser.elementarySymbol_return retval = new TinyHaxeTry1Parser.elementarySymbol_return();
        retval.start = input.LT(1);
        int elementarySymbol_StartIndex = input.index();
        Object root_0 = null;

        Token LONGLITERAL432=null;
        Token INTLITERAL433=null;
        Token STRINGLITERAL434=null;
        Token CHARLITERAL435=null;
        Token FLOATNUM436=null;
        Token TRUE437=null;
        Token FALSE438=null;

        Object LONGLITERAL432_tree=null;
        Object INTLITERAL433_tree=null;
        Object STRINGLITERAL434_tree=null;
        Object CHARLITERAL435_tree=null;
        Object FLOATNUM436_tree=null;
        Object TRUE437_tree=null;
        Object FALSE438_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:443:2: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt82=7;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt82=1;
                }
                break;
            case INTLITERAL:
                {
                alt82=2;
                }
                break;
            case STRINGLITERAL:
                {
                alt82=3;
                }
                break;
            case CHARLITERAL:
                {
                alt82=4;
                }
                break;
            case FLOATNUM:
                {
                alt82=5;
                }
                break;
            case TRUE:
                {
                alt82=6;
                }
                break;
            case FALSE:
                {
                alt82=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:443:4: LONGLITERAL
                    {
                    LONGLITERAL432=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol4267); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL432);



                    // AST REWRITE
                    // elements: LONGLITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 443:16: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(LONGLITERAL, LONGLITERAL432, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:444:4: INTLITERAL
                    {
                    INTLITERAL433=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol4280); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL433);



                    // AST REWRITE
                    // elements: INTLITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 444:15: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(INTLITERAL, INTLITERAL433, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:445:4: STRINGLITERAL
                    {
                    STRINGLITERAL434=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol4293); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL434);



                    // AST REWRITE
                    // elements: STRINGLITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 445:18: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(STRINGLITERAL, STRINGLITERAL434, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:446:4: CHARLITERAL
                    {
                    CHARLITERAL435=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol4306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL435);



                    // AST REWRITE
                    // elements: CHARLITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 446:16: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(CHARLITERAL, CHARLITERAL435, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:447:4: FLOATNUM
                    {
                    FLOATNUM436=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol4319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM436);



                    // AST REWRITE
                    // elements: FLOATNUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 447:13: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(FLOATNUM, FLOATNUM436, "FLOAT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:448:4: TRUE
                    {
                    TRUE437=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol4332); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE437);



                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 448:10: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(TRUE, TRUE437, "BOOL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:449:4: FALSE
                    {
                    FALSE438=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol4346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE438);



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 449:11: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(FALSE, FALSE438, "BOOL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, elementarySymbol_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred21_TinyHaxeTry1
    /**
	 * Synpred21_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred21_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:125:54: ( typeTagOpt )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:125:54: typeTagOpt
        {
        pushFollow(FOLLOW_typeTagOpt_in_synpred21_TinyHaxeTry1876);
        typeTagOpt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_TinyHaxeTry1

    // $ANTLR start synpred29_TinyHaxeTry1
    /**
	 * Synpred29_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred29_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:163:21: ( COMMA funcType )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:163:21: COMMA funcType
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred29_TinyHaxeTry11268); if (state.failed) return ;
        pushFollow(FOLLOW_funcType_in_synpred29_TinyHaxeTry11271);
        funcType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_TinyHaxeTry1

    // $ANTLR start synpred30_TinyHaxeTry1
    /**
	 * Synpred30_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred30_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:163:11: ( funcType ( COMMA funcType )* )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:163:11: funcType ( COMMA funcType )*
        {
        pushFollow(FOLLOW_funcType_in_synpred30_TinyHaxeTry11265);
        funcType();

        state._fsp--;
        if (state.failed) return ;
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:163:20: ( COMMA funcType )*
        loop84:
        do {
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==COMMA) ) {
                alt84=1;
            }


            switch (alt84) {
        	case 1 :
        	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:163:21: COMMA funcType
        	    {
        	    match(input,COMMA,FOLLOW_COMMA_in_synpred30_TinyHaxeTry11268); if (state.failed) return ;
        	    pushFollow(FOLLOW_funcType_in_synpred30_TinyHaxeTry11271);
        	    funcType();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop84;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred30_TinyHaxeTry1

    // $ANTLR start synpred31_TinyHaxeTry1
    /**
	 * Synpred31_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred31_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:20: ( COMMA typeConstraint )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:20: COMMA typeConstraint
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred31_TinyHaxeTry11282); if (state.failed) return ;
        pushFollow(FOLLOW_typeConstraint_in_synpred31_TinyHaxeTry11285);
        typeConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_TinyHaxeTry1

    // $ANTLR start synpred32_TinyHaxeTry1
    /**
	 * Synpred32_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred32_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:19: ( MINUS_BIGGER type )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:19: MINUS_BIGGER type
        {
        match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred32_TinyHaxeTry11304); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred32_TinyHaxeTry11307);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_TinyHaxeTry1

    // $ANTLR start synpred33_TinyHaxeTry1
    /**
	 * Synpred33_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred33_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:11: ( ( type ) ( MINUS_BIGGER type )* )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:11: ( type ) ( MINUS_BIGGER type )*
        {
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:11: ( type )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:12: type
        {
        pushFollow(FOLLOW_type_in_synpred33_TinyHaxeTry11300);
        type();

        state._fsp--;
        if (state.failed) return ;

        }

        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:18: ( MINUS_BIGGER type )*
        loop85:
        do {
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==MINUS_BIGGER) ) {
                alt85=1;
            }


            switch (alt85) {
        	case 1 :
        	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:19: MINUS_BIGGER type
        	    {
        	    match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred33_TinyHaxeTry11304); if (state.failed) return ;
        	    pushFollow(FOLLOW_type_in_synpred33_TinyHaxeTry11307);
        	    type();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop85;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred33_TinyHaxeTry1

    // $ANTLR start synpred40_TinyHaxeTry1
    /**
	 * Synpred40_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred40_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:65: ( typeParam )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:65: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred40_TinyHaxeTry11347);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_TinyHaxeTry1

    // $ANTLR start synpred41_TinyHaxeTry1
    /**
	 * Synpred41_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred41_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:8: ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )*
        {
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
        int alt86=7;
        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt86=1;
            }
            break;
        case IDENTIFIER:
            {
            alt86=2;
            }
            break;
        case INT:
            {
            alt86=3;
            }
            break;
        case FLOAT:
            {
            alt86=4;
            }
            break;
        case DYNAMIC:
            {
            alt86=5;
            }
            break;
        case BOOLEAN:
            {
            alt86=6;
            }
            break;
        case VOID:
            {
            alt86=7;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 86, 0, input);

            throw nvae;
        }

        switch (alt86) {
            case 1 :
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:9: anonType
                {
                pushFollow(FOLLOW_anonType_in_synpred41_TinyHaxeTry11326);
                anonType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:20: dotIdent
                {
                pushFollow(FOLLOW_dotIdent_in_synpred41_TinyHaxeTry11330);
                dotIdent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:30: INT
                {
                match(input,INT,FOLLOW_INT_in_synpred41_TinyHaxeTry11333); if (state.failed) return ;

                }
                break;
            case 4 :
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:35: FLOAT
                {
                match(input,FLOAT,FOLLOW_FLOAT_in_synpred41_TinyHaxeTry11336); if (state.failed) return ;

                }
                break;
            case 5 :
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:42: DYNAMIC
                {
                match(input,DYNAMIC,FOLLOW_DYNAMIC_in_synpred41_TinyHaxeTry11339); if (state.failed) return ;

                }
                break;
            case 6 :
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:50: BOOLEAN
                {
                match(input,BOOLEAN,FOLLOW_BOOLEAN_in_synpred41_TinyHaxeTry11341); if (state.failed) return ;

                }
                break;
            case 7 :
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:58: VOID
                {
                match(input,VOID,FOLLOW_VOID_in_synpred41_TinyHaxeTry11343); if (state.failed) return ;

                }
                break;

        }

        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:64: ( typeParam )*
        loop87:
        do {
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==LT) ) {
                alt87=1;
            }


            switch (alt87) {
        	case 1 :
        	    // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:65: typeParam
        	    {
        	    pushFollow(FOLLOW_typeParam_in_synpred41_TinyHaxeTry11347);
        	    typeParam();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop87;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred41_TinyHaxeTry1

    // $ANTLR start synpred42_TinyHaxeTry1
    /**
	 * Synpred42_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred42_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:9: ( type )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:9: type
        {
        pushFollow(FOLLOW_type_in_synpred42_TinyHaxeTry11369);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_TinyHaxeTry1

    // $ANTLR start synpred43_TinyHaxeTry1
    /**
	 * Synpred43_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred43_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:25: ( GT )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:25: GT
        {
        match(input,GT,FOLLOW_GT_in_synpred43_TinyHaxeTry11375); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_TinyHaxeTry1

    // $ANTLR start synpred44_TinyHaxeTry1
    /**
	 * Synpred44_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred44_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:29: ( GTGT )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:29: GTGT
        {
        match(input,GTGT,FOLLOW_GTGT_in_synpred44_TinyHaxeTry11378); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_TinyHaxeTry1

    // $ANTLR start synpred45_TinyHaxeTry1
    /**
	 * Synpred45_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred45_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:4: ( typeParam )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:4: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred45_TinyHaxeTry11401);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_TinyHaxeTry1

    // $ANTLR start synpred47_TinyHaxeTry1
    /**
	 * Synpred47_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred47_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:195:4: ( block )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:195:4: block
        {
        pushFollow(FOLLOW_block_in_synpred47_TinyHaxeTry11525);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_TinyHaxeTry1

    // $ANTLR start synpred48_TinyHaxeTry1
    /**
	 * Synpred48_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred48_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:196:4: ( assignExpr SEMI )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:196:4: assignExpr SEMI
        {
        pushFollow(FOLLOW_assignExpr_in_synpred48_TinyHaxeTry11530);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred48_TinyHaxeTry11532); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_TinyHaxeTry1

    // $ANTLR start synpred50_TinyHaxeTry1
    /**
	 * Synpred50_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred50_TinyHaxeTry1_fragment() throws RecognitionException {   
        TinyHaxeTry1Parser.statement_return st2 = null;


        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:198:36: ( ELSE st2= statement )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:198:36: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred50_TinyHaxeTry11552); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred50_TinyHaxeTry11556);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_TinyHaxeTry1

    // $ANTLR start synpred58_TinyHaxeTry1
    /**
	 * Synpred58_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred58_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:204:12: ( expr )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:204:12: expr
        {
        pushFollow(FOLLOW_expr_in_synpred58_TinyHaxeTry11742);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_TinyHaxeTry1

    // $ANTLR start synpred65_TinyHaxeTry1
    /**
	 * Synpred65_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred65_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:208:4: ( expr SEMI )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:208:4: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred65_TinyHaxeTry11818);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred65_TinyHaxeTry11821); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_TinyHaxeTry1

    // $ANTLR start synpred66_TinyHaxeTry1
    /**
	 * Synpred66_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred66_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:4: ( IDENTIFIER COLON statement )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:4: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred66_TinyHaxeTry11827); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred66_TinyHaxeTry11829); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred66_TinyHaxeTry11831);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_TinyHaxeTry1

    // $ANTLR start synpred69_TinyHaxeTry1
    /**
	 * Synpred69_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred69_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:222:4: ( varDecl )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:222:4: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred69_TinyHaxeTry11932);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_TinyHaxeTry1

    // $ANTLR start synpred73_TinyHaxeTry1
    /**
	 * Synpred73_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred73_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:246:21: ( exprList )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:246:21: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred73_TinyHaxeTry12144);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_TinyHaxeTry1

    // $ANTLR start synpred90_TinyHaxeTry1
    /**
	 * Synpred90_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred90_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:49: ( ( GT GT ) addExpr )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:49: ( GT GT ) addExpr
        {
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:49: ( GT GT )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:270:50: GT GT
        {
        match(input,GT,FOLLOW_GT_in_synpred90_TinyHaxeTry12473); if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred90_TinyHaxeTry12475); if (state.failed) return ;

        }

        pushFollow(FOLLOW_addExpr_in_synpred90_TinyHaxeTry12480);
        addExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred90_TinyHaxeTry1

    // $ANTLR start synpred101_TinyHaxeTry1
    /**
	 * Synpred101_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred101_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:277:21: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:277:21: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
        {
        if ( input.LA(1)==BANG||input.LA(1)==SUB||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_prefixExpr_in_synpred101_TinyHaxeTry12591);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_TinyHaxeTry1

    // $ANTLR start synpred104_TinyHaxeTry1
    /**
	 * Synpred104_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred104_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:284:4: ( value LPAREN exprListOpt RPAREN )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:284:4: value LPAREN exprListOpt RPAREN
        {
        pushFollow(FOLLOW_value_in_synpred104_TinyHaxeTry12688);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred104_TinyHaxeTry12690); if (state.failed) return ;
        pushFollow(FOLLOW_exprListOpt_in_synpred104_TinyHaxeTry12692);
        exprListOpt();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred104_TinyHaxeTry12694); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_TinyHaxeTry1

    // $ANTLR start synpred105_TinyHaxeTry1
    /**
	 * Synpred105_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred105_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:4: ( value LBRACKET expr RBRACKET )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:4: value LBRACKET expr RBRACKET
        {
        pushFollow(FOLLOW_value_in_synpred105_TinyHaxeTry12714);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred105_TinyHaxeTry12716); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred105_TinyHaxeTry12718);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred105_TinyHaxeTry12720); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_TinyHaxeTry1

    // $ANTLR start synpred106_TinyHaxeTry1
    /**
	 * Synpred106_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred106_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:286:4: ( value PLUSPLUS )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:286:4: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred106_TinyHaxeTry12725);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred106_TinyHaxeTry12727); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_TinyHaxeTry1

    // $ANTLR start synpred107_TinyHaxeTry1
    /**
	 * Synpred107_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred107_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:287:4: ( value SUBSUB )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:287:4: value SUBSUB
        {
        pushFollow(FOLLOW_value_in_synpred107_TinyHaxeTry12745);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred107_TinyHaxeTry12747); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred107_TinyHaxeTry1

    // $ANTLR start synpred109_TinyHaxeTry1
    /**
	 * Synpred109_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred109_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:292:4: ( arrayLit )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:292:4: arrayLit
        {
        pushFollow(FOLLOW_arrayLit_in_synpred109_TinyHaxeTry12783);
        arrayLit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_TinyHaxeTry1

    // $ANTLR start synpred113_TinyHaxeTry1
    /**
	 * Synpred113_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred113_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:296:23: ( expr )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:296:23: expr
        {
        pushFollow(FOLLOW_expr_in_synpred113_TinyHaxeTry12847);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_TinyHaxeTry1

    // $ANTLR start synpred114_TinyHaxeTry1
    /**
	 * Synpred114_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred114_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:296:14: ( LPAREN ( expr | statement ) RPAREN )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:296:14: LPAREN ( expr | statement ) RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred114_TinyHaxeTry12843); if (state.failed) return ;
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:296:22: ( expr | statement )
        int alt94=2;
        alt94 = dfa94.predict(input);
        switch (alt94) {
            case 1 :
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:296:23: expr
                {
                pushFollow(FOLLOW_expr_in_synpred114_TinyHaxeTry12847);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:296:28: statement
                {
                pushFollow(FOLLOW_statement_in_synpred114_TinyHaxeTry12849);
                statement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred114_TinyHaxeTry12852); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred114_TinyHaxeTry1

    // $ANTLR start synpred117_TinyHaxeTry1
    /**
	 * Synpred117_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
    public final void synpred117_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:303:11: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:303:11: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred117_TinyHaxeTry12940); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred117_TinyHaxeTry12942); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred117_TinyHaxeTry12944);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:303:28: ( COMMA funcType )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==COMMA) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:303:29: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred117_TinyHaxeTry12947); if (state.failed) return ;
                pushFollow(FOLLOW_funcType_in_synpred117_TinyHaxeTry12949);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred117_TinyHaxeTry12953); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred117_TinyHaxeTry1

    // Delegated rules

    /**
	 * Synpred104_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred104_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred73_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred73_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred47_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred47_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred66_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred66_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred48_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred48_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred40_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred40_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred30_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred30_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred29_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred29_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred45_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred45_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred43_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred43_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred101_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred101_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred31_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred31_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred69_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred69_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred113_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred113_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred44_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred44_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred117_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred117_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred105_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred105_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred50_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred50_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred21_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred21_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred41_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred41_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred107_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred107_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred107_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred114_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred114_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred90_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred90_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred65_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred65_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred32_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred32_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred106_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred106_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred58_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred58_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred42_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred42_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred109_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred109_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    
    /**
	 * Synpred33_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
    public final boolean synpred33_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    /** The dfa19. */
    protected DFA19 dfa19 = new DFA19(this);
    
    /** The dfa18. */
    protected DFA18 dfa18 = new DFA18(this);
    
    /** The dfa24. */
    protected DFA24 dfa24 = new DFA24(this);
    
    /** The dfa25. */
    protected DFA25 dfa25 = new DFA25(this);
    
    /** The dfa34. */
    protected DFA34 dfa34 = new DFA34(this);
    
    /** The dfa37. */
    protected DFA37 dfa37 = new DFA37(this);
    
    /** The dfa56. */
    protected DFA56 dfa56 = new DFA56(this);
    
    /** The dfa58. */
    protected DFA58 dfa58 = new DFA58(this);
    
    /** The dfa57. */
    protected DFA57 dfa57 = new DFA57(this);
    
    /** The dfa70. */
    protected DFA70 dfa70 = new DFA70(this);
    
    /** The dfa71. */
    protected DFA71 dfa71 = new DFA71(this);
    
    /** The dfa73. */
    protected DFA73 dfa73 = new DFA73(this);
    
    /** The dfa74. */
    protected DFA74 dfa74 = new DFA74(this);
    
    /** The dfa94. */
    protected DFA94 dfa94 = new DFA94(this);
    
    /** The Constant DFA19_eotS. */
    static final String DFA19_eotS =
        "\73\uffff";
    
    /** The Constant DFA19_eofS. */
    static final String DFA19_eofS =
        "\1\1\72\uffff";
    
    /** The Constant DFA19_minS. */
    static final String DFA19_minS =
        "\1\20\1\uffff\1\0\70\uffff";
    
    /** The Constant DFA19_maxS. */
    static final String DFA19_maxS =
        "\1\145\1\uffff\1\0\70\uffff";
    
    /** The Constant DFA19_acceptS. */
    static final String DFA19_acceptS =
        "\1\uffff\1\1\70\uffff\1\2";
    
    /** The Constant DFA19_specialS. */
    static final String DFA19_specialS =
        "\2\uffff\1\0\70\uffff}>";
    
    /** The Constant DFA19_transitionS. */
    static final String[] DFA19_transitionS = {
            "\1\1\1\2\1\uffff\1\1\4\uffff\1\1\1\uffff\10\1\1\uffff\2\1\1"+
            "\uffff\2\1\1\uffff\15\1\4\uffff\1\1\4\uffff\2\1\7\uffff\21\1"+
            "\5\uffff\1\1\1\uffff\6\1",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    /** The Constant DFA19_eot. */
    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    
    /** The Constant DFA19_eof. */
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    
    /** The Constant DFA19_min. */
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    
    /** The Constant DFA19_max. */
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    
    /** The Constant DFA19_accept. */
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    
    /** The Constant DFA19_special. */
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    
    /** The Constant DFA19_transition. */
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    /**
	 * The Class DFA19.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA19 extends DFA {

        /**
		 * Instantiates a new dF a19.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "163:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );";
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#specialStateTransition(int, org.antlr.runtime.IntStream)
         */
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_TinyHaxeTry1()) ) {s = 1;}

                        else if ( (true) ) {s = 58;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    
    /** The Constant DFA18_eotS. */
    static final String DFA18_eotS =
        "\65\uffff";
    
    /** The Constant DFA18_eofS. */
    static final String DFA18_eofS =
        "\1\1\64\uffff";
    
    /** The Constant DFA18_minS. */
    static final String DFA18_minS =
        "\1\20\4\uffff\1\0\57\uffff";
    
    /** The Constant DFA18_maxS. */
    static final String DFA18_maxS =
        "\1\145\4\uffff\1\0\57\uffff";
    
    /** The Constant DFA18_acceptS. */
    static final String DFA18_acceptS =
        "\1\uffff\1\2\62\uffff\1\1";
    
    /** The Constant DFA18_specialS. */
    static final String DFA18_specialS =
        "\5\uffff\1\0\57\uffff}>";
    
    /** The Constant DFA18_transitionS. */
    static final String[] DFA18_transitionS = {
            "\1\1\2\uffff\1\1\6\uffff\1\5\7\1\1\uffff\2\1\1\uffff\2\1\1"+
            "\uffff\6\1\4\uffff\3\1\4\uffff\1\1\4\uffff\2\1\7\uffff\21\1"+
            "\5\uffff\1\1\1\uffff\6\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    /** The Constant DFA18_eot. */
    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    
    /** The Constant DFA18_eof. */
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    
    /** The Constant DFA18_min. */
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    
    /** The Constant DFA18_max. */
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    
    /** The Constant DFA18_accept. */
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    
    /** The Constant DFA18_special. */
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    
    /** The Constant DFA18_transition. */
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    /**
	 * The Class DFA18.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA18 extends DFA {

        /**
		 * Instantiates a new dF a18.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "()* loopback of 164:19: ( COMMA typeConstraint )*";
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#specialStateTransition(int, org.antlr.runtime.IntStream)
         */
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    
    /** The Constant DFA24_eotS. */
    static final String DFA24_eotS =
        "\72\uffff";
    
    /** The Constant DFA24_eofS. */
    static final String DFA24_eofS =
        "\1\10\71\uffff";
    
    /** The Constant DFA24_minS. */
    static final String DFA24_minS =
        "\1\20\1\0\70\uffff";
    
    /** The Constant DFA24_maxS. */
    static final String DFA24_maxS =
        "\1\145\1\0\70\uffff";
    
    /** The Constant DFA24_acceptS. */
    static final String DFA24_acceptS =
        "\2\uffff\1\1\5\uffff\1\2\61\uffff";
    
    /** The Constant DFA24_specialS. */
    static final String DFA24_specialS =
        "\1\uffff\1\0\70\uffff}>";
    
    /** The Constant DFA24_transitionS. */
    static final String[] DFA24_transitionS = {
            "\1\10\1\2\1\uffff\1\10\4\uffff\1\2\1\uffff\10\10\1\uffff\2"+
            "\10\1\uffff\2\10\1\uffff\6\10\4\2\3\10\4\uffff\1\10\4\uffff"+
            "\1\1\1\10\7\uffff\21\10\5\uffff\1\10\1\uffff\6\10",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    /** The Constant DFA24_eot. */
    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    
    /** The Constant DFA24_eof. */
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    
    /** The Constant DFA24_min. */
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    
    /** The Constant DFA24_max. */
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    
    /** The Constant DFA24_accept. */
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    
    /** The Constant DFA24_special. */
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    
    /** The Constant DFA24_transition. */
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    /**
	 * The Class DFA24.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA24 extends DFA {

        /**
		 * Instantiates a new dF a24.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "171:1: type : ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | );";
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#specialStateTransition(int, org.antlr.runtime.IntStream)
         */
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 2;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    
    /** The Constant DFA25_eotS. */
    static final String DFA25_eotS =
        "\74\uffff";
    
    /** The Constant DFA25_eofS. */
    static final String DFA25_eofS =
        "\1\16\73\uffff";
    
    /** The Constant DFA25_minS. */
    static final String DFA25_minS =
        "\1\20\71\0\2\uffff";
    
    /** The Constant DFA25_maxS. */
    static final String DFA25_maxS =
        "\1\145\71\0\2\uffff";
    
    /** The Constant DFA25_acceptS. */
    static final String DFA25_acceptS =
        "\72\uffff\1\1\1\2";
    
    /** The Constant DFA25_specialS. */
    static final String DFA25_specialS =
        "\1\uffff\1\16\1\33\1\4\1\1\1\34\1\30\1\31\1\12\1\26\1\44\1\67\1"+
        "\52\1\61\1\27\1\46\1\20\1\43\1\0\1\3\1\11\1\22\1\42\1\55\1\62\1"+
        "\14\1\23\1\66\1\63\1\51\1\13\1\45\1\37\1\35\1\32\1\15\1\10\1\6\1"+
        "\47\1\2\1\21\1\40\1\24\1\50\1\54\1\36\1\41\1\17\1\70\1\53\1\7\1"+
        "\56\1\60\1\64\1\65\1\25\1\5\1\57\2\uffff}>";
    
    /** The Constant DFA25_transitionS. */
    static final String[] DFA25_transitionS = {
            "\1\17\1\2\1\uffff\1\20\4\uffff\1\5\1\uffff\1\14\1\60\1\13\1"+
            "\62\1\63\1\64\1\65\1\66\1\uffff\1\34\1\15\1\uffff\1\71\1\21"+
            "\1\uffff\1\22\1\23\1\24\1\25\1\70\1\12\1\7\1\3\1\4\1\6\1\37"+
            "\1\10\1\11\4\uffff\1\67\4\uffff\1\1\1\33\7\uffff\1\61\1\57\1"+
            "\56\1\52\1\53\1\54\1\55\1\47\1\50\1\51\1\45\1\46\1\43\1\44\1"+
            "\40\1\41\1\42\5\uffff\1\31\1\uffff\1\26\1\27\1\30\1\35\1\36"+
            "\1\32",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    /** The Constant DFA25_eot. */
    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    
    /** The Constant DFA25_eof. */
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    
    /** The Constant DFA25_min. */
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    
    /** The Constant DFA25_max. */
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    
    /** The Constant DFA25_accept. */
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    
    /** The Constant DFA25_special. */
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    
    /** The Constant DFA25_transition. */
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    /**
	 * The Class DFA25.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA25 extends DFA {

        /**
		 * Instantiates a new dF a25.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "176:8: ( type | typeList )";
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#specialStateTransition(int, org.antlr.runtime.IntStream)
         */
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_18 = input.LA(1);

                         
                        int index25_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_4 = input.LA(1);

                         
                        int index25_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_39 = input.LA(1);

                         
                        int index25_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_39);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_19 = input.LA(1);

                         
                        int index25_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_3 = input.LA(1);

                         
                        int index25_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_56 = input.LA(1);

                         
                        int index25_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_56);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA25_37 = input.LA(1);

                         
                        int index25_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_37);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA25_50 = input.LA(1);

                         
                        int index25_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_50);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA25_36 = input.LA(1);

                         
                        int index25_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_36);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA25_20 = input.LA(1);

                         
                        int index25_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_20);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA25_8 = input.LA(1);

                         
                        int index25_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_8);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA25_30 = input.LA(1);

                         
                        int index25_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_30);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA25_25 = input.LA(1);

                         
                        int index25_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_25);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA25_35 = input.LA(1);

                         
                        int index25_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_35);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA25_47 = input.LA(1);

                         
                        int index25_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_47);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA25_16 = input.LA(1);

                         
                        int index25_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_16);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA25_40 = input.LA(1);

                         
                        int index25_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_40);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA25_21 = input.LA(1);

                         
                        int index25_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_21);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA25_26 = input.LA(1);

                         
                        int index25_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_26);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA25_42 = input.LA(1);

                         
                        int index25_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_42);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA25_55 = input.LA(1);

                         
                        int index25_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_55);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA25_9 = input.LA(1);

                         
                        int index25_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_9);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA25_14 = input.LA(1);

                         
                        int index25_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_14);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA25_6 = input.LA(1);

                         
                        int index25_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_6);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA25_7 = input.LA(1);

                         
                        int index25_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_7);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA25_34 = input.LA(1);

                         
                        int index25_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_34);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_2);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA25_5 = input.LA(1);

                         
                        int index25_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_5);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA25_33 = input.LA(1);

                         
                        int index25_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_33);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA25_45 = input.LA(1);

                         
                        int index25_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_45);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA25_32 = input.LA(1);

                         
                        int index25_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA25_41 = input.LA(1);

                         
                        int index25_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_41);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA25_46 = input.LA(1);

                         
                        int index25_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_46);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA25_22 = input.LA(1);

                         
                        int index25_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_22);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA25_17 = input.LA(1);

                         
                        int index25_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_17);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA25_10 = input.LA(1);

                         
                        int index25_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_10);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA25_31 = input.LA(1);

                         
                        int index25_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_31);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA25_15 = input.LA(1);

                         
                        int index25_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_15);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA25_38 = input.LA(1);

                         
                        int index25_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_38);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA25_43 = input.LA(1);

                         
                        int index25_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_43);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA25_29 = input.LA(1);

                         
                        int index25_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_29);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA25_12 = input.LA(1);

                         
                        int index25_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_12);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA25_49 = input.LA(1);

                         
                        int index25_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_49);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA25_44 = input.LA(1);

                         
                        int index25_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_44);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA25_23 = input.LA(1);

                         
                        int index25_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_23);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA25_51 = input.LA(1);

                         
                        int index25_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_51);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA25_57 = input.LA(1);

                         
                        int index25_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_57);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA25_52 = input.LA(1);

                         
                        int index25_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_52);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA25_13 = input.LA(1);

                         
                        int index25_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_13);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA25_24 = input.LA(1);

                         
                        int index25_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_24);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA25_28 = input.LA(1);

                         
                        int index25_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_28);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA25_53 = input.LA(1);

                         
                        int index25_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_53);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA25_54 = input.LA(1);

                         
                        int index25_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_54);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA25_27 = input.LA(1);

                         
                        int index25_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_27);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA25_11 = input.LA(1);

                         
                        int index25_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_11);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA25_48 = input.LA(1);

                         
                        int index25_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 58;}

                        else if ( (true) ) {s = 59;}

                         
                        input.seek(index25_48);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    
    /** The Constant DFA34_eotS. */
    static final String DFA34_eotS =
        "\103\uffff";
    
    /** The Constant DFA34_eofS. */
    static final String DFA34_eofS =
        "\103\uffff";
    
    /** The Constant DFA34_minS. */
    static final String DFA34_minS =
        "\1\20\55\0\25\uffff";
    
    /** The Constant DFA34_maxS. */
    static final String DFA34_maxS =
        "\1\154\55\0\25\uffff";
    
    /** The Constant DFA34_acceptS. */
    static final String DFA34_acceptS =
        "\56\uffff\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\1\1\2\1\16\1\20\1\17";
    
    /** The Constant DFA34_specialS. */
    static final String DFA34_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\25\uffff}>";
    
    /** The Constant DFA34_transitionS. */
    static final String[] DFA34_transitionS = {
            "\1\2\1\21\2\uffff\6\56\1\uffff\1\46\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\6\1\20\1\uffff\1\7\2\uffff\1\31\12\uffff\1\24\1\33\1"+
            "\uffff\1\4\1\64\1\uffff\1\65\1\uffff\1\66\1\67\1\70\1\71\1\1"+
            "\1\uffff\1\72\1\73\1\74\1\75\3\uffff\1\47\1\45\1\44\1\40\1\41"+
            "\1\42\1\43\1\35\1\36\1\37\1\32\1\34\1\30\1\23\1\25\1\26\1\27"+
            "\1\22\1\3\1\31\1\10\1\5\1\uffff\1\56\6\uffff\1\11\1\12\1\13"+
            "\1\14\1\15\1\16\1\17",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    /** The Constant DFA34_eot. */
    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    
    /** The Constant DFA34_eof. */
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    
    /** The Constant DFA34_min. */
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    
    /** The Constant DFA34_max. */
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    
    /** The Constant DFA34_accept. */
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    
    /** The Constant DFA34_special. */
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    
    /** The Constant DFA34_transition. */
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    /**
	 * The Class DFA34.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA34 extends DFA {

        /**
		 * Instantiates a new dF a34.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "194:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO parExpression statement ) | TRY block catchStmtList -> ^( TRY block catchStmtList ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH expr ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI );";
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#specialStateTransition(int, org.antlr.runtime.IntStream)
         */
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_TinyHaxeTry1()) ) {s = 62;}

                        else if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_TinyHaxeTry1()) ) {s = 62;}

                        else if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (true) ) {s = 65;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_8 = input.LA(1);

                         
                        int index34_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA34_9 = input.LA(1);

                         
                        int index34_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA34_10 = input.LA(1);

                         
                        int index34_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA34_11 = input.LA(1);

                         
                        int index34_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA34_12 = input.LA(1);

                         
                        int index34_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA34_13 = input.LA(1);

                         
                        int index34_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA34_14 = input.LA(1);

                         
                        int index34_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA34_15 = input.LA(1);

                         
                        int index34_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA34_16 = input.LA(1);

                         
                        int index34_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA34_17 = input.LA(1);

                         
                        int index34_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred66_TinyHaxeTry1()) ) {s = 66;}

                         
                        input.seek(index34_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA34_18 = input.LA(1);

                         
                        int index34_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA34_19 = input.LA(1);

                         
                        int index34_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA34_20 = input.LA(1);

                         
                        int index34_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA34_21 = input.LA(1);

                         
                        int index34_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA34_22 = input.LA(1);

                         
                        int index34_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA34_23 = input.LA(1);

                         
                        int index34_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA34_24 = input.LA(1);

                         
                        int index34_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA34_25 = input.LA(1);

                         
                        int index34_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA34_26 = input.LA(1);

                         
                        int index34_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA34_27 = input.LA(1);

                         
                        int index34_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA34_28 = input.LA(1);

                         
                        int index34_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA34_29 = input.LA(1);

                         
                        int index34_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA34_30 = input.LA(1);

                         
                        int index34_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA34_31 = input.LA(1);

                         
                        int index34_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA34_32 = input.LA(1);

                         
                        int index34_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA34_33 = input.LA(1);

                         
                        int index34_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA34_34 = input.LA(1);

                         
                        int index34_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA34_35 = input.LA(1);

                         
                        int index34_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA34_36 = input.LA(1);

                         
                        int index34_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA34_37 = input.LA(1);

                         
                        int index34_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA34_38 = input.LA(1);

                         
                        int index34_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA34_39 = input.LA(1);

                         
                        int index34_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA34_40 = input.LA(1);

                         
                        int index34_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA34_41 = input.LA(1);

                         
                        int index34_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA34_42 = input.LA(1);

                         
                        int index34_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA34_43 = input.LA(1);

                         
                        int index34_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA34_44 = input.LA(1);

                         
                        int index34_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_44);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA34_45 = input.LA(1);

                         
                        int index34_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred65_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index34_45);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    
    /** The Constant DFA37_eotS. */
    static final String DFA37_eotS =
        "\101\uffff";
    
    /** The Constant DFA37_eofS. */
    static final String DFA37_eofS =
        "\101\uffff";
    
    /** The Constant DFA37_minS. */
    static final String DFA37_minS =
        "\1\20\6\0\72\uffff";
    
    /** The Constant DFA37_maxS. */
    static final String DFA37_maxS =
        "\1\154\6\0\72\uffff";
    
    /** The Constant DFA37_acceptS. */
    static final String DFA37_acceptS =
        "\7\uffff\1\2\1\uffff\1\3\66\uffff\1\1";
    
    /** The Constant DFA37_specialS. */
    static final String DFA37_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\72\uffff}>";
    
    /** The Constant DFA37_transitionS. */
    static final String[] DFA37_transitionS = {
            "\2\11\2\uffff\2\5\1\1\1\2\1\3\1\4\1\uffff\11\11\1\uffff\1\11"+
            "\2\uffff\1\11\12\uffff\2\11\1\uffff\2\11\1\uffff\1\11\1\uffff"+
            "\5\11\1\uffff\4\11\3\uffff\26\11\1\uffff\1\6\2\7\4\uffff\7\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    /** The Constant DFA37_eot. */
    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    
    /** The Constant DFA37_eof. */
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    
    /** The Constant DFA37_min. */
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    
    /** The Constant DFA37_max. */
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    
    /** The Constant DFA37_accept. */
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    
    /** The Constant DFA37_special. */
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    
    /** The Constant DFA37_transition. */
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    /**
	 * The Class DFA37.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA37 extends DFA {

        /**
		 * Instantiates a new dF a37.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "221:1: blockStmt : ( varDecl | classDecl | statement );";
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#specialStateTransition(int, org.antlr.runtime.IntStream)
         */
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_4 = input.LA(1);

                         
                        int index37_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index37_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_5 = input.LA(1);

                         
                        int index37_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index37_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_6 = input.LA(1);

                         
                        int index37_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index37_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    
    /** The Constant DFA56_eotS. */
    static final String DFA56_eotS =
        "\64\uffff";
    
    /** The Constant DFA56_eofS. */
    static final String DFA56_eofS =
        "\1\20\63\uffff";
    
    /** The Constant DFA56_minS. */
    static final String DFA56_minS =
        "\1\20\15\0\46\uffff";
    
    /** The Constant DFA56_maxS. */
    static final String DFA56_maxS =
        "\1\154\15\0\46\uffff";
    
    /** The Constant DFA56_acceptS. */
    static final String DFA56_acceptS =
        "\16\uffff\1\3\1\4\1\5\41\uffff\1\1\1\2";
    
    /** The Constant DFA56_specialS. */
    static final String DFA56_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\46\uffff}>";
    
    /** The Constant DFA56_transitionS. */
    static final String[] DFA56_transitionS = {
            "\1\20\1\15\10\uffff\10\20\1\1\1\14\1\20\1\2\1\20\6\uffff\1"+
            "\20\5\uffff\2\20\5\uffff\1\20\4\uffff\1\3\1\20\7\uffff\21\20"+
            "\1\17\1\16\1\uffff\1\4\11\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1"+
            "\13",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    /** The Constant DFA56_eot. */
    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    
    /** The Constant DFA56_eof. */
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    
    /** The Constant DFA56_min. */
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    
    /** The Constant DFA56_max. */
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    
    /** The Constant DFA56_accept. */
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    
    /** The Constant DFA56_special. */
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    
    /** The Constant DFA56_transition. */
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    /**
	 * The Class DFA56.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA56 extends DFA {

        /**
		 * Instantiates a new dF a56.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "283:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB ) | value typeParamOpt );";
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#specialStateTransition(int, org.antlr.runtime.IntStream)
         */
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred105_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred106_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred107_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred105_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred106_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred107_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_3 = input.LA(1);

                         
                        int index56_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred105_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred106_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred107_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index56_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA56_4 = input.LA(1);

                         
                        int index56_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred105_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred106_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred107_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index56_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA56_5 = input.LA(1);

                         
                        int index56_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred105_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred106_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred107_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index56_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA56_6 = input.LA(1);

                         
                        int index56_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred105_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred106_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred107_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index56_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA56_7 = input.LA(1);

                         
                        int index56_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred105_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred106_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred107_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index56_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA56_8 = input.LA(1);

                         
                        int index56_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred105_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred106_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred107_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index56_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA56_9 = input.LA(1);

                         
                        int index56_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred105_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred106_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred107_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index56_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA56_10 = input.LA(1);

                         
                        int index56_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred105_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred106_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred107_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index56_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA56_11 = input.LA(1);

                         
                        int index56_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred105_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred106_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred107_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index56_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA56_12 = input.LA(1);

                         
                        int index56_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred105_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred106_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred107_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index56_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA56_13 = input.LA(1);

                         
                        int index56_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred105_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred106_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred107_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index56_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    
    /** The Constant DFA58_eotS. */
    static final String DFA58_eotS =
        "\64\uffff";
    
    /** The Constant DFA58_eofS. */
    static final String DFA58_eofS =
        "\1\16\63\uffff";
    
    /** The Constant DFA58_minS. */
    static final String DFA58_minS =
        "\1\20\1\uffff\1\0\11\uffff\1\0\47\uffff";
    
    /** The Constant DFA58_maxS. */
    static final String DFA58_maxS =
        "\1\154\1\uffff\1\0\11\uffff\1\0\47\uffff";
    
    /** The Constant DFA58_acceptS. */
    static final String DFA58_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\7\uffff\1\7\1\10\43\uffff\1\2"+
        "\1\6";
    
    /** The Constant DFA58_specialS. */
    static final String DFA58_specialS =
        "\2\uffff\1\0\11\uffff\1\1\47\uffff}>";
    
    /** The Constant DFA58_transitionS. */
    static final String[] DFA58_transitionS = {
            "\1\16\1\15\10\uffff\10\16\1\1\1\14\1\16\1\2\1\16\6\uffff\1"+
            "\16\5\uffff\2\16\5\uffff\1\16\4\uffff\1\3\1\16\7\uffff\23\16"+
            "\1\uffff\1\4\11\uffff\7\5",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    /** The Constant DFA58_eot. */
    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    
    /** The Constant DFA58_eof. */
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    
    /** The Constant DFA58_min. */
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    
    /** The Constant DFA58_max. */
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    
    /** The Constant DFA58_accept. */
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    
    /** The Constant DFA58_special. */
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    
    /** The Constant DFA58_transition. */
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    /**
	 * The Class DFA58.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA58 extends DFA {

        /**
		 * Instantiates a new dF a58.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "291:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );";
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#specialStateTransition(int, org.antlr.runtime.IntStream)
         */
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index58_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_12 = input.LA(1);

                         
                        int index58_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index58_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    
    /** The Constant DFA57_eotS. */
    static final String DFA57_eotS =
        "\77\uffff";
    
    /** The Constant DFA57_eofS. */
    static final String DFA57_eofS =
        "\77\uffff";
    
    /** The Constant DFA57_minS. */
    static final String DFA57_minS =
        "\1\20\54\0\22\uffff";
    
    /** The Constant DFA57_maxS. */
    static final String DFA57_maxS =
        "\1\154\54\0\22\uffff";
    
    /** The Constant DFA57_acceptS. */
    static final String DFA57_acceptS =
        "\55\uffff\1\1\1\2\20\uffff";
    
    /** The Constant DFA57_specialS. */
    static final String DFA57_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\22\uffff}>";
    
    /** The Constant DFA57_transitionS. */
    static final String[] DFA57_transitionS = {
            "\1\56\1\20\2\uffff\6\56\1\uffff\1\45\1\47\1\50\1\51\1\52\1"+
            "\53\1\54\1\4\1\17\1\55\1\5\2\uffff\1\30\12\uffff\1\23\1\32\1"+
            "\uffff\1\2\1\56\1\uffff\1\56\1\uffff\4\56\1\6\1\uffff\4\56\3"+
            "\uffff\1\46\1\44\1\43\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31"+
            "\1\33\1\27\1\22\1\24\1\25\1\26\1\21\1\1\1\30\1\7\1\3\1\uffff"+
            "\1\56\6\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    /** The Constant DFA57_eot. */
    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    
    /** The Constant DFA57_eof. */
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    
    /** The Constant DFA57_min. */
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    
    /** The Constant DFA57_max. */
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    
    /** The Constant DFA57_accept. */
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    
    /** The Constant DFA57_special. */
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    
    /** The Constant DFA57_transition. */
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    /**
	 * The Class DFA57.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA57 extends DFA {

        /**
		 * Instantiates a new dF a57.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "296:22: ( expr | statement )";
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#specialStateTransition(int, org.antlr.runtime.IntStream)
         */
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_2 = input.LA(1);

                         
                        int index57_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_3 = input.LA(1);

                         
                        int index57_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA57_4 = input.LA(1);

                         
                        int index57_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA57_5 = input.LA(1);

                         
                        int index57_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA57_6 = input.LA(1);

                         
                        int index57_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA57_7 = input.LA(1);

                         
                        int index57_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA57_8 = input.LA(1);

                         
                        int index57_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA57_9 = input.LA(1);

                         
                        int index57_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA57_10 = input.LA(1);

                         
                        int index57_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA57_11 = input.LA(1);

                         
                        int index57_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA57_12 = input.LA(1);

                         
                        int index57_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA57_13 = input.LA(1);

                         
                        int index57_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA57_14 = input.LA(1);

                         
                        int index57_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA57_15 = input.LA(1);

                         
                        int index57_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA57_16 = input.LA(1);

                         
                        int index57_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA57_17 = input.LA(1);

                         
                        int index57_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA57_18 = input.LA(1);

                         
                        int index57_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA57_19 = input.LA(1);

                         
                        int index57_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA57_20 = input.LA(1);

                         
                        int index57_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA57_21 = input.LA(1);

                         
                        int index57_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA57_22 = input.LA(1);

                         
                        int index57_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA57_23 = input.LA(1);

                         
                        int index57_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA57_24 = input.LA(1);

                         
                        int index57_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA57_25 = input.LA(1);

                         
                        int index57_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA57_26 = input.LA(1);

                         
                        int index57_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA57_27 = input.LA(1);

                         
                        int index57_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA57_28 = input.LA(1);

                         
                        int index57_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA57_29 = input.LA(1);

                         
                        int index57_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA57_30 = input.LA(1);

                         
                        int index57_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA57_31 = input.LA(1);

                         
                        int index57_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA57_32 = input.LA(1);

                         
                        int index57_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA57_33 = input.LA(1);

                         
                        int index57_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA57_34 = input.LA(1);

                         
                        int index57_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA57_35 = input.LA(1);

                         
                        int index57_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA57_36 = input.LA(1);

                         
                        int index57_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA57_37 = input.LA(1);

                         
                        int index57_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA57_38 = input.LA(1);

                         
                        int index57_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA57_39 = input.LA(1);

                         
                        int index57_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA57_40 = input.LA(1);

                         
                        int index57_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA57_41 = input.LA(1);

                         
                        int index57_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA57_42 = input.LA(1);

                         
                        int index57_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA57_43 = input.LA(1);

                         
                        int index57_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA57_44 = input.LA(1);

                         
                        int index57_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index57_44);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    
    /** The Constant DFA70_eotS. */
    static final String DFA70_eotS =
        "\11\uffff";
    
    /** The Constant DFA70_eofS. */
    static final String DFA70_eofS =
        "\11\uffff";
    
    /** The Constant DFA70_minS. */
    static final String DFA70_minS =
        "\6\24\1\21\2\uffff";
    
    /** The Constant DFA70_maxS. */
    static final String DFA70_maxS =
        "\6\42\1\66\2\uffff";
    
    /** The Constant DFA70_acceptS. */
    static final String DFA70_acceptS =
        "\7\uffff\1\1\1\2";
    
    /** The Constant DFA70_specialS. */
    static final String DFA70_specialS =
        "\11\uffff}>";
    
    /** The Constant DFA70_transitionS. */
    static final String[] DFA70_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\1\10\44\uffff\1\7",
            "",
            ""
    };

    /** The Constant DFA70_eot. */
    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    
    /** The Constant DFA70_eof. */
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    
    /** The Constant DFA70_min. */
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    
    /** The Constant DFA70_max. */
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    
    /** The Constant DFA70_accept. */
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    
    /** The Constant DFA70_special. */
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    
    /** The Constant DFA70_transition. */
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    /**
	 * The Class DFA70.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA70 extends DFA {

        /**
		 * Instantiates a new dF a70.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "354:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? ) );";
        }
    }
    
    /** The Constant DFA71_eotS. */
    static final String DFA71_eotS =
        "\14\uffff";
    
    /** The Constant DFA71_eofS. */
    static final String DFA71_eofS =
        "\14\uffff";
    
    /** The Constant DFA71_minS. */
    static final String DFA71_minS =
        "\6\24\2\21\4\uffff";
    
    /** The Constant DFA71_maxS. */
    static final String DFA71_maxS =
        "\6\42\2\66\4\uffff";
    
    /** The Constant DFA71_acceptS. */
    static final String DFA71_acceptS =
        "\10\uffff\1\3\1\4\1\2\1\1";
    
    /** The Constant DFA71_specialS. */
    static final String DFA71_specialS =
        "\14\uffff}>";
    
    /** The Constant DFA71_transitionS. */
    static final String[] DFA71_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\1\11\44\uffff\1\10",
            "\1\12\44\uffff\1\13",
            "",
            "",
            "",
            ""
    };

    /** The Constant DFA71_eot. */
    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    
    /** The Constant DFA71_eof. */
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    
    /** The Constant DFA71_min. */
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    
    /** The Constant DFA71_max. */
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    
    /** The Constant DFA71_accept. */
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    
    /** The Constant DFA71_special. */
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    
    /** The Constant DFA71_transition. */
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    /**
	 * The Class DFA71.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA71 extends DFA {

        /**
		 * Instantiates a new dF a71.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "358:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );";
        }
    }
    
    /** The Constant DFA73_eotS. */
    static final String DFA73_eotS =
        "\12\uffff";
    
    /** The Constant DFA73_eofS. */
    static final String DFA73_eofS =
        "\1\11\11\uffff";
    
    /** The Constant DFA73_minS. */
    static final String DFA73_minS =
        "\6\24\4\uffff";
    
    /** The Constant DFA73_maxS. */
    static final String DFA73_maxS =
        "\6\137\4\uffff";
    
    /** The Constant DFA73_acceptS. */
    static final String DFA73_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    
    /** The Constant DFA73_specialS. */
    static final String DFA73_specialS =
        "\12\uffff}>";
    
    /** The Constant DFA73_transitionS. */
    static final String[] DFA73_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\4\uffff\1\10\1\uffff\4\10"+
            "\23\uffff\1\11\36\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    /** The Constant DFA73_eot. */
    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    
    /** The Constant DFA73_eof. */
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    
    /** The Constant DFA73_min. */
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    
    /** The Constant DFA73_max. */
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    
    /** The Constant DFA73_accept. */
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    
    /** The Constant DFA73_special. */
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    
    /** The Constant DFA73_transition. */
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    /**
	 * The Class DFA73.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA73 extends DFA {

        /**
		 * Instantiates a new dF a73.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "373:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );";
        }
    }
    
    /** The Constant DFA74_eotS. */
    static final String DFA74_eotS =
        "\12\uffff";
    
    /** The Constant DFA74_eofS. */
    static final String DFA74_eofS =
        "\1\11\11\uffff";
    
    /** The Constant DFA74_minS. */
    static final String DFA74_minS =
        "\6\24\4\uffff";
    
    /** The Constant DFA74_maxS. */
    static final String DFA74_maxS =
        "\6\137\4\uffff";
    
    /** The Constant DFA74_acceptS. */
    static final String DFA74_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    
    /** The Constant DFA74_specialS. */
    static final String DFA74_specialS =
        "\12\uffff}>";
    
    /** The Constant DFA74_transitionS. */
    static final String[] DFA74_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\4\uffff\1\10\1\uffff\4\10"+
            "\23\uffff\1\11\36\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    /** The Constant DFA74_eot. */
    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    
    /** The Constant DFA74_eof. */
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    
    /** The Constant DFA74_min. */
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    
    /** The Constant DFA74_max. */
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    
    /** The Constant DFA74_accept. */
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    
    /** The Constant DFA74_special. */
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    
    /** The Constant DFA74_transition. */
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    /**
	 * The Class DFA74.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA74 extends DFA {

        /**
		 * Instantiates a new dF a74.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "384:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );";
        }
    }
    
    /** The Constant DFA94_eotS. */
    static final String DFA94_eotS =
        "\77\uffff";
    
    /** The Constant DFA94_eofS. */
    static final String DFA94_eofS =
        "\77\uffff";
    
    /** The Constant DFA94_minS. */
    static final String DFA94_minS =
        "\1\20\54\0\22\uffff";
    
    /** The Constant DFA94_maxS. */
    static final String DFA94_maxS =
        "\1\154\54\0\22\uffff";
    
    /** The Constant DFA94_acceptS. */
    static final String DFA94_acceptS =
        "\55\uffff\1\1\1\2\20\uffff";
    
    /** The Constant DFA94_specialS. */
    static final String DFA94_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\22\uffff}>";
    
    /** The Constant DFA94_transitionS. */
    static final String[] DFA94_transitionS = {
            "\1\56\1\20\2\uffff\6\56\1\uffff\1\45\1\47\1\50\1\51\1\52\1"+
            "\53\1\54\1\4\1\17\1\55\1\5\2\uffff\1\30\12\uffff\1\23\1\32\1"+
            "\uffff\1\2\1\56\1\uffff\1\56\1\uffff\4\56\1\6\1\uffff\4\56\3"+
            "\uffff\1\46\1\44\1\43\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31"+
            "\1\33\1\27\1\22\1\24\1\25\1\26\1\21\1\1\1\30\1\7\1\3\1\uffff"+
            "\1\56\6\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    /** The Constant DFA94_eot. */
    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    
    /** The Constant DFA94_eof. */
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    
    /** The Constant DFA94_min. */
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    
    /** The Constant DFA94_max. */
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    
    /** The Constant DFA94_accept. */
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    
    /** The Constant DFA94_special. */
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    
    /** The Constant DFA94_transition. */
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    /**
	 * The Class DFA94.
	 * 
	 * @author Anatoly Kondratyev
	 */
    class DFA94 extends DFA {

        /**
		 * Instantiates a new dF a94.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#getDescription()
         */
        public String getDescription() {
            return "296:22: ( expr | statement )";
        }
        
        /* (non-Javadoc)
         * @see org.antlr.runtime.DFA#specialStateTransition(int, org.antlr.runtime.IntStream)
         */
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA94_1 = input.LA(1);

                         
                        int index94_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA94_2 = input.LA(1);

                         
                        int index94_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA94_3 = input.LA(1);

                         
                        int index94_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA94_4 = input.LA(1);

                         
                        int index94_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA94_5 = input.LA(1);

                         
                        int index94_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA94_6 = input.LA(1);

                         
                        int index94_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA94_7 = input.LA(1);

                         
                        int index94_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA94_8 = input.LA(1);

                         
                        int index94_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA94_9 = input.LA(1);

                         
                        int index94_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA94_10 = input.LA(1);

                         
                        int index94_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA94_11 = input.LA(1);

                         
                        int index94_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA94_12 = input.LA(1);

                         
                        int index94_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA94_13 = input.LA(1);

                         
                        int index94_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA94_14 = input.LA(1);

                         
                        int index94_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA94_15 = input.LA(1);

                         
                        int index94_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA94_16 = input.LA(1);

                         
                        int index94_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA94_17 = input.LA(1);

                         
                        int index94_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA94_18 = input.LA(1);

                         
                        int index94_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA94_19 = input.LA(1);

                         
                        int index94_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA94_20 = input.LA(1);

                         
                        int index94_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA94_21 = input.LA(1);

                         
                        int index94_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA94_22 = input.LA(1);

                         
                        int index94_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA94_23 = input.LA(1);

                         
                        int index94_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA94_24 = input.LA(1);

                         
                        int index94_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA94_25 = input.LA(1);

                         
                        int index94_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA94_26 = input.LA(1);

                         
                        int index94_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA94_27 = input.LA(1);

                         
                        int index94_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA94_28 = input.LA(1);

                         
                        int index94_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA94_29 = input.LA(1);

                         
                        int index94_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA94_30 = input.LA(1);

                         
                        int index94_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA94_31 = input.LA(1);

                         
                        int index94_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA94_32 = input.LA(1);

                         
                        int index94_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA94_33 = input.LA(1);

                         
                        int index94_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA94_34 = input.LA(1);

                         
                        int index94_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA94_35 = input.LA(1);

                         
                        int index94_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA94_36 = input.LA(1);

                         
                        int index94_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA94_37 = input.LA(1);

                         
                        int index94_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA94_38 = input.LA(1);

                         
                        int index94_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA94_39 = input.LA(1);

                         
                        int index94_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA94_40 = input.LA(1);

                         
                        int index94_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA94_41 = input.LA(1);

                         
                        int index94_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA94_42 = input.LA(1);

                         
                        int index94_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA94_43 = input.LA(1);

                         
                        int index94_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA94_44 = input.LA(1);

                         
                        int index94_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index94_44);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 94, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    /** The Constant FOLLOW_myPackage_in_module119. */
    public static final BitSet FOLLOW_myPackage_in_module119 = new BitSet(new long[]{0x00001E8000080000L,0x0000002740000000L});
    
    /** The Constant FOLLOW_topLevelList_in_module122. */
    public static final BitSet FOLLOW_topLevelList_in_module122 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_topLevel_in_topLevelList156. */
    public static final BitSet FOLLOW_topLevel_in_topLevelList156 = new BitSet(new long[]{0x00001E8000080002L,0x0000002740000000L});
    
    /** The Constant FOLLOW_myImport_in_topLevel175. */
    public static final BitSet FOLLOW_myImport_in_topLevel175 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_pp_in_topLevel201. */
    public static final BitSet FOLLOW_pp_in_topLevel201 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_topLevelDecl_in_topLevel227. */
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel227 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_PACKAGE_in_myPackage246. */
    public static final BitSet FOLLOW_PACKAGE_in_myPackage246 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_dotIdent_in_myPackage248. */
    public static final BitSet FOLLOW_dotIdent_in_myPackage248 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_myPackage250. */
    public static final BitSet FOLLOW_SEMI_in_myPackage250 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_qualifiedIdentifier281. */
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier281 = new BitSet(new long[]{0x0000000000040002L});
    
    /** The Constant FOLLOW_DOT_in_qualifiedIdentifier297. */
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier297 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_qualifiedIdentifier301. */
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier301 = new BitSet(new long[]{0x0000000000040002L});
    
    /** The Constant FOLLOW_IMPORT_in_myImport343. */
    public static final BitSet FOLLOW_IMPORT_in_myImport343 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_dotIdent_in_myImport346. */
    public static final BitSet FOLLOW_dotIdent_in_myImport346 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_myImport348. */
    public static final BitSet FOLLOW_SEMI_in_myImport348 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_set_in_access0. */
    public static final BitSet FOLLOW_set_in_access0 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_STATIC_in_declAttr435. */
    public static final BitSet FOLLOW_STATIC_in_declAttr435 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_INLINE_in_declAttr460. */
    public static final BitSet FOLLOW_INLINE_in_declAttr460 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_DYNAMIC_in_declAttr486. */
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr486 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_OVERRIDE_in_declAttr512. */
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr512 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_access_in_declAttr538. */
    public static final BitSet FOLLOW_access_in_declAttr538 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_declAttr_in_declAttrList553. */
    public static final BitSet FOLLOW_declAttr_in_declAttrList553 = new BitSet(new long[]{0x0000000003F00002L});
    
    /** The Constant FOLLOW_param_in_paramList594. */
    public static final BitSet FOLLOW_param_in_paramList594 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_COMMA_in_paramList597. */
    public static final BitSet FOLLOW_COMMA_in_paramList597 = new BitSet(new long[]{0x0000000008020000L});
    
    /** The Constant FOLLOW_param_in_paramList599. */
    public static final BitSet FOLLOW_param_in_paramList599 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_QUES_in_param638. */
    public static final BitSet FOLLOW_QUES_in_param638 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_param641. */
    public static final BitSet FOLLOW_IDENTIFIER_in_param641 = new BitSet(new long[]{0x0000200010000000L});
    
    /** The Constant FOLLOW_typeTagOpt_in_param643. */
    public static final BitSet FOLLOW_typeTagOpt_in_param643 = new BitSet(new long[]{0x0000000010000000L});
    
    /** The Constant FOLLOW_varInit_in_param645. */
    public static final BitSet FOLLOW_varInit_in_param645 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_id680. */
    public static final BitSet FOLLOW_IDENTIFIER_in_id680 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_id_in_dotIdent694. */
    public static final BitSet FOLLOW_id_in_dotIdent694 = new BitSet(new long[]{0x0000000000040002L});
    
    /** The Constant FOLLOW_DOT_in_dotIdent702. */
    public static final BitSet FOLLOW_DOT_in_dotIdent702 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_id_in_dotIdent706. */
    public static final BitSet FOLLOW_id_in_dotIdent706 = new BitSet(new long[]{0x0000000000040002L});
    
    /** The Constant FOLLOW_EQ_in_assignOp738. */
    public static final BitSet FOLLOW_EQ_in_assignOp738 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_PLUSEQ_in_assignOp758. */
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp758 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_SUBEQ_in_assignOp779. */
    public static final BitSet FOLLOW_SUBEQ_in_assignOp779 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_SLASHEQ_in_assignOp799. */
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp799 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_PERCENTEQ_in_assignOp812. */
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp812 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_AMPEQ_in_assignOp828. */
    public static final BitSet FOLLOW_AMPEQ_in_assignOp828 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_FUNCTION_in_funcLit868. */
    public static final BitSet FOLLOW_FUNCTION_in_funcLit868 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_funcLit870. */
    public static final BitSet FOLLOW_LPAREN_in_funcLit870 = new BitSet(new long[]{0x0000001008020000L});
    
    /** The Constant FOLLOW_paramList_in_funcLit872. */
    public static final BitSet FOLLOW_paramList_in_funcLit872 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_funcLit874. */
    public static final BitSet FOLLOW_RPAREN_in_funcLit874 = new BitSet(new long[]{0x8000200000010000L});
    
    /** The Constant FOLLOW_typeTagOpt_in_funcLit876. */
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit876 = new BitSet(new long[]{0x8000200000010000L});
    
    /** The Constant FOLLOW_block_in_funcLit879. */
    public static final BitSet FOLLOW_block_in_funcLit879 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_LBRACKET_in_arrayLit912. */
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit912 = new BitSet(new long[]{0x8048016C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_exprListOpt_in_arrayLit915. */
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit915 = new BitSet(new long[]{0x0000004000000000L});
    
    /** The Constant FOLLOW_RBRACKET_in_arrayLit917. */
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit917 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_ppIf_in_pp945. */
    public static final BitSet FOLLOW_ppIf_in_pp945 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_ppElseIf_in_pp971. */
    public static final BitSet FOLLOW_ppElseIf_in_pp971 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_ppElse_in_pp997. */
    public static final BitSet FOLLOW_ppElse_in_pp997 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_ppEnd_in_pp1023. */
    public static final BitSet FOLLOW_ppEnd_in_pp1023 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_ppError_in_pp1049. */
    public static final BitSet FOLLOW_ppError_in_pp1049 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_PP_IF_in_ppIf1071. */
    public static final BitSet FOLLOW_PP_IF_in_ppIf1071 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_ppIf1073. */
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1073 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_PP_IF_in_ppIf1099. */
    public static final BitSet FOLLOW_PP_IF_in_ppIf1099 = new BitSet(new long[]{0x0000010000000000L});
    
    /** The Constant FOLLOW_BANG_in_ppIf1101. */
    public static final BitSet FOLLOW_BANG_in_ppIf1101 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_ppIf1103. */
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1103 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_PP_ELSEIF_in_ppElseIf1121. */
    public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1121 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_ppElseIf1123. */
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1123 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_PP_ELSEIF_in_ppElseIf1148. */
    public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1148 = new BitSet(new long[]{0x0000010000000000L});
    
    /** The Constant FOLLOW_BANG_in_ppElseIf1150. */
    public static final BitSet FOLLOW_BANG_in_ppElseIf1150 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_ppElseIf1152. */
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1152 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_PP_ELSE_in_ppElse1172. */
    public static final BitSet FOLLOW_PP_ELSE_in_ppElse1172 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_PP_END_in_ppEnd1193. */
    public static final BitSet FOLLOW_PP_END_in_ppEnd1193 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_PP_ERROR_in_ppError1212. */
    public static final BitSet FOLLOW_PP_ERROR_in_ppError1212 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_COLON_in_typeTag1225. */
    public static final BitSet FOLLOW_COLON_in_typeTag1225 = new BitSet(new long[]{0x8007C00001020000L});
    
    /** The Constant FOLLOW_funcType_in_typeTag1228. */
    public static final BitSet FOLLOW_funcType_in_typeTag1228 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_typeTag_in_typeTagOpt1240. */
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt1240 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_funcType_in_typeList1265. */
    public static final BitSet FOLLOW_funcType_in_typeList1265 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_COMMA_in_typeList1268. */
    public static final BitSet FOLLOW_COMMA_in_typeList1268 = new BitSet(new long[]{0x8007C00001020000L});
    
    /** The Constant FOLLOW_funcType_in_typeList1271. */
    public static final BitSet FOLLOW_funcType_in_typeList1271 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_typeConstraint_in_typeList1279. */
    public static final BitSet FOLLOW_typeConstraint_in_typeList1279 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_COMMA_in_typeList1282. */
    public static final BitSet FOLLOW_COMMA_in_typeList1282 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_typeConstraint_in_typeList1285. */
    public static final BitSet FOLLOW_typeConstraint_in_typeList1285 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_type_in_funcType1300. */
    public static final BitSet FOLLOW_type_in_funcType1300 = new BitSet(new long[]{0x0000400000000002L});
    
    /** The Constant FOLLOW_MINUS_BIGGER_in_funcType1304. */
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1304 = new BitSet(new long[]{0x8007C00001020000L});
    
    /** The Constant FOLLOW_type_in_funcType1307. */
    public static final BitSet FOLLOW_type_in_funcType1307 = new BitSet(new long[]{0x0000400000000002L});
    
    /** The Constant FOLLOW_VOID_in_funcType1314. */
    public static final BitSet FOLLOW_VOID_in_funcType1314 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_anonType_in_type1326. */
    public static final BitSet FOLLOW_anonType_in_type1326 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_dotIdent_in_type1330. */
    public static final BitSet FOLLOW_dotIdent_in_type1330 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_INT_in_type1333. */
    public static final BitSet FOLLOW_INT_in_type1333 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_FLOAT_in_type1336. */
    public static final BitSet FOLLOW_FLOAT_in_type1336 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_DYNAMIC_in_type1339. */
    public static final BitSet FOLLOW_DYNAMIC_in_type1339 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_BOOLEAN_in_type1341. */
    public static final BitSet FOLLOW_BOOLEAN_in_type1341 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_VOID_in_type1343. */
    public static final BitSet FOLLOW_VOID_in_type1343 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_typeParam_in_type1347. */
    public static final BitSet FOLLOW_typeParam_in_type1347 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_LT_in_typeParam1365. */
    public static final BitSet FOLLOW_LT_in_typeParam1365 = new BitSet(new long[]{0x8037C00001020000L});
    
    /** The Constant FOLLOW_type_in_typeParam1369. */
    public static final BitSet FOLLOW_type_in_typeParam1369 = new BitSet(new long[]{0x0030000000000002L});
    
    /** The Constant FOLLOW_typeList_in_typeParam1371. */
    public static final BitSet FOLLOW_typeList_in_typeParam1371 = new BitSet(new long[]{0x0030000000000002L});
    
    /** The Constant FOLLOW_GT_in_typeParam1375. */
    public static final BitSet FOLLOW_GT_in_typeParam1375 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_GTGT_in_typeParam1378. */
    public static final BitSet FOLLOW_GTGT_in_typeParam1378 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_typeParam_in_typeParamOpt1401. */
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1401 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_typeConstraint1442. */
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1442 = new BitSet(new long[]{0x0000200000000000L});
    
    /** The Constant FOLLOW_COLON_in_typeConstraint1444. */
    public static final BitSet FOLLOW_COLON_in_typeConstraint1444 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_typeConstraint1446. */
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1446 = new BitSet(new long[]{0x8037C00001020000L});
    
    /** The Constant FOLLOW_typeList_in_typeConstraint1448. */
    public static final BitSet FOLLOW_typeList_in_typeConstraint1448 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_typeConstraint1450. */
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1450 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_declAttrList_in_functionReturn1474. */
    public static final BitSet FOLLOW_declAttrList_in_functionReturn1474 = new BitSet(new long[]{0x0000000400000000L});
    
    /** The Constant FOLLOW_FUNCTION_in_functionReturn1477. */
    public static final BitSet FOLLOW_FUNCTION_in_functionReturn1477 = new BitSet(new long[]{0x0040000000000000L});
    
    /** The Constant FOLLOW_NEW_in_functionReturn1479. */
    public static final BitSet FOLLOW_NEW_in_functionReturn1479 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_functionReturn1481. */
    public static final BitSet FOLLOW_LPAREN_in_functionReturn1481 = new BitSet(new long[]{0x0000001008020000L});
    
    /** The Constant FOLLOW_paramList_in_functionReturn1483. */
    public static final BitSet FOLLOW_paramList_in_functionReturn1483 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_functionReturn1485. */
    public static final BitSet FOLLOW_RPAREN_in_functionReturn1485 = new BitSet(new long[]{0x8000200000010000L});
    
    /** The Constant FOLLOW_typeTagOpt_in_functionReturn1487. */
    public static final BitSet FOLLOW_typeTagOpt_in_functionReturn1487 = new BitSet(new long[]{0x8000200000010000L});
    
    /** The Constant FOLLOW_block_in_functionReturn1489. */
    public static final BitSet FOLLOW_block_in_functionReturn1489 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_block_in_statement1525. */
    public static final BitSet FOLLOW_block_in_statement1525 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_assignExpr_in_statement1530. */
    public static final BitSet FOLLOW_assignExpr_in_statement1530 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_statement1532. */
    public static final BitSet FOLLOW_SEMI_in_statement1532 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_varDecl_in_statement1538. */
    public static final BitSet FOLLOW_varDecl_in_statement1538 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_IF_in_statement1543. */
    public static final BitSet FOLLOW_IF_in_statement1543 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_parExpression_in_statement1545. */
    public static final BitSet FOLLOW_parExpression_in_statement1545 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC0BE20001EL});
    
    /** The Constant FOLLOW_statement_in_statement1549. */
    public static final BitSet FOLLOW_statement_in_statement1549 = new BitSet(new long[]{0x0100000000000002L});
    
    /** The Constant FOLLOW_ELSE_in_statement1552. */
    public static final BitSet FOLLOW_ELSE_in_statement1552 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC0BE20001EL});
    
    /** The Constant FOLLOW_statement_in_statement1556. */
    public static final BitSet FOLLOW_statement_in_statement1556 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_FOR_in_statement1595. */
    public static final BitSet FOLLOW_FOR_in_statement1595 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_statement1597. */
    public static final BitSet FOLLOW_LPAREN_in_statement1597 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_statement1601. */
    public static final BitSet FOLLOW_expr_in_statement1601 = new BitSet(new long[]{0x0400000000000000L});
    
    /** The Constant FOLLOW_IN_in_statement1603. */
    public static final BitSet FOLLOW_IN_in_statement1603 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_statement1607. */
    public static final BitSet FOLLOW_expr_in_statement1607 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_statement1609. */
    public static final BitSet FOLLOW_RPAREN_in_statement1609 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC0BE20001EL});
    
    /** The Constant FOLLOW_statement_in_statement1611. */
    public static final BitSet FOLLOW_statement_in_statement1611 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_WHILE_in_statement1637. */
    public static final BitSet FOLLOW_WHILE_in_statement1637 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_parExpression_in_statement1639. */
    public static final BitSet FOLLOW_parExpression_in_statement1639 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC0BE20001EL});
    
    /** The Constant FOLLOW_statement_in_statement1641. */
    public static final BitSet FOLLOW_statement_in_statement1641 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_DO_in_statement1659. */
    public static final BitSet FOLLOW_DO_in_statement1659 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC0BE20001EL});
    
    /** The Constant FOLLOW_statement_in_statement1661. */
    public static final BitSet FOLLOW_statement_in_statement1661 = new BitSet(new long[]{0x0800000000000000L});
    
    /** The Constant FOLLOW_WHILE_in_statement1663. */
    public static final BitSet FOLLOW_WHILE_in_statement1663 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_parExpression_in_statement1665. */
    public static final BitSet FOLLOW_parExpression_in_statement1665 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_statement1667. */
    public static final BitSet FOLLOW_SEMI_in_statement1667 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_TRY_in_statement1685. */
    public static final BitSet FOLLOW_TRY_in_statement1685 = new BitSet(new long[]{0x8000200000010000L});
    
    /** The Constant FOLLOW_block_in_statement1687. */
    public static final BitSet FOLLOW_block_in_statement1687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    
    /** The Constant FOLLOW_catchStmtList_in_statement1689. */
    public static final BitSet FOLLOW_catchStmtList_in_statement1689 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_SWITCH_in_statement1707. */
    public static final BitSet FOLLOW_SWITCH_in_statement1707 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_statement1709. */
    public static final BitSet FOLLOW_LPAREN_in_statement1709 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_statement1711. */
    public static final BitSet FOLLOW_expr_in_statement1711 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_statement1713. */
    public static final BitSet FOLLOW_RPAREN_in_statement1713 = new BitSet(new long[]{0x8000000000000000L});
    
    /** The Constant FOLLOW_LBRACE_in_statement1715. */
    public static final BitSet FOLLOW_LBRACE_in_statement1715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    
    /** The Constant FOLLOW_caseStmt_in_statement1717. */
    public static final BitSet FOLLOW_caseStmt_in_statement1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000061L});
    
    /** The Constant FOLLOW_RBRACE_in_statement1720. */
    public static final BitSet FOLLOW_RBRACE_in_statement1720 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_RETURN_in_statement1739. */
    public static final BitSet FOLLOW_RETURN_in_statement1739 = new BitSet(new long[]{0x8048012C00030000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_statement1742. */
    public static final BitSet FOLLOW_expr_in_statement1742 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_statement1746. */
    public static final BitSet FOLLOW_SEMI_in_statement1746 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_THROW_in_statement1759. */
    public static final BitSet FOLLOW_THROW_in_statement1759 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_statement1761. */
    public static final BitSet FOLLOW_expr_in_statement1761 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_statement1763. */
    public static final BitSet FOLLOW_SEMI_in_statement1763 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_BREAK_in_statement1776. */
    public static final BitSet FOLLOW_BREAK_in_statement1776 = new BitSet(new long[]{0x0000000000030000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_statement1779. */
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1779 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_statement1783. */
    public static final BitSet FOLLOW_SEMI_in_statement1783 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_CONTINUE_in_statement1797. */
    public static final BitSet FOLLOW_CONTINUE_in_statement1797 = new BitSet(new long[]{0x0000000000030000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_statement1800. */
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1800 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_statement1804. */
    public static final BitSet FOLLOW_SEMI_in_statement1804 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_expr_in_statement1818. */
    public static final BitSet FOLLOW_expr_in_statement1818 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_statement1821. */
    public static final BitSet FOLLOW_SEMI_in_statement1821 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_statement1827. */
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1827 = new BitSet(new long[]{0x0000200000000000L});
    
    /** The Constant FOLLOW_COLON_in_statement1829. */
    public static final BitSet FOLLOW_COLON_in_statement1829 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC0BE20001EL});
    
    /** The Constant FOLLOW_statement_in_statement1831. */
    public static final BitSet FOLLOW_statement_in_statement1831 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_SEMI_in_statement1846. */
    public static final BitSet FOLLOW_SEMI_in_statement1846 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_LPAREN_in_parExpression1867. */
    public static final BitSet FOLLOW_LPAREN_in_parExpression1867 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_parExpression1870. */
    public static final BitSet FOLLOW_expr_in_parExpression1870 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_parExpression1872. */
    public static final BitSet FOLLOW_RPAREN_in_parExpression1872 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_LBRACE_in_block1894. */
    public static final BitSet FOLLOW_LBRACE_in_block1894 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC3BE20001FL});
    
    /** The Constant FOLLOW_blockStmt_in_block1897. */
    public static final BitSet FOLLOW_blockStmt_in_block1897 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC3BE20001FL});
    
    /** The Constant FOLLOW_RBRACE_in_block1901. */
    public static final BitSet FOLLOW_RBRACE_in_block1901 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_SEMI_in_block1919. */
    public static final BitSet FOLLOW_SEMI_in_block1919 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_varDecl_in_blockStmt1932. */
    public static final BitSet FOLLOW_varDecl_in_blockStmt1932 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_classDecl_in_blockStmt1937. */
    public static final BitSet FOLLOW_classDecl_in_blockStmt1937 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_statement_in_blockStmt1942. */
    public static final BitSet FOLLOW_statement_in_blockStmt1942 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_BREAK_in_breakStmt1973. */
    public static final BitSet FOLLOW_BREAK_in_breakStmt1973 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_breakStmt1975. */
    public static final BitSet FOLLOW_SEMI_in_breakStmt1975 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_CONTINUE_in_continueStmt1990. */
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt1990 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_continueStmt1992. */
    public static final BitSet FOLLOW_SEMI_in_continueStmt1992 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_CASE_in_caseStmt2003. */
    public static final BitSet FOLLOW_CASE_in_caseStmt2003 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_exprList_in_caseStmt2005. */
    public static final BitSet FOLLOW_exprList_in_caseStmt2005 = new BitSet(new long[]{0x0000200000000000L});
    
    /** The Constant FOLLOW_COLON_in_caseStmt2007. */
    public static final BitSet FOLLOW_COLON_in_caseStmt2007 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC0BE20001EL});
    
    /** The Constant FOLLOW_statement_in_caseStmt2009. */
    public static final BitSet FOLLOW_statement_in_caseStmt2009 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_DEFAULT_in_caseStmt2024. */
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2024 = new BitSet(new long[]{0x0000200000000000L});
    
    /** The Constant FOLLOW_COLON_in_caseStmt2026. */
    public static final BitSet FOLLOW_COLON_in_caseStmt2026 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC0BE20001EL});
    
    /** The Constant FOLLOW_statement_in_caseStmt2028. */
    public static final BitSet FOLLOW_statement_in_caseStmt2028 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_DEFAULT_in_defaultStmt2052. */
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt2052 = new BitSet(new long[]{0x0000200000000000L});
    
    /** The Constant FOLLOW_COLON_in_defaultStmt2054. */
    public static final BitSet FOLLOW_COLON_in_defaultStmt2054 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_catchStmt_in_catchStmtList2068. */
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList2068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    
    /** The Constant FOLLOW_catchStmtList_in_catchStmtList2070. */
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2070 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_CATCH_in_catchStmt2109. */
    public static final BitSet FOLLOW_CATCH_in_catchStmt2109 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_catchStmt2111. */
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2111 = new BitSet(new long[]{0x0000000008020000L});
    
    /** The Constant FOLLOW_param_in_catchStmt2113. */
    public static final BitSet FOLLOW_param_in_catchStmt2113 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_catchStmt2115. */
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2115 = new BitSet(new long[]{0x8000200000010000L});
    
    /** The Constant FOLLOW_block_in_catchStmt2117. */
    public static final BitSet FOLLOW_block_in_catchStmt2117 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_exprList_in_exprListOpt2144. */
    public static final BitSet FOLLOW_exprList_in_exprListOpt2144 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_expr_in_exprList2184. */
    public static final BitSet FOLLOW_expr_in_exprList2184 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_COMMA_in_exprList2187. */
    public static final BitSet FOLLOW_COMMA_in_exprList2187 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_exprList2190. */
    public static final BitSet FOLLOW_expr_in_exprList2190 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_assignExpr_in_expr2214. */
    public static final BitSet FOLLOW_assignExpr_in_expr2214 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_iterExpr_in_assignExpr2230. */
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2230 = new BitSet(new long[]{0x00000003F0000002L});
    
    /** The Constant FOLLOW_assignOp_in_assignExpr2233. */
    public static final BitSet FOLLOW_assignOp_in_assignExpr2233 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_iterExpr_in_assignExpr2236. */
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2236 = new BitSet(new long[]{0x00000003F0000002L});
    
    /** The Constant FOLLOW_ternaryExpr_in_iterExpr2249. */
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2249 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    
    /** The Constant FOLLOW_ELLIPSIS_in_iterExpr2252. */
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2252 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_ternaryExpr_in_iterExpr2255. */
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2255 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    
    /** The Constant FOLLOW_logicOrExpr_in_ternaryExpr2281. */
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2281 = new BitSet(new long[]{0x0000000008000002L});
    
    /** The Constant FOLLOW_QUES_in_ternaryExpr2284. */
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2284 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_ternaryExpr2287. */
    public static final BitSet FOLLOW_expr_in_ternaryExpr2287 = new BitSet(new long[]{0x0000200000000000L});
    
    /** The Constant FOLLOW_COLON_in_ternaryExpr2289. */
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2289 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_logicOrExpr_in_ternaryExpr2292. */
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2292 = new BitSet(new long[]{0x0000000008000002L});
    
    /** The Constant FOLLOW_logicAndExpr_in_logicOrExpr2310. */
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2310 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    
    /** The Constant FOLLOW_BARBAR_in_logicOrExpr2314. */
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2314 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_logicAndExpr_in_logicOrExpr2317. */
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2317 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    
    /** The Constant FOLLOW_cmpExpr_in_logicAndExpr2334. */
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2334 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    
    /** The Constant FOLLOW_AMPAMP_in_logicAndExpr2338. */
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2338 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_cmpExpr_in_logicAndExpr2341. */
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2341 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    
    /** The Constant FOLLOW_bitExpr_in_cmpExpr2363. */
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2363 = new BitSet(new long[]{0x0018000000000002L,0x0000000000007800L});
    
    /** The Constant FOLLOW_EQEQ_in_cmpExpr2368. */
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2368 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_BANGEQ_in_cmpExpr2372. */
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2372 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_GTEQ_in_cmpExpr2377. */
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2377 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_LTEQ_in_cmpExpr2382. */
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2382 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_GT_in_cmpExpr2387. */
    public static final BitSet FOLLOW_GT_in_cmpExpr2387 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_LT_in_cmpExpr2392. */
    public static final BitSet FOLLOW_LT_in_cmpExpr2392 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_bitExpr_in_cmpExpr2397. */
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2397 = new BitSet(new long[]{0x0018000000000002L,0x0000000000007800L});
    
    /** The Constant FOLLOW_shiftExpr_in_bitExpr2419. */
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2419 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    
    /** The Constant FOLLOW_BAR_in_bitExpr2423. */
    public static final BitSet FOLLOW_BAR_in_bitExpr2423 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_shiftExpr_in_bitExpr2426. */
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    
    /** The Constant FOLLOW_AMP_in_bitExpr2430. */
    public static final BitSet FOLLOW_AMP_in_bitExpr2430 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_shiftExpr_in_bitExpr2433. */
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    
    /** The Constant FOLLOW_CARET_in_bitExpr2436. */
    public static final BitSet FOLLOW_CARET_in_bitExpr2436 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_shiftExpr_in_bitExpr2439. */
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2439 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    
    /** The Constant FOLLOW_addExpr_in_shiftExpr2460. */
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2460 = new BitSet(new long[]{0x0010000000000002L,0x00000000000C0000L});
    
    /** The Constant FOLLOW_LTLT_in_shiftExpr2464. */
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2464 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_addExpr_in_shiftExpr2468. */
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2468 = new BitSet(new long[]{0x0010000000000002L,0x00000000000C0000L});
    
    /** The Constant FOLLOW_GT_in_shiftExpr2473. */
    public static final BitSet FOLLOW_GT_in_shiftExpr2473 = new BitSet(new long[]{0x0010000000000000L});
    
    /** The Constant FOLLOW_GT_in_shiftExpr2475. */
    public static final BitSet FOLLOW_GT_in_shiftExpr2475 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_addExpr_in_shiftExpr2480. */
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2480 = new BitSet(new long[]{0x0010000000000002L,0x00000000000C0000L});
    
    /** The Constant FOLLOW_GTGTGT_in_shiftExpr2484. */
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2484 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_addExpr_in_shiftExpr2487. */
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2487 = new BitSet(new long[]{0x0010000000000002L,0x00000000000C0000L});
    
    /** The Constant FOLLOW_multExpr_in_addExpr2510. */
    public static final BitSet FOLLOW_multExpr_in_addExpr2510 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    
    /** The Constant FOLLOW_PLUS_in_addExpr2515. */
    public static final BitSet FOLLOW_PLUS_in_addExpr2515 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_SUB_in_addExpr2520. */
    public static final BitSet FOLLOW_SUB_in_addExpr2520 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_multExpr_in_addExpr2524. */
    public static final BitSet FOLLOW_multExpr_in_addExpr2524 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    
    /** The Constant FOLLOW_prefixExpr_in_multExpr2546. */
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2546 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    
    /** The Constant FOLLOW_STAR_in_multExpr2551. */
    public static final BitSet FOLLOW_STAR_in_multExpr2551 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_SLASH_in_multExpr2554. */
    public static final BitSet FOLLOW_SLASH_in_multExpr2554 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_PERCENT_in_multExpr2557. */
    public static final BitSet FOLLOW_PERCENT_in_multExpr2557 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_prefixExpr_in_multExpr2561. */
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2561 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    
    /** The Constant FOLLOW_set_in_prefixExpr2579. */
    public static final BitSet FOLLOW_set_in_prefixExpr2579 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_prefixExpr_in_prefixExpr2591. */
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2591 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_newExpr_in_prefixExpr2617. */
    public static final BitSet FOLLOW_newExpr_in_prefixExpr2617 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_cast_in_prefixExpr2643. */
    public static final BitSet FOLLOW_cast_in_prefixExpr2643 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_suffixExpr_in_prefixExpr2669. */
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2669 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_value_in_suffixExpr2688. */
    public static final BitSet FOLLOW_value_in_suffixExpr2688 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_suffixExpr2690. */
    public static final BitSet FOLLOW_LPAREN_in_suffixExpr2690 = new BitSet(new long[]{0x8048013C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_exprListOpt_in_suffixExpr2692. */
    public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2692 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_suffixExpr2694. */
    public static final BitSet FOLLOW_RPAREN_in_suffixExpr2694 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_value_in_suffixExpr2714. */
    public static final BitSet FOLLOW_value_in_suffixExpr2714 = new BitSet(new long[]{0x0000002000000000L});
    
    /** The Constant FOLLOW_LBRACKET_in_suffixExpr2716. */
    public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2716 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_suffixExpr2718. */
    public static final BitSet FOLLOW_expr_in_suffixExpr2718 = new BitSet(new long[]{0x0000004000000000L});
    
    /** The Constant FOLLOW_RBRACKET_in_suffixExpr2720. */
    public static final BitSet FOLLOW_RBRACKET_in_suffixExpr2720 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_value_in_suffixExpr2725. */
    public static final BitSet FOLLOW_value_in_suffixExpr2725 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    
    /** The Constant FOLLOW_PLUSPLUS_in_suffixExpr2727. */
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2727 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_value_in_suffixExpr2745. */
    public static final BitSet FOLLOW_value_in_suffixExpr2745 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    
    /** The Constant FOLLOW_SUBSUB_in_suffixExpr2747. */
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2747 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_value_in_suffixExpr2766. */
    public static final BitSet FOLLOW_value_in_suffixExpr2766 = new BitSet(new long[]{0x0008000000000000L});
    
    /** The Constant FOLLOW_typeParamOpt_in_suffixExpr2768. */
    public static final BitSet FOLLOW_typeParamOpt_in_suffixExpr2768 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_funcLit_in_value2777. */
    public static final BitSet FOLLOW_funcLit_in_value2777 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_arrayLit_in_value2783. */
    public static final BitSet FOLLOW_arrayLit_in_value2783 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_objLit_in_value2798. */
    public static final BitSet FOLLOW_objLit_in_value2798 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_NULL_in_value2813. */
    public static final BitSet FOLLOW_NULL_in_value2813 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_elementarySymbol_in_value2828. */
    public static final BitSet FOLLOW_elementarySymbol_in_value2828 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_LPAREN_in_value2843. */
    public static final BitSet FOLLOW_LPAREN_in_value2843 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC0BE20001EL});
    
    /** The Constant FOLLOW_expr_in_value2847. */
    public static final BitSet FOLLOW_expr_in_value2847 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_statement_in_value2849. */
    public static final BitSet FOLLOW_statement_in_value2849 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_value2852. */
    public static final BitSet FOLLOW_RPAREN_in_value2852 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_dotIdent_in_value2865. */
    public static final BitSet FOLLOW_dotIdent_in_value2865 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_NEW_in_newExpr2910. */
    public static final BitSet FOLLOW_NEW_in_newExpr2910 = new BitSet(new long[]{0x8007800801020000L});
    
    /** The Constant FOLLOW_type_in_newExpr2912. */
    public static final BitSet FOLLOW_type_in_newExpr2912 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_newExpr2914. */
    public static final BitSet FOLLOW_LPAREN_in_newExpr2914 = new BitSet(new long[]{0x8048013C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_exprListOpt_in_newExpr2916. */
    public static final BitSet FOLLOW_exprListOpt_in_newExpr2916 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_newExpr2918. */
    public static final BitSet FOLLOW_RPAREN_in_newExpr2918 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_CAST_in_cast2940. */
    public static final BitSet FOLLOW_CAST_in_cast2940 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_cast2942. */
    public static final BitSet FOLLOW_LPAREN_in_cast2942 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_cast2944. */
    public static final BitSet FOLLOW_expr_in_cast2944 = new BitSet(new long[]{0x0000001004000000L});
    
    /** The Constant FOLLOW_COMMA_in_cast2947. */
    public static final BitSet FOLLOW_COMMA_in_cast2947 = new BitSet(new long[]{0x8007C00001020000L});
    
    /** The Constant FOLLOW_funcType_in_cast2949. */
    public static final BitSet FOLLOW_funcType_in_cast2949 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_cast2953. */
    public static final BitSet FOLLOW_RPAREN_in_cast2953 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_CAST_in_cast2969. */
    public static final BitSet FOLLOW_CAST_in_cast2969 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_cast2971. */
    public static final BitSet FOLLOW_LPAREN_in_cast2971 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_cast2973. */
    public static final BitSet FOLLOW_expr_in_cast2973 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_cast2975. */
    public static final BitSet FOLLOW_RPAREN_in_cast2975 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_classDecl_in_topLevelDecl2998. */
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl2998 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_interfaceDecl_in_topLevelDecl3024. */
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl3024 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_enumDecl_in_topLevelDecl3050. */
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl3050 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_typedefDecl_in_topLevelDecl3076. */
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl3076 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_ENUM_in_enumDecl3094. */
    public static final BitSet FOLLOW_ENUM_in_enumDecl3094 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_enumDecl3096. */
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl3096 = new BitSet(new long[]{0x8008000000000000L});
    
    /** The Constant FOLLOW_typeParamOpt_in_enumDecl3098. */
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3098 = new BitSet(new long[]{0x8000000000000000L});
    
    /** The Constant FOLLOW_LBRACE_in_enumDecl3100. */
    public static final BitSet FOLLOW_LBRACE_in_enumDecl3100 = new BitSet(new long[]{0x00001E8000020000L});
    
    /** The Constant FOLLOW_enumBody_in_enumDecl3102. */
    public static final BitSet FOLLOW_enumBody_in_enumDecl3102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    
    /** The Constant FOLLOW_RBRACE_in_enumDecl3104. */
    public static final BitSet FOLLOW_RBRACE_in_enumDecl3104 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_enumValueDecl_in_enumBody3135. */
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody3135 = new BitSet(new long[]{0x00001E8000020002L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_enumValueDecl3154. */
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3154 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_enumValueDecl3156. */
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3156 = new BitSet(new long[]{0x0000001008020000L});
    
    /** The Constant FOLLOW_paramList_in_enumValueDecl3159. */
    public static final BitSet FOLLOW_paramList_in_enumValueDecl3159 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_enumValueDecl3161. */
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3161 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_enumValueDecl3164. */
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3164 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_enumValueDecl3171. */
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3171 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_enumValueDecl3173. */
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3173 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_pp_in_enumValueDecl3180. */
    public static final BitSet FOLLOW_pp_in_enumValueDecl3180 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_varDecl_in_varDeclList3197. */
    public static final BitSet FOLLOW_varDecl_in_varDeclList3197 = new BitSet(new long[]{0x0000000003F00000L,0x0000000080000000L});
    
    /** The Constant FOLLOW_varDeclList_in_varDeclList3199. */
    public static final BitSet FOLLOW_varDeclList_in_varDeclList3199 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_declAttrList_in_varDecl3221. */
    public static final BitSet FOLLOW_declAttrList_in_varDecl3221 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    
    /** The Constant FOLLOW_VAR_in_varDecl3225. */
    public static final BitSet FOLLOW_VAR_in_varDecl3225 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_varDeclPartList_in_varDecl3227. */
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3227 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_varDecl3229. */
    public static final BitSet FOLLOW_SEMI_in_varDecl3229 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_varDeclPart_in_varDeclPartList3257. */
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3257 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_COMMA_in_varDeclPartList3260. */
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList3260 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_varDeclPart_in_varDeclPartList3263. */
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3263 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_varDeclPart3279. */
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3279 = new BitSet(new long[]{0x0000200810000000L});
    
    /** The Constant FOLLOW_propDeclOpt_in_varDeclPart3284. */
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3284 = new BitSet(new long[]{0x0000200010000000L});
    
    /** The Constant FOLLOW_typeTagOpt_in_varDeclPart3286. */
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3286 = new BitSet(new long[]{0x0000000010000000L});
    
    /** The Constant FOLLOW_varInit_in_varDeclPart3288. */
    public static final BitSet FOLLOW_varInit_in_varDeclPart3288 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_LPAREN_in_propDecl3298. */
    public static final BitSet FOLLOW_LPAREN_in_propDecl3298 = new BitSet(new long[]{0x0000000001020000L,0x0000000010000040L});
    
    /** The Constant FOLLOW_propAccessor_in_propDecl3302. */
    public static final BitSet FOLLOW_propAccessor_in_propDecl3302 = new BitSet(new long[]{0x0000000004000000L});
    
    /** The Constant FOLLOW_COMMA_in_propDecl3304. */
    public static final BitSet FOLLOW_COMMA_in_propDecl3304 = new BitSet(new long[]{0x0000000001020000L,0x0000000010000040L});
    
    /** The Constant FOLLOW_propAccessor_in_propDecl3308. */
    public static final BitSet FOLLOW_propAccessor_in_propDecl3308 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_propDecl3310. */
    public static final BitSet FOLLOW_RPAREN_in_propDecl3310 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_set_in_propAccessor0. */
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_propDecl_in_propDeclOpt3368. */
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt3368 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_EQ_in_varInit3383. */
    public static final BitSet FOLLOW_EQ_in_varInit3383 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_varInit3385. */
    public static final BitSet FOLLOW_expr_in_varInit3385 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_declAttrList_in_funcDecl3410. */
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3410 = new BitSet(new long[]{0x0000000400000000L});
    
    /** The Constant FOLLOW_FUNCTION_in_funcDecl3413. */
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3413 = new BitSet(new long[]{0x0040000000000000L});
    
    /** The Constant FOLLOW_NEW_in_funcDecl3415. */
    public static final BitSet FOLLOW_NEW_in_funcDecl3415 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_funcDecl3417. */
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3417 = new BitSet(new long[]{0x0000001008020000L});
    
    /** The Constant FOLLOW_paramList_in_funcDecl3419. */
    public static final BitSet FOLLOW_paramList_in_funcDecl3419 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_funcDecl3421. */
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3421 = new BitSet(new long[]{0x8000200000010000L});
    
    /** The Constant FOLLOW_typeTagOpt_in_funcDecl3423. */
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3423 = new BitSet(new long[]{0x8000200000010000L});
    
    /** The Constant FOLLOW_block_in_funcDecl3425. */
    public static final BitSet FOLLOW_block_in_funcDecl3425 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_declAttrList_in_funcDecl3453. */
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3453 = new BitSet(new long[]{0x0000000400000000L});
    
    /** The Constant FOLLOW_FUNCTION_in_funcDecl3456. */
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3456 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_funcDecl3458. */
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3458 = new BitSet(new long[]{0x0008000800000000L});
    
    /** The Constant FOLLOW_typeParamOpt_in_funcDecl3460. */
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3460 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_funcDecl3462. */
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3462 = new BitSet(new long[]{0x0000001008020000L});
    
    /** The Constant FOLLOW_paramList_in_funcDecl3464. */
    public static final BitSet FOLLOW_paramList_in_funcDecl3464 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_funcDecl3466. */
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3466 = new BitSet(new long[]{0x8000200000010000L});
    
    /** The Constant FOLLOW_typeTagOpt_in_funcDecl3468. */
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3468 = new BitSet(new long[]{0x8000200000010000L});
    
    /** The Constant FOLLOW_block_in_funcDecl3470. */
    public static final BitSet FOLLOW_block_in_funcDecl3470 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_declAttrList_in_funcProtoDecl3506. */
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3506 = new BitSet(new long[]{0x0000000400000000L});
    
    /** The Constant FOLLOW_FUNCTION_in_funcProtoDecl3508. */
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3508 = new BitSet(new long[]{0x0040000000000000L});
    
    /** The Constant FOLLOW_NEW_in_funcProtoDecl3510. */
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3510 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_funcProtoDecl3512. */
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3512 = new BitSet(new long[]{0x0000001008020000L});
    
    /** The Constant FOLLOW_paramList_in_funcProtoDecl3514. */
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3514 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_funcProtoDecl3516. */
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3516 = new BitSet(new long[]{0x0000200000010000L});
    
    /** The Constant FOLLOW_typeTagOpt_in_funcProtoDecl3518. */
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3518 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_funcProtoDecl3520. */
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3520 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_declAttrList_in_funcProtoDecl3539. */
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3539 = new BitSet(new long[]{0x0000000400000000L});
    
    /** The Constant FOLLOW_FUNCTION_in_funcProtoDecl3541. */
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3541 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_funcProtoDecl3543. */
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3543 = new BitSet(new long[]{0x0008000800000000L});
    
    /** The Constant FOLLOW_typeParamOpt_in_funcProtoDecl3545. */
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3545 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_funcProtoDecl3547. */
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3547 = new BitSet(new long[]{0x0000001008020000L});
    
    /** The Constant FOLLOW_paramList_in_funcProtoDecl3549. */
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3549 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_funcProtoDecl3551. */
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3551 = new BitSet(new long[]{0x0000200000010000L});
    
    /** The Constant FOLLOW_typeTagOpt_in_funcProtoDecl3553. */
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3553 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_funcProtoDecl3555. */
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3555 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_FUNCTION_in_funcProtoDecl3575. */
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3575 = new BitSet(new long[]{0x0040000000000000L});
    
    /** The Constant FOLLOW_NEW_in_funcProtoDecl3577. */
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3577 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_funcProtoDecl3579. */
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3579 = new BitSet(new long[]{0x0000001008020000L});
    
    /** The Constant FOLLOW_paramList_in_funcProtoDecl3581. */
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3581 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_funcProtoDecl3583. */
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3583 = new BitSet(new long[]{0x0000200000010000L});
    
    /** The Constant FOLLOW_typeTagOpt_in_funcProtoDecl3585. */
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3585 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_funcProtoDecl3587. */
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3587 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_FUNCTION_in_funcProtoDecl3604. */
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3604 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_funcProtoDecl3606. */
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3606 = new BitSet(new long[]{0x0008000800000000L});
    
    /** The Constant FOLLOW_typeParamOpt_in_funcProtoDecl3608. */
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3608 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_funcProtoDecl3610. */
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3610 = new BitSet(new long[]{0x0000001008020000L});
    
    /** The Constant FOLLOW_paramList_in_funcProtoDecl3612. */
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3612 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_funcProtoDecl3614. */
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3614 = new BitSet(new long[]{0x0000200000010000L});
    
    /** The Constant FOLLOW_typeTagOpt_in_funcProtoDecl3616. */
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3616 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_funcProtoDecl3618. */
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3618 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_EXTERN_in_classDecl3643. */
    public static final BitSet FOLLOW_EXTERN_in_classDecl3643 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    
    /** The Constant FOLLOW_CLASS_in_classDecl3646. */
    public static final BitSet FOLLOW_CLASS_in_classDecl3646 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_classDecl3648. */
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl3648 = new BitSet(new long[]{0x8008000000000000L,0x0000001800000000L});
    
    /** The Constant FOLLOW_typeParamOpt_in_classDecl3650. */
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl3650 = new BitSet(new long[]{0x8000000000000000L,0x0000001800000000L});
    
    /** The Constant FOLLOW_inheritListOpt_in_classDecl3652. */
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl3652 = new BitSet(new long[]{0x8000000000000000L});
    
    /** The Constant FOLLOW_LBRACE_in_classDecl3654. */
    public static final BitSet FOLLOW_LBRACE_in_classDecl3654 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    
    /** The Constant FOLLOW_classBodyScope_in_classDecl3656. */
    public static final BitSet FOLLOW_classBodyScope_in_classDecl3656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    
    /** The Constant FOLLOW_RBRACE_in_classDecl3658. */
    public static final BitSet FOLLOW_RBRACE_in_classDecl3658 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_classBody_in_classBodyScope3692. */
    public static final BitSet FOLLOW_classBody_in_classBodyScope3692 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_varDecl_in_classBody3717. */
    public static final BitSet FOLLOW_varDecl_in_classBody3717 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    
    /** The Constant FOLLOW_classBody_in_classBody3719. */
    public static final BitSet FOLLOW_classBody_in_classBody3719 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_funcDecl_in_classBody3724. */
    public static final BitSet FOLLOW_funcDecl_in_classBody3724 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    
    /** The Constant FOLLOW_classBody_in_classBody3726. */
    public static final BitSet FOLLOW_classBody_in_classBody3726 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_pp_in_classBody3731. */
    public static final BitSet FOLLOW_pp_in_classBody3731 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    
    /** The Constant FOLLOW_classBody_in_classBody3733. */
    public static final BitSet FOLLOW_classBody_in_classBody3733 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_INTERFACE_in_interfaceDecl3753. */
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl3753 = new BitSet(new long[]{0x8007800001020000L,0x0000001800000000L});
    
    /** The Constant FOLLOW_type_in_interfaceDecl3755. */
    public static final BitSet FOLLOW_type_in_interfaceDecl3755 = new BitSet(new long[]{0x8000000000000000L,0x0000001800000000L});
    
    /** The Constant FOLLOW_inheritListOpt_in_interfaceDecl3757. */
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl3757 = new BitSet(new long[]{0x8000000000000000L});
    
    /** The Constant FOLLOW_LBRACE_in_interfaceDecl3759. */
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl3759 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000001L});
    
    /** The Constant FOLLOW_interfaceBody_in_interfaceDecl3762. */
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl3762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    
    /** The Constant FOLLOW_RBRACE_in_interfaceDecl3764. */
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl3764 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_varDecl_in_interfaceBody3777. */
    public static final BitSet FOLLOW_varDecl_in_interfaceBody3777 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    
    /** The Constant FOLLOW_interfaceBody_in_interfaceBody3779. */
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3779 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_funcProtoDecl_in_interfaceBody3784. */
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody3784 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    
    /** The Constant FOLLOW_interfaceBody_in_interfaceBody3786. */
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3786 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_pp_in_interfaceBody3791. */
    public static final BitSet FOLLOW_pp_in_interfaceBody3791 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    
    /** The Constant FOLLOW_interfaceBody_in_interfaceBody3793. */
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3793 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_inherit_in_inheritList3814. */
    public static final BitSet FOLLOW_inherit_in_inheritList3814 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_COMMA_in_inheritList3817. */
    public static final BitSet FOLLOW_COMMA_in_inheritList3817 = new BitSet(new long[]{0x0000000000000000L,0x0000001800000000L});
    
    /** The Constant FOLLOW_inherit_in_inheritList3820. */
    public static final BitSet FOLLOW_inherit_in_inheritList3820 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_inheritList_in_inheritListOpt3838. */
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt3838 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_EXTENDS_in_inherit3872. */
    public static final BitSet FOLLOW_EXTENDS_in_inherit3872 = new BitSet(new long[]{0x8007800001020000L});
    
    /** The Constant FOLLOW_type_in_inherit3874. */
    public static final BitSet FOLLOW_type_in_inherit3874 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_IMPLEMENTS_in_inherit3894. */
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit3894 = new BitSet(new long[]{0x8007800001020000L});
    
    /** The Constant FOLLOW_type_in_inherit3896. */
    public static final BitSet FOLLOW_type_in_inherit3896 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_TYPEDEF_in_typedefDecl3923. */
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl3923 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_typedefDecl3925. */
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl3925 = new BitSet(new long[]{0x0000000010000000L});
    
    /** The Constant FOLLOW_EQ_in_typedefDecl3927. */
    public static final BitSet FOLLOW_EQ_in_typedefDecl3927 = new BitSet(new long[]{0x8007C00001020000L});
    
    /** The Constant FOLLOW_funcType_in_typedefDecl3929. */
    public static final BitSet FOLLOW_funcType_in_typedefDecl3929 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_GT_in_typeExtend3948. */
    public static final BitSet FOLLOW_GT_in_typeExtend3948 = new BitSet(new long[]{0x8007C00001020000L});
    
    /** The Constant FOLLOW_funcType_in_typeExtend3950. */
    public static final BitSet FOLLOW_funcType_in_typeExtend3950 = new BitSet(new long[]{0x0000000004000000L});
    
    /** The Constant FOLLOW_COMMA_in_typeExtend3952. */
    public static final BitSet FOLLOW_COMMA_in_typeExtend3952 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_LBRACE_in_anonType3963. */
    public static final BitSet FOLLOW_LBRACE_in_anonType3963 = new BitSet(new long[]{0x0010000003F20000L,0x0000000080000001L});
    
    /** The Constant FOLLOW_anonTypeFieldList_in_anonType3998. */
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType3998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    
    /** The Constant FOLLOW_varDeclList_in_anonType4026. */
    public static final BitSet FOLLOW_varDeclList_in_anonType4026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    
    /** The Constant FOLLOW_typeExtend_in_anonType4055. */
    public static final BitSet FOLLOW_typeExtend_in_anonType4055 = new BitSet(new long[]{0x0000000003F20000L,0x0000000080000001L});
    
    /** The Constant FOLLOW_anonTypeFieldList_in_anonType4083. */
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    
    /** The Constant FOLLOW_varDeclList_in_anonType4109. */
    public static final BitSet FOLLOW_varDeclList_in_anonType4109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    
    /** The Constant FOLLOW_RBRACE_in_anonType4153. */
    public static final BitSet FOLLOW_RBRACE_in_anonType4153 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_anonTypeField_in_anonTypeFieldList4167. */
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4167 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_COMMA_in_anonTypeFieldList4170. */
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList4170 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_anonTypeField_in_anonTypeFieldList4173. */
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4173 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_LBRACE_in_objLit4185. */
    public static final BitSet FOLLOW_LBRACE_in_objLit4185 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_objLitElemList_in_objLit4188. */
    public static final BitSet FOLLOW_objLitElemList_in_objLit4188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    
    /** The Constant FOLLOW_RBRACE_in_objLit4190. */
    public static final BitSet FOLLOW_RBRACE_in_objLit4190 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_anonTypeField4202. */
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField4202 = new BitSet(new long[]{0x0000200000000000L});
    
    /** The Constant FOLLOW_COLON_in_anonTypeField4204. */
    public static final BitSet FOLLOW_COLON_in_anonTypeField4204 = new BitSet(new long[]{0x8007C00001020000L});
    
    /** The Constant FOLLOW_funcType_in_anonTypeField4207. */
    public static final BitSet FOLLOW_funcType_in_anonTypeField4207 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_objLitElem_in_objLitElemList4223. */
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4223 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_COMMA_in_objLitElemList4226. */
    public static final BitSet FOLLOW_COMMA_in_objLitElemList4226 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_objLitElem_in_objLitElemList4229. */
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4229 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_objLitElem4250. */
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem4250 = new BitSet(new long[]{0x0000200000000000L});
    
    /** The Constant FOLLOW_COLON_in_objLitElem4252. */
    public static final BitSet FOLLOW_COLON_in_objLitElem4252 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_objLitElem4255. */
    public static final BitSet FOLLOW_expr_in_objLitElem4255 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_LONGLITERAL_in_elementarySymbol4267. */
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol4267 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_INTLITERAL_in_elementarySymbol4280. */
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol4280 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_STRINGLITERAL_in_elementarySymbol4293. */
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol4293 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_CHARLITERAL_in_elementarySymbol4306. */
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol4306 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_FLOATNUM_in_elementarySymbol4319. */
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol4319 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_TRUE_in_elementarySymbol4332. */
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol4332 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_FALSE_in_elementarySymbol4346. */
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol4346 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_typeTagOpt_in_synpred21_TinyHaxeTry1876. */
    public static final BitSet FOLLOW_typeTagOpt_in_synpred21_TinyHaxeTry1876 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_COMMA_in_synpred29_TinyHaxeTry11268. */
    public static final BitSet FOLLOW_COMMA_in_synpred29_TinyHaxeTry11268 = new BitSet(new long[]{0x8007C00001020000L});
    
    /** The Constant FOLLOW_funcType_in_synpred29_TinyHaxeTry11271. */
    public static final BitSet FOLLOW_funcType_in_synpred29_TinyHaxeTry11271 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_funcType_in_synpred30_TinyHaxeTry11265. */
    public static final BitSet FOLLOW_funcType_in_synpred30_TinyHaxeTry11265 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_COMMA_in_synpred30_TinyHaxeTry11268. */
    public static final BitSet FOLLOW_COMMA_in_synpred30_TinyHaxeTry11268 = new BitSet(new long[]{0x8007C00001020000L});
    
    /** The Constant FOLLOW_funcType_in_synpred30_TinyHaxeTry11271. */
    public static final BitSet FOLLOW_funcType_in_synpred30_TinyHaxeTry11271 = new BitSet(new long[]{0x0000000004000002L});
    
    /** The Constant FOLLOW_COMMA_in_synpred31_TinyHaxeTry11282. */
    public static final BitSet FOLLOW_COMMA_in_synpred31_TinyHaxeTry11282 = new BitSet(new long[]{0x0000000000020000L});
    
    /** The Constant FOLLOW_typeConstraint_in_synpred31_TinyHaxeTry11285. */
    public static final BitSet FOLLOW_typeConstraint_in_synpred31_TinyHaxeTry11285 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_MINUS_BIGGER_in_synpred32_TinyHaxeTry11304. */
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred32_TinyHaxeTry11304 = new BitSet(new long[]{0x8007800001020000L});
    
    /** The Constant FOLLOW_type_in_synpred32_TinyHaxeTry11307. */
    public static final BitSet FOLLOW_type_in_synpred32_TinyHaxeTry11307 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_type_in_synpred33_TinyHaxeTry11300. */
    public static final BitSet FOLLOW_type_in_synpred33_TinyHaxeTry11300 = new BitSet(new long[]{0x0000400000000002L});
    
    /** The Constant FOLLOW_MINUS_BIGGER_in_synpred33_TinyHaxeTry11304. */
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred33_TinyHaxeTry11304 = new BitSet(new long[]{0x8007C00001020000L});
    
    /** The Constant FOLLOW_type_in_synpred33_TinyHaxeTry11307. */
    public static final BitSet FOLLOW_type_in_synpred33_TinyHaxeTry11307 = new BitSet(new long[]{0x0000400000000002L});
    
    /** The Constant FOLLOW_typeParam_in_synpred40_TinyHaxeTry11347. */
    public static final BitSet FOLLOW_typeParam_in_synpred40_TinyHaxeTry11347 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_anonType_in_synpred41_TinyHaxeTry11326. */
    public static final BitSet FOLLOW_anonType_in_synpred41_TinyHaxeTry11326 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_dotIdent_in_synpred41_TinyHaxeTry11330. */
    public static final BitSet FOLLOW_dotIdent_in_synpred41_TinyHaxeTry11330 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_INT_in_synpred41_TinyHaxeTry11333. */
    public static final BitSet FOLLOW_INT_in_synpred41_TinyHaxeTry11333 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_FLOAT_in_synpred41_TinyHaxeTry11336. */
    public static final BitSet FOLLOW_FLOAT_in_synpred41_TinyHaxeTry11336 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_DYNAMIC_in_synpred41_TinyHaxeTry11339. */
    public static final BitSet FOLLOW_DYNAMIC_in_synpred41_TinyHaxeTry11339 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_BOOLEAN_in_synpred41_TinyHaxeTry11341. */
    public static final BitSet FOLLOW_BOOLEAN_in_synpred41_TinyHaxeTry11341 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_VOID_in_synpred41_TinyHaxeTry11343. */
    public static final BitSet FOLLOW_VOID_in_synpred41_TinyHaxeTry11343 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_typeParam_in_synpred41_TinyHaxeTry11347. */
    public static final BitSet FOLLOW_typeParam_in_synpred41_TinyHaxeTry11347 = new BitSet(new long[]{0x0008000000000002L});
    
    /** The Constant FOLLOW_type_in_synpred42_TinyHaxeTry11369. */
    public static final BitSet FOLLOW_type_in_synpred42_TinyHaxeTry11369 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_GT_in_synpred43_TinyHaxeTry11375. */
    public static final BitSet FOLLOW_GT_in_synpred43_TinyHaxeTry11375 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_GTGT_in_synpred44_TinyHaxeTry11378. */
    public static final BitSet FOLLOW_GTGT_in_synpred44_TinyHaxeTry11378 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_typeParam_in_synpred45_TinyHaxeTry11401. */
    public static final BitSet FOLLOW_typeParam_in_synpred45_TinyHaxeTry11401 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_block_in_synpred47_TinyHaxeTry11525. */
    public static final BitSet FOLLOW_block_in_synpred47_TinyHaxeTry11525 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_assignExpr_in_synpred48_TinyHaxeTry11530. */
    public static final BitSet FOLLOW_assignExpr_in_synpred48_TinyHaxeTry11530 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_synpred48_TinyHaxeTry11532. */
    public static final BitSet FOLLOW_SEMI_in_synpred48_TinyHaxeTry11532 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_ELSE_in_synpred50_TinyHaxeTry11552. */
    public static final BitSet FOLLOW_ELSE_in_synpred50_TinyHaxeTry11552 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC0BE20001EL});
    
    /** The Constant FOLLOW_statement_in_synpred50_TinyHaxeTry11556. */
    public static final BitSet FOLLOW_statement_in_synpred50_TinyHaxeTry11556 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_expr_in_synpred58_TinyHaxeTry11742. */
    public static final BitSet FOLLOW_expr_in_synpred58_TinyHaxeTry11742 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_expr_in_synpred65_TinyHaxeTry11818. */
    public static final BitSet FOLLOW_expr_in_synpred65_TinyHaxeTry11818 = new BitSet(new long[]{0x0000000000010000L});
    
    /** The Constant FOLLOW_SEMI_in_synpred65_TinyHaxeTry11821. */
    public static final BitSet FOLLOW_SEMI_in_synpred65_TinyHaxeTry11821 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_IDENTIFIER_in_synpred66_TinyHaxeTry11827. */
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred66_TinyHaxeTry11827 = new BitSet(new long[]{0x0000200000000000L});
    
    /** The Constant FOLLOW_COLON_in_synpred66_TinyHaxeTry11829. */
    public static final BitSet FOLLOW_COLON_in_synpred66_TinyHaxeTry11829 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC0BE20001EL});
    
    /** The Constant FOLLOW_statement_in_synpred66_TinyHaxeTry11831. */
    public static final BitSet FOLLOW_statement_in_synpred66_TinyHaxeTry11831 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_varDecl_in_synpred69_TinyHaxeTry11932. */
    public static final BitSet FOLLOW_varDecl_in_synpred69_TinyHaxeTry11932 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_exprList_in_synpred73_TinyHaxeTry12144. */
    public static final BitSet FOLLOW_exprList_in_synpred73_TinyHaxeTry12144 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_GT_in_synpred90_TinyHaxeTry12473. */
    public static final BitSet FOLLOW_GT_in_synpred90_TinyHaxeTry12473 = new BitSet(new long[]{0x0010000000000000L});
    
    /** The Constant FOLLOW_GT_in_synpred90_TinyHaxeTry12475. */
    public static final BitSet FOLLOW_GT_in_synpred90_TinyHaxeTry12475 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_addExpr_in_synpred90_TinyHaxeTry12480. */
    public static final BitSet FOLLOW_addExpr_in_synpred90_TinyHaxeTry12480 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_set_in_synpred101_TinyHaxeTry12579. */
    public static final BitSet FOLLOW_set_in_synpred101_TinyHaxeTry12579 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_prefixExpr_in_synpred101_TinyHaxeTry12591. */
    public static final BitSet FOLLOW_prefixExpr_in_synpred101_TinyHaxeTry12591 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_value_in_synpred104_TinyHaxeTry12688. */
    public static final BitSet FOLLOW_value_in_synpred104_TinyHaxeTry12688 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_synpred104_TinyHaxeTry12690. */
    public static final BitSet FOLLOW_LPAREN_in_synpred104_TinyHaxeTry12690 = new BitSet(new long[]{0x8048013C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_exprListOpt_in_synpred104_TinyHaxeTry12692. */
    public static final BitSet FOLLOW_exprListOpt_in_synpred104_TinyHaxeTry12692 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_synpred104_TinyHaxeTry12694. */
    public static final BitSet FOLLOW_RPAREN_in_synpred104_TinyHaxeTry12694 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_value_in_synpred105_TinyHaxeTry12714. */
    public static final BitSet FOLLOW_value_in_synpred105_TinyHaxeTry12714 = new BitSet(new long[]{0x0000002000000000L});
    
    /** The Constant FOLLOW_LBRACKET_in_synpred105_TinyHaxeTry12716. */
    public static final BitSet FOLLOW_LBRACKET_in_synpred105_TinyHaxeTry12716 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_synpred105_TinyHaxeTry12718. */
    public static final BitSet FOLLOW_expr_in_synpred105_TinyHaxeTry12718 = new BitSet(new long[]{0x0000004000000000L});
    
    /** The Constant FOLLOW_RBRACKET_in_synpred105_TinyHaxeTry12720. */
    public static final BitSet FOLLOW_RBRACKET_in_synpred105_TinyHaxeTry12720 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_value_in_synpred106_TinyHaxeTry12725. */
    public static final BitSet FOLLOW_value_in_synpred106_TinyHaxeTry12725 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    
    /** The Constant FOLLOW_PLUSPLUS_in_synpred106_TinyHaxeTry12727. */
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred106_TinyHaxeTry12727 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_value_in_synpred107_TinyHaxeTry12745. */
    public static final BitSet FOLLOW_value_in_synpred107_TinyHaxeTry12745 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    
    /** The Constant FOLLOW_SUBSUB_in_synpred107_TinyHaxeTry12747. */
    public static final BitSet FOLLOW_SUBSUB_in_synpred107_TinyHaxeTry12747 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_arrayLit_in_synpred109_TinyHaxeTry12783. */
    public static final BitSet FOLLOW_arrayLit_in_synpred109_TinyHaxeTry12783 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_expr_in_synpred113_TinyHaxeTry12847. */
    public static final BitSet FOLLOW_expr_in_synpred113_TinyHaxeTry12847 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_LPAREN_in_synpred114_TinyHaxeTry12843. */
    public static final BitSet FOLLOW_LPAREN_in_synpred114_TinyHaxeTry12843 = new BitSet(new long[]{0xFAC8212C03F30000L,0x00001FC0BE20001EL});
    
    /** The Constant FOLLOW_expr_in_synpred114_TinyHaxeTry12847. */
    public static final BitSet FOLLOW_expr_in_synpred114_TinyHaxeTry12847 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_statement_in_synpred114_TinyHaxeTry12849. */
    public static final BitSet FOLLOW_statement_in_synpred114_TinyHaxeTry12849 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_synpred114_TinyHaxeTry12852. */
    public static final BitSet FOLLOW_RPAREN_in_synpred114_TinyHaxeTry12852 = new BitSet(new long[]{0x0000000000000002L});
    
    /** The Constant FOLLOW_CAST_in_synpred117_TinyHaxeTry12940. */
    public static final BitSet FOLLOW_CAST_in_synpred117_TinyHaxeTry12940 = new BitSet(new long[]{0x0000000800000000L});
    
    /** The Constant FOLLOW_LPAREN_in_synpred117_TinyHaxeTry12942. */
    public static final BitSet FOLLOW_LPAREN_in_synpred117_TinyHaxeTry12942 = new BitSet(new long[]{0x8048012C00020000L,0x00001FC03E200000L});
    
    /** The Constant FOLLOW_expr_in_synpred117_TinyHaxeTry12944. */
    public static final BitSet FOLLOW_expr_in_synpred117_TinyHaxeTry12944 = new BitSet(new long[]{0x0000001004000000L});
    
    /** The Constant FOLLOW_COMMA_in_synpred117_TinyHaxeTry12947. */
    public static final BitSet FOLLOW_COMMA_in_synpred117_TinyHaxeTry12947 = new BitSet(new long[]{0x8007C00001020000L});
    
    /** The Constant FOLLOW_funcType_in_synpred117_TinyHaxeTry12949. */
    public static final BitSet FOLLOW_funcType_in_synpred117_TinyHaxeTry12949 = new BitSet(new long[]{0x0000001000000000L});
    
    /** The Constant FOLLOW_RPAREN_in_synpred117_TinyHaxeTry12953. */
    public static final BitSet FOLLOW_RPAREN_in_synpred117_TinyHaxeTry12953 = new BitSet(new long[]{0x0000000000000002L});

}