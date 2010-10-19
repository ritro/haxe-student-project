// $ANTLR 3.2 Sep 23, 2009 12:02:23 TinyHaxeTry1.g 2010-10-19 22:47:25

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROPERTY_DECL", "MODULE", "SUFFIX_EXPR", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG", "TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "DECL_ATTR_LIST", "VAR_INIT", "ASSIGN_OPERATOR", "PACKAGE", "SEMI", "IDENTIFIER", "DOT", "IMPORT", "PUBLIC", "PRIVATE", "STATIC", "INLINE", "DYNAMIC", "OVERRIDE", "COMMA", "QUES", "EQ", "PLUSEQ", "SUBEQ", "SLASHEQ", "PERCENTEQ", "AMPEQ", "FUNCTION", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COLON", "MINUS_BIGGER", "VOID", "INT", "FLOAT", "BOOLEAN", "LT", "GT", "GTGT", "NEW", "IF", "ELSE", "FOR", "IN", "WHILE", "DO", "TRY", "SWITCH", "LBRACE", "RBRACE", "RETURN", "THROW", "BREAK", "CONTINUE", "CASE", "DEFAULT", "CATCH", "ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ", "BAR", "AMP", "CARET", "LTLT", "GTGTGT", "PLUS", "SUB", "STAR", "SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "BANG", "TILDE", "NULL", "CAST", "ENUM", "VAR", "EXTERN", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "TYPEDEF", "LONGLITERAL", "INTLITERAL", "STRINGLITERAL", "CHARLITERAL", "FLOATNUM", "TRUE", "FALSE", "WS", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "EscapeSequence", "ABSTRACT", "BYTE", "CHAR", "CONST", "DOUBLE", "FINAL", "FINALLY", "GOTO", "INSTANCEOF", "LONG", "NATIVE", "PROTECTED", "SHORT", "STRICTFP", "SUPER", "THIS", "THROWS", "TRANSIENT", "VOLATILE", "STAREQ", "BAREQ", "CARETEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "MONKEYS_AT", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "LTLTEQ", "GTGTEQ", "GTGTGTEQ", "INTNUM", "EXPONENT", "COMMENT", "TS", "PP_CONDITIONAL", "PREPROCESSOR_DIRECTIVE", "IF_TOKEN", "ELSE_TOKEN", "ENDIF_TOKEN", "PP_EXPRESSION", "PP_OR_EXPRESSION", "PP_AND_EXPRESSION", "PP_UNARY_EXPRESSION", "PP_PRIMARY_EXPRESSION", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ"
    };
    public static final int FUNCTION=34;
    public static final int PACKAGE=15;
    public static final int CAST=88;
    public static final int EXPONENT=147;
    public static final int LT=45;
    public static final int STAR=80;
    public static final int WHILE=53;
    public static final int PP_OR_EXPRESSION=156;
    public static final int FLOATNUM=101;
    public static final int CONST=114;
    public static final int OCTAL_ESC=162;
    public static final int CASE=63;
    public static final int CHAR=113;
    public static final int NEW=48;
    public static final int DO=54;
    public static final int EXTERN=91;
    public static final int EOF=-1;
    public static final int GTGT=47;
    public static final int BREAK=61;
    public static final int ELSE_TOKEN=153;
    public static final int LBRACKET=37;
    public static final int FINAL=116;
    public static final int RPAREN=36;
    public static final int IMPORT=19;
    public static final int SUBSUB=83;
    public static final int STAREQ=130;
    public static final int PP_AND_EXPRESSION=157;
    public static final int CARET=75;
    public static final int THIS=126;
    public static final int RETURN=59;
    public static final int DOUBLE=115;
    public static final int MONKEYS_AT=139;
    public static final int BARBAR=67;
    public static final int VAR=90;
    public static final int VOID=41;
    public static final int SUPER=125;
    public static final int GOTO=118;
    public static final int EQ=28;
    public static final int COMMENT=148;
    public static final int AMPAMP=68;
    public static final int VAR_INIT=13;
    public static final int LTLTEQ=143;
    public static final int QUES=27;
    public static final int EQEQ=69;
    public static final int HexPrefix=107;
    public static final int PERCENTDBBQ=135;
    public static final int RBRACE=58;
    public static final int STATIC=22;
    public static final int PRIVATE=21;
    public static final int BLOCK_SCOPE=7;
    public static final int SWITCH=56;
    public static final int NULL=87;
    public static final int GTGTEQ=144;
    public static final int STRICTFP=124;
    public static final int ELSE=50;
    public static final int NATIVE=121;
    public static final int ELLIPSIS=66;
    public static final int THROWS=127;
    public static final int INT=42;
    public static final int SLASHEQ=31;
    public static final int INTLITERAL=98;
    public static final int PERCENTBB=141;
    public static final int TRY=55;
    public static final int IF_TOKEN=152;
    public static final int LongSuffix=106;
    public static final int LONGLITERAL=97;
    public static final int ENDIF_TOKEN=154;
    public static final int PERCENTLL=140;
    public static final int BANGEQQ=138;
    public static final int WS=104;
    public static final int PP_PRIMARY_EXPRESSION=159;
    public static final int PERCENTDLQ=133;
    public static final int INHERIT_LIST_OPT=11;
    public static final int CHARLITERAL=100;
    public static final int GT=46;
    public static final int PP_CONDITIONAL=150;
    public static final int INLINE=23;
    public static final int CATCH=65;
    public static final int FALSE=103;
    public static final int EscapeSequence=110;
    public static final int THROW=60;
    public static final int DYNAMIC=24;
    public static final int PROTECTED=122;
    public static final int CLASS=92;
    public static final int BAREQ=131;
    public static final int IntegerNumber=105;
    public static final int PP_EXPRESSION=155;
    public static final int AMP=74;
    public static final int PLUSPLUS=84;
    public static final int LBRACE=57;
    public static final int TYPE_PARAM_OPT=10;
    public static final int LTEQ=72;
    public static final int SUBEQ=30;
    public static final int GTGTGT=77;
    public static final int Exponent=109;
    public static final int FOR=51;
    public static final int SUFFIX_EXPR=6;
    public static final int SUB=79;
    public static final int FLOAT=43;
    public static final int ABSTRACT=111;
    public static final int MINUS_BIGGER=40;
    public static final int PERCENTDBQ=134;
    public static final int HexDigit=108;
    public static final int PLUSEQ=29;
    public static final int LPAREN=35;
    public static final int IF=49;
    public static final int INTNUM=146;
    public static final int ESC_SEQ=163;
    public static final int BOOLEAN=44;
    public static final int SLASH=81;
    public static final int IN=52;
    public static final int GTGTGTEQ=145;
    public static final int IMPLEMENTS=95;
    public static final int CONTINUE=62;
    public static final int COMMA=26;
    public static final int PREPROCESSOR_DIRECTIVE=151;
    public static final int AMPEQ=33;
    public static final int TRANSIENT=128;
    public static final int IDENTIFIER=17;
    public static final int TILDE=86;
    public static final int BANGEQ=70;
    public static final int PLUS=78;
    public static final int RBRACKET=38;
    public static final int DOT=18;
    public static final int LTLT=76;
    public static final int BYTE=112;
    public static final int PERCENT=82;
    public static final int VOLATILE=129;
    public static final int DECL_ATTR_LIST=12;
    public static final int ASSIGN_OPERATOR=14;
    public static final int TS=149;
    public static final int TYPEDEF=96;
    public static final int UNICODE_ESC=161;
    public static final int EQEQEQ=136;
    public static final int DEFAULT=64;
    public static final int HEX_DIGIT=160;
    public static final int SHORT=123;
    public static final int BANG=85;
    public static final int INSTANCEOF=119;
    public static final int GTEQ=71;
    public static final int MODULE=5;
    public static final int TRUE=102;
    public static final int SEMI=16;
    public static final int COLON=39;
    public static final int PARAM_LIST=8;
    public static final int PERCENTLESQ=137;
    public static final int ENUM=89;
    public static final int FINALLY=117;
    public static final int PERCENTEQ=32;
    public static final int PROPERTY_DECL=4;
    public static final int OVERRIDE=25;
    public static final int STRINGLITERAL=99;
    public static final int CARETEQ=132;
    public static final int PERCENTBBB=142;
    public static final int INTERFACE=93;
    public static final int PP_UNARY_EXPRESSION=158;
    public static final int LONG=120;
    public static final int EXTENDS=94;
    public static final int PUBLIC=20;
    public static final int TYPE_TAG=9;
    public static final int BAR=73;

    // delegates
    // delegators


        public TinyHaxeTry1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TinyHaxeTry1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[234+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TinyHaxeTry1Parser.tokenNames; }
    public String getGrammarFileName() { return "TinyHaxeTry1.g"; }


    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // TinyHaxeTry1.g:65:1: module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) ;
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
            // TinyHaxeTry1.g:65:19: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? ) )
            // TinyHaxeTry1.g:65:21: ( myPackage )? topLevelList
            {
            // TinyHaxeTry1.g:65:21: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // TinyHaxeTry1.g:0:0: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module135);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_topLevelList_in_module138);
            topLevelList2=topLevelList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_topLevelList.add(topLevelList2.getTree());


            // AST REWRITE
            // elements: myPackage, topLevelList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 65:45: -> ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
            {
                // TinyHaxeTry1.g:65:48: ^( MODULE[\"MODULE\",true] ( myPackage )? ( topLevelList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(MODULE, "MODULE", true), root_1);

                // TinyHaxeTry1.g:65:92: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();
                // TinyHaxeTry1.g:65:103: ( topLevelList )?
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
    // TinyHaxeTry1.g:68:1: topLevelList : ( topLevel )* ;
    public final TinyHaxeTry1Parser.topLevelList_return topLevelList() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelList_return retval = new TinyHaxeTry1Parser.topLevelList_return();
        retval.start = input.LT(1);
        int topLevelList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.topLevel_return topLevel3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // TinyHaxeTry1.g:68:19: ( ( topLevel )* )
            // TinyHaxeTry1.g:68:22: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:68:22: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT||LA2_0==ENUM||(LA2_0>=EXTERN && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // TinyHaxeTry1.g:68:23: topLevel
            	    {
            	    pushFollow(FOLLOW_topLevel_in_topLevelList174);
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
    // TinyHaxeTry1.g:70:1: topLevel : ( myImport | topLevelDecl );
    public final TinyHaxeTry1Parser.topLevel_return topLevel() throws RecognitionException {
        TinyHaxeTry1Parser.topLevel_return retval = new TinyHaxeTry1Parser.topLevel_return();
        retval.start = input.LT(1);
        int topLevel_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.myImport_return myImport4 = null;

        TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl5 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // TinyHaxeTry1.g:70:19: ( myImport | topLevelDecl )
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
                    // TinyHaxeTry1.g:70:21: myImport
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_myImport_in_topLevel193);
                    myImport4=myImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, myImport4.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:72:25: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topLevelDecl_in_topLevel220);
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
    // TinyHaxeTry1.g:74:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) ;
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
            // TinyHaxeTry1.g:74:21: ( PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) )
            // TinyHaxeTry1.g:74:23: PACKAGE dotIdent SEMI
            {
            PACKAGE6=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage239); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE.add(PACKAGE6);

            pushFollow(FOLLOW_dotIdent_in_myPackage241);
            dotIdent7=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent7.getTree());
            SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage243); if (state.failed) return retval; 
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
            // 74:45: -> ^( PACKAGE ( dotIdent )? )
            {
                // TinyHaxeTry1.g:74:48: ^( PACKAGE ( dotIdent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PACKAGE.nextNode(), root_1);

                // TinyHaxeTry1.g:74:58: ( dotIdent )?
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
    // TinyHaxeTry1.g:77:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
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
            // TinyHaxeTry1.g:78:5: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // TinyHaxeTry1.g:78:9: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // TinyHaxeTry1.g:78:9: (a= IDENTIFIER -> $a)
            // TinyHaxeTry1.g:78:10: a= IDENTIFIER
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier272); if (state.failed) return retval; 
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
            // 78:24: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            // TinyHaxeTry1.g:78:34: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DOT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // TinyHaxeTry1.g:78:35: DOT ident= IDENTIFIER
            	    {
            	    DOT9=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier285); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT9);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier289); if (state.failed) return retval; 
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
            	    // 78:57: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // TinyHaxeTry1.g:78:61: ^( DOT $qualifiedIdentifier $ident)
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
    // TinyHaxeTry1.g:81:1: myImport : IMPORT dotIdent SEMI ;
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
            // TinyHaxeTry1.g:81:21: ( IMPORT dotIdent SEMI )
            // TinyHaxeTry1.g:81:23: IMPORT dotIdent SEMI
            {
            root_0 = (Object)adaptor.nil();

            IMPORT10=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_myImport331); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPORT10_tree = (Object)adaptor.create(IMPORT10);
            root_0 = (Object)adaptor.becomeRoot(IMPORT10_tree, root_0);
            }
            pushFollow(FOLLOW_dotIdent_in_myImport334);
            dotIdent11=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent11.getTree());
            SEMI12=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport336); if (state.failed) return retval;

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
    // TinyHaxeTry1.g:85:1: access : ( PUBLIC | PRIVATE );
    public final TinyHaxeTry1Parser.access_return access() throws RecognitionException {
        TinyHaxeTry1Parser.access_return retval = new TinyHaxeTry1Parser.access_return();
        retval.start = input.LT(1);
        int access_StartIndex = input.index();
        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // TinyHaxeTry1.g:85:19: ( PUBLIC | PRIVATE )
            // TinyHaxeTry1.g:
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
    // TinyHaxeTry1.g:88:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
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
            // TinyHaxeTry1.g:88:19: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
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
                    // TinyHaxeTry1.g:88:21: STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    STATIC14=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC14_tree = (Object)adaptor.create(STATIC14);
                    adaptor.addChild(root_0, STATIC14_tree);
                    }

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:89:24: INLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    INLINE15=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr448); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE15_tree = (Object)adaptor.create(INLINE15);
                    adaptor.addChild(root_0, INLINE15_tree);
                    }

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:90:25: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    DYNAMIC16=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr474); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC16_tree = (Object)adaptor.create(DYNAMIC16);
                    adaptor.addChild(root_0, DYNAMIC16_tree);
                    }

                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:91:25: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    OVERRIDE17=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE17_tree = (Object)adaptor.create(OVERRIDE17);
                    adaptor.addChild(root_0, OVERRIDE17_tree);
                    }

                    }
                    break;
                case 5 :
                    // TinyHaxeTry1.g:92:25: access
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_access_in_declAttr526);
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
    // TinyHaxeTry1.g:94:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) ;
    public final TinyHaxeTry1Parser.declAttrList_return declAttrList() throws RecognitionException {
        TinyHaxeTry1Parser.declAttrList_return retval = new TinyHaxeTry1Parser.declAttrList_return();
        retval.start = input.LT(1);
        int declAttrList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.declAttr_return declAttr19 = null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // TinyHaxeTry1.g:94:19: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ ) )
            // TinyHaxeTry1.g:94:21: ( declAttr )+
            {
            // TinyHaxeTry1.g:94:21: ( declAttr )+
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
            	    // TinyHaxeTry1.g:94:22: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList541);
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
            // 94:33: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
            {
                // TinyHaxeTry1.g:94:36: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\", true] ( declAttr )+ )
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
    // TinyHaxeTry1.g:97:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | );
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
            // TinyHaxeTry1.g:97:19: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ ) | )
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
                    // TinyHaxeTry1.g:97:21: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList582);
                    param20=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param20.getTree());
                    // TinyHaxeTry1.g:97:27: ( COMMA param )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:97:28: COMMA param
                    	    {
                    	    COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList585); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA21);

                    	    pushFollow(FOLLOW_param_in_paramList587);
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
                    // 97:42: -> ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
                    {
                        // TinyHaxeTry1.g:97:45: ^( PARAM_LIST[\"PARAM_LIST\", true] ( param )+ )
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
                    // TinyHaxeTry1.g:99:2: 
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
    // TinyHaxeTry1.g:100:1: param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) ;
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
            // TinyHaxeTry1.g:100:19: ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? ) )
            // TinyHaxeTry1.g:100:20: ( QUES )? IDENTIFIER typeTagOpt varInit
            {
            // TinyHaxeTry1.g:100:20: ( QUES )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==QUES) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // TinyHaxeTry1.g:0:0: QUES
                    {
                    QUES23=(Token)match(input,QUES,FOLLOW_QUES_in_param626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES23);


                    }
                    break;

            }

            IDENTIFIER24=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param629); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER24);

            pushFollow(FOLLOW_typeTagOpt_in_param631);
            typeTagOpt25=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt25.getTree());
            pushFollow(FOLLOW_varInit_in_param633);
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
            // 100:56: -> ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
            {
                // TinyHaxeTry1.g:100:59: ^( VAR[$IDENTIFIER, true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, IDENTIFIER24, true), root_1);

                // TinyHaxeTry1.g:100:100: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                }
                stream_IDENTIFIER.reset();
                // TinyHaxeTry1.g:100:122: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // TinyHaxeTry1.g:100:134: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();
                // TinyHaxeTry1.g:100:143: ( QUES )?
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
    // TinyHaxeTry1.g:103:1: id : IDENTIFIER ;
    public final TinyHaxeTry1Parser.id_return id() throws RecognitionException {
        TinyHaxeTry1Parser.id_return retval = new TinyHaxeTry1Parser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER27=null;

        Object IDENTIFIER27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // TinyHaxeTry1.g:103:4: ( IDENTIFIER )
            // TinyHaxeTry1.g:103:6: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER27=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id669); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER27_tree = new VarUsage(IDENTIFIER27) ;
            adaptor.addChild(root_0, IDENTIFIER27_tree);
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
    // TinyHaxeTry1.g:106:1: dotIdent : ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* ;
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
            // TinyHaxeTry1.g:106:9: ( ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* )
            // TinyHaxeTry1.g:106:11: ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
            {
            // TinyHaxeTry1.g:106:11: ( id -> id )
            // TinyHaxeTry1.g:106:12: id
            {
            pushFollow(FOLLOW_id_in_dotIdent683);
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
            // 106:15: -> id
            {
                adaptor.addChild(root_0, stream_id.nextTree());

            }

            retval.tree = root_0;}
            }

            // TinyHaxeTry1.g:106:22: ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DOT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // TinyHaxeTry1.g:106:23: DOT ident= id
            	    {
            	    DOT29=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent691); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT29);

            	    pushFollow(FOLLOW_id_in_dotIdent695);
            	    ident=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id.add(ident.getTree());


            	    // AST REWRITE
            	    // elements: dotIdent, ident, DOT
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
            	    // 106:36: -> ^( DOT $dotIdent $ident)
            	    {
            	        // TinyHaxeTry1.g:106:39: ^( DOT $dotIdent $ident)
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
    // TinyHaxeTry1.g:109:1: assignOp : ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] );
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
            // TinyHaxeTry1.g:109:9: ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] )
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
                    // TinyHaxeTry1.g:109:11: EQ
                    {
                    EQ30=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp719); if (state.failed) return retval; 
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
                    // 109:14: -> EQ[$EQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(EQ, EQ30));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:110:11: PLUSEQ
                    {
                    PLUSEQ31=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp739); if (state.failed) return retval; 
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
                    // 110:19: -> PLUSEQ[$PLUSEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PLUSEQ, PLUSEQ31));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:111:11: SUBEQ
                    {
                    SUBEQ32=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp760); if (state.failed) return retval; 
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
                    // 111:17: -> SUBEQ[$SUBEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SUBEQ, SUBEQ32));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:112:11: SLASHEQ
                    {
                    SLASHEQ33=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp780); if (state.failed) return retval; 
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
                    // 112:19: -> SLASHEQ[$SLASHEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(SLASHEQ, SLASHEQ33));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // TinyHaxeTry1.g:113:4: PERCENTEQ
                    {
                    PERCENTEQ34=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp793); if (state.failed) return retval; 
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
                    // 114:4: -> PERCENTEQ[$PERCENTEQ]
                    {
                        adaptor.addChild(root_0, new AssignOperationNode(PERCENTEQ, PERCENTEQ34));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // TinyHaxeTry1.g:115:4: AMPEQ
                    {
                    AMPEQ35=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp809); if (state.failed) return retval; 
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
                    // 115:10: -> AMPEQ[$AMPEQ]
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
    // TinyHaxeTry1.g:119:1: funcLit : FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) ;
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
            // TinyHaxeTry1.g:119:19: ( FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) )
            // TinyHaxeTry1.g:119:21: FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block
            {
            FUNCTION36=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit839); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION36);

            LPAREN37=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit841); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN37);

            pushFollow(FOLLOW_paramList_in_funcLit843);
            paramList38=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList38.getTree());
            RPAREN39=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit845); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN39);

            // TinyHaxeTry1.g:119:54: ( typeTagOpt )?
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

                    if ( (synpred20_TinyHaxeTry1()) ) {
                        alt12=1;
                    }
                    }
                    break;
                case SEMI:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (synpred20_TinyHaxeTry1()) ) {
                        alt12=1;
                    }
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // TinyHaxeTry1.g:0:0: typeTagOpt
                    {
                    pushFollow(FOLLOW_typeTagOpt_in_funcLit847);
                    typeTagOpt40=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt40.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_funcLit850);
            block41=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block41.getTree());


            // AST REWRITE
            // elements: typeTagOpt, paramList, block, FUNCTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 119:72: -> ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // TinyHaxeTry1.g:119:75: ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                // TinyHaxeTry1.g:119:100: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // TinyHaxeTry1.g:119:111: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // TinyHaxeTry1.g:119:123: ( block )?
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
    // TinyHaxeTry1.g:121:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
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
            // TinyHaxeTry1.g:121:18: ( LBRACKET exprListOpt RBRACKET )
            // TinyHaxeTry1.g:121:20: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            LBRACKET42=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit885); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit888);
            exprListOpt43=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt43.getTree());
            RBRACKET44=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit890); if (state.failed) return retval;

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
    // TinyHaxeTry1.g:149:1: typeTag : COLON funcType ;
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
            // TinyHaxeTry1.g:149:9: ( COLON funcType )
            // TinyHaxeTry1.g:149:11: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            COLON45=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag909); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_typeTag912);
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
    // TinyHaxeTry1.g:152:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | );
    public final TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeTagOpt_return retval = new TinyHaxeTry1Parser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeTag_return typeTag47 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // TinyHaxeTry1.g:153:2: ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | )
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
                    // TinyHaxeTry1.g:153:4: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt924);
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
                    // 153:12: -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                    {
                        // TinyHaxeTry1.g:153:15: ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(TYPE_TAG, "TYPE_TAG", true), root_1);

                        // TinyHaxeTry1.g:153:63: ( typeTag )?
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
                    // TinyHaxeTry1.g:155:2: 
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
    // TinyHaxeTry1.g:157:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );
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
            // TinyHaxeTry1.g:157:9: ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // TinyHaxeTry1.g:157:11: funcType ( COMMA funcType )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_typeList950);
                    funcType48=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType48.getTree());
                    // TinyHaxeTry1.g:157:20: ( COMMA funcType )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            int LA14_2 = input.LA(2);

                            if ( (synpred22_TinyHaxeTry1()) ) {
                                alt14=1;
                            }


                        }


                        switch (alt14) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:157:21: COMMA funcType
                    	    {
                    	    COMMA49=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList953); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_funcType_in_typeList956);
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
                    // TinyHaxeTry1.g:158:4: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeConstraint_in_typeList964);
                    typeConstraint51=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint51.getTree());
                    // TinyHaxeTry1.g:158:19: ( COMMA typeConstraint )*
                    loop15:
                    do {
                        int alt15=2;
                        alt15 = dfa15.predict(input);
                        switch (alt15) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:158:20: COMMA typeConstraint
                    	    {
                    	    COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList967); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList970);
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
    // TinyHaxeTry1.g:161:1: funcType : ( ( type ) ( MINUS_BIGGER type )* | VOID );
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
            // TinyHaxeTry1.g:161:9: ( ( type ) ( MINUS_BIGGER type )* | VOID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EOF||(LA18_0>=SEMI && LA18_0<=IDENTIFIER)||LA18_0==IMPORT||LA18_0==DYNAMIC||(LA18_0>=COMMA && LA18_0<=AMPEQ)||(LA18_0>=LPAREN && LA18_0<=RPAREN)||(LA18_0>=RBRACKET && LA18_0<=MINUS_BIGGER)||(LA18_0>=INT && LA18_0<=GTGT)||LA18_0==IN||(LA18_0>=LBRACE && LA18_0<=RBRACE)||(LA18_0>=ELLIPSIS && LA18_0<=PERCENT)||LA18_0==ENUM||(LA18_0>=EXTERN && LA18_0<=TYPEDEF)) ) {
                alt18=1;
            }
            else if ( (LA18_0==VOID) ) {
                int LA18_2 = input.LA(2);

                if ( (synpred26_TinyHaxeTry1()) ) {
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
                    // TinyHaxeTry1.g:161:11: ( type ) ( MINUS_BIGGER type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // TinyHaxeTry1.g:161:11: ( type )
                    // TinyHaxeTry1.g:161:12: type
                    {
                    pushFollow(FOLLOW_type_in_funcType985);
                    type54=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type54.getTree());

                    }

                    // TinyHaxeTry1.g:161:18: ( MINUS_BIGGER type )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==MINUS_BIGGER) ) {
                            int LA17_2 = input.LA(2);

                            if ( (synpred25_TinyHaxeTry1()) ) {
                                alt17=1;
                            }


                        }


                        switch (alt17) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:161:19: MINUS_BIGGER type
                    	    {
                    	    MINUS_BIGGER55=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType989); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_funcType992);
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
                    // TinyHaxeTry1.g:162:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID57=(Token)match(input,VOID,FOLLOW_VOID_in_funcType999); if (state.failed) return retval;
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
    // TinyHaxeTry1.g:165:1: type : ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | );
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
            // TinyHaxeTry1.g:165:6: ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // TinyHaxeTry1.g:165:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // TinyHaxeTry1.g:165:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
                    int alt19=7;
                    switch ( input.LA(1) ) {
                    case LBRACE:
                        {
                        alt19=1;
                        }
                        break;
                    case IDENTIFIER:
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
                            // TinyHaxeTry1.g:165:9: anonType
                            {
                            pushFollow(FOLLOW_anonType_in_type1011);
                            anonType58=anonType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonType58.getTree());

                            }
                            break;
                        case 2 :
                            // TinyHaxeTry1.g:165:20: dotIdent
                            {
                            pushFollow(FOLLOW_dotIdent_in_type1015);
                            dotIdent59=dotIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent59.getTree());

                            }
                            break;
                        case 3 :
                            // TinyHaxeTry1.g:165:30: INT
                            {
                            INT60=(Token)match(input,INT,FOLLOW_INT_in_type1018); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INT60_tree = (Object)adaptor.create(INT60);
                            adaptor.addChild(root_0, INT60_tree);
                            }

                            }
                            break;
                        case 4 :
                            // TinyHaxeTry1.g:165:35: FLOAT
                            {
                            FLOAT61=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type1021); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            FLOAT61_tree = (Object)adaptor.create(FLOAT61);
                            adaptor.addChild(root_0, FLOAT61_tree);
                            }

                            }
                            break;
                        case 5 :
                            // TinyHaxeTry1.g:165:42: DYNAMIC
                            {
                            DYNAMIC62=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_type1024); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DYNAMIC62_tree = (Object)adaptor.create(DYNAMIC62);
                            adaptor.addChild(root_0, DYNAMIC62_tree);
                            }

                            }
                            break;
                        case 6 :
                            // TinyHaxeTry1.g:165:50: BOOLEAN
                            {
                            BOOLEAN63=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1026); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BOOLEAN63_tree = (Object)adaptor.create(BOOLEAN63);
                            adaptor.addChild(root_0, BOOLEAN63_tree);
                            }

                            }
                            break;
                        case 7 :
                            // TinyHaxeTry1.g:165:58: VOID
                            {
                            VOID64=(Token)match(input,VOID,FOLLOW_VOID_in_type1028); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            VOID64_tree = (Object)adaptor.create(VOID64);
                            adaptor.addChild(root_0, VOID64_tree);
                            }

                            }
                            break;

                    }

                    // TinyHaxeTry1.g:165:64: ( typeParam )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==LT) ) {
                            int LA20_2 = input.LA(2);

                            if ( (synpred33_TinyHaxeTry1()) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:165:65: typeParam
                    	    {
                    	    pushFollow(FOLLOW_typeParam_in_type1032);
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
                    // TinyHaxeTry1.g:167:2: 
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
    // TinyHaxeTry1.g:169:1: typeParam : LT ( type | typeList ) ( GT | GTGT | ) ;
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
            // TinyHaxeTry1.g:170:2: ( LT ( type | typeList ) ( GT | GTGT | ) )
            // TinyHaxeTry1.g:170:4: LT ( type | typeList ) ( GT | GTGT | )
            {
            root_0 = (Object)adaptor.nil();

            LT66=(Token)match(input,LT,FOLLOW_LT_in_typeParam1050); if (state.failed) return retval;
            // TinyHaxeTry1.g:170:8: ( type | typeList )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // TinyHaxeTry1.g:170:9: type
                    {
                    pushFollow(FOLLOW_type_in_typeParam1054);
                    type67=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type67.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:170:14: typeList
                    {
                    pushFollow(FOLLOW_typeList_in_typeParam1056);
                    typeList68=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList68.getTree());

                    }
                    break;

            }

            // TinyHaxeTry1.g:170:24: ( GT | GTGT | )
            int alt23=3;
            switch ( input.LA(1) ) {
            case GT:
                {
                int LA23_1 = input.LA(2);

                if ( (synpred36_TinyHaxeTry1()) ) {
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

                if ( (synpred37_TinyHaxeTry1()) ) {
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
                    // TinyHaxeTry1.g:170:25: GT
                    {
                    GT69=(Token)match(input,GT,FOLLOW_GT_in_typeParam1060); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:170:29: GTGT
                    {
                    GTGT70=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParam1063); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:170:35: 
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
    // TinyHaxeTry1.g:174:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | );
    public final TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeParamOpt_return retval = new TinyHaxeTry1Parser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam71 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // TinyHaxeTry1.g:175:2: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? ) | )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LT) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred38_TinyHaxeTry1()) ) {
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
            else if ( (LA24_0==EOF||LA24_0==SEMI||(LA24_0>=COMMA && LA24_0<=AMPEQ)||(LA24_0>=LPAREN && LA24_0<=RPAREN)||(LA24_0>=RBRACKET && LA24_0<=COLON)||LA24_0==GT||LA24_0==IN||(LA24_0>=LBRACE && LA24_0<=RBRACE)||(LA24_0>=ELLIPSIS && LA24_0<=PERCENT)||(LA24_0>=EXTENDS && LA24_0<=IMPLEMENTS)) ) {
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
                    // TinyHaxeTry1.g:175:4: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1085);
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
                    // 175:13: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                    {
                        // TinyHaxeTry1.g:175:16: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT", true), root_1);

                        // TinyHaxeTry1.g:175:76: ( typeParam )?
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
                    // TinyHaxeTry1.g:177:9: 
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
    // TinyHaxeTry1.g:179:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
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
            // TinyHaxeTry1.g:179:19: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? ) )
            // TinyHaxeTry1.g:179:21: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER72=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1128); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER72);

            COLON73=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1130); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON73);

            LPAREN74=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1132); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN74);

            pushFollow(FOLLOW_typeList_in_typeConstraint1134);
            typeList75=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList75.getTree());
            RPAREN76=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1136); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN76);



            // AST REWRITE
            // elements: typeList, IDENTIFIER, typeConstraint
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 179:61: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
            {
                // TinyHaxeTry1.g:179:64: ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                // TinyHaxeTry1.g:179:82: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // TinyHaxeTry1.g:179:94: ( typeList )?
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
    // TinyHaxeTry1.g:183:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) ;
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
            // TinyHaxeTry1.g:184:2: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) )
            // TinyHaxeTry1.g:184:4: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
            {
            // TinyHaxeTry1.g:184:4: ( declAttrList )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=PUBLIC && LA25_0<=OVERRIDE)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // TinyHaxeTry1.g:0:0: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_functionReturn1162);
                    declAttrList77=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList77.getTree());

                    }
                    break;

            }

            FUNCTION78=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionReturn1165); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION78);

            NEW79=(Token)match(input,NEW,FOLLOW_NEW_in_functionReturn1167); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW79);

            LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionReturn1169); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN80);

            pushFollow(FOLLOW_paramList_in_functionReturn1171);
            paramList81=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList81.getTree());
            RPAREN82=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionReturn1173); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN82);

            pushFollow(FOLLOW_typeTagOpt_in_functionReturn1175);
            typeTagOpt83=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt83.getTree());
            pushFollow(FOLLOW_block_in_functionReturn1177);
            block84=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block84.getTree());


            // AST REWRITE
            // elements: block, typeTagOpt, FUNCTION, NEW, declAttrList, paramList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 184:72: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
            {
                // TinyHaxeTry1.g:184:75: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                adaptor.addChild(root_1, stream_NEW.nextNode());
                // TinyHaxeTry1.g:184:104: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // TinyHaxeTry1.g:184:118: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                // TinyHaxeTry1.g:184:129: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                // TinyHaxeTry1.g:184:141: ( block )?
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
    // TinyHaxeTry1.g:187:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );
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
            // TinyHaxeTry1.g:188:2: ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI )
            int alt31=16;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // TinyHaxeTry1.g:188:4: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement1214);
                    block85=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block85.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:189:4: assignExpr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_statement1219);
                    assignExpr86=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr86.getTree());
                    SEMI87=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1221); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:190:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_statement1227);
                    varDecl88=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl88.getTree());

                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:191:4: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF89=(Token)match(input,IF,FOLLOW_IF_in_statement1232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF89);

                    pushFollow(FOLLOW_parExpression_in_statement1234);
                    parExpression90=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression90.getTree());
                    pushFollow(FOLLOW_statement_in_statement1238);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // TinyHaxeTry1.g:191:35: ( ELSE st2= statement )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==ELSE) ) {
                        int LA26_1 = input.LA(2);

                        if ( (synpred43_TinyHaxeTry1()) ) {
                            alt26=1;
                        }
                    }
                    switch (alt26) {
                        case 1 :
                            // TinyHaxeTry1.g:191:36: ELSE st2= statement
                            {
                            ELSE91=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1241); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE91);

                            pushFollow(FOLLOW_statement_in_statement1245);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: st2, parExpression, ELSE, st1, IF
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
                    // 191:58: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // TinyHaxeTry1.g:191:61: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new IfNode(stream_IF.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // TinyHaxeTry1.g:191:93: ( ^( ELSE $st2) )?
                        if ( stream_st2.hasNext()||stream_ELSE.hasNext() ) {
                            // TinyHaxeTry1.g:191:93: ^( ELSE $st2)
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
                    // TinyHaxeTry1.g:192:4: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    FOR92=(Token)match(input,FOR,FOLLOW_FOR_in_statement1285); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR92);

                    LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1287); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN93);

                    pushFollow(FOLLOW_expr_in_statement1291);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
                    IN94=(Token)match(input,IN,FOLLOW_IN_in_statement1293); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN94);

                    pushFollow(FOLLOW_expr_in_statement1297);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
                    RPAREN95=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN95);

                    pushFollow(FOLLOW_statement_in_statement1301);
                    statement96=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement96.getTree());


                    // AST REWRITE
                    // elements: statement, exp1, IN, FOR, exp2
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
                    // 192:56: -> ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                    {
                        // TinyHaxeTry1.g:192:59: ^( FOR ^( IN $exp1 $exp2) ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ForNode(stream_FOR.nextToken()), root_1);

                        // TinyHaxeTry1.g:192:74: ^( IN $exp1 $exp2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_exp1.nextTree());
                        adaptor.addChild(root_2, stream_exp2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // TinyHaxeTry1.g:192:92: ( statement )?
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
                    // TinyHaxeTry1.g:193:4: WHILE parExpression statement
                    {
                    WHILE97=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE97);

                    pushFollow(FOLLOW_parExpression_in_statement1331);
                    parExpression98=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression98.getTree());
                    pushFollow(FOLLOW_statement_in_statement1333);
                    statement99=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement99.getTree());


                    // AST REWRITE
                    // elements: statement, WHILE, parExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 193:38: -> ^( WHILE ( parExpression )? ( statement )? )
                    {
                        // TinyHaxeTry1.g:193:41: ^( WHILE ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new WhileNode(stream_WHILE.nextToken()), root_1);

                        // TinyHaxeTry1.g:193:60: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // TinyHaxeTry1.g:193:75: ( statement )?
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
                    // TinyHaxeTry1.g:194:4: DO statement WHILE parExpression SEMI
                    {
                    DO100=(Token)match(input,DO,FOLLOW_DO_in_statement1357); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO100);

                    pushFollow(FOLLOW_statement_in_statement1359);
                    statement101=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement101.getTree());
                    WHILE102=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE102);

                    pushFollow(FOLLOW_parExpression_in_statement1363);
                    parExpression103=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression103.getTree());
                    SEMI104=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1365); if (state.failed) return retval; 
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
                    // 194:45: -> ^( DO ( parExpression )? ( statement )? )
                    {
                        // TinyHaxeTry1.g:194:48: ^( DO ( parExpression )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new DoWhileNode(stream_DO.nextToken()), root_1);

                        // TinyHaxeTry1.g:194:66: ( parExpression )?
                        if ( stream_parExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_parExpression.nextTree());

                        }
                        stream_parExpression.reset();
                        // TinyHaxeTry1.g:194:81: ( statement )?
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
                    // TinyHaxeTry1.g:195:4: TRY block catchStmtList
                    {
                    TRY105=(Token)match(input,TRY,FOLLOW_TRY_in_statement1388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY.add(TRY105);

                    pushFollow(FOLLOW_block_in_statement1390);
                    block106=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block106.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_statement1392);
                    catchStmtList107=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList107.getTree());


                    // AST REWRITE
                    // elements: catchStmtList, TRY, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:32: -> ^( TRY ( block )? ( catchStmtList )? )
                    {
                        // TinyHaxeTry1.g:195:35: ^( TRY ( block )? ( catchStmtList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new TryNode(stream_TRY.nextToken()), root_1);

                        // TinyHaxeTry1.g:195:50: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // TinyHaxeTry1.g:195:57: ( catchStmtList )?
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
                    // TinyHaxeTry1.g:196:4: SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
                    {
                    SWITCH108=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement1416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH108);

                    LPAREN109=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1418); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN109);

                    pushFollow(FOLLOW_expr_in_statement1420);
                    expr110=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr110.getTree());
                    RPAREN111=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1422); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN111);

                    LBRACE112=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement1424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE112);

                    // TinyHaxeTry1.g:196:37: ( caseStmt )+
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
                    	    // TinyHaxeTry1.g:0:0: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statement1426);
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

                    RBRACE114=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement1429); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE114);



                    // AST REWRITE
                    // elements: SWITCH, expr, caseStmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:55: -> ^( SWITCH ( expr )? ( caseStmt )+ )
                    {
                        // TinyHaxeTry1.g:196:58: ^( SWITCH ( expr )? ( caseStmt )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new SwitchNode(stream_SWITCH.nextToken()), root_1);

                        // TinyHaxeTry1.g:196:79: ( expr )?
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
                    // TinyHaxeTry1.g:197:4: RETURN ( expr )? SEMI
                    {
                    RETURN115=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN115);

                    // TinyHaxeTry1.g:197:11: ( expr )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENTIFIER||(LA28_0>=QUES && LA28_0<=LPAREN)||LA28_0==LBRACKET||(LA28_0>=LT && LA28_0<=GT)||LA28_0==NEW||LA28_0==LBRACE||(LA28_0>=ELLIPSIS && LA28_0<=CAST)||(LA28_0>=LONGLITERAL && LA28_0<=FALSE)) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==SEMI) ) {
                        int LA28_2 = input.LA(2);

                        if ( (synpred51_TinyHaxeTry1()) ) {
                            alt28=1;
                        }
                    }
                    switch (alt28) {
                        case 1 :
                            // TinyHaxeTry1.g:197:12: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1453);
                            expr116=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr116.getTree());

                            }
                            break;

                    }

                    SEMI117=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1457); if (state.failed) return retval; 
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
                    // 197:28: -> ^( RETURN ( expr )? )
                    {
                        // TinyHaxeTry1.g:197:31: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // TinyHaxeTry1.g:197:40: ( expr )?
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
                    // TinyHaxeTry1.g:198:4: THROW expr SEMI
                    {
                    THROW118=(Token)match(input,THROW,FOLLOW_THROW_in_statement1475); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW118);

                    pushFollow(FOLLOW_expr_in_statement1477);
                    expr119=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr119.getTree());
                    SEMI120=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI120);



                    // AST REWRITE
                    // elements: THROW, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:25: -> ^( THROW ( expr )? )
                    {
                        // TinyHaxeTry1.g:198:28: ^( THROW ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_THROW.nextNode(), root_1);

                        // TinyHaxeTry1.g:198:36: ( expr )?
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
                    // TinyHaxeTry1.g:199:4: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK121=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK121);

                    // TinyHaxeTry1.g:199:10: ( IDENTIFIER )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENTIFIER) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // TinyHaxeTry1.g:199:11: IDENTIFIER
                            {
                            IDENTIFIER122=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1501); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER122);


                            }
                            break;

                    }

                    SEMI123=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI123);



                    // AST REWRITE
                    // elements: IDENTIFIER, BREAK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:32: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // TinyHaxeTry1.g:199:35: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        // TinyHaxeTry1.g:199:43: ( IDENTIFIER )?
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
                    // TinyHaxeTry1.g:200:4: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE124=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1522); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE124);

                    // TinyHaxeTry1.g:200:13: ( IDENTIFIER )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENTIFIER) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // TinyHaxeTry1.g:200:14: IDENTIFIER
                            {
                            IDENTIFIER125=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1525); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER125);


                            }
                            break;

                    }

                    SEMI126=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1529); if (state.failed) return retval; 
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
                    // 200:36: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // TinyHaxeTry1.g:200:39: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        // TinyHaxeTry1.g:200:50: ( IDENTIFIER )?
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
                    // TinyHaxeTry1.g:201:4: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement1547);
                    expr127=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr127.getTree());
                    SEMI128=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1550); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // TinyHaxeTry1.g:202:4: IDENTIFIER COLON statement
                    {
                    IDENTIFIER129=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1556); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER129);

                    COLON130=(Token)match(input,COLON,FOLLOW_COLON_in_statement1558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON130);

                    pushFollow(FOLLOW_statement_in_statement1560);
                    statement131=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement131.getTree());


                    // AST REWRITE
                    // elements: statement, IDENTIFIER, COLON
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:35: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // TinyHaxeTry1.g:202:38: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_COLON.nextNode(), root_1);

                        // TinyHaxeTry1.g:202:46: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // TinyHaxeTry1.g:202:58: ( statement )?
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
                    // TinyHaxeTry1.g:203:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI132=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1581); if (state.failed) return retval;

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
    // TinyHaxeTry1.g:206:1: parExpression : LPAREN expr RPAREN ;
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
            // TinyHaxeTry1.g:207:5: ( LPAREN expr RPAREN )
            // TinyHaxeTry1.g:207:9: LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN133=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1602); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_parExpression1605);
            expr134=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr134.getTree());
            RPAREN135=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1607); if (state.failed) return retval;

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
    // TinyHaxeTry1.g:210:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI );
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
            // TinyHaxeTry1.g:210:8: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] ) | SEMI )
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
                    // TinyHaxeTry1.g:210:10: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE136=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block1622); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE136);

                    // TinyHaxeTry1.g:210:17: ( blockStmt )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=SEMI && LA32_0<=IDENTIFIER)||(LA32_0>=PUBLIC && LA32_0<=OVERRIDE)||(LA32_0>=QUES && LA32_0<=LPAREN)||LA32_0==LBRACKET||(LA32_0>=LT && LA32_0<=GT)||(LA32_0>=NEW && LA32_0<=IF)||LA32_0==FOR||(LA32_0>=WHILE && LA32_0<=LBRACE)||(LA32_0>=RETURN && LA32_0<=CONTINUE)||(LA32_0>=ELLIPSIS && LA32_0<=CAST)||(LA32_0>=VAR && LA32_0<=CLASS)||(LA32_0>=LONGLITERAL && LA32_0<=FALSE)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:210:18: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block1625);
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

                    RBRACE138=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block1629); if (state.failed) return retval; 
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
                    // 210:37: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                    {
                        // TinyHaxeTry1.g:210:40: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( blockStmt )* RBRACE[$RBRACE, true] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE136), root_1);

                        // TinyHaxeTry1.g:210:100: ( blockStmt )*
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
                    // TinyHaxeTry1.g:211:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI139=(Token)match(input,SEMI,FOLLOW_SEMI_in_block1654); if (state.failed) return retval;

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
    // TinyHaxeTry1.g:214:1: blockStmt : ( varDecl | classDecl | statement );
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
            // TinyHaxeTry1.g:215:2: ( varDecl | classDecl | statement )
            int alt34=3;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // TinyHaxeTry1.g:215:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_blockStmt1667);
                    varDecl140=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl140.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:216:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_blockStmt1672);
                    classDecl141=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl141.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:217:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStmt1677);
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
    // TinyHaxeTry1.g:221:1: breakStmt : BREAK SEMI ;
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
            // TinyHaxeTry1.g:222:2: ( BREAK SEMI )
            // TinyHaxeTry1.g:222:4: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            BREAK143=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt1710); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK143_tree = (Object)adaptor.create(BREAK143);
            adaptor.addChild(root_0, BREAK143_tree);
            }
            SEMI144=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt1712); if (state.failed) return retval;

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
    // TinyHaxeTry1.g:225:1: continueStmt : CONTINUE SEMI ;
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
            // TinyHaxeTry1.g:226:2: ( CONTINUE SEMI )
            // TinyHaxeTry1.g:226:4: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE145=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt1731); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE145_tree = (Object)adaptor.create(CONTINUE145);
            adaptor.addChild(root_0, CONTINUE145_tree);
            }
            SEMI146=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt1733); if (state.failed) return retval;

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
    // TinyHaxeTry1.g:229:1: caseStmt : ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) );
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
            // TinyHaxeTry1.g:229:9: ( CASE exprList COLON statement -> ^( CASE ( exprList )? ( statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? ) )
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
                    // TinyHaxeTry1.g:229:11: CASE exprList COLON statement
                    {
                    CASE147=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt1744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE147);

                    pushFollow(FOLLOW_exprList_in_caseStmt1746);
                    exprList148=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList148.getTree());
                    COLON149=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt1748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON149);

                    pushFollow(FOLLOW_statement_in_caseStmt1750);
                    statement150=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement150.getTree());


                    // AST REWRITE
                    // elements: statement, CASE, exprList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:42: -> ^( CASE ( exprList )? ( statement )? )
                    {
                        // TinyHaxeTry1.g:229:45: ^( CASE ( exprList )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        // TinyHaxeTry1.g:229:52: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();
                        // TinyHaxeTry1.g:229:62: ( statement )?
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
                    // TinyHaxeTry1.g:230:4: DEFAULT COLON statement
                    {
                    DEFAULT151=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt1768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT151);

                    COLON152=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt1770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON152);

                    pushFollow(FOLLOW_statement_in_caseStmt1772);
                    statement153=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement153.getTree());


                    // AST REWRITE
                    // elements: statement, DEFAULT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 230:29: -> ^( DEFAULT ( statement )? )
                    {
                        // TinyHaxeTry1.g:230:32: ^( DEFAULT ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DEFAULT.nextNode(), root_1);

                        // TinyHaxeTry1.g:230:42: ( statement )?
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
    // TinyHaxeTry1.g:233:1: defaultStmt : DEFAULT COLON ;
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
            // TinyHaxeTry1.g:234:9: ( DEFAULT COLON )
            // TinyHaxeTry1.g:234:11: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT154=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt1801); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT154_tree = (Object)adaptor.create(DEFAULT154);
            adaptor.addChild(root_0, DEFAULT154_tree);
            }
            COLON155=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt1803); if (state.failed) return retval;

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
    // TinyHaxeTry1.g:237:1: catchStmtList : ( catchStmt catchStmtList | );
    public final TinyHaxeTry1Parser.catchStmtList_return catchStmtList() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmtList_return retval = new TinyHaxeTry1Parser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.catchStmt_return catchStmt156 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList157 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // TinyHaxeTry1.g:238:2: ( catchStmt catchStmtList | )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==CATCH) ) {
                alt36=1;
            }
            else if ( (LA36_0==EOF||(LA36_0>=SEMI && LA36_0<=IDENTIFIER)||(LA36_0>=PUBLIC && LA36_0<=COLON)||(LA36_0>=LT && LA36_0<=GT)||(LA36_0>=NEW && LA36_0<=DEFAULT)||(LA36_0>=ELLIPSIS && LA36_0<=CAST)||(LA36_0>=VAR && LA36_0<=CLASS)||(LA36_0>=EXTENDS && LA36_0<=IMPLEMENTS)||(LA36_0>=LONGLITERAL && LA36_0<=FALSE)) ) {
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
                    // TinyHaxeTry1.g:238:4: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catchStmt_in_catchStmtList1816);
                    catchStmt156=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt156.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList1818);
                    catchStmtList157=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList157.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:240:2: 
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
    // TinyHaxeTry1.g:242:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) ;
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
            // TinyHaxeTry1.g:243:9: ( CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block )? ) )
            // TinyHaxeTry1.g:243:11: CATCH LPAREN param RPAREN block
            {
            CATCH158=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt1847); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH158);

            LPAREN159=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt1849); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN159);

            pushFollow(FOLLOW_param_in_catchStmt1851);
            param160=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param160.getTree());
            RPAREN161=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt1853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN161);

            pushFollow(FOLLOW_block_in_catchStmt1855);
            block162=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block162.getTree());


            // AST REWRITE
            // elements: CATCH, block, param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 243:43: -> ^( CATCH ( param )? ( block )? )
            {
                // TinyHaxeTry1.g:243:46: ^( CATCH ( param )? ( block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CATCH.nextNode(), root_1);

                // TinyHaxeTry1.g:243:54: ( param )?
                if ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();
                // TinyHaxeTry1.g:243:61: ( block )?
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
    // TinyHaxeTry1.g:248:1: exprListOpt : ( exprList | );
    public final TinyHaxeTry1Parser.exprListOpt_return exprListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.exprListOpt_return retval = new TinyHaxeTry1Parser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.exprList_return exprList163 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // TinyHaxeTry1.g:249:2: ( exprList | )
            int alt37=2;
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

                if ( (synpred66_TinyHaxeTry1()) ) {
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

                if ( (synpred66_TinyHaxeTry1()) ) {
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
                    // TinyHaxeTry1.g:249:4: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprList_in_exprListOpt1881);
                    exprList163=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList163.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:251:2: 
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
    // TinyHaxeTry1.g:253:1: exprList : expr ( COMMA expr )* ;
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
            // TinyHaxeTry1.g:253:9: ( expr ( COMMA expr )* )
            // TinyHaxeTry1.g:253:11: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList1901);
            expr164=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr164.getTree());
            // TinyHaxeTry1.g:253:16: ( COMMA expr )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // TinyHaxeTry1.g:253:17: COMMA expr
            	    {
            	    COMMA165=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList1904); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_exprList1907);
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
    // TinyHaxeTry1.g:256:1: expr : assignExpr ;
    public final TinyHaxeTry1Parser.expr_return expr() throws RecognitionException {
        TinyHaxeTry1Parser.expr_return retval = new TinyHaxeTry1Parser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.assignExpr_return assignExpr167 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // TinyHaxeTry1.g:256:6: ( assignExpr )
            // TinyHaxeTry1.g:256:8: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr1920);
            assignExpr167=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr167.getTree());

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
    // TinyHaxeTry1.g:259:1: assignExpr : iterExpr ( assignOp iterExpr )* ;
    public final TinyHaxeTry1Parser.assignExpr_return assignExpr() throws RecognitionException {
        TinyHaxeTry1Parser.assignExpr_return retval = new TinyHaxeTry1Parser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr168 = null;

        TinyHaxeTry1Parser.assignOp_return assignOp169 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr170 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // TinyHaxeTry1.g:260:9: ( iterExpr ( assignOp iterExpr )* )
            // TinyHaxeTry1.g:260:12: iterExpr ( assignOp iterExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iterExpr_in_assignExpr1940);
            iterExpr168=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr168.getTree());
            // TinyHaxeTry1.g:260:21: ( assignOp iterExpr )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=EQ && LA39_0<=AMPEQ)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // TinyHaxeTry1.g:260:22: assignOp iterExpr
            	    {
            	    pushFollow(FOLLOW_assignOp_in_assignExpr1943);
            	    assignOp169=assignOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp169.getTree(), root_0);
            	    pushFollow(FOLLOW_iterExpr_in_assignExpr1946);
            	    iterExpr170=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr170.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
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

    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // TinyHaxeTry1.g:264:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
    public final TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        TinyHaxeTry1Parser.ternaryExpr_return retval = new TinyHaxeTry1Parser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        Token QUES172=null;
        Token COLON174=null;
        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr171 = null;

        TinyHaxeTry1Parser.expr_return expr173 = null;

        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr175 = null;


        Object QUES172_tree=null;
        Object COLON174_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // TinyHaxeTry1.g:265:2: ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
            // TinyHaxeTry1.g:265:4: logicOrExpr ( QUES expr COLON logicOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr1969);
            logicOrExpr171=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr171.getTree());
            // TinyHaxeTry1.g:265:16: ( QUES expr COLON logicOrExpr )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==QUES) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // TinyHaxeTry1.g:265:17: QUES expr COLON logicOrExpr
            	    {
            	    QUES172=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr1972); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    QUES172_tree = (Object)adaptor.create(QUES172);
            	    root_0 = (Object)adaptor.becomeRoot(QUES172_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_in_ternaryExpr1975);
            	    expr173=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr173.getTree());
            	    COLON174=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr1977); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr1980);
            	    logicOrExpr175=logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr175.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 40, ternaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"

    public static class iterExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterExpr"
    // TinyHaxeTry1.g:268:1: iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
    public final TinyHaxeTry1Parser.iterExpr_return iterExpr() throws RecognitionException {
        TinyHaxeTry1Parser.iterExpr_return retval = new TinyHaxeTry1Parser.iterExpr_return();
        retval.start = input.LT(1);
        int iterExpr_StartIndex = input.index();
        Object root_0 = null;

        Token ELLIPSIS177=null;
        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr176 = null;

        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr178 = null;


        Object ELLIPSIS177_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // TinyHaxeTry1.g:268:9: ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
            // TinyHaxeTry1.g:268:11: ternaryExpr ( ELLIPSIS ternaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_iterExpr1992);
            ternaryExpr176=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr176.getTree());
            // TinyHaxeTry1.g:268:23: ( ELLIPSIS ternaryExpr )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==ELLIPSIS) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // TinyHaxeTry1.g:268:24: ELLIPSIS ternaryExpr
            	    {
            	    ELLIPSIS177=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr1995); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELLIPSIS177_tree = (Object)adaptor.create(ELLIPSIS177);
            	    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS177_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ternaryExpr_in_iterExpr1998);
            	    ternaryExpr178=ternaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr178.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 41, iterExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iterExpr"

    public static class logicOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicOrExpr"
    // TinyHaxeTry1.g:271:1: logicOrExpr : ( logicAndExpr ) ( BARBAR logicAndExpr )* ;
    public final TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicOrExpr_return retval = new TinyHaxeTry1Parser.logicOrExpr_return();
        retval.start = input.LT(1);
        int logicOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BARBAR180=null;
        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr179 = null;

        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr181 = null;


        Object BARBAR180_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // TinyHaxeTry1.g:272:2: ( ( logicAndExpr ) ( BARBAR logicAndExpr )* )
            // TinyHaxeTry1.g:272:4: ( logicAndExpr ) ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:272:4: ( logicAndExpr )
            // TinyHaxeTry1.g:272:5: logicAndExpr
            {
            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2027);
            logicAndExpr179=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr179.getTree());

            }

            // TinyHaxeTry1.g:272:19: ( BARBAR logicAndExpr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==BARBAR) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // TinyHaxeTry1.g:272:20: BARBAR logicAndExpr
            	    {
            	    BARBAR180=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2031); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR180_tree = (Object)adaptor.create(BARBAR180);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR180_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2034);
            	    logicAndExpr181=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr181.getTree());

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
    // TinyHaxeTry1.g:275:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
    public final TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicAndExpr_return retval = new TinyHaxeTry1Parser.logicAndExpr_return();
        retval.start = input.LT(1);
        int logicAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token AMPAMP183=null;
        TinyHaxeTry1Parser.cmpExpr_return cmpExpr182 = null;

        TinyHaxeTry1Parser.cmpExpr_return cmpExpr184 = null;


        Object AMPAMP183_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // TinyHaxeTry1.g:276:2: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            // TinyHaxeTry1.g:276:4: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:276:4: ( cmpExpr )
            // TinyHaxeTry1.g:276:5: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2055);
            cmpExpr182=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr182.getTree());

            }

            // TinyHaxeTry1.g:276:14: ( AMPAMP cmpExpr )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==AMPAMP) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // TinyHaxeTry1.g:276:15: AMPAMP cmpExpr
            	    {
            	    AMPAMP183=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2059); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP183_tree = (Object)adaptor.create(AMPAMP183);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP183_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2062);
            	    cmpExpr184=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr184.getTree());

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
    // TinyHaxeTry1.g:279:1: cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* ;
    public final TinyHaxeTry1Parser.cmpExpr_return cmpExpr() throws RecognitionException {
        TinyHaxeTry1Parser.cmpExpr_return retval = new TinyHaxeTry1Parser.cmpExpr_return();
        retval.start = input.LT(1);
        int cmpExpr_StartIndex = input.index();
        Object root_0 = null;

        Token EQEQ186=null;
        Token BANGEQ187=null;
        Token GTEQ188=null;
        Token LTEQ189=null;
        Token GT190=null;
        Token LT191=null;
        TinyHaxeTry1Parser.bitExpr_return bitExpr185 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr192 = null;


        Object EQEQ186_tree=null;
        Object BANGEQ187_tree=null;
        Object GTEQ188_tree=null;
        Object LTEQ189_tree=null;
        Object GT190_tree=null;
        Object LT191_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // TinyHaxeTry1.g:279:9: ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* )
            // TinyHaxeTry1.g:279:11: ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:279:11: ( bitExpr )
            // TinyHaxeTry1.g:279:12: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2076);
            bitExpr185=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr185.getTree());

            }

            // TinyHaxeTry1.g:279:21: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=LT && LA45_0<=GT)||(LA45_0>=EQEQ && LA45_0<=LTEQ)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // TinyHaxeTry1.g:279:22: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
            	    {
            	    // TinyHaxeTry1.g:279:22: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
            	    int alt44=6;
            	    switch ( input.LA(1) ) {
            	    case EQEQ:
            	        {
            	        alt44=1;
            	        }
            	        break;
            	    case BANGEQ:
            	        {
            	        alt44=2;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt44=3;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt44=4;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt44=5;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt44=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt44) {
            	        case 1 :
            	            // TinyHaxeTry1.g:279:23: EQEQ
            	            {
            	            EQEQ186=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2081); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ186_tree = (Object)adaptor.create(EQEQ186);
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ186_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // TinyHaxeTry1.g:279:30: BANGEQ
            	            {
            	            BANGEQ187=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2085); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ187_tree = (Object)adaptor.create(BANGEQ187);
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ187_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // TinyHaxeTry1.g:279:40: GTEQ
            	            {
            	            GTEQ188=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2090); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ188_tree = (Object)adaptor.create(GTEQ188);
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ188_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // TinyHaxeTry1.g:279:48: LTEQ
            	            {
            	            LTEQ189=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2095); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ189_tree = (Object)adaptor.create(LTEQ189);
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ189_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // TinyHaxeTry1.g:279:56: GT
            	            {
            	            GT190=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2100); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT190_tree = (Object)adaptor.create(GT190);
            	            root_0 = (Object)adaptor.becomeRoot(GT190_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // TinyHaxeTry1.g:279:62: LT
            	            {
            	            LT191=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2105); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT191_tree = (Object)adaptor.create(LT191);
            	            root_0 = (Object)adaptor.becomeRoot(LT191_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2110);
            	    bitExpr192=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr192.getTree());

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
    // TinyHaxeTry1.g:282:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
    public final TinyHaxeTry1Parser.bitExpr_return bitExpr() throws RecognitionException {
        TinyHaxeTry1Parser.bitExpr_return retval = new TinyHaxeTry1Parser.bitExpr_return();
        retval.start = input.LT(1);
        int bitExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BAR194=null;
        Token AMP196=null;
        Token CARET198=null;
        TinyHaxeTry1Parser.shiftExpr_return shiftExpr193 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr195 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr197 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr199 = null;


        Object BAR194_tree=null;
        Object AMP196_tree=null;
        Object CARET198_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // TinyHaxeTry1.g:282:9: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            // TinyHaxeTry1.g:282:11: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:282:11: ( shiftExpr )
            // TinyHaxeTry1.g:282:12: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2124);
            shiftExpr193=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr193.getTree());

            }

            // TinyHaxeTry1.g:282:23: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            loop46:
            do {
                int alt46=4;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    alt46=1;
                    }
                    break;
                case AMP:
                    {
                    alt46=2;
                    }
                    break;
                case CARET:
                    {
                    alt46=3;
                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // TinyHaxeTry1.g:282:24: BAR shiftExpr
            	    {
            	    BAR194=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2128); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR194_tree = (Object)adaptor.create(BAR194);
            	    root_0 = (Object)adaptor.becomeRoot(BAR194_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2131);
            	    shiftExpr195=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr195.getTree());

            	    }
            	    break;
            	case 2 :
            	    // TinyHaxeTry1.g:282:41: AMP shiftExpr
            	    {
            	    AMP196=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2135); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP196_tree = (Object)adaptor.create(AMP196);
            	    root_0 = (Object)adaptor.becomeRoot(AMP196_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2138);
            	    shiftExpr197=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr197.getTree());

            	    }
            	    break;
            	case 3 :
            	    // TinyHaxeTry1.g:282:57: CARET shiftExpr
            	    {
            	    CARET198=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2141); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET198_tree = (Object)adaptor.create(CARET198);
            	    root_0 = (Object)adaptor.becomeRoot(CARET198_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2144);
            	    shiftExpr199=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr199.getTree());

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
    // TinyHaxeTry1.g:285:1: shiftExpr : ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* ;
    public final TinyHaxeTry1Parser.shiftExpr_return shiftExpr() throws RecognitionException {
        TinyHaxeTry1Parser.shiftExpr_return retval = new TinyHaxeTry1Parser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LTLT201=null;
        Token GT203=null;
        Token GT204=null;
        Token GTGTGT206=null;
        TinyHaxeTry1Parser.addExpr_return addExpr200 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr202 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr205 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr207 = null;


        Object LTLT201_tree=null;
        Object GT203_tree=null;
        Object GT204_tree=null;
        Object GTGTGT206_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // TinyHaxeTry1.g:286:2: ( ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )* )
            // TinyHaxeTry1.g:286:4: ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:286:4: ( addExpr )
            // TinyHaxeTry1.g:286:5: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2158);
            addExpr200=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr200.getTree());

            }

            // TinyHaxeTry1.g:286:14: ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
            loop47:
            do {
                int alt47=4;
                switch ( input.LA(1) ) {
                case GT:
                    {
                    int LA47_2 = input.LA(2);

                    if ( (LA47_2==GT) ) {
                        int LA47_5 = input.LA(3);

                        if ( (synpred83_TinyHaxeTry1()) ) {
                            alt47=2;
                        }


                    }


                    }
                    break;
                case LTLT:
                    {
                    alt47=1;
                    }
                    break;
                case GTGTGT:
                    {
                    alt47=3;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // TinyHaxeTry1.g:286:15: LTLT addExpr
            	    {
            	    LTLT201=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2162); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT201_tree = (Object)adaptor.create(LTLT201);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT201_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2166);
            	    addExpr202=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr202.getTree());

            	    }
            	    break;
            	case 2 :
            	    // TinyHaxeTry1.g:286:32: ( GT GT ) addExpr
            	    {
            	    // TinyHaxeTry1.g:286:32: ( GT GT )
            	    // TinyHaxeTry1.g:286:33: GT GT
            	    {
            	    GT203=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2171); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT203_tree = (Object)adaptor.create(GT203);
            	    adaptor.addChild(root_0, GT203_tree);
            	    }
            	    GT204=(Token)match(input,GT,FOLLOW_GT_in_shiftExpr2173); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT204_tree = (Object)adaptor.create(GT204);
            	    adaptor.addChild(root_0, GT204_tree);
            	    }

            	    }

            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2178);
            	    addExpr205=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr205.getTree());

            	    }
            	    break;
            	case 3 :
            	    // TinyHaxeTry1.g:286:52: GTGTGT addExpr
            	    {
            	    GTGTGT206=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2182); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT206_tree = (Object)adaptor.create(GTGTGT206);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT206_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2185);
            	    addExpr207=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr207.getTree());

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
    // TinyHaxeTry1.g:289:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
    public final TinyHaxeTry1Parser.addExpr_return addExpr() throws RecognitionException {
        TinyHaxeTry1Parser.addExpr_return retval = new TinyHaxeTry1Parser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUS209=null;
        Token SUB210=null;
        TinyHaxeTry1Parser.multExpr_return multExpr208 = null;

        TinyHaxeTry1Parser.multExpr_return multExpr211 = null;


        Object PLUS209_tree=null;
        Object SUB210_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // TinyHaxeTry1.g:289:9: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            // TinyHaxeTry1.g:289:12: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:289:12: ( multExpr )
            // TinyHaxeTry1.g:289:13: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2199);
            multExpr208=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr208.getTree());

            }

            // TinyHaxeTry1.g:289:23: ( ( PLUS | SUB ) multExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=PLUS && LA49_0<=SUB)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // TinyHaxeTry1.g:289:24: ( PLUS | SUB ) multExpr
            	    {
            	    // TinyHaxeTry1.g:289:24: ( PLUS | SUB )
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==PLUS) ) {
            	        alt48=1;
            	    }
            	    else if ( (LA48_0==SUB) ) {
            	        alt48=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // TinyHaxeTry1.g:289:25: PLUS
            	            {
            	            PLUS209=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2204); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS209_tree = (Object)adaptor.create(PLUS209);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS209_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // TinyHaxeTry1.g:289:33: SUB
            	            {
            	            SUB210=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2209); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB210_tree = (Object)adaptor.create(SUB210);
            	            root_0 = (Object)adaptor.becomeRoot(SUB210_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2213);
            	    multExpr211=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr211.getTree());

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
    // TinyHaxeTry1.g:292:1: multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
    public final TinyHaxeTry1Parser.multExpr_return multExpr() throws RecognitionException {
        TinyHaxeTry1Parser.multExpr_return retval = new TinyHaxeTry1Parser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token STAR213=null;
        Token SLASH214=null;
        Token PERCENT215=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr212 = null;

        TinyHaxeTry1Parser.prefixExpr_return prefixExpr216 = null;


        Object STAR213_tree=null;
        Object SLASH214_tree=null;
        Object PERCENT215_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // TinyHaxeTry1.g:292:9: ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
            // TinyHaxeTry1.g:292:11: ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:292:11: ( prefixExpr )
            // TinyHaxeTry1.g:292:12: prefixExpr
            {
            pushFollow(FOLLOW_prefixExpr_in_multExpr2227);
            prefixExpr212=prefixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr212.getTree());

            }

            // TinyHaxeTry1.g:292:24: ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=STAR && LA51_0<=PERCENT)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // TinyHaxeTry1.g:292:25: ( STAR | SLASH | PERCENT ) prefixExpr
            	    {
            	    // TinyHaxeTry1.g:292:25: ( STAR | SLASH | PERCENT )
            	    int alt50=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt50=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt50=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt50=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 50, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt50) {
            	        case 1 :
            	            // TinyHaxeTry1.g:292:26: STAR
            	            {
            	            STAR213=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2232); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR213_tree = (Object)adaptor.create(STAR213);
            	            root_0 = (Object)adaptor.becomeRoot(STAR213_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // TinyHaxeTry1.g:292:32: SLASH
            	            {
            	            SLASH214=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2235); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH214_tree = (Object)adaptor.create(SLASH214);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH214_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // TinyHaxeTry1.g:292:39: PERCENT
            	            {
            	            PERCENT215=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2238); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT215_tree = (Object)adaptor.create(PERCENT215);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT215_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2242);
            	    prefixExpr216=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr216.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // TinyHaxeTry1.g:295:1: prefixExpr : ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr );
    public final TinyHaxeTry1Parser.prefixExpr_return prefixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.prefixExpr_return retval = new TinyHaxeTry1Parser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set217=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr218 = null;

        TinyHaxeTry1Parser.newExpr_return newExpr219 = null;

        TinyHaxeTry1Parser.cast_return cast220 = null;

        TinyHaxeTry1Parser.suffixExpr_return suffixExpr221 = null;


        Object set217_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // TinyHaxeTry1.g:296:9: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr )
            int alt52=4;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                int LA52_1 = input.LA(2);

                if ( (synpred94_TinyHaxeTry1()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
                }
                break;
            case NEW:
                {
                alt52=2;
                }
                break;
            case CAST:
                {
                alt52=3;
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
                alt52=4;
                }
                break;
            case SUBSUB:
                {
                int LA52_5 = input.LA(2);

                if ( (synpred94_TinyHaxeTry1()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 5, input);

                    throw nvae;
                }
                }
                break;
            case SUB:
                {
                int LA52_6 = input.LA(2);

                if ( (synpred94_TinyHaxeTry1()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 6, input);

                    throw nvae;
                }
                }
                break;
            case BANG:
            case TILDE:
                {
                alt52=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // TinyHaxeTry1.g:296:11: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    set217=(Token)input.LT(1);
                    if ( input.LA(1)==SUB||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set217));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2275);
                    prefixExpr218=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr218.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:297:11: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_prefixExpr2287);
                    newExpr219=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr219.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:298:11: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cast_in_prefixExpr2299);
                    cast220=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast220.getTree());

                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:299:11: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr2311);
                    suffixExpr221=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr221.getTree());

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
    // TinyHaxeTry1.g:302:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );
    public final TinyHaxeTry1Parser.suffixExpr_return suffixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.suffixExpr_return retval = new TinyHaxeTry1Parser.suffixExpr_return();
        retval.start = input.LT(1);
        int suffixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN223=null;
        Token RPAREN225=null;
        Token LBRACKET227=null;
        Token RBRACKET229=null;
        Token PLUSPLUS231=null;
        Token SUBSUB233=null;
        TinyHaxeTry1Parser.value_return value222 = null;

        TinyHaxeTry1Parser.exprListOpt_return exprListOpt224 = null;

        TinyHaxeTry1Parser.value_return value226 = null;

        TinyHaxeTry1Parser.expr_return expr228 = null;

        TinyHaxeTry1Parser.value_return value230 = null;

        TinyHaxeTry1Parser.value_return value232 = null;

        TinyHaxeTry1Parser.value_return value234 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt235 = null;


        Object LPAREN223_tree=null;
        Object RPAREN225_tree=null;
        Object LBRACKET227_tree=null;
        Object RBRACKET229_tree=null;
        Object PLUSPLUS231_tree=null;
        Object SUBSUB233_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // TinyHaxeTry1.g:303:2: ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt )
            int alt53=5;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // TinyHaxeTry1.g:303:4: value LPAREN exprListOpt RPAREN
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2330);
                    value222=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value222.getTree());
                    LPAREN223=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_suffixExpr2332); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN223);

                    pushFollow(FOLLOW_exprListOpt_in_suffixExpr2334);
                    exprListOpt224=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt224.getTree());
                    RPAREN225=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_suffixExpr2336); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN225);



                    // AST REWRITE
                    // elements: value, exprListOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 303:36: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? )
                    {
                        // TinyHaxeTry1.g:303:39: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // TinyHaxeTry1.g:303:93: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // TinyHaxeTry1.g:303:100: ( exprListOpt )?
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
                    // TinyHaxeTry1.g:304:4: value LBRACKET expr RBRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2357);
                    value226=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value226.getTree());
                    LBRACKET227=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_suffixExpr2359); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACKET227_tree = (Object)adaptor.create(LBRACKET227);
                    adaptor.addChild(root_0, LBRACKET227_tree);
                    }
                    pushFollow(FOLLOW_expr_in_suffixExpr2361);
                    expr228=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr228.getTree());
                    RBRACKET229=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_suffixExpr2363); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACKET229_tree = (Object)adaptor.create(RBRACKET229);
                    adaptor.addChild(root_0, RBRACKET229_tree);
                    }

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:305:4: value PLUSPLUS
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2368);
                    value230=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value230.getTree());
                    PLUSPLUS231=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr2370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS231);



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
                    // 305:22: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                    {
                        // TinyHaxeTry1.g:305:25: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // TinyHaxeTry1.g:305:79: ( value )?
                        if ( stream_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_value.nextTree());

                        }
                        stream_value.reset();
                        // TinyHaxeTry1.g:305:86: ( PLUSPLUS )?
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
                    // TinyHaxeTry1.g:306:4: value SUBSUB
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2394);
                    value232=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value232.getTree());
                    SUBSUB233=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr2396); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSUB.add(SUBSUB233);



                    // AST REWRITE
                    // elements: SUBSUB, value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 306:20: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                    {
                        // TinyHaxeTry1.g:306:23: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        // TinyHaxeTry1.g:306:77: ( value )?
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
                    // TinyHaxeTry1.g:307:4: value typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2419);
                    value234=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value234.getTree());
                    pushFollow(FOLLOW_typeParamOpt_in_suffixExpr2421);
                    typeParamOpt235=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt235.getTree());

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
    // TinyHaxeTry1.g:310:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );
    public final TinyHaxeTry1Parser.value_return value() throws RecognitionException {
        TinyHaxeTry1Parser.value_return retval = new TinyHaxeTry1Parser.value_return();
        retval.start = input.LT(1);
        int value_StartIndex = input.index();
        Object root_0 = null;

        Token NULL239=null;
        Token LPAREN241=null;
        Token RPAREN244=null;
        TinyHaxeTry1Parser.funcLit_return funcLit236 = null;

        TinyHaxeTry1Parser.arrayLit_return arrayLit237 = null;

        TinyHaxeTry1Parser.objLit_return objLit238 = null;

        TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol240 = null;

        TinyHaxeTry1Parser.expr_return expr242 = null;

        TinyHaxeTry1Parser.statement_return statement243 = null;

        TinyHaxeTry1Parser.dotIdent_return dotIdent245 = null;


        Object NULL239_tree=null;
        Object LPAREN241_tree=null;
        Object RPAREN244_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // TinyHaxeTry1.g:310:7: ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | )
            int alt55=8;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // TinyHaxeTry1.g:310:9: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcLit_in_value2430);
                    funcLit236=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit236.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:311:4: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLit_in_value2436);
                    arrayLit237=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit237.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:312:14: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objLit_in_value2451);
                    objLit238=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit238.getTree());

                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:313:14: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL239=(Token)match(input,NULL,FOLLOW_NULL_in_value2466); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL239_tree = (Object)adaptor.create(NULL239);
                    adaptor.addChild(root_0, NULL239_tree);
                    }

                    }
                    break;
                case 5 :
                    // TinyHaxeTry1.g:314:14: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elementarySymbol_in_value2481);
                    elementarySymbol240=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol240.getTree());

                    }
                    break;
                case 6 :
                    // TinyHaxeTry1.g:315:14: LPAREN ( expr | statement ) RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN241=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value2496); if (state.failed) return retval;
                    // TinyHaxeTry1.g:315:22: ( expr | statement )
                    int alt54=2;
                    alt54 = dfa54.predict(input);
                    switch (alt54) {
                        case 1 :
                            // TinyHaxeTry1.g:315:23: expr
                            {
                            pushFollow(FOLLOW_expr_in_value2500);
                            expr242=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr242.getTree());

                            }
                            break;
                        case 2 :
                            // TinyHaxeTry1.g:315:28: statement
                            {
                            pushFollow(FOLLOW_statement_in_value2502);
                            statement243=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement243.getTree());

                            }
                            break;

                    }

                    RPAREN244=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value2505); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // TinyHaxeTry1.g:316:11: dotIdent
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotIdent_in_value2518);
                    dotIdent245=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent245.getTree());

                    }
                    break;
                case 8 :
                    // TinyHaxeTry1.g:318:9: 
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
    // TinyHaxeTry1.g:320:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) ;
    public final TinyHaxeTry1Parser.newExpr_return newExpr() throws RecognitionException {
        TinyHaxeTry1Parser.newExpr_return retval = new TinyHaxeTry1Parser.newExpr_return();
        retval.start = input.LT(1);
        int newExpr_StartIndex = input.index();
        Object root_0 = null;

        Token NEW246=null;
        Token LPAREN248=null;
        Token RPAREN250=null;
        TinyHaxeTry1Parser.type_return type247 = null;

        TinyHaxeTry1Parser.exprListOpt_return exprListOpt249 = null;


        Object NEW246_tree=null;
        Object LPAREN248_tree=null;
        Object RPAREN250_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // TinyHaxeTry1.g:321:2: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? ( exprListOpt )? ) )
            // TinyHaxeTry1.g:321:4: NEW type LPAREN exprListOpt RPAREN
            {
            NEW246=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr2565); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW246);

            pushFollow(FOLLOW_type_in_newExpr2567);
            type247=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type247.getTree());
            LPAREN248=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr2569); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN248);

            pushFollow(FOLLOW_exprListOpt_in_newExpr2571);
            exprListOpt249=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt249.getTree());
            RPAREN250=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr2573); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN250);



            // AST REWRITE
            // elements: NEW, type, exprListOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 321:39: -> ^( NEW ( type )? ( exprListOpt )? )
            {
                // TinyHaxeTry1.g:321:42: ^( NEW ( type )? ( exprListOpt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_NEW.nextNode(), root_1);

                // TinyHaxeTry1.g:321:48: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // TinyHaxeTry1.g:321:54: ( exprListOpt )?
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
    // TinyHaxeTry1.g:324:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) );
    public final TinyHaxeTry1Parser.cast_return cast() throws RecognitionException {
        TinyHaxeTry1Parser.cast_return retval = new TinyHaxeTry1Parser.cast_return();
        retval.start = input.LT(1);
        int cast_StartIndex = input.index();
        Object root_0 = null;

        Token CAST251=null;
        Token LPAREN252=null;
        Token COMMA254=null;
        Token RPAREN256=null;
        Token CAST257=null;
        Token LPAREN258=null;
        Token RPAREN260=null;
        TinyHaxeTry1Parser.expr_return expr253 = null;

        TinyHaxeTry1Parser.funcType_return funcType255 = null;

        TinyHaxeTry1Parser.expr_return expr259 = null;


        Object CAST251_tree=null;
        Object LPAREN252_tree=null;
        Object COMMA254_tree=null;
        Object RPAREN256_tree=null;
        Object CAST257_tree=null;
        Object LPAREN258_tree=null;
        Object RPAREN260_tree=null;
        RewriteRuleTokenStream stream_CAST=new RewriteRuleTokenStream(adaptor,"token CAST");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // TinyHaxeTry1.g:324:9: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==CAST) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred110_TinyHaxeTry1()) ) {
                    alt57=1;
                }
                else if ( (true) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // TinyHaxeTry1.g:324:11: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST251=(Token)match(input,CAST,FOLLOW_CAST_in_cast2599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST251);

                    LPAREN252=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast2601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN252);

                    pushFollow(FOLLOW_expr_in_cast2603);
                    expr253=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr253.getTree());
                    // TinyHaxeTry1.g:324:28: ( COMMA funcType )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==COMMA) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // TinyHaxeTry1.g:324:29: COMMA funcType
                            {
                            COMMA254=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast2606); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA254);

                            pushFollow(FOLLOW_funcType_in_cast2608);
                            funcType255=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType255.getTree());

                            }
                            break;

                    }

                    RPAREN256=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast2612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN256);



                    // AST REWRITE
                    // elements: funcType, expr, CAST
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 324:54: -> ^( CAST ( expr )? ( funcType )? )
                    {
                        // TinyHaxeTry1.g:324:57: ^( CAST ( expr )? ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // TinyHaxeTry1.g:324:64: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();
                        // TinyHaxeTry1.g:324:70: ( funcType )?
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
                    // TinyHaxeTry1.g:325:4: CAST LPAREN expr RPAREN
                    {
                    CAST257=(Token)match(input,CAST,FOLLOW_CAST_in_cast2630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST257);

                    LPAREN258=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast2632); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN258);

                    pushFollow(FOLLOW_expr_in_cast2634);
                    expr259=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr259.getTree());
                    RPAREN260=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast2636); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN260);



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
                    // 325:31: -> ^( CAST ( expr )? )
                    {
                        // TinyHaxeTry1.g:325:34: ^( CAST ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        // TinyHaxeTry1.g:325:41: ( expr )?
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
    // TinyHaxeTry1.g:330:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelDecl_return retval = new TinyHaxeTry1Parser.topLevelDecl_return();
        retval.start = input.LT(1);
        int topLevelDecl_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.classDecl_return classDecl261 = null;

        TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl262 = null;

        TinyHaxeTry1Parser.enumDecl_return enumDecl263 = null;

        TinyHaxeTry1Parser.typedefDecl_return typedefDecl264 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // TinyHaxeTry1.g:331:2: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt58=4;
            switch ( input.LA(1) ) {
            case EXTERN:
            case CLASS:
                {
                alt58=1;
                }
                break;
            case INTERFACE:
                {
                alt58=2;
                }
                break;
            case ENUM:
                {
                alt58=3;
                }
                break;
            case TYPEDEF:
                {
                alt58=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // TinyHaxeTry1.g:331:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_topLevelDecl2668);
                    classDecl261=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl261.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:332:4: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl2673);
                    interfaceDecl262=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl262.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:333:11: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl2685);
                    enumDecl263=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl263.getTree());

                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:334:4: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl2690);
                    typedefDecl264=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl264.getTree());

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
    // TinyHaxeTry1.g:337:1: enumDecl : ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) ;
    public final TinyHaxeTry1Parser.enumDecl_return enumDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumDecl_return retval = new TinyHaxeTry1Parser.enumDecl_return();
        retval.start = input.LT(1);
        int enumDecl_StartIndex = input.index();
        Object root_0 = null;

        Token ENUM265=null;
        Token IDENTIFIER266=null;
        Token LBRACE268=null;
        Token RBRACE270=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt267 = null;

        TinyHaxeTry1Parser.enumBody_return enumBody269 = null;


        Object ENUM265_tree=null;
        Object IDENTIFIER266_tree=null;
        Object LBRACE268_tree=null;
        Object RBRACE270_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // TinyHaxeTry1.g:337:9: ( ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) )
            // TinyHaxeTry1.g:337:11: ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
            {
            ENUM265=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl2700); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM265);

            IDENTIFIER266=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl2702); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER266);

            pushFollow(FOLLOW_typeParamOpt_in_enumDecl2704);
            typeParamOpt267=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt267.getTree());
            LBRACE268=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl2706); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE268);

            pushFollow(FOLLOW_enumBody_in_enumDecl2708);
            enumBody269=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody269.getTree());
            RBRACE270=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl2710); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE270);



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
            // 337:63: -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? )
            {
                // TinyHaxeTry1.g:337:66: ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                // TinyHaxeTry1.g:337:73: ( IDENTIFIER )?
                if ( stream_IDENTIFIER.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                }
                stream_IDENTIFIER.reset();
                // TinyHaxeTry1.g:337:85: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // TinyHaxeTry1.g:337:99: ( enumBody )?
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
    // TinyHaxeTry1.g:340:1: enumBody : ( enumValueDecl )* ;
    public final TinyHaxeTry1Parser.enumBody_return enumBody() throws RecognitionException {
        TinyHaxeTry1Parser.enumBody_return retval = new TinyHaxeTry1Parser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl271 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // TinyHaxeTry1.g:340:9: ( ( enumValueDecl )* )
            // TinyHaxeTry1.g:340:11: ( enumValueDecl )*
            {
            root_0 = (Object)adaptor.nil();

            // TinyHaxeTry1.g:340:11: ( enumValueDecl )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==IDENTIFIER) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // TinyHaxeTry1.g:340:12: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody2736);
            	    enumValueDecl271=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValueDecl271.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
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
    // TinyHaxeTry1.g:343:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) );
    public final TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumValueDecl_return retval = new TinyHaxeTry1Parser.enumValueDecl_return();
        retval.start = input.LT(1);
        int enumValueDecl_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER272=null;
        Token LPAREN273=null;
        Token RPAREN275=null;
        Token SEMI276=null;
        Token IDENTIFIER277=null;
        Token SEMI278=null;
        TinyHaxeTry1Parser.paramList_return paramList274 = null;


        Object IDENTIFIER272_tree=null;
        Object LPAREN273_tree=null;
        Object RPAREN275_tree=null;
        Object SEMI276_tree=null;
        Object IDENTIFIER277_tree=null;
        Object SEMI278_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // TinyHaxeTry1.g:344:2: ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==IDENTIFIER) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==LPAREN) ) {
                    alt60=1;
                }
                else if ( (LA60_1==SEMI) ) {
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
                    // TinyHaxeTry1.g:344:4: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    IDENTIFIER272=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl2755); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER272);

                    LPAREN273=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl2757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN273);

                    pushFollow(FOLLOW_paramList_in_enumValueDecl2759);
                    paramList274=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList274.getTree());
                    RPAREN275=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl2761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN275);

                    SEMI276=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl2763); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI276);



                    // AST REWRITE
                    // elements: IDENTIFIER, paramList, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 344:44: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                    {
                        // TinyHaxeTry1.g:344:47: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER272), root_1);

                        // TinyHaxeTry1.g:344:89: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));

                        }
                        stream_IDENTIFIER.reset();
                        // TinyHaxeTry1.g:344:111: ( paramList )?
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
                    // TinyHaxeTry1.g:345:4: IDENTIFIER SEMI
                    {
                    IDENTIFIER277=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl2789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER277);

                    SEMI278=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl2791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI278);



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
                    // 345:23: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                    {
                        // TinyHaxeTry1.g:345:26: ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(IDENTIFIER, IDENTIFIER277), root_1);

                        // TinyHaxeTry1.g:345:68: ( IDENTIFIER )?
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
    // TinyHaxeTry1.g:349:1: varDeclList : varDecl varDeclList ;
    public final TinyHaxeTry1Parser.varDeclList_return varDeclList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclList_return retval = new TinyHaxeTry1Parser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl279 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList280 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // TinyHaxeTry1.g:350:2: ( varDecl varDeclList )
            // TinyHaxeTry1.g:350:4: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDecl_in_varDeclList2830);
            varDecl279=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl279.getTree());
            pushFollow(FOLLOW_varDeclList_in_varDeclList2832);
            varDeclList280=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList280.getTree());

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
    // TinyHaxeTry1.g:353:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) ;
    public final TinyHaxeTry1Parser.varDecl_return varDecl() throws RecognitionException {
        TinyHaxeTry1Parser.varDecl_return retval = new TinyHaxeTry1Parser.varDecl_return();
        retval.start = input.LT(1);
        int varDecl_StartIndex = input.index();
        Object root_0 = null;

        Token VAR282=null;
        Token SEMI284=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList281 = null;

        TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList283 = null;


        Object VAR282_tree=null;
        Object SEMI284_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_varDeclPartList=new RewriteRuleSubtreeStream(adaptor,"rule varDeclPartList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // TinyHaxeTry1.g:353:9: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? ) )
            // TinyHaxeTry1.g:353:11: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // TinyHaxeTry1.g:353:11: ( declAttrList )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=PUBLIC && LA61_0<=OVERRIDE)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // TinyHaxeTry1.g:353:12: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl2844);
                    declAttrList281=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList281.getTree());

                    }
                    break;

            }

            VAR282=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl2848); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR282);

            pushFollow(FOLLOW_varDeclPartList_in_varDecl2850);
            varDeclPartList283=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList283.getTree());
            SEMI284=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl2852); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI284);



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
            // 353:52: -> ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
            {
                // TinyHaxeTry1.g:353:55: ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, VAR282), root_1);

                // TinyHaxeTry1.g:353:83: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                // TinyHaxeTry1.g:353:97: ( varDeclPartList )?
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
    // TinyHaxeTry1.g:356:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
    public final TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclPartList_return retval = new TinyHaxeTry1Parser.varDeclPartList_return();
        retval.start = input.LT(1);
        int varDeclPartList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA286=null;
        TinyHaxeTry1Parser.varDeclPart_return varDeclPart285 = null;

        TinyHaxeTry1Parser.varDeclPart_return varDeclPart287 = null;


        Object COMMA286_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // TinyHaxeTry1.g:357:2: ( varDeclPart ( COMMA varDeclPart )* )
            // TinyHaxeTry1.g:357:4: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList2883);
            varDeclPart285=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart285.getTree());
            // TinyHaxeTry1.g:357:16: ( COMMA varDeclPart )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==COMMA) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // TinyHaxeTry1.g:357:17: COMMA varDeclPart
            	    {
            	    COMMA286=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList2886); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList2889);
            	    varDeclPart287=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart287.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // TinyHaxeTry1.g:360:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
    public final TinyHaxeTry1Parser.varDeclPart_return varDeclPart() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclPart_return retval = new TinyHaxeTry1Parser.varDeclPart_return();
        retval.start = input.LT(1);
        int varDeclPart_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER288=null;
        TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt289 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt290 = null;

        TinyHaxeTry1Parser.varInit_return varInit291 = null;


        Object IDENTIFIER288_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // TinyHaxeTry1.g:361:2: ( IDENTIFIER propDeclOpt typeTagOpt varInit )
            // TinyHaxeTry1.g:361:4: IDENTIFIER propDeclOpt typeTagOpt varInit
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER288=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart2903); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER288_tree = new VarUsage(IDENTIFIER288) ;
            adaptor.addChild(root_0, IDENTIFIER288_tree);
            }
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart2908);
            propDeclOpt289=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt289.getTree());
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart2910);
            typeTagOpt290=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt290.getTree());
            pushFollow(FOLLOW_varInit_in_varDeclPart2912);
            varInit291=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit291.getTree());

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
    // TinyHaxeTry1.g:364:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) ;
    public final TinyHaxeTry1Parser.propDecl_return propDecl() throws RecognitionException {
        TinyHaxeTry1Parser.propDecl_return retval = new TinyHaxeTry1Parser.propDecl_return();
        retval.start = input.LT(1);
        int propDecl_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN292=null;
        Token COMMA293=null;
        Token RPAREN294=null;
        TinyHaxeTry1Parser.propAccessor_return a1 = null;

        TinyHaxeTry1Parser.propAccessor_return a2 = null;


        Object LPAREN292_tree=null;
        Object COMMA293_tree=null;
        Object RPAREN294_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // TinyHaxeTry1.g:364:9: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) )
            // TinyHaxeTry1.g:364:11: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN292=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl2922); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN292);

            pushFollow(FOLLOW_propAccessor_in_propDecl2926);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            COMMA293=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl2928); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA293);

            pushFollow(FOLLOW_propAccessor_in_propDecl2932);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            RPAREN294=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl2934); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN294);



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
            // 364:63: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
            {
                // TinyHaxeTry1.g:364:66: ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(PROPERTY_DECL, "PROPERTY_DECL", true), root_1);

                // TinyHaxeTry1.g:364:124: ( $a1)?
                if ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();
                // TinyHaxeTry1.g:364:129: ( $a2)?
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
    // TinyHaxeTry1.g:367:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final TinyHaxeTry1Parser.propAccessor_return propAccessor() throws RecognitionException {
        TinyHaxeTry1Parser.propAccessor_return retval = new TinyHaxeTry1Parser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set295=null;

        Object set295_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // TinyHaxeTry1.g:368:2: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set295=(Token)input.LT(1);
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==DYNAMIC||input.LA(1)==DEFAULT||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set295));
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
    // TinyHaxeTry1.g:374:1: propDeclOpt : ( propDecl | );
    public final TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        TinyHaxeTry1Parser.propDeclOpt_return retval = new TinyHaxeTry1Parser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.propDecl_return propDecl296 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // TinyHaxeTry1.g:375:2: ( propDecl | )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LPAREN) ) {
                alt63=1;
            }
            else if ( (LA63_0==EOF||LA63_0==SEMI||LA63_0==COMMA||LA63_0==EQ||LA63_0==RPAREN||LA63_0==COLON||LA63_0==LBRACE) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // TinyHaxeTry1.g:375:4: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propDecl_in_propDeclOpt2994);
                    propDecl296=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl296.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:377:2: 
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
    // TinyHaxeTry1.g:379:1: varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | );
    public final TinyHaxeTry1Parser.varInit_return varInit() throws RecognitionException {
        TinyHaxeTry1Parser.varInit_return retval = new TinyHaxeTry1Parser.varInit_return();
        retval.start = input.LT(1);
        int varInit_StartIndex = input.index();
        Object root_0 = null;

        Token EQ297=null;
        TinyHaxeTry1Parser.expr_return expr298 = null;


        Object EQ297_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // TinyHaxeTry1.g:379:9: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==EQ) ) {
                alt64=1;
            }
            else if ( (LA64_0==EOF||LA64_0==SEMI||LA64_0==COMMA||LA64_0==RPAREN) ) {
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
                    // TinyHaxeTry1.g:379:11: EQ expr
                    {
                    EQ297=(Token)match(input,EQ,FOLLOW_EQ_in_varInit3009); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ297);

                    pushFollow(FOLLOW_expr_in_varInit3011);
                    expr298=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr298.getTree());


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
                    // 379:19: -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                    {
                        // TinyHaxeTry1.g:379:22: ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(VAR_INIT, "VAR_INIT", true), root_1);

                        // TinyHaxeTry1.g:379:70: ( expr )?
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
                    // TinyHaxeTry1.g:381:2: 
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
    // TinyHaxeTry1.g:383:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );
    public final TinyHaxeTry1Parser.funcDecl_return funcDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcDecl_return retval = new TinyHaxeTry1Parser.funcDecl_return();
        retval.start = input.LT(1);
        int funcDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION300=null;
        Token NEW301=null;
        Token LPAREN302=null;
        Token RPAREN304=null;
        Token FUNCTION308=null;
        Token IDENTIFIER309=null;
        Token LPAREN311=null;
        Token RPAREN313=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList299 = null;

        TinyHaxeTry1Parser.paramList_return paramList303 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt305 = null;

        TinyHaxeTry1Parser.block_return block306 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList307 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt310 = null;

        TinyHaxeTry1Parser.paramList_return paramList312 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt314 = null;

        TinyHaxeTry1Parser.block_return block315 = null;


        Object FUNCTION300_tree=null;
        Object NEW301_tree=null;
        Object LPAREN302_tree=null;
        Object RPAREN304_tree=null;
        Object FUNCTION308_tree=null;
        Object IDENTIFIER309_tree=null;
        Object LPAREN311_tree=null;
        Object RPAREN313_tree=null;
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
            // TinyHaxeTry1.g:383:9: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) )
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // TinyHaxeTry1.g:383:11: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    // TinyHaxeTry1.g:383:11: ( declAttrList )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( ((LA65_0>=PUBLIC && LA65_0<=OVERRIDE)) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // TinyHaxeTry1.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl3038);
                            declAttrList299=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList299.getTree());

                            }
                            break;

                    }

                    FUNCTION300=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3041); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION300);

                    NEW301=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl3043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW301);

                    LPAREN302=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3045); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN302);

                    pushFollow(FOLLOW_paramList_in_funcDecl3047);
                    paramList303=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList303.getTree());
                    RPAREN304=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3049); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN304);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3051);
                    typeTagOpt305=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt305.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3053);
                    block306=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block306.getTree());


                    // AST REWRITE
                    // elements: block, typeTagOpt, FUNCTION, declAttrList, NEW, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 384:4: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                    {
                        // TinyHaxeTry1.g:384:7: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        // TinyHaxeTry1.g:384:36: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // TinyHaxeTry1.g:384:50: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // TinyHaxeTry1.g:384:61: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // TinyHaxeTry1.g:384:73: ( block )?
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
                    // TinyHaxeTry1.g:385:4: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    // TinyHaxeTry1.g:385:4: ( declAttrList )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=PUBLIC && LA66_0<=OVERRIDE)) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // TinyHaxeTry1.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl3086);
                            declAttrList307=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList307.getTree());

                            }
                            break;

                    }

                    FUNCTION308=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3089); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION308);

                    IDENTIFIER309=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl3091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER309);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl3093);
                    typeParamOpt310=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt310.getTree());
                    LPAREN311=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3095); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN311);

                    pushFollow(FOLLOW_paramList_in_funcDecl3097);
                    paramList312=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList312.getTree());
                    RPAREN313=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN313);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3101);
                    typeTagOpt314=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt314.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3103);
                    block315=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block315.getTree());


                    // AST REWRITE
                    // elements: declAttrList, FUNCTION, typeParamOpt, paramList, IDENTIFIER, block, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 386:4: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                    {
                        // TinyHaxeTry1.g:386:7: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // TinyHaxeTry1.g:386:43: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // TinyHaxeTry1.g:386:57: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // TinyHaxeTry1.g:386:68: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // TinyHaxeTry1.g:386:80: ( block )?
                        if ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();
                        // TinyHaxeTry1.g:386:87: ( typeParamOpt )?
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
    // TinyHaxeTry1.g:389:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );
    public final TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcProtoDecl_return retval = new TinyHaxeTry1Parser.funcProtoDecl_return();
        retval.start = input.LT(1);
        int funcProtoDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION317=null;
        Token NEW318=null;
        Token LPAREN319=null;
        Token RPAREN321=null;
        Token SEMI323=null;
        Token FUNCTION325=null;
        Token IDENTIFIER326=null;
        Token LPAREN328=null;
        Token RPAREN330=null;
        Token SEMI332=null;
        Token FUNCTION333=null;
        Token NEW334=null;
        Token LPAREN335=null;
        Token RPAREN337=null;
        Token SEMI339=null;
        Token FUNCTION340=null;
        Token IDENTIFIER341=null;
        Token LPAREN343=null;
        Token RPAREN345=null;
        Token SEMI347=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList316 = null;

        TinyHaxeTry1Parser.paramList_return paramList320 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt322 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList324 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt327 = null;

        TinyHaxeTry1Parser.paramList_return paramList329 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt331 = null;

        TinyHaxeTry1Parser.paramList_return paramList336 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt338 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt342 = null;

        TinyHaxeTry1Parser.paramList_return paramList344 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt346 = null;


        Object FUNCTION317_tree=null;
        Object NEW318_tree=null;
        Object LPAREN319_tree=null;
        Object RPAREN321_tree=null;
        Object SEMI323_tree=null;
        Object FUNCTION325_tree=null;
        Object IDENTIFIER326_tree=null;
        Object LPAREN328_tree=null;
        Object RPAREN330_tree=null;
        Object SEMI332_tree=null;
        Object FUNCTION333_tree=null;
        Object NEW334_tree=null;
        Object LPAREN335_tree=null;
        Object RPAREN337_tree=null;
        Object SEMI339_tree=null;
        Object FUNCTION340_tree=null;
        Object IDENTIFIER341_tree=null;
        Object LPAREN343_tree=null;
        Object RPAREN345_tree=null;
        Object SEMI347_tree=null;
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
            // TinyHaxeTry1.g:390:2: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) )
            int alt68=4;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // TinyHaxeTry1.g:390:4: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3145);
                    declAttrList316=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList316.getTree());
                    FUNCTION317=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION317);

                    NEW318=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3149); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW318);

                    LPAREN319=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN319);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3153);
                    paramList320=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList320.getTree());
                    RPAREN321=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN321);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3157);
                    typeTagOpt322=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt322.getTree());
                    SEMI323=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI323);



                    // AST REWRITE
                    // elements: paramList, typeTagOpt, declAttrList, NEW, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 391:4: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                    {
                        // TinyHaxeTry1.g:391:7: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // TinyHaxeTry1.g:391:18: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // TinyHaxeTry1.g:391:23: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // TinyHaxeTry1.g:391:34: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // TinyHaxeTry1.g:391:46: ( declAttrList )?
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
                    // TinyHaxeTry1.g:392:4: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3186);
                    declAttrList324=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList324.getTree());
                    FUNCTION325=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION325);

                    IDENTIFIER326=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3190); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER326);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3192);
                    typeParamOpt327=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt327.getTree());
                    LPAREN328=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3194); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN328);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3196);
                    paramList329=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList329.getTree());
                    RPAREN330=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3198); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN330);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3200);
                    typeTagOpt331=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt331.getTree());
                    SEMI332=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI332);



                    // AST REWRITE
                    // elements: declAttrList, typeParamOpt, typeTagOpt, IDENTIFIER, paramList, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 393:4: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                    {
                        // TinyHaxeTry1.g:393:7: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // TinyHaxeTry1.g:393:18: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // TinyHaxeTry1.g:393:30: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // TinyHaxeTry1.g:393:41: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // TinyHaxeTry1.g:393:53: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // TinyHaxeTry1.g:393:67: ( typeParamOpt )?
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
                    // TinyHaxeTry1.g:394:4: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION333=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION333);

                    NEW334=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3234); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW334);

                    LPAREN335=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3236); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN335);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3238);
                    paramList336=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList336.getTree());
                    RPAREN337=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3240); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN337);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3242);
                    typeTagOpt338=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt338.getTree());
                    SEMI339=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3244); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI339);



                    // AST REWRITE
                    // elements: paramList, typeTagOpt, NEW, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 395:4: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                    {
                        // TinyHaxeTry1.g:395:7: ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // TinyHaxeTry1.g:395:18: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, stream_NEW.nextNode());

                        }
                        stream_NEW.reset();
                        // TinyHaxeTry1.g:395:23: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // TinyHaxeTry1.g:395:34: ( typeTagOpt )?
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
                    // TinyHaxeTry1.g:396:4: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION340=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION340);

                    IDENTIFIER341=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3270); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER341);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3272);
                    typeParamOpt342=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt342.getTree());
                    LPAREN343=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3274); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN343);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3276);
                    paramList344=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList344.getTree());
                    RPAREN345=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3278); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN345);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3280);
                    typeTagOpt346=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt346.getTree());
                    SEMI347=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3282); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI347);



                    // AST REWRITE
                    // elements: IDENTIFIER, typeTagOpt, paramList, typeParamOpt, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 397:4: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                    {
                        // TinyHaxeTry1.g:397:7: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        // TinyHaxeTry1.g:397:18: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();
                        // TinyHaxeTry1.g:397:30: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // TinyHaxeTry1.g:397:41: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        // TinyHaxeTry1.g:397:53: ( typeParamOpt )?
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
    // TinyHaxeTry1.g:400:1: classDecl : ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final TinyHaxeTry1Parser.classDecl_return classDecl() throws RecognitionException {
        TinyHaxeTry1Parser.classDecl_return retval = new TinyHaxeTry1Parser.classDecl_return();
        retval.start = input.LT(1);
        int classDecl_StartIndex = input.index();
        Object root_0 = null;

        Token EXTERN348=null;
        Token CLASS349=null;
        Token IDENTIFIER350=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt351 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt352 = null;

        TinyHaxeTry1Parser.classBodyScope_return classBodyScope353 = null;


        Object EXTERN348_tree=null;
        Object CLASS349_tree=null;
        Object IDENTIFIER350_tree=null;
        RewriteRuleTokenStream stream_EXTERN=new RewriteRuleTokenStream(adaptor,"token EXTERN");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // TinyHaxeTry1.g:401:2: ( ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // TinyHaxeTry1.g:401:4: ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt classBodyScope
            {
            // TinyHaxeTry1.g:401:4: ( EXTERN )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==EXTERN) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // TinyHaxeTry1.g:0:0: EXTERN
                    {
                    EXTERN348=(Token)match(input,EXTERN,FOLLOW_EXTERN_in_classDecl3316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTERN.add(EXTERN348);


                    }
                    break;

            }

            CLASS349=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl3319); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS349);

            IDENTIFIER350=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl3321); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER350);

            pushFollow(FOLLOW_typeParamOpt_in_classDecl3323);
            typeParamOpt351=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt351.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_classDecl3325);
            inheritListOpt352=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt352.getTree());
            pushFollow(FOLLOW_classBodyScope_in_classDecl3327);
            classBodyScope353=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope353.getTree());


            // AST REWRITE
            // elements: EXTERN, inheritListOpt, IDENTIFIER, typeParamOpt, CLASS, classBodyScope
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 402:4: -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // TinyHaxeTry1.g:402:7: ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ClassNode(stream_CLASS.nextToken()), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // TinyHaxeTry1.g:402:37: ( EXTERN )?
                if ( stream_EXTERN.hasNext() ) {
                    adaptor.addChild(root_1, stream_EXTERN.nextNode());

                }
                stream_EXTERN.reset();
                // TinyHaxeTry1.g:402:45: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // TinyHaxeTry1.g:402:59: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();
                // TinyHaxeTry1.g:402:75: ( classBodyScope )?
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
    // TinyHaxeTry1.g:405:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) ;
    public final TinyHaxeTry1Parser.classBodyScope_return classBodyScope() throws RecognitionException {
        TinyHaxeTry1Parser.classBodyScope_return retval = new TinyHaxeTry1Parser.classBodyScope_return();
        retval.start = input.LT(1);
        int classBodyScope_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE354=null;
        Token RBRACE356=null;
        TinyHaxeTry1Parser.classMember_return classMember355 = null;


        Object LBRACE354_tree=null;
        Object RBRACE356_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // TinyHaxeTry1.g:406:2: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] ) )
            // TinyHaxeTry1.g:406:4: LBRACE ( classMember )* RBRACE
            {
            LBRACE354=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope3365); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE354);

            // TinyHaxeTry1.g:406:11: ( classMember )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( ((LA70_0>=PUBLIC && LA70_0<=OVERRIDE)||LA70_0==FUNCTION||(LA70_0>=ENUM && LA70_0<=VAR)) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // TinyHaxeTry1.g:406:12: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope3368);
            	    classMember355=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember355.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            RBRACE356=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope3372); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE356);



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
            // 406:33: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
            {
                // TinyHaxeTry1.g:406:36: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\", true, $LBRACE] ( classMember )* RBRACE[$RBRACE, true] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true, LBRACE354), root_1);

                // TinyHaxeTry1.g:406:96: ( classMember )*
                while ( stream_classMember.hasNext() ) {
                    adaptor.addChild(root_1, stream_classMember.nextTree());

                }
                stream_classMember.reset();
                adaptor.addChild(root_1, new ExtendedCommonTree(RBRACE, RBRACE356, true));

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
    // TinyHaxeTry1.g:409:1: classMember : ( varDecl | funcDecl | enumDecl );
    public final TinyHaxeTry1Parser.classMember_return classMember() throws RecognitionException {
        TinyHaxeTry1Parser.classMember_return retval = new TinyHaxeTry1Parser.classMember_return();
        retval.start = input.LT(1);
        int classMember_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl357 = null;

        TinyHaxeTry1Parser.funcDecl_return funcDecl358 = null;

        TinyHaxeTry1Parser.enumDecl_return enumDecl359 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // TinyHaxeTry1.g:410:2: ( varDecl | funcDecl | enumDecl )
            int alt71=3;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // TinyHaxeTry1.g:410:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_classMember3402);
                    varDecl357=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl357.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:411:4: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcDecl_in_classMember3408);
                    funcDecl358=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl358.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:413:4: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_classMember3415);
                    enumDecl359=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl359.getTree());

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
    // TinyHaxeTry1.g:416:1: interfaceDecl : INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
    public final TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceDecl_return retval = new TinyHaxeTry1Parser.interfaceDecl_return();
        retval.start = input.LT(1);
        int interfaceDecl_StartIndex = input.index();
        Object root_0 = null;

        Token INTERFACE360=null;
        Token LBRACE363=null;
        Token RBRACE365=null;
        TinyHaxeTry1Parser.type_return type361 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt362 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody364 = null;


        Object INTERFACE360_tree=null;
        Object LBRACE363_tree=null;
        Object RBRACE365_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // TinyHaxeTry1.g:417:2: ( INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            // TinyHaxeTry1.g:417:4: INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            INTERFACE360=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl3433); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE360_tree = (Object)adaptor.create(INTERFACE360);
            adaptor.addChild(root_0, INTERFACE360_tree);
            }
            pushFollow(FOLLOW_type_in_interfaceDecl3435);
            type361=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type361.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl3437);
            inheritListOpt362=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt362.getTree());
            LBRACE363=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl3439); if (state.failed) return retval;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl3442);
            interfaceBody364=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody364.getTree());
            RBRACE365=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl3444); if (state.failed) return retval;

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
    // TinyHaxeTry1.g:420:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );
    public final TinyHaxeTry1Parser.interfaceBody_return interfaceBody() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceBody_return retval = new TinyHaxeTry1Parser.interfaceBody_return();
        retval.start = input.LT(1);
        int interfaceBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl366 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody367 = null;

        TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl368 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody369 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // TinyHaxeTry1.g:421:2: ( varDecl interfaceBody | funcProtoDecl interfaceBody | )
            int alt72=3;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // TinyHaxeTry1.g:421:4: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_interfaceBody3457);
                    varDecl366=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl366.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3459);
                    interfaceBody367=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody367.getTree());

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:422:4: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody3464);
                    funcProtoDecl368=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl368.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3466);
                    interfaceBody369=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody369.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:425:2: 
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
    // TinyHaxeTry1.g:427:1: inheritList : inherit ( COMMA inherit )* ;
    public final TinyHaxeTry1Parser.inheritList_return inheritList() throws RecognitionException {
        TinyHaxeTry1Parser.inheritList_return retval = new TinyHaxeTry1Parser.inheritList_return();
        retval.start = input.LT(1);
        int inheritList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA371=null;
        TinyHaxeTry1Parser.inherit_return inherit370 = null;

        TinyHaxeTry1Parser.inherit_return inherit372 = null;


        Object COMMA371_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // TinyHaxeTry1.g:428:2: ( inherit ( COMMA inherit )* )
            // TinyHaxeTry1.g:428:4: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inherit_in_inheritList3488);
            inherit370=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit370.getTree());
            // TinyHaxeTry1.g:428:12: ( COMMA inherit )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==COMMA) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // TinyHaxeTry1.g:428:13: COMMA inherit
            	    {
            	    COMMA371=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList3491); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inherit_in_inheritList3494);
            	    inherit372=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit372.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // TinyHaxeTry1.g:431:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | );
    public final TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.inheritListOpt_return retval = new TinyHaxeTry1Parser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.inheritList_return inheritList373 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // TinyHaxeTry1.g:432:2: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=EXTENDS && LA74_0<=IMPLEMENTS)) ) {
                alt74=1;
            }
            else if ( (LA74_0==LBRACE) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // TinyHaxeTry1.g:432:4: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt3512);
                    inheritList373=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList373.getTree());


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
                    // 432:16: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                    {
                        // TinyHaxeTry1.g:432:19: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT", true), root_1);

                        // TinyHaxeTry1.g:432:83: ( inheritList )?
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
                    // TinyHaxeTry1.g:434:6: 
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
    // TinyHaxeTry1.g:436:1: inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) );
    public final TinyHaxeTry1Parser.inherit_return inherit() throws RecognitionException {
        TinyHaxeTry1Parser.inherit_return retval = new TinyHaxeTry1Parser.inherit_return();
        retval.start = input.LT(1);
        int inherit_StartIndex = input.index();
        Object root_0 = null;

        Token EXTENDS374=null;
        Token IMPLEMENTS376=null;
        TinyHaxeTry1Parser.type_return type375 = null;

        TinyHaxeTry1Parser.type_return type377 = null;


        Object EXTENDS374_tree=null;
        Object IMPLEMENTS376_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // TinyHaxeTry1.g:436:9: ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^( IMPLEMENTS ( type )? ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==EXTENDS) ) {
                alt75=1;
            }
            else if ( (LA75_0==IMPLEMENTS) ) {
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
                    // TinyHaxeTry1.g:436:11: EXTENDS type
                    {
                    EXTENDS374=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit3548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS374);

                    pushFollow(FOLLOW_type_in_inherit3550);
                    type375=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type375.getTree());


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
                    // 436:25: -> ^( EXTENDS ( type )? )
                    {
                        // TinyHaxeTry1.g:436:28: ^( EXTENDS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EXTENDS.nextNode(), root_1);

                        // TinyHaxeTry1.g:436:38: ( type )?
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
                    // TinyHaxeTry1.g:437:11: IMPLEMENTS type
                    {
                    IMPLEMENTS376=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit3572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS376);

                    pushFollow(FOLLOW_type_in_inherit3574);
                    type377=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type377.getTree());


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
                    // 437:27: -> ^( IMPLEMENTS ( type )? )
                    {
                        // TinyHaxeTry1.g:437:30: ^( IMPLEMENTS ( type )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IMPLEMENTS.nextNode(), root_1);

                        // TinyHaxeTry1.g:437:43: ( type )?
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
    // TinyHaxeTry1.g:440:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final TinyHaxeTry1Parser.typedefDecl_return typedefDecl() throws RecognitionException {
        TinyHaxeTry1Parser.typedefDecl_return retval = new TinyHaxeTry1Parser.typedefDecl_return();
        retval.start = input.LT(1);
        int typedefDecl_StartIndex = input.index();
        Object root_0 = null;

        Token TYPEDEF378=null;
        Token IDENTIFIER379=null;
        Token EQ380=null;
        TinyHaxeTry1Parser.funcType_return funcType381 = null;


        Object TYPEDEF378_tree=null;
        Object IDENTIFIER379_tree=null;
        Object EQ380_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // TinyHaxeTry1.g:441:2: ( TYPEDEF IDENTIFIER EQ funcType )
            // TinyHaxeTry1.g:441:4: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            TYPEDEF378=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl3602); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF378_tree = (Object)adaptor.create(TYPEDEF378);
            adaptor.addChild(root_0, TYPEDEF378_tree);
            }
            IDENTIFIER379=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl3604); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER379_tree = (Object)adaptor.create(IDENTIFIER379);
            adaptor.addChild(root_0, IDENTIFIER379_tree);
            }
            EQ380=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl3606); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ380_tree = (Object)adaptor.create(EQ380);
            adaptor.addChild(root_0, EQ380_tree);
            }
            pushFollow(FOLLOW_funcType_in_typedefDecl3608);
            funcType381=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType381.getTree());

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
    // TinyHaxeTry1.g:444:1: typeExtend : GT funcType COMMA ;
    public final TinyHaxeTry1Parser.typeExtend_return typeExtend() throws RecognitionException {
        TinyHaxeTry1Parser.typeExtend_return retval = new TinyHaxeTry1Parser.typeExtend_return();
        retval.start = input.LT(1);
        int typeExtend_StartIndex = input.index();
        Object root_0 = null;

        Token GT382=null;
        Token COMMA384=null;
        TinyHaxeTry1Parser.funcType_return funcType383 = null;


        Object GT382_tree=null;
        Object COMMA384_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // TinyHaxeTry1.g:445:9: ( GT funcType COMMA )
            // TinyHaxeTry1.g:445:11: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            GT382=(Token)match(input,GT,FOLLOW_GT_in_typeExtend3627); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT382_tree = (Object)adaptor.create(GT382);
            adaptor.addChild(root_0, GT382_tree);
            }
            pushFollow(FOLLOW_funcType_in_typeExtend3629);
            funcType383=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType383.getTree());
            COMMA384=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend3631); if (state.failed) return retval;

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
    // TinyHaxeTry1.g:448:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
    public final TinyHaxeTry1Parser.anonType_return anonType() throws RecognitionException {
        TinyHaxeTry1Parser.anonType_return retval = new TinyHaxeTry1Parser.anonType_return();
        retval.start = input.LT(1);
        int anonType_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE385=null;
        Token RBRACE391=null;
        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList386 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList387 = null;

        TinyHaxeTry1Parser.typeExtend_return typeExtend388 = null;

        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList389 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList390 = null;


        Object LBRACE385_tree=null;
        Object RBRACE391_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // TinyHaxeTry1.g:448:9: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            // TinyHaxeTry1.g:448:11: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            LBRACE385=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType3642); if (state.failed) return retval;
            // TinyHaxeTry1.g:449:4: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt77=4;
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
            case GT:
                {
                alt77=4;
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
                    // TinyHaxeTry1.g:450:22: 
                    {
                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:450:27: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType3677);
                    anonTypeFieldList386=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList386.getTree());

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:451:26: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType3705);
                    varDeclList387=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList387.getTree());

                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:452:27: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType3734);
                    typeExtend388=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend388.getTree());
                    // TinyHaxeTry1.g:452:38: ( | anonTypeFieldList | varDeclList )
                    int alt76=3;
                    switch ( input.LA(1) ) {
                    case RBRACE:
                        {
                        alt76=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt76=2;
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
                        alt76=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }

                    switch (alt76) {
                        case 1 :
                            // TinyHaxeTry1.g:453:24: 
                            {
                            }
                            break;
                        case 2 :
                            // TinyHaxeTry1.g:453:25: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType3762);
                            anonTypeFieldList389=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList389.getTree());

                            }
                            break;
                        case 3 :
                            // TinyHaxeTry1.g:454:25: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType3788);
                            varDeclList390=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList390.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE391=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType3832); if (state.failed) return retval;

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
    // TinyHaxeTry1.g:459:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
    public final TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeFieldList_return retval = new TinyHaxeTry1Parser.anonTypeFieldList_return();
        retval.start = input.LT(1);
        int anonTypeFieldList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA393=null;
        TinyHaxeTry1Parser.anonTypeField_return anonTypeField392 = null;

        TinyHaxeTry1Parser.anonTypeField_return anonTypeField394 = null;


        Object COMMA393_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // TinyHaxeTry1.g:460:2: ( anonTypeField ( COMMA anonTypeField )* )
            // TinyHaxeTry1.g:460:4: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList3846);
            anonTypeField392=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField392.getTree());
            // TinyHaxeTry1.g:460:18: ( COMMA anonTypeField )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==COMMA) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // TinyHaxeTry1.g:460:19: COMMA anonTypeField
            	    {
            	    COMMA393=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList3849); if (state.failed) return retval;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList3852);
            	    anonTypeField394=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField394.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
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
    // TinyHaxeTry1.g:463:1: objLit : '{' objLitElemList '}' ;
    public final TinyHaxeTry1Parser.objLit_return objLit() throws RecognitionException {
        TinyHaxeTry1Parser.objLit_return retval = new TinyHaxeTry1Parser.objLit_return();
        retval.start = input.LT(1);
        int objLit_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal395=null;
        Token char_literal397=null;
        TinyHaxeTry1Parser.objLitElemList_return objLitElemList396 = null;


        Object char_literal395_tree=null;
        Object char_literal397_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // TinyHaxeTry1.g:463:8: ( '{' objLitElemList '}' )
            // TinyHaxeTry1.g:463:10: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal395=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit3864); if (state.failed) return retval;
            pushFollow(FOLLOW_objLitElemList_in_objLit3867);
            objLitElemList396=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList396.getTree());
            char_literal397=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit3869); if (state.failed) return retval;

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
    // TinyHaxeTry1.g:466:1: anonTypeField : IDENTIFIER COLON funcType ;
    public final TinyHaxeTry1Parser.anonTypeField_return anonTypeField() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeField_return retval = new TinyHaxeTry1Parser.anonTypeField_return();
        retval.start = input.LT(1);
        int anonTypeField_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER398=null;
        Token COLON399=null;
        TinyHaxeTry1Parser.funcType_return funcType400 = null;


        Object IDENTIFIER398_tree=null;
        Object COLON399_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // TinyHaxeTry1.g:467:2: ( IDENTIFIER COLON funcType )
            // TinyHaxeTry1.g:467:4: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER398=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField3881); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER398_tree = (Object)adaptor.create(IDENTIFIER398);
            adaptor.addChild(root_0, IDENTIFIER398_tree);
            }
            COLON399=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField3883); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_anonTypeField3886);
            funcType400=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType400.getTree());

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
    // TinyHaxeTry1.g:470:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
    public final TinyHaxeTry1Parser.objLitElemList_return objLitElemList() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElemList_return retval = new TinyHaxeTry1Parser.objLitElemList_return();
        retval.start = input.LT(1);
        int objLitElemList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA402=null;
        TinyHaxeTry1Parser.objLitElem_return objLitElem401 = null;

        TinyHaxeTry1Parser.objLitElem_return objLitElem403 = null;


        Object COMMA402_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // TinyHaxeTry1.g:471:2: ( objLitElem ( COMMA objLitElem )* )
            // TinyHaxeTry1.g:471:4: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_objLitElem_in_objLitElemList3902);
            objLitElem401=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem401.getTree());
            // TinyHaxeTry1.g:471:15: ( COMMA objLitElem )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==COMMA) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // TinyHaxeTry1.g:471:16: COMMA objLitElem
            	    {
            	    COMMA402=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList3905); if (state.failed) return retval;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList3908);
            	    objLitElem403=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem403.getTree());

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
    // TinyHaxeTry1.g:474:1: objLitElem : IDENTIFIER COLON expr ;
    public final TinyHaxeTry1Parser.objLitElem_return objLitElem() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElem_return retval = new TinyHaxeTry1Parser.objLitElem_return();
        retval.start = input.LT(1);
        int objLitElem_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER404=null;
        Token COLON405=null;
        TinyHaxeTry1Parser.expr_return expr406 = null;


        Object IDENTIFIER404_tree=null;
        Object COLON405_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // TinyHaxeTry1.g:475:9: ( IDENTIFIER COLON expr )
            // TinyHaxeTry1.g:475:11: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER404=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem3929); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER404_tree = (Object)adaptor.create(IDENTIFIER404);
            adaptor.addChild(root_0, IDENTIFIER404_tree);
            }
            COLON405=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem3931); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_objLitElem3934);
            expr406=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr406.getTree());

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
    // TinyHaxeTry1.g:478:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        TinyHaxeTry1Parser.elementarySymbol_return retval = new TinyHaxeTry1Parser.elementarySymbol_return();
        retval.start = input.LT(1);
        int elementarySymbol_StartIndex = input.index();
        Object root_0 = null;

        Token LONGLITERAL407=null;
        Token INTLITERAL408=null;
        Token STRINGLITERAL409=null;
        Token CHARLITERAL410=null;
        Token FLOATNUM411=null;
        Token TRUE412=null;
        Token FALSE413=null;

        Object LONGLITERAL407_tree=null;
        Object INTLITERAL408_tree=null;
        Object STRINGLITERAL409_tree=null;
        Object CHARLITERAL410_tree=null;
        Object FLOATNUM411_tree=null;
        Object TRUE412_tree=null;
        Object FALSE413_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // TinyHaxeTry1.g:479:2: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt80=7;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt80=1;
                }
                break;
            case INTLITERAL:
                {
                alt80=2;
                }
                break;
            case STRINGLITERAL:
                {
                alt80=3;
                }
                break;
            case CHARLITERAL:
                {
                alt80=4;
                }
                break;
            case FLOATNUM:
                {
                alt80=5;
                }
                break;
            case TRUE:
                {
                alt80=6;
                }
                break;
            case FALSE:
                {
                alt80=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // TinyHaxeTry1.g:479:4: LONGLITERAL
                    {
                    LONGLITERAL407=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol3946); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL407);



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
                    // 479:16: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(LONGLITERAL, LONGLITERAL407, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:480:4: INTLITERAL
                    {
                    INTLITERAL408=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol3959); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL408);



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
                    // 480:15: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(INTLITERAL, INTLITERAL408, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:481:4: STRINGLITERAL
                    {
                    STRINGLITERAL409=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol3972); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL409);



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
                    // 481:18: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(STRINGLITERAL, STRINGLITERAL409, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:482:4: CHARLITERAL
                    {
                    CHARLITERAL410=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol3985); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL410);



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
                    // 482:16: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(CHARLITERAL, CHARLITERAL410, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // TinyHaxeTry1.g:483:4: FLOATNUM
                    {
                    FLOATNUM411=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol3998); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM411);



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
                    // 483:13: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(FLOATNUM, FLOATNUM411, "FLOAT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // TinyHaxeTry1.g:484:4: TRUE
                    {
                    TRUE412=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol4011); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE412);



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
                    // 484:10: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(TRUE, TRUE412, "BOOL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // TinyHaxeTry1.g:485:4: FALSE
                    {
                    FALSE413=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol4025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE413);



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
                    // 485:11: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, new VarUsage(FALSE, FALSE413, "BOOL"));

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

    // $ANTLR start synpred20_TinyHaxeTry1
    public final void synpred20_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:119:54: ( typeTagOpt )
        // TinyHaxeTry1.g:119:54: typeTagOpt
        {
        pushFollow(FOLLOW_typeTagOpt_in_synpred20_TinyHaxeTry1847);
        typeTagOpt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_TinyHaxeTry1

    // $ANTLR start synpred22_TinyHaxeTry1
    public final void synpred22_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:157:21: ( COMMA funcType )
        // TinyHaxeTry1.g:157:21: COMMA funcType
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred22_TinyHaxeTry1953); if (state.failed) return ;
        pushFollow(FOLLOW_funcType_in_synpred22_TinyHaxeTry1956);
        funcType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_TinyHaxeTry1

    // $ANTLR start synpred23_TinyHaxeTry1
    public final void synpred23_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:157:11: ( funcType ( COMMA funcType )* )
        // TinyHaxeTry1.g:157:11: funcType ( COMMA funcType )*
        {
        pushFollow(FOLLOW_funcType_in_synpred23_TinyHaxeTry1950);
        funcType();

        state._fsp--;
        if (state.failed) return ;
        // TinyHaxeTry1.g:157:20: ( COMMA funcType )*
        loop82:
        do {
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==COMMA) ) {
                alt82=1;
            }


            switch (alt82) {
        	case 1 :
        	    // TinyHaxeTry1.g:157:21: COMMA funcType
        	    {
        	    match(input,COMMA,FOLLOW_COMMA_in_synpred23_TinyHaxeTry1953); if (state.failed) return ;
        	    pushFollow(FOLLOW_funcType_in_synpred23_TinyHaxeTry1956);
        	    funcType();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop82;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred23_TinyHaxeTry1

    // $ANTLR start synpred24_TinyHaxeTry1
    public final void synpred24_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:158:20: ( COMMA typeConstraint )
        // TinyHaxeTry1.g:158:20: COMMA typeConstraint
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred24_TinyHaxeTry1967); if (state.failed) return ;
        pushFollow(FOLLOW_typeConstraint_in_synpred24_TinyHaxeTry1970);
        typeConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_TinyHaxeTry1

    // $ANTLR start synpred25_TinyHaxeTry1
    public final void synpred25_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:161:19: ( MINUS_BIGGER type )
        // TinyHaxeTry1.g:161:19: MINUS_BIGGER type
        {
        match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred25_TinyHaxeTry1989); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred25_TinyHaxeTry1992);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_TinyHaxeTry1

    // $ANTLR start synpred26_TinyHaxeTry1
    public final void synpred26_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:161:11: ( ( type ) ( MINUS_BIGGER type )* )
        // TinyHaxeTry1.g:161:11: ( type ) ( MINUS_BIGGER type )*
        {
        // TinyHaxeTry1.g:161:11: ( type )
        // TinyHaxeTry1.g:161:12: type
        {
        pushFollow(FOLLOW_type_in_synpred26_TinyHaxeTry1985);
        type();

        state._fsp--;
        if (state.failed) return ;

        }

        // TinyHaxeTry1.g:161:18: ( MINUS_BIGGER type )*
        loop83:
        do {
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==MINUS_BIGGER) ) {
                alt83=1;
            }


            switch (alt83) {
        	case 1 :
        	    // TinyHaxeTry1.g:161:19: MINUS_BIGGER type
        	    {
        	    match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred26_TinyHaxeTry1989); if (state.failed) return ;
        	    pushFollow(FOLLOW_type_in_synpred26_TinyHaxeTry1992);
        	    type();

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
    // $ANTLR end synpred26_TinyHaxeTry1

    // $ANTLR start synpred33_TinyHaxeTry1
    public final void synpred33_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:165:65: ( typeParam )
        // TinyHaxeTry1.g:165:65: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred33_TinyHaxeTry11032);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_TinyHaxeTry1

    // $ANTLR start synpred34_TinyHaxeTry1
    public final void synpred34_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:165:8: ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* )
        // TinyHaxeTry1.g:165:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )*
        {
        // TinyHaxeTry1.g:165:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
        int alt84=7;
        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt84=1;
            }
            break;
        case IDENTIFIER:
            {
            alt84=2;
            }
            break;
        case INT:
            {
            alt84=3;
            }
            break;
        case FLOAT:
            {
            alt84=4;
            }
            break;
        case DYNAMIC:
            {
            alt84=5;
            }
            break;
        case BOOLEAN:
            {
            alt84=6;
            }
            break;
        case VOID:
            {
            alt84=7;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 84, 0, input);

            throw nvae;
        }

        switch (alt84) {
            case 1 :
                // TinyHaxeTry1.g:165:9: anonType
                {
                pushFollow(FOLLOW_anonType_in_synpred34_TinyHaxeTry11011);
                anonType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // TinyHaxeTry1.g:165:20: dotIdent
                {
                pushFollow(FOLLOW_dotIdent_in_synpred34_TinyHaxeTry11015);
                dotIdent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // TinyHaxeTry1.g:165:30: INT
                {
                match(input,INT,FOLLOW_INT_in_synpred34_TinyHaxeTry11018); if (state.failed) return ;

                }
                break;
            case 4 :
                // TinyHaxeTry1.g:165:35: FLOAT
                {
                match(input,FLOAT,FOLLOW_FLOAT_in_synpred34_TinyHaxeTry11021); if (state.failed) return ;

                }
                break;
            case 5 :
                // TinyHaxeTry1.g:165:42: DYNAMIC
                {
                match(input,DYNAMIC,FOLLOW_DYNAMIC_in_synpred34_TinyHaxeTry11024); if (state.failed) return ;

                }
                break;
            case 6 :
                // TinyHaxeTry1.g:165:50: BOOLEAN
                {
                match(input,BOOLEAN,FOLLOW_BOOLEAN_in_synpred34_TinyHaxeTry11026); if (state.failed) return ;

                }
                break;
            case 7 :
                // TinyHaxeTry1.g:165:58: VOID
                {
                match(input,VOID,FOLLOW_VOID_in_synpred34_TinyHaxeTry11028); if (state.failed) return ;

                }
                break;

        }

        // TinyHaxeTry1.g:165:64: ( typeParam )*
        loop85:
        do {
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==LT) ) {
                alt85=1;
            }


            switch (alt85) {
        	case 1 :
        	    // TinyHaxeTry1.g:165:65: typeParam
        	    {
        	    pushFollow(FOLLOW_typeParam_in_synpred34_TinyHaxeTry11032);
        	    typeParam();

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
    // $ANTLR end synpred34_TinyHaxeTry1

    // $ANTLR start synpred35_TinyHaxeTry1
    public final void synpred35_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:170:9: ( type )
        // TinyHaxeTry1.g:170:9: type
        {
        pushFollow(FOLLOW_type_in_synpred35_TinyHaxeTry11054);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_TinyHaxeTry1

    // $ANTLR start synpred36_TinyHaxeTry1
    public final void synpred36_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:170:25: ( GT )
        // TinyHaxeTry1.g:170:25: GT
        {
        match(input,GT,FOLLOW_GT_in_synpred36_TinyHaxeTry11060); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_TinyHaxeTry1

    // $ANTLR start synpred37_TinyHaxeTry1
    public final void synpred37_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:170:29: ( GTGT )
        // TinyHaxeTry1.g:170:29: GTGT
        {
        match(input,GTGT,FOLLOW_GTGT_in_synpred37_TinyHaxeTry11063); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_TinyHaxeTry1

    // $ANTLR start synpred38_TinyHaxeTry1
    public final void synpred38_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:175:4: ( typeParam )
        // TinyHaxeTry1.g:175:4: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred38_TinyHaxeTry11085);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_TinyHaxeTry1

    // $ANTLR start synpred40_TinyHaxeTry1
    public final void synpred40_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:188:4: ( block )
        // TinyHaxeTry1.g:188:4: block
        {
        pushFollow(FOLLOW_block_in_synpred40_TinyHaxeTry11214);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_TinyHaxeTry1

    // $ANTLR start synpred41_TinyHaxeTry1
    public final void synpred41_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:189:4: ( assignExpr SEMI )
        // TinyHaxeTry1.g:189:4: assignExpr SEMI
        {
        pushFollow(FOLLOW_assignExpr_in_synpred41_TinyHaxeTry11219);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred41_TinyHaxeTry11221); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_TinyHaxeTry1

    // $ANTLR start synpred43_TinyHaxeTry1
    public final void synpred43_TinyHaxeTry1_fragment() throws RecognitionException {   
        TinyHaxeTry1Parser.statement_return st2 = null;


        // TinyHaxeTry1.g:191:36: ( ELSE st2= statement )
        // TinyHaxeTry1.g:191:36: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred43_TinyHaxeTry11241); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred43_TinyHaxeTry11245);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_TinyHaxeTry1

    // $ANTLR start synpred51_TinyHaxeTry1
    public final void synpred51_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:197:12: ( expr )
        // TinyHaxeTry1.g:197:12: expr
        {
        pushFollow(FOLLOW_expr_in_synpred51_TinyHaxeTry11453);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_TinyHaxeTry1

    // $ANTLR start synpred58_TinyHaxeTry1
    public final void synpred58_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:201:4: ( expr SEMI )
        // TinyHaxeTry1.g:201:4: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred58_TinyHaxeTry11547);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred58_TinyHaxeTry11550); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_TinyHaxeTry1

    // $ANTLR start synpred59_TinyHaxeTry1
    public final void synpred59_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:202:4: ( IDENTIFIER COLON statement )
        // TinyHaxeTry1.g:202:4: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred59_TinyHaxeTry11556); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred59_TinyHaxeTry11558); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred59_TinyHaxeTry11560);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_TinyHaxeTry1

    // $ANTLR start synpred62_TinyHaxeTry1
    public final void synpred62_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:215:4: ( varDecl )
        // TinyHaxeTry1.g:215:4: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred62_TinyHaxeTry11667);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_TinyHaxeTry1

    // $ANTLR start synpred66_TinyHaxeTry1
    public final void synpred66_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:249:4: ( exprList )
        // TinyHaxeTry1.g:249:4: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred66_TinyHaxeTry11881);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_TinyHaxeTry1

    // $ANTLR start synpred83_TinyHaxeTry1
    public final void synpred83_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:286:32: ( ( GT GT ) addExpr )
        // TinyHaxeTry1.g:286:32: ( GT GT ) addExpr
        {
        // TinyHaxeTry1.g:286:32: ( GT GT )
        // TinyHaxeTry1.g:286:33: GT GT
        {
        match(input,GT,FOLLOW_GT_in_synpred83_TinyHaxeTry12171); if (state.failed) return ;
        match(input,GT,FOLLOW_GT_in_synpred83_TinyHaxeTry12173); if (state.failed) return ;

        }

        pushFollow(FOLLOW_addExpr_in_synpred83_TinyHaxeTry12178);
        addExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred83_TinyHaxeTry1

    // $ANTLR start synpred94_TinyHaxeTry1
    public final void synpred94_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:296:11: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr )
        // TinyHaxeTry1.g:296:11: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
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

        pushFollow(FOLLOW_prefixExpr_in_synpred94_TinyHaxeTry12275);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_TinyHaxeTry1

    // $ANTLR start synpred97_TinyHaxeTry1
    public final void synpred97_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:303:4: ( value LPAREN exprListOpt RPAREN )
        // TinyHaxeTry1.g:303:4: value LPAREN exprListOpt RPAREN
        {
        pushFollow(FOLLOW_value_in_synpred97_TinyHaxeTry12330);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred97_TinyHaxeTry12332); if (state.failed) return ;
        pushFollow(FOLLOW_exprListOpt_in_synpred97_TinyHaxeTry12334);
        exprListOpt();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred97_TinyHaxeTry12336); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_TinyHaxeTry1

    // $ANTLR start synpred98_TinyHaxeTry1
    public final void synpred98_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:304:4: ( value LBRACKET expr RBRACKET )
        // TinyHaxeTry1.g:304:4: value LBRACKET expr RBRACKET
        {
        pushFollow(FOLLOW_value_in_synpred98_TinyHaxeTry12357);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred98_TinyHaxeTry12359); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred98_TinyHaxeTry12361);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred98_TinyHaxeTry12363); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred98_TinyHaxeTry1

    // $ANTLR start synpred99_TinyHaxeTry1
    public final void synpred99_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:305:4: ( value PLUSPLUS )
        // TinyHaxeTry1.g:305:4: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred99_TinyHaxeTry12368);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred99_TinyHaxeTry12370); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_TinyHaxeTry1

    // $ANTLR start synpred100_TinyHaxeTry1
    public final void synpred100_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:306:4: ( value SUBSUB )
        // TinyHaxeTry1.g:306:4: value SUBSUB
        {
        pushFollow(FOLLOW_value_in_synpred100_TinyHaxeTry12394);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred100_TinyHaxeTry12396); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_TinyHaxeTry1

    // $ANTLR start synpred102_TinyHaxeTry1
    public final void synpred102_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:311:4: ( arrayLit )
        // TinyHaxeTry1.g:311:4: arrayLit
        {
        pushFollow(FOLLOW_arrayLit_in_synpred102_TinyHaxeTry12436);
        arrayLit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred102_TinyHaxeTry1

    // $ANTLR start synpred106_TinyHaxeTry1
    public final void synpred106_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:315:23: ( expr )
        // TinyHaxeTry1.g:315:23: expr
        {
        pushFollow(FOLLOW_expr_in_synpred106_TinyHaxeTry12500);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_TinyHaxeTry1

    // $ANTLR start synpred107_TinyHaxeTry1
    public final void synpred107_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:315:14: ( LPAREN ( expr | statement ) RPAREN )
        // TinyHaxeTry1.g:315:14: LPAREN ( expr | statement ) RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred107_TinyHaxeTry12496); if (state.failed) return ;
        // TinyHaxeTry1.g:315:22: ( expr | statement )
        int alt92=2;
        alt92 = dfa92.predict(input);
        switch (alt92) {
            case 1 :
                // TinyHaxeTry1.g:315:23: expr
                {
                pushFollow(FOLLOW_expr_in_synpred107_TinyHaxeTry12500);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // TinyHaxeTry1.g:315:28: statement
                {
                pushFollow(FOLLOW_statement_in_synpred107_TinyHaxeTry12502);
                statement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred107_TinyHaxeTry12505); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred107_TinyHaxeTry1

    // $ANTLR start synpred110_TinyHaxeTry1
    public final void synpred110_TinyHaxeTry1_fragment() throws RecognitionException {   
        // TinyHaxeTry1.g:324:11: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // TinyHaxeTry1.g:324:11: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred110_TinyHaxeTry12599); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred110_TinyHaxeTry12601); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred110_TinyHaxeTry12603);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // TinyHaxeTry1.g:324:28: ( COMMA funcType )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==COMMA) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // TinyHaxeTry1.g:324:29: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred110_TinyHaxeTry12606); if (state.failed) return ;
                pushFollow(FOLLOW_funcType_in_synpred110_TinyHaxeTry12608);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred110_TinyHaxeTry12612); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_TinyHaxeTry1

    // Delegated rules

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
    public final boolean synpred97_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred62_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred110_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred20_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred98_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_TinyHaxeTry1_fragment(); // can never throw exception
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
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA92 dfa92 = new DFA92(this);
    static final String DFA16_eotS =
        "\66\uffff";
    static final String DFA16_eofS =
        "\1\1\65\uffff";
    static final String DFA16_minS =
        "\1\20\1\uffff\1\0\63\uffff";
    static final String DFA16_maxS =
        "\1\140\1\uffff\1\0\63\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\63\uffff\1\2";
    static final String DFA16_specialS =
        "\2\uffff\1\0\63\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\1\2\1\uffff\1\1\4\uffff\1\1\1\uffff\10\1\1\uffff\2\1\1"+
            "\uffff\12\1\4\uffff\1\1\4\uffff\2\1\7\uffff\21\1\6\uffff\1\1"+
            "\1\uffff\6\1",
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
            return "157:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );";
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
                        if ( (synpred23_TinyHaxeTry1()) ) {s = 1;}

                        else if ( (true) ) {s = 53;}

                         
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
        "\1\140\4\uffff\1\0\52\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\55\uffff\1\1";
    static final String DFA15_specialS =
        "\5\uffff\1\0\52\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\2\uffff\1\1\6\uffff\1\5\7\1\1\uffff\2\1\1\uffff\3\1\4"+
            "\uffff\3\1\4\uffff\1\1\4\uffff\2\1\7\uffff\21\1\6\uffff\1\1"+
            "\1\uffff\6\1",
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
            return "()* loopback of 158:19: ( COMMA typeConstraint )*";
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
                        if ( (synpred24_TinyHaxeTry1()) ) {s = 47;}

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
        "\1\140\1\0\63\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\1\5\uffff\1\2\54\uffff";
    static final String DFA21_specialS =
        "\1\uffff\1\0\63\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\10\1\2\1\uffff\1\10\4\uffff\1\2\1\uffff\10\10\1\uffff\2"+
            "\10\1\uffff\3\10\4\2\3\10\4\uffff\1\10\4\uffff\1\1\1\10\7\uffff"+
            "\21\10\6\uffff\1\10\1\uffff\6\10",
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
            return "165:1: type : ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | );";
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
                        if ( (synpred34_TinyHaxeTry1()) ) {s = 2;}

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
        "\67\uffff";
    static final String DFA22_eofS =
        "\1\16\66\uffff";
    static final String DFA22_minS =
        "\1\20\64\0\2\uffff";
    static final String DFA22_maxS =
        "\1\140\64\0\2\uffff";
    static final String DFA22_acceptS =
        "\65\uffff\1\1\1\2";
    static final String DFA22_specialS =
        "\1\uffff\1\3\1\50\1\40\1\22\1\30\1\17\1\4\1\35\1\26\1\41\1\14\1"+
        "\31\1\45\1\32\1\23\1\44\1\2\1\34\1\25\1\43\1\57\1\33\1\53\1\37\1"+
        "\21\1\36\1\6\1\16\1\20\1\27\1\24\1\15\1\56\1\60\1\0\1\13\1\47\1"+
        "\46\1\61\1\52\1\62\1\11\1\42\1\7\1\10\1\5\1\1\1\54\1\63\1\51\1\55"+
        "\1\12\2\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\17\1\2\1\uffff\1\20\4\uffff\1\5\1\uffff\1\14\1\53\1\13\1"+
            "\55\1\56\1\57\1\60\1\61\1\uffff\1\27\1\15\1\uffff\1\64\1\63"+
            "\1\12\1\7\1\3\1\4\1\6\1\32\1\10\1\11\4\uffff\1\62\4\uffff\1"+
            "\1\1\26\7\uffff\1\54\1\52\1\51\1\45\1\46\1\47\1\50\1\42\1\43"+
            "\1\44\1\40\1\41\1\36\1\37\1\33\1\34\1\35\6\uffff\1\24\1\uffff"+
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
            return "170:8: ( type | typeList )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_35 = input.LA(1);

                         
                        int index22_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_35);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_47 = input.LA(1);

                         
                        int index22_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_47);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_17 = input.LA(1);

                         
                        int index22_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_17);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_46 = input.LA(1);

                         
                        int index22_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_46);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_27 = input.LA(1);

                         
                        int index22_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_27);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_44 = input.LA(1);

                         
                        int index22_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_44);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_45 = input.LA(1);

                         
                        int index22_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_45);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA22_42 = input.LA(1);

                         
                        int index22_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_42);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA22_52 = input.LA(1);

                         
                        int index22_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_52);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA22_36 = input.LA(1);

                         
                        int index22_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_36);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA22_11 = input.LA(1);

                         
                        int index22_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_11);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA22_32 = input.LA(1);

                         
                        int index22_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_32);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA22_28 = input.LA(1);

                         
                        int index22_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_28);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA22_29 = input.LA(1);

                         
                        int index22_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_29);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA22_25 = input.LA(1);

                         
                        int index22_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_25);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_4);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA22_15 = input.LA(1);

                         
                        int index22_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_15);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA22_31 = input.LA(1);

                         
                        int index22_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_31);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA22_19 = input.LA(1);

                         
                        int index22_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_19);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA22_9 = input.LA(1);

                         
                        int index22_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_9);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA22_30 = input.LA(1);

                         
                        int index22_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_30);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA22_12 = input.LA(1);

                         
                        int index22_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_12);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA22_14 = input.LA(1);

                         
                        int index22_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_14);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA22_22 = input.LA(1);

                         
                        int index22_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_22);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA22_18 = input.LA(1);

                         
                        int index22_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_18);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA22_8 = input.LA(1);

                         
                        int index22_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_8);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA22_26 = input.LA(1);

                         
                        int index22_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_26);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA22_24 = input.LA(1);

                         
                        int index22_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_24);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA22_43 = input.LA(1);

                         
                        int index22_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_43);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA22_20 = input.LA(1);

                         
                        int index22_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_20);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA22_16 = input.LA(1);

                         
                        int index22_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_16);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA22_13 = input.LA(1);

                         
                        int index22_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_13);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA22_38 = input.LA(1);

                         
                        int index22_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_38);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA22_37 = input.LA(1);

                         
                        int index22_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_37);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA22_50 = input.LA(1);

                         
                        int index22_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_50);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA22_40 = input.LA(1);

                         
                        int index22_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_40);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA22_23 = input.LA(1);

                         
                        int index22_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_23);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA22_48 = input.LA(1);

                         
                        int index22_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_48);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA22_51 = input.LA(1);

                         
                        int index22_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_51);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA22_33 = input.LA(1);

                         
                        int index22_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_33);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA22_21 = input.LA(1);

                         
                        int index22_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_21);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA22_34 = input.LA(1);

                         
                        int index22_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_34);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA22_39 = input.LA(1);

                         
                        int index22_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_39);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA22_41 = input.LA(1);

                         
                        int index22_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_41);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA22_49 = input.LA(1);

                         
                        int index22_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index22_49);
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
        "\103\uffff";
    static final String DFA31_eofS =
        "\103\uffff";
    static final String DFA31_minS =
        "\1\20\55\0\25\uffff";
    static final String DFA31_maxS =
        "\1\147\55\0\25\uffff";
    static final String DFA31_acceptS =
        "\56\uffff\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\1\1\2\1\16\1\20\1\17";
    static final String DFA31_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\25\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\2\1\21\2\uffff\6\56\1\uffff\1\46\1\50\1\51\1\52\1\53\1\54"+
            "\1\55\1\6\1\20\1\uffff\1\7\7\uffff\1\24\1\33\1\uffff\1\4\1\64"+
            "\1\uffff\1\65\1\uffff\1\66\1\67\1\70\1\71\1\1\1\uffff\1\72\1"+
            "\73\1\74\1\75\3\uffff\1\47\1\45\1\44\1\40\1\41\1\42\1\43\1\35"+
            "\1\36\1\37\1\32\1\34\1\30\1\23\1\25\1\26\1\27\1\22\1\3\2\31"+
            "\1\10\1\5\1\uffff\1\56\6\uffff\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "187:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );";
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
                        if ( (synpred40_TinyHaxeTry1()) ) {s = 62;}

                        else if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_TinyHaxeTry1()) ) {s = 62;}

                        else if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (true) ) {s = 65;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA31_10 = input.LA(1);

                         
                        int index31_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA31_11 = input.LA(1);

                         
                        int index31_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA31_12 = input.LA(1);

                         
                        int index31_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA31_13 = input.LA(1);

                         
                        int index31_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA31_14 = input.LA(1);

                         
                        int index31_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA31_15 = input.LA(1);

                         
                        int index31_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA31_16 = input.LA(1);

                         
                        int index31_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA31_17 = input.LA(1);

                         
                        int index31_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred59_TinyHaxeTry1()) ) {s = 66;}

                         
                        input.seek(index31_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA31_18 = input.LA(1);

                         
                        int index31_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA31_19 = input.LA(1);

                         
                        int index31_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA31_20 = input.LA(1);

                         
                        int index31_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA31_21 = input.LA(1);

                         
                        int index31_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA31_22 = input.LA(1);

                         
                        int index31_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA31_23 = input.LA(1);

                         
                        int index31_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA31_24 = input.LA(1);

                         
                        int index31_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA31_25 = input.LA(1);

                         
                        int index31_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA31_26 = input.LA(1);

                         
                        int index31_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA31_27 = input.LA(1);

                         
                        int index31_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA31_28 = input.LA(1);

                         
                        int index31_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA31_29 = input.LA(1);

                         
                        int index31_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA31_30 = input.LA(1);

                         
                        int index31_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA31_31 = input.LA(1);

                         
                        int index31_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA31_32 = input.LA(1);

                         
                        int index31_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA31_33 = input.LA(1);

                         
                        int index31_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA31_34 = input.LA(1);

                         
                        int index31_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA31_35 = input.LA(1);

                         
                        int index31_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA31_36 = input.LA(1);

                         
                        int index31_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA31_37 = input.LA(1);

                         
                        int index31_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA31_38 = input.LA(1);

                         
                        int index31_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA31_39 = input.LA(1);

                         
                        int index31_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA31_40 = input.LA(1);

                         
                        int index31_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA31_41 = input.LA(1);

                         
                        int index31_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA31_42 = input.LA(1);

                         
                        int index31_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA31_43 = input.LA(1);

                         
                        int index31_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA31_44 = input.LA(1);

                         
                        int index31_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_44);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA31_45 = input.LA(1);

                         
                        int index31_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred58_TinyHaxeTry1()) ) {s = 64;}

                         
                        input.seek(index31_45);
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
        "\101\uffff";
    static final String DFA34_eofS =
        "\101\uffff";
    static final String DFA34_minS =
        "\1\20\6\0\72\uffff";
    static final String DFA34_maxS =
        "\1\147\6\0\72\uffff";
    static final String DFA34_acceptS =
        "\7\uffff\1\2\1\uffff\1\3\66\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\72\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\11\2\uffff\2\5\1\1\1\2\1\3\1\4\1\uffff\11\11\1\uffff\1\11"+
            "\7\uffff\2\11\1\uffff\2\11\1\uffff\1\11\1\uffff\5\11\1\uffff"+
            "\4\11\3\uffff\27\11\1\uffff\1\6\2\7\4\uffff\7\11",
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
            return "214:1: blockStmt : ( varDecl | classDecl | statement );";
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
                        if ( (synpred62_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_TinyHaxeTry1()) ) {s = 64;}

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
    static final String DFA53_eotS =
        "\64\uffff";
    static final String DFA53_eofS =
        "\1\20\63\uffff";
    static final String DFA53_minS =
        "\1\20\15\0\46\uffff";
    static final String DFA53_maxS =
        "\1\147\15\0\46\uffff";
    static final String DFA53_acceptS =
        "\16\uffff\1\3\1\4\1\5\41\uffff\1\1\1\2";
    static final String DFA53_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\46\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\20\1\15\10\uffff\10\20\1\1\1\14\1\20\1\2\2\20\5\uffff\2"+
            "\20\5\uffff\1\20\4\uffff\1\3\1\20\7\uffff\21\20\1\17\1\16\2"+
            "\uffff\1\4\11\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "302:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_1 = input.LA(1);

                         
                        int index53_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred99_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_2 = input.LA(1);

                         
                        int index53_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred99_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_3 = input.LA(1);

                         
                        int index53_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred99_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA53_4 = input.LA(1);

                         
                        int index53_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred99_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA53_5 = input.LA(1);

                         
                        int index53_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred99_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA53_6 = input.LA(1);

                         
                        int index53_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred99_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA53_7 = input.LA(1);

                         
                        int index53_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred99_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA53_8 = input.LA(1);

                         
                        int index53_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred99_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA53_9 = input.LA(1);

                         
                        int index53_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred99_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA53_10 = input.LA(1);

                         
                        int index53_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred99_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA53_11 = input.LA(1);

                         
                        int index53_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred99_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA53_12 = input.LA(1);

                         
                        int index53_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred99_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA53_13 = input.LA(1);

                         
                        int index53_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred99_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index53_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\64\uffff";
    static final String DFA55_eofS =
        "\1\16\63\uffff";
    static final String DFA55_minS =
        "\1\20\1\uffff\1\0\11\uffff\1\0\47\uffff";
    static final String DFA55_maxS =
        "\1\147\1\uffff\1\0\11\uffff\1\0\47\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\7\uffff\1\7\1\10\43\uffff\1\2"+
        "\1\6";
    static final String DFA55_specialS =
        "\2\uffff\1\0\11\uffff\1\1\47\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\16\1\15\10\uffff\10\16\1\1\1\14\1\16\1\2\2\16\5\uffff\2"+
            "\16\5\uffff\1\16\4\uffff\1\3\1\16\7\uffff\23\16\2\uffff\1\4"+
            "\11\uffff\7\5",
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
            return "310:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_2 = input.LA(1);

                         
                        int index55_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_TinyHaxeTry1()) ) {s = 50;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_12 = input.LA(1);

                         
                        int index55_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred107_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index55_12);
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
    static final String DFA54_eotS =
        "\77\uffff";
    static final String DFA54_eofS =
        "\77\uffff";
    static final String DFA54_minS =
        "\1\20\54\0\22\uffff";
    static final String DFA54_maxS =
        "\1\147\54\0\22\uffff";
    static final String DFA54_acceptS =
        "\55\uffff\1\1\1\2\20\uffff";
    static final String DFA54_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\22\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\56\1\20\2\uffff\6\56\1\uffff\1\45\1\47\1\50\1\51\1\52\1"+
            "\53\1\54\1\4\1\17\1\55\1\5\7\uffff\1\23\1\32\1\uffff\1\2\1\56"+
            "\1\uffff\1\56\1\uffff\4\56\1\6\1\uffff\4\56\3\uffff\1\46\1\44"+
            "\1\43\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31\1\33\1\27\1\22"+
            "\1\24\1\25\1\26\1\21\1\1\2\30\1\7\1\3\1\uffff\1\56\6\uffff\1"+
            "\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "315:22: ( expr | statement )";
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
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_3 = input.LA(1);

                         
                        int index54_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_4 = input.LA(1);

                         
                        int index54_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_5 = input.LA(1);

                         
                        int index54_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA54_6 = input.LA(1);

                         
                        int index54_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA54_7 = input.LA(1);

                         
                        int index54_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA54_8 = input.LA(1);

                         
                        int index54_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA54_9 = input.LA(1);

                         
                        int index54_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA54_10 = input.LA(1);

                         
                        int index54_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA54_11 = input.LA(1);

                         
                        int index54_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA54_12 = input.LA(1);

                         
                        int index54_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA54_13 = input.LA(1);

                         
                        int index54_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA54_14 = input.LA(1);

                         
                        int index54_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA54_15 = input.LA(1);

                         
                        int index54_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA54_16 = input.LA(1);

                         
                        int index54_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA54_17 = input.LA(1);

                         
                        int index54_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA54_18 = input.LA(1);

                         
                        int index54_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA54_19 = input.LA(1);

                         
                        int index54_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA54_20 = input.LA(1);

                         
                        int index54_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA54_21 = input.LA(1);

                         
                        int index54_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA54_22 = input.LA(1);

                         
                        int index54_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA54_23 = input.LA(1);

                         
                        int index54_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA54_24 = input.LA(1);

                         
                        int index54_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA54_25 = input.LA(1);

                         
                        int index54_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA54_26 = input.LA(1);

                         
                        int index54_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA54_27 = input.LA(1);

                         
                        int index54_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA54_28 = input.LA(1);

                         
                        int index54_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA54_29 = input.LA(1);

                         
                        int index54_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA54_30 = input.LA(1);

                         
                        int index54_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA54_31 = input.LA(1);

                         
                        int index54_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA54_32 = input.LA(1);

                         
                        int index54_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA54_33 = input.LA(1);

                         
                        int index54_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA54_34 = input.LA(1);

                         
                        int index54_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA54_35 = input.LA(1);

                         
                        int index54_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA54_36 = input.LA(1);

                         
                        int index54_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA54_37 = input.LA(1);

                         
                        int index54_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA54_38 = input.LA(1);

                         
                        int index54_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA54_39 = input.LA(1);

                         
                        int index54_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA54_40 = input.LA(1);

                         
                        int index54_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA54_41 = input.LA(1);

                         
                        int index54_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA54_42 = input.LA(1);

                         
                        int index54_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA54_43 = input.LA(1);

                         
                        int index54_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA54_44 = input.LA(1);

                         
                        int index54_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index54_44);
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
    static final String DFA67_eotS =
        "\11\uffff";
    static final String DFA67_eofS =
        "\11\uffff";
    static final String DFA67_minS =
        "\6\24\1\21\2\uffff";
    static final String DFA67_maxS =
        "\6\42\1\60\2\uffff";
    static final String DFA67_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA67_specialS =
        "\11\uffff}>";
    static final String[] DFA67_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\1\10\36\uffff\1\7",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "383:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA68_eotS =
        "\14\uffff";
    static final String DFA68_eofS =
        "\14\uffff";
    static final String DFA68_minS =
        "\6\24\2\21\4\uffff";
    static final String DFA68_maxS =
        "\6\42\2\60\4\uffff";
    static final String DFA68_acceptS =
        "\10\uffff\1\3\1\4\1\2\1\1";
    static final String DFA68_specialS =
        "\14\uffff}>";
    static final String[] DFA68_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\1\11\36\uffff\1\10",
            "\1\12\36\uffff\1\13",
            "",
            "",
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
            return "389:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );";
        }
    }
    static final String DFA71_eotS =
        "\11\uffff";
    static final String DFA71_eofS =
        "\11\uffff";
    static final String DFA71_minS =
        "\6\24\3\uffff";
    static final String DFA71_maxS =
        "\6\132\3\uffff";
    static final String DFA71_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA71_specialS =
        "\11\uffff}>";
    static final String[] DFA71_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\66\uffff\1\10\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

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
        public String getDescription() {
            return "409:1: classMember : ( varDecl | funcDecl | enumDecl );";
        }
    }
    static final String DFA72_eotS =
        "\11\uffff";
    static final String DFA72_eofS =
        "\1\10\10\uffff";
    static final String DFA72_minS =
        "\6\24\3\uffff";
    static final String DFA72_maxS =
        "\6\132\3\uffff";
    static final String DFA72_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA72_specialS =
        "\11\uffff}>";
    static final String[] DFA72_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\27\uffff\1\10\37\uffff\1"+
            "\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
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
            return "420:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );";
        }
    }
    static final String DFA92_eotS =
        "\77\uffff";
    static final String DFA92_eofS =
        "\77\uffff";
    static final String DFA92_minS =
        "\1\20\54\0\22\uffff";
    static final String DFA92_maxS =
        "\1\147\54\0\22\uffff";
    static final String DFA92_acceptS =
        "\55\uffff\1\1\1\2\20\uffff";
    static final String DFA92_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\22\uffff}>";
    static final String[] DFA92_transitionS = {
            "\1\56\1\20\2\uffff\6\56\1\uffff\1\45\1\47\1\50\1\51\1\52\1"+
            "\53\1\54\1\4\1\17\1\55\1\5\7\uffff\1\23\1\32\1\uffff\1\2\1\56"+
            "\1\uffff\1\56\1\uffff\4\56\1\6\1\uffff\4\56\3\uffff\1\46\1\44"+
            "\1\43\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31\1\33\1\27\1\22"+
            "\1\24\1\25\1\26\1\21\1\1\2\30\1\7\1\3\1\uffff\1\56\6\uffff\1"+
            "\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA92_eot = DFA.unpackEncodedString(DFA92_eotS);
    static final short[] DFA92_eof = DFA.unpackEncodedString(DFA92_eofS);
    static final char[] DFA92_min = DFA.unpackEncodedStringToUnsignedChars(DFA92_minS);
    static final char[] DFA92_max = DFA.unpackEncodedStringToUnsignedChars(DFA92_maxS);
    static final short[] DFA92_accept = DFA.unpackEncodedString(DFA92_acceptS);
    static final short[] DFA92_special = DFA.unpackEncodedString(DFA92_specialS);
    static final short[][] DFA92_transition;

    static {
        int numStates = DFA92_transitionS.length;
        DFA92_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA92_transition[i] = DFA.unpackEncodedString(DFA92_transitionS[i]);
        }
    }

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = DFA92_eot;
            this.eof = DFA92_eof;
            this.min = DFA92_min;
            this.max = DFA92_max;
            this.accept = DFA92_accept;
            this.special = DFA92_special;
            this.transition = DFA92_transition;
        }
        public String getDescription() {
            return "315:22: ( expr | statement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA92_1 = input.LA(1);

                         
                        int index92_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA92_2 = input.LA(1);

                         
                        int index92_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA92_3 = input.LA(1);

                         
                        int index92_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA92_4 = input.LA(1);

                         
                        int index92_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA92_5 = input.LA(1);

                         
                        int index92_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA92_6 = input.LA(1);

                         
                        int index92_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA92_7 = input.LA(1);

                         
                        int index92_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA92_8 = input.LA(1);

                         
                        int index92_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA92_9 = input.LA(1);

                         
                        int index92_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA92_10 = input.LA(1);

                         
                        int index92_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA92_11 = input.LA(1);

                         
                        int index92_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA92_12 = input.LA(1);

                         
                        int index92_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA92_13 = input.LA(1);

                         
                        int index92_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA92_14 = input.LA(1);

                         
                        int index92_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA92_15 = input.LA(1);

                         
                        int index92_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA92_16 = input.LA(1);

                         
                        int index92_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA92_17 = input.LA(1);

                         
                        int index92_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA92_18 = input.LA(1);

                         
                        int index92_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA92_19 = input.LA(1);

                         
                        int index92_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA92_20 = input.LA(1);

                         
                        int index92_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA92_21 = input.LA(1);

                         
                        int index92_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA92_22 = input.LA(1);

                         
                        int index92_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA92_23 = input.LA(1);

                         
                        int index92_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA92_24 = input.LA(1);

                         
                        int index92_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA92_25 = input.LA(1);

                         
                        int index92_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA92_26 = input.LA(1);

                         
                        int index92_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA92_27 = input.LA(1);

                         
                        int index92_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA92_28 = input.LA(1);

                         
                        int index92_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA92_29 = input.LA(1);

                         
                        int index92_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA92_30 = input.LA(1);

                         
                        int index92_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA92_31 = input.LA(1);

                         
                        int index92_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA92_32 = input.LA(1);

                         
                        int index92_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA92_33 = input.LA(1);

                         
                        int index92_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA92_34 = input.LA(1);

                         
                        int index92_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA92_35 = input.LA(1);

                         
                        int index92_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA92_36 = input.LA(1);

                         
                        int index92_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA92_37 = input.LA(1);

                         
                        int index92_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA92_38 = input.LA(1);

                         
                        int index92_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA92_39 = input.LA(1);

                         
                        int index92_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA92_40 = input.LA(1);

                         
                        int index92_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA92_41 = input.LA(1);

                         
                        int index92_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA92_42 = input.LA(1);

                         
                        int index92_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA92_43 = input.LA(1);

                         
                        int index92_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA92_44 = input.LA(1);

                         
                        int index92_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 45;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index92_44);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 92, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module135 = new BitSet(new long[]{0x0000000000080000L,0x000000013A000000L});
    public static final BitSet FOLLOW_topLevelList_in_module138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList174 = new BitSet(new long[]{0x0000000000080002L,0x000000013A000000L});
    public static final BitSet FOLLOW_myImport_in_topLevel193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage239 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage241 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_myPackage243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier272 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier285 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier289 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IMPORT_in_myImport331 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport334 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_myImport336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_access0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_declAttr423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList541 = new BitSet(new long[]{0x0000000003F00002L});
    public static final BitSet FOLLOW_param_in_paramList582 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList585 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_param_in_paramList587 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_QUES_in_param626 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param629 = new BitSet(new long[]{0x0000008010000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param631 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_varInit_in_param633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent683 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_DOT_in_dotIdent691 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_id_in_dotIdent695 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_EQ_in_assignOp719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit839 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit841 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcLit843 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit845 = new BitSet(new long[]{0x0200008000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit847 = new BitSet(new long[]{0x0200008000010000L});
    public static final BitSet FOLLOW_block_in_funcLit850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit885 = new BitSet(new long[]{0x0201206C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit888 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag909 = new BitSet(new long[]{0x02001F0001020000L});
    public static final BitSet FOLLOW_funcType_in_typeTag912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList950 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList953 = new BitSet(new long[]{0x02001F0001020000L});
    public static final BitSet FOLLOW_funcType_in_typeList956 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList964 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList967 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList970 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_type_in_funcType985 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType989 = new BitSet(new long[]{0x02001F0001020000L});
    public static final BitSet FOLLOW_type_in_funcType992 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_VOID_in_funcType999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_type1011 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_dotIdent_in_type1015 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_INT_in_type1018 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type1021 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_type1024 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_type1026 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_VOID_in_type1028 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_typeParam_in_type1032 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1050 = new BitSet(new long[]{0x0200DF0001020000L});
    public static final BitSet FOLLOW_type_in_typeParam1054 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_typeList_in_typeParam1056 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_GT_in_typeParam1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGT_in_typeParam1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1128 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1130 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1132 = new BitSet(new long[]{0x0200DF0001020000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1134 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_functionReturn1162 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionReturn1165 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_NEW_in_functionReturn1167 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_functionReturn1169 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_functionReturn1171 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_functionReturn1173 = new BitSet(new long[]{0x0200008000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_functionReturn1175 = new BitSet(new long[]{0x0200008000010000L});
    public static final BitSet FOLLOW_block_in_functionReturn1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_statement1219 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1232 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1234 = new BitSet(new long[]{0x7BEB20AC03F30000L,0x000000FE05F88000L});
    public static final BitSet FOLLOW_statement_in_statement1238 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1241 = new BitSet(new long[]{0x7BEB20AC03F30000L,0x000000FE05F88000L});
    public static final BitSet FOLLOW_statement_in_statement1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1285 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1287 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_statement1291 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IN_in_statement1293 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_statement1297 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1299 = new BitSet(new long[]{0x7BEB20AC03F30000L,0x000000FE05F88000L});
    public static final BitSet FOLLOW_statement_in_statement1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1329 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1331 = new BitSet(new long[]{0x7BEB20AC03F30000L,0x000000FE05F88000L});
    public static final BitSet FOLLOW_statement_in_statement1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1357 = new BitSet(new long[]{0x7BEB20AC03F30000L,0x000000FE05F88000L});
    public static final BitSet FOLLOW_statement_in_statement1359 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1361 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1363 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement1388 = new BitSet(new long[]{0x0200008000010000L});
    public static final BitSet FOLLOW_block_in_statement1390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmtList_in_statement1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement1416 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1418 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_statement1420 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1422 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_statement1424 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_caseStmt_in_statement1426 = new BitSet(new long[]{0x8400000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_statement1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1450 = new BitSet(new long[]{0x0201202C00030000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_statement1453 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1475 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_statement1477 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1498 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1501 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1522 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1525 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement1547 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1556 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_statement1558 = new BitSet(new long[]{0x7BEB20AC03F30000L,0x000000FE05F88000L});
    public static final BitSet FOLLOW_statement_in_statement1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1602 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_parExpression1605 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block1622 = new BitSet(new long[]{0x7FEB20AC03F30000L,0x000000FE1DF88000L});
    public static final BitSet FOLLOW_blockStmt_in_block1625 = new BitSet(new long[]{0x7FEB20AC03F30000L,0x000000FE1DF88000L});
    public static final BitSet FOLLOW_RBRACE_in_block1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt1710 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt1731 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt1744 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_exprList_in_caseStmt1746 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt1748 = new BitSet(new long[]{0x7BEB20AC03F30000L,0x000000FE05F88000L});
    public static final BitSet FOLLOW_statement_in_caseStmt1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt1768 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt1770 = new BitSet(new long[]{0x7BEB20AC03F30000L,0x000000FE05F88000L});
    public static final BitSet FOLLOW_statement_in_caseStmt1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt1801 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList1816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt1847 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt1849 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_param_in_catchStmt1851 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt1853 = new BitSet(new long[]{0x0200008000010000L});
    public static final BitSet FOLLOW_block_in_catchStmt1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList1901 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList1904 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_exprList1907 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr1940 = new BitSet(new long[]{0x00000003F0000002L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr1943 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr1946 = new BitSet(new long[]{0x00000003F0000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr1969 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr1972 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr1975 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr1977 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr1980 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr1992 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr1995 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr1998 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2027 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2031 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2034 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2055 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2059 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2062 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2076 = new BitSet(new long[]{0x0000600000000002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2081 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2085 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2090 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2095 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2100 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2105 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2110 = new BitSet(new long[]{0x0000600000000002L,0x00000000000001E0L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2124 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000E00L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2128 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000E00L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2135 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2138 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000E00L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2141 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2144 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000E00L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2158 = new BitSet(new long[]{0x0000400000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2162 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2166 = new BitSet(new long[]{0x0000400000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2171 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_GT_in_shiftExpr2173 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2178 = new BitSet(new long[]{0x0000400000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2182 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2185 = new BitSet(new long[]{0x0000400000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2199 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2204 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_SUB_in_addExpr2209 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2213 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2227 = new BitSet(new long[]{0x0000000000000002L,0x0000000000070000L});
    public static final BitSet FOLLOW_STAR_in_multExpr2232 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2235 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2238 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2242 = new BitSet(new long[]{0x0000000000000002L,0x0000000000070000L});
    public static final BitSet FOLLOW_set_in_prefixExpr2263 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2330 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_suffixExpr2332 = new BitSet(new long[]{0x0201203C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2334 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_suffixExpr2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2357 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2359 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_suffixExpr2361 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_suffixExpr2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2419 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_suffixExpr2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value2496 = new BitSet(new long[]{0x7BEB20AC03F30000L,0x000000FE05F88000L});
    public static final BitSet FOLLOW_expr_in_value2500 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_statement_in_value2502 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_value2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_value2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr2565 = new BitSet(new long[]{0x02001E0801020000L});
    public static final BitSet FOLLOW_type_in_newExpr2567 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr2569 = new BitSet(new long[]{0x0201203C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr2571 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast2599 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast2601 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_cast2603 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_COMMA_in_cast2606 = new BitSet(new long[]{0x02001F0001020000L});
    public static final BitSet FOLLOW_funcType_in_cast2608 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast2630 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast2632 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_cast2634 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl2700 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl2702 = new BitSet(new long[]{0x0200200000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl2704 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumDecl2706 = new BitSet(new long[]{0x0400000000020000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl2708 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumDecl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody2736 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl2755 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl2757 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl2759 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl2761 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl2789 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList2830 = new BitSet(new long[]{0x0000000003F00000L,0x0000000004000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl2844 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_VAR_in_varDecl2848 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl2850 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList2883 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList2886 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList2889 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart2903 = new BitSet(new long[]{0x0000008810000000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart2908 = new BitSet(new long[]{0x0000008010000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart2910 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclPart2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl2922 = new BitSet(new long[]{0x0000000001020000L,0x0000000000800001L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl2926 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl2928 = new BitSet(new long[]{0x0000000001020000L,0x0000000000800001L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl2932 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit3009 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_varInit3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3038 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3041 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl3043 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3045 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3047 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3049 = new BitSet(new long[]{0x0200008000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3051 = new BitSet(new long[]{0x0200008000010000L});
    public static final BitSet FOLLOW_block_in_funcDecl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3086 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3089 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3091 = new BitSet(new long[]{0x0000200800000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3093 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3095 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3097 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3099 = new BitSet(new long[]{0x0200008000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3101 = new BitSet(new long[]{0x0200008000010000L});
    public static final BitSet FOLLOW_block_in_funcDecl3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3145 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3147 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3149 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3151 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3153 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3155 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3157 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3186 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3188 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3190 = new BitSet(new long[]{0x0000200800000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3192 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3194 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3196 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3198 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3200 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3232 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3234 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3236 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3238 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3240 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3242 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3268 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3270 = new BitSet(new long[]{0x0000200800000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3272 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3274 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3276 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3278 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3280 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERN_in_classDecl3316 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl3319 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl3321 = new BitSet(new long[]{0x0200200000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl3323 = new BitSet(new long[]{0x0200200000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl3325 = new BitSet(new long[]{0x0200200000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope3365 = new BitSet(new long[]{0x0400000403F00000L,0x0000000006000000L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope3368 = new BitSet(new long[]{0x0400000403F00000L,0x0000000006000000L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classMember3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_classMember3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl3433 = new BitSet(new long[]{0x02001E0001020000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl3435 = new BitSet(new long[]{0x0200000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl3437 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl3439 = new BitSet(new long[]{0x0400000403F00000L,0x0000000004000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl3442 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody3457 = new BitSet(new long[]{0x0000000403F00000L,0x0000000004000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody3464 = new BitSet(new long[]{0x0000000403F00000L,0x0000000004000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList3488 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList3491 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList3494 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit3548 = new BitSet(new long[]{0x02001E0001020000L});
    public static final BitSet FOLLOW_type_in_inherit3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit3572 = new BitSet(new long[]{0x02001E0001020000L});
    public static final BitSet FOLLOW_type_in_inherit3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl3602 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl3604 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl3606 = new BitSet(new long[]{0x02001F0001020000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend3627 = new BitSet(new long[]{0x02001F0001020000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend3629 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType3642 = new BitSet(new long[]{0x0400400003F20000L,0x0000000004000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType3677 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType3705 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType3734 = new BitSet(new long[]{0x0400000003F20000L,0x0000000004000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType3762 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType3788 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList3846 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList3849 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList3852 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit3864 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit3867 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField3881 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField3883 = new BitSet(new long[]{0x02001F0001020000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList3902 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList3905 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList3908 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem3929 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem3931 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_objLitElem3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTagOpt_in_synpred20_TinyHaxeTry1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred22_TinyHaxeTry1953 = new BitSet(new long[]{0x02001F0001020000L});
    public static final BitSet FOLLOW_funcType_in_synpred22_TinyHaxeTry1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_synpred23_TinyHaxeTry1950 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred23_TinyHaxeTry1953 = new BitSet(new long[]{0x02001F0001020000L});
    public static final BitSet FOLLOW_funcType_in_synpred23_TinyHaxeTry1956 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred24_TinyHaxeTry1967 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_typeConstraint_in_synpred24_TinyHaxeTry1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred25_TinyHaxeTry1989 = new BitSet(new long[]{0x02001E0001020000L});
    public static final BitSet FOLLOW_type_in_synpred25_TinyHaxeTry1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred26_TinyHaxeTry1985 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred26_TinyHaxeTry1989 = new BitSet(new long[]{0x02001F0001020000L});
    public static final BitSet FOLLOW_type_in_synpred26_TinyHaxeTry1992 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred33_TinyHaxeTry11032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_synpred34_TinyHaxeTry11011 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_dotIdent_in_synpred34_TinyHaxeTry11015 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_INT_in_synpred34_TinyHaxeTry11018 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_FLOAT_in_synpred34_TinyHaxeTry11021 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_synpred34_TinyHaxeTry11024 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_synpred34_TinyHaxeTry11026 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_VOID_in_synpred34_TinyHaxeTry11028 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred34_TinyHaxeTry11032 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_type_in_synpred35_TinyHaxeTry11054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred36_TinyHaxeTry11060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGT_in_synpred37_TinyHaxeTry11063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred38_TinyHaxeTry11085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred40_TinyHaxeTry11214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred41_TinyHaxeTry11219 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_synpred41_TinyHaxeTry11221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred43_TinyHaxeTry11241 = new BitSet(new long[]{0x7BEB20AC03F30000L,0x000000FE05F88000L});
    public static final BitSet FOLLOW_statement_in_synpred43_TinyHaxeTry11245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred51_TinyHaxeTry11453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred58_TinyHaxeTry11547 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_synpred58_TinyHaxeTry11550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred59_TinyHaxeTry11556 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_synpred59_TinyHaxeTry11558 = new BitSet(new long[]{0x7BEB20AC03F30000L,0x000000FE05F88000L});
    public static final BitSet FOLLOW_statement_in_synpred59_TinyHaxeTry11560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred62_TinyHaxeTry11667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred66_TinyHaxeTry11881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred83_TinyHaxeTry12171 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_GT_in_synpred83_TinyHaxeTry12173 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_addExpr_in_synpred83_TinyHaxeTry12178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred94_TinyHaxeTry12263 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred94_TinyHaxeTry12275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred97_TinyHaxeTry12330 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred97_TinyHaxeTry12332 = new BitSet(new long[]{0x0201203C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_exprListOpt_in_synpred97_TinyHaxeTry12334 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred97_TinyHaxeTry12336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred98_TinyHaxeTry12357 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred98_TinyHaxeTry12359 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_synpred98_TinyHaxeTry12361 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred98_TinyHaxeTry12363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred99_TinyHaxeTry12368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred99_TinyHaxeTry12370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred100_TinyHaxeTry12394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred100_TinyHaxeTry12396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_synpred102_TinyHaxeTry12436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred106_TinyHaxeTry12500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred107_TinyHaxeTry12496 = new BitSet(new long[]{0x7BEB20AC03F30000L,0x000000FE05F88000L});
    public static final BitSet FOLLOW_expr_in_synpred107_TinyHaxeTry12500 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_statement_in_synpred107_TinyHaxeTry12502 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred107_TinyHaxeTry12505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred110_TinyHaxeTry12599 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred110_TinyHaxeTry12601 = new BitSet(new long[]{0x0201202C00020000L,0x000000FE01F88000L});
    public static final BitSet FOLLOW_expr_in_synpred110_TinyHaxeTry12603 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred110_TinyHaxeTry12606 = new BitSet(new long[]{0x02001F0001020000L});
    public static final BitSet FOLLOW_funcType_in_synpred110_TinyHaxeTry12608 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred110_TinyHaxeTry12612 = new BitSet(new long[]{0x0000000000000002L});

}