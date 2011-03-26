// $ANTLR 3.3 Nov 30, 2010 12:45:30 F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g 2011-03-27 00:36:42

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

public class TinyHaxeTry1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROPERTY_DECL", "MODULE", "SUFFIX_EXPR", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG", "TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "DECL_ATTR_LIST", "VAR_INIT", "ASSIGN_OPERATOR", "PACKAGE", "SEMI", "IDENTIFIER", "DOT", "IMPORT", "PUBLIC", "PRIVATE", "STATIC", "INLINE", "DYNAMIC", "OVERRIDE", "COMMA", "QUES", "THIS", "EQ", "PLUSEQ", "SUBEQ", "SLASHEQ", "PERCENTEQ", "AMPEQ", "FUNCTION", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COLON", "MINUS_BIGGER", "VOID", "INT", "FLOAT", "BOOLEAN", "LT", "GT", "GTGT", "NEW", "IF", "ELSE", "FOR", "IN", "WHILE", "DO", "TRY", "SWITCH", "LBRACE", "RBRACE", "RETURN", "THROW", "BREAK", "CONTINUE", "CASE", "DEFAULT", "CATCH", "UNTYPED", "ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ", "BAR", "AMP", "CARET", "LTLT", "GTGTGT", "PLUS", "SUB", "STAR", "SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "BANG", "TILDE", "NULL", "CAST", "ENUM", "VAR", "EXTERN", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "TYPEDEF", "LONGLITERAL", "INTLITERAL", "STRINGLITERAL", "CHARLITERAL", "FLOATNUM", "TRUE", "FALSE", "WS", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "EscapeSequence", "ABSTRACT", "BYTE", "CHAR", "CONST", "DOUBLE", "FINAL", "FINALLY", "GOTO", "INSTANCEOF", "LONG", "NATIVE", "PROTECTED", "SHORT", "STRICTFP", "SUPER", "THROWS", "TRANSIENT", "VOLATILE", "STAREQ", "BAREQ", "CARETEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "MONKEYS_AT", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "LTLTEQ", "GTGTEQ", "GTGTGTEQ", "INTNUM", "EXPONENT", "COMMENT", "PP_IF", "PP_ELSEIF", "PP_ELSE", "PP_END", "PP_ERROR", "TS", "PP_CONDITIONAL", "PREPROCESSOR_DIRECTIVE", "IF_TOKEN", "ELSE_TOKEN", "ENDIF_TOKEN", "PP_EXPRESSION", "PP_OR_EXPRESSION", "PP_AND_EXPRESSION", "PP_UNARY_EXPRESSION", "PP_PRIMARY_EXPRESSION", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ"
    };
    public static final int EOF=-1;
    public static final int PROPERTY_DECL=4;
    public static final int MODULE=5;
    public static final int SUFFIX_EXPR=6;
    public static final int BLOCK_SCOPE=7;
    public static final int PARAM_LIST=8;
    public static final int TYPE_TAG=9;
    public static final int TYPE_PARAM_OPT=10;
    public static final int INHERIT_LIST_OPT=11;
    public static final int DECL_ATTR_LIST=12;
    public static final int VAR_INIT=13;
    public static final int ASSIGN_OPERATOR=14;
    public static final int PACKAGE=15;
    public static final int SEMI=16;
    public static final int IDENTIFIER=17;
    public static final int DOT=18;
    public static final int IMPORT=19;
    public static final int PUBLIC=20;
    public static final int PRIVATE=21;
    public static final int STATIC=22;
    public static final int INLINE=23;
    public static final int DYNAMIC=24;
    public static final int OVERRIDE=25;
    public static final int COMMA=26;
    public static final int QUES=27;
    public static final int THIS=28;
    public static final int EQ=29;
    public static final int PLUSEQ=30;
    public static final int SUBEQ=31;
    public static final int SLASHEQ=32;
    public static final int PERCENTEQ=33;
    public static final int AMPEQ=34;
    public static final int FUNCTION=35;
    public static final int LPAREN=36;
    public static final int RPAREN=37;
    public static final int LBRACKET=38;
    public static final int RBRACKET=39;
    public static final int COLON=40;
    public static final int MINUS_BIGGER=41;
    public static final int VOID=42;
    public static final int INT=43;
    public static final int FLOAT=44;
    public static final int BOOLEAN=45;
    public static final int LT=46;
    public static final int GT=47;
    public static final int GTGT=48;
    public static final int NEW=49;
    public static final int IF=50;
    public static final int ELSE=51;
    public static final int FOR=52;
    public static final int IN=53;
    public static final int WHILE=54;
    public static final int DO=55;
    public static final int TRY=56;
    public static final int SWITCH=57;
    public static final int LBRACE=58;
    public static final int RBRACE=59;
    public static final int RETURN=60;
    public static final int THROW=61;
    public static final int BREAK=62;
    public static final int CONTINUE=63;
    public static final int CASE=64;
    public static final int DEFAULT=65;
    public static final int CATCH=66;
    public static final int UNTYPED=67;
    public static final int ELLIPSIS=68;
    public static final int BARBAR=69;
    public static final int AMPAMP=70;
    public static final int EQEQ=71;
    public static final int BANGEQ=72;
    public static final int GTEQ=73;
    public static final int LTEQ=74;
    public static final int BAR=75;
    public static final int AMP=76;
    public static final int CARET=77;
    public static final int LTLT=78;
    public static final int GTGTGT=79;
    public static final int PLUS=80;
    public static final int SUB=81;
    public static final int STAR=82;
    public static final int SLASH=83;
    public static final int PERCENT=84;
    public static final int SUBSUB=85;
    public static final int PLUSPLUS=86;
    public static final int BANG=87;
    public static final int TILDE=88;
    public static final int NULL=89;
    public static final int CAST=90;
    public static final int ENUM=91;
    public static final int VAR=92;
    public static final int EXTERN=93;
    public static final int CLASS=94;
    public static final int INTERFACE=95;
    public static final int EXTENDS=96;
    public static final int IMPLEMENTS=97;
    public static final int TYPEDEF=98;
    public static final int LONGLITERAL=99;
    public static final int INTLITERAL=100;
    public static final int STRINGLITERAL=101;
    public static final int CHARLITERAL=102;
    public static final int FLOATNUM=103;
    public static final int TRUE=104;
    public static final int FALSE=105;
    public static final int WS=106;
    public static final int IntegerNumber=107;
    public static final int LongSuffix=108;
    public static final int HexPrefix=109;
    public static final int HexDigit=110;
    public static final int Exponent=111;
    public static final int EscapeSequence=112;
    public static final int ABSTRACT=113;
    public static final int BYTE=114;
    public static final int CHAR=115;
    public static final int CONST=116;
    public static final int DOUBLE=117;
    public static final int FINAL=118;
    public static final int FINALLY=119;
    public static final int GOTO=120;
    public static final int INSTANCEOF=121;
    public static final int LONG=122;
    public static final int NATIVE=123;
    public static final int PROTECTED=124;
    public static final int SHORT=125;
    public static final int STRICTFP=126;
    public static final int SUPER=127;
    public static final int THROWS=128;
    public static final int TRANSIENT=129;
    public static final int VOLATILE=130;
    public static final int STAREQ=131;
    public static final int BAREQ=132;
    public static final int CARETEQ=133;
    public static final int PERCENTDLQ=134;
    public static final int PERCENTDBQ=135;
    public static final int PERCENTDBBQ=136;
    public static final int EQEQEQ=137;
    public static final int PERCENTLESQ=138;
    public static final int BANGEQQ=139;
    public static final int MONKEYS_AT=140;
    public static final int PERCENTLL=141;
    public static final int PERCENTBB=142;
    public static final int PERCENTBBB=143;
    public static final int LTLTEQ=144;
    public static final int GTGTEQ=145;
    public static final int GTGTGTEQ=146;
    public static final int INTNUM=147;
    public static final int EXPONENT=148;
    public static final int COMMENT=149;
    public static final int PP_IF=150;
    public static final int PP_ELSEIF=151;
    public static final int PP_ELSE=152;
    public static final int PP_END=153;
    public static final int PP_ERROR=154;
    public static final int TS=155;
    public static final int PP_CONDITIONAL=156;
    public static final int PREPROCESSOR_DIRECTIVE=157;
    public static final int IF_TOKEN=158;
    public static final int ELSE_TOKEN=159;
    public static final int ENDIF_TOKEN=160;
    public static final int PP_EXPRESSION=161;
    public static final int PP_OR_EXPRESSION=162;
    public static final int PP_AND_EXPRESSION=163;
    public static final int PP_UNARY_EXPRESSION=164;
    public static final int PP_PRIMARY_EXPRESSION=165;
    public static final int HEX_DIGIT=166;
    public static final int UNICODE_ESC=167;
    public static final int OCTAL_ESC=168;
    public static final int ESC_SEQ=169;

    // delegates
    // delegators


        public TinyHaxeTry1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TinyHaxeTry1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[236+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TinyHaxeTry1Parser.tokenNames; }
    public String getGrammarFileName() { return "F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g"; }


    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:59:1: module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) ;
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
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:59:19: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:59:21: ( myPackage )? topLevelList
            {
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:59:21: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:0:0: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module129);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_topLevelList_in_module132);
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
            // 59:45: -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:59:48: ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(MODULE, "MODULE", true), root_1);

                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:59:92: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:59:103: ( topLevelList )?
                if ( stream_topLevelList.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelList.nextTree());

                }
                stream_topLevelList.reset();

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

    public static class topLevelList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevelList"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:62:1: topLevelList : ( topLevel )* ;
    public final TinyHaxeTry1Parser.topLevelList_return topLevelList() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelList_return retval = new TinyHaxeTry1Parser.topLevelList_return();
        retval.start = input.LT(1);
        int topLevelList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.topLevel_return topLevel3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:62:19: ( ( topLevel )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:62:22: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:62:22: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT||LA2_0==ENUM||(LA2_0>=EXTERN && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:62:23: topLevel
            	    {
            	    pushFollow(FOLLOW_topLevel_in_topLevelList168);
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

    public static class topLevel_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevel"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:64:1: topLevel : ( myImport | topLevelDecl );
    public final TinyHaxeTry1Parser.topLevel_return topLevel() throws RecognitionException {
        TinyHaxeTry1Parser.topLevel_return retval = new TinyHaxeTry1Parser.topLevel_return();
        retval.start = input.LT(1);
        int topLevel_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.myImport_return myImport4 = null;

        TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl5 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:64:19: ( myImport | topLevelDecl )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IMPORT) ) {
                alt3=1;
            }
            else if ( (LA3_0==ENUM||(LA3_0>=EXTERN && LA3_0<=INTERFACE)||LA3_0==TYPEDEF) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:64:21: myImport
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_myImport_in_topLevel187);
                    myImport4=myImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, myImport4.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:66:25: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topLevelDecl_in_topLevel214);
                    topLevelDecl5=topLevelDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelDecl5.getTree());

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

    public static class myPackage_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "myPackage"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:68:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) ;
    public final TinyHaxeTry1Parser.myPackage_return myPackage() throws RecognitionException {
        TinyHaxeTry1Parser.myPackage_return retval = new TinyHaxeTry1Parser.myPackage_return();
        retval.start = input.LT(1);
        int myPackage_StartIndex = input.index();
        Object root_0 = null;

        Token PACKAGE6=null;
        Token SEMI8=null;
        TinyHaxeTry1Parser.dotIdent_return dotIdent7 = null;


        Object PACKAGE6_tree=null;
        Object SEMI8_tree=null;
        RewriteRuleTokenStream stream_PACKAGE=new RewriteRuleTokenStream(adaptor,"token PACKAGE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_dotIdent=new RewriteRuleSubtreeStream(adaptor,"rule dotIdent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:68:21: ( PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:68:23: PACKAGE dotIdent SEMI
            {
            PACKAGE6=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage233); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE.add(PACKAGE6);

            pushFollow(FOLLOW_dotIdent_in_myPackage235);
            dotIdent7=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent7.getTree());
            SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage237); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI8);



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
            // 68:45: -> ^( PACKAGE ( dotIdent )? )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:68:48: ^( PACKAGE ( dotIdent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PACKAGE.nextNode(), root_1);

                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:68:58: ( dotIdent )?
                if ( stream_dotIdent.hasNext() ) {
                    adaptor.addChild(root_1, stream_dotIdent.nextTree());

                }
                stream_dotIdent.reset();

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

    public static class qualifiedIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedIdentifier"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:71:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
    public final TinyHaxeTry1Parser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        TinyHaxeTry1Parser.qualifiedIdentifier_return retval = new TinyHaxeTry1Parser.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        Object root_0 = null;

        Token a=null;
        Token ident=null;
        Token DOT9=null;

        Object a_tree=null;
        Object ident_tree=null;
        Object DOT9_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:72:5: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:72:9: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:72:9: (a= IDENTIFIER -> $a)
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:72:10: a= IDENTIFIER
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier266); if (state.failed) return retval; 
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
            // 72:24: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:72:34: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DOT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:72:35: DOT ident= IDENTIFIER
            	    {
            	    DOT9=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier279); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT9);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier283); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(ident);



            	    // AST REWRITE
            	    // elements: qualifiedIdentifier, ident, DOT
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
            	    // 72:57: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:72:61: ^( DOT $qualifiedIdentifier $ident)
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

    public static class myImport_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "myImport"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:75:1: myImport : IMPORT dotIdent SEMI ;
    public final TinyHaxeTry1Parser.myImport_return myImport() throws RecognitionException {
        TinyHaxeTry1Parser.myImport_return retval = new TinyHaxeTry1Parser.myImport_return();
        retval.start = input.LT(1);
        int myImport_StartIndex = input.index();
        Object root_0 = null;

        Token IMPORT10=null;
        Token SEMI12=null;
        TinyHaxeTry1Parser.dotIdent_return dotIdent11 = null;


        Object IMPORT10_tree=null;
        Object SEMI12_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:75:21: ( IMPORT dotIdent SEMI )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:75:23: IMPORT dotIdent SEMI
            {
            root_0 = (Object)adaptor.nil();

            IMPORT10=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_myImport325); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPORT10_tree = (Object)adaptor.create(IMPORT10);
            root_0 = (Object)adaptor.becomeRoot(IMPORT10_tree, root_0);
            }
            pushFollow(FOLLOW_dotIdent_in_myImport328);
            dotIdent11=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent11.getTree());
            SEMI12=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport330); if (state.failed) return retval;

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

    public static class access_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "access"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:79:1: access : ( PUBLIC | PRIVATE );
    public final TinyHaxeTry1Parser.access_return access() throws RecognitionException {
        TinyHaxeTry1Parser.access_return retval = new TinyHaxeTry1Parser.access_return();
        retval.start = input.LT(1);
        int access_StartIndex = input.index();
        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:79:19: ( PUBLIC | PRIVATE )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set13=(Token)input.LT(1);
            if ( (input.LA(1)>=PUBLIC && input.LA(1)<=PRIVATE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set13));
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

    public static class declAttr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declAttr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:82:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
    public final TinyHaxeTry1Parser.declAttr_return declAttr() throws RecognitionException {
        TinyHaxeTry1Parser.declAttr_return retval = new TinyHaxeTry1Parser.declAttr_return();
        retval.start = input.LT(1);
        int declAttr_StartIndex = input.index();
        Object root_0 = null;

        Token STATIC14=null;
        Token INLINE15=null;
        Token DYNAMIC16=null;
        Token OVERRIDE17=null;
        TinyHaxeTry1Parser.access_return access18 = null;


        Object STATIC14_tree=null;
        Object INLINE15_tree=null;
        Object DYNAMIC16_tree=null;
        Object OVERRIDE17_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:82:19: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:82:21: STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    STATIC14=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr417); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC14_tree = (Object)adaptor.create(STATIC14);
                    adaptor.addChild(root_0, STATIC14_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:83:24: INLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    INLINE15=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr442); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE15_tree = (Object)adaptor.create(INLINE15);
                    adaptor.addChild(root_0, INLINE15_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:84:25: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    DYNAMIC16=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr468); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC16_tree = (Object)adaptor.create(DYNAMIC16);
                    adaptor.addChild(root_0, DYNAMIC16_tree);
                    }

                    }
                    break;
                case 4 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:85:25: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    OVERRIDE17=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr494); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE17_tree = (Object)adaptor.create(OVERRIDE17);
                    adaptor.addChild(root_0, OVERRIDE17_tree);
                    }

                    }
                    break;
                case 5 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:86:25: access
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_access_in_declAttr520);
                    access18=access();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, access18.getTree());

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

    public static class declAttrList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declAttrList"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:88:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) ;
    public final TinyHaxeTry1Parser.declAttrList_return declAttrList() throws RecognitionException {
        TinyHaxeTry1Parser.declAttrList_return retval = new TinyHaxeTry1Parser.declAttrList_return();
        retval.start = input.LT(1);
        int declAttrList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.declAttr_return declAttr19 = null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:88:19: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:88:21: ( declAttr )+
            {
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:88:21: ( declAttr )+
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
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:88:22: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList535);
            	    declAttr19=declAttr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declAttr.add(declAttr19.getTree());

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
            // 88:33: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:88:36: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
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

    public static class paramList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramList"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:91:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | );
    public final TinyHaxeTry1Parser.paramList_return paramList() throws RecognitionException {
        TinyHaxeTry1Parser.paramList_return retval = new TinyHaxeTry1Parser.paramList_return();
        retval.start = input.LT(1);
        int paramList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA21=null;
        TinyHaxeTry1Parser.param_return param20 = null;

        TinyHaxeTry1Parser.param_return param22 = null;


        Object COMMA21_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:91:19: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | )
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:91:21: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList576);
                    param20=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param20.getTree());
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:91:27: ( COMMA param )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:91:28: COMMA param
                    	    {
                    	    COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList579); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA21);

                    	    pushFollow(FOLLOW_param_in_paramList581);
                    	    param22=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_param.add(param22.getTree());

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
                    // 91:42: -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:91:45: ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:93:2: 
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

    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:94:1: param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) ;
    public final TinyHaxeTry1Parser.param_return param() throws RecognitionException {
        TinyHaxeTry1Parser.param_return retval = new TinyHaxeTry1Parser.param_return();
        retval.start = input.LT(1);
        int param_StartIndex = input.index();
        Object root_0 = null;

        Token QUES23=null;
        Token IDENTIFIER24=null;
        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt25 = null;

        TinyHaxeTry1Parser.varInit_return varInit26 = null;


        Object QUES23_tree=null;
        Object IDENTIFIER24_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_QUES=new RewriteRuleTokenStream(adaptor,"token QUES");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:94:19: ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:94:20: ( QUES )? IDENTIFIER typeTagOpt varInit
            {
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:94:20: ( QUES )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==QUES) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:0:0: QUES
                    {
                    QUES23=(Token)match(input,QUES,FOLLOW_QUES_in_param620); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES23);


                    }
                    break;

            }

            IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param623); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER24);

            pushFollow(FOLLOW_typeTagOpt_in_param625);
            typeTagOpt25=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt25.getTree());
            pushFollow(FOLLOW_varInit_in_param627);
            varInit26=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varInit.add(varInit26.getTree());


            // AST REWRITE
            // elements: typeTagOpt, QUES, IDENTIFIER, varInit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:56: -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:94:59: ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, IDENTIFIER24, true), root_1);

                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:94:100: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                }
                stream_IDENTIFIER.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:94:122: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:94:134: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:94:143: ( QUES )?
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

    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:97:1: id : ( IDENTIFIER | THIS );
    public final TinyHaxeTry1Parser.id_return id() throws RecognitionException {
        TinyHaxeTry1Parser.id_return retval = new TinyHaxeTry1Parser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token set27=null;

        Object set27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:97:4: ( IDENTIFIER | THIS )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set27=(Token)input.LT(1);
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==THIS ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set27));
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
            if ( state.backtracking>0 ) { memoize(input, 12, id_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "id"

    public static class dotIdent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotIdent"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:101:1: dotIdent : ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* ;
    public final TinyHaxeTry1Parser.dotIdent_return dotIdent() throws RecognitionException {
        TinyHaxeTry1Parser.dotIdent_return retval = new TinyHaxeTry1Parser.dotIdent_return();
        retval.start = input.LT(1);
        int dotIdent_StartIndex = input.index();
        Object root_0 = null;

        Token DOT29=null;
        TinyHaxeTry1Parser.id_return ident = null;

        TinyHaxeTry1Parser.id_return id28 = null;


        Object DOT29_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:101:9: ( ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:101:11: ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
            {
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:101:11: ( id -> id )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:101:12: id
            {
            pushFollow(FOLLOW_id_in_dotIdent682);
            id28=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id28.getTree());


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
            // 101:15: -> id
            {
                adaptor.addChild(root_0, stream_id.nextTree());

            }

            retval.tree = root_0;}
            }

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:101:22: ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DOT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:101:23: DOT ident= id
            	    {
            	    DOT29=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent690); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT29);

            	    pushFollow(FOLLOW_id_in_dotIdent694);
            	    ident=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id.add(ident.getTree());


            	    // AST REWRITE
            	    // elements: dotIdent, DOT, ident
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
            	    // 101:36: -> ^( DOT $dotIdent $ident)
            	    {
            	        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:101:39: ^( DOT $dotIdent $ident)
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

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:104:1: assignOp : ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] );
    public final TinyHaxeTry1Parser.assignOp_return assignOp() throws RecognitionException {
        TinyHaxeTry1Parser.assignOp_return retval = new TinyHaxeTry1Parser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token EQ30=null;
        Token PLUSEQ31=null;
        Token SUBEQ32=null;
        Token SLASHEQ33=null;
        Token PERCENTEQ34=null;
        Token AMPEQ35=null;

        Object EQ30_tree=null;
        Object PLUSEQ31_tree=null;
        Object SUBEQ32_tree=null;
        Object SLASHEQ33_tree=null;
        Object PERCENTEQ34_tree=null;
        Object AMPEQ35_tree=null;
        RewriteRuleTokenStream stream_SUBEQ=new RewriteRuleTokenStream(adaptor,"token SUBEQ");
        RewriteRuleTokenStream stream_SLASHEQ=new RewriteRuleTokenStream(adaptor,"token SLASHEQ");
        RewriteRuleTokenStream stream_PERCENTEQ=new RewriteRuleTokenStream(adaptor,"token PERCENTEQ");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_AMPEQ=new RewriteRuleTokenStream(adaptor,"token AMPEQ");
        RewriteRuleTokenStream stream_PLUSEQ=new RewriteRuleTokenStream(adaptor,"token PLUSEQ");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:104:9: ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] )
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:104:11: EQ
                    {
                    EQ30=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp718); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ30);



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
                    // 104:14: -> EQ[$EQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(EQ, EQ30));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:105:11: PLUSEQ
                    {
                    PLUSEQ31=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSEQ.add(PLUSEQ31);



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
                    // 105:19: -> PLUSEQ[$PLUSEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PLUSEQ, PLUSEQ31));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:106:11: SUBEQ
                    {
                    SUBEQ32=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBEQ.add(SUBEQ32);



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
                    // 106:17: -> SUBEQ[$SUBEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SUBEQ, SUBEQ32));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:107:11: SLASHEQ
                    {
                    SLASHEQ33=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASHEQ.add(SLASHEQ33);



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
                    // 107:19: -> SLASHEQ[$SLASHEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SLASHEQ, SLASHEQ33));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:108:4: PERCENTEQ
                    {
                    PERCENTEQ34=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp792); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERCENTEQ.add(PERCENTEQ34);



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
                    // 109:4: -> PERCENTEQ[$PERCENTEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PERCENTEQ, PERCENTEQ34));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:110:4: AMPEQ
                    {
                    AMPEQ35=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMPEQ.add(AMPEQ35);



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
                    // 110:10: -> AMPEQ[$AMPEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(AMPEQ, AMPEQ35));

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

    public static class funcLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcLit"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:114:1: funcLit : FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) ;
    public final TinyHaxeTry1Parser.funcLit_return funcLit() throws RecognitionException {
        TinyHaxeTry1Parser.funcLit_return retval = new TinyHaxeTry1Parser.funcLit_return();
        retval.start = input.LT(1);
        int funcLit_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION36=null;
        Token LPAREN37=null;
        Token RPAREN39=null;
        TinyHaxeTry1Parser.paramList_return paramList38 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt40 = null;

        TinyHaxeTry1Parser.block_return block41 = null;


        Object FUNCTION36_tree=null;
        Object LPAREN37_tree=null;
        Object RPAREN39_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:114:19: ( FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:114:21: FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block
            {
            FUNCTION36=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit838); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION36);

            LPAREN37=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit840); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN37);

            pushFollow(FOLLOW_paramList_in_funcLit842);
            paramList38=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList38.getTree());
            RPAREN39=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit844); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN39);

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:114:54: ( typeTagOpt )?
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:0:0: typeTagOpt
                    {
                    pushFollow(FOLLOW_typeTagOpt_in_funcLit846);
                    typeTagOpt40=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt40.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_funcLit849);
            block41=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block41.getTree());


            // AST REWRITE
            // elements: typeTagOpt, FUNCTION, paramList, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 114:72: -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:114:75: ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:114:100: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:114:111: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:114:123: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

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

    public static class arrayLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLit"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:116:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
    public final TinyHaxeTry1Parser.arrayLit_return arrayLit() throws RecognitionException {
        TinyHaxeTry1Parser.arrayLit_return retval = new TinyHaxeTry1Parser.arrayLit_return();
        retval.start = input.LT(1);
        int arrayLit_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACKET42=null;
        Token RBRACKET44=null;
        TinyHaxeTry1Parser.exprListOpt_return exprListOpt43 = null;


        Object LBRACKET42_tree=null;
        Object RBRACKET44_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:116:18: ( LBRACKET exprListOpt RBRACKET )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:116:20: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            LBRACKET42=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit884); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit887);
            exprListOpt43=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt43.getTree());
            RBRACKET44=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit889); if (state.failed) return retval;

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

    public static class typeTag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeTag"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:144:1: typeTag : COLON funcType ;
    public final TinyHaxeTry1Parser.typeTag_return typeTag() throws RecognitionException {
        TinyHaxeTry1Parser.typeTag_return retval = new TinyHaxeTry1Parser.typeTag_return();
        retval.start = input.LT(1);
        int typeTag_StartIndex = input.index();
        Object root_0 = null;

        Token COLON45=null;
        TinyHaxeTry1Parser.funcType_return funcType46 = null;


        Object COLON45_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:144:9: ( COLON funcType )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:144:11: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            COLON45=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag908); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_typeTag911);
            funcType46=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType46.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 17, typeTag_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeTag"

    public static class typeTagOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeTagOpt"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:147:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | );
    public final TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeTagOpt_return retval = new TinyHaxeTry1Parser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeTag_return typeTag47 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:148:2: ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==COLON) ) {
                alt13=1;
            }
            else if ( (LA13_0==EOF||LA13_0==SEMI||LA13_0==COMMA||LA13_0==EQ||LA13_0==RPAREN||LA13_0==LBRACE) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:148:4: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt923);
                    typeTag47=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag47.getTree());


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
                    // 148:12: -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:148:15: ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(TYPE_TAG, "TYPE_TAG", true), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:148:63: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:150:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 18, typeTagOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeTagOpt"

    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeList"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:152:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );
    public final TinyHaxeTry1Parser.typeList_return typeList() throws RecognitionException {
        TinyHaxeTry1Parser.typeList_return retval = new TinyHaxeTry1Parser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA49=null;
        Token COMMA52=null;
        TinyHaxeTry1Parser.funcType_return funcType48 = null;

        TinyHaxeTry1Parser.funcType_return funcType50 = null;

        TinyHaxeTry1Parser.typeConstraint_return typeConstraint51 = null;

        TinyHaxeTry1Parser.typeConstraint_return typeConstraint53 = null;


        Object COMMA49_tree=null;
        Object COMMA52_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:152:9: ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:152:11: funcType ( COMMA funcType )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_typeList949);
                    funcType48=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType48.getTree());
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:152:20: ( COMMA funcType )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            int LA14_2 = input.LA(2);

                            if ( (synpred23_TinyHaxeTry1()) ) {
                                alt14=1;
                            }


                        }


                        switch (alt14) {
                    	case 1 :
                    	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:152:21: COMMA funcType
                    	    {
                    	    COMMA49=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList952); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_funcType_in_typeList955);
                    	    funcType50=funcType();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType50.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:153:4: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeConstraint_in_typeList963);
                    typeConstraint51=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint51.getTree());
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:153:19: ( COMMA typeConstraint )*
                    loop15:
                    do {
                        int alt15=2;
                        alt15 = dfa15.predict(input);
                        switch (alt15) {
                    	case 1 :
                    	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:153:20: COMMA typeConstraint
                    	    {
                    	    COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList966); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList969);
                    	    typeConstraint53=typeConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint53.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
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
            if ( state.backtracking>0 ) { memoize(input, 19, typeList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeList"

    public static class funcType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcType"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:1: funcType : ( ( type ) ( MINUS_BIGGER type )* | VOID );
    public final TinyHaxeTry1Parser.funcType_return funcType() throws RecognitionException {
        TinyHaxeTry1Parser.funcType_return retval = new TinyHaxeTry1Parser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token MINUS_BIGGER55=null;
        Token VOID57=null;
        TinyHaxeTry1Parser.type_return type54 = null;

        TinyHaxeTry1Parser.type_return type56 = null;


        Object MINUS_BIGGER55_tree=null;
        Object VOID57_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:9: ( ( type ) ( MINUS_BIGGER type )* | VOID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EOF||(LA18_0>=SEMI && LA18_0<=IDENTIFIER)||LA18_0==IMPORT||LA18_0==DYNAMIC||(LA18_0>=COMMA && LA18_0<=AMPEQ)||(LA18_0>=LPAREN && LA18_0<=RPAREN)||(LA18_0>=RBRACKET && LA18_0<=MINUS_BIGGER)||(LA18_0>=INT && LA18_0<=GTGT)||LA18_0==IN||(LA18_0>=LBRACE && LA18_0<=RBRACE)||(LA18_0>=ELLIPSIS && LA18_0<=PERCENT)||LA18_0==ENUM||(LA18_0>=EXTERN && LA18_0<=TYPEDEF)) ) {
                alt18=1;
            }
            else if ( (LA18_0==VOID) ) {
                int LA18_2 = input.LA(2);

                if ( (synpred27_TinyHaxeTry1()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:11: ( type ) ( MINUS_BIGGER type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:11: ( type )
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:12: type
                    {
                    pushFollow(FOLLOW_type_in_funcType984);
                    type54=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type54.getTree());

                    }

                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:18: ( MINUS_BIGGER type )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==MINUS_BIGGER) ) {
                            int LA17_2 = input.LA(2);

                            if ( (synpred26_TinyHaxeTry1()) ) {
                                alt17=1;
                            }


                        }


                        switch (alt17) {
                    	case 1 :
                    	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:19: MINUS_BIGGER type
                    	    {
                    	    MINUS_BIGGER55=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType988); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_funcType991);
                    	    type56=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type56.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:157:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID57=(Token)match(input,VOID,FOLLOW_VOID_in_funcType998); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID57_tree = (Object)adaptor.create(VOID57);
                    adaptor.addChild(root_0, VOID57_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 20, funcType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:1: type : ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | );
    public final TinyHaxeTry1Parser.type_return type() throws RecognitionException {
        TinyHaxeTry1Parser.type_return retval = new TinyHaxeTry1Parser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token INT60=null;
        Token FLOAT61=null;
        Token DYNAMIC62=null;
        Token BOOLEAN63=null;
        Token VOID64=null;
        TinyHaxeTry1Parser.anonType_return anonType58 = null;

        TinyHaxeTry1Parser.dotIdent_return dotIdent59 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam65 = null;


        Object INT60_tree=null;
        Object FLOAT61_tree=null;
        Object DYNAMIC62_tree=null;
        Object BOOLEAN63_tree=null;
        Object VOID64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:6: ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
                    int alt19=7;
                    switch ( input.LA(1) ) {
                    case LBRACE:
                        {
                        alt19=1;
                        }
                        break;
                    case IDENTIFIER:
                    case THIS:
                        {
                        alt19=2;
                        }
                        break;
                    case INT:
                        {
                        alt19=3;
                        }
                        break;
                    case FLOAT:
                        {
                        alt19=4;
                        }
                        break;
                    case DYNAMIC:
                        {
                        alt19=5;
                        }
                        break;
                    case BOOLEAN:
                        {
                        alt19=6;
                        }
                        break;
                    case VOID:
                        {
                        alt19=7;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:9: anonType
                            {
                            pushFollow(FOLLOW_anonType_in_type1010);
                            anonType58=anonType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonType58.getTree());

                            }
                            break;
                        case 2 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:20: dotIdent
                            {
                            pushFollow(FOLLOW_dotIdent_in_type1014);
                            dotIdent59=dotIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent59.getTree());

                            }
                            break;
                        case 3 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:30: INT
                            {
                            INT60=(Token)match(input,INT,FOLLOW_INT_in_type1017); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INT60_tree = (Object)adaptor.create(INT60);
                            adaptor.addChild(root_0, INT60_tree);
                            }

                            }
                            break;
                        case 4 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:35: FLOAT
                            {
                            FLOAT61=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type1020); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            FLOAT61_tree = (Object)adaptor.create(FLOAT61);
                            adaptor.addChild(root_0, FLOAT61_tree);
                            }

                            }
                            break;
                        case 5 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:42: DYNAMIC
                            {
                            DYNAMIC62=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_type1023); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DYNAMIC62_tree = (Object)adaptor.create(DYNAMIC62);
                            adaptor.addChild(root_0, DYNAMIC62_tree);
                            }

                            }
                            break;
                        case 6 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:50: BOOLEAN
                            {
                            BOOLEAN63=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1025); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BOOLEAN63_tree = (Object)adaptor.create(BOOLEAN63);
                            adaptor.addChild(root_0, BOOLEAN63_tree);
                            }

                            }
                            break;
                        case 7 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:58: VOID
                            {
                            VOID64=(Token)match(input,VOID,FOLLOW_VOID_in_type1027); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            VOID64_tree = (Object)adaptor.create(VOID64);
                            adaptor.addChild(root_0, VOID64_tree);
                            }

                            }
                            break;

                    }

                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:64: ( typeParam )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==LT) ) {
                            int LA20_2 = input.LA(2);

                            if ( (synpred34_TinyHaxeTry1()) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:65: typeParam
                    	    {
                    	    pushFollow(FOLLOW_typeParam_in_type1031);
                    	    typeParam65=typeParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam65.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:162:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 21, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class typeParam_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeParam"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:164:1: typeParam : LT ( type | typeList ) ( GT | GTGT | ) ;
    public final TinyHaxeTry1Parser.typeParam_return typeParam() throws RecognitionException {
        TinyHaxeTry1Parser.typeParam_return retval = new TinyHaxeTry1Parser.typeParam_return();
        retval.start = input.LT(1);
        int typeParam_StartIndex = input.index();
        Object root_0 = null;

        Token LT66=null;
        Token GT69=null;
        Token GTGT70=null;
        TinyHaxeTry1Parser.type_return type67 = null;

        TinyHaxeTry1Parser.typeList_return typeList68 = null;


        Object LT66_tree=null;
        Object GT69_tree=null;
        Object GTGT70_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:2: ( LT ( type | typeList ) ( GT | GTGT | ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:4: LT ( type | typeList ) ( GT | GTGT | )
            {
            root_0 = (Object)adaptor.nil();

            LT66=(Token)match(input,LT,FOLLOW_LT_in_typeParam1049); if (state.failed) return retval;
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:8: ( type | typeList )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:9: type
                    {
                    pushFollow(FOLLOW_type_in_typeParam1053);
                    type67=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type67.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:14: typeList
                    {
                    pushFollow(FOLLOW_typeList_in_typeParam1055);
                    typeList68=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList68.getTree());

                    }
                    break;

            }

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:24: ( GT | GTGT | )
            int alt23=3;
            switch ( input.LA(1) ) {
            case GT:
                {
                int LA23_1 = input.LA(2);

                if ( (synpred37_TinyHaxeTry1()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case GTGT:
                {
                int LA23_2 = input.LA(2);

                if ( (synpred38_TinyHaxeTry1()) ) {
                    alt23=2;
                }
                else if ( (true) ) {
                    alt23=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

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
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:25: GT
                    {
                    GT69=(Token)match(input,GT,FOLLOW_GT_in_typeParam1059); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:29: GTGT
                    {
                    GTGT70=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParam1062); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:35: 
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
            if ( state.backtracking>0 ) { memoize(input, 22, typeParam_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeParam"

    public static class typeParamOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeParamOpt"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:169:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | );
    public final TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeParamOpt_return retval = new TinyHaxeTry1Parser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam71 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:170:2: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LT) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred39_TinyHaxeTry1()) ) {
                    alt24=1;
                }
                else if ( (true) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==EOF||LA24_0==SEMI||(LA24_0>=COMMA && LA24_0<=QUES)||(LA24_0>=EQ && LA24_0<=AMPEQ)||(LA24_0>=LPAREN && LA24_0<=RPAREN)||(LA24_0>=RBRACKET && LA24_0<=COLON)||LA24_0==GT||LA24_0==IN||(LA24_0>=LBRACE && LA24_0<=RBRACE)||(LA24_0>=ELLIPSIS && LA24_0<=PERCENT)||(LA24_0>=EXTENDS && LA24_0<=IMPLEMENTS)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:170:4: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1084);
                    typeParam71=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam71.getTree());


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
                    // 170:13: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:170:16: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT", true), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:170:76: ( typeParam )?
                        if ( stream_typeParam.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeParam.nextTree());

                        }
                        stream_typeParam.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:172:9: 
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
            if ( state.backtracking>0 ) { memoize(input, 23, typeParamOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeParamOpt"

    public static class typeConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeConstraint"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:174:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
    public final TinyHaxeTry1Parser.typeConstraint_return typeConstraint() throws RecognitionException {
        TinyHaxeTry1Parser.typeConstraint_return retval = new TinyHaxeTry1Parser.typeConstraint_return();
        retval.start = input.LT(1);
        int typeConstraint_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER72=null;
        Token COLON73=null;
        Token LPAREN74=null;
        Token RPAREN76=null;
        TinyHaxeTry1Parser.typeList_return typeList75 = null;


        Object IDENTIFIER72_tree=null;
        Object COLON73_tree=null;
        Object LPAREN74_tree=null;
        Object RPAREN76_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:174:19: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:174:21: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER72=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1127); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER72);

            COLON73=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1129); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON73);

            LPAREN74=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1131); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN74);

            pushFollow(FOLLOW_typeList_in_typeConstraint1133);
            typeList75=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList75.getTree());
            RPAREN76=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1135); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN76);



            // AST REWRITE
            // elements: typeList, typeConstraint, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 174:61: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:174:64: ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:174:82: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:174:94: ( typeList )?
                if ( stream_typeList.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeList.nextTree());

                }
                stream_typeList.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 24, typeConstraint_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeConstraint"

    public static class functionReturn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionReturn"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:178:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) ;
    public final TinyHaxeTry1Parser.functionReturn_return functionReturn() throws RecognitionException {
        TinyHaxeTry1Parser.functionReturn_return retval = new TinyHaxeTry1Parser.functionReturn_return();
        retval.start = input.LT(1);
        int functionReturn_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION78=null;
        Token NEW79=null;
        Token LPAREN80=null;
        Token RPAREN82=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList77 = null;

        TinyHaxeTry1Parser.paramList_return paramList81 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt83 = null;

        TinyHaxeTry1Parser.block_return block84 = null;


        Object FUNCTION78_tree=null;
        Object NEW79_tree=null;
        Object LPAREN80_tree=null;
        Object RPAREN82_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:179:2: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:179:4: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
            {
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:179:4: ( declAttrList )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=PUBLIC && LA25_0<=OVERRIDE)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:0:0: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_functionReturn1161);
                    declAttrList77=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList77.getTree());

                    }
                    break;

            }

            FUNCTION78=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionReturn1164); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION78);

            NEW79=(Token)match(input,NEW,FOLLOW_NEW_in_functionReturn1166); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW79);

            LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionReturn1168); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN80);

            pushFollow(FOLLOW_paramList_in_functionReturn1170);
            paramList81=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList81.getTree());
            RPAREN82=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionReturn1172); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN82);

            pushFollow(FOLLOW_typeTagOpt_in_functionReturn1174);
            typeTagOpt83=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt83.getTree());
            pushFollow(FOLLOW_block_in_functionReturn1176);
            block84=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block84.getTree());


            // AST REWRITE
            // elements: FUNCTION, typeTagOpt, NEW, declAttrList, block, paramList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 179:72: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:179:75: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                adaptor.addChild(root_1, stream_NEW.nextNode());
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:179:104: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:179:118: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:179:129: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:179:141: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 25, functionReturn_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionReturn"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:182:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );
    public final TinyHaxeTry1Parser.statement_return statement() throws RecognitionException {
        TinyHaxeTry1Parser.statement_return retval = new TinyHaxeTry1Parser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Token SEMI87=null;
        Token IF89=null;
        Token ELSE91=null;
        Token FOR92=null;
        Token LPAREN93=null;
        Token IN94=null;
        Token RPAREN95=null;
        Token WHILE97=null;
        Token DO100=null;
        Token WHILE102=null;
        Token SEMI104=null;
        Token TRY105=null;
        Token SWITCH108=null;
        Token LPAREN109=null;
        Token RPAREN111=null;
        Token LBRACE112=null;
        Token RBRACE114=null;
        Token RETURN115=null;
        Token SEMI117=null;
        Token THROW118=null;
        Token SEMI120=null;
        Token BREAK121=null;
        Token IDENTIFIER122=null;
        Token SEMI123=null;
        Token CONTINUE124=null;
        Token IDENTIFIER125=null;
        Token SEMI126=null;
        Token SEMI128=null;
        Token IDENTIFIER129=null;
        Token COLON130=null;
        Token SEMI132=null;
        TinyHaxeTry1Parser.statement_return st1 = null;

        TinyHaxeTry1Parser.statement_return st2 = null;

        TinyHaxeTry1Parser.expr_return exp1 = null;

        TinyHaxeTry1Parser.expr_return exp2 = null;

        TinyHaxeTry1Parser.block_return block85 = null;

        TinyHaxeTry1Parser.assignExpr_return assignExpr86 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl88 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression90 = null;

        TinyHaxeTry1Parser.statement_return statement96 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression98 = null;

        TinyHaxeTry1Parser.statement_return statement99 = null;

        TinyHaxeTry1Parser.statement_return statement101 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression103 = null;

        TinyHaxeTry1Parser.block_return block106 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList107 = null;

        TinyHaxeTry1Parser.expr_return expr110 = null;

        TinyHaxeTry1Parser.caseStmt_return caseStmt113 = null;

        TinyHaxeTry1Parser.expr_return expr116 = null;

        TinyHaxeTry1Parser.expr_return expr119 = null;

        TinyHaxeTry1Parser.expr_return expr127 = null;

        TinyHaxeTry1Parser.statement_return statement131 = null;


        Object SEMI87_tree=null;
        Object IF89_tree=null;
        Object ELSE91_tree=null;
        Object FOR92_tree=null;
        Object LPAREN93_tree=null;
        Object IN94_tree=null;
        Object RPAREN95_tree=null;
        Object WHILE97_tree=null;
        Object DO100_tree=null;
        Object WHILE102_tree=null;
        Object SEMI104_tree=null;
        Object TRY105_tree=null;
        Object SWITCH108_tree=null;
        Object LPAREN109_tree=null;
        Object RPAREN111_tree=null;
        Object LBRACE112_tree=null;
        Object RBRACE114_tree=null;
        Object RETURN115_tree=null;
        Object SEMI117_tree=null;
        Object THROW118_tree=null;
        Object SEMI120_tree=null;
        Object BREAK121_tree=null;
        Object IDENTIFIER122_tree=null;
        Object SEMI123_tree=null;
        Object CONTINUE124_tree=null;
        Object IDENTIFIER125_tree=null;
        Object SEMI126_tree=null;
        Object SEMI128_tree=null;
        Object IDENTIFIER129_tree=null;
        Object COLON130_tree=null;
        Object SEMI132_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:183:2: ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI )
            int alt31=16;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:183:4: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement1213);
                    block85=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block85.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:184:4: assignExpr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_statement1218);
                    assignExpr86=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr86.getTree());
                    SEMI87=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1220); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:185:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_statement1226);
                    varDecl88=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl88.getTree());

                    }
                    break;
                case 4 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:186:4: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF89=(Token)match(input,IF,FOLLOW_IF_in_statement1231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF89);

                    pushFollow(FOLLOW_parExpression_in_statement1233);
                    parExpression90=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression90.getTree());
                    pushFollow(FOLLOW_statement_in_statement1237);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:186:35: ( ELSE st2= statement )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==ELSE) ) {
                        int LA26_1 = input.LA(2);

                        if ( (synpred44_TinyHaxeTry1()) ) {
                            alt26=1;
                        }
                    }
                    switch (alt26) {
                        case 1 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:186:36: ELSE st2= statement
                            {
                            ELSE91=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1240); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE91);

                            pushFollow(FOLLOW_statement_in_statement1244);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: parExpression, IF, st2, st1, ELSE
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
                    // 186:58: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:186:61: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new IfNode(stream_IF.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:186:93: ( ^( ELSE $st2) )?
                        if ( stream_st2.hasNext()||stream_ELSE.hasNext() ) {
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:186:93: ^( ELSE $st2)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_st2.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_st2.reset();
                        stream_ELSE.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:187:4: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    FOR92=(Token)match(input,FOR,FOLLOW_FOR_in_statement1284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR92);

                    LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN93);

                    pushFollow(FOLLOW_expr_in_statement1290);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
                    IN94=(Token)match(input,IN,FOLLOW_IN_in_statement1292); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN94);

                    pushFollow(FOLLOW_expr_in_statement1296);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
                    RPAREN95=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1298); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN95);

                    pushFollow(FOLLOW_statement_in_statement1300);
                    statement96=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement96.getTree());


                    // AST REWRITE
                    // elements: statement, IN, FOR, exp1, exp2
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
                    // 187:56: -> ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:187:59: ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ForNode(stream_FOR.nextToken()), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:187:74: ^( IN $exp1 $exp2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_exp1.nextTree());
                        adaptor.addChild(root_2, stream_exp2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:187:92: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:188:4: WHILE parExpression statement
                    {
                    WHILE97=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1328); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE97);

                    pushFollow(FOLLOW_parExpression_in_statement1330);
                    parExpression98=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression98.getTree());
                    pushFollow(FOLLOW_statement_in_statement1332);
                    statement99=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement99.getTree());


                    // AST REWRITE
                    // elements: statement, parExpression, WHILE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 188:38: -> ^( WHILE ( parExpression )? ( statement )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:188:41: ^( WHILE ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new WhileNode(stream_WHILE.nextToken()), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:188:60: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:188:75: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:189:4: DO statement WHILE parExpression SEMI
                    {
                    DO100=(Token)match(input,DO,FOLLOW_DO_in_statement1356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO100);

                    pushFollow(FOLLOW_statement_in_statement1358);
                    statement101=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement101.getTree());
                    WHILE102=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1360); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE102);

                    pushFollow(FOLLOW_parExpression_in_statement1362);
                    parExpression103=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression103.getTree());
                    SEMI104=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1364); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI104);



                    // AST REWRITE
                    // elements: statement, DO, parExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:45: -> ^( DO ( parExpression )? ( statement )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:189:48: ^( DO ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new DoWhileNode(stream_DO.nextToken()), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:189:66: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:189:81: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:190:4: TRY block catchStmtList
                    {
                    TRY105=(Token)match(input,TRY,FOLLOW_TRY_in_statement1387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY.add(TRY105);

                    pushFollow(FOLLOW_block_in_statement1389);
                    block106=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block106.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_statement1391);
                    catchStmtList107=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList107.getTree());


                    // AST REWRITE
                    // elements: TRY, catchStmtList, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 190:32: -> ^( TRY ( block )? ( catchStmtList )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:190:35: ^( TRY ( block )? ( catchStmtList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TryNode(stream_TRY.nextToken()), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:190:50: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:190:57: ( catchStmtList )?
                        if ( stream_catchStmtList.hasNext() ) {
                            adaptor.addChild(root_1, stream_catchStmtList.nextTree());

                        }
                        stream_catchStmtList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:191:4: SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
                    {
                    SWITCH108=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement1415); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH108);

                    LPAREN109=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN109);

                    pushFollow(FOLLOW_expr_in_statement1419);
                    expr110=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr110.getTree());
                    RPAREN111=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1421); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN111);

                    LBRACE112=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement1423); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE112);

                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:191:37: ( caseStmt )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=CASE && LA27_0<=DEFAULT)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:0:0: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statement1425);
                    	    caseStmt113=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_caseStmt.add(caseStmt113.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    RBRACE114=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement1428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE114);



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
                    // 191:55: -> ^( SWITCH ( expr )? ( caseStmt )+ )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:191:58: ^( SWITCH ( expr )? ( caseStmt )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new SwitchNode(stream_SWITCH.nextToken()), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:191:79: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:192:4: RETURN ( expr )? SEMI
                    {
                    RETURN115=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1449); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN115);

                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:192:11: ( expr )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENTIFIER||(LA28_0>=QUES && LA28_0<=LPAREN)||LA28_0==LBRACKET||(LA28_0>=LT && LA28_0<=GT)||LA28_0==NEW||LA28_0==LBRACE||(LA28_0>=UNTYPED && LA28_0<=CAST)||(LA28_0>=LONGLITERAL && LA28_0<=FALSE)) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==SEMI) ) {
                        int LA28_2 = input.LA(2);

                        if ( (synpred52_TinyHaxeTry1()) ) {
                            alt28=1;
                        }
                    }
                    switch (alt28) {
                        case 1 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:192:12: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1452);
                            expr116=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr116.getTree());

                            }
                            break;

                    }

                    SEMI117=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI117);



                    // AST REWRITE
                    // elements: RETURN, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:28: -> ^( RETURN ( expr )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:192:31: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:192:40: ( expr )?
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:193:4: THROW expr SEMI
                    {
                    THROW118=(Token)match(input,THROW,FOLLOW_THROW_in_statement1474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW118);

                    pushFollow(FOLLOW_expr_in_statement1476);
                    expr119=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr119.getTree());
                    SEMI120=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI120);



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
                    // 193:25: -> ^( THROW ( expr )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:193:28: ^( THROW ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_THROW.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:193:36: ( expr )?
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
                case 12 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:194:4: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK121=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1497); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK121);

                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:194:10: ( IDENTIFIER )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENTIFIER) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:194:11: IDENTIFIER
                            {
                            IDENTIFIER122=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1500); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER122);


                            }
                            break;

                    }

                    SEMI123=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI123);



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
                    // 194:32: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:194:35: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:194:43: ( IDENTIFIER )?
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:195:4: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE124=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE124);

                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:195:13: ( IDENTIFIER )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENTIFIER) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:195:14: IDENTIFIER
                            {
                            IDENTIFIER125=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1524); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER125);


                            }
                            break;

                    }

                    SEMI126=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1528); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI126);



                    // AST REWRITE
                    // elements: CONTINUE, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:36: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:195:39: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:195:50: ( IDENTIFIER )?
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:196:4: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement1546);
                    expr127=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr127.getTree());
                    SEMI128=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1549); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:197:4: IDENTIFIER COLON statement
                    {
                    IDENTIFIER129=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER129);

                    COLON130=(Token)match(input,COLON,FOLLOW_COLON_in_statement1557); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON130);

                    pushFollow(FOLLOW_statement_in_statement1559);
                    statement131=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement131.getTree());


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
                    // 197:35: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:197:38: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_COLON.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:197:46: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:197:58: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:198:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI132=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1580); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 26, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class parExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parExpression"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:201:1: parExpression : LPAREN expr RPAREN ;
    public final TinyHaxeTry1Parser.parExpression_return parExpression() throws RecognitionException {
        TinyHaxeTry1Parser.parExpression_return retval = new TinyHaxeTry1Parser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN133=null;
        Token RPAREN135=null;
        TinyHaxeTry1Parser.expr_return expr134 = null;


        Object LPAREN133_tree=null;
        Object RPAREN135_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:202:5: ( LPAREN expr RPAREN )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:202:9: LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN133=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1601); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_parExpression1604);
            expr134=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr134.getTree());
            RPAREN135=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1606); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 27, parExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parExpression"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:205:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI );
    public final TinyHaxeTry1Parser.block_return block() throws RecognitionException {
        TinyHaxeTry1Parser.block_return retval = new TinyHaxeTry1Parser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE136=null;
        Token RBRACE138=null;
        Token SEMI139=null;
        TinyHaxeTry1Parser.blockStmt_return blockStmt137 = null;


        Object LBRACE136_tree=null;
        Object RBRACE138_tree=null;
        Object SEMI139_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:205:8: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LBRACE) ) {
                alt33=1;
            }
            else if ( (LA33_0==SEMI) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:205:10: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE136=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block1621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE136);

                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:205:17: ( blockStmt )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=SEMI && LA32_0<=IDENTIFIER)||(LA32_0>=PUBLIC && LA32_0<=OVERRIDE)||(LA32_0>=QUES && LA32_0<=LPAREN)||LA32_0==LBRACKET||(LA32_0>=LT && LA32_0<=GT)||(LA32_0>=NEW && LA32_0<=IF)||LA32_0==FOR||(LA32_0>=WHILE && LA32_0<=LBRACE)||(LA32_0>=RETURN && LA32_0<=CONTINUE)||(LA32_0>=UNTYPED && LA32_0<=CAST)||(LA32_0>=VAR && LA32_0<=CLASS)||(LA32_0>=LONGLITERAL && LA32_0<=FALSE)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:205:18: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block1624);
                    	    blockStmt137=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt137.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    RBRACE138=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block1628); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE138);



                    // AST REWRITE
                    // elements: RBRACE, blockStmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:37: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:205:40: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE136), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:205:100: ( blockStmt )*
                        while ( stream_blockStmt.hasNext() ) {
                            adaptor.addChild(root_1, stream_blockStmt.nextTree());

                        }
                        stream_blockStmt.reset();
                        adaptor.addChild(root_1, new ExtendedCommonTree(RBRACE, RBRACE138, true));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:206:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI139=(Token)match(input,SEMI,FOLLOW_SEMI_in_block1653); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 28, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class blockStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockStmt"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:209:1: blockStmt : ( varDecl | classDecl | statement );
    public final TinyHaxeTry1Parser.blockStmt_return blockStmt() throws RecognitionException {
        TinyHaxeTry1Parser.blockStmt_return retval = new TinyHaxeTry1Parser.blockStmt_return();
        retval.start = input.LT(1);
        int blockStmt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl140 = null;

        TinyHaxeTry1Parser.classDecl_return classDecl141 = null;

        TinyHaxeTry1Parser.statement_return statement142 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:210:2: ( varDecl | classDecl | statement )
            int alt34=3;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:210:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_blockStmt1666);
                    varDecl140=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl140.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:211:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_blockStmt1671);
                    classDecl141=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl141.getTree());

                    }
                    break;
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:212:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStmt1676);
                    statement142=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement142.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 29, blockStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockStmt"

    public static class breakStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStmt"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:216:1: breakStmt : BREAK SEMI ;
    public final TinyHaxeTry1Parser.breakStmt_return breakStmt() throws RecognitionException {
        TinyHaxeTry1Parser.breakStmt_return retval = new TinyHaxeTry1Parser.breakStmt_return();
        retval.start = input.LT(1);
        int breakStmt_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK143=null;
        Token SEMI144=null;

        Object BREAK143_tree=null;
        Object SEMI144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:217:2: ( BREAK SEMI )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:217:4: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            BREAK143=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt1709); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK143_tree = (Object)adaptor.create(BREAK143);
            adaptor.addChild(root_0, BREAK143_tree);
            }
            SEMI144=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt1711); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 30, breakStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakStmt"

    public static class continueStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueStmt"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:220:1: continueStmt : CONTINUE SEMI ;
    public final TinyHaxeTry1Parser.continueStmt_return continueStmt() throws RecognitionException {
        TinyHaxeTry1Parser.continueStmt_return retval = new TinyHaxeTry1Parser.continueStmt_return();
        retval.start = input.LT(1);
        int continueStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE145=null;
        Token SEMI146=null;

        Object CONTINUE145_tree=null;
        Object SEMI146_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:221:2: ( CONTINUE SEMI )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:221:4: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE145=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt1730); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE145_tree = (Object)adaptor.create(CONTINUE145);
            adaptor.addChild(root_0, CONTINUE145_tree);
            }
            SEMI146=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt1732); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 31, continueStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueStmt"

    public static class caseStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseStmt"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:224:1: caseStmt : ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) );
    public final TinyHaxeTry1Parser.caseStmt_return caseStmt() throws RecognitionException {
        TinyHaxeTry1Parser.caseStmt_return retval = new TinyHaxeTry1Parser.caseStmt_return();
        retval.start = input.LT(1);
        int caseStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CASE147=null;
        Token COLON149=null;
        Token DEFAULT151=null;
        Token COLON152=null;
        TinyHaxeTry1Parser.exprList_return exprList148 = null;

        TinyHaxeTry1Parser.statement_return statement150 = null;

        TinyHaxeTry1Parser.statement_return statement153 = null;


        Object CASE147_tree=null;
        Object COLON149_tree=null;
        Object DEFAULT151_tree=null;
        Object COLON152_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:224:9: ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==CASE) ) {
                alt35=1;
            }
            else if ( (LA35_0==DEFAULT) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:224:11: CASE exprList COLON statement
                    {
                    CASE147=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt1743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE147);

                    pushFollow(FOLLOW_exprList_in_caseStmt1745);
                    exprList148=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList148.getTree());
                    COLON149=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt1747); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON149);

                    pushFollow(FOLLOW_statement_in_caseStmt1749);
                    statement150=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement150.getTree());


                    // AST REWRITE
                    // elements: exprList, statement, CASE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:42: -> ^( CASE ( exprList )? ( statement )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:224:45: ^( CASE ( exprList )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:224:52: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:224:62: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:225:4: DEFAULT COLON statement
                    {
                    DEFAULT151=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt1767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT151);

                    COLON152=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt1769); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON152);

                    pushFollow(FOLLOW_statement_in_caseStmt1771);
                    statement153=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement153.getTree());


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
                    // 225:29: -> ^( DEFAULT ( statement )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:225:32: ^( DEFAULT ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DEFAULT.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:225:42: ( statement )?
                        if ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_statement.nextTree());

                        }
                        stream_statement.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 32, caseStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "caseStmt"

    public static class defaultStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultStmt"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:228:1: defaultStmt : DEFAULT COLON ;
    public final TinyHaxeTry1Parser.defaultStmt_return defaultStmt() throws RecognitionException {
        TinyHaxeTry1Parser.defaultStmt_return retval = new TinyHaxeTry1Parser.defaultStmt_return();
        retval.start = input.LT(1);
        int defaultStmt_StartIndex = input.index();
        Object root_0 = null;

        Token DEFAULT154=null;
        Token COLON155=null;

        Object DEFAULT154_tree=null;
        Object COLON155_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:229:9: ( DEFAULT COLON )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:229:11: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT154=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt1800); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT154_tree = (Object)adaptor.create(DEFAULT154);
            adaptor.addChild(root_0, DEFAULT154_tree);
            }
            COLON155=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt1802); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 33, defaultStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "defaultStmt"

    public static class catchStmtList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchStmtList"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:232:1: catchStmtList : ( catchStmt catchStmtList | );
    public final TinyHaxeTry1Parser.catchStmtList_return catchStmtList() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmtList_return retval = new TinyHaxeTry1Parser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.catchStmt_return catchStmt156 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList157 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:233:2: ( catchStmt catchStmtList | )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==CATCH) ) {
                alt36=1;
            }
            else if ( (LA36_0==EOF||(LA36_0>=SEMI && LA36_0<=IDENTIFIER)||(LA36_0>=PUBLIC && LA36_0<=COLON)||(LA36_0>=LT && LA36_0<=GT)||(LA36_0>=NEW && LA36_0<=DEFAULT)||(LA36_0>=UNTYPED && LA36_0<=CAST)||(LA36_0>=VAR && LA36_0<=CLASS)||(LA36_0>=EXTENDS && LA36_0<=IMPLEMENTS)||(LA36_0>=LONGLITERAL && LA36_0<=FALSE)) ) {
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:233:4: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catchStmt_in_catchStmtList1815);
                    catchStmt156=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt156.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList1817);
                    catchStmtList157=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList157.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:235:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 34, catchStmtList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchStmtList"

    public static class catchStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchStmt"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:237:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) ;
    public final TinyHaxeTry1Parser.catchStmt_return catchStmt() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmt_return retval = new TinyHaxeTry1Parser.catchStmt_return();
        retval.start = input.LT(1);
        int catchStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CATCH158=null;
        Token LPAREN159=null;
        Token RPAREN161=null;
        TinyHaxeTry1Parser.param_return param160 = null;

        TinyHaxeTry1Parser.block_return block162 = null;


        Object CATCH158_tree=null;
        Object LPAREN159_tree=null;
        Object RPAREN161_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:238:9: ( CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:238:11: CATCH LPAREN param RPAREN block
            {
            CATCH158=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt1846); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH158);

            LPAREN159=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt1848); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN159);

            pushFollow(FOLLOW_param_in_catchStmt1850);
            param160=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param160.getTree());
            RPAREN161=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt1852); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN161);

            pushFollow(FOLLOW_block_in_catchStmt1854);
            block162=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block162.getTree());


            // AST REWRITE
            // elements: block, CATCH, param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 238:43: -> ^( CATCH ( param )? ( block )? )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:238:46: ^( CATCH ( param )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CATCH.nextNode(), root_1);

                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:238:54: ( param )?
                if ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:238:61: ( block )?
                if ( stream_block.hasNext() ) {
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 35, catchStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchStmt"

    public static class exprListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprListOpt"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:243:1: exprListOpt : ( exprList | );
    public final TinyHaxeTry1Parser.exprListOpt_return exprListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.exprListOpt_return retval = new TinyHaxeTry1Parser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.exprList_return exprList163 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:244:2: ( exprList | )
            int alt37=2;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
            case COMMA:
            case QUES:
            case THIS:
            case EQ:
            case PLUSEQ:
            case SUBEQ:
            case SLASHEQ:
            case PERCENTEQ:
            case AMPEQ:
            case FUNCTION:
            case LPAREN:
            case LBRACKET:
            case LT:
            case GT:
            case NEW:
            case LBRACE:
            case UNTYPED:
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
            case BANG:
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
                alt37=1;
                }
                break;
            case RBRACKET:
                {
                int LA37_2 = input.LA(2);

                if ( (synpred67_TinyHaxeTry1()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
                }
                break;
            case RPAREN:
                {
                int LA37_3 = input.LA(2);

                if ( (synpred67_TinyHaxeTry1()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:244:4: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprList_in_exprListOpt1880);
                    exprList163=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList163.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:246:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 36, exprListOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprListOpt"

    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:248:1: exprList : expr ( COMMA expr )* ;
    public final TinyHaxeTry1Parser.exprList_return exprList() throws RecognitionException {
        TinyHaxeTry1Parser.exprList_return retval = new TinyHaxeTry1Parser.exprList_return();
        retval.start = input.LT(1);
        int exprList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA165=null;
        TinyHaxeTry1Parser.expr_return expr164 = null;

        TinyHaxeTry1Parser.expr_return expr166 = null;


        Object COMMA165_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:248:9: ( expr ( COMMA expr )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:248:11: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList1900);
            expr164=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr164.getTree());
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:248:16: ( COMMA expr )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:248:17: COMMA expr
            	    {
            	    COMMA165=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList1903); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_exprList1906);
            	    expr166=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr166.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
            if ( state.backtracking>0 ) { memoize(input, 37, exprList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprList"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:251:1: expr : ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) );
    public final TinyHaxeTry1Parser.expr_return expr() throws RecognitionException {
        TinyHaxeTry1Parser.expr_return retval = new TinyHaxeTry1Parser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        Token UNTYPED168=null;
        TinyHaxeTry1Parser.assignExpr_return assignExpr167 = null;

        TinyHaxeTry1Parser.assignExpr_return assignExpr169 = null;


        Object UNTYPED168_tree=null;
        RewriteRuleTokenStream stream_UNTYPED=new RewriteRuleTokenStream(adaptor,"token UNTYPED");
        RewriteRuleSubtreeStream stream_assignExpr=new RewriteRuleSubtreeStream(adaptor,"rule assignExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:251:6: ( assignExpr | UNTYPED assignExpr -> ^( UNTYPED assignExpr ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==EOF||(LA39_0>=SEMI && LA39_0<=IDENTIFIER)||(LA39_0>=COMMA && LA39_0<=COLON)||(LA39_0>=LT && LA39_0<=GT)||LA39_0==NEW||LA39_0==IN||(LA39_0>=LBRACE && LA39_0<=RBRACE)||(LA39_0>=ELLIPSIS && LA39_0<=CAST)||(LA39_0>=EXTENDS && LA39_0<=IMPLEMENTS)||(LA39_0>=LONGLITERAL && LA39_0<=FALSE)) ) {
                alt39=1;
            }
            else if ( (LA39_0==UNTYPED) ) {
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:251:8: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_expr1919);
                    assignExpr167=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr167.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:252:4: UNTYPED assignExpr
                    {
                    UNTYPED168=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr1924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNTYPED.add(UNTYPED168);

                    pushFollow(FOLLOW_assignExpr_in_expr1926);
                    assignExpr169=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignExpr.add(assignExpr169.getTree());


                    // AST REWRITE
                    // elements: assignExpr, UNTYPED
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 252:23: -> ^( UNTYPED assignExpr )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:252:26: ^( UNTYPED assignExpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_UNTYPED.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_assignExpr.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 38, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class assignExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:255:1: assignExpr : iterExpr ( assignOp iterExpr )* ;
    public final TinyHaxeTry1Parser.assignExpr_return assignExpr() throws RecognitionException {
        TinyHaxeTry1Parser.assignExpr_return retval = new TinyHaxeTry1Parser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr170 = null;

        TinyHaxeTry1Parser.assignOp_return assignOp171 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr172 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:256:9: ( iterExpr ( assignOp iterExpr )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:256:12: iterExpr ( assignOp iterExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iterExpr_in_assignExpr1954);
            iterExpr170=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr170.getTree());
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:256:21: ( assignOp iterExpr )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=EQ && LA40_0<=AMPEQ)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:256:22: assignOp iterExpr
            	    {
            	    pushFollow(FOLLOW_assignOp_in_assignExpr1957);
            	    assignOp171=assignOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp171.getTree(), root_0);
            	    pushFollow(FOLLOW_iterExpr_in_assignExpr1960);
            	    iterExpr172=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr172.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
            if ( state.backtracking>0 ) { memoize(input, 39, assignExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExpr"

    public static class iterExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterExpr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:259:1: iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
    public final TinyHaxeTry1Parser.iterExpr_return iterExpr() throws RecognitionException {
        TinyHaxeTry1Parser.iterExpr_return retval = new TinyHaxeTry1Parser.iterExpr_return();
        retval.start = input.LT(1);
        int iterExpr_StartIndex = input.index();
        Object root_0 = null;

        Token ELLIPSIS174=null;
        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr173 = null;

        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr175 = null;


        Object ELLIPSIS174_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:259:9: ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:259:11: ternaryExpr ( ELLIPSIS ternaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_iterExpr1973);
            ternaryExpr173=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr173.getTree());
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:259:23: ( ELLIPSIS ternaryExpr )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==ELLIPSIS) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:259:24: ELLIPSIS ternaryExpr
            	    {
            	    ELLIPSIS174=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr1976); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELLIPSIS174_tree = (Object)adaptor.create(ELLIPSIS174);
            	    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS174_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ternaryExpr_in_iterExpr1979);
            	    ternaryExpr175=ternaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr175.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 40, iterExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iterExpr"

    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:262:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
    public final TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        TinyHaxeTry1Parser.ternaryExpr_return retval = new TinyHaxeTry1Parser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        Token QUES177=null;
        Token COLON179=null;
        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr176 = null;

        TinyHaxeTry1Parser.expr_return expr178 = null;

        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr180 = null;


        Object QUES177_tree=null;
        Object COLON179_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:263:2: ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:263:4: logicOrExpr ( QUES expr COLON logicOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr1999);
            logicOrExpr176=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr176.getTree());
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:263:16: ( QUES expr COLON logicOrExpr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==QUES) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:263:17: QUES expr COLON logicOrExpr
            	    {
            	    QUES177=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2002); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    QUES177_tree = (Object)adaptor.create(QUES177);
            	    root_0 = (Object)adaptor.becomeRoot(QUES177_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_in_ternaryExpr2005);
            	    expr178=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr178.getTree());
            	    COLON179=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2007); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2010);
            	    logicOrExpr180=logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr180.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 41, ternaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"

    public static class logicOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicOrExpr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:266:1: logicOrExpr : logicAndExpr ( BARBAR logicAndExpr )* ;
    public final TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicOrExpr_return retval = new TinyHaxeTry1Parser.logicOrExpr_return();
        retval.start = input.LT(1);
        int logicOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BARBAR182=null;
        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr181 = null;

        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr183 = null;


        Object BARBAR182_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:267:2: ( logicAndExpr ( BARBAR logicAndExpr )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:267:4: logicAndExpr ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2038);
            logicAndExpr181=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr181.getTree());
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:267:17: ( BARBAR logicAndExpr )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==BARBAR) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:267:18: BARBAR logicAndExpr
            	    {
            	    BARBAR182=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2041); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR182_tree = (Object)adaptor.create(BARBAR182);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR182_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2044);
            	    logicAndExpr183=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr183.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 42, logicOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicOrExpr"

    public static class logicAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicAndExpr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:270:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
    public final TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicAndExpr_return retval = new TinyHaxeTry1Parser.logicAndExpr_return();
        retval.start = input.LT(1);
        int logicAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token AMPAMP185=null;
        TinyHaxeTry1Parser.cmpExpr_return cmpExpr184 = null;

        TinyHaxeTry1Parser.cmpExpr_return cmpExpr186 = null;


        Object AMPAMP185_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:271:2: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:271:4: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:271:4: ( cmpExpr )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:271:5: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2065);
            cmpExpr184=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr184.getTree());

            }

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:271:14: ( AMPAMP cmpExpr )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==AMPAMP) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:271:15: AMPAMP cmpExpr
            	    {
            	    AMPAMP185=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2069); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP185_tree = (Object)adaptor.create(AMPAMP185);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP185_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2072);
            	    cmpExpr186=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr186.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 43, logicAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicAndExpr"

    public static class cmpExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cmpExpr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:1: cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* ;
    public final TinyHaxeTry1Parser.cmpExpr_return cmpExpr() throws RecognitionException {
        TinyHaxeTry1Parser.cmpExpr_return retval = new TinyHaxeTry1Parser.cmpExpr_return();
        retval.start = input.LT(1);
        int cmpExpr_StartIndex = input.index();
        Object root_0 = null;

        Token EQEQ188=null;
        Token BANGEQ189=null;
        Token GTEQ190=null;
        Token LTEQ191=null;
        Token GT192=null;
        Token LT193=null;
        TinyHaxeTry1Parser.bitExpr_return bitExpr187 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr194 = null;


        Object EQEQ188_tree=null;
        Object BANGEQ189_tree=null;
        Object GTEQ190_tree=null;
        Object LTEQ191_tree=null;
        Object GT192_tree=null;
        Object LT193_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:9: ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:11: ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:11: ( bitExpr )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:12: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2086);
            bitExpr187=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr187.getTree());

            }

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:21: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=LT && LA46_0<=GT)||(LA46_0>=EQEQ && LA46_0<=LTEQ)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:22: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
            	    {
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:22: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
            	    int alt45=6;
            	    switch ( input.LA(1) ) {
            	    case EQEQ:
            	        {
            	        alt45=1;
            	        }
            	        break;
            	    case BANGEQ:
            	        {
            	        alt45=2;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt45=3;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt45=4;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt45=5;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt45=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 45, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt45) {
            	        case 1 :
            	            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:23: EQEQ
            	            {
            	            EQEQ188=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2091); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ188_tree = (Object)adaptor.create(EQEQ188);
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ188_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:30: BANGEQ
            	            {
            	            BANGEQ189=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2095); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ189_tree = (Object)adaptor.create(BANGEQ189);
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ189_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:40: GTEQ
            	            {
            	            GTEQ190=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2100); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ190_tree = (Object)adaptor.create(GTEQ190);
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ190_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:48: LTEQ
            	            {
            	            LTEQ191=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2105); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ191_tree = (Object)adaptor.create(LTEQ191);
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ191_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:56: GT
            	            {
            	            GT192=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2110); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT192_tree = (Object)adaptor.create(GT192);
            	            root_0 = (Object)adaptor.becomeRoot(GT192_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:274:62: LT
            	            {
            	            LT193=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2115); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT193_tree = (Object)adaptor.create(LT193);
            	            root_0 = (Object)adaptor.becomeRoot(LT193_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2120);
            	    bitExpr194=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr194.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 44, cmpExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cmpExpr"

    public static class bitExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitExpr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:277:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
    public final TinyHaxeTry1Parser.bitExpr_return bitExpr() throws RecognitionException {
        TinyHaxeTry1Parser.bitExpr_return retval = new TinyHaxeTry1Parser.bitExpr_return();
        retval.start = input.LT(1);
        int bitExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BAR196=null;
        Token AMP198=null;
        Token CARET200=null;
        TinyHaxeTry1Parser.shiftExpr_return shiftExpr195 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr197 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr199 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr201 = null;


        Object BAR196_tree=null;
        Object AMP198_tree=null;
        Object CARET200_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:277:9: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:277:11: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:277:11: ( shiftExpr )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:277:12: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2134);
            shiftExpr195=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr195.getTree());

            }

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:277:23: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            loop47:
            do {
                int alt47=4;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    alt47=1;
                    }
                    break;
                case AMP:
                    {
                    alt47=2;
                    }
                    break;
                case CARET:
                    {
                    alt47=3;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:277:24: BAR shiftExpr
            	    {
            	    BAR196=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2138); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR196_tree = (Object)adaptor.create(BAR196);
            	    root_0 = (Object)adaptor.becomeRoot(BAR196_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2141);
            	    shiftExpr197=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr197.getTree());

            	    }
            	    break;
            	case 2 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:277:41: AMP shiftExpr
            	    {
            	    AMP198=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2145); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP198_tree = (Object)adaptor.create(AMP198);
            	    root_0 = (Object)adaptor.becomeRoot(AMP198_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2148);
            	    shiftExpr199=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr199.getTree());

            	    }
            	    break;
            	case 3 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:277:57: CARET shiftExpr
            	    {
            	    CARET200=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2151); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET200_tree = (Object)adaptor.create(CARET200);
            	    root_0 = (Object)adaptor.becomeRoot(CARET200_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2154);
            	    shiftExpr201=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr201.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
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
            if ( state.backtracking>0 ) { memoize(input, 45, bitExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitExpr"

    public static class shiftExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:280:1: shiftExpr : ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* ;
    public final TinyHaxeTry1Parser.shiftExpr_return shiftExpr() throws RecognitionException {
        TinyHaxeTry1Parser.shiftExpr_return retval = new TinyHaxeTry1Parser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LTLT203=null;
        Token GT205=null;
        Token GT206=null;
        Token GTGTGT208=null;
        TinyHaxeTry1Parser.addExpr_return addExpr202 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr204 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr207 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr209 = null;


        Object LTLT203_tree=null;
        Object GT205_tree=null;
        Object GT206_tree=null;
        Object GTGTGT208_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:2: ( ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:4: ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:4: ( addExpr )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:5: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2168);
            addExpr202=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr202.getTree());

            }

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:14: ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            loop48:
            do {
                int alt48=4;
                switch ( input.LA(1) ) {
                case GT:
                    {
                    int LA48_2 = input.LA(2);

                    if ( (LA48_2==GT) ) {
                        int LA48_5 = input.LA(3);

                        if ( (synpred85_TinyHaxeTry1()) ) {
                            alt48=2;
                        }


                    }


                    }
                    break;
                case LTLT:
                    {
                    alt48=1;
                    }
                    break;
                case GTGTGT:
                    {
                    alt48=3;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:15: LTLT addExpr
            	    {
            	    LTLT203=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2172); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT203_tree = (Object)adaptor.create(LTLT203);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT203_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2176);
            	    addExpr204=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr204.getTree());

            	    }
            	    break;
            	case 2 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:32: ( GT GT ) addExpr
            	    {
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:32: ( GT GT )
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:33: GT GT
            	    {
            	    GT205=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2181); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT205_tree = (Object)adaptor.create(GT205);
            	    adaptor.addChild(root_0, GT205_tree);
            	    }
            	    GT206=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2183); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT206_tree = (Object)adaptor.create(GT206);
            	    adaptor.addChild(root_0, GT206_tree);
            	    }

            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2188);
            	    addExpr207=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr207.getTree());

            	    }
            	    break;
            	case 3 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:52: GTGTGT addExpr
            	    {
            	    GTGTGT208=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2192); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT208_tree = (Object)adaptor.create(GTGTGT208);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT208_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2195);
            	    addExpr209=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr209.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 46, shiftExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:284:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
    public final TinyHaxeTry1Parser.addExpr_return addExpr() throws RecognitionException {
        TinyHaxeTry1Parser.addExpr_return retval = new TinyHaxeTry1Parser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUS211=null;
        Token SUB212=null;
        TinyHaxeTry1Parser.multExpr_return multExpr210 = null;

        TinyHaxeTry1Parser.multExpr_return multExpr213 = null;


        Object PLUS211_tree=null;
        Object SUB212_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:284:9: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:284:12: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:284:12: ( multExpr )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:284:13: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2209);
            multExpr210=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr210.getTree());

            }

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:284:23: ( ( PLUS | SUB ) multExpr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=PLUS && LA50_0<=SUB)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:284:24: ( PLUS | SUB ) multExpr
            	    {
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:284:24: ( PLUS | SUB )
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==PLUS) ) {
            	        alt49=1;
            	    }
            	    else if ( (LA49_0==SUB) ) {
            	        alt49=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:284:25: PLUS
            	            {
            	            PLUS211=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2214); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS211_tree = (Object)adaptor.create(PLUS211);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS211_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:284:33: SUB
            	            {
            	            SUB212=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2219); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB212_tree = (Object)adaptor.create(SUB212);
            	            root_0 = (Object)adaptor.becomeRoot(SUB212_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2223);
            	    multExpr213=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr213.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 47, addExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:287:1: multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
    public final TinyHaxeTry1Parser.multExpr_return multExpr() throws RecognitionException {
        TinyHaxeTry1Parser.multExpr_return retval = new TinyHaxeTry1Parser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token STAR215=null;
        Token SLASH216=null;
        Token PERCENT217=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr214 = null;

        TinyHaxeTry1Parser.prefixExpr_return prefixExpr218 = null;


        Object STAR215_tree=null;
        Object SLASH216_tree=null;
        Object PERCENT217_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:287:9: ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:287:11: ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:287:11: ( prefixExpr )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:287:12: prefixExpr
            {
            pushFollow(FOLLOW_prefixExpr_in_multExpr2237);
            prefixExpr214=prefixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr214.getTree());

            }

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:287:24: ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=STAR && LA52_0<=PERCENT)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:287:25: ( STAR | SLASH | PERCENT ) prefixExpr
            	    {
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:287:25: ( STAR | SLASH | PERCENT )
            	    int alt51=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt51=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt51=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt51=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 51, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt51) {
            	        case 1 :
            	            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:287:26: STAR
            	            {
            	            STAR215=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2242); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR215_tree = (Object)adaptor.create(STAR215);
            	            root_0 = (Object)adaptor.becomeRoot(STAR215_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:287:32: SLASH
            	            {
            	            SLASH216=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2245); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH216_tree = (Object)adaptor.create(SLASH216);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH216_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:287:39: PERCENT
            	            {
            	            PERCENT217=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2248); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT217_tree = (Object)adaptor.create(PERCENT217);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT217_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2252);
            	    prefixExpr218=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr218.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 48, multExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:290:1: prefixExpr : ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr );
    public final TinyHaxeTry1Parser.prefixExpr_return prefixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.prefixExpr_return retval = new TinyHaxeTry1Parser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set219=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr220 = null;

        TinyHaxeTry1Parser.newExpr_return newExpr221 = null;

        TinyHaxeTry1Parser.cast_return cast222 = null;

        TinyHaxeTry1Parser.suffixExpr_return suffixExpr223 = null;


        Object set219_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:291:9: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr )
            int alt53=4;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                int LA53_1 = input.LA(2);

                if ( (synpred96_TinyHaxeTry1()) ) {
                    alt53=1;
                }
                else if ( (true) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
                }
                break;
            case NEW:
                {
                alt53=2;
                }
                break;
            case CAST:
                {
                alt53=3;
                }
                break;
            case EOF:
            case SEMI:
            case IDENTIFIER:
            case COMMA:
            case QUES:
            case THIS:
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
                alt53=4;
                }
                break;
            case SUBSUB:
                {
                int LA53_5 = input.LA(2);

                if ( (synpred96_TinyHaxeTry1()) ) {
                    alt53=1;
                }
                else if ( (true) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 5, input);

                    throw nvae;
                }
                }
                break;
            case SUB:
                {
                int LA53_6 = input.LA(2);

                if ( (synpred96_TinyHaxeTry1()) ) {
                    alt53=1;
                }
                else if ( (true) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 6, input);

                    throw nvae;
                }
                }
                break;
            case BANG:
            case TILDE:
                {
                alt53=1;
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:291:11: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    set219=(Token)input.LT(1);
                    if ( input.LA(1)==SUB||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set219));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2285);
                    prefixExpr220=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr220.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:292:11: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_prefixExpr2297);
                    newExpr221=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr221.getTree());

                    }
                    break;
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:293:11: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cast_in_prefixExpr2309);
                    cast222=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast222.getTree());

                    }
                    break;
                case 4 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:294:11: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr2321);
                    suffixExpr223=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr223.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 49, prefixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixExpr"

    public static class suffixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "suffixExpr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:297:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );
    public final TinyHaxeTry1Parser.suffixExpr_return suffixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.suffixExpr_return retval = new TinyHaxeTry1Parser.suffixExpr_return();
        retval.start = input.LT(1);
        int suffixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN225=null;
        Token RPAREN227=null;
        Token LBRACKET229=null;
        Token RBRACKET231=null;
        Token PLUSPLUS233=null;
        Token SUBSUB235=null;
        TinyHaxeTry1Parser.value_return value224 = null;

        TinyHaxeTry1Parser.exprListOpt_return exprListOpt226 = null;

        TinyHaxeTry1Parser.value_return value228 = null;

        TinyHaxeTry1Parser.expr_return expr230 = null;

        TinyHaxeTry1Parser.value_return value232 = null;

        TinyHaxeTry1Parser.value_return value234 = null;

        TinyHaxeTry1Parser.value_return value236 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt237 = null;


        Object LPAREN225_tree=null;
        Object RPAREN227_tree=null;
        Object LBRACKET229_tree=null;
        Object RBRACKET231_tree=null;
        Object PLUSPLUS233_tree=null;
        Object SUBSUB235_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:298:2: ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt )
            int alt54=5;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:298:4: value LPAREN exprListOpt RPAREN
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2340);
                    value224=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value224.getTree());
                    LPAREN225=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_suffixExpr2342); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN225);

                    pushFollow(FOLLOW_exprListOpt_in_suffixExpr2344);
                    exprListOpt226=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt226.getTree());
                    RPAREN227=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_suffixExpr2346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN227);



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
                    // 298:36: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:298:39: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:298:93: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:298:100: ( exprListOpt )?
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:299:4: value LBRACKET expr RBRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2367);
                    value228=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value228.getTree());
                    LBRACKET229=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_suffixExpr2369); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACKET229_tree = (Object)adaptor.create(LBRACKET229);
                    adaptor.addChild(root_0, LBRACKET229_tree);
                    }
                    pushFollow(FOLLOW_expr_in_suffixExpr2371);
                    expr230=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr230.getTree());
                    RBRACKET231=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_suffixExpr2373); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACKET231_tree = (Object)adaptor.create(RBRACKET231);
                    adaptor.addChild(root_0, RBRACKET231_tree);
                    }

                    }
                    break;
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:300:4: value PLUSPLUS
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2378);
                    value232=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value232.getTree());
                    PLUSPLUS233=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr2380); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS233);



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
                    // 300:22: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:300:25: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:300:79: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:300:86: ( PLUSPLUS )?
                        if ( stream_PLUSPLUS.hasNext() ) {
                            adaptor.addChild(root_1, stream_PLUSPLUS.nextNode());

                        }
                        stream_PLUSPLUS.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:301:4: value SUBSUB
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2404);
                    value234=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value234.getTree());
                    SUBSUB235=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr2406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSUB.add(SUBSUB235);



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
                    // 301:20: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:301:23: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:301:77: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        adaptor.addChild(root_1, stream_SUBSUB.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:302:4: value typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2429);
                    value236=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value236.getTree());
                    pushFollow(FOLLOW_typeParamOpt_in_suffixExpr2431);
                    typeParamOpt237=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt237.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 50, suffixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "suffixExpr"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:305:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );
    public final TinyHaxeTry1Parser.value_return value() throws RecognitionException {
        TinyHaxeTry1Parser.value_return retval = new TinyHaxeTry1Parser.value_return();
        retval.start = input.LT(1);
        int value_StartIndex = input.index();
        Object root_0 = null;

        Token NULL241=null;
        Token LPAREN243=null;
        Token RPAREN246=null;
        TinyHaxeTry1Parser.funcLit_return funcLit238 = null;

        TinyHaxeTry1Parser.arrayLit_return arrayLit239 = null;

        TinyHaxeTry1Parser.objLit_return objLit240 = null;

        TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol242 = null;

        TinyHaxeTry1Parser.expr_return expr244 = null;

        TinyHaxeTry1Parser.statement_return statement245 = null;

        TinyHaxeTry1Parser.dotIdent_return dotIdent247 = null;


        Object NULL241_tree=null;
        Object LPAREN243_tree=null;
        Object RPAREN246_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:305:7: ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | )
            int alt56=8;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:305:9: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcLit_in_value2440);
                    funcLit238=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit238.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:306:4: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLit_in_value2446);
                    arrayLit239=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit239.getTree());

                    }
                    break;
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:307:14: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objLit_in_value2461);
                    objLit240=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit240.getTree());

                    }
                    break;
                case 4 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:308:14: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL241=(Token)match(input,NULL,FOLLOW_NULL_in_value2476); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL241_tree = (Object)adaptor.create(NULL241);
                    adaptor.addChild(root_0, NULL241_tree);
                    }

                    }
                    break;
                case 5 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:309:14: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elementarySymbol_in_value2491);
                    elementarySymbol242=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol242.getTree());

                    }
                    break;
                case 6 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:310:14: LPAREN ( expr | statement ) RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN243=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value2506); if (state.failed) return retval;
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:310:22: ( expr | statement )
                    int alt55=2;
                    alt55 = dfa55.predict(input);
                    switch (alt55) {
                        case 1 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:310:23: expr
                            {
                            pushFollow(FOLLOW_expr_in_value2510);
                            expr244=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr244.getTree());

                            }
                            break;
                        case 2 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:310:28: statement
                            {
                            pushFollow(FOLLOW_statement_in_value2512);
                            statement245=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement245.getTree());

                            }
                            break;

                    }

                    RPAREN246=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value2515); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:311:11: dotIdent
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotIdent_in_value2528);
                    dotIdent247=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent247.getTree());

                    }
                    break;
                case 8 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:313:9: 
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
            if ( state.backtracking>0 ) { memoize(input, 51, value_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class newExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpr"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:315:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) ;
    public final TinyHaxeTry1Parser.newExpr_return newExpr() throws RecognitionException {
        TinyHaxeTry1Parser.newExpr_return retval = new TinyHaxeTry1Parser.newExpr_return();
        retval.start = input.LT(1);
        int newExpr_StartIndex = input.index();
        Object root_0 = null;

        Token NEW248=null;
        Token LPAREN250=null;
        Token RPAREN252=null;
        TinyHaxeTry1Parser.type_return type249 = null;

        TinyHaxeTry1Parser.exprListOpt_return exprListOpt251 = null;


        Object NEW248_tree=null;
        Object LPAREN250_tree=null;
        Object RPAREN252_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:316:2: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:316:4: NEW type LPAREN exprListOpt RPAREN
            {
            NEW248=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr2575); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW248);

            pushFollow(FOLLOW_type_in_newExpr2577);
            type249=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type249.getTree());
            LPAREN250=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr2579); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN250);

            pushFollow(FOLLOW_exprListOpt_in_newExpr2581);
            exprListOpt251=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt251.getTree());
            RPAREN252=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr2583); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN252);



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
            // 316:39: -> ^( NEW ( type )? ( exprListOpt )? )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:316:42: ^( NEW ( type )? ( exprListOpt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_NEW.nextNode(), root_1);

                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:316:48: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:316:54: ( exprListOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 52, newExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newExpr"

    public static class cast_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cast"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:319:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) );
    public final TinyHaxeTry1Parser.cast_return cast() throws RecognitionException {
        TinyHaxeTry1Parser.cast_return retval = new TinyHaxeTry1Parser.cast_return();
        retval.start = input.LT(1);
        int cast_StartIndex = input.index();
        Object root_0 = null;

        Token CAST253=null;
        Token LPAREN254=null;
        Token COMMA256=null;
        Token RPAREN258=null;
        Token CAST259=null;
        Token LPAREN260=null;
        Token RPAREN262=null;
        TinyHaxeTry1Parser.expr_return expr255 = null;

        TinyHaxeTry1Parser.funcType_return funcType257 = null;

        TinyHaxeTry1Parser.expr_return expr261 = null;


        Object CAST253_tree=null;
        Object LPAREN254_tree=null;
        Object COMMA256_tree=null;
        Object RPAREN258_tree=null;
        Object CAST259_tree=null;
        Object LPAREN260_tree=null;
        Object RPAREN262_tree=null;
        RewriteRuleTokenStream stream_CAST=new RewriteRuleTokenStream(adaptor,"token CAST");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:319:9: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==CAST) ) {
                int LA58_1 = input.LA(2);

                if ( (synpred112_TinyHaxeTry1()) ) {
                    alt58=1;
                }
                else if ( (true) ) {
                    alt58=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:319:11: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST253=(Token)match(input,CAST,FOLLOW_CAST_in_cast2609); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST253);

                    LPAREN254=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast2611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN254);

                    pushFollow(FOLLOW_expr_in_cast2613);
                    expr255=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr255.getTree());
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:319:28: ( COMMA funcType )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==COMMA) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:319:29: COMMA funcType
                            {
                            COMMA256=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast2616); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA256);

                            pushFollow(FOLLOW_funcType_in_cast2618);
                            funcType257=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType257.getTree());

                            }
                            break;

                    }

                    RPAREN258=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast2622); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN258);



                    // AST REWRITE
                    // elements: expr, CAST, funcType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 319:54: -> ^( CAST ( expr )? ( funcType )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:319:57: ^( CAST ( expr )? ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:319:64: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:319:70: ( funcType )?
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:320:4: CAST LPAREN expr RPAREN
                    {
                    CAST259=(Token)match(input,CAST,FOLLOW_CAST_in_cast2640); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST259);

                    LPAREN260=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast2642); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN260);

                    pushFollow(FOLLOW_expr_in_cast2644);
                    expr261=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr261.getTree());
                    RPAREN262=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast2646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN262);



                    // AST REWRITE
                    // elements: CAST, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 320:31: -> ^( CAST ( expr )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:320:34: ^( CAST ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:320:41: ( expr )?
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
            if ( state.backtracking>0 ) { memoize(input, 53, cast_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cast"

    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevelDecl"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:326:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelDecl_return retval = new TinyHaxeTry1Parser.topLevelDecl_return();
        retval.start = input.LT(1);
        int topLevelDecl_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.classDecl_return classDecl263 = null;

        TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl264 = null;

        TinyHaxeTry1Parser.enumDecl_return enumDecl265 = null;

        TinyHaxeTry1Parser.typedefDecl_return typedefDecl266 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:327:2: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt59=4;
            switch ( input.LA(1) ) {
            case EXTERN:
            case CLASS:
                {
                alt59=1;
                }
                break;
            case INTERFACE:
                {
                alt59=2;
                }
                break;
            case ENUM:
                {
                alt59=3;
                }
                break;
            case TYPEDEF:
                {
                alt59=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:327:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_topLevelDecl2680);
                    classDecl263=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl263.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:328:4: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl2685);
                    interfaceDecl264=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl264.getTree());

                    }
                    break;
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:329:11: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl2697);
                    enumDecl265=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl265.getTree());

                    }
                    break;
                case 4 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:330:4: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl2702);
                    typedefDecl266=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl266.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 54, topLevelDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"

    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDecl"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:333:1: enumDecl : ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) ;
    public final TinyHaxeTry1Parser.enumDecl_return enumDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumDecl_return retval = new TinyHaxeTry1Parser.enumDecl_return();
        retval.start = input.LT(1);
        int enumDecl_StartIndex = input.index();
        Object root_0 = null;

        Token ENUM267=null;
        Token IDENTIFIER268=null;
        Token LBRACE270=null;
        Token RBRACE272=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt269 = null;

        TinyHaxeTry1Parser.enumBody_return enumBody271 = null;


        Object ENUM267_tree=null;
        Object IDENTIFIER268_tree=null;
        Object LBRACE270_tree=null;
        Object RBRACE272_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:333:9: ( ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:333:11: ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
            {
            ENUM267=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl2712); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM267);

            IDENTIFIER268=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl2714); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER268);

            pushFollow(FOLLOW_typeParamOpt_in_enumDecl2716);
            typeParamOpt269=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt269.getTree());
            LBRACE270=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl2718); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE270);

            pushFollow(FOLLOW_enumBody_in_enumDecl2720);
            enumBody271=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody271.getTree());
            RBRACE272=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl2722); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE272);



            // AST REWRITE
            // elements: enumBody, ENUM, typeParamOpt, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 333:63: -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:333:66: ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:333:73: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:333:85: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:333:99: ( enumBody )?
                if ( stream_enumBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_enumBody.nextTree());

                }
                stream_enumBody.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 55, enumDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumDecl"

    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumBody"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:336:1: enumBody : ( enumValueDecl )* ;
    public final TinyHaxeTry1Parser.enumBody_return enumBody() throws RecognitionException {
        TinyHaxeTry1Parser.enumBody_return retval = new TinyHaxeTry1Parser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl273 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:336:9: ( ( enumValueDecl )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:336:11: ( enumValueDecl )*
            {
            root_0 = (Object)adaptor.nil();

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:336:11: ( enumValueDecl )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==IDENTIFIER) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:336:12: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody2748);
            	    enumValueDecl273=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValueDecl273.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
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
            if ( state.backtracking>0 ) { memoize(input, 56, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBody"

    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValueDecl"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:339:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) );
    public final TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumValueDecl_return retval = new TinyHaxeTry1Parser.enumValueDecl_return();
        retval.start = input.LT(1);
        int enumValueDecl_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER274=null;
        Token LPAREN275=null;
        Token RPAREN277=null;
        Token SEMI278=null;
        Token IDENTIFIER279=null;
        Token SEMI280=null;
        TinyHaxeTry1Parser.paramList_return paramList276 = null;


        Object IDENTIFIER274_tree=null;
        Object LPAREN275_tree=null;
        Object RPAREN277_tree=null;
        Object SEMI278_tree=null;
        Object IDENTIFIER279_tree=null;
        Object SEMI280_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:340:2: ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==IDENTIFIER) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==LPAREN) ) {
                    alt61=1;
                }
                else if ( (LA61_1==SEMI) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:340:4: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    IDENTIFIER274=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl2767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER274);

                    LPAREN275=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl2769); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN275);

                    pushFollow(FOLLOW_paramList_in_enumValueDecl2771);
                    paramList276=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList276.getTree());
                    RPAREN277=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl2773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN277);

                    SEMI278=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl2775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI278);



                    // AST REWRITE
                    // elements: paramList, IDENTIFIER, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 340:44: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:340:47: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER274), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:340:89: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                        }
                        stream_IDENTIFIER.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:340:111: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:341:4: IDENTIFIER SEMI
                    {
                    IDENTIFIER279=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl2801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER279);

                    SEMI280=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl2803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI280);



                    // AST REWRITE
                    // elements: IDENTIFIER, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 341:23: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:341:26: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER279), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:341:68: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                        }
                        stream_IDENTIFIER.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 57, enumValueDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"

    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclList"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:345:1: varDeclList : varDecl varDeclList ;
    public final TinyHaxeTry1Parser.varDeclList_return varDeclList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclList_return retval = new TinyHaxeTry1Parser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl281 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList282 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:346:2: ( varDecl varDeclList )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:346:4: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDecl_in_varDeclList2842);
            varDecl281=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl281.getTree());
            pushFollow(FOLLOW_varDeclList_in_varDeclList2844);
            varDeclList282=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList282.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 58, varDeclList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclList"

    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDecl"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:349:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) ;
    public final TinyHaxeTry1Parser.varDecl_return varDecl() throws RecognitionException {
        TinyHaxeTry1Parser.varDecl_return retval = new TinyHaxeTry1Parser.varDecl_return();
        retval.start = input.LT(1);
        int varDecl_StartIndex = input.index();
        Object root_0 = null;

        Token VAR284=null;
        Token SEMI286=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList283 = null;

        TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList285 = null;


        Object VAR284_tree=null;
        Object SEMI286_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_varDeclPartList=new RewriteRuleSubtreeStream(adaptor,"rule varDeclPartList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:349:9: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:349:11: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:349:11: ( declAttrList )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=PUBLIC && LA62_0<=OVERRIDE)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:349:12: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl2856);
                    declAttrList283=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList283.getTree());

                    }
                    break;

            }

            VAR284=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl2860); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR284);

            pushFollow(FOLLOW_varDeclPartList_in_varDecl2862);
            varDeclPartList285=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList285.getTree());
            SEMI286=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl2864); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI286);



            // AST REWRITE
            // elements: varDeclPartList, VAR, declAttrList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 349:52: -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:349:55: ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, VAR284), root_1);

                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:349:83: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:349:97: ( varDeclPartList )?
                if ( stream_varDeclPartList.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDeclPartList.nextTree());

                }
                stream_varDeclPartList.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 59, varDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDecl"

    public static class varDeclPartList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPartList"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:352:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
    public final TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclPartList_return retval = new TinyHaxeTry1Parser.varDeclPartList_return();
        retval.start = input.LT(1);
        int varDeclPartList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA288=null;
        TinyHaxeTry1Parser.varDeclPart_return varDeclPart287 = null;

        TinyHaxeTry1Parser.varDeclPart_return varDeclPart289 = null;


        Object COMMA288_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:353:2: ( varDeclPart ( COMMA varDeclPart )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:353:4: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList2895);
            varDeclPart287=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart287.getTree());
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:353:16: ( COMMA varDeclPart )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==COMMA) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:353:17: COMMA varDeclPart
            	    {
            	    COMMA288=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList2898); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList2901);
            	    varDeclPart289=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart289.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
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
            if ( state.backtracking>0 ) { memoize(input, 60, varDeclPartList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPartList"

    public static class varDeclPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPart"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:356:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
    public final TinyHaxeTry1Parser.varDeclPart_return varDeclPart() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclPart_return retval = new TinyHaxeTry1Parser.varDeclPart_return();
        retval.start = input.LT(1);
        int varDeclPart_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER290=null;
        TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt291 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt292 = null;

        TinyHaxeTry1Parser.varInit_return varInit293 = null;


        Object IDENTIFIER290_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:357:2: ( IDENTIFIER propDeclOpt typeTagOpt varInit )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:357:4: IDENTIFIER propDeclOpt typeTagOpt varInit
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER290=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart2915); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER290_tree = new VarUsage(IDENTIFIER290) ;
            adaptor.addChild(root_0, IDENTIFIER290_tree);
            }
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart2920);
            propDeclOpt291=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt291.getTree());
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart2922);
            typeTagOpt292=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt292.getTree());
            pushFollow(FOLLOW_varInit_in_varDeclPart2924);
            varInit293=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit293.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 61, varDeclPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPart"

    public static class propDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDecl"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:360:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) ;
    public final TinyHaxeTry1Parser.propDecl_return propDecl() throws RecognitionException {
        TinyHaxeTry1Parser.propDecl_return retval = new TinyHaxeTry1Parser.propDecl_return();
        retval.start = input.LT(1);
        int propDecl_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN294=null;
        Token COMMA295=null;
        Token RPAREN296=null;
        TinyHaxeTry1Parser.propAccessor_return a1 = null;

        TinyHaxeTry1Parser.propAccessor_return a2 = null;


        Object LPAREN294_tree=null;
        Object COMMA295_tree=null;
        Object RPAREN296_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:360:9: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:360:11: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN294=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl2934); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN294);

            pushFollow(FOLLOW_propAccessor_in_propDecl2938);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            COMMA295=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl2940); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA295);

            pushFollow(FOLLOW_propAccessor_in_propDecl2944);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            RPAREN296=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl2946); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN296);



            // AST REWRITE
            // elements: a2, a1
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
            // 360:63: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:360:66: ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(PROPERTY_DECL, "PROPERTY_DECL", true), root_1);

                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:360:124: ( $a1)?
                if ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:360:129: ( $a2)?
                if ( stream_a2.hasNext() ) {
                    adaptor.addChild(root_1, stream_a2.nextTree());

                }
                stream_a2.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 62, propDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propDecl"

    public static class propAccessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propAccessor"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:363:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final TinyHaxeTry1Parser.propAccessor_return propAccessor() throws RecognitionException {
        TinyHaxeTry1Parser.propAccessor_return retval = new TinyHaxeTry1Parser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set297=null;

        Object set297_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:364:2: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set297=(Token)input.LT(1);
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==DYNAMIC||input.LA(1)==DEFAULT||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set297));
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
            if ( state.backtracking>0 ) { memoize(input, 63, propAccessor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propAccessor"

    public static class propDeclOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDeclOpt"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:370:1: propDeclOpt : ( propDecl | );
    public final TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        TinyHaxeTry1Parser.propDeclOpt_return retval = new TinyHaxeTry1Parser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.propDecl_return propDecl298 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:371:2: ( propDecl | )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==LPAREN) ) {
                alt64=1;
            }
            else if ( (LA64_0==EOF||LA64_0==SEMI||LA64_0==COMMA||LA64_0==EQ||LA64_0==RPAREN||LA64_0==COLON||LA64_0==LBRACE) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:371:4: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propDecl_in_propDeclOpt3006);
                    propDecl298=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl298.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:373:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 64, propDeclOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propDeclOpt"

    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInit"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:375:1: varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | );
    public final TinyHaxeTry1Parser.varInit_return varInit() throws RecognitionException {
        TinyHaxeTry1Parser.varInit_return retval = new TinyHaxeTry1Parser.varInit_return();
        retval.start = input.LT(1);
        int varInit_StartIndex = input.index();
        Object root_0 = null;

        Token EQ299=null;
        TinyHaxeTry1Parser.expr_return expr300 = null;


        Object EQ299_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:375:9: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==EQ) ) {
                alt65=1;
            }
            else if ( (LA65_0==EOF||LA65_0==SEMI||LA65_0==COMMA||LA65_0==RPAREN) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:375:11: EQ expr
                    {
                    EQ299=(Token)match(input,EQ,FOLLOW_EQ_in_varInit3021); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ299);

                    pushFollow(FOLLOW_expr_in_varInit3023);
                    expr300=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr300.getTree());


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
                    // 375:19: -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:375:22: ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(VAR_INIT, "VAR_INIT", true), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:375:70: ( expr )?
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
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:377:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 65, varInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varInit"

    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcDecl"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:379:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );
    public final TinyHaxeTry1Parser.funcDecl_return funcDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcDecl_return retval = new TinyHaxeTry1Parser.funcDecl_return();
        retval.start = input.LT(1);
        int funcDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION302=null;
        Token NEW303=null;
        Token LPAREN304=null;
        Token RPAREN306=null;
        Token FUNCTION310=null;
        Token IDENTIFIER311=null;
        Token LPAREN313=null;
        Token RPAREN315=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList301 = null;

        TinyHaxeTry1Parser.paramList_return paramList305 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt307 = null;

        TinyHaxeTry1Parser.block_return block308 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList309 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt312 = null;

        TinyHaxeTry1Parser.paramList_return paramList314 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt316 = null;

        TinyHaxeTry1Parser.block_return block317 = null;


        Object FUNCTION302_tree=null;
        Object NEW303_tree=null;
        Object LPAREN304_tree=null;
        Object RPAREN306_tree=null;
        Object FUNCTION310_tree=null;
        Object IDENTIFIER311_tree=null;
        Object LPAREN313_tree=null;
        Object RPAREN315_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:379:9: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) )
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:379:11: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:379:11: ( declAttrList )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=PUBLIC && LA66_0<=OVERRIDE)) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl3050);
                            declAttrList301=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList301.getTree());

                            }
                            break;

                    }

                    FUNCTION302=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION302);

                    NEW303=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl3055); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW303);

                    LPAREN304=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN304);

                    pushFollow(FOLLOW_paramList_in_funcDecl3059);
                    paramList305=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList305.getTree());
                    RPAREN306=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3061); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN306);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3063);
                    typeTagOpt307=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt307.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3065);
                    block308=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block308.getTree());


                    // AST REWRITE
                    // elements: FUNCTION, paramList, declAttrList, block, typeTagOpt, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 380:4: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:380:7: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:380:36: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:380:50: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:380:61: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:380:73: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:381:4: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:381:4: ( declAttrList )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=PUBLIC && LA67_0<=OVERRIDE)) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl3098);
                            declAttrList309=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList309.getTree());

                            }
                            break;

                    }

                    FUNCTION310=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION310);

                    IDENTIFIER311=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl3103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER311);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl3105);
                    typeParamOpt312=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt312.getTree());
                    LPAREN313=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN313);

                    pushFollow(FOLLOW_paramList_in_funcDecl3109);
                    paramList314=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList314.getTree());
                    RPAREN315=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3111); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN315);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3113);
                    typeTagOpt316=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt316.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3115);
                    block317=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block317.getTree());


                    // AST REWRITE
                    // elements: FUNCTION, typeParamOpt, paramList, declAttrList, IDENTIFIER, typeTagOpt, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 382:4: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:382:7: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:382:43: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:382:57: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:382:68: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:382:80: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:382:87: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 66, funcDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcDecl"

    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcProtoDecl"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:385:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );
    public final TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcProtoDecl_return retval = new TinyHaxeTry1Parser.funcProtoDecl_return();
        retval.start = input.LT(1);
        int funcProtoDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION319=null;
        Token NEW320=null;
        Token LPAREN321=null;
        Token RPAREN323=null;
        Token SEMI325=null;
        Token FUNCTION327=null;
        Token IDENTIFIER328=null;
        Token LPAREN330=null;
        Token RPAREN332=null;
        Token SEMI334=null;
        Token FUNCTION335=null;
        Token NEW336=null;
        Token LPAREN337=null;
        Token RPAREN339=null;
        Token SEMI341=null;
        Token FUNCTION342=null;
        Token IDENTIFIER343=null;
        Token LPAREN345=null;
        Token RPAREN347=null;
        Token SEMI349=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList318 = null;

        TinyHaxeTry1Parser.paramList_return paramList322 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt324 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList326 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt329 = null;

        TinyHaxeTry1Parser.paramList_return paramList331 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt333 = null;

        TinyHaxeTry1Parser.paramList_return paramList338 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt340 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt344 = null;

        TinyHaxeTry1Parser.paramList_return paramList346 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt348 = null;


        Object FUNCTION319_tree=null;
        Object NEW320_tree=null;
        Object LPAREN321_tree=null;
        Object RPAREN323_tree=null;
        Object SEMI325_tree=null;
        Object FUNCTION327_tree=null;
        Object IDENTIFIER328_tree=null;
        Object LPAREN330_tree=null;
        Object RPAREN332_tree=null;
        Object SEMI334_tree=null;
        Object FUNCTION335_tree=null;
        Object NEW336_tree=null;
        Object LPAREN337_tree=null;
        Object RPAREN339_tree=null;
        Object SEMI341_tree=null;
        Object FUNCTION342_tree=null;
        Object IDENTIFIER343_tree=null;
        Object LPAREN345_tree=null;
        Object RPAREN347_tree=null;
        Object SEMI349_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:386:2: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) )
            int alt69=4;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:386:4: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3157);
                    declAttrList318=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList318.getTree());
                    FUNCTION319=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION319);

                    NEW320=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW320);

                    LPAREN321=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3163); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN321);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3165);
                    paramList322=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList322.getTree());
                    RPAREN323=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN323);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3169);
                    typeTagOpt324=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt324.getTree());
                    SEMI325=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI325);



                    // AST REWRITE
                    // elements: paramList, typeTagOpt, FUNCTION, declAttrList, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 387:4: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:387:7: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:387:18: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:387:23: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:387:34: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:387:46: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:388:4: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3198);
                    declAttrList326=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList326.getTree());
                    FUNCTION327=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION327);

                    IDENTIFIER328=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER328);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3204);
                    typeParamOpt329=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt329.getTree());
                    LPAREN330=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN330);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3208);
                    paramList331=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList331.getTree());
                    RPAREN332=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN332);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3212);
                    typeTagOpt333=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt333.getTree());
                    SEMI334=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI334);



                    // AST REWRITE
                    // elements: IDENTIFIER, declAttrList, FUNCTION, typeParamOpt, typeTagOpt, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 389:4: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:389:7: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:389:18: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:389:30: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:389:41: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:389:53: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:389:67: ( typeParamOpt )?
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
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:390:4: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION335=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3244); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION335);

                    NEW336=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW336);

                    LPAREN337=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN337);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3250);
                    paramList338=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList338.getTree());
                    RPAREN339=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN339);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3254);
                    typeTagOpt340=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt340.getTree());
                    SEMI341=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3256); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI341);



                    // AST REWRITE
                    // elements: FUNCTION, paramList, typeTagOpt, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 391:4: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:391:7: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:391:18: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:391:23: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:391:34: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:392:4: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION342=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3280); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION342);

                    IDENTIFIER343=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3282); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER343);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3284);
                    typeParamOpt344=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt344.getTree());
                    LPAREN345=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN345);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3288);
                    paramList346=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList346.getTree());
                    RPAREN347=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN347);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3292);
                    typeTagOpt348=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt348.getTree());
                    SEMI349=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3294); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI349);



                    // AST REWRITE
                    // elements: typeParamOpt, paramList, typeTagOpt, FUNCTION, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 393:4: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:393:7: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:393:18: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:393:30: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:393:41: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:393:53: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 67, funcProtoDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"

    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDecl"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:396:1: classDecl : ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final TinyHaxeTry1Parser.classDecl_return classDecl() throws RecognitionException {
        TinyHaxeTry1Parser.classDecl_return retval = new TinyHaxeTry1Parser.classDecl_return();
        retval.start = input.LT(1);
        int classDecl_StartIndex = input.index();
        Object root_0 = null;

        Token EXTERN350=null;
        Token CLASS351=null;
        Token IDENTIFIER352=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt353 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt354 = null;

        TinyHaxeTry1Parser.classBodyScope_return classBodyScope355 = null;


        Object EXTERN350_tree=null;
        Object CLASS351_tree=null;
        Object IDENTIFIER352_tree=null;
        RewriteRuleTokenStream stream_EXTERN=new RewriteRuleTokenStream(adaptor,"token EXTERN");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:397:2: ( ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:397:4: ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:397:4: ( EXTERN )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==EXTERN) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:0:0: EXTERN
                    {
                    EXTERN350=(Token)match(input,EXTERN,FOLLOW_EXTERN_in_classDecl3328); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTERN.add(EXTERN350);


                    }
                    break;

            }

            CLASS351=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl3331); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS351);

            IDENTIFIER352=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl3333); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER352);

            pushFollow(FOLLOW_typeParamOpt_in_classDecl3335);
            typeParamOpt353=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt353.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_classDecl3337);
            inheritListOpt354=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt354.getTree());
            pushFollow(FOLLOW_classBodyScope_in_classDecl3339);
            classBodyScope355=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope355.getTree());


            // AST REWRITE
            // elements: inheritListOpt, IDENTIFIER, EXTERN, typeParamOpt, CLASS, classBodyScope
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 398:4: -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:398:7: ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ClassNode(stream_CLASS.nextToken()), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:398:37: ( EXTERN )?
                if ( stream_EXTERN.hasNext() ) {
                    adaptor.addChild(root_1, stream_EXTERN.nextNode());

                }
                stream_EXTERN.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:398:45: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:398:59: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:398:75: ( classBodyScope )?
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
            if ( state.backtracking>0 ) { memoize(input, 68, classDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDecl"

    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBodyScope"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:401:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) ;
    public final TinyHaxeTry1Parser.classBodyScope_return classBodyScope() throws RecognitionException {
        TinyHaxeTry1Parser.classBodyScope_return retval = new TinyHaxeTry1Parser.classBodyScope_return();
        retval.start = input.LT(1);
        int classBodyScope_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE356=null;
        Token RBRACE358=null;
        TinyHaxeTry1Parser.classMember_return classMember357 = null;


        Object LBRACE356_tree=null;
        Object RBRACE358_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:402:2: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:402:4: LBRACE ( classMember )* RBRACE
            {
            LBRACE356=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope3377); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE356);

            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:402:11: ( classMember )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=PUBLIC && LA71_0<=OVERRIDE)||LA71_0==FUNCTION||(LA71_0>=ENUM && LA71_0<=VAR)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:402:12: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope3380);
            	    classMember357=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember357.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            RBRACE358=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope3384); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE358);



            // AST REWRITE
            // elements: RBRACE, classMember
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 402:33: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
            {
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:402:36: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE356), root_1);

                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:402:96: ( classMember )*
                while ( stream_classMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_classMember.nextTree());

                }
                stream_classMember.reset();
                adaptor.addChild(root_1, new ExtendedCommonTree(RBRACE, RBRACE358, true));

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
            if ( state.backtracking>0 ) { memoize(input, 69, classBodyScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBodyScope"

    public static class classMember_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMember"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:405:1: classMember : ( varDecl | funcDecl | enumDecl );
    public final TinyHaxeTry1Parser.classMember_return classMember() throws RecognitionException {
        TinyHaxeTry1Parser.classMember_return retval = new TinyHaxeTry1Parser.classMember_return();
        retval.start = input.LT(1);
        int classMember_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl359 = null;

        TinyHaxeTry1Parser.funcDecl_return funcDecl360 = null;

        TinyHaxeTry1Parser.enumDecl_return enumDecl361 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:406:2: ( varDecl | funcDecl | enumDecl )
            int alt72=3;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:406:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_classMember3414);
                    varDecl359=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl359.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:407:4: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcDecl_in_classMember3420);
                    funcDecl360=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl360.getTree());

                    }
                    break;
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:409:4: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_classMember3427);
                    enumDecl361=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl361.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 70, classMember_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classMember"

    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDecl"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:412:1: interfaceDecl : INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
    public final TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceDecl_return retval = new TinyHaxeTry1Parser.interfaceDecl_return();
        retval.start = input.LT(1);
        int interfaceDecl_StartIndex = input.index();
        Object root_0 = null;

        Token INTERFACE362=null;
        Token LBRACE365=null;
        Token RBRACE367=null;
        TinyHaxeTry1Parser.type_return type363 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt364 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody366 = null;


        Object INTERFACE362_tree=null;
        Object LBRACE365_tree=null;
        Object RBRACE367_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:413:2: ( INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:413:4: INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            INTERFACE362=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl3445); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE362_tree = (Object)adaptor.create(INTERFACE362);
            adaptor.addChild(root_0, INTERFACE362_tree);
            }
            pushFollow(FOLLOW_type_in_interfaceDecl3447);
            type363=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type363.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl3449);
            inheritListOpt364=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt364.getTree());
            LBRACE365=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl3451); if (state.failed) return retval;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl3454);
            interfaceBody366=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody366.getTree());
            RBRACE367=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl3456); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 71, interfaceDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceDecl"

    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceBody"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:416:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );
    public final TinyHaxeTry1Parser.interfaceBody_return interfaceBody() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceBody_return retval = new TinyHaxeTry1Parser.interfaceBody_return();
        retval.start = input.LT(1);
        int interfaceBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl368 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody369 = null;

        TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl370 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody371 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:417:2: ( varDecl interfaceBody | funcProtoDecl interfaceBody | )
            int alt73=3;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:417:4: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_interfaceBody3469);
                    varDecl368=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl368.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3471);
                    interfaceBody369=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody369.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:418:4: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody3476);
                    funcProtoDecl370=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl370.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3478);
                    interfaceBody371=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody371.getTree());

                    }
                    break;
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:421:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 72, interfaceBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceBody"

    public static class inheritList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritList"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:423:1: inheritList : inherit ( COMMA inherit )* ;
    public final TinyHaxeTry1Parser.inheritList_return inheritList() throws RecognitionException {
        TinyHaxeTry1Parser.inheritList_return retval = new TinyHaxeTry1Parser.inheritList_return();
        retval.start = input.LT(1);
        int inheritList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA373=null;
        TinyHaxeTry1Parser.inherit_return inherit372 = null;

        TinyHaxeTry1Parser.inherit_return inherit374 = null;


        Object COMMA373_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:424:2: ( inherit ( COMMA inherit )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:424:4: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inherit_in_inheritList3500);
            inherit372=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit372.getTree());
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:424:12: ( COMMA inherit )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==COMMA) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:424:13: COMMA inherit
            	    {
            	    COMMA373=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList3503); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inherit_in_inheritList3506);
            	    inherit374=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit374.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
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
            if ( state.backtracking>0 ) { memoize(input, 73, inheritList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritList"

    public static class inheritListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritListOpt"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:427:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | );
    public final TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.inheritListOpt_return retval = new TinyHaxeTry1Parser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.inheritList_return inheritList375 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:428:2: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=EXTENDS && LA75_0<=IMPLEMENTS)) ) {
                alt75=1;
            }
            else if ( (LA75_0==LBRACE) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:428:4: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt3524);
                    inheritList375=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList375.getTree());


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
                    // 428:16: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:428:19: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT", true), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:428:83: ( inheritList )?
                        if ( stream_inheritList.hasNext() ) {
                            adaptor.addChild(root_1, stream_inheritList.nextTree());

                        }
                        stream_inheritList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:430:6: 
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
            if ( state.backtracking>0 ) { memoize(input, 74, inheritListOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritListOpt"

    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inherit"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:432:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
    public final TinyHaxeTry1Parser.inherit_return inherit() throws RecognitionException {
        TinyHaxeTry1Parser.inherit_return retval = new TinyHaxeTry1Parser.inherit_return();
        retval.start = input.LT(1);
        int inherit_StartIndex = input.index();
        Object root_0 = null;

        Token EXTENDS376=null;
        Token IMPLEMENTS378=null;
        TinyHaxeTry1Parser.type_return type377 = null;

        TinyHaxeTry1Parser.type_return type379 = null;


        Object EXTENDS376_tree=null;
        Object IMPLEMENTS378_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:432:9: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==EXTENDS) ) {
                alt76=1;
            }
            else if ( (LA76_0==IMPLEMENTS) ) {
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:432:11: EXTENDS type
                    {
                    EXTENDS376=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit3560); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS376);

                    pushFollow(FOLLOW_type_in_inherit3562);
                    type377=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type377.getTree());


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
                    // 432:25: -> ^( EXTENDS ( type )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:432:28: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EXTENDS.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:432:38: ( type )?
                        if ( stream_type.hasNext() ) {
                            adaptor.addChild(root_1, stream_type.nextTree());

                        }
                        stream_type.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:433:11: IMPLEMENTS type
                    {
                    IMPLEMENTS378=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit3584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS378);

                    pushFollow(FOLLOW_type_in_inherit3586);
                    type379=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type379.getTree());


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
                    // 433:27: -> ^( IMPLEMENTS ( type )? )
                    {
                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:433:30: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IMPLEMENTS.nextNode(), root_1);

                        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:433:43: ( type )?
                        if ( stream_type.hasNext() ) {
                            adaptor.addChild(root_1, stream_type.nextTree());

                        }
                        stream_type.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 75, inherit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inherit"

    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedefDecl"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:436:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final TinyHaxeTry1Parser.typedefDecl_return typedefDecl() throws RecognitionException {
        TinyHaxeTry1Parser.typedefDecl_return retval = new TinyHaxeTry1Parser.typedefDecl_return();
        retval.start = input.LT(1);
        int typedefDecl_StartIndex = input.index();
        Object root_0 = null;

        Token TYPEDEF380=null;
        Token IDENTIFIER381=null;
        Token EQ382=null;
        TinyHaxeTry1Parser.funcType_return funcType383 = null;


        Object TYPEDEF380_tree=null;
        Object IDENTIFIER381_tree=null;
        Object EQ382_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:437:2: ( TYPEDEF IDENTIFIER EQ funcType )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:437:4: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            TYPEDEF380=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl3614); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF380_tree = (Object)adaptor.create(TYPEDEF380);
            adaptor.addChild(root_0, TYPEDEF380_tree);
            }
            IDENTIFIER381=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl3616); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER381_tree = (Object)adaptor.create(IDENTIFIER381);
            adaptor.addChild(root_0, IDENTIFIER381_tree);
            }
            EQ382=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl3618); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ382_tree = (Object)adaptor.create(EQ382);
            adaptor.addChild(root_0, EQ382_tree);
            }
            pushFollow(FOLLOW_funcType_in_typedefDecl3620);
            funcType383=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType383.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 76, typedefDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typedefDecl"

    public static class typeExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeExtend"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:440:1: typeExtend : GT funcType COMMA ;
    public final TinyHaxeTry1Parser.typeExtend_return typeExtend() throws RecognitionException {
        TinyHaxeTry1Parser.typeExtend_return retval = new TinyHaxeTry1Parser.typeExtend_return();
        retval.start = input.LT(1);
        int typeExtend_StartIndex = input.index();
        Object root_0 = null;

        Token GT384=null;
        Token COMMA386=null;
        TinyHaxeTry1Parser.funcType_return funcType385 = null;


        Object GT384_tree=null;
        Object COMMA386_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:441:9: ( GT funcType COMMA )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:441:11: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            GT384=(Token)match(input,GT,FOLLOW_GT_in_typeExtend3639); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT384_tree = (Object)adaptor.create(GT384);
            adaptor.addChild(root_0, GT384_tree);
            }
            pushFollow(FOLLOW_funcType_in_typeExtend3641);
            funcType385=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType385.getTree());
            COMMA386=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend3643); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 77, typeExtend_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeExtend"

    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonType"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:444:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
    public final TinyHaxeTry1Parser.anonType_return anonType() throws RecognitionException {
        TinyHaxeTry1Parser.anonType_return retval = new TinyHaxeTry1Parser.anonType_return();
        retval.start = input.LT(1);
        int anonType_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE387=null;
        Token RBRACE393=null;
        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList388 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList389 = null;

        TinyHaxeTry1Parser.typeExtend_return typeExtend390 = null;

        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList391 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList392 = null;


        Object LBRACE387_tree=null;
        Object RBRACE393_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:444:9: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:444:11: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            LBRACE387=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType3654); if (state.failed) return retval;
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:445:4: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt78=4;
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
            case GT:
                {
                alt78=4;
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
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:446:22: 
                    {
                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:446:27: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType3689);
                    anonTypeFieldList388=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList388.getTree());

                    }
                    break;
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:447:26: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType3717);
                    varDeclList389=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList389.getTree());

                    }
                    break;
                case 4 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:448:27: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType3746);
                    typeExtend390=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend390.getTree());
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:448:38: ( | anonTypeFieldList | varDeclList )
                    int alt77=3;
                    switch ( input.LA(1) ) {
                    case RBRACE:
                        {
                        alt77=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt77=2;
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
                        alt77=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }

                    switch (alt77) {
                        case 1 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:449:24: 
                            {
                            }
                            break;
                        case 2 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:449:25: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType3774);
                            anonTypeFieldList391=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList391.getTree());

                            }
                            break;
                        case 3 :
                            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:450:25: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType3800);
                            varDeclList392=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList392.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE393=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType3844); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 78, anonType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonType"

    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeFieldList"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:455:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
    public final TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeFieldList_return retval = new TinyHaxeTry1Parser.anonTypeFieldList_return();
        retval.start = input.LT(1);
        int anonTypeFieldList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA395=null;
        TinyHaxeTry1Parser.anonTypeField_return anonTypeField394 = null;

        TinyHaxeTry1Parser.anonTypeField_return anonTypeField396 = null;


        Object COMMA395_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:456:2: ( anonTypeField ( COMMA anonTypeField )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:456:4: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList3858);
            anonTypeField394=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField394.getTree());
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:456:18: ( COMMA anonTypeField )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==COMMA) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:456:19: COMMA anonTypeField
            	    {
            	    COMMA395=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList3861); if (state.failed) return retval;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList3864);
            	    anonTypeField396=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField396.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
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
            if ( state.backtracking>0 ) { memoize(input, 79, anonTypeFieldList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonTypeFieldList"

    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLit"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:459:1: objLit : '{' objLitElemList '}' ;
    public final TinyHaxeTry1Parser.objLit_return objLit() throws RecognitionException {
        TinyHaxeTry1Parser.objLit_return retval = new TinyHaxeTry1Parser.objLit_return();
        retval.start = input.LT(1);
        int objLit_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal397=null;
        Token char_literal399=null;
        TinyHaxeTry1Parser.objLitElemList_return objLitElemList398 = null;


        Object char_literal397_tree=null;
        Object char_literal399_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:459:8: ( '{' objLitElemList '}' )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:459:10: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal397=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit3876); if (state.failed) return retval;
            pushFollow(FOLLOW_objLitElemList_in_objLit3879);
            objLitElemList398=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList398.getTree());
            char_literal399=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit3881); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 80, objLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLit"

    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeField"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:462:1: anonTypeField : IDENTIFIER COLON funcType ;
    public final TinyHaxeTry1Parser.anonTypeField_return anonTypeField() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeField_return retval = new TinyHaxeTry1Parser.anonTypeField_return();
        retval.start = input.LT(1);
        int anonTypeField_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER400=null;
        Token COLON401=null;
        TinyHaxeTry1Parser.funcType_return funcType402 = null;


        Object IDENTIFIER400_tree=null;
        Object COLON401_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:463:2: ( IDENTIFIER COLON funcType )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:463:4: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER400=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField3893); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER400_tree = (Object)adaptor.create(IDENTIFIER400);
            adaptor.addChild(root_0, IDENTIFIER400_tree);
            }
            COLON401=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField3895); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_anonTypeField3898);
            funcType402=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType402.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 81, anonTypeField_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonTypeField"

    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElemList"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:466:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
    public final TinyHaxeTry1Parser.objLitElemList_return objLitElemList() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElemList_return retval = new TinyHaxeTry1Parser.objLitElemList_return();
        retval.start = input.LT(1);
        int objLitElemList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA404=null;
        TinyHaxeTry1Parser.objLitElem_return objLitElem403 = null;

        TinyHaxeTry1Parser.objLitElem_return objLitElem405 = null;


        Object COMMA404_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:467:2: ( objLitElem ( COMMA objLitElem )* )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:467:4: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_objLitElem_in_objLitElemList3914);
            objLitElem403=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem403.getTree());
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:467:15: ( COMMA objLitElem )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==COMMA) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:467:16: COMMA objLitElem
            	    {
            	    COMMA404=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList3917); if (state.failed) return retval;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList3920);
            	    objLitElem405=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem405.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 82, objLitElemList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLitElemList"

    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElem"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:470:1: objLitElem : IDENTIFIER COLON expr ;
    public final TinyHaxeTry1Parser.objLitElem_return objLitElem() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElem_return retval = new TinyHaxeTry1Parser.objLitElem_return();
        retval.start = input.LT(1);
        int objLitElem_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER406=null;
        Token COLON407=null;
        TinyHaxeTry1Parser.expr_return expr408 = null;


        Object IDENTIFIER406_tree=null;
        Object COLON407_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:471:9: ( IDENTIFIER COLON expr )
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:471:11: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER406=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem3941); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER406_tree = (Object)adaptor.create(IDENTIFIER406);
            adaptor.addChild(root_0, IDENTIFIER406_tree);
            }
            COLON407=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem3943); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_objLitElem3946);
            expr408=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr408.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 83, objLitElem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLitElem"

    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementarySymbol"
    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:474:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        TinyHaxeTry1Parser.elementarySymbol_return retval = new TinyHaxeTry1Parser.elementarySymbol_return();
        retval.start = input.LT(1);
        int elementarySymbol_StartIndex = input.index();
        Object root_0 = null;

        Token LONGLITERAL409=null;
        Token INTLITERAL410=null;
        Token STRINGLITERAL411=null;
        Token CHARLITERAL412=null;
        Token FLOATNUM413=null;
        Token TRUE414=null;
        Token FALSE415=null;

        Object LONGLITERAL409_tree=null;
        Object INTLITERAL410_tree=null;
        Object STRINGLITERAL411_tree=null;
        Object CHARLITERAL412_tree=null;
        Object FLOATNUM413_tree=null;
        Object TRUE414_tree=null;
        Object FALSE415_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:475:2: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt81=7;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt81=1;
                }
                break;
            case INTLITERAL:
                {
                alt81=2;
                }
                break;
            case STRINGLITERAL:
                {
                alt81=3;
                }
                break;
            case CHARLITERAL:
                {
                alt81=4;
                }
                break;
            case FLOATNUM:
                {
                alt81=5;
                }
                break;
            case TRUE:
                {
                alt81=6;
                }
                break;
            case FALSE:
                {
                alt81=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:475:4: LONGLITERAL
                    {
                    LONGLITERAL409=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol3958); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL409);



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
                    // 475:16: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(LONGLITERAL, LONGLITERAL409, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:476:4: INTLITERAL
                    {
                    INTLITERAL410=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol3971); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL410);



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
                    // 476:15: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(INTLITERAL, INTLITERAL410, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:477:4: STRINGLITERAL
                    {
                    STRINGLITERAL411=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol3984); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL411);



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
                    // 477:18: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(STRINGLITERAL, STRINGLITERAL411, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:478:4: CHARLITERAL
                    {
                    CHARLITERAL412=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol3997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL412);



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
                    // 478:16: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(CHARLITERAL, CHARLITERAL412, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:479:4: FLOATNUM
                    {
                    FLOATNUM413=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol4010); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM413);



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
                    // 479:13: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(FLOATNUM, FLOATNUM413, "FLOAT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:480:4: TRUE
                    {
                    TRUE414=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol4023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE414);



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
                    // 480:10: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(TRUE, TRUE414, "BOOL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:481:4: FALSE
                    {
                    FALSE415=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol4037); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE415);



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
                    // 481:11: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(FALSE, FALSE415, "BOOL"));

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
            if ( state.backtracking>0 ) { memoize(input, 84, elementarySymbol_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred21_TinyHaxeTry1
    public final void synpred21_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:114:54: ( typeTagOpt )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:114:54: typeTagOpt
        {
        pushFollow(FOLLOW_typeTagOpt_in_synpred21_TinyHaxeTry1846);
        typeTagOpt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_TinyHaxeTry1

    // $ANTLR start synpred23_TinyHaxeTry1
    public final void synpred23_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:152:21: ( COMMA funcType )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:152:21: COMMA funcType
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred23_TinyHaxeTry1952); if (state.failed) return ;
        pushFollow(FOLLOW_funcType_in_synpred23_TinyHaxeTry1955);
        funcType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_TinyHaxeTry1

    // $ANTLR start synpred24_TinyHaxeTry1
    public final void synpred24_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:152:11: ( funcType ( COMMA funcType )* )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:152:11: funcType ( COMMA funcType )*
        {
        pushFollow(FOLLOW_funcType_in_synpred24_TinyHaxeTry1949);
        funcType();

        state._fsp--;
        if (state.failed) return ;
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:152:20: ( COMMA funcType )*
        loop83:
        do {
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==COMMA) ) {
                alt83=1;
            }


            switch (alt83) {
        	case 1 :
        	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:152:21: COMMA funcType
        	    {
        	    match(input,COMMA,FOLLOW_COMMA_in_synpred24_TinyHaxeTry1952); if (state.failed) return ;
        	    pushFollow(FOLLOW_funcType_in_synpred24_TinyHaxeTry1955);
        	    funcType();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop83;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred24_TinyHaxeTry1

    // $ANTLR start synpred25_TinyHaxeTry1
    public final void synpred25_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:153:20: ( COMMA typeConstraint )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:153:20: COMMA typeConstraint
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred25_TinyHaxeTry1966); if (state.failed) return ;
        pushFollow(FOLLOW_typeConstraint_in_synpred25_TinyHaxeTry1969);
        typeConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_TinyHaxeTry1

    // $ANTLR start synpred26_TinyHaxeTry1
    public final void synpred26_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:19: ( MINUS_BIGGER type )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:19: MINUS_BIGGER type
        {
        match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred26_TinyHaxeTry1988); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred26_TinyHaxeTry1991);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_TinyHaxeTry1

    // $ANTLR start synpred27_TinyHaxeTry1
    public final void synpred27_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:11: ( ( type ) ( MINUS_BIGGER type )* )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:11: ( type ) ( MINUS_BIGGER type )*
        {
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:11: ( type )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:12: type
        {
        pushFollow(FOLLOW_type_in_synpred27_TinyHaxeTry1984);
        type();

        state._fsp--;
        if (state.failed) return ;

        }

        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:18: ( MINUS_BIGGER type )*
        loop84:
        do {
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==MINUS_BIGGER) ) {
                alt84=1;
            }


            switch (alt84) {
        	case 1 :
        	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:156:19: MINUS_BIGGER type
        	    {
        	    match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred27_TinyHaxeTry1988); if (state.failed) return ;
        	    pushFollow(FOLLOW_type_in_synpred27_TinyHaxeTry1991);
        	    type();

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
    // $ANTLR end synpred27_TinyHaxeTry1

    // $ANTLR start synpred34_TinyHaxeTry1
    public final void synpred34_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:65: ( typeParam )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:65: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred34_TinyHaxeTry11031);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_TinyHaxeTry1

    // $ANTLR start synpred35_TinyHaxeTry1
    public final void synpred35_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:8: ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )*
        {
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
        int alt85=7;
        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt85=1;
            }
            break;
        case IDENTIFIER:
        case THIS:
            {
            alt85=2;
            }
            break;
        case INT:
            {
            alt85=3;
            }
            break;
        case FLOAT:
            {
            alt85=4;
            }
            break;
        case DYNAMIC:
            {
            alt85=5;
            }
            break;
        case BOOLEAN:
            {
            alt85=6;
            }
            break;
        case VOID:
            {
            alt85=7;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 85, 0, input);

            throw nvae;
        }

        switch (alt85) {
            case 1 :
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:9: anonType
                {
                pushFollow(FOLLOW_anonType_in_synpred35_TinyHaxeTry11010);
                anonType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:20: dotIdent
                {
                pushFollow(FOLLOW_dotIdent_in_synpred35_TinyHaxeTry11014);
                dotIdent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:30: INT
                {
                match(input,INT,FOLLOW_INT_in_synpred35_TinyHaxeTry11017); if (state.failed) return ;

                }
                break;
            case 4 :
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:35: FLOAT
                {
                match(input,FLOAT,FOLLOW_FLOAT_in_synpred35_TinyHaxeTry11020); if (state.failed) return ;

                }
                break;
            case 5 :
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:42: DYNAMIC
                {
                match(input,DYNAMIC,FOLLOW_DYNAMIC_in_synpred35_TinyHaxeTry11023); if (state.failed) return ;

                }
                break;
            case 6 :
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:50: BOOLEAN
                {
                match(input,BOOLEAN,FOLLOW_BOOLEAN_in_synpred35_TinyHaxeTry11025); if (state.failed) return ;

                }
                break;
            case 7 :
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:58: VOID
                {
                match(input,VOID,FOLLOW_VOID_in_synpred35_TinyHaxeTry11027); if (state.failed) return ;

                }
                break;

        }

        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:64: ( typeParam )*
        loop86:
        do {
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==LT) ) {
                alt86=1;
            }


            switch (alt86) {
        	case 1 :
        	    // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:160:65: typeParam
        	    {
        	    pushFollow(FOLLOW_typeParam_in_synpred35_TinyHaxeTry11031);
        	    typeParam();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop86;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred35_TinyHaxeTry1

    // $ANTLR start synpred36_TinyHaxeTry1
    public final void synpred36_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:9: ( type )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:9: type
        {
        pushFollow(FOLLOW_type_in_synpred36_TinyHaxeTry11053);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_TinyHaxeTry1

    // $ANTLR start synpred37_TinyHaxeTry1
    public final void synpred37_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:25: ( GT )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:25: GT
        {
        match(input,GT,FOLLOW_GT_in_synpred37_TinyHaxeTry11059); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_TinyHaxeTry1

    // $ANTLR start synpred38_TinyHaxeTry1
    public final void synpred38_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:29: ( GTGT )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:165:29: GTGT
        {
        match(input,GTGT,FOLLOW_GTGT_in_synpred38_TinyHaxeTry11062); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_TinyHaxeTry1

    // $ANTLR start synpred39_TinyHaxeTry1
    public final void synpred39_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:170:4: ( typeParam )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:170:4: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred39_TinyHaxeTry11084);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_TinyHaxeTry1

    // $ANTLR start synpred41_TinyHaxeTry1
    public final void synpred41_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:183:4: ( block )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:183:4: block
        {
        pushFollow(FOLLOW_block_in_synpred41_TinyHaxeTry11213);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_TinyHaxeTry1

    // $ANTLR start synpred42_TinyHaxeTry1
    public final void synpred42_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:184:4: ( assignExpr SEMI )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:184:4: assignExpr SEMI
        {
        pushFollow(FOLLOW_assignExpr_in_synpred42_TinyHaxeTry11218);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred42_TinyHaxeTry11220); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_TinyHaxeTry1

    // $ANTLR start synpred44_TinyHaxeTry1
    public final void synpred44_TinyHaxeTry1_fragment() throws RecognitionException {   
        TinyHaxeTry1Parser.statement_return st2 = null;


        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:186:36: ( ELSE st2= statement )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:186:36: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred44_TinyHaxeTry11240); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred44_TinyHaxeTry11244);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_TinyHaxeTry1

    // $ANTLR start synpred52_TinyHaxeTry1
    public final void synpred52_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:192:12: ( expr )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:192:12: expr
        {
        pushFollow(FOLLOW_expr_in_synpred52_TinyHaxeTry11452);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_TinyHaxeTry1

    // $ANTLR start synpred59_TinyHaxeTry1
    public final void synpred59_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:196:4: ( expr SEMI )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:196:4: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred59_TinyHaxeTry11546);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred59_TinyHaxeTry11549); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_TinyHaxeTry1

    // $ANTLR start synpred60_TinyHaxeTry1
    public final void synpred60_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:197:4: ( IDENTIFIER COLON statement )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:197:4: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred60_TinyHaxeTry11555); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred60_TinyHaxeTry11557); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred60_TinyHaxeTry11559);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_TinyHaxeTry1

    // $ANTLR start synpred63_TinyHaxeTry1
    public final void synpred63_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:210:4: ( varDecl )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:210:4: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred63_TinyHaxeTry11666);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_TinyHaxeTry1

    // $ANTLR start synpred67_TinyHaxeTry1
    public final void synpred67_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:244:4: ( exprList )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:244:4: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred67_TinyHaxeTry11880);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_TinyHaxeTry1

    // $ANTLR start synpred85_TinyHaxeTry1
    public final void synpred85_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:32: ( ( GT GT ) addExpr )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:32: ( GT GT ) addExpr
        {
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:32: ( GT GT )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:281:33: GT GT
        {
        match(input,GT,FOLLOW_GT_in_synpred85_TinyHaxeTry12181); if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred85_TinyHaxeTry12183); if (state.failed) return ;

        }

        pushFollow(FOLLOW_addExpr_in_synpred85_TinyHaxeTry12188);
        addExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred85_TinyHaxeTry1

    // $ANTLR start synpred96_TinyHaxeTry1
    public final void synpred96_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:291:11: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:291:11: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
        {
        if ( input.LA(1)==SUB||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_prefixExpr_in_synpred96_TinyHaxeTry12285);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_TinyHaxeTry1

    // $ANTLR start synpred99_TinyHaxeTry1
    public final void synpred99_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:298:4: ( value LPAREN exprListOpt RPAREN )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:298:4: value LPAREN exprListOpt RPAREN
        {
        pushFollow(FOLLOW_value_in_synpred99_TinyHaxeTry12340);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred99_TinyHaxeTry12342); if (state.failed) return ;
        pushFollow(FOLLOW_exprListOpt_in_synpred99_TinyHaxeTry12344);
        exprListOpt();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred99_TinyHaxeTry12346); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_TinyHaxeTry1

    // $ANTLR start synpred100_TinyHaxeTry1
    public final void synpred100_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:299:4: ( value LBRACKET expr RBRACKET )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:299:4: value LBRACKET expr RBRACKET
        {
        pushFollow(FOLLOW_value_in_synpred100_TinyHaxeTry12367);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred100_TinyHaxeTry12369); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred100_TinyHaxeTry12371);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred100_TinyHaxeTry12373); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_TinyHaxeTry1

    // $ANTLR start synpred101_TinyHaxeTry1
    public final void synpred101_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:300:4: ( value PLUSPLUS )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:300:4: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred101_TinyHaxeTry12378);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred101_TinyHaxeTry12380); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_TinyHaxeTry1

    // $ANTLR start synpred102_TinyHaxeTry1
    public final void synpred102_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:301:4: ( value SUBSUB )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:301:4: value SUBSUB
        {
        pushFollow(FOLLOW_value_in_synpred102_TinyHaxeTry12404);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred102_TinyHaxeTry12406); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred102_TinyHaxeTry1

    // $ANTLR start synpred104_TinyHaxeTry1
    public final void synpred104_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:306:4: ( arrayLit )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:306:4: arrayLit
        {
        pushFollow(FOLLOW_arrayLit_in_synpred104_TinyHaxeTry12446);
        arrayLit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_TinyHaxeTry1

    // $ANTLR start synpred108_TinyHaxeTry1
    public final void synpred108_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:310:23: ( expr )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:310:23: expr
        {
        pushFollow(FOLLOW_expr_in_synpred108_TinyHaxeTry12510);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_TinyHaxeTry1

    // $ANTLR start synpred109_TinyHaxeTry1
    public final void synpred109_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:310:14: ( LPAREN ( expr | statement ) RPAREN )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:310:14: LPAREN ( expr | statement ) RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred109_TinyHaxeTry12506); if (state.failed) return ;
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:310:22: ( expr | statement )
        int alt93=2;
        alt93 = dfa93.predict(input);
        switch (alt93) {
            case 1 :
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:310:23: expr
                {
                pushFollow(FOLLOW_expr_in_synpred109_TinyHaxeTry12510);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:310:28: statement
                {
                pushFollow(FOLLOW_statement_in_synpred109_TinyHaxeTry12512);
                statement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred109_TinyHaxeTry12515); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_TinyHaxeTry1

    // $ANTLR start synpred112_TinyHaxeTry1
    public final void synpred112_TinyHaxeTry1_fragment() throws RecognitionException {   
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:319:11: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:319:11: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred112_TinyHaxeTry12609); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred112_TinyHaxeTry12611); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred112_TinyHaxeTry12613);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:319:28: ( COMMA funcType )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==COMMA) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // F:\\Programming\\!Proekt\\ANTLR\\TinyHaxeTry1.g:319:29: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred112_TinyHaxeTry12616); if (state.failed) return ;
                pushFollow(FOLLOW_funcType_in_synpred112_TinyHaxeTry12618);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred112_TinyHaxeTry12622); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred112_TinyHaxeTry1

    // Delegated rules

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
    public final boolean synpred23_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred102_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred52_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred67_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred26_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred112_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred99_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA93 dfa93 = new DFA93(this);
    static final String DFA16_eotS =
        "\67\uffff";
    static final String DFA16_eofS =
        "\1\1\66\uffff";
    static final String DFA16_minS =
        "\1\20\1\uffff\1\0\64\uffff";
    static final String DFA16_maxS =
        "\1\142\1\uffff\1\0\64\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\64\uffff\1\2";
    static final String DFA16_specialS =
        "\2\uffff\1\0\64\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\1\2\1\uffff\1\1\4\uffff\1\1\1\uffff\11\1\1\uffff\2\1\1"+
            "\uffff\12\1\4\uffff\1\1\4\uffff\2\1\10\uffff\21\1\6\uffff\1"+
            "\1\1\uffff\6\1",
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
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "152:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_TinyHaxeTry1()) ) {s = 1;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\60\uffff";
    static final String DFA15_eofS =
        "\1\1\57\uffff";
    static final String DFA15_minS =
        "\1\20\4\uffff\1\0\52\uffff";
    static final String DFA15_maxS =
        "\1\142\4\uffff\1\0\52\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\55\uffff\1\1";
    static final String DFA15_specialS =
        "\5\uffff\1\0\52\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\2\uffff\1\1\6\uffff\1\5\1\1\1\uffff\6\1\1\uffff\2\1\1"+
            "\uffff\3\1\4\uffff\3\1\4\uffff\1\1\4\uffff\2\1\10\uffff\21\1"+
            "\6\uffff\1\1\1\uffff\6\1",
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
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 153:19: ( COMMA typeConstraint )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_TinyHaxeTry1()) ) {s = 47;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\65\uffff";
    static final String DFA21_eofS =
        "\1\10\64\uffff";
    static final String DFA21_minS =
        "\1\20\1\0\63\uffff";
    static final String DFA21_maxS =
        "\1\142\1\0\63\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\1\5\uffff\1\2\54\uffff";
    static final String DFA21_specialS =
        "\1\uffff\1\0\63\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\10\1\2\1\uffff\1\10\4\uffff\1\2\1\uffff\2\10\1\2\6\10\1"+
            "\uffff\2\10\1\uffff\3\10\4\2\3\10\4\uffff\1\10\4\uffff\1\1\1"+
            "\10\10\uffff\21\10\6\uffff\1\10\1\uffff\6\10",
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
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "160:1: type : ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 2;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\70\uffff";
    static final String DFA22_eofS =
        "\1\16\67\uffff";
    static final String DFA22_minS =
        "\1\20\65\0\2\uffff";
    static final String DFA22_maxS =
        "\1\142\65\0\2\uffff";
    static final String DFA22_acceptS =
        "\66\uffff\1\1\1\2";
    static final String DFA22_specialS =
        "\1\uffff\1\7\1\61\1\52\1\50\1\45\1\37\1\27\1\13\1\26\1\46\1\51"+
        "\1\54\1\21\1\36\1\1\1\22\1\57\1\12\1\11\1\53\1\35\1\17\1\6\1\23"+
        "\1\5\1\10\1\62\1\0\1\3\1\43\1\41\1\4\1\33\1\16\1\2\1\55\1\47\1\63"+
        "\1\56\1\32\1\60\1\64\1\20\1\14\1\44\1\40\1\34\1\30\1\31\1\24\1\15"+
        "\1\25\1\42\2\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\17\1\2\1\uffff\1\20\4\uffff\1\5\1\uffff\1\14\1\53\1\65\1"+
            "\13\1\55\1\56\1\57\1\60\1\61\1\uffff\1\27\1\15\1\uffff\1\64"+
            "\1\63\1\12\1\7\1\3\1\4\1\6\1\32\1\10\1\11\4\uffff\1\62\4\uffff"+
            "\1\1\1\26\10\uffff\1\54\1\52\1\51\1\45\1\46\1\47\1\50\1\42\1"+
            "\43\1\44\1\40\1\41\1\36\1\37\1\33\1\34\1\35\6\uffff\1\24\1\uffff"+
            "\1\21\1\22\1\23\1\30\1\31\1\25",
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "165:8: ( type | typeList )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_28 = input.LA(1);

                         
                        int index22_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_28);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_15 = input.LA(1);

                         
                        int index22_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_35 = input.LA(1);

                         
                        int index22_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_35);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_29 = input.LA(1);

                         
                        int index22_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_29);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_32 = input.LA(1);

                         
                        int index22_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_32);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_25 = input.LA(1);

                         
                        int index22_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_25);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_23 = input.LA(1);

                         
                        int index22_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_23);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_26 = input.LA(1);

                         
                        int index22_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_26);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA22_19 = input.LA(1);

                         
                        int index22_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_19);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA22_18 = input.LA(1);

                         
                        int index22_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_18);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA22_8 = input.LA(1);

                         
                        int index22_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_8);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA22_44 = input.LA(1);

                         
                        int index22_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_44);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA22_51 = input.LA(1);

                         
                        int index22_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_51);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA22_34 = input.LA(1);

                         
                        int index22_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_34);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA22_22 = input.LA(1);

                         
                        int index22_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_22);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA22_43 = input.LA(1);

                         
                        int index22_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_43);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA22_13 = input.LA(1);

                         
                        int index22_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_13);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA22_16 = input.LA(1);

                         
                        int index22_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_16);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA22_24 = input.LA(1);

                         
                        int index22_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_24);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA22_50 = input.LA(1);

                         
                        int index22_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_50);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA22_52 = input.LA(1);

                         
                        int index22_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_52);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA22_9 = input.LA(1);

                         
                        int index22_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_9);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA22_48 = input.LA(1);

                         
                        int index22_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_48);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA22_49 = input.LA(1);

                         
                        int index22_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_49);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA22_40 = input.LA(1);

                         
                        int index22_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_40);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA22_33 = input.LA(1);

                         
                        int index22_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_33);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA22_47 = input.LA(1);

                         
                        int index22_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_47);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA22_21 = input.LA(1);

                         
                        int index22_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_21);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA22_14 = input.LA(1);

                         
                        int index22_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_14);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA22_46 = input.LA(1);

                         
                        int index22_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_46);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA22_31 = input.LA(1);

                         
                        int index22_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_31);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA22_53 = input.LA(1);

                         
                        int index22_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_53);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA22_30 = input.LA(1);

                         
                        int index22_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_30);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA22_45 = input.LA(1);

                         
                        int index22_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_45);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA22_37 = input.LA(1);

                         
                        int index22_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_37);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_4);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA22_11 = input.LA(1);

                         
                        int index22_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_11);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA22_20 = input.LA(1);

                         
                        int index22_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_20);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA22_12 = input.LA(1);

                         
                        int index22_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_12);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA22_36 = input.LA(1);

                         
                        int index22_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_36);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA22_39 = input.LA(1);

                         
                        int index22_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_39);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA22_17 = input.LA(1);

                         
                        int index22_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_17);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA22_41 = input.LA(1);

                         
                        int index22_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_41);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA22_27 = input.LA(1);

                         
                        int index22_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_27);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA22_38 = input.LA(1);

                         
                        int index22_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_38);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA22_42 = input.LA(1);

                         
                        int index22_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index22_42);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\104\uffff";
    static final String DFA31_eofS =
        "\104\uffff";
    static final String DFA31_minS =
        "\1\20\55\0\21\uffff\1\0\4\uffff";
    static final String DFA31_maxS =
        "\1\151\55\0\21\uffff\1\0\4\uffff";
    static final String DFA31_acceptS =
        "\56\uffff\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\uffff\1\1\1\2\1\20\1\17";
    static final String DFA31_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\21\uffff\1\55\4\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\2\1\21\2\uffff\6\56\1\uffff\1\46\1\77\1\50\1\51\1\52\1\53"+
            "\1\54\1\55\1\6\1\20\1\uffff\1\7\7\uffff\1\24\1\33\1\uffff\1"+
            "\4\1\64\1\uffff\1\65\1\uffff\1\66\1\67\1\70\1\71\1\1\1\uffff"+
            "\1\72\1\73\1\74\1\75\3\uffff\1\76\1\47\1\45\1\44\1\40\1\41\1"+
            "\42\1\43\1\35\1\36\1\37\1\32\1\34\1\30\1\23\1\25\1\26\1\27\1"+
            "\22\1\3\2\31\1\10\1\5\1\uffff\1\56\6\uffff\1\11\1\12\1\13\1"+
            "\14\1\15\1\16\1\17",
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
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "182:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                        else if ( (true) ) {s = 66;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA31_10 = input.LA(1);

                         
                        int index31_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA31_11 = input.LA(1);

                         
                        int index31_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA31_12 = input.LA(1);

                         
                        int index31_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA31_13 = input.LA(1);

                         
                        int index31_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA31_14 = input.LA(1);

                         
                        int index31_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA31_15 = input.LA(1);

                         
                        int index31_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA31_16 = input.LA(1);

                         
                        int index31_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA31_17 = input.LA(1);

                         
                        int index31_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 67;}

                         
                        input.seek(index31_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA31_18 = input.LA(1);

                         
                        int index31_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA31_19 = input.LA(1);

                         
                        int index31_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA31_20 = input.LA(1);

                         
                        int index31_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA31_21 = input.LA(1);

                         
                        int index31_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA31_22 = input.LA(1);

                         
                        int index31_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA31_23 = input.LA(1);

                         
                        int index31_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA31_24 = input.LA(1);

                         
                        int index31_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA31_25 = input.LA(1);

                         
                        int index31_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA31_26 = input.LA(1);

                         
                        int index31_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA31_27 = input.LA(1);

                         
                        int index31_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA31_28 = input.LA(1);

                         
                        int index31_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA31_29 = input.LA(1);

                         
                        int index31_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA31_30 = input.LA(1);

                         
                        int index31_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA31_31 = input.LA(1);

                         
                        int index31_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA31_32 = input.LA(1);

                         
                        int index31_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA31_33 = input.LA(1);

                         
                        int index31_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA31_34 = input.LA(1);

                         
                        int index31_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA31_35 = input.LA(1);

                         
                        int index31_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA31_36 = input.LA(1);

                         
                        int index31_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA31_37 = input.LA(1);

                         
                        int index31_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA31_38 = input.LA(1);

                         
                        int index31_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA31_39 = input.LA(1);

                         
                        int index31_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA31_40 = input.LA(1);

                         
                        int index31_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA31_41 = input.LA(1);

                         
                        int index31_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA31_42 = input.LA(1);

                         
                        int index31_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA31_43 = input.LA(1);

                         
                        int index31_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA31_44 = input.LA(1);

                         
                        int index31_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_44);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA31_45 = input.LA(1);

                         
                        int index31_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_45);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA31_63 = input.LA(1);

                         
                        int index31_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 62;}

                         
                        input.seek(index31_63);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\103\uffff";
    static final String DFA34_eofS =
        "\103\uffff";
    static final String DFA34_minS =
        "\1\20\6\0\74\uffff";
    static final String DFA34_maxS =
        "\1\151\6\0\74\uffff";
    static final String DFA34_acceptS =
        "\7\uffff\1\2\1\uffff\1\3\70\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\74\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\11\2\uffff\2\5\1\1\1\2\1\3\1\4\1\uffff\12\11\1\uffff\1\11"+
            "\7\uffff\2\11\1\uffff\2\11\1\uffff\1\11\1\uffff\5\11\1\uffff"+
            "\4\11\3\uffff\30\11\1\uffff\1\6\2\7\4\uffff\7\11",
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
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

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
        public String getDescription() {
            return "209:1: blockStmt : ( varDecl | classDecl | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_TinyHaxeTry1()) ) {s = 66;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_TinyHaxeTry1()) ) {s = 66;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_TinyHaxeTry1()) ) {s = 66;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_TinyHaxeTry1()) ) {s = 66;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_TinyHaxeTry1()) ) {s = 66;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_TinyHaxeTry1()) ) {s = 66;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_6);
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
    static final String DFA54_eotS =
        "\64\uffff";
    static final String DFA54_eofS =
        "\1\20\63\uffff";
    static final String DFA54_minS =
        "\1\20\15\0\46\uffff";
    static final String DFA54_maxS =
        "\1\151\15\0\46\uffff";
    static final String DFA54_acceptS =
        "\16\uffff\1\3\1\4\1\5\41\uffff\1\1\1\2";
    static final String DFA54_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\46\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\20\1\15\10\uffff\2\20\1\15\6\20\1\1\1\14\1\20\1\2\2\20\5"+
            "\uffff\2\20\5\uffff\1\20\4\uffff\1\3\1\20\10\uffff\21\20\1\17"+
            "\1\16\2\uffff\1\4\11\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
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

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "297:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_3 = input.LA(1);

                         
                        int index54_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_4 = input.LA(1);

                         
                        int index54_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_5 = input.LA(1);

                         
                        int index54_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA54_6 = input.LA(1);

                         
                        int index54_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA54_7 = input.LA(1);

                         
                        int index54_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA54_8 = input.LA(1);

                         
                        int index54_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA54_9 = input.LA(1);

                         
                        int index54_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA54_10 = input.LA(1);

                         
                        int index54_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA54_11 = input.LA(1);

                         
                        int index54_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA54_12 = input.LA(1);

                         
                        int index54_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA54_13 = input.LA(1);

                         
                        int index54_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\64\uffff";
    static final String DFA56_eofS =
        "\1\16\63\uffff";
    static final String DFA56_minS =
        "\1\20\1\uffff\1\0\11\uffff\1\0\47\uffff";
    static final String DFA56_maxS =
        "\1\151\1\uffff\1\0\11\uffff\1\0\47\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\7\uffff\1\7\1\10\43\uffff\1\2"+
        "\1\6";
    static final String DFA56_specialS =
        "\2\uffff\1\0\11\uffff\1\1\47\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\16\1\15\10\uffff\2\16\1\15\6\16\1\1\1\14\1\16\1\2\2\16\5"+
            "\uffff\2\16\5\uffff\1\16\4\uffff\1\3\1\16\10\uffff\23\16\2\uffff"+
            "\1\4\11\uffff\7\5",
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

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

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
        public String getDescription() {
            return "305:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_12 = input.LA(1);

                         
                        int index56_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index56_12);
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
    static final String DFA55_eotS =
        "\101\uffff";
    static final String DFA55_eofS =
        "\101\uffff";
    static final String DFA55_minS =
        "\1\20\54\0\1\uffff\1\0\21\uffff\1\0";
    static final String DFA55_maxS =
        "\1\151\54\0\1\uffff\1\0\21\uffff\1\0";
    static final String DFA55_acceptS =
        "\55\uffff\1\1\1\uffff\1\2\21\uffff";
    static final String DFA55_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\uffff\1\54\21\uffff\1\55}>";
    static final String[] DFA55_transitionS = {
            "\1\57\1\20\2\uffff\6\57\1\uffff\1\45\1\100\1\47\1\50\1\51\1"+
            "\52\1\53\1\54\1\4\1\17\1\55\1\5\7\uffff\1\23\1\32\1\uffff\1"+
            "\2\1\57\1\uffff\1\57\1\uffff\4\57\1\6\1\uffff\4\57\3\uffff\1"+
            "\56\1\46\1\44\1\43\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31\1"+
            "\33\1\27\1\22\1\24\1\25\1\26\1\21\1\1\2\30\1\7\1\3\1\uffff\1"+
            "\57\6\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
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
            "\1\uffff"
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "310:22: ( expr | statement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_2 = input.LA(1);

                         
                        int index55_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_3 = input.LA(1);

                         
                        int index55_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA55_4 = input.LA(1);

                         
                        int index55_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA55_5 = input.LA(1);

                         
                        int index55_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA55_6 = input.LA(1);

                         
                        int index55_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA55_7 = input.LA(1);

                         
                        int index55_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA55_8 = input.LA(1);

                         
                        int index55_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA55_9 = input.LA(1);

                         
                        int index55_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA55_10 = input.LA(1);

                         
                        int index55_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA55_11 = input.LA(1);

                         
                        int index55_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA55_12 = input.LA(1);

                         
                        int index55_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA55_13 = input.LA(1);

                         
                        int index55_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA55_14 = input.LA(1);

                         
                        int index55_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA55_15 = input.LA(1);

                         
                        int index55_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA55_16 = input.LA(1);

                         
                        int index55_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA55_17 = input.LA(1);

                         
                        int index55_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA55_18 = input.LA(1);

                         
                        int index55_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA55_19 = input.LA(1);

                         
                        int index55_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA55_20 = input.LA(1);

                         
                        int index55_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA55_21 = input.LA(1);

                         
                        int index55_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA55_22 = input.LA(1);

                         
                        int index55_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA55_23 = input.LA(1);

                         
                        int index55_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA55_24 = input.LA(1);

                         
                        int index55_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA55_25 = input.LA(1);

                         
                        int index55_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA55_26 = input.LA(1);

                         
                        int index55_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA55_27 = input.LA(1);

                         
                        int index55_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA55_28 = input.LA(1);

                         
                        int index55_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA55_29 = input.LA(1);

                         
                        int index55_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA55_30 = input.LA(1);

                         
                        int index55_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA55_31 = input.LA(1);

                         
                        int index55_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA55_32 = input.LA(1);

                         
                        int index55_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA55_33 = input.LA(1);

                         
                        int index55_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA55_34 = input.LA(1);

                         
                        int index55_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA55_35 = input.LA(1);

                         
                        int index55_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA55_36 = input.LA(1);

                         
                        int index55_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA55_37 = input.LA(1);

                         
                        int index55_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA55_38 = input.LA(1);

                         
                        int index55_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA55_39 = input.LA(1);

                         
                        int index55_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA55_40 = input.LA(1);

                         
                        int index55_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA55_41 = input.LA(1);

                         
                        int index55_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA55_42 = input.LA(1);

                         
                        int index55_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA55_43 = input.LA(1);

                         
                        int index55_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA55_44 = input.LA(1);

                         
                        int index55_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_44);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA55_46 = input.LA(1);

                         
                        int index55_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_46);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA55_64 = input.LA(1);

                         
                        int index55_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_64);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\11\uffff";
    static final String DFA68_eofS =
        "\11\uffff";
    static final String DFA68_minS =
        "\6\24\1\21\2\uffff";
    static final String DFA68_maxS =
        "\6\43\1\61\2\uffff";
    static final String DFA68_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA68_specialS =
        "\11\uffff}>";
    static final String[] DFA68_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\1\10\37\uffff\1\7",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "379:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA69_eotS =
        "\14\uffff";
    static final String DFA69_eofS =
        "\14\uffff";
    static final String DFA69_minS =
        "\6\24\2\21\4\uffff";
    static final String DFA69_maxS =
        "\6\43\2\61\4\uffff";
    static final String DFA69_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA69_specialS =
        "\14\uffff}>";
    static final String[] DFA69_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7",
            "\1\11\37\uffff\1\10",
            "\1\13\37\uffff\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "385:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA72_eotS =
        "\11\uffff";
    static final String DFA72_eofS =
        "\11\uffff";
    static final String DFA72_minS =
        "\6\24\3\uffff";
    static final String DFA72_maxS =
        "\6\134\3\uffff";
    static final String DFA72_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA72_specialS =
        "\11\uffff}>";
    static final String[] DFA72_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7\67\uffff\1\10\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7\70\uffff\1\6",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "405:1: classMember : ( varDecl | funcDecl | enumDecl );";
        }
    }
    static final String DFA73_eotS =
        "\11\uffff";
    static final String DFA73_eofS =
        "\1\10\10\uffff";
    static final String DFA73_minS =
        "\6\24\3\uffff";
    static final String DFA73_maxS =
        "\6\134\3\uffff";
    static final String DFA73_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA73_specialS =
        "\11\uffff}>";
    static final String[] DFA73_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7\27\uffff\1\10\40\uffff\1"+
            "\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\11\uffff\1\7\70\uffff\1\6",
            "",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

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
        public String getDescription() {
            return "416:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );";
        }
    }
    static final String DFA93_eotS =
        "\101\uffff";
    static final String DFA93_eofS =
        "\101\uffff";
    static final String DFA93_minS =
        "\1\20\54\0\1\uffff\1\0\21\uffff\1\0";
    static final String DFA93_maxS =
        "\1\151\54\0\1\uffff\1\0\21\uffff\1\0";
    static final String DFA93_acceptS =
        "\55\uffff\1\1\1\uffff\1\2\21\uffff";
    static final String DFA93_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\uffff\1\54\21\uffff\1\55}>";
    static final String[] DFA93_transitionS = {
            "\1\57\1\20\2\uffff\6\57\1\uffff\1\45\1\100\1\47\1\50\1\51\1"+
            "\52\1\53\1\54\1\4\1\17\1\55\1\5\7\uffff\1\23\1\32\1\uffff\1"+
            "\2\1\57\1\uffff\1\57\1\uffff\4\57\1\6\1\uffff\4\57\3\uffff\1"+
            "\56\1\46\1\44\1\43\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31\1"+
            "\33\1\27\1\22\1\24\1\25\1\26\1\21\1\1\2\30\1\7\1\3\1\uffff\1"+
            "\57\6\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
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
            "\1\uffff"
    };

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "310:22: ( expr | statement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA93_1 = input.LA(1);

                         
                        int index93_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA93_2 = input.LA(1);

                         
                        int index93_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA93_3 = input.LA(1);

                         
                        int index93_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA93_4 = input.LA(1);

                         
                        int index93_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA93_5 = input.LA(1);

                         
                        int index93_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA93_6 = input.LA(1);

                         
                        int index93_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA93_7 = input.LA(1);

                         
                        int index93_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA93_8 = input.LA(1);

                         
                        int index93_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA93_9 = input.LA(1);

                         
                        int index93_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA93_10 = input.LA(1);

                         
                        int index93_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA93_11 = input.LA(1);

                         
                        int index93_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA93_12 = input.LA(1);

                         
                        int index93_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA93_13 = input.LA(1);

                         
                        int index93_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA93_14 = input.LA(1);

                         
                        int index93_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA93_15 = input.LA(1);

                         
                        int index93_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA93_16 = input.LA(1);

                         
                        int index93_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA93_17 = input.LA(1);

                         
                        int index93_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA93_18 = input.LA(1);

                         
                        int index93_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA93_19 = input.LA(1);

                         
                        int index93_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA93_20 = input.LA(1);

                         
                        int index93_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA93_21 = input.LA(1);

                         
                        int index93_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA93_22 = input.LA(1);

                         
                        int index93_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA93_23 = input.LA(1);

                         
                        int index93_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA93_24 = input.LA(1);

                         
                        int index93_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA93_25 = input.LA(1);

                         
                        int index93_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA93_26 = input.LA(1);

                         
                        int index93_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA93_27 = input.LA(1);

                         
                        int index93_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA93_28 = input.LA(1);

                         
                        int index93_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA93_29 = input.LA(1);

                         
                        int index93_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA93_30 = input.LA(1);

                         
                        int index93_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA93_31 = input.LA(1);

                         
                        int index93_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA93_32 = input.LA(1);

                         
                        int index93_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA93_33 = input.LA(1);

                         
                        int index93_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA93_34 = input.LA(1);

                         
                        int index93_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA93_35 = input.LA(1);

                         
                        int index93_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA93_36 = input.LA(1);

                         
                        int index93_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA93_37 = input.LA(1);

                         
                        int index93_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA93_38 = input.LA(1);

                         
                        int index93_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA93_39 = input.LA(1);

                         
                        int index93_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA93_40 = input.LA(1);

                         
                        int index93_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA93_41 = input.LA(1);

                         
                        int index93_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA93_42 = input.LA(1);

                         
                        int index93_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA93_43 = input.LA(1);

                         
                        int index93_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA93_44 = input.LA(1);

                         
                        int index93_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_44);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA93_46 = input.LA(1);

                         
                        int index93_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_46);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA93_64 = input.LA(1);

                         
                        int index93_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_64);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 93, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module129 = new BitSet(new long[]{0x0000000000080000L,0x00000004E8000000L});
    public static final BitSet FOLLOW_topLevelList_in_module132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList168 = new BitSet(new long[]{0x0000000000080002L,0x00000004E8000000L});
    public static final BitSet FOLLOW_myImport_in_topLevel187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage233 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage235 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_myPackage237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier266 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier279 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier283 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IMPORT_in_myImport325 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport328 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_myImport330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_access0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_declAttr417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList535 = new BitSet(new long[]{0x0000000003F00002L});
    public static final BitSet FOLLOW_param_in_paramList576 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList579 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_param_in_paramList581 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_QUES_in_param620 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param623 = new BitSet(new long[]{0x0000010020000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param625 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_varInit_in_param627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_id0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent682 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_DOT_in_dotIdent690 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_id_in_dotIdent694 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_EQ_in_assignOp718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit838 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit840 = new BitSet(new long[]{0x0000002008020000L});
    public static final BitSet FOLLOW_paramList_in_funcLit842 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit844 = new BitSet(new long[]{0x0400010000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit846 = new BitSet(new long[]{0x0400010000010000L});
    public static final BitSet FOLLOW_block_in_funcLit849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit884 = new BitSet(new long[]{0x040240D810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit887 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag908 = new BitSet(new long[]{0x04003E0011020000L});
    public static final BitSet FOLLOW_funcType_in_typeTag911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList949 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList952 = new BitSet(new long[]{0x04003E0011020000L});
    public static final BitSet FOLLOW_funcType_in_typeList955 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList963 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList966 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList969 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_type_in_funcType984 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType988 = new BitSet(new long[]{0x04003E0011020000L});
    public static final BitSet FOLLOW_type_in_funcType991 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_VOID_in_funcType998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_type1010 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_dotIdent_in_type1014 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_INT_in_type1017 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type1020 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_type1023 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_type1025 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_VOID_in_type1027 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_typeParam_in_type1031 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1049 = new BitSet(new long[]{0x0401BE0011020000L});
    public static final BitSet FOLLOW_type_in_typeParam1053 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_typeList_in_typeParam1055 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_GT_in_typeParam1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGT_in_typeParam1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1127 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1129 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1131 = new BitSet(new long[]{0x0401BE0011020000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1133 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_functionReturn1161 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionReturn1164 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NEW_in_functionReturn1166 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_functionReturn1168 = new BitSet(new long[]{0x0000002008020000L});
    public static final BitSet FOLLOW_paramList_in_functionReturn1170 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_functionReturn1172 = new BitSet(new long[]{0x0400010000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_functionReturn1174 = new BitSet(new long[]{0x0400010000010000L});
    public static final BitSet FOLLOW_block_in_functionReturn1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_statement1218 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1231 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1233 = new BitSet(new long[]{0xF7D6415813F30000L,0x000003F817E20008L});
    public static final BitSet FOLLOW_statement_in_statement1237 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1240 = new BitSet(new long[]{0xF7D6415813F30000L,0x000003F817E20008L});
    public static final BitSet FOLLOW_statement_in_statement1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1284 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1286 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_statement1290 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IN_in_statement1292 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_statement1296 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1298 = new BitSet(new long[]{0xF7D6415813F30000L,0x000003F817E20008L});
    public static final BitSet FOLLOW_statement_in_statement1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1328 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1330 = new BitSet(new long[]{0xF7D6415813F30000L,0x000003F817E20008L});
    public static final BitSet FOLLOW_statement_in_statement1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1356 = new BitSet(new long[]{0xF7D6415813F30000L,0x000003F817E20008L});
    public static final BitSet FOLLOW_statement_in_statement1358 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1360 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1362 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement1387 = new BitSet(new long[]{0x0400010000010000L});
    public static final BitSet FOLLOW_block_in_statement1389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_catchStmtList_in_statement1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement1415 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1417 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_statement1419 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1421 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_statement1423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_caseStmt_in_statement1425 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_RBRACE_in_statement1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1449 = new BitSet(new long[]{0x0402405810030000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_statement1452 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1474 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_statement1476 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1497 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1500 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1521 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1524 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement1546 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1555 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_statement1557 = new BitSet(new long[]{0xF7D6415813F30000L,0x000003F817E20008L});
    public static final BitSet FOLLOW_statement_in_statement1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1601 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_parExpression1604 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block1621 = new BitSet(new long[]{0xFFD6415813F30000L,0x000003F877E20008L});
    public static final BitSet FOLLOW_blockStmt_in_block1624 = new BitSet(new long[]{0xFFD6415813F30000L,0x000003F877E20008L});
    public static final BitSet FOLLOW_RBRACE_in_block1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt1709 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt1730 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt1743 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_exprList_in_caseStmt1745 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt1747 = new BitSet(new long[]{0xF7D6415813F30000L,0x000003F817E20008L});
    public static final BitSet FOLLOW_statement_in_caseStmt1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt1767 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt1769 = new BitSet(new long[]{0xF7D6415813F30000L,0x000003F817E20008L});
    public static final BitSet FOLLOW_statement_in_caseStmt1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt1800 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList1815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt1846 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt1848 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_param_in_catchStmt1850 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt1852 = new BitSet(new long[]{0x0400010000010000L});
    public static final BitSet FOLLOW_block_in_catchStmt1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList1900 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList1903 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_exprList1906 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr1924 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_assignExpr_in_expr1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr1954 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr1957 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr1960 = new BitSet(new long[]{0x00000007E0000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr1973 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr1976 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr1979 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr1999 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2002 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2005 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2007 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2010 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2038 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2041 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2044 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2065 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2069 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2072 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2086 = new BitSet(new long[]{0x0000C00000000002L,0x0000000000000780L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2091 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2095 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2100 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2105 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2110 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2115 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2120 = new BitSet(new long[]{0x0000C00000000002L,0x0000000000000780L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2138 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2141 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2145 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2148 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2151 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2154 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2168 = new BitSet(new long[]{0x0000800000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2172 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2176 = new BitSet(new long[]{0x0000800000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2181 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2183 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2188 = new BitSet(new long[]{0x0000800000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2192 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2195 = new BitSet(new long[]{0x0000800000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2214 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_SUB_in_addExpr2219 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2223 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2237 = new BitSet(new long[]{0x0000000000000002L,0x00000000001C0000L});
    public static final BitSet FOLLOW_STAR_in_multExpr2242 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2245 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2248 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2252 = new BitSet(new long[]{0x0000000000000002L,0x00000000001C0000L});
    public static final BitSet FOLLOW_set_in_prefixExpr2273 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2340 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_suffixExpr2342 = new BitSet(new long[]{0x0402407810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2344 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_suffixExpr2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2367 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2369 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_suffixExpr2371 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_suffixExpr2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2429 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_suffixExpr2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value2506 = new BitSet(new long[]{0xF7D6415813F30000L,0x000003F817E20008L});
    public static final BitSet FOLLOW_expr_in_value2510 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_statement_in_value2512 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_value2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_value2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr2575 = new BitSet(new long[]{0x04003C1011020000L});
    public static final BitSet FOLLOW_type_in_newExpr2577 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr2579 = new BitSet(new long[]{0x0402407810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr2581 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast2609 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast2611 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_cast2613 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_COMMA_in_cast2616 = new BitSet(new long[]{0x04003E0011020000L});
    public static final BitSet FOLLOW_funcType_in_cast2618 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast2640 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast2642 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_cast2644 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl2712 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl2714 = new BitSet(new long[]{0x0400400000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl2716 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumDecl2718 = new BitSet(new long[]{0x0800000000020000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl2720 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumDecl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody2748 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl2767 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl2769 = new BitSet(new long[]{0x0000002008020000L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl2771 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl2773 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl2801 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList2842 = new BitSet(new long[]{0x0000000003F00000L,0x0000000010000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl2856 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_VAR_in_varDecl2860 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl2862 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList2895 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList2898 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList2901 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart2915 = new BitSet(new long[]{0x0000011020000000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart2920 = new BitSet(new long[]{0x0000010020000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart2922 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclPart2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl2934 = new BitSet(new long[]{0x0000000001020000L,0x0000000002000002L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl2938 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl2940 = new BitSet(new long[]{0x0000000001020000L,0x0000000002000002L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl2944 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit3021 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_varInit3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3050 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3053 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl3055 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3057 = new BitSet(new long[]{0x0000002008020000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3059 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3061 = new BitSet(new long[]{0x0400010000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3063 = new BitSet(new long[]{0x0400010000010000L});
    public static final BitSet FOLLOW_block_in_funcDecl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3098 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3101 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3103 = new BitSet(new long[]{0x0000401000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3105 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3107 = new BitSet(new long[]{0x0000002008020000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3109 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3111 = new BitSet(new long[]{0x0400010000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3113 = new BitSet(new long[]{0x0400010000010000L});
    public static final BitSet FOLLOW_block_in_funcDecl3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3157 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3159 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3161 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3163 = new BitSet(new long[]{0x0000002008020000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3165 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3167 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3169 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3198 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3200 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3202 = new BitSet(new long[]{0x0000401000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3204 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3206 = new BitSet(new long[]{0x0000002008020000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3208 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3210 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3212 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3244 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3246 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3248 = new BitSet(new long[]{0x0000002008020000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3250 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3252 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3254 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3280 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3282 = new BitSet(new long[]{0x0000401000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3284 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3286 = new BitSet(new long[]{0x0000002008020000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3288 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3290 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3292 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERN_in_classDecl3328 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl3331 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl3333 = new BitSet(new long[]{0x0400400000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl3335 = new BitSet(new long[]{0x0400400000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl3337 = new BitSet(new long[]{0x0400400000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope3377 = new BitSet(new long[]{0x0800000803F00000L,0x0000000018000000L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope3380 = new BitSet(new long[]{0x0800000803F00000L,0x0000000018000000L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classMember3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_classMember3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl3445 = new BitSet(new long[]{0x04003C0011020000L,0x0000000300000000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl3447 = new BitSet(new long[]{0x0400000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl3449 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl3451 = new BitSet(new long[]{0x0800000803F00000L,0x0000000010000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl3454 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody3469 = new BitSet(new long[]{0x0000000803F00000L,0x0000000010000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody3476 = new BitSet(new long[]{0x0000000803F00000L,0x0000000010000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList3500 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList3503 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList3506 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit3560 = new BitSet(new long[]{0x04003C0011020000L});
    public static final BitSet FOLLOW_type_in_inherit3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit3584 = new BitSet(new long[]{0x04003C0011020000L});
    public static final BitSet FOLLOW_type_in_inherit3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl3614 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl3616 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl3618 = new BitSet(new long[]{0x04003E0011020000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend3639 = new BitSet(new long[]{0x04003E0011020000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend3641 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType3654 = new BitSet(new long[]{0x0800800003F20000L,0x0000000010000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType3689 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType3717 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType3746 = new BitSet(new long[]{0x0800000003F20000L,0x0000000010000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType3774 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType3800 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList3858 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList3861 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList3864 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit3876 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit3879 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField3893 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField3895 = new BitSet(new long[]{0x04003E0011020000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList3914 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList3917 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList3920 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem3941 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem3943 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_objLitElem3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTagOpt_in_synpred21_TinyHaxeTry1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred23_TinyHaxeTry1952 = new BitSet(new long[]{0x04003E0011020000L});
    public static final BitSet FOLLOW_funcType_in_synpred23_TinyHaxeTry1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_synpred24_TinyHaxeTry1949 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred24_TinyHaxeTry1952 = new BitSet(new long[]{0x04003E0011020000L});
    public static final BitSet FOLLOW_funcType_in_synpred24_TinyHaxeTry1955 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred25_TinyHaxeTry1966 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_typeConstraint_in_synpred25_TinyHaxeTry1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred26_TinyHaxeTry1988 = new BitSet(new long[]{0x04003C0011020000L});
    public static final BitSet FOLLOW_type_in_synpred26_TinyHaxeTry1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred27_TinyHaxeTry1984 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred27_TinyHaxeTry1988 = new BitSet(new long[]{0x04003E0011020000L});
    public static final BitSet FOLLOW_type_in_synpred27_TinyHaxeTry1991 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred34_TinyHaxeTry11031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_synpred35_TinyHaxeTry11010 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_dotIdent_in_synpred35_TinyHaxeTry11014 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_INT_in_synpred35_TinyHaxeTry11017 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_FLOAT_in_synpred35_TinyHaxeTry11020 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_synpred35_TinyHaxeTry11023 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_synpred35_TinyHaxeTry11025 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_VOID_in_synpred35_TinyHaxeTry11027 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred35_TinyHaxeTry11031 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_type_in_synpred36_TinyHaxeTry11053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred37_TinyHaxeTry11059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGT_in_synpred38_TinyHaxeTry11062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred39_TinyHaxeTry11084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred41_TinyHaxeTry11213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred42_TinyHaxeTry11218 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_synpred42_TinyHaxeTry11220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred44_TinyHaxeTry11240 = new BitSet(new long[]{0xF7D6415813F30000L,0x000003F817E20008L});
    public static final BitSet FOLLOW_statement_in_synpred44_TinyHaxeTry11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred52_TinyHaxeTry11452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred59_TinyHaxeTry11546 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_synpred59_TinyHaxeTry11549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred60_TinyHaxeTry11555 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_COLON_in_synpred60_TinyHaxeTry11557 = new BitSet(new long[]{0xF7D6415813F30000L,0x000003F817E20008L});
    public static final BitSet FOLLOW_statement_in_synpred60_TinyHaxeTry11559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred63_TinyHaxeTry11666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred67_TinyHaxeTry11880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred85_TinyHaxeTry12181 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_GT_in_synpred85_TinyHaxeTry12183 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_addExpr_in_synpred85_TinyHaxeTry12188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred96_TinyHaxeTry12273 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20000L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred96_TinyHaxeTry12285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred99_TinyHaxeTry12340 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred99_TinyHaxeTry12342 = new BitSet(new long[]{0x0402407810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_exprListOpt_in_synpred99_TinyHaxeTry12344 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred99_TinyHaxeTry12346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred100_TinyHaxeTry12367 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred100_TinyHaxeTry12369 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_synpred100_TinyHaxeTry12371 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred100_TinyHaxeTry12373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred101_TinyHaxeTry12378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred101_TinyHaxeTry12380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred102_TinyHaxeTry12404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred102_TinyHaxeTry12406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_synpred104_TinyHaxeTry12446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred108_TinyHaxeTry12510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred109_TinyHaxeTry12506 = new BitSet(new long[]{0xF7D6415813F30000L,0x000003F817E20008L});
    public static final BitSet FOLLOW_expr_in_synpred109_TinyHaxeTry12510 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_statement_in_synpred109_TinyHaxeTry12512 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred109_TinyHaxeTry12515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred112_TinyHaxeTry12609 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred112_TinyHaxeTry12611 = new BitSet(new long[]{0x0402405810020000L,0x000003F807E20008L});
    public static final BitSet FOLLOW_expr_in_synpred112_TinyHaxeTry12613 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred112_TinyHaxeTry12616 = new BitSet(new long[]{0x04003E0011020000L});
    public static final BitSet FOLLOW_funcType_in_synpred112_TinyHaxeTry12618 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred112_TinyHaxeTry12622 = new BitSet(new long[]{0x0000000000000002L});

}