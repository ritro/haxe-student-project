// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g 2010-03-30 02:54:12

package main.main;

import main.tree.ExtendedCommonTree;

import main.tree.specific.ClassNode;
import main.tree.specific.DoWhileNode;
import main.tree.specific.ForNode;
import main.tree.specific.FunctionNode;
import main.tree.specific.IfNode;
import main.tree.specific.SwitchNode;
import main.tree.specific.TryNode;
import main.tree.specific.WhileNode;
import main.tree.specific.VarDeclaration;
import main.tree.specific.BlockScopeNode;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class TinyHaxeTry1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROPERTY_DECL", "MODULE", "SUFFIX_EXPR", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG", "TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "DECL_ATTR_LIST", "VAR_INIT", "PACKAGE", "SEMI", "IDENTIFIER", "DOT", "IMPORT", "PUBLIC", "PRIVATE", "STATIC", "INLINE", "DYNAMIC", "OVERRIDE", "COMMA", "QUES", "FUNCTION", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "PP_IF", "BANG", "PP_ELSEIF", "PP_ELSE", "PP_END", "PP_ERROR", "COLON", "MINUS_BIGGER", "VOID", "GT", "LT", "IF", "ELSE", "FOR", "IN", "WHILE", "DO", "TRY", "SWITCH", "LBRACE", "RBRACE", "RETURN", "THROW", "BREAK", "CONTINUE", "CASE", "DEFAULT", "CATCH", "ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ", "BAR", "AMP", "CARET", "LTLT", "GTGT", "GTGTGT", "PLUS", "SUB", "STAR", "SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "TILDE", "NULL", "NEW", "CAST", "ENUM", "VAR", "EQ", "EXTERN", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "TYPEDEF", "LONGLITERAL", "INTLITERAL", "STRINGLITERAL", "CHARLITERAL", "FLOATNUM", "TRUE", "FALSE", "WS", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "EscapeSequence", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CONST", "DOUBLE", "FINAL", "FINALLY", "FLOAT", "GOTO", "INSTANCEOF", "INT", "LONG", "NATIVE", "PROTECTED", "SHORT", "STRICTFP", "SUPER", "THIS", "THROWS", "TRANSIENT", "VOLATILE", "PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", "PERCENTEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "MONKEYS_AT", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "INTNUM", "EXPONENT", "COMMENT", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ", "'<<='", "'>>='", "'>>>='"
    };
    public static final int FUNCTION=27;
    public static final int PACKAGE=14;
    public static final int CAST=83;
    public static final int EXPONENT=148;
    public static final int LT=42;
    public static final int STAR=75;
    public static final int WHILE=47;
    public static final int FLOATNUM=97;
    public static final int CONST=111;
    public static final int OCTAL_ESC=152;
    public static final int CASE=57;
    public static final int CHAR=110;
    public static final int NEW=82;
    public static final int DO=48;
    public static final int EXTERN=87;
    public static final int EOF=-1;
    public static final int GTGT=71;
    public static final int BREAK=55;
    public static final int LBRACKET=30;
    public static final int FINAL=113;
    public static final int RPAREN=29;
    public static final int IMPORT=18;
    public static final int SUBSUB=78;
    public static final int STAREQ=131;
    public static final int CARET=69;
    public static final int THIS=125;
    public static final int RETURN=53;
    public static final int DOUBLE=112;
    public static final int MONKEYS_AT=143;
    public static final int BARBAR=61;
    public static final int VAR=85;
    public static final int VOID=40;
    public static final int SUPER=124;
    public static final int GOTO=116;
    public static final int EQ=86;
    public static final int COMMENT=149;
    public static final int T__154=154;
    public static final int AMPAMP=62;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int VAR_INIT=13;
    public static final int QUES=26;
    public static final int EQEQ=63;
    public static final int HexPrefix=103;
    public static final int PP_IF=32;
    public static final int PERCENTDBBQ=139;
    public static final int RBRACE=52;
    public static final int STATIC=21;
    public static final int PRIVATE=20;
    public static final int BLOCK_SCOPE=7;
    public static final int SWITCH=50;
    public static final int NULL=81;
    public static final int STRICTFP=123;
    public static final int ELSE=44;
    public static final int NATIVE=120;
    public static final int ELLIPSIS=60;
    public static final int THROWS=126;
    public static final int INT=118;
    public static final int SLASHEQ=132;
    public static final int INTLITERAL=94;
    public static final int PERCENTBB=145;
    public static final int TRY=49;
    public static final int LongSuffix=102;
    public static final int LONGLITERAL=93;
    public static final int PERCENTLL=144;
    public static final int BANGEQQ=142;
    public static final int WS=100;
    public static final int PERCENTDLQ=137;
    public static final int INHERIT_LIST_OPT=11;
    public static final int CHARLITERAL=96;
    public static final int GT=41;
    public static final int INLINE=22;
    public static final int CATCH=59;
    public static final int FALSE=99;
    public static final int EscapeSequence=106;
    public static final int THROW=54;
    public static final int DYNAMIC=23;
    public static final int PROTECTED=121;
    public static final int CLASS=88;
    public static final int PP_ELSEIF=34;
    public static final int BAREQ=134;
    public static final int PP_ELSE=35;
    public static final int IntegerNumber=101;
    public static final int AMP=68;
    public static final int PLUSPLUS=79;
    public static final int LBRACE=51;
    public static final int TYPE_PARAM_OPT=10;
    public static final int LTEQ=66;
    public static final int SUBEQ=130;
    public static final int GTGTGT=72;
    public static final int Exponent=105;
    public static final int FOR=45;
    public static final int SUFFIX_EXPR=6;
    public static final int SUB=74;
    public static final int FLOAT=115;
    public static final int ABSTRACT=107;
    public static final int MINUS_BIGGER=39;
    public static final int PERCENTDBQ=138;
    public static final int HexDigit=104;
    public static final int PLUSEQ=129;
    public static final int LPAREN=28;
    public static final int IF=43;
    public static final int INTNUM=147;
    public static final int ESC_SEQ=153;
    public static final int BOOLEAN=108;
    public static final int PP_END=36;
    public static final int SLASH=76;
    public static final int IN=46;
    public static final int IMPLEMENTS=91;
    public static final int CONTINUE=56;
    public static final int COMMA=25;
    public static final int AMPEQ=133;
    public static final int TRANSIENT=127;
    public static final int IDENTIFIER=16;
    public static final int TILDE=80;
    public static final int BANGEQ=64;
    public static final int PLUS=73;
    public static final int RBRACKET=31;
    public static final int DOT=17;
    public static final int LTLT=70;
    public static final int BYTE=109;
    public static final int PERCENT=77;
    public static final int VOLATILE=128;
    public static final int DECL_ATTR_LIST=12;
    public static final int TYPEDEF=92;
    public static final int UNICODE_ESC=151;
    public static final int EQEQEQ=140;
    public static final int DEFAULT=58;
    public static final int HEX_DIGIT=150;
    public static final int SHORT=122;
    public static final int BANG=33;
    public static final int INSTANCEOF=117;
    public static final int PP_ERROR=37;
    public static final int GTEQ=65;
    public static final int MODULE=5;
    public static final int TRUE=98;
    public static final int SEMI=15;
    public static final int COLON=38;
    public static final int PARAM_LIST=8;
    public static final int PERCENTLESQ=141;
    public static final int ENUM=84;
    public static final int PERCENTEQ=136;
    public static final int FINALLY=114;
    public static final int PROPERTY_DECL=4;
    public static final int OVERRIDE=24;
    public static final int STRINGLITERAL=95;
    public static final int CARETEQ=135;
    public static final int PERCENTBBB=146;
    public static final int INTERFACE=89;
    public static final int LONG=119;
    public static final int EXTENDS=90;
    public static final int PUBLIC=19;
    public static final int TYPE_TAG=9;
    public static final int BAR=67;

    // delegates
    // delegators


        public TinyHaxeTry1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TinyHaxeTry1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[242+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TinyHaxeTry1Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g"; }


    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:43:1: module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList ) ;
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
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:43:19: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList ) )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:43:21: ( myPackage )? topLevelList
            {
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:43:21: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module111);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_topLevelList_in_module114);
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
            // 43:45: -> ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList )
            {
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:43:47: ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(MODULE, "MODULE", true), root_1);

                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:43:91: ( myPackage )?
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

    public static class topLevelList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevelList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:46:1: topLevelList : ( topLevel )* ;
    public final TinyHaxeTry1Parser.topLevelList_return topLevelList() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelList_return retval = new TinyHaxeTry1Parser.topLevelList_return();
        retval.start = input.LT(1);
        int topLevelList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.topLevel_return topLevel3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:46:19: ( ( topLevel )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:46:22: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:46:22: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT||LA2_0==PP_IF||(LA2_0>=PP_ELSEIF && LA2_0<=PP_ERROR)||LA2_0==ENUM||(LA2_0>=EXTERN && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:46:23: topLevel
            	    {
            	    pushFollow(FOLLOW_topLevel_in_topLevelList150);
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
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:48:1: topLevel : ( myImport | pp | topLevelDecl );
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
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:48:19: ( myImport | pp | topLevelDecl )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:48:21: myImport
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_myImport_in_topLevel169);
                    myImport4=myImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, myImport4.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:49:25: pp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_topLevel195);
                    pp5=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp5.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:50:25: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topLevelDecl_in_topLevel221);
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

    public static class myPackage_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "myPackage"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:52:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) ;
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
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:52:21: ( PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:52:23: PACKAGE dotIdent SEMI
            {
            PACKAGE7=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage240); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE.add(PACKAGE7);

            pushFollow(FOLLOW_dotIdent_in_myPackage242);
            dotIdent8=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent8.getTree());
            SEMI9=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage244); if (state.failed) return retval; 
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
            // 52:45: -> ^( PACKAGE dotIdent )
            {
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:52:48: ^( PACKAGE dotIdent )
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

    public static class qualifiedIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedIdentifier"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:55:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
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
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:56:5: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:56:9: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:56:9: (a= IDENTIFIER -> $a)
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:56:12: a= IDENTIFIER
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier275); if (state.failed) return retval; 
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
            // 56:27: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:56:37: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DOT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:56:41: DOT ident= IDENTIFIER
            	    {
            	    DOT10=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier291); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT10);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier295); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(ident);



            	    // AST REWRITE
            	    // elements: qualifiedIdentifier, DOT, ident
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
            	    // 56:63: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:56:67: ^( DOT $qualifiedIdentifier $ident)
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
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:59:1: myImport : IMPORT dotIdent SEMI ;
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
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:59:21: ( IMPORT dotIdent SEMI )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:59:23: IMPORT dotIdent SEMI
            {
            root_0 = (Object)adaptor.nil();

            IMPORT11=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_myImport337); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPORT11_tree = (Object)adaptor.create(IMPORT11);
            root_0 = (Object)adaptor.becomeRoot(IMPORT11_tree, root_0);
            }
            pushFollow(FOLLOW_dotIdent_in_myImport340);
            dotIdent12=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent12.getTree());
            SEMI13=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport342); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:63:1: access : ( PUBLIC | PRIVATE );
    public final TinyHaxeTry1Parser.access_return access() throws RecognitionException {
        TinyHaxeTry1Parser.access_return retval = new TinyHaxeTry1Parser.access_return();
        retval.start = input.LT(1);
        int access_StartIndex = input.index();
        Object root_0 = null;

        Token set14=null;

        Object set14_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:63:19: ( PUBLIC | PRIVATE )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:
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

    public static class declAttr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declAttr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:66:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
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
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:66:19: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:66:21: STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    STATIC15=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC15_tree = (Object)adaptor.create(STATIC15);
                    adaptor.addChild(root_0, STATIC15_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:67:24: INLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    INLINE16=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr454); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE16_tree = (Object)adaptor.create(INLINE16);
                    adaptor.addChild(root_0, INLINE16_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:68:25: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    DYNAMIC17=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC17_tree = (Object)adaptor.create(DYNAMIC17);
                    adaptor.addChild(root_0, DYNAMIC17_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:69:25: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    OVERRIDE18=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr506); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE18_tree = (Object)adaptor.create(OVERRIDE18);
                    adaptor.addChild(root_0, OVERRIDE18_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:70:25: access
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_access_in_declAttr532);
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

    public static class declAttrList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declAttrList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:72:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ ) ;
    public final TinyHaxeTry1Parser.declAttrList_return declAttrList() throws RecognitionException {
        TinyHaxeTry1Parser.declAttrList_return retval = new TinyHaxeTry1Parser.declAttrList_return();
        retval.start = input.LT(1);
        int declAttrList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.declAttr_return declAttr20 = null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:72:19: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ ) )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:72:21: ( declAttr )+
            {
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:72:21: ( declAttr )+
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
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:72:22: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList547);
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
            // 72:33: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ )
            {
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:72:36: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ )
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
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:75:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ ) | );
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
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:75:19: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ ) | )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:75:21: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList588);
                    param21=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param21.getTree());
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:75:27: ( COMMA param )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:75:28: COMMA param
                    	    {
                    	    COMMA22=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList591); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA22);

                    	    pushFollow(FOLLOW_param_in_paramList593);
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
                    // 75:42: -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:75:45: ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:77:2: 
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
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:78:1: param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER,true] IDENTIFIER typeTagOpt ( varInit )? ( QUES )? ) ;
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
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:78:19: ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER,true] IDENTIFIER typeTagOpt ( varInit )? ( QUES )? ) )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:78:20: ( QUES )? IDENTIFIER typeTagOpt varInit
            {
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:78:20: ( QUES )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==QUES) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0: QUES
                    {
                    QUES24=(Token)match(input,QUES,FOLLOW_QUES_in_param632); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES24);


                    }
                    break;

            }

            IDENTIFIER25=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param635); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER25);

            pushFollow(FOLLOW_typeTagOpt_in_param637);
            typeTagOpt26=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt26.getTree());
            pushFollow(FOLLOW_varInit_in_param639);
            varInit27=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varInit.add(varInit27.getTree());


            // AST REWRITE
            // elements: varInit, IDENTIFIER, QUES, typeTagOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 78:56: -> ^( VAR[$IDENTIFIER,true] IDENTIFIER typeTagOpt ( varInit )? ( QUES )? )
            {
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:78:59: ^( VAR[$IDENTIFIER,true] IDENTIFIER typeTagOpt ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, IDENTIFIER25, true), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:78:121: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:78:130: ( QUES )?
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

    public static class dotIdent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotIdent"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:80:1: dotIdent : ( IDENTIFIER -> IDENTIFIER ) ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )* ;
    public final TinyHaxeTry1Parser.dotIdent_return dotIdent() throws RecognitionException {
        TinyHaxeTry1Parser.dotIdent_return retval = new TinyHaxeTry1Parser.dotIdent_return();
        retval.start = input.LT(1);
        int dotIdent_StartIndex = input.index();
        Object root_0 = null;

        Token ident=null;
        Token IDENTIFIER28=null;
        Token DOT29=null;

        Object ident_tree=null;
        Object IDENTIFIER28_tree=null;
        Object DOT29_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:80:19: ( ( IDENTIFIER -> IDENTIFIER ) ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:80:21: ( IDENTIFIER -> IDENTIFIER ) ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )*
            {
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:80:21: ( IDENTIFIER -> IDENTIFIER )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:80:22: IDENTIFIER
            {
            IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dotIdent678); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER28);



            // AST REWRITE
            // elements: IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 80:33: -> IDENTIFIER
            {
                adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

            }

            retval.tree = root_0;}
            }

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:80:48: ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DOT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:80:49: DOT ident= IDENTIFIER
            	    {
            	    DOT29=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent686); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT29);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dotIdent690); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(ident);



            	    // AST REWRITE
            	    // elements: ident, dotIdent, DOT
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
            	    // 80:70: -> ^( DOT $dotIdent $ident)
            	    {
            	        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:80:72: ^( DOT $dotIdent $ident)
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
            if ( state.backtracking>0 ) { memoize(input, 12, dotIdent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dotIdent"

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:82:1: assignOp : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '>>>=' );
    public final TinyHaxeTry1Parser.assignOp_return assignOp() throws RecognitionException {
        TinyHaxeTry1Parser.assignOp_return retval = new TinyHaxeTry1Parser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token set30=null;

        Object set30_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:82:19: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '>>>=' )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set30=(Token)input.LT(1);
            if ( input.LA(1)==EQ||(input.LA(1)>=PLUSEQ && input.LA(1)<=PERCENTEQ)||(input.LA(1)>=154 && input.LA(1)<=156) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set30));
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
            if ( state.backtracking>0 ) { memoize(input, 13, assignOp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignOp"

    public static class funcLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcLit"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:95:1: funcLit : FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION paramList typeTagOpt block ) ;
    public final TinyHaxeTry1Parser.funcLit_return funcLit() throws RecognitionException {
        TinyHaxeTry1Parser.funcLit_return retval = new TinyHaxeTry1Parser.funcLit_return();
        retval.start = input.LT(1);
        int funcLit_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION31=null;
        Token LPAREN32=null;
        Token RPAREN34=null;
        TinyHaxeTry1Parser.paramList_return paramList33 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt35 = null;

        TinyHaxeTry1Parser.block_return block36 = null;


        Object FUNCTION31_tree=null;
        Object LPAREN32_tree=null;
        Object RPAREN34_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:95:19: ( FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION paramList typeTagOpt block ) )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:95:21: FUNCTION LPAREN paramList RPAREN typeTagOpt block
            {
            FUNCTION31=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit1026); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION31);

            LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit1028); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN32);

            pushFollow(FOLLOW_paramList_in_funcLit1030);
            paramList33=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList33.getTree());
            RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit1032); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN34);

            pushFollow(FOLLOW_typeTagOpt_in_funcLit1034);
            typeTagOpt35=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt35.getTree());
            pushFollow(FOLLOW_block_in_funcLit1036);
            block36=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block36.getTree());


            // AST REWRITE
            // elements: FUNCTION, block, typeTagOpt, paramList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 95:71: -> ^( FUNCTION paramList typeTagOpt block )
            {
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:95:74: ^( FUNCTION paramList typeTagOpt block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                adaptor.addChild(root_1, stream_paramList.nextTree());
                adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
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
            if ( state.backtracking>0 ) { memoize(input, 14, funcLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcLit"

    public static class arrayLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLit"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:97:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
    public final TinyHaxeTry1Parser.arrayLit_return arrayLit() throws RecognitionException {
        TinyHaxeTry1Parser.arrayLit_return retval = new TinyHaxeTry1Parser.arrayLit_return();
        retval.start = input.LT(1);
        int arrayLit_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACKET37=null;
        Token RBRACKET39=null;
        TinyHaxeTry1Parser.exprListOpt_return exprListOpt38 = null;


        Object LBRACKET37_tree=null;
        Object RBRACKET39_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:97:18: ( LBRACKET exprListOpt RBRACKET )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:97:20: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            LBRACKET37=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit1068); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit1071);
            exprListOpt38=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt38.getTree());
            RBRACKET39=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit1073); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, arrayLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayLit"

    public static class pp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pp"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:104:1: pp : ( ppIf | ppElseIf | ppElse | ppEnd | ppError );
    public final TinyHaxeTry1Parser.pp_return pp() throws RecognitionException {
        TinyHaxeTry1Parser.pp_return retval = new TinyHaxeTry1Parser.pp_return();
        retval.start = input.LT(1);
        int pp_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.ppIf_return ppIf40 = null;

        TinyHaxeTry1Parser.ppElseIf_return ppElseIf41 = null;

        TinyHaxeTry1Parser.ppElse_return ppElse42 = null;

        TinyHaxeTry1Parser.ppEnd_return ppEnd43 = null;

        TinyHaxeTry1Parser.ppError_return ppError44 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:104:19: ( ppIf | ppElseIf | ppElse | ppEnd | ppError )
            int alt11=5;
            switch ( input.LA(1) ) {
            case PP_IF:
                {
                alt11=1;
                }
                break;
            case PP_ELSEIF:
                {
                alt11=2;
                }
                break;
            case PP_ELSE:
                {
                alt11=3;
                }
                break;
            case PP_END:
                {
                alt11=4;
                }
                break;
            case PP_ERROR:
                {
                alt11=5;
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:104:21: ppIf
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppIf_in_pp1101);
                    ppIf40=ppIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppIf40.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:105:25: ppElseIf
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppElseIf_in_pp1127);
                    ppElseIf41=ppElseIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppElseIf41.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:106:25: ppElse
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppElse_in_pp1153);
                    ppElse42=ppElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppElse42.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:107:25: ppEnd
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppEnd_in_pp1179);
                    ppEnd43=ppEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppEnd43.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:108:25: ppError
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppError_in_pp1205);
                    ppError44=ppError();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppError44.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 16, pp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "pp"

    public static class ppIf_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppIf"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:110:1: ppIf : ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER );
    public final TinyHaxeTry1Parser.ppIf_return ppIf() throws RecognitionException {
        TinyHaxeTry1Parser.ppIf_return retval = new TinyHaxeTry1Parser.ppIf_return();
        retval.start = input.LT(1);
        int ppIf_StartIndex = input.index();
        Object root_0 = null;

        Token PP_IF45=null;
        Token IDENTIFIER46=null;
        Token PP_IF47=null;
        Token BANG48=null;
        Token IDENTIFIER49=null;

        Object PP_IF45_tree=null;
        Object IDENTIFIER46_tree=null;
        Object PP_IF47_tree=null;
        Object BANG48_tree=null;
        Object IDENTIFIER49_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:110:19: ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==PP_IF) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==IDENTIFIER) ) {
                    alt12=1;
                }
                else if ( (LA12_1==BANG) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:110:21: PP_IF IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_IF45=(Token)match(input,PP_IF,FOLLOW_PP_IF_in_ppIf1227); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_IF45_tree = (Object)adaptor.create(PP_IF45);
                    adaptor.addChild(root_0, PP_IF45_tree);
                    }
                    IDENTIFIER46=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1229); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER46_tree = (Object)adaptor.create(IDENTIFIER46);
                    adaptor.addChild(root_0, IDENTIFIER46_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:111:25: PP_IF BANG IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_IF47=(Token)match(input,PP_IF,FOLLOW_PP_IF_in_ppIf1255); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_IF47_tree = (Object)adaptor.create(PP_IF47);
                    adaptor.addChild(root_0, PP_IF47_tree);
                    }
                    BANG48=(Token)match(input,BANG,FOLLOW_BANG_in_ppIf1257); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANG48_tree = (Object)adaptor.create(BANG48);
                    adaptor.addChild(root_0, BANG48_tree);
                    }
                    IDENTIFIER49=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1259); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER49_tree = (Object)adaptor.create(IDENTIFIER49);
                    adaptor.addChild(root_0, IDENTIFIER49_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 17, ppIf_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ppIf"

    public static class ppElseIf_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppElseIf"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:113:1: ppElseIf : ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER );
    public final TinyHaxeTry1Parser.ppElseIf_return ppElseIf() throws RecognitionException {
        TinyHaxeTry1Parser.ppElseIf_return retval = new TinyHaxeTry1Parser.ppElseIf_return();
        retval.start = input.LT(1);
        int ppElseIf_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ELSEIF50=null;
        Token IDENTIFIER51=null;
        Token PP_ELSEIF52=null;
        Token BANG53=null;
        Token IDENTIFIER54=null;

        Object PP_ELSEIF50_tree=null;
        Object IDENTIFIER51_tree=null;
        Object PP_ELSEIF52_tree=null;
        Object BANG53_tree=null;
        Object IDENTIFIER54_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:113:19: ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==PP_ELSEIF) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==IDENTIFIER) ) {
                    alt13=1;
                }
                else if ( (LA13_1==BANG) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:113:21: PP_ELSEIF IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_ELSEIF50=(Token)match(input,PP_ELSEIF,FOLLOW_PP_ELSEIF_in_ppElseIf1277); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_ELSEIF50_tree = (Object)adaptor.create(PP_ELSEIF50);
                    adaptor.addChild(root_0, PP_ELSEIF50_tree);
                    }
                    IDENTIFIER51=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1279); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER51_tree = (Object)adaptor.create(IDENTIFIER51);
                    adaptor.addChild(root_0, IDENTIFIER51_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:114:24: PP_ELSEIF BANG IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_ELSEIF52=(Token)match(input,PP_ELSEIF,FOLLOW_PP_ELSEIF_in_ppElseIf1304); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_ELSEIF52_tree = (Object)adaptor.create(PP_ELSEIF52);
                    adaptor.addChild(root_0, PP_ELSEIF52_tree);
                    }
                    BANG53=(Token)match(input,BANG,FOLLOW_BANG_in_ppElseIf1306); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANG53_tree = (Object)adaptor.create(BANG53);
                    adaptor.addChild(root_0, BANG53_tree);
                    }
                    IDENTIFIER54=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1308); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER54_tree = (Object)adaptor.create(IDENTIFIER54);
                    adaptor.addChild(root_0, IDENTIFIER54_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 18, ppElseIf_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ppElseIf"

    public static class ppElse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppElse"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:116:1: ppElse : PP_ELSE ;
    public final TinyHaxeTry1Parser.ppElse_return ppElse() throws RecognitionException {
        TinyHaxeTry1Parser.ppElse_return retval = new TinyHaxeTry1Parser.ppElse_return();
        retval.start = input.LT(1);
        int ppElse_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ELSE55=null;

        Object PP_ELSE55_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:116:19: ( PP_ELSE )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:116:21: PP_ELSE
            {
            root_0 = (Object)adaptor.nil();

            PP_ELSE55=(Token)match(input,PP_ELSE,FOLLOW_PP_ELSE_in_ppElse1328); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PP_ELSE55_tree = (Object)adaptor.create(PP_ELSE55);
            adaptor.addChild(root_0, PP_ELSE55_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 19, ppElse_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ppElse"

    public static class ppEnd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppEnd"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:118:1: ppEnd : PP_END ;
    public final TinyHaxeTry1Parser.ppEnd_return ppEnd() throws RecognitionException {
        TinyHaxeTry1Parser.ppEnd_return retval = new TinyHaxeTry1Parser.ppEnd_return();
        retval.start = input.LT(1);
        int ppEnd_StartIndex = input.index();
        Object root_0 = null;

        Token PP_END56=null;

        Object PP_END56_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:118:19: ( PP_END )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:118:21: PP_END
            {
            root_0 = (Object)adaptor.nil();

            PP_END56=(Token)match(input,PP_END,FOLLOW_PP_END_in_ppEnd1349); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PP_END56_tree = (Object)adaptor.create(PP_END56);
            adaptor.addChild(root_0, PP_END56_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 20, ppEnd_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ppEnd"

    public static class ppError_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppError"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:120:1: ppError : PP_ERROR ;
    public final TinyHaxeTry1Parser.ppError_return ppError() throws RecognitionException {
        TinyHaxeTry1Parser.ppError_return retval = new TinyHaxeTry1Parser.ppError_return();
        retval.start = input.LT(1);
        int ppError_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ERROR57=null;

        Object PP_ERROR57_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:120:19: ( PP_ERROR )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:120:21: PP_ERROR
            {
            root_0 = (Object)adaptor.nil();

            PP_ERROR57=(Token)match(input,PP_ERROR,FOLLOW_PP_ERROR_in_ppError1368); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PP_ERROR57_tree = (Object)adaptor.create(PP_ERROR57);
            adaptor.addChild(root_0, PP_ERROR57_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 21, ppError_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ppError"

    public static class typeTag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeTag"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:125:1: typeTag : COLON funcType ;
    public final TinyHaxeTry1Parser.typeTag_return typeTag() throws RecognitionException {
        TinyHaxeTry1Parser.typeTag_return retval = new TinyHaxeTry1Parser.typeTag_return();
        retval.start = input.LT(1);
        int typeTag_StartIndex = input.index();
        Object root_0 = null;

        Token COLON58=null;
        TinyHaxeTry1Parser.funcType_return funcType59 = null;


        Object COLON58_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:125:19: ( COLON funcType )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:125:21: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            COLON58=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1391); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_typeTag1394);
            funcType59=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType59.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, typeTag_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeTag"

    public static class typeTagOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeTagOpt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:127:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag ) | );
    public final TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeTagOpt_return retval = new TinyHaxeTry1Parser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeTag_return typeTag60 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:127:19: ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag ) | )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLON) ) {
                alt14=1;
            }
            else if ( (LA14_0==EOF||LA14_0==SEMI||LA14_0==COMMA||LA14_0==RPAREN||LA14_0==LBRACE||LA14_0==EQ) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:127:21: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt1410);
                    typeTag60=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag60.getTree());


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
                    // 127:29: -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:127:32: ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:129:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 23, typeTagOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeTagOpt"

    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:130:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );
    public final TinyHaxeTry1Parser.typeList_return typeList() throws RecognitionException {
        TinyHaxeTry1Parser.typeList_return retval = new TinyHaxeTry1Parser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA62=null;
        Token COMMA65=null;
        TinyHaxeTry1Parser.funcType_return funcType61 = null;

        TinyHaxeTry1Parser.funcType_return funcType63 = null;

        TinyHaxeTry1Parser.typeConstraint_return typeConstraint64 = null;

        TinyHaxeTry1Parser.typeConstraint_return typeConstraint66 = null;


        Object COMMA62_tree=null;
        Object COMMA65_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:130:19: ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==VOID||LA17_0==LBRACE) ) {
                alt17=1;
            }
            else if ( (LA17_0==IDENTIFIER) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==COLON) ) {
                    alt17=2;
                }
                else if ( (LA17_2==DOT||LA17_2==COMMA||LA17_2==RPAREN||LA17_2==MINUS_BIGGER||(LA17_2>=GT && LA17_2<=LT)) ) {
                    alt17=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:130:21: funcType ( COMMA funcType )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_typeList1462);
                    funcType61=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType61.getTree());
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:130:30: ( COMMA funcType )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:130:31: COMMA funcType
                    	    {
                    	    COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1465); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_funcType_in_typeList1468);
                    	    funcType63=funcType();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType63.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:131:25: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeConstraint_in_typeList1496);
                    typeConstraint64=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint64.getTree());
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:131:40: ( COMMA typeConstraint )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:131:41: COMMA typeConstraint
                    	    {
                    	    COMMA65=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1499); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList1502);
                    	    typeConstraint66=typeConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint66.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
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
            if ( state.backtracking>0 ) { memoize(input, 24, typeList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeList"

    public static class funcType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcType"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:134:1: funcType : ( ( type ) ( MINUS_BIGGER type )* | VOID );
    public final TinyHaxeTry1Parser.funcType_return funcType() throws RecognitionException {
        TinyHaxeTry1Parser.funcType_return retval = new TinyHaxeTry1Parser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token MINUS_BIGGER68=null;
        Token VOID70=null;
        TinyHaxeTry1Parser.type_return type67 = null;

        TinyHaxeTry1Parser.type_return type69 = null;


        Object MINUS_BIGGER68_tree=null;
        Object VOID70_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:134:19: ( ( type ) ( MINUS_BIGGER type )* | VOID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENTIFIER||LA19_0==LBRACE) ) {
                alt19=1;
            }
            else if ( (LA19_0==VOID) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:134:21: ( type ) ( MINUS_BIGGER type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:134:21: ( type )
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:134:22: type
                    {
                    pushFollow(FOLLOW_type_in_funcType1542);
                    type67=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type67.getTree());

                    }

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:134:28: ( MINUS_BIGGER type )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==MINUS_BIGGER) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:134:29: MINUS_BIGGER type
                    	    {
                    	    MINUS_BIGGER68=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1546); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_type_in_funcType1549);
                    	    type69=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type69.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:135:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID70=(Token)match(input,VOID,FOLLOW_VOID_in_funcType1556); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID70_tree = (Object)adaptor.create(VOID70);
                    adaptor.addChild(root_0, VOID70_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 25, funcType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:137:1: type : ( anonType | dotIdent ) ( typeParam )* ;
    public final TinyHaxeTry1Parser.type_return type() throws RecognitionException {
        TinyHaxeTry1Parser.type_return retval = new TinyHaxeTry1Parser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.anonType_return anonType71 = null;

        TinyHaxeTry1Parser.dotIdent_return dotIdent72 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam73 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:137:19: ( ( anonType | dotIdent ) ( typeParam )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:137:21: ( anonType | dotIdent ) ( typeParam )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:137:21: ( anonType | dotIdent )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LBRACE) ) {
                alt20=1;
            }
            else if ( (LA20_0==IDENTIFIER) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:137:22: anonType
                    {
                    pushFollow(FOLLOW_anonType_in_type1579);
                    anonType71=anonType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonType71.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:137:33: dotIdent
                    {
                    pushFollow(FOLLOW_dotIdent_in_type1583);
                    dotIdent72=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent72.getTree());

                    }
                    break;

            }

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:137:43: ( typeParam )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==GT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:137:44: typeParam
            	    {
            	    pushFollow(FOLLOW_typeParam_in_type1587);
            	    typeParam73=typeParam();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam73.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
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
            if ( state.backtracking>0 ) { memoize(input, 26, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class typeParam_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeParam"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:139:1: typeParam : GT typeList LT ;
    public final TinyHaxeTry1Parser.typeParam_return typeParam() throws RecognitionException {
        TinyHaxeTry1Parser.typeParam_return retval = new TinyHaxeTry1Parser.typeParam_return();
        retval.start = input.LT(1);
        int typeParam_StartIndex = input.index();
        Object root_0 = null;

        Token GT74=null;
        Token LT76=null;
        TinyHaxeTry1Parser.typeList_return typeList75 = null;


        Object GT74_tree=null;
        Object LT76_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:139:19: ( GT typeList LT )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:139:21: GT typeList LT
            {
            root_0 = (Object)adaptor.nil();

            GT74=(Token)match(input,GT,FOLLOW_GT_in_typeParam1606); if (state.failed) return retval;
            pushFollow(FOLLOW_typeList_in_typeParam1609);
            typeList75=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList75.getTree());
            LT76=(Token)match(input,LT,FOLLOW_LT_in_typeParam1611); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, typeParam_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeParam"

    public static class typeParamOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeParamOpt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:141:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam ) | );
    public final TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeParamOpt_return retval = new TinyHaxeTry1Parser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam77 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:141:19: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam ) | )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:141:21: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1626);
                    typeParam77=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam77.getTree());


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
                    // 141:30: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:141:32: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:143:8: 
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
            if ( state.backtracking>0 ) { memoize(input, 28, typeParamOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeParamOpt"

    public static class typeConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeConstraint"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:144:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint IDENTIFIER typeList ) ;
    public final TinyHaxeTry1Parser.typeConstraint_return typeConstraint() throws RecognitionException {
        TinyHaxeTry1Parser.typeConstraint_return retval = new TinyHaxeTry1Parser.typeConstraint_return();
        retval.start = input.LT(1);
        int typeConstraint_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER78=null;
        Token COLON79=null;
        Token LPAREN80=null;
        Token RPAREN82=null;
        TinyHaxeTry1Parser.typeList_return typeList81 = null;


        Object IDENTIFIER78_tree=null;
        Object COLON79_tree=null;
        Object LPAREN80_tree=null;
        Object RPAREN82_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:144:19: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint IDENTIFIER typeList ) )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:144:21: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER78=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1658); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER78);

            COLON79=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1660); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON79);

            LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1662); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN80);

            pushFollow(FOLLOW_typeList_in_typeConstraint1664);
            typeList81=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList81.getTree());
            RPAREN82=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1666); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN82);



            // AST REWRITE
            // elements: typeConstraint, IDENTIFIER, typeList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 144:61: -> ^( $typeConstraint IDENTIFIER typeList )
            {
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:144:64: ^( $typeConstraint IDENTIFIER typeList )
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
            if ( state.backtracking>0 ) { memoize(input, 29, typeConstraint_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeConstraint"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:147:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO parExpression statement ) | TRY block catchStmtList -> ^( TRY block catchStmtList ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH expr ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI );
    public final TinyHaxeTry1Parser.statement_return statement() throws RecognitionException {
        TinyHaxeTry1Parser.statement_return retval = new TinyHaxeTry1Parser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Token SEMI85=null;
        Token IF87=null;
        Token ELSE89=null;
        Token FOR90=null;
        Token LPAREN91=null;
        Token IN92=null;
        Token RPAREN93=null;
        Token WHILE95=null;
        Token DO98=null;
        Token WHILE100=null;
        Token SEMI102=null;
        Token TRY103=null;
        Token SWITCH106=null;
        Token LPAREN107=null;
        Token RPAREN109=null;
        Token LBRACE110=null;
        Token RBRACE112=null;
        Token RETURN113=null;
        Token SEMI115=null;
        Token THROW116=null;
        Token SEMI118=null;
        Token BREAK119=null;
        Token IDENTIFIER120=null;
        Token SEMI121=null;
        Token CONTINUE122=null;
        Token IDENTIFIER123=null;
        Token SEMI124=null;
        Token SEMI126=null;
        Token IDENTIFIER127=null;
        Token COLON128=null;
        Token SEMI130=null;
        TinyHaxeTry1Parser.statement_return st1 = null;

        TinyHaxeTry1Parser.statement_return st2 = null;

        TinyHaxeTry1Parser.expr_return exp1 = null;

        TinyHaxeTry1Parser.expr_return exp2 = null;

        TinyHaxeTry1Parser.block_return block83 = null;

        TinyHaxeTry1Parser.assignExpr_return assignExpr84 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl86 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression88 = null;

        TinyHaxeTry1Parser.statement_return statement94 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression96 = null;

        TinyHaxeTry1Parser.statement_return statement97 = null;

        TinyHaxeTry1Parser.statement_return statement99 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression101 = null;

        TinyHaxeTry1Parser.block_return block104 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList105 = null;

        TinyHaxeTry1Parser.expr_return expr108 = null;

        TinyHaxeTry1Parser.caseStmt_return caseStmt111 = null;

        TinyHaxeTry1Parser.expr_return expr114 = null;

        TinyHaxeTry1Parser.expr_return expr117 = null;

        TinyHaxeTry1Parser.expr_return expr125 = null;

        TinyHaxeTry1Parser.statement_return statement129 = null;


        Object SEMI85_tree=null;
        Object IF87_tree=null;
        Object ELSE89_tree=null;
        Object FOR90_tree=null;
        Object LPAREN91_tree=null;
        Object IN92_tree=null;
        Object RPAREN93_tree=null;
        Object WHILE95_tree=null;
        Object DO98_tree=null;
        Object WHILE100_tree=null;
        Object SEMI102_tree=null;
        Object TRY103_tree=null;
        Object SWITCH106_tree=null;
        Object LPAREN107_tree=null;
        Object RPAREN109_tree=null;
        Object LBRACE110_tree=null;
        Object RBRACE112_tree=null;
        Object RETURN113_tree=null;
        Object SEMI115_tree=null;
        Object THROW116_tree=null;
        Object SEMI118_tree=null;
        Object BREAK119_tree=null;
        Object IDENTIFIER120_tree=null;
        Object SEMI121_tree=null;
        Object CONTINUE122_tree=null;
        Object IDENTIFIER123_tree=null;
        Object SEMI124_tree=null;
        Object SEMI126_tree=null;
        Object IDENTIFIER127_tree=null;
        Object COLON128_tree=null;
        Object SEMI130_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:148:5: ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO parExpression statement ) | TRY block catchStmtList -> ^( TRY block catchStmtList ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH expr ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI )
            int alt28=16;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:148:9: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement1695);
                    block83=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block83.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:149:7: assignExpr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignExpr_in_statement1703);
                    assignExpr84=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr84.getTree());
                    SEMI85=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1705); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:150:7: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_statement1714);
                    varDecl86=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl86.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:151:9: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF87=(Token)match(input,IF,FOLLOW_IF_in_statement1724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF87);

                    pushFollow(FOLLOW_parExpression_in_statement1726);
                    parExpression88=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression88.getTree());
                    pushFollow(FOLLOW_statement_in_statement1730);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:151:40: ( ELSE st2= statement )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==ELSE) ) {
                        int LA23_1 = input.LA(2);

                        if ( (synpred45_TinyHaxeTry1()) ) {
                            alt23=1;
                        }
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:151:41: ELSE st2= statement
                            {
                            ELSE89=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1733); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE89);

                            pushFollow(FOLLOW_statement_in_statement1737);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: st1, st2, ELSE, parExpression, IF
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
                    // 151:62: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:151:65: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new IfNode(stream_IF.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:151:97: ( ^( ELSE $st2) )?
                        if ( stream_st2.hasNext()||stream_ELSE.hasNext() ) {
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:151:97: ^( ELSE $st2)
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:152:9: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    FOR90=(Token)match(input,FOR,FOLLOW_FOR_in_statement1781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR90);

                    LPAREN91=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1783); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN91);

                    pushFollow(FOLLOW_expr_in_statement1787);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
                    IN92=(Token)match(input,IN,FOLLOW_IN_in_statement1789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN92);

                    pushFollow(FOLLOW_expr_in_statement1793);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
                    RPAREN93=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN93);

                    pushFollow(FOLLOW_statement_in_statement1797);
                    statement94=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement94.getTree());


                    // AST REWRITE
                    // elements: IN, exp2, FOR, exp1, statement
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
                    // 152:60: -> ^( FOR ^( IN $exp1 $exp2) statement )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:152:63: ^( FOR ^( IN $exp1 $exp2) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ForNode(stream_FOR.nextToken()), root_1);

                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:152:78: ^( IN $exp1 $exp2)
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:153:9: WHILE parExpression statement
                    {
                    WHILE95=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE95);

                    pushFollow(FOLLOW_parExpression_in_statement1830);
                    parExpression96=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression96.getTree());
                    pushFollow(FOLLOW_statement_in_statement1832);
                    statement97=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement97.getTree());


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
                    // 153:39: -> ^( WHILE parExpression statement )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:153:42: ^( WHILE parExpression statement )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:154:9: DO statement WHILE parExpression SEMI
                    {
                    DO98=(Token)match(input,DO,FOLLOW_DO_in_statement1855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO98);

                    pushFollow(FOLLOW_statement_in_statement1857);
                    statement99=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement99.getTree());
                    WHILE100=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1859); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE100);

                    pushFollow(FOLLOW_parExpression_in_statement1861);
                    parExpression101=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression101.getTree());
                    SEMI102=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI102);



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
                    // 154:47: -> ^( DO parExpression statement )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:154:50: ^( DO parExpression statement )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:155:9: TRY block catchStmtList
                    {
                    TRY103=(Token)match(input,TRY,FOLLOW_TRY_in_statement1886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY.add(TRY103);

                    pushFollow(FOLLOW_block_in_statement1888);
                    block104=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block104.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_statement1890);
                    catchStmtList105=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList105.getTree());


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
                    // 155:33: -> ^( TRY block catchStmtList )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:155:36: ^( TRY block catchStmtList )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:156:7: SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
                    {
                    SWITCH106=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement1911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH106);

                    LPAREN107=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1913); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN107);

                    pushFollow(FOLLOW_expr_in_statement1915);
                    expr108=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr108.getTree());
                    RPAREN109=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN109);

                    LBRACE110=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement1919); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE110);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:156:40: ( caseStmt )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=CASE && LA24_0<=DEFAULT)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statement1921);
                    	    caseStmt111=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_caseStmt.add(caseStmt111.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    RBRACE112=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement1924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE112);



                    // AST REWRITE
                    // elements: expr, caseStmt, SWITCH
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:57: -> ^( SWITCH expr ( caseStmt )+ )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:156:60: ^( SWITCH expr ( caseStmt )+ )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:157:9: RETURN ( expr )? SEMI
                    {
                    RETURN113=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1948); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN113);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:157:16: ( expr )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==IDENTIFIER||(LA25_0>=QUES && LA25_0<=LPAREN)||LA25_0==LBRACKET||LA25_0==BANG||(LA25_0>=GT && LA25_0<=LT)||LA25_0==LBRACE||(LA25_0>=ELLIPSIS && LA25_0<=CAST)||LA25_0==EQ||(LA25_0>=LONGLITERAL && LA25_0<=FALSE)||(LA25_0>=PLUSEQ && LA25_0<=PERCENTEQ)||(LA25_0>=154 && LA25_0<=156)) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==SEMI) ) {
                        int LA25_2 = input.LA(2);

                        if ( (synpred53_TinyHaxeTry1()) ) {
                            alt25=1;
                        }
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:157:17: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1951);
                            expr114=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr114.getTree());

                            }
                            break;

                    }

                    SEMI115=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI115);



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
                    // 157:28: -> ^( RETURN ( expr )? )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:157:31: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:157:40: ( expr )?
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:158:9: THROW expr SEMI
                    {
                    THROW116=(Token)match(input,THROW,FOLLOW_THROW_in_statement1973); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW116);

                    pushFollow(FOLLOW_expr_in_statement1975);
                    expr117=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr117.getTree());
                    SEMI118=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1977); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI118);



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
                    // 158:25: -> ^( THROW expr )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:158:28: ^( THROW expr )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:159:9: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK119=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1995); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK119);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:159:15: ( IDENTIFIER )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==IDENTIFIER) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:159:16: IDENTIFIER
                            {
                            IDENTIFIER120=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1998); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER120);


                            }
                            break;

                    }

                    SEMI121=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2002); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI121);



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
                    // 159:34: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:159:37: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:159:45: ( IDENTIFIER )?
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:160:9: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE122=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2021); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE122);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:160:18: ( IDENTIFIER )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==IDENTIFIER) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:160:19: IDENTIFIER
                            {
                            IDENTIFIER123=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2024); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER123);


                            }
                            break;

                    }

                    SEMI124=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2028); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI124);



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
                    // 160:37: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:160:40: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:160:51: ( IDENTIFIER )?
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:161:9: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement2047);
                    expr125=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr125.getTree());
                    SEMI126=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2050); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:162:9: IDENTIFIER COLON statement
                    {
                    IDENTIFIER127=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2061); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER127);

                    COLON128=(Token)match(input,COLON,FOLLOW_COLON_in_statement2063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON128);

                    pushFollow(FOLLOW_statement_in_statement2065);
                    statement129=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement129.getTree());


                    // AST REWRITE
                    // elements: COLON, statement, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 162:36: -> ^( COLON IDENTIFIER statement )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:162:39: ^( COLON IDENTIFIER statement )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:163:9: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI130=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2085); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 30, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class parExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parExpression"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:166:1: parExpression : LPAREN expr RPAREN ;
    public final TinyHaxeTry1Parser.parExpression_return parExpression() throws RecognitionException {
        TinyHaxeTry1Parser.parExpression_return retval = new TinyHaxeTry1Parser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN131=null;
        Token RPAREN133=null;
        TinyHaxeTry1Parser.expr_return expr132 = null;


        Object LPAREN131_tree=null;
        Object RPAREN133_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:5: ( LPAREN expr RPAREN )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:9: LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN131=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2110); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_parExpression2113);
            expr132=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr132.getTree());
            RPAREN133=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2115); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, parExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parExpression"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:170:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* ) | SEMI );
    public final TinyHaxeTry1Parser.block_return block() throws RecognitionException {
        TinyHaxeTry1Parser.block_return retval = new TinyHaxeTry1Parser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE134=null;
        Token RBRACE136=null;
        Token SEMI137=null;
        TinyHaxeTry1Parser.blockStmt_return blockStmt135 = null;


        Object LBRACE134_tree=null;
        Object RBRACE136_tree=null;
        Object SEMI137_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:170:15: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* ) | SEMI )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LBRACE) ) {
                alt30=1;
            }
            else if ( (LA30_0==SEMI) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:170:17: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE134=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE134);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:170:24: ( blockStmt )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=SEMI && LA29_0<=IDENTIFIER)||(LA29_0>=PUBLIC && LA29_0<=OVERRIDE)||(LA29_0>=QUES && LA29_0<=LPAREN)||LA29_0==LBRACKET||LA29_0==BANG||(LA29_0>=GT && LA29_0<=IF)||LA29_0==FOR||(LA29_0>=WHILE && LA29_0<=LBRACE)||(LA29_0>=RETURN && LA29_0<=CONTINUE)||(LA29_0>=ELLIPSIS && LA29_0<=CAST)||(LA29_0>=VAR && LA29_0<=CLASS)||(LA29_0>=LONGLITERAL && LA29_0<=FALSE)||(LA29_0>=PLUSEQ && LA29_0<=PERCENTEQ)||(LA29_0>=154 && LA29_0<=156)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:170:25: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block2140);
                    	    blockStmt135=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt135.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    RBRACE136=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2144); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE136);



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
                    // 170:44: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:170:46: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true), root_1);

                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:170:96: ( blockStmt )*
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI137=(Token)match(input,SEMI,FOLLOW_SEMI_in_block2162); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 32, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class blockStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockStmt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:174:1: blockStmt : ( varDecl | classDecl | statement );
    public final TinyHaxeTry1Parser.blockStmt_return blockStmt() throws RecognitionException {
        TinyHaxeTry1Parser.blockStmt_return retval = new TinyHaxeTry1Parser.blockStmt_return();
        retval.start = input.LT(1);
        int blockStmt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl138 = null;

        TinyHaxeTry1Parser.classDecl_return classDecl139 = null;

        TinyHaxeTry1Parser.statement_return statement140 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:175:2: ( varDecl | classDecl | statement )
            int alt31=3;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:175:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_blockStmt2175);
                    varDecl138=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl138.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:176:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_blockStmt2180);
                    classDecl139=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl139.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:177:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStmt2185);
                    statement140=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement140.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 33, blockStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockStmt"

    public static class breakStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStmt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:181:1: breakStmt : BREAK SEMI ;
    public final TinyHaxeTry1Parser.breakStmt_return breakStmt() throws RecognitionException {
        TinyHaxeTry1Parser.breakStmt_return retval = new TinyHaxeTry1Parser.breakStmt_return();
        retval.start = input.LT(1);
        int breakStmt_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK141=null;
        Token SEMI142=null;

        Object BREAK141_tree=null;
        Object SEMI142_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:181:19: ( BREAK SEMI )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:181:21: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            BREAK141=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt2216); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK141_tree = (Object)adaptor.create(BREAK141);
            adaptor.addChild(root_0, BREAK141_tree);
            }
            SEMI142=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt2218); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, breakStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakStmt"

    public static class continueStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueStmt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:183:1: continueStmt : CONTINUE SEMI ;
    public final TinyHaxeTry1Parser.continueStmt_return continueStmt() throws RecognitionException {
        TinyHaxeTry1Parser.continueStmt_return retval = new TinyHaxeTry1Parser.continueStmt_return();
        retval.start = input.LT(1);
        int continueStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE143=null;
        Token SEMI144=null;

        Object CONTINUE143_tree=null;
        Object SEMI144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:183:19: ( CONTINUE SEMI )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:183:21: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE143=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt2233); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE143_tree = (Object)adaptor.create(CONTINUE143);
            adaptor.addChild(root_0, CONTINUE143_tree);
            }
            SEMI144=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt2235); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, continueStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueStmt"

    public static class caseStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseStmt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:186:1: caseStmt : ( CASE exprList COLON statement -> ^( CASE exprList statement ) | DEFAULT COLON statement -> ^( DEFAULT statement ) );
    public final TinyHaxeTry1Parser.caseStmt_return caseStmt() throws RecognitionException {
        TinyHaxeTry1Parser.caseStmt_return retval = new TinyHaxeTry1Parser.caseStmt_return();
        retval.start = input.LT(1);
        int caseStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CASE145=null;
        Token COLON147=null;
        Token DEFAULT149=null;
        Token COLON150=null;
        TinyHaxeTry1Parser.exprList_return exprList146 = null;

        TinyHaxeTry1Parser.statement_return statement148 = null;

        TinyHaxeTry1Parser.statement_return statement151 = null;


        Object CASE145_tree=null;
        Object COLON147_tree=null;
        Object DEFAULT149_tree=null;
        Object COLON150_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:186:9: ( CASE exprList COLON statement -> ^( CASE exprList statement ) | DEFAULT COLON statement -> ^( DEFAULT statement ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==CASE) ) {
                alt32=1;
            }
            else if ( (LA32_0==DEFAULT) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:186:11: CASE exprList COLON statement
                    {
                    CASE145=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE145);

                    pushFollow(FOLLOW_exprList_in_caseStmt2248);
                    exprList146=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList146.getTree());
                    COLON147=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON147);

                    pushFollow(FOLLOW_statement_in_caseStmt2252);
                    statement148=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement148.getTree());


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
                    // 186:41: -> ^( CASE exprList statement )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:186:44: ^( CASE exprList statement )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:187:4: DEFAULT COLON statement
                    {
                    DEFAULT149=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2267); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT149);

                    COLON150=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2269); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON150);

                    pushFollow(FOLLOW_statement_in_caseStmt2271);
                    statement151=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement151.getTree());


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
                    // 187:28: -> ^( DEFAULT statement )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:187:30: ^( DEFAULT statement )
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
            if ( state.backtracking>0 ) { memoize(input, 36, caseStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "caseStmt"

    public static class defaultStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultStmt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:190:1: defaultStmt : DEFAULT COLON ;
    public final TinyHaxeTry1Parser.defaultStmt_return defaultStmt() throws RecognitionException {
        TinyHaxeTry1Parser.defaultStmt_return retval = new TinyHaxeTry1Parser.defaultStmt_return();
        retval.start = input.LT(1);
        int defaultStmt_StartIndex = input.index();
        Object root_0 = null;

        Token DEFAULT152=null;
        Token COLON153=null;

        Object DEFAULT152_tree=null;
        Object COLON153_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:190:19: ( DEFAULT COLON )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:190:21: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT152=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt2295); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT152_tree = (Object)adaptor.create(DEFAULT152);
            adaptor.addChild(root_0, DEFAULT152_tree);
            }
            COLON153=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt2297); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, defaultStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "defaultStmt"

    public static class catchStmtList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchStmtList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:192:1: catchStmtList : ( catchStmt catchStmtList | );
    public final TinyHaxeTry1Parser.catchStmtList_return catchStmtList() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmtList_return retval = new TinyHaxeTry1Parser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.catchStmt_return catchStmt154 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList155 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:192:19: ( catchStmt catchStmtList | )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==CATCH) ) {
                alt33=1;
            }
            else if ( (LA33_0==EOF||(LA33_0>=SEMI && LA33_0<=IDENTIFIER)||(LA33_0>=PUBLIC && LA33_0<=RBRACKET)||LA33_0==BANG||LA33_0==COLON||(LA33_0>=GT && LA33_0<=DEFAULT)||(LA33_0>=ELLIPSIS && LA33_0<=CAST)||(LA33_0>=VAR && LA33_0<=CLASS)||(LA33_0>=EXTENDS && LA33_0<=IMPLEMENTS)||(LA33_0>=LONGLITERAL && LA33_0<=FALSE)||(LA33_0>=PLUSEQ && LA33_0<=PERCENTEQ)||(LA33_0>=154 && LA33_0<=156)) ) {
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:192:21: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catchStmt_in_catchStmtList2311);
                    catchStmt154=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt154.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList2313);
                    catchStmtList155=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList155.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:194:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 38, catchStmtList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchStmtList"

    public static class catchStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchStmt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:195:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH param block ) ;
    public final TinyHaxeTry1Parser.catchStmt_return catchStmt() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmt_return retval = new TinyHaxeTry1Parser.catchStmt_return();
        retval.start = input.LT(1);
        int catchStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CATCH156=null;
        Token LPAREN157=null;
        Token RPAREN159=null;
        TinyHaxeTry1Parser.param_return param158 = null;

        TinyHaxeTry1Parser.block_return block160 = null;


        Object CATCH156_tree=null;
        Object LPAREN157_tree=null;
        Object RPAREN159_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:195:19: ( CATCH LPAREN param RPAREN block -> ^( CATCH param block ) )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:195:21: CATCH LPAREN param RPAREN block
            {
            CATCH156=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2352); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH156);

            LPAREN157=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2354); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN157);

            pushFollow(FOLLOW_param_in_catchStmt2356);
            param158=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param158.getTree());
            RPAREN159=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2358); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN159);

            pushFollow(FOLLOW_block_in_catchStmt2360);
            block160=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block160.getTree());


            // AST REWRITE
            // elements: CATCH, param, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 195:53: -> ^( CATCH param block )
            {
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:195:56: ^( CATCH param block )
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
            if ( state.backtracking>0 ) { memoize(input, 39, catchStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchStmt"

    public static class exprListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprListOpt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:199:1: exprListOpt : ( exprList | );
    public final TinyHaxeTry1Parser.exprListOpt_return exprListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.exprListOpt_return retval = new TinyHaxeTry1Parser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.exprList_return exprList161 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:199:19: ( exprList | )
            int alt34=2;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
            case COMMA:
            case QUES:
            case FUNCTION:
            case LPAREN:
            case LBRACKET:
            case BANG:
            case GT:
            case LT:
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
            case GTGT:
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
            case NEW:
            case CAST:
            case EQ:
            case LONGLITERAL:
            case INTLITERAL:
            case STRINGLITERAL:
            case CHARLITERAL:
            case FLOATNUM:
            case TRUE:
            case FALSE:
            case PLUSEQ:
            case SUBEQ:
            case STAREQ:
            case SLASHEQ:
            case AMPEQ:
            case BAREQ:
            case CARETEQ:
            case PERCENTEQ:
            case 154:
            case 155:
            case 156:
                {
                alt34=1;
                }
                break;
            case RBRACKET:
                {
                int LA34_2 = input.LA(2);

                if ( (synpred68_TinyHaxeTry1()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case RPAREN:
                {
                int LA34_3 = input.LA(2);

                if ( (synpred68_TinyHaxeTry1()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:199:21: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprList_in_exprListOpt2387);
                    exprList161=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList161.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:201:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 40, exprListOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprListOpt"

    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:202:1: exprList : expr ( COMMA expr )* ;
    public final TinyHaxeTry1Parser.exprList_return exprList() throws RecognitionException {
        TinyHaxeTry1Parser.exprList_return retval = new TinyHaxeTry1Parser.exprList_return();
        retval.start = input.LT(1);
        int exprList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA163=null;
        TinyHaxeTry1Parser.expr_return expr162 = null;

        TinyHaxeTry1Parser.expr_return expr164 = null;


        Object COMMA163_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:202:19: ( expr ( COMMA expr )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:202:21: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList2427);
            expr162=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr162.getTree());
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:202:26: ( COMMA expr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==COMMA) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:202:27: COMMA expr
            	    {
            	    COMMA163=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2430); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_exprList2433);
            	    expr164=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr164.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
            if ( state.backtracking>0 ) { memoize(input, 41, exprList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprList"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:204:1: expr : assignExpr ;
    public final TinyHaxeTry1Parser.expr_return expr() throws RecognitionException {
        TinyHaxeTry1Parser.expr_return retval = new TinyHaxeTry1Parser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.assignExpr_return assignExpr165 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:204:19: ( assignExpr )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:204:21: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr2457);
            assignExpr165=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr165.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class assignExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:206:1: assignExpr : iterExpr ( assignOp iterExpr )* ;
    public final TinyHaxeTry1Parser.assignExpr_return assignExpr() throws RecognitionException {
        TinyHaxeTry1Parser.assignExpr_return retval = new TinyHaxeTry1Parser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr166 = null;

        TinyHaxeTry1Parser.assignOp_return assignOp167 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr168 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:206:19: ( iterExpr ( assignOp iterExpr )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:206:21: iterExpr ( assignOp iterExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iterExpr_in_assignExpr2473);
            iterExpr166=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr166.getTree());
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:206:30: ( assignOp iterExpr )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==EQ||(LA36_0>=PLUSEQ && LA36_0<=PERCENTEQ)||(LA36_0>=154 && LA36_0<=156)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:206:31: assignOp iterExpr
            	    {
            	    pushFollow(FOLLOW_assignOp_in_assignExpr2476);
            	    assignOp167=assignOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp167.getTree(), root_0);
            	    pushFollow(FOLLOW_iterExpr_in_assignExpr2479);
            	    iterExpr168=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr168.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
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
            if ( state.backtracking>0 ) { memoize(input, 43, assignExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExpr"

    public static class iterExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:208:1: iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
    public final TinyHaxeTry1Parser.iterExpr_return iterExpr() throws RecognitionException {
        TinyHaxeTry1Parser.iterExpr_return retval = new TinyHaxeTry1Parser.iterExpr_return();
        retval.start = input.LT(1);
        int iterExpr_StartIndex = input.index();
        Object root_0 = null;

        Token ELLIPSIS170=null;
        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr169 = null;

        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr171 = null;


        Object ELLIPSIS170_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:208:19: ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:208:21: ternaryExpr ( ELLIPSIS ternaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2500);
            ternaryExpr169=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr169.getTree());
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:208:33: ( ELLIPSIS ternaryExpr )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==ELLIPSIS) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:208:34: ELLIPSIS ternaryExpr
            	    {
            	    ELLIPSIS170=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2503); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELLIPSIS170_tree = (Object)adaptor.create(ELLIPSIS170);
            	    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS170_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2506);
            	    ternaryExpr171=ternaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr171.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
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
            if ( state.backtracking>0 ) { memoize(input, 44, iterExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iterExpr"

    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:210:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
    public final TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        TinyHaxeTry1Parser.ternaryExpr_return retval = new TinyHaxeTry1Parser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        Token QUES173=null;
        Token COLON175=null;
        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr172 = null;

        TinyHaxeTry1Parser.expr_return expr174 = null;

        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr176 = null;


        Object QUES173_tree=null;
        Object COLON175_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:210:19: ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:210:21: logicOrExpr ( QUES expr COLON logicOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2529);
            logicOrExpr172=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr172.getTree());
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:210:33: ( QUES expr COLON logicOrExpr )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==QUES) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:210:34: QUES expr COLON logicOrExpr
            	    {
            	    QUES173=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2532); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    QUES173_tree = (Object)adaptor.create(QUES173);
            	    root_0 = (Object)adaptor.becomeRoot(QUES173_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_in_ternaryExpr2535);
            	    expr174=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr174.getTree());
            	    COLON175=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2537); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2540);
            	    logicOrExpr176=logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr176.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 45, ternaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"

    public static class logicOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicOrExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:212:1: logicOrExpr : ( logicAndExpr ) ( BARBAR logicAndExpr )* ;
    public final TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicOrExpr_return retval = new TinyHaxeTry1Parser.logicOrExpr_return();
        retval.start = input.LT(1);
        int logicOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BARBAR178=null;
        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr177 = null;

        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr179 = null;


        Object BARBAR178_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:212:19: ( ( logicAndExpr ) ( BARBAR logicAndExpr )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:212:21: ( logicAndExpr ) ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:212:21: ( logicAndExpr )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:212:22: logicAndExpr
            {
            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2558);
            logicAndExpr177=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr177.getTree());

            }

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:212:36: ( BARBAR logicAndExpr )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==BARBAR) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:212:37: BARBAR logicAndExpr
            	    {
            	    BARBAR178=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2562); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR178_tree = (Object)adaptor.create(BARBAR178);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR178_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2565);
            	    logicAndExpr179=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr179.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 46, logicOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicOrExpr"

    public static class logicAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicAndExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:214:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
    public final TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicAndExpr_return retval = new TinyHaxeTry1Parser.logicAndExpr_return();
        retval.start = input.LT(1);
        int logicAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token AMPAMP181=null;
        TinyHaxeTry1Parser.cmpExpr_return cmpExpr180 = null;

        TinyHaxeTry1Parser.cmpExpr_return cmpExpr182 = null;


        Object AMPAMP181_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:214:19: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:214:21: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:214:21: ( cmpExpr )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:214:22: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2582);
            cmpExpr180=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr180.getTree());

            }

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:214:31: ( AMPAMP cmpExpr )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==AMPAMP) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:214:32: AMPAMP cmpExpr
            	    {
            	    AMPAMP181=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2586); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP181_tree = (Object)adaptor.create(AMPAMP181);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP181_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2589);
            	    cmpExpr182=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr182.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 47, logicAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicAndExpr"

    public static class cmpExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cmpExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:1: cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* ;
    public final TinyHaxeTry1Parser.cmpExpr_return cmpExpr() throws RecognitionException {
        TinyHaxeTry1Parser.cmpExpr_return retval = new TinyHaxeTry1Parser.cmpExpr_return();
        retval.start = input.LT(1);
        int cmpExpr_StartIndex = input.index();
        Object root_0 = null;

        Token EQEQ184=null;
        Token BANGEQ185=null;
        Token GTEQ186=null;
        Token LTEQ187=null;
        Token GT188=null;
        Token LT189=null;
        TinyHaxeTry1Parser.bitExpr_return bitExpr183 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr190 = null;


        Object EQEQ184_tree=null;
        Object BANGEQ185_tree=null;
        Object GTEQ186_tree=null;
        Object LTEQ187_tree=null;
        Object GT188_tree=null;
        Object LT189_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:19: ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:21: ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:21: ( bitExpr )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:22: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2611);
            bitExpr183=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr183.getTree());

            }

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:31: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=GT && LA42_0<=LT)||(LA42_0>=EQEQ && LA42_0<=LTEQ)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:32: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
            	    {
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:32: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
            	    int alt41=6;
            	    switch ( input.LA(1) ) {
            	    case EQEQ:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case BANGEQ:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt41=3;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt41=4;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt41=5;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt41=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:33: EQEQ
            	            {
            	            EQEQ184=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2616); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ184_tree = (Object)adaptor.create(EQEQ184);
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ184_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:40: BANGEQ
            	            {
            	            BANGEQ185=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2620); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ185_tree = (Object)adaptor.create(BANGEQ185);
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ185_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:50: GTEQ
            	            {
            	            GTEQ186=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2625); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ186_tree = (Object)adaptor.create(GTEQ186);
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ186_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:58: LTEQ
            	            {
            	            LTEQ187=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2630); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ187_tree = (Object)adaptor.create(LTEQ187);
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ187_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:66: GT
            	            {
            	            GT188=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2635); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT188_tree = (Object)adaptor.create(GT188);
            	            root_0 = (Object)adaptor.becomeRoot(GT188_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:216:72: LT
            	            {
            	            LT189=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2640); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT189_tree = (Object)adaptor.create(LT189);
            	            root_0 = (Object)adaptor.becomeRoot(LT189_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2645);
            	    bitExpr190=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr190.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 48, cmpExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cmpExpr"

    public static class bitExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:218:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
    public final TinyHaxeTry1Parser.bitExpr_return bitExpr() throws RecognitionException {
        TinyHaxeTry1Parser.bitExpr_return retval = new TinyHaxeTry1Parser.bitExpr_return();
        retval.start = input.LT(1);
        int bitExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BAR192=null;
        Token AMP194=null;
        Token CARET196=null;
        TinyHaxeTry1Parser.shiftExpr_return shiftExpr191 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr193 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr195 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr197 = null;


        Object BAR192_tree=null;
        Object AMP194_tree=null;
        Object CARET196_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:218:19: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:218:21: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:218:21: ( shiftExpr )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:218:22: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2667);
            shiftExpr191=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr191.getTree());

            }

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:218:33: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            loop43:
            do {
                int alt43=4;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    alt43=1;
                    }
                    break;
                case AMP:
                    {
                    alt43=2;
                    }
                    break;
                case CARET:
                    {
                    alt43=3;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:218:34: BAR shiftExpr
            	    {
            	    BAR192=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2671); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR192_tree = (Object)adaptor.create(BAR192);
            	    root_0 = (Object)adaptor.becomeRoot(BAR192_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2674);
            	    shiftExpr193=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr193.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:218:51: AMP shiftExpr
            	    {
            	    AMP194=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2678); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP194_tree = (Object)adaptor.create(AMP194);
            	    root_0 = (Object)adaptor.becomeRoot(AMP194_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2681);
            	    shiftExpr195=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr195.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:218:67: CARET shiftExpr
            	    {
            	    CARET196=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2684); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET196_tree = (Object)adaptor.create(CARET196);
            	    root_0 = (Object)adaptor.becomeRoot(CARET196_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2687);
            	    shiftExpr197=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr197.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 49, bitExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitExpr"

    public static class shiftExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:221:1: shiftExpr : ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )* ;
    public final TinyHaxeTry1Parser.shiftExpr_return shiftExpr() throws RecognitionException {
        TinyHaxeTry1Parser.shiftExpr_return retval = new TinyHaxeTry1Parser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LTLT199=null;
        Token GTGT201=null;
        Token GTGTGT203=null;
        TinyHaxeTry1Parser.addExpr_return addExpr198 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr200 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr202 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr204 = null;


        Object LTLT199_tree=null;
        Object GTGT201_tree=null;
        Object GTGTGT203_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:221:19: ( ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:221:21: ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:221:21: ( addExpr )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:221:22: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2708);
            addExpr198=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr198.getTree());

            }

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:221:31: ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )*
            loop44:
            do {
                int alt44=4;
                switch ( input.LA(1) ) {
                case LTLT:
                    {
                    alt44=1;
                    }
                    break;
                case GTGT:
                    {
                    alt44=2;
                    }
                    break;
                case GTGTGT:
                    {
                    alt44=3;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:221:32: LTLT addExpr
            	    {
            	    LTLT199=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2712); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT199_tree = (Object)adaptor.create(LTLT199);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT199_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2716);
            	    addExpr200=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr200.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:221:49: GTGT addExpr
            	    {
            	    GTGT201=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr2720); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGT201_tree = (Object)adaptor.create(GTGT201);
            	    root_0 = (Object)adaptor.becomeRoot(GTGT201_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2724);
            	    addExpr202=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr202.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:221:66: GTGTGT addExpr
            	    {
            	    GTGTGT203=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2728); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT203_tree = (Object)adaptor.create(GTGTGT203);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT203_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2731);
            	    addExpr204=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr204.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 50, shiftExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:224:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
    public final TinyHaxeTry1Parser.addExpr_return addExpr() throws RecognitionException {
        TinyHaxeTry1Parser.addExpr_return retval = new TinyHaxeTry1Parser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUS206=null;
        Token SUB207=null;
        TinyHaxeTry1Parser.multExpr_return multExpr205 = null;

        TinyHaxeTry1Parser.multExpr_return multExpr208 = null;


        Object PLUS206_tree=null;
        Object SUB207_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:224:19: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:224:21: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:224:21: ( multExpr )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:224:22: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2754);
            multExpr205=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr205.getTree());

            }

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:224:32: ( ( PLUS | SUB ) multExpr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=PLUS && LA46_0<=SUB)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:224:33: ( PLUS | SUB ) multExpr
            	    {
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:224:33: ( PLUS | SUB )
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==PLUS) ) {
            	        alt45=1;
            	    }
            	    else if ( (LA45_0==SUB) ) {
            	        alt45=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 45, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:224:34: PLUS
            	            {
            	            PLUS206=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2759); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS206_tree = (Object)adaptor.create(PLUS206);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS206_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:224:42: SUB
            	            {
            	            SUB207=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2764); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB207_tree = (Object)adaptor.create(SUB207);
            	            root_0 = (Object)adaptor.becomeRoot(SUB207_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2768);
            	    multExpr208=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr208.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 51, addExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:1: multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
    public final TinyHaxeTry1Parser.multExpr_return multExpr() throws RecognitionException {
        TinyHaxeTry1Parser.multExpr_return retval = new TinyHaxeTry1Parser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token STAR210=null;
        Token SLASH211=null;
        Token PERCENT212=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr209 = null;

        TinyHaxeTry1Parser.prefixExpr_return prefixExpr213 = null;


        Object STAR210_tree=null;
        Object SLASH211_tree=null;
        Object PERCENT212_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:19: ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:21: ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:21: ( prefixExpr )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:22: prefixExpr
            {
            pushFollow(FOLLOW_prefixExpr_in_multExpr2790);
            prefixExpr209=prefixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr209.getTree());

            }

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:34: ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=STAR && LA48_0<=PERCENT)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:35: ( STAR | SLASH | PERCENT ) prefixExpr
            	    {
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:35: ( STAR | SLASH | PERCENT )
            	    int alt47=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt47=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt47=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt47=3;
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
            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:36: STAR
            	            {
            	            STAR210=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2795); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR210_tree = (Object)adaptor.create(STAR210);
            	            root_0 = (Object)adaptor.becomeRoot(STAR210_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:42: SLASH
            	            {
            	            SLASH211=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2798); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH211_tree = (Object)adaptor.create(SLASH211);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH211_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:49: PERCENT
            	            {
            	            PERCENT212=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2801); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT212_tree = (Object)adaptor.create(PERCENT212);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT212_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2805);
            	    prefixExpr213=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr213.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 52, multExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:228:1: prefixExpr : ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr );
    public final TinyHaxeTry1Parser.prefixExpr_return prefixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.prefixExpr_return retval = new TinyHaxeTry1Parser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set214=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr215 = null;

        TinyHaxeTry1Parser.newExpr_return newExpr216 = null;

        TinyHaxeTry1Parser.cast_return cast217 = null;

        TinyHaxeTry1Parser.suffixExpr_return suffixExpr218 = null;


        Object set214_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:228:19: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr )
            int alt49=4;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                int LA49_1 = input.LA(2);

                if ( (synpred96_TinyHaxeTry1()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
                }
                break;
            case NEW:
                {
                alt49=2;
                }
                break;
            case CAST:
                {
                alt49=3;
                }
                break;
            case EOF:
            case SEMI:
            case IDENTIFIER:
            case COMMA:
            case QUES:
            case FUNCTION:
            case LPAREN:
            case RPAREN:
            case LBRACKET:
            case RBRACKET:
            case COLON:
            case GT:
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
            case GTGT:
            case GTGTGT:
            case PLUS:
            case STAR:
            case SLASH:
            case PERCENT:
            case NULL:
            case EQ:
            case LONGLITERAL:
            case INTLITERAL:
            case STRINGLITERAL:
            case CHARLITERAL:
            case FLOATNUM:
            case TRUE:
            case FALSE:
            case PLUSEQ:
            case SUBEQ:
            case STAREQ:
            case SLASHEQ:
            case AMPEQ:
            case BAREQ:
            case CARETEQ:
            case PERCENTEQ:
            case 154:
            case 155:
            case 156:
                {
                alt49=4;
                }
                break;
            case SUBSUB:
                {
                int LA49_5 = input.LA(2);

                if ( (synpred96_TinyHaxeTry1()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 5, input);

                    throw nvae;
                }
                }
                break;
            case SUB:
                {
                int LA49_6 = input.LA(2);

                if ( (synpred96_TinyHaxeTry1()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 6, input);

                    throw nvae;
                }
                }
                break;
            case BANG:
            case TILDE:
                {
                alt49=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:228:21: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    set214=(Token)input.LT(1);
                    if ( input.LA(1)==BANG||input.LA(1)==SUB||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set214));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2835);
                    prefixExpr215=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr215.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:229:25: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_prefixExpr2861);
                    newExpr216=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr216.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:230:25: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cast_in_prefixExpr2887);
                    cast217=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast217.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:231:25: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr2913);
                    suffixExpr218=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr218.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 53, prefixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixExpr"

    public static class suffixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "suffixExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:234:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB ) | value typeParamOpt );
    public final TinyHaxeTry1Parser.suffixExpr_return suffixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.suffixExpr_return retval = new TinyHaxeTry1Parser.suffixExpr_return();
        retval.start = input.LT(1);
        int suffixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN220=null;
        Token RPAREN222=null;
        Token LBRACKET224=null;
        Token RBRACKET226=null;
        Token PLUSPLUS228=null;
        Token SUBSUB230=null;
        TinyHaxeTry1Parser.value_return value219 = null;

        TinyHaxeTry1Parser.exprListOpt_return exprListOpt221 = null;

        TinyHaxeTry1Parser.value_return value223 = null;

        TinyHaxeTry1Parser.expr_return expr225 = null;

        TinyHaxeTry1Parser.value_return value227 = null;

        TinyHaxeTry1Parser.value_return value229 = null;

        TinyHaxeTry1Parser.value_return value231 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt232 = null;


        Object LPAREN220_tree=null;
        Object RPAREN222_tree=null;
        Object LBRACKET224_tree=null;
        Object RBRACKET226_tree=null;
        Object PLUSPLUS228_tree=null;
        Object SUBSUB230_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:235:2: ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB ) | value typeParamOpt )
            int alt50=5;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:235:4: value LPAREN exprListOpt RPAREN
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2932);
                    value219=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value219.getTree());
                    LPAREN220=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_suffixExpr2934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN220);

                    pushFollow(FOLLOW_exprListOpt_in_suffixExpr2936);
                    exprListOpt221=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt221.getTree());
                    RPAREN222=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_suffixExpr2938); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN222);



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
                    // 235:36: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:235:39: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:235:99: ( exprListOpt )?
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:236:4: value LBRACKET expr RBRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2958);
                    value223=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value223.getTree());
                    LBRACKET224=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_suffixExpr2960); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACKET224_tree = (Object)adaptor.create(LBRACKET224);
                    adaptor.addChild(root_0, LBRACKET224_tree);
                    }
                    pushFollow(FOLLOW_expr_in_suffixExpr2962);
                    expr225=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr225.getTree());
                    RBRACKET226=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_suffixExpr2964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACKET226_tree = (Object)adaptor.create(RBRACKET226);
                    adaptor.addChild(root_0, RBRACKET226_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:237:4: value PLUSPLUS
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2969);
                    value227=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value227.getTree());
                    PLUSPLUS228=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr2971); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS228);



                    // AST REWRITE
                    // elements: PLUSPLUS, value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:19: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:237:21: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:238:4: value SUBSUB
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2989);
                    value229=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value229.getTree());
                    SUBSUB230=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr2991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSUB.add(SUBSUB230);



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
                    // 238:17: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:238:20: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:239:4: value typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr3010);
                    value231=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value231.getTree());
                    pushFollow(FOLLOW_typeParamOpt_in_suffixExpr3012);
                    typeParamOpt232=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt232.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 54, suffixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "suffixExpr"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:242:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );
    public final TinyHaxeTry1Parser.value_return value() throws RecognitionException {
        TinyHaxeTry1Parser.value_return retval = new TinyHaxeTry1Parser.value_return();
        retval.start = input.LT(1);
        int value_StartIndex = input.index();
        Object root_0 = null;

        Token NULL236=null;
        Token LPAREN238=null;
        Token RPAREN241=null;
        TinyHaxeTry1Parser.funcLit_return funcLit233 = null;

        TinyHaxeTry1Parser.arrayLit_return arrayLit234 = null;

        TinyHaxeTry1Parser.objLit_return objLit235 = null;

        TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol237 = null;

        TinyHaxeTry1Parser.expr_return expr239 = null;

        TinyHaxeTry1Parser.statement_return statement240 = null;

        TinyHaxeTry1Parser.dotIdent_return dotIdent242 = null;


        Object NULL236_tree=null;
        Object LPAREN238_tree=null;
        Object RPAREN241_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:242:7: ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | )
            int alt52=8;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:242:9: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcLit_in_value3021);
                    funcLit233=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit233.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:243:4: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLit_in_value3027);
                    arrayLit234=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit234.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:244:14: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objLit_in_value3042);
                    objLit235=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit235.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:245:14: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL236=(Token)match(input,NULL,FOLLOW_NULL_in_value3057); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL236_tree = (Object)adaptor.create(NULL236);
                    adaptor.addChild(root_0, NULL236_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:246:14: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elementarySymbol_in_value3072);
                    elementarySymbol237=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol237.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:14: LPAREN ( expr | statement ) RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN238=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value3087); if (state.failed) return retval;
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:22: ( expr | statement )
                    int alt51=2;
                    alt51 = dfa51.predict(input);
                    switch (alt51) {
                        case 1 :
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:23: expr
                            {
                            pushFollow(FOLLOW_expr_in_value3091);
                            expr239=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr239.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:28: statement
                            {
                            pushFollow(FOLLOW_statement_in_value3093);
                            statement240=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement240.getTree());

                            }
                            break;

                    }

                    RPAREN241=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value3096); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:248:11: dotIdent
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_dotIdent_in_value3109);
                    dotIdent242=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent242.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:250:9: 
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
            if ( state.backtracking>0 ) { memoize(input, 55, value_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class newExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:252:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW type exprListOpt ) ;
    public final TinyHaxeTry1Parser.newExpr_return newExpr() throws RecognitionException {
        TinyHaxeTry1Parser.newExpr_return retval = new TinyHaxeTry1Parser.newExpr_return();
        retval.start = input.LT(1);
        int newExpr_StartIndex = input.index();
        Object root_0 = null;

        Token NEW243=null;
        Token LPAREN245=null;
        Token RPAREN247=null;
        TinyHaxeTry1Parser.type_return type244 = null;

        TinyHaxeTry1Parser.exprListOpt_return exprListOpt246 = null;


        Object NEW243_tree=null;
        Object LPAREN245_tree=null;
        Object RPAREN247_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:252:19: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW type exprListOpt ) )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:252:21: NEW type LPAREN exprListOpt RPAREN
            {
            NEW243=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr3154); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW243);

            pushFollow(FOLLOW_type_in_newExpr3156);
            type244=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type244.getTree());
            LPAREN245=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr3158); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN245);

            pushFollow(FOLLOW_exprListOpt_in_newExpr3160);
            exprListOpt246=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt246.getTree());
            RPAREN247=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr3162); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN247);



            // AST REWRITE
            // elements: type, exprListOpt, NEW
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 252:56: -> ^( NEW type exprListOpt )
            {
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:252:58: ^( NEW type exprListOpt )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_NEW.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_exprListOpt.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 56, newExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newExpr"

    public static class cast_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cast"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:254:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) );
    public final TinyHaxeTry1Parser.cast_return cast() throws RecognitionException {
        TinyHaxeTry1Parser.cast_return retval = new TinyHaxeTry1Parser.cast_return();
        retval.start = input.LT(1);
        int cast_StartIndex = input.index();
        Object root_0 = null;

        Token CAST248=null;
        Token LPAREN249=null;
        Token COMMA251=null;
        Token RPAREN253=null;
        Token CAST254=null;
        Token LPAREN255=null;
        Token RPAREN257=null;
        TinyHaxeTry1Parser.expr_return expr250 = null;

        TinyHaxeTry1Parser.funcType_return funcType252 = null;

        TinyHaxeTry1Parser.expr_return expr256 = null;


        Object CAST248_tree=null;
        Object LPAREN249_tree=null;
        Object COMMA251_tree=null;
        Object RPAREN253_tree=null;
        Object CAST254_tree=null;
        Object LPAREN255_tree=null;
        Object RPAREN257_tree=null;
        RewriteRuleTokenStream stream_CAST=new RewriteRuleTokenStream(adaptor,"token CAST");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:254:19: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==CAST) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred112_TinyHaxeTry1()) ) {
                    alt54=1;
                }
                else if ( (true) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:254:21: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST248=(Token)match(input,CAST,FOLLOW_CAST_in_cast3193); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST248);

                    LPAREN249=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3195); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN249);

                    pushFollow(FOLLOW_expr_in_cast3197);
                    expr250=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr250.getTree());
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:254:38: ( COMMA funcType )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==COMMA) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:254:39: COMMA funcType
                            {
                            COMMA251=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast3200); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA251);

                            pushFollow(FOLLOW_funcType_in_cast3202);
                            funcType252=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType252.getTree());

                            }
                            break;

                    }

                    RPAREN253=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN253);



                    // AST REWRITE
                    // elements: expr, funcType, CAST
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 254:63: -> ^( CAST expr ( funcType )? )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:254:66: ^( CAST expr ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:254:78: ( funcType )?
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:255:4: CAST LPAREN expr RPAREN
                    {
                    CAST254=(Token)match(input,CAST,FOLLOW_CAST_in_cast3222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST254);

                    LPAREN255=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN255);

                    pushFollow(FOLLOW_expr_in_cast3226);
                    expr256=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr256.getTree());
                    RPAREN257=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN257);



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
                    // 255:28: -> ^( CAST expr )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:255:30: ^( CAST expr )
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
            if ( state.backtracking>0 ) { memoize(input, 57, cast_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cast"

    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevelDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:259:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelDecl_return retval = new TinyHaxeTry1Parser.topLevelDecl_return();
        retval.start = input.LT(1);
        int topLevelDecl_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.classDecl_return classDecl258 = null;

        TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl259 = null;

        TinyHaxeTry1Parser.enumDecl_return enumDecl260 = null;

        TinyHaxeTry1Parser.typedefDecl_return typedefDecl261 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:259:19: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt55=4;
            switch ( input.LA(1) ) {
            case EXTERN:
            case CLASS:
                {
                alt55=1;
                }
                break;
            case INTERFACE:
                {
                alt55=2;
                }
                break;
            case ENUM:
                {
                alt55=3;
                }
                break;
            case TYPEDEF:
                {
                alt55=4;
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:259:21: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_topLevelDecl3251);
                    classDecl258=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl258.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:260:25: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl3277);
                    interfaceDecl259=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl259.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:261:25: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl3303);
                    enumDecl260=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl260.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:262:25: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl3329);
                    typedefDecl261=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl261.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 58, topLevelDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"

    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:264:1: enumDecl : ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM IDENTIFIER typeParamOpt enumBody ) ;
    public final TinyHaxeTry1Parser.enumDecl_return enumDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumDecl_return retval = new TinyHaxeTry1Parser.enumDecl_return();
        retval.start = input.LT(1);
        int enumDecl_StartIndex = input.index();
        Object root_0 = null;

        Token ENUM262=null;
        Token IDENTIFIER263=null;
        Token LBRACE265=null;
        Token RBRACE267=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt264 = null;

        TinyHaxeTry1Parser.enumBody_return enumBody266 = null;


        Object ENUM262_tree=null;
        Object IDENTIFIER263_tree=null;
        Object LBRACE265_tree=null;
        Object RBRACE267_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:264:19: ( ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM IDENTIFIER typeParamOpt enumBody ) )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:264:21: ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
            {
            ENUM262=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl3347); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM262);

            IDENTIFIER263=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl3349); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER263);

            pushFollow(FOLLOW_typeParamOpt_in_enumDecl3351);
            typeParamOpt264=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt264.getTree());
            LBRACE265=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl3353); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE265);

            pushFollow(FOLLOW_enumBody_in_enumDecl3355);
            enumBody266=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody266.getTree());
            RBRACE267=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl3357); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE267);



            // AST REWRITE
            // elements: typeParamOpt, enumBody, IDENTIFIER, ENUM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 264:73: -> ^( ENUM IDENTIFIER typeParamOpt enumBody )
            {
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:264:76: ^( ENUM IDENTIFIER typeParamOpt enumBody )
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
            if ( state.backtracking>0 ) { memoize(input, 59, enumDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumDecl"

    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumBody"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:1: enumBody : ( enumValueDecl )+ ;
    public final TinyHaxeTry1Parser.enumBody_return enumBody() throws RecognitionException {
        TinyHaxeTry1Parser.enumBody_return retval = new TinyHaxeTry1Parser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl268 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:19: ( ( enumValueDecl )+ )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:21: ( enumValueDecl )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:21: ( enumValueDecl )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==IDENTIFIER||LA56_0==PP_IF||(LA56_0>=PP_ELSEIF && LA56_0<=PP_ERROR)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:22: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody3388);
            	    enumValueDecl268=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValueDecl268.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
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
            if ( state.backtracking>0 ) { memoize(input, 60, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBody"

    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValueDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER SEMI | pp );
    public final TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumValueDecl_return retval = new TinyHaxeTry1Parser.enumValueDecl_return();
        retval.start = input.LT(1);
        int enumValueDecl_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER269=null;
        Token LPAREN270=null;
        Token RPAREN272=null;
        Token SEMI273=null;
        Token IDENTIFIER274=null;
        Token SEMI275=null;
        TinyHaxeTry1Parser.paramList_return paramList271 = null;

        TinyHaxeTry1Parser.pp_return pp276 = null;


        Object IDENTIFIER269_tree=null;
        Object LPAREN270_tree=null;
        Object RPAREN272_tree=null;
        Object SEMI273_tree=null;
        Object IDENTIFIER274_tree=null;
        Object SEMI275_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:19: ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER SEMI | pp )
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==IDENTIFIER) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==LPAREN) ) {
                    alt57=1;
                }
                else if ( (LA57_1==SEMI) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA57_0==PP_IF||(LA57_0>=PP_ELSEIF && LA57_0<=PP_ERROR)) ) {
                alt57=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:20: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER269=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER269_tree = (Object)adaptor.create(IDENTIFIER269);
                    adaptor.addChild(root_0, IDENTIFIER269_tree);
                    }
                    LPAREN270=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl3404); if (state.failed) return retval;
                    pushFollow(FOLLOW_paramList_in_enumValueDecl3407);
                    paramList271=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList271.getTree());
                    RPAREN272=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl3409); if (state.failed) return retval;
                    SEMI273=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3412); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:269:24: IDENTIFIER SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER274=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3438); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER274_tree = (Object)adaptor.create(IDENTIFIER274);
                    adaptor.addChild(root_0, IDENTIFIER274_tree);
                    }
                    SEMI275=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3440); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:270:25: pp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_enumValueDecl3467);
                    pp276=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp276.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 61, enumValueDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"

    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:272:1: varDeclList : varDecl varDeclList ;
    public final TinyHaxeTry1Parser.varDeclList_return varDeclList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclList_return retval = new TinyHaxeTry1Parser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl277 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList278 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:272:19: ( varDecl varDeclList )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:272:21: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDecl_in_varDeclList3482);
            varDecl277=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl277.getTree());
            pushFollow(FOLLOW_varDeclList_in_varDeclList3484);
            varDeclList278=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList278.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, varDeclList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclList"

    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:275:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? varDeclPartList ) ;
    public final TinyHaxeTry1Parser.varDecl_return varDecl() throws RecognitionException {
        TinyHaxeTry1Parser.varDecl_return retval = new TinyHaxeTry1Parser.varDecl_return();
        retval.start = input.LT(1);
        int varDecl_StartIndex = input.index();
        Object root_0 = null;

        Token VAR280=null;
        Token SEMI282=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList279 = null;

        TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList281 = null;


        Object VAR280_tree=null;
        Object SEMI282_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_varDeclPartList=new RewriteRuleSubtreeStream(adaptor,"rule varDeclPartList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:275:19: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? varDeclPartList ) )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:275:21: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:275:21: ( declAttrList )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=PUBLIC && LA58_0<=OVERRIDE)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:275:22: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl3506);
                    declAttrList279=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList279.getTree());

                    }
                    break;

            }

            VAR280=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl3510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR280);

            pushFollow(FOLLOW_varDeclPartList_in_varDecl3512);
            varDeclPartList281=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList281.getTree());
            SEMI282=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl3514); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI282);



            // AST REWRITE
            // elements: varDeclPartList, declAttrList, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 275:62: -> ^( VAR[$VAR] ( declAttrList )? varDeclPartList )
            {
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:275:64: ^( VAR[$VAR] ( declAttrList )? varDeclPartList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, VAR280), root_1);

                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:275:92: ( declAttrList )?
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
            if ( state.backtracking>0 ) { memoize(input, 63, varDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDecl"

    public static class varDeclPartList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPartList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
    public final TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclPartList_return retval = new TinyHaxeTry1Parser.varDeclPartList_return();
        retval.start = input.LT(1);
        int varDeclPartList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA284=null;
        TinyHaxeTry1Parser.varDeclPart_return varDeclPart283 = null;

        TinyHaxeTry1Parser.varDeclPart_return varDeclPart285 = null;


        Object COMMA284_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:19: ( varDeclPart ( COMMA varDeclPart )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:21: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3542);
            varDeclPart283=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart283.getTree());
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:33: ( COMMA varDeclPart )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==COMMA) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:34: COMMA varDeclPart
            	    {
            	    COMMA284=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList3545); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3548);
            	    varDeclPart285=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart285.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 64, varDeclPartList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPartList"

    public static class varDeclPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPart"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:280:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
    public final TinyHaxeTry1Parser.varDeclPart_return varDeclPart() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclPart_return retval = new TinyHaxeTry1Parser.varDeclPart_return();
        retval.start = input.LT(1);
        int varDeclPart_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER286=null;
        TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt287 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt288 = null;

        TinyHaxeTry1Parser.varInit_return varInit289 = null;


        Object IDENTIFIER286_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:280:19: ( IDENTIFIER propDeclOpt typeTagOpt varInit )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:280:20: IDENTIFIER propDeclOpt typeTagOpt varInit
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER286=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart3564); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER286_tree = (Object)adaptor.create(IDENTIFIER286);
            adaptor.addChild(root_0, IDENTIFIER286_tree);
            }
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3566);
            propDeclOpt287=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt287.getTree());
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3568);
            typeTagOpt288=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt288.getTree());
            pushFollow(FOLLOW_varInit_in_varDeclPart3570);
            varInit289=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit289.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, varDeclPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPart"

    public static class propDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:282:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2) ;
    public final TinyHaxeTry1Parser.propDecl_return propDecl() throws RecognitionException {
        TinyHaxeTry1Parser.propDecl_return retval = new TinyHaxeTry1Parser.propDecl_return();
        retval.start = input.LT(1);
        int propDecl_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN290=null;
        Token COMMA291=null;
        Token RPAREN292=null;
        TinyHaxeTry1Parser.propAccessor_return a1 = null;

        TinyHaxeTry1Parser.propAccessor_return a2 = null;


        Object LPAREN290_tree=null;
        Object COMMA291_tree=null;
        Object RPAREN292_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:282:19: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2) )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:282:21: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN290=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl3588); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN290);

            pushFollow(FOLLOW_propAccessor_in_propDecl3592);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            COMMA291=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl3594); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA291);

            pushFollow(FOLLOW_propAccessor_in_propDecl3598);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            RPAREN292=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl3600); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN292);



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
            // 282:73: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2)
            {
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:282:76: ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2)
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
            if ( state.backtracking>0 ) { memoize(input, 66, propDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propDecl"

    public static class propAccessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propAccessor"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:284:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final TinyHaxeTry1Parser.propAccessor_return propAccessor() throws RecognitionException {
        TinyHaxeTry1Parser.propAccessor_return retval = new TinyHaxeTry1Parser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set293=null;

        Object set293_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:284:19: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set293=(Token)input.LT(1);
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==DYNAMIC||input.LA(1)==DEFAULT||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set293));
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
            if ( state.backtracking>0 ) { memoize(input, 67, propAccessor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propAccessor"

    public static class propDeclOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDeclOpt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:289:1: propDeclOpt : ( propDecl | );
    public final TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        TinyHaxeTry1Parser.propDeclOpt_return retval = new TinyHaxeTry1Parser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.propDecl_return propDecl294 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:289:19: ( propDecl | )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LPAREN) ) {
                alt60=1;
            }
            else if ( (LA60_0==EOF||LA60_0==SEMI||LA60_0==COMMA||LA60_0==RPAREN||LA60_0==COLON||LA60_0==LBRACE||LA60_0==EQ) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:289:21: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propDecl_in_propDeclOpt3722);
                    propDecl294=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl294.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:291:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 68, propDeclOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propDeclOpt"

    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInit"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:292:1: varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] expr ) | );
    public final TinyHaxeTry1Parser.varInit_return varInit() throws RecognitionException {
        TinyHaxeTry1Parser.varInit_return retval = new TinyHaxeTry1Parser.varInit_return();
        retval.start = input.LT(1);
        int varInit_StartIndex = input.index();
        Object root_0 = null;

        Token EQ295=null;
        TinyHaxeTry1Parser.expr_return expr296 = null;


        Object EQ295_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:292:19: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] expr ) | )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==EQ) ) {
                alt61=1;
            }
            else if ( (LA61_0==EOF||LA61_0==SEMI||LA61_0==COMMA||LA61_0==RPAREN) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:292:21: EQ expr
                    {
                    EQ295=(Token)match(input,EQ,FOLLOW_EQ_in_varInit3763); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ295);

                    pushFollow(FOLLOW_expr_in_varInit3765);
                    expr296=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr296.getTree());


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
                    // 292:29: -> ^( VAR_INIT[\"VAR_INIT\",true] expr )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:292:31: ^( VAR_INIT[\"VAR_INIT\",true] expr )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:294:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 69, varInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varInit"

    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:296:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? ) );
    public final TinyHaxeTry1Parser.funcDecl_return funcDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcDecl_return retval = new TinyHaxeTry1Parser.funcDecl_return();
        retval.start = input.LT(1);
        int funcDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION298=null;
        Token NEW299=null;
        Token LPAREN300=null;
        Token RPAREN302=null;
        Token FUNCTION306=null;
        Token IDENTIFIER307=null;
        Token LPAREN309=null;
        Token RPAREN311=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList297 = null;

        TinyHaxeTry1Parser.paramList_return paramList301 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt303 = null;

        TinyHaxeTry1Parser.block_return block304 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList305 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt308 = null;

        TinyHaxeTry1Parser.paramList_return paramList310 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt312 = null;

        TinyHaxeTry1Parser.block_return block313 = null;


        Object FUNCTION298_tree=null;
        Object NEW299_tree=null;
        Object LPAREN300_tree=null;
        Object RPAREN302_tree=null;
        Object FUNCTION306_tree=null;
        Object IDENTIFIER307_tree=null;
        Object LPAREN309_tree=null;
        Object RPAREN311_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:296:9: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? ) )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:296:11: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:296:11: ( declAttrList )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( ((LA62_0>=PUBLIC && LA62_0<=OVERRIDE)) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl3790);
                            declAttrList297=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList297.getTree());

                            }
                            break;

                    }

                    FUNCTION298=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION298);

                    NEW299=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl3795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW299);

                    LPAREN300=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3797); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN300);

                    pushFollow(FOLLOW_paramList_in_funcDecl3799);
                    paramList301=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList301.getTree());
                    RPAREN302=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN302);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3803);
                    typeTagOpt303=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt303.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3805);
                    block304=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block304.getTree());


                    // AST REWRITE
                    // elements: block, paramList, FUNCTION, typeTagOpt, NEW, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 296:79: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:296:82: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:296:111: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:296:125: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:296:136: ( typeTagOpt )?
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:4: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:4: ( declAttrList )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=PUBLIC && LA63_0<=OVERRIDE)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl3833);
                            declAttrList305=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList305.getTree());

                            }
                            break;

                    }

                    FUNCTION306=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION306);

                    IDENTIFIER307=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl3838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER307);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl3840);
                    typeParamOpt308=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt308.getTree());
                    LPAREN309=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN309);

                    pushFollow(FOLLOW_paramList_in_funcDecl3844);
                    paramList310=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList310.getTree());
                    RPAREN311=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3846); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN311);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3848);
                    typeTagOpt312=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt312.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3850);
                    block313=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block313.getTree());


                    // AST REWRITE
                    // elements: declAttrList, paramList, IDENTIFIER, typeTagOpt, FUNCTION, block, typeParamOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 297:92: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:94: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:130: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:144: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:155: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        adaptor.addChild(root_1, stream_block.nextTree());
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:173: ( typeParamOpt )?
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
            if ( state.backtracking>0 ) { memoize(input, 70, funcDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcDecl"

    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcProtoDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:300:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );
    public final TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcProtoDecl_return retval = new TinyHaxeTry1Parser.funcProtoDecl_return();
        retval.start = input.LT(1);
        int funcProtoDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION315=null;
        Token NEW316=null;
        Token LPAREN317=null;
        Token RPAREN319=null;
        Token SEMI321=null;
        Token FUNCTION323=null;
        Token IDENTIFIER324=null;
        Token LPAREN326=null;
        Token RPAREN328=null;
        Token SEMI330=null;
        Token FUNCTION331=null;
        Token NEW332=null;
        Token LPAREN333=null;
        Token RPAREN335=null;
        Token SEMI337=null;
        Token FUNCTION338=null;
        Token IDENTIFIER339=null;
        Token LPAREN341=null;
        Token RPAREN343=null;
        Token SEMI345=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList314 = null;

        TinyHaxeTry1Parser.paramList_return paramList318 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt320 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList322 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt325 = null;

        TinyHaxeTry1Parser.paramList_return paramList327 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt329 = null;

        TinyHaxeTry1Parser.paramList_return paramList334 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt336 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt340 = null;

        TinyHaxeTry1Parser.paramList_return paramList342 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt344 = null;


        Object FUNCTION315_tree=null;
        Object NEW316_tree=null;
        Object LPAREN317_tree=null;
        Object RPAREN319_tree=null;
        Object SEMI321_tree=null;
        Object FUNCTION323_tree=null;
        Object IDENTIFIER324_tree=null;
        Object LPAREN326_tree=null;
        Object RPAREN328_tree=null;
        Object SEMI330_tree=null;
        Object FUNCTION331_tree=null;
        Object NEW332_tree=null;
        Object LPAREN333_tree=null;
        Object RPAREN335_tree=null;
        Object SEMI337_tree=null;
        Object FUNCTION338_tree=null;
        Object IDENTIFIER339_tree=null;
        Object LPAREN341_tree=null;
        Object RPAREN343_tree=null;
        Object SEMI345_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:300:19: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) )
            int alt65=4;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:300:21: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3889);
                    declAttrList314=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList314.getTree());
                    FUNCTION315=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3891); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION315);

                    NEW316=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3893); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW316);

                    LPAREN317=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN317);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3897);
                    paramList318=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList318.getTree());
                    RPAREN319=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3899); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN319);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3901);
                    typeTagOpt320=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt320.getTree());
                    SEMI321=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3903); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI321);



                    // AST REWRITE
                    // elements: typeTagOpt, declAttrList, FUNCTION, paramList, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 300:87: -> ^( FUNCTION NEW paramList typeTagOpt declAttrList )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:300:90: ^( FUNCTION NEW paramList typeTagOpt declAttrList )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:301:25: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3943);
                    declAttrList322=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList322.getTree());
                    FUNCTION323=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3945); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION323);

                    IDENTIFIER324=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3947); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER324);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3949);
                    typeParamOpt325=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt325.getTree());
                    LPAREN326=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN326);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3953);
                    paramList327=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList327.getTree());
                    RPAREN328=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN328);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3957);
                    typeTagOpt329=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt329.getTree());
                    SEMI330=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3959); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI330);



                    // AST REWRITE
                    // elements: declAttrList, paramList, typeParamOpt, IDENTIFIER, typeTagOpt, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 301:111: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:301:113: ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:302:25: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION331=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4000); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION331);

                    NEW332=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4002); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW332);

                    LPAREN333=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4004); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN333);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4006);
                    paramList334=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList334.getTree());
                    RPAREN335=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN335);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4010);
                    typeTagOpt336=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt336.getTree());
                    SEMI337=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4012); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI337);



                    // AST REWRITE
                    // elements: FUNCTION, typeTagOpt, paramList, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 302:78: -> ^( FUNCTION NEW paramList typeTagOpt )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:302:81: ^( FUNCTION NEW paramList typeTagOpt )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:303:25: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION338=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4050); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION338);

                    IDENTIFIER339=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4052); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER339);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4054);
                    typeParamOpt340=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt340.getTree());
                    LPAREN341=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4056); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN341);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4058);
                    paramList342=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList342.getTree());
                    RPAREN343=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN343);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4062);
                    typeTagOpt344=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt344.getTree());
                    SEMI345=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4064); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI345);



                    // AST REWRITE
                    // elements: typeParamOpt, IDENTIFIER, FUNCTION, typeTagOpt, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 303:98: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:303:100: ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt )
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
            if ( state.backtracking>0 ) { memoize(input, 71, funcProtoDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"

    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:305:1: classDecl : ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBodyScope RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final TinyHaxeTry1Parser.classDecl_return classDecl() throws RecognitionException {
        TinyHaxeTry1Parser.classDecl_return retval = new TinyHaxeTry1Parser.classDecl_return();
        retval.start = input.LT(1);
        int classDecl_StartIndex = input.index();
        Object root_0 = null;

        Token EXTERN346=null;
        Token CLASS347=null;
        Token IDENTIFIER348=null;
        Token LBRACE351=null;
        Token RBRACE353=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt349 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt350 = null;

        TinyHaxeTry1Parser.classBodyScope_return classBodyScope352 = null;


        Object EXTERN346_tree=null;
        Object CLASS347_tree=null;
        Object IDENTIFIER348_tree=null;
        Object LBRACE351_tree=null;
        Object RBRACE353_tree=null;
        RewriteRuleTokenStream stream_EXTERN=new RewriteRuleTokenStream(adaptor,"token EXTERN");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:305:19: ( ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBodyScope RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:305:21: ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBodyScope RBRACE
            {
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:305:21: ( EXTERN )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==EXTERN) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0: EXTERN
                    {
                    EXTERN346=(Token)match(input,EXTERN,FOLLOW_EXTERN_in_classDecl4094); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTERN.add(EXTERN346);


                    }
                    break;

            }

            CLASS347=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4097); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS347);

            IDENTIFIER348=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4099); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER348);

            pushFollow(FOLLOW_typeParamOpt_in_classDecl4101);
            typeParamOpt349=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt349.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_classDecl4103);
            inheritListOpt350=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt350.getTree());
            LBRACE351=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classDecl4105); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE351);

            pushFollow(FOLLOW_classBodyScope_in_classDecl4107);
            classBodyScope352=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope352.getTree());
            RBRACE353=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classDecl4109); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE353);



            // AST REWRITE
            // elements: inheritListOpt, classBodyScope, CLASS, IDENTIFIER, typeParamOpt, EXTERN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 305:103: -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:305:105: ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ClassNode(stream_CLASS.nextToken()), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:305:135: ( EXTERN )?
                if ( stream_EXTERN.hasNext() ) {
                    adaptor.addChild(root_1, stream_EXTERN.nextNode());

                }
                stream_EXTERN.reset();
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:305:143: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:305:157: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:305:173: ( classBodyScope )?
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
            if ( state.backtracking>0 ) { memoize(input, 72, classDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDecl"

    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBodyScope"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:307:1: classBodyScope : classBody -> ^( BLOCK_SCOPE ( classBody )? ) ;
    public final TinyHaxeTry1Parser.classBodyScope_return classBodyScope() throws RecognitionException {
        TinyHaxeTry1Parser.classBodyScope_return retval = new TinyHaxeTry1Parser.classBodyScope_return();
        retval.start = input.LT(1);
        int classBodyScope_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.classBody_return classBody354 = null;


        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:308:2: ( classBody -> ^( BLOCK_SCOPE ( classBody )? ) )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:308:4: classBody
            {
            pushFollow(FOLLOW_classBody_in_classBodyScope4141);
            classBody354=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBody.add(classBody354.getTree());


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
            // 308:14: -> ^( BLOCK_SCOPE ( classBody )? )
            {
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:308:17: ^( BLOCK_SCOPE ( classBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE), root_1);

                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:308:47: ( classBody )?
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
            if ( state.backtracking>0 ) { memoize(input, 73, classBodyScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBodyScope"

    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:310:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );
    public final TinyHaxeTry1Parser.classBody_return classBody() throws RecognitionException {
        TinyHaxeTry1Parser.classBody_return retval = new TinyHaxeTry1Parser.classBody_return();
        retval.start = input.LT(1);
        int classBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl355 = null;

        TinyHaxeTry1Parser.classBody_return classBody356 = null;

        TinyHaxeTry1Parser.funcDecl_return funcDecl357 = null;

        TinyHaxeTry1Parser.classBody_return classBody358 = null;

        TinyHaxeTry1Parser.pp_return pp359 = null;

        TinyHaxeTry1Parser.classBody_return classBody360 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:310:19: ( varDecl classBody | funcDecl classBody | pp classBody | )
            int alt67=4;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:310:21: varDecl classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_classBody4170);
                    varDecl355=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl355.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody4172);
                    classBody356=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody356.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:311:25: funcDecl classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcDecl_in_classBody4198);
                    funcDecl357=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl357.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody4200);
                    classBody358=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody358.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:312:25: pp classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_classBody4226);
                    pp359=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp359.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody4228);
                    classBody360=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody360.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:314:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 74, classBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBody"

    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:315:1: interfaceDecl : INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
    public final TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceDecl_return retval = new TinyHaxeTry1Parser.interfaceDecl_return();
        retval.start = input.LT(1);
        int interfaceDecl_StartIndex = input.index();
        Object root_0 = null;

        Token INTERFACE361=null;
        Token LBRACE364=null;
        Token RBRACE366=null;
        TinyHaxeTry1Parser.type_return type362 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt363 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody365 = null;


        Object INTERFACE361_tree=null;
        Object LBRACE364_tree=null;
        Object RBRACE366_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:315:19: ( INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:315:21: INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            INTERFACE361=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl4263); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE361_tree = (Object)adaptor.create(INTERFACE361);
            adaptor.addChild(root_0, INTERFACE361_tree);
            }
            pushFollow(FOLLOW_type_in_interfaceDecl4265);
            type362=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type362.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl4267);
            inheritListOpt363=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt363.getTree());
            LBRACE364=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl4269); if (state.failed) return retval;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl4272);
            interfaceBody365=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody365.getTree());
            RBRACE366=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl4274); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, interfaceDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceDecl"

    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceBody"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:317:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );
    public final TinyHaxeTry1Parser.interfaceBody_return interfaceBody() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceBody_return retval = new TinyHaxeTry1Parser.interfaceBody_return();
        retval.start = input.LT(1);
        int interfaceBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl367 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody368 = null;

        TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl369 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody370 = null;

        TinyHaxeTry1Parser.pp_return pp371 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody372 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:317:19: ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | )
            int alt68=4;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:317:21: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_interfaceBody4288);
                    varDecl367=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl367.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4290);
                    interfaceBody368=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody368.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:318:25: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody4316);
                    funcProtoDecl369=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl369.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4318);
                    interfaceBody370=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody370.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:319:25: pp interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_interfaceBody4344);
                    pp371=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp371.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4346);
                    interfaceBody372=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody372.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:321:1: 
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
            if ( state.backtracking>0 ) { memoize(input, 76, interfaceBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceBody"

    public static class inheritList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:323:1: inheritList : inherit ( COMMA inherit )* ;
    public final TinyHaxeTry1Parser.inheritList_return inheritList() throws RecognitionException {
        TinyHaxeTry1Parser.inheritList_return retval = new TinyHaxeTry1Parser.inheritList_return();
        retval.start = input.LT(1);
        int inheritList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA374=null;
        TinyHaxeTry1Parser.inherit_return inherit373 = null;

        TinyHaxeTry1Parser.inherit_return inherit375 = null;


        Object COMMA374_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:323:19: ( inherit ( COMMA inherit )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:323:21: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inherit_in_inheritList4383);
            inherit373=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit373.getTree());
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:323:29: ( COMMA inherit )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==COMMA) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:323:30: COMMA inherit
            	    {
            	    COMMA374=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList4386); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inherit_in_inheritList4389);
            	    inherit375=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit375.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
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
            if ( state.backtracking>0 ) { memoize(input, 77, inheritList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritList"

    public static class inheritListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritListOpt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:326:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList ) | );
    public final TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.inheritListOpt_return retval = new TinyHaxeTry1Parser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.inheritList_return inheritList376 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:326:19: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList ) | )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=EXTENDS && LA70_0<=IMPLEMENTS)) ) {
                alt70=1;
            }
            else if ( (LA70_0==LBRACE) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:326:21: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt4405);
                    inheritList376=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList376.getTree());


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
                    // 326:33: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:326:35: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:328:6: 
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
            if ( state.backtracking>0 ) { memoize(input, 78, inheritListOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritListOpt"

    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inherit"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:330:1: inherit : ( EXTENDS type -> ^( EXTENDS type ) | IMPLEMENTS type -> ^( IMPLEMENTS type ) );
    public final TinyHaxeTry1Parser.inherit_return inherit() throws RecognitionException {
        TinyHaxeTry1Parser.inherit_return retval = new TinyHaxeTry1Parser.inherit_return();
        retval.start = input.LT(1);
        int inherit_StartIndex = input.index();
        Object root_0 = null;

        Token EXTENDS377=null;
        Token IMPLEMENTS379=null;
        TinyHaxeTry1Parser.type_return type378 = null;

        TinyHaxeTry1Parser.type_return type380 = null;


        Object EXTENDS377_tree=null;
        Object IMPLEMENTS379_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:330:9: ( EXTENDS type -> ^( EXTENDS type ) | IMPLEMENTS type -> ^( IMPLEMENTS type ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==EXTENDS) ) {
                alt71=1;
            }
            else if ( (LA71_0==IMPLEMENTS) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:330:11: EXTENDS type
                    {
                    EXTENDS377=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit4439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS377);

                    pushFollow(FOLLOW_type_in_inherit4441);
                    type378=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type378.getTree());


                    // AST REWRITE
                    // elements: type, EXTENDS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 330:24: -> ^( EXTENDS type )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:330:27: ^( EXTENDS type )
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
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:331:11: IMPLEMENTS type
                    {
                    IMPLEMENTS379=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit4461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS379);

                    pushFollow(FOLLOW_type_in_inherit4463);
                    type380=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type380.getTree());


                    // AST REWRITE
                    // elements: IMPLEMENTS, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 331:27: -> ^( IMPLEMENTS type )
                    {
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:331:30: ^( IMPLEMENTS type )
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
            if ( state.backtracking>0 ) { memoize(input, 79, inherit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inherit"

    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedefDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:334:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final TinyHaxeTry1Parser.typedefDecl_return typedefDecl() throws RecognitionException {
        TinyHaxeTry1Parser.typedefDecl_return retval = new TinyHaxeTry1Parser.typedefDecl_return();
        retval.start = input.LT(1);
        int typedefDecl_StartIndex = input.index();
        Object root_0 = null;

        Token TYPEDEF381=null;
        Token IDENTIFIER382=null;
        Token EQ383=null;
        TinyHaxeTry1Parser.funcType_return funcType384 = null;


        Object TYPEDEF381_tree=null;
        Object IDENTIFIER382_tree=null;
        Object EQ383_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:334:19: ( TYPEDEF IDENTIFIER EQ funcType )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:334:21: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            TYPEDEF381=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl4488); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF381_tree = (Object)adaptor.create(TYPEDEF381);
            adaptor.addChild(root_0, TYPEDEF381_tree);
            }
            IDENTIFIER382=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl4490); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER382_tree = (Object)adaptor.create(IDENTIFIER382);
            adaptor.addChild(root_0, IDENTIFIER382_tree);
            }
            EQ383=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl4492); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ383_tree = (Object)adaptor.create(EQ383);
            adaptor.addChild(root_0, EQ383_tree);
            }
            pushFollow(FOLLOW_funcType_in_typedefDecl4494);
            funcType384=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType384.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, typedefDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typedefDecl"

    public static class typeExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeExtend"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:1: typeExtend : GT funcType COMMA ;
    public final TinyHaxeTry1Parser.typeExtend_return typeExtend() throws RecognitionException {
        TinyHaxeTry1Parser.typeExtend_return retval = new TinyHaxeTry1Parser.typeExtend_return();
        retval.start = input.LT(1);
        int typeExtend_StartIndex = input.index();
        Object root_0 = null;

        Token GT385=null;
        Token COMMA387=null;
        TinyHaxeTry1Parser.funcType_return funcType386 = null;


        Object GT385_tree=null;
        Object COMMA387_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:19: ( GT funcType COMMA )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:21: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            GT385=(Token)match(input,GT,FOLLOW_GT_in_typeExtend4510); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT385_tree = (Object)adaptor.create(GT385);
            adaptor.addChild(root_0, GT385_tree);
            }
            pushFollow(FOLLOW_funcType_in_typeExtend4512);
            funcType386=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType386.getTree());
            COMMA387=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend4514); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, typeExtend_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeExtend"

    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonType"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:338:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
    public final TinyHaxeTry1Parser.anonType_return anonType() throws RecognitionException {
        TinyHaxeTry1Parser.anonType_return retval = new TinyHaxeTry1Parser.anonType_return();
        retval.start = input.LT(1);
        int anonType_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE388=null;
        Token RBRACE394=null;
        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList389 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList390 = null;

        TinyHaxeTry1Parser.typeExtend_return typeExtend391 = null;

        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList392 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList393 = null;


        Object LBRACE388_tree=null;
        Object RBRACE394_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:338:19: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:338:21: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            LBRACE388=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType4533); if (state.failed) return retval;
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:339:4: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt73=1;
                }
                break;
            case IDENTIFIER:
                {
                alt73=2;
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
                alt73=3;
                }
                break;
            case GT:
                {
                alt73=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:340:22: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:340:27: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType4568);
                    anonTypeFieldList389=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList389.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:341:26: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType4596);
                    varDeclList390=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList390.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:342:27: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType4625);
                    typeExtend391=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend391.getTree());
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:342:38: ( | anonTypeFieldList | varDeclList )
                    int alt72=3;
                    switch ( input.LA(1) ) {
                    case RBRACE:
                        {
                        alt72=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt72=2;
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
                        alt72=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }

                    switch (alt72) {
                        case 1 :
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:343:24: 
                            {
                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:343:25: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType4653);
                            anonTypeFieldList392=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList392.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:344:25: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType4679);
                            varDeclList393=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList393.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE394=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType4727); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, anonType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonType"

    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeFieldList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:348:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
    public final TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeFieldList_return retval = new TinyHaxeTry1Parser.anonTypeFieldList_return();
        retval.start = input.LT(1);
        int anonTypeFieldList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA396=null;
        TinyHaxeTry1Parser.anonTypeField_return anonTypeField395 = null;

        TinyHaxeTry1Parser.anonTypeField_return anonTypeField397 = null;


        Object COMMA396_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:348:19: ( anonTypeField ( COMMA anonTypeField )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:348:21: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4737);
            anonTypeField395=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField395.getTree());
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:348:35: ( COMMA anonTypeField )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==COMMA) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:348:36: COMMA anonTypeField
            	    {
            	    COMMA396=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList4740); if (state.failed) return retval;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4743);
            	    anonTypeField397=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField397.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 83, anonTypeFieldList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonTypeFieldList"

    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLit"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:351:1: objLit : '{' objLitElemList '}' ;
    public final TinyHaxeTry1Parser.objLit_return objLit() throws RecognitionException {
        TinyHaxeTry1Parser.objLit_return retval = new TinyHaxeTry1Parser.objLit_return();
        retval.start = input.LT(1);
        int objLit_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal398=null;
        Token char_literal400=null;
        TinyHaxeTry1Parser.objLitElemList_return objLitElemList399 = null;


        Object char_literal398_tree=null;
        Object char_literal400_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:351:19: ( '{' objLitElemList '}' )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:351:21: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal398=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit4766); if (state.failed) return retval;
            pushFollow(FOLLOW_objLitElemList_in_objLit4769);
            objLitElemList399=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList399.getTree());
            char_literal400=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit4771); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, objLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLit"

    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeField"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:353:1: anonTypeField : IDENTIFIER COLON funcType ;
    public final TinyHaxeTry1Parser.anonTypeField_return anonTypeField() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeField_return retval = new TinyHaxeTry1Parser.anonTypeField_return();
        retval.start = input.LT(1);
        int anonTypeField_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER401=null;
        Token COLON402=null;
        TinyHaxeTry1Parser.funcType_return funcType403 = null;


        Object IDENTIFIER401_tree=null;
        Object COLON402_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:353:19: ( IDENTIFIER COLON funcType )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:353:20: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER401=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField4783); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER401_tree = (Object)adaptor.create(IDENTIFIER401);
            adaptor.addChild(root_0, IDENTIFIER401_tree);
            }
            COLON402=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField4785); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_anonTypeField4788);
            funcType403=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType403.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, anonTypeField_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonTypeField"

    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElemList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
    public final TinyHaxeTry1Parser.objLitElemList_return objLitElemList() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElemList_return retval = new TinyHaxeTry1Parser.objLitElemList_return();
        retval.start = input.LT(1);
        int objLitElemList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA405=null;
        TinyHaxeTry1Parser.objLitElem_return objLitElem404 = null;

        TinyHaxeTry1Parser.objLitElem_return objLitElem406 = null;


        Object COMMA405_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:19: ( objLitElem ( COMMA objLitElem )* )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:21: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_objLitElem_in_objLitElemList4800);
            objLitElem404=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem404.getTree());
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:32: ( COMMA objLitElem )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==COMMA) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:33: COMMA objLitElem
            	    {
            	    COMMA405=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList4803); if (state.failed) return retval;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList4806);
            	    objLitElem406=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem406.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 86, objLitElemList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLitElemList"

    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElem"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:357:1: objLitElem : IDENTIFIER COLON expr ;
    public final TinyHaxeTry1Parser.objLitElem_return objLitElem() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElem_return retval = new TinyHaxeTry1Parser.objLitElem_return();
        retval.start = input.LT(1);
        int objLitElem_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER407=null;
        Token COLON408=null;
        TinyHaxeTry1Parser.expr_return expr409 = null;


        Object IDENTIFIER407_tree=null;
        Object COLON408_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:357:19: ( IDENTIFIER COLON expr )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:357:20: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER407=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem4823); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER407_tree = (Object)adaptor.create(IDENTIFIER407);
            adaptor.addChild(root_0, IDENTIFIER407_tree);
            }
            COLON408=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem4825); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_objLitElem4828);
            expr409=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr409.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, objLitElem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLitElem"

    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementarySymbol"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:360:1: elementarySymbol : ( LONGLITERAL | INTLITERAL | STRINGLITERAL | CHARLITERAL | FLOATNUM | TRUE | FALSE );
    public final TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        TinyHaxeTry1Parser.elementarySymbol_return retval = new TinyHaxeTry1Parser.elementarySymbol_return();
        retval.start = input.LT(1);
        int elementarySymbol_StartIndex = input.index();
        Object root_0 = null;

        Token set410=null;

        Object set410_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:361:2: ( LONGLITERAL | INTLITERAL | STRINGLITERAL | CHARLITERAL | FLOATNUM | TRUE | FALSE )
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set410=(Token)input.LT(1);
            if ( (input.LA(1)>=LONGLITERAL && input.LA(1)<=FALSE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set410));
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
            if ( state.backtracking>0 ) { memoize(input, 88, elementarySymbol_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred41_TinyHaxeTry1
    public final void synpred41_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:141:21: ( typeParam )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:141:21: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred41_TinyHaxeTry11626);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_TinyHaxeTry1

    // $ANTLR start synpred42_TinyHaxeTry1
    public final void synpred42_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:148:9: ( block )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:148:9: block
        {
        pushFollow(FOLLOW_block_in_synpred42_TinyHaxeTry11695);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_TinyHaxeTry1

    // $ANTLR start synpred43_TinyHaxeTry1
    public final void synpred43_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:149:7: ( assignExpr SEMI )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:149:7: assignExpr SEMI
        {
        pushFollow(FOLLOW_assignExpr_in_synpred43_TinyHaxeTry11703);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred43_TinyHaxeTry11705); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_TinyHaxeTry1

    // $ANTLR start synpred45_TinyHaxeTry1
    public final void synpred45_TinyHaxeTry1_fragment() throws RecognitionException {   
        TinyHaxeTry1Parser.statement_return st2 = null;


        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:151:41: ( ELSE st2= statement )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:151:41: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred45_TinyHaxeTry11733); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred45_TinyHaxeTry11737);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_TinyHaxeTry1

    // $ANTLR start synpred53_TinyHaxeTry1
    public final void synpred53_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:157:17: ( expr )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:157:17: expr
        {
        pushFollow(FOLLOW_expr_in_synpred53_TinyHaxeTry11951);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_TinyHaxeTry1

    // $ANTLR start synpred60_TinyHaxeTry1
    public final void synpred60_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:161:9: ( expr SEMI )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:161:9: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred60_TinyHaxeTry12047);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred60_TinyHaxeTry12050); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_TinyHaxeTry1

    // $ANTLR start synpred61_TinyHaxeTry1
    public final void synpred61_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:162:9: ( IDENTIFIER COLON statement )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:162:9: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred61_TinyHaxeTry12061); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred61_TinyHaxeTry12063); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred61_TinyHaxeTry12065);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_TinyHaxeTry1

    // $ANTLR start synpred64_TinyHaxeTry1
    public final void synpred64_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:175:4: ( varDecl )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:175:4: varDecl
        {
        pushFollow(FOLLOW_varDecl_in_synpred64_TinyHaxeTry12175);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_TinyHaxeTry1

    // $ANTLR start synpred68_TinyHaxeTry1
    public final void synpred68_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:199:21: ( exprList )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:199:21: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred68_TinyHaxeTry12387);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_TinyHaxeTry1

    // $ANTLR start synpred96_TinyHaxeTry1
    public final void synpred96_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:228:21: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:228:21: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
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

        pushFollow(FOLLOW_prefixExpr_in_synpred96_TinyHaxeTry12835);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_TinyHaxeTry1

    // $ANTLR start synpred99_TinyHaxeTry1
    public final void synpred99_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:235:4: ( value LPAREN exprListOpt RPAREN )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:235:4: value LPAREN exprListOpt RPAREN
        {
        pushFollow(FOLLOW_value_in_synpred99_TinyHaxeTry12932);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred99_TinyHaxeTry12934); if (state.failed) return ;
        pushFollow(FOLLOW_exprListOpt_in_synpred99_TinyHaxeTry12936);
        exprListOpt();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred99_TinyHaxeTry12938); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_TinyHaxeTry1

    // $ANTLR start synpred100_TinyHaxeTry1
    public final void synpred100_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:236:4: ( value LBRACKET expr RBRACKET )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:236:4: value LBRACKET expr RBRACKET
        {
        pushFollow(FOLLOW_value_in_synpred100_TinyHaxeTry12958);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred100_TinyHaxeTry12960); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred100_TinyHaxeTry12962);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred100_TinyHaxeTry12964); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_TinyHaxeTry1

    // $ANTLR start synpred101_TinyHaxeTry1
    public final void synpred101_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:237:4: ( value PLUSPLUS )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:237:4: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred101_TinyHaxeTry12969);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred101_TinyHaxeTry12971); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_TinyHaxeTry1

    // $ANTLR start synpred102_TinyHaxeTry1
    public final void synpred102_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:238:4: ( value SUBSUB )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:238:4: value SUBSUB
        {
        pushFollow(FOLLOW_value_in_synpred102_TinyHaxeTry12989);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred102_TinyHaxeTry12991); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred102_TinyHaxeTry1

    // $ANTLR start synpred104_TinyHaxeTry1
    public final void synpred104_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:243:4: ( arrayLit )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:243:4: arrayLit
        {
        pushFollow(FOLLOW_arrayLit_in_synpred104_TinyHaxeTry13027);
        arrayLit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_TinyHaxeTry1

    // $ANTLR start synpred108_TinyHaxeTry1
    public final void synpred108_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:23: ( expr )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:23: expr
        {
        pushFollow(FOLLOW_expr_in_synpred108_TinyHaxeTry13091);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_TinyHaxeTry1

    // $ANTLR start synpred109_TinyHaxeTry1
    public final void synpred109_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:14: ( LPAREN ( expr | statement ) RPAREN )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:14: LPAREN ( expr | statement ) RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred109_TinyHaxeTry13087); if (state.failed) return ;
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:22: ( expr | statement )
        int alt85=2;
        alt85 = dfa85.predict(input);
        switch (alt85) {
            case 1 :
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:23: expr
                {
                pushFollow(FOLLOW_expr_in_synpred109_TinyHaxeTry13091);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:28: statement
                {
                pushFollow(FOLLOW_statement_in_synpred109_TinyHaxeTry13093);
                statement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred109_TinyHaxeTry13096); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_TinyHaxeTry1

    // $ANTLR start synpred112_TinyHaxeTry1
    public final void synpred112_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:254:21: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:254:21: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred112_TinyHaxeTry13193); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred112_TinyHaxeTry13195); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred112_TinyHaxeTry13197);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:254:38: ( COMMA funcType )?
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( (LA86_0==COMMA) ) {
            alt86=1;
        }
        switch (alt86) {
            case 1 :
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:254:39: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred112_TinyHaxeTry13200); if (state.failed) return ;
                pushFollow(FOLLOW_funcType_in_synpred112_TinyHaxeTry13202);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred112_TinyHaxeTry13206); if (state.failed) return ;

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
    public final boolean synpred61_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred68_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred64_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_TinyHaxeTry1_fragment(); // can never throw exception
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


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA85 dfa85 = new DFA85(this);
    static final String DFA22_eotS =
        "\44\uffff";
    static final String DFA22_eofS =
        "\1\2\43\uffff";
    static final String DFA22_minS =
        "\1\17\1\0\42\uffff";
    static final String DFA22_maxS =
        "\1\u009c\1\0\42\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\40\uffff\1\1";
    static final String DFA22_specialS =
        "\1\uffff\1\0\42\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\2\11\uffff\2\2\1\uffff\2\2\1\uffff\1\2\6\uffff\1\2\2\uffff"+
            "\1\1\1\2\3\uffff\1\2\4\uffff\2\2\7\uffff\22\2\10\uffff\1\2\3"+
            "\uffff\2\2\45\uffff\10\2\21\uffff\3\2",
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
            return "141:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam ) | );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_1);
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
    static final String DFA28_eotS =
        "\71\uffff";
    static final String DFA28_eofS =
        "\71\uffff";
    static final String DFA28_minS =
        "\1\17\43\0\25\uffff";
    static final String DFA28_maxS =
        "\1\u009c\43\0\25\uffff";
    static final String DFA28_acceptS =
        "\44\uffff\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\1\1\2\1\16\1\20\1\17";
    static final String DFA28_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\25\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\2\1\13\2\uffff\6\44\1\uffff\1\41\1\6\1\12\1\uffff\1\7\2"+
            "\uffff\1\23\7\uffff\1\16\1\36\1\52\1\uffff\1\53\1\uffff\1\54"+
            "\1\55\1\56\1\57\1\1\1\uffff\1\60\1\61\1\62\1\63\3\uffff\1\42"+
            "\1\40\1\37\1\32\1\33\1\34\1\35\1\27\1\30\1\31\1\24\1\25\1\26"+
            "\1\22\1\15\1\17\1\20\1\21\1\14\1\3\1\23\1\10\1\4\1\5\1\uffff"+
            "\1\44\1\43\6\uffff\7\11\35\uffff\10\43\21\uffff\3\43",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "147:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO parExpression statement ) | TRY block catchStmtList -> ^( TRY block catchStmtList ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH expr ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 55;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_5 = input.LA(1);

                         
                        int index28_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_6 = input.LA(1);

                         
                        int index28_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_7 = input.LA(1);

                         
                        int index28_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_8 = input.LA(1);

                         
                        int index28_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA28_9 = input.LA(1);

                         
                        int index28_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA28_10 = input.LA(1);

                         
                        int index28_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA28_11 = input.LA(1);

                         
                        int index28_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 56;}

                         
                        input.seek(index28_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA28_12 = input.LA(1);

                         
                        int index28_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA28_13 = input.LA(1);

                         
                        int index28_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA28_14 = input.LA(1);

                         
                        int index28_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA28_15 = input.LA(1);

                         
                        int index28_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA28_16 = input.LA(1);

                         
                        int index28_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA28_17 = input.LA(1);

                         
                        int index28_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA28_18 = input.LA(1);

                         
                        int index28_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA28_19 = input.LA(1);

                         
                        int index28_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA28_20 = input.LA(1);

                         
                        int index28_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA28_21 = input.LA(1);

                         
                        int index28_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA28_22 = input.LA(1);

                         
                        int index28_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA28_23 = input.LA(1);

                         
                        int index28_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA28_24 = input.LA(1);

                         
                        int index28_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA28_25 = input.LA(1);

                         
                        int index28_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA28_26 = input.LA(1);

                         
                        int index28_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA28_27 = input.LA(1);

                         
                        int index28_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA28_28 = input.LA(1);

                         
                        int index28_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA28_29 = input.LA(1);

                         
                        int index28_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA28_30 = input.LA(1);

                         
                        int index28_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA28_31 = input.LA(1);

                         
                        int index28_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA28_32 = input.LA(1);

                         
                        int index28_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA28_33 = input.LA(1);

                         
                        int index28_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA28_34 = input.LA(1);

                         
                        int index28_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA28_35 = input.LA(1);

                         
                        int index28_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 53;}

                        else if ( (synpred60_TinyHaxeTry1()) ) {s = 54;}

                         
                        input.seek(index28_35);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\67\uffff";
    static final String DFA31_eofS =
        "\67\uffff";
    static final String DFA31_minS =
        "\1\17\6\0\60\uffff";
    static final String DFA31_maxS =
        "\1\u009c\6\0\60\uffff";
    static final String DFA31_acceptS =
        "\7\uffff\1\2\1\uffff\1\3\54\uffff\1\1";
    static final String DFA31_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\60\uffff}>";
    static final String[] DFA31_transitionS = {
            "\2\11\2\uffff\2\5\1\1\1\2\1\3\1\4\1\uffff\3\11\1\uffff\1\11"+
            "\2\uffff\1\11\7\uffff\3\11\1\uffff\1\11\1\uffff\5\11\1\uffff"+
            "\4\11\3\uffff\30\11\1\uffff\1\6\1\11\2\7\4\uffff\7\11\35\uffff"+
            "\10\11\21\uffff\3\11",
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
            return "174:1: blockStmt : ( varDecl | classDecl | statement );";
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
                        if ( (synpred64_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_TinyHaxeTry1()) ) {s = 54;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index31_6);
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
    static final String DFA50_eotS =
        "\52\uffff";
    static final String DFA50_eofS =
        "\1\12\51\uffff";
    static final String DFA50_minS =
        "\1\17\7\0\42\uffff";
    static final String DFA50_maxS =
        "\1\u009c\7\0\42\uffff";
    static final String DFA50_acceptS =
        "\10\uffff\1\3\1\4\1\5\35\uffff\1\1\1\2";
    static final String DFA50_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\42\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\12\1\7\10\uffff\2\12\1\1\1\6\1\12\1\2\1\12\6\uffff\1\12"+
            "\2\uffff\2\12\3\uffff\1\12\4\uffff\1\3\1\12\7\uffff\22\12\1"+
            "\11\1\10\1\uffff\1\4\4\uffff\1\12\6\uffff\7\5\35\uffff\10\12"+
            "\21\uffff\3\12",
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
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "234:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB ) | value typeParamOpt );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_1 = input.LA(1);

                         
                        int index50_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 40;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_2 = input.LA(1);

                         
                        int index50_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 40;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_3 = input.LA(1);

                         
                        int index50_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 40;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_4 = input.LA(1);

                         
                        int index50_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 40;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_5 = input.LA(1);

                         
                        int index50_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 40;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA50_6 = input.LA(1);

                         
                        int index50_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 40;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA50_7 = input.LA(1);

                         
                        int index50_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 40;}

                        else if ( (synpred100_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred101_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\52\uffff";
    static final String DFA52_eofS =
        "\1\10\51\uffff";
    static final String DFA52_minS =
        "\1\17\1\uffff\1\0\3\uffff\1\0\43\uffff";
    static final String DFA52_maxS =
        "\1\u009c\1\uffff\1\0\3\uffff\1\0\43\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\uffff\1\7\1\10\37\uffff\1\2"+
        "\1\6";
    static final String DFA52_specialS =
        "\2\uffff\1\0\3\uffff\1\1\43\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\10\1\7\10\uffff\2\10\1\1\1\6\1\10\1\2\1\10\6\uffff\1\10"+
            "\2\uffff\2\10\3\uffff\1\10\4\uffff\1\3\1\10\7\uffff\24\10\1"+
            "\uffff\1\4\4\uffff\1\10\6\uffff\7\5\35\uffff\10\10\21\uffff"+
            "\3\10",
            "",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "242:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_2 = input.LA(1);

                         
                        int index52_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 40;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index52_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_6 = input.LA(1);

                         
                        int index52_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index52_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\65\uffff";
    static final String DFA51_eofS =
        "\65\uffff";
    static final String DFA51_minS =
        "\1\17\42\0\22\uffff";
    static final String DFA51_maxS =
        "\1\u009c\42\0\22\uffff";
    static final String DFA51_acceptS =
        "\43\uffff\1\1\1\2\20\uffff";
    static final String DFA51_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\22\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\44\1\12\2\uffff\6\44\1\uffff\1\40\1\4\1\11\1\43\1\5\2\uffff"+
            "\1\22\7\uffff\1\15\1\35\1\44\1\uffff\1\44\1\uffff\4\44\1\6\1"+
            "\uffff\4\44\3\uffff\1\41\1\37\1\36\1\31\1\32\1\33\1\34\1\26"+
            "\1\27\1\30\1\23\1\24\1\25\1\21\1\14\1\16\1\17\1\20\1\13\1\1"+
            "\1\22\1\7\1\2\1\3\1\uffff\1\44\1\42\6\uffff\7\10\35\uffff\10"+
            "\42\21\uffff\3\42",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "247:22: ( expr | statement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_1 = input.LA(1);

                         
                        int index51_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_2 = input.LA(1);

                         
                        int index51_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_3 = input.LA(1);

                         
                        int index51_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA51_4 = input.LA(1);

                         
                        int index51_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA51_5 = input.LA(1);

                         
                        int index51_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA51_6 = input.LA(1);

                         
                        int index51_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA51_7 = input.LA(1);

                         
                        int index51_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA51_8 = input.LA(1);

                         
                        int index51_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA51_9 = input.LA(1);

                         
                        int index51_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA51_10 = input.LA(1);

                         
                        int index51_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA51_11 = input.LA(1);

                         
                        int index51_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA51_12 = input.LA(1);

                         
                        int index51_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA51_13 = input.LA(1);

                         
                        int index51_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA51_14 = input.LA(1);

                         
                        int index51_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA51_15 = input.LA(1);

                         
                        int index51_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA51_16 = input.LA(1);

                         
                        int index51_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA51_17 = input.LA(1);

                         
                        int index51_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA51_18 = input.LA(1);

                         
                        int index51_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA51_19 = input.LA(1);

                         
                        int index51_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA51_20 = input.LA(1);

                         
                        int index51_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA51_21 = input.LA(1);

                         
                        int index51_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA51_22 = input.LA(1);

                         
                        int index51_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA51_23 = input.LA(1);

                         
                        int index51_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA51_24 = input.LA(1);

                         
                        int index51_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA51_25 = input.LA(1);

                         
                        int index51_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA51_26 = input.LA(1);

                         
                        int index51_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA51_27 = input.LA(1);

                         
                        int index51_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA51_28 = input.LA(1);

                         
                        int index51_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA51_29 = input.LA(1);

                         
                        int index51_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA51_30 = input.LA(1);

                         
                        int index51_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA51_31 = input.LA(1);

                         
                        int index51_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA51_32 = input.LA(1);

                         
                        int index51_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA51_33 = input.LA(1);

                         
                        int index51_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA51_34 = input.LA(1);

                         
                        int index51_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index51_34);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\11\uffff";
    static final String DFA64_eofS =
        "\11\uffff";
    static final String DFA64_minS =
        "\6\23\1\20\2\uffff";
    static final String DFA64_maxS =
        "\6\33\1\122\2\uffff";
    static final String DFA64_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA64_specialS =
        "\11\uffff}>";
    static final String[] DFA64_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\6",
            "\1\10\101\uffff\1\7",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "296:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? ) );";
        }
    }
    static final String DFA65_eotS =
        "\14\uffff";
    static final String DFA65_eofS =
        "\14\uffff";
    static final String DFA65_minS =
        "\6\23\2\20\4\uffff";
    static final String DFA65_maxS =
        "\6\33\2\122\4\uffff";
    static final String DFA65_acceptS =
        "\10\uffff\1\3\1\4\1\2\1\1";
    static final String DFA65_specialS =
        "\14\uffff}>";
    static final String[] DFA65_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\1\11\101\uffff\1\10",
            "\1\12\101\uffff\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "300:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );";
        }
    }
    static final String DFA67_eotS =
        "\12\uffff";
    static final String DFA67_eofS =
        "\1\11\11\uffff";
    static final String DFA67_minS =
        "\6\23\4\uffff";
    static final String DFA67_maxS =
        "\6\125\4\uffff";
    static final String DFA67_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA67_specialS =
        "\12\uffff}>";
    static final String[] DFA67_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\4\uffff\1\10\1\uffff\4\10"+
            "\16\uffff\1\11\40\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\71\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\71\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\71\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\71\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\71\uffff\1\6",
            "",
            "",
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
            return "310:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );";
        }
    }
    static final String DFA68_eotS =
        "\12\uffff";
    static final String DFA68_eofS =
        "\1\11\11\uffff";
    static final String DFA68_minS =
        "\6\23\4\uffff";
    static final String DFA68_maxS =
        "\6\125\4\uffff";
    static final String DFA68_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA68_specialS =
        "\12\uffff}>";
    static final String[] DFA68_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\4\uffff\1\10\1\uffff\4\10"+
            "\16\uffff\1\11\40\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\71\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\71\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\71\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\71\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\71\uffff\1\6",
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
            return "317:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );";
        }
    }
    static final String DFA85_eotS =
        "\65\uffff";
    static final String DFA85_eofS =
        "\65\uffff";
    static final String DFA85_minS =
        "\1\17\42\0\22\uffff";
    static final String DFA85_maxS =
        "\1\u009c\42\0\22\uffff";
    static final String DFA85_acceptS =
        "\43\uffff\1\1\1\2\20\uffff";
    static final String DFA85_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\22\uffff}>";
    static final String[] DFA85_transitionS = {
            "\1\44\1\12\2\uffff\6\44\1\uffff\1\40\1\4\1\11\1\43\1\5\2\uffff"+
            "\1\22\7\uffff\1\15\1\35\1\44\1\uffff\1\44\1\uffff\4\44\1\6\1"+
            "\uffff\4\44\3\uffff\1\41\1\37\1\36\1\31\1\32\1\33\1\34\1\26"+
            "\1\27\1\30\1\23\1\24\1\25\1\21\1\14\1\16\1\17\1\20\1\13\1\1"+
            "\1\22\1\7\1\2\1\3\1\uffff\1\44\1\42\6\uffff\7\10\35\uffff\10"+
            "\42\21\uffff\3\42",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "247:22: ( expr | statement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_1 = input.LA(1);

                         
                        int index85_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA85_2 = input.LA(1);

                         
                        int index85_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA85_3 = input.LA(1);

                         
                        int index85_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA85_4 = input.LA(1);

                         
                        int index85_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA85_5 = input.LA(1);

                         
                        int index85_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA85_6 = input.LA(1);

                         
                        int index85_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA85_7 = input.LA(1);

                         
                        int index85_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA85_8 = input.LA(1);

                         
                        int index85_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA85_9 = input.LA(1);

                         
                        int index85_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA85_10 = input.LA(1);

                         
                        int index85_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA85_11 = input.LA(1);

                         
                        int index85_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA85_12 = input.LA(1);

                         
                        int index85_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA85_13 = input.LA(1);

                         
                        int index85_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA85_14 = input.LA(1);

                         
                        int index85_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA85_15 = input.LA(1);

                         
                        int index85_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA85_16 = input.LA(1);

                         
                        int index85_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA85_17 = input.LA(1);

                         
                        int index85_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA85_18 = input.LA(1);

                         
                        int index85_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA85_19 = input.LA(1);

                         
                        int index85_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA85_20 = input.LA(1);

                         
                        int index85_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA85_21 = input.LA(1);

                         
                        int index85_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA85_22 = input.LA(1);

                         
                        int index85_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA85_23 = input.LA(1);

                         
                        int index85_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA85_24 = input.LA(1);

                         
                        int index85_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA85_25 = input.LA(1);

                         
                        int index85_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA85_26 = input.LA(1);

                         
                        int index85_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA85_27 = input.LA(1);

                         
                        int index85_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA85_28 = input.LA(1);

                         
                        int index85_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA85_29 = input.LA(1);

                         
                        int index85_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA85_30 = input.LA(1);

                         
                        int index85_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA85_31 = input.LA(1);

                         
                        int index85_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA85_32 = input.LA(1);

                         
                        int index85_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA85_33 = input.LA(1);

                         
                        int index85_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA85_34 = input.LA(1);

                         
                        int index85_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_TinyHaxeTry1()) ) {s = 35;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index85_34);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module111 = new BitSet(new long[]{0x0000003D00040000L,0x0000000013900000L});
    public static final BitSet FOLLOW_topLevelList_in_module114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList150 = new BitSet(new long[]{0x0000003D00040002L,0x0000000013900000L});
    public static final BitSet FOLLOW_myImport_in_topLevel169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_topLevel195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage240 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage242 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_myPackage244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier275 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier291 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier295 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_IMPORT_in_myImport337 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport340 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_myImport342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_access0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_declAttr429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList547 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_param_in_paramList588 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList591 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_param_in_paramList593 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_QUES_in_param632 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param635 = new BitSet(new long[]{0x0000004000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_varInit_in_param639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dotIdent678 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_DOT_in_dotIdent686 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dotIdent690 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit1026 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit1028 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcLit1030 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit1032 = new BitSet(new long[]{0x0008004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit1034 = new BitSet(new long[]{0x0008004000008000L});
    public static final BitSet FOLLOW_block_in_funcLit1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit1068 = new BitSet(new long[]{0x00080202D8010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit1071 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppIf_in_pp1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElseIf_in_pp1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElse_in_pp1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppEnd_in_pp1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppError_in_pp1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_IF_in_ppIf1227 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_IF_in_ppIf1255 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_BANG_in_ppIf1257 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1277 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1304 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_BANG_in_ppElseIf1306 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSE_in_ppElse1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_END_in_ppEnd1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ERROR_in_ppError1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1391 = new BitSet(new long[]{0x0008010000010000L});
    public static final BitSet FOLLOW_funcType_in_typeTag1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1462 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1465 = new BitSet(new long[]{0x0008010000010000L});
    public static final BitSet FOLLOW_funcType_in_typeList1468 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1496 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1499 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1502 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_type_in_funcType1542 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1546 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_type_in_funcType1549 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_VOID_in_funcType1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_type1579 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_dotIdent_in_type1583 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_typeParam_in_type1587 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_GT_in_typeParam1606 = new BitSet(new long[]{0x0008010000010000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1609 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1658 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1660 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1662 = new BitSet(new long[]{0x0008010000010000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1664 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_statement1703 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_statement1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1724 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1726 = new BitSet(new long[]{0x01EFAA4259F98000L,0x0000000FE02FC400L});
    public static final BitSet FOLLOW_statement_in_statement1730 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1733 = new BitSet(new long[]{0x01EFAA4259F98000L,0x0000000FE02FC400L});
    public static final BitSet FOLLOW_statement_in_statement1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1781 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1783 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_statement1787 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IN_in_statement1789 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_statement1793 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1795 = new BitSet(new long[]{0x01EFAA4259F98000L,0x0000000FE02FC400L});
    public static final BitSet FOLLOW_statement_in_statement1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1828 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1830 = new BitSet(new long[]{0x01EFAA4259F98000L,0x0000000FE02FC400L});
    public static final BitSet FOLLOW_statement_in_statement1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1855 = new BitSet(new long[]{0x01EFAA4259F98000L,0x0000000FE02FC400L});
    public static final BitSet FOLLOW_statement_in_statement1857 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1859 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1861 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_statement1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement1886 = new BitSet(new long[]{0x0008004000008000L});
    public static final BitSet FOLLOW_block_in_statement1888 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_catchStmtList_in_statement1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement1911 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1913 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_statement1915 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1917 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_statement1919 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_caseStmt_in_statement1921 = new BitSet(new long[]{0x0610000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_statement1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1948 = new BitSet(new long[]{0x0008020258018000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_statement1951 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_statement1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1973 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_statement1975 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_statement1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1995 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1998 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_statement2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2021 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2024 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_statement2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2047 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_statement2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2061 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_statement2063 = new BitSet(new long[]{0x01EFAA4259F98000L,0x0000000FE02FC400L});
    public static final BitSet FOLLOW_statement_in_statement2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2110 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_parExpression2113 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2137 = new BitSet(new long[]{0x01FFAA4259F98000L,0x0000000FE1AFC400L});
    public static final BitSet FOLLOW_blockStmt_in_block2140 = new BitSet(new long[]{0x01FFAA4259F98000L,0x0000000FE1AFC400L});
    public static final BitSet FOLLOW_RBRACE_in_block2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt2216 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt2233 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2246 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2248 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2250 = new BitSet(new long[]{0x01EFAA4259F98000L,0x0000000FE02FC400L});
    public static final BitSet FOLLOW_statement_in_caseStmt2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2267 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2269 = new BitSet(new long[]{0x01EFAA4259F98000L,0x0000000FE02FC400L});
    public static final BitSet FOLLOW_statement_in_caseStmt2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt2295 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList2311 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2352 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2354 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_param_in_catchStmt2356 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2358 = new BitSet(new long[]{0x0008004000008000L});
    public static final BitSet FOLLOW_block_in_catchStmt2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2427 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2430 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_exprList2433 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2473 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L,0x000000001C0001FEL});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2476 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L,0x000000001C0001FEL});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2500 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2503 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2506 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2529 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2532 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2535 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2537 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2540 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2558 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2562 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2565 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2582 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2586 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2589 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2611 = new BitSet(new long[]{0x8000060000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2616 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2620 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2625 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2630 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2635 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2640 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2645 = new BitSet(new long[]{0x8000060000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2667 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2671 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2674 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2678 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2681 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2684 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2687 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2708 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2712 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2716 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr2720 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2724 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2728 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2731 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2754 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2759 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_SUB_in_addExpr2764 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2768 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2790 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_STAR_in_multExpr2795 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2798 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2801 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2805 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_set_in_prefixExpr2823 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2932 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_suffixExpr2934 = new BitSet(new long[]{0x0008020278010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2936 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_suffixExpr2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2958 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2960 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_suffixExpr2962 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RBRACKET_in_suffixExpr2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3010 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_suffixExpr3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value3087 = new BitSet(new long[]{0x01EFAA4259F98000L,0x0000000FE02FC400L});
    public static final BitSet FOLLOW_expr_in_value3091 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_statement_in_value3093 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_value3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_value3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr3154 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_type_in_newExpr3156 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr3158 = new BitSet(new long[]{0x0008020278010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr3160 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3193 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3195 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_cast3197 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_COMMA_in_cast3200 = new BitSet(new long[]{0x0008010000010000L});
    public static final BitSet FOLLOW_funcType_in_cast3202 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3222 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3224 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_cast3226 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl3347 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl3349 = new BitSet(new long[]{0x0008020000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3351 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumDecl3353 = new BitSet(new long[]{0x0000003D00010000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl3355 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumDecl3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody3388 = new BitSet(new long[]{0x0000003D00010002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3402 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3404 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl3407 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3409 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3438 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_enumValueDecl3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList3482 = new BitSet(new long[]{0x0000000001F80000L,0x0000000000200000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl3506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_VAR_in_varDecl3510 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3512 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3542 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList3545 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3548 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3564 = new BitSet(new long[]{0x0000004010000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3566 = new BitSet(new long[]{0x0000004000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_varInit_in_varDeclPart3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl3588 = new BitSet(new long[]{0x0400000000810000L,0x0000000000020000L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3592 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl3594 = new BitSet(new long[]{0x0400000000810000L,0x0000000000020000L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3598 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit3763 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_varInit3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3790 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl3795 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3797 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3799 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3801 = new BitSet(new long[]{0x0008004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3803 = new BitSet(new long[]{0x0008004000008000L});
    public static final BitSet FOLLOW_block_in_funcDecl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3833 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3836 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3838 = new BitSet(new long[]{0x0000020010000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3840 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3842 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3844 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3846 = new BitSet(new long[]{0x0008004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3848 = new BitSet(new long[]{0x0008004000008000L});
    public static final BitSet FOLLOW_block_in_funcDecl3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3889 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3893 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3895 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3897 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3899 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3901 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3943 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3945 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3947 = new BitSet(new long[]{0x0000020010000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3949 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3951 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3953 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3955 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3957 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4002 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4004 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4006 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4008 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4010 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4050 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4052 = new BitSet(new long[]{0x0000020010000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4054 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4056 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4058 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4060 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4062 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERN_in_classDecl4094 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4097 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4099 = new BitSet(new long[]{0x0008020000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4101 = new BitSet(new long[]{0x0008000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4103 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_classDecl4105 = new BitSet(new long[]{0x0000003D09F80000L,0x0000000000200000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4107 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_classDecl4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classBody_in_classBodyScope4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classBody4170 = new BitSet(new long[]{0x0000003D09F80000L,0x0000000000200000L});
    public static final BitSet FOLLOW_classBody_in_classBody4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classBody4198 = new BitSet(new long[]{0x0000003D09F80000L,0x0000000000200000L});
    public static final BitSet FOLLOW_classBody_in_classBody4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_classBody4226 = new BitSet(new long[]{0x0000003D09F80000L,0x0000000000200000L});
    public static final BitSet FOLLOW_classBody_in_classBody4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl4263 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl4265 = new BitSet(new long[]{0x0008000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl4267 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl4269 = new BitSet(new long[]{0x0010003D09F80000L,0x0000000000200000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl4272 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody4288 = new BitSet(new long[]{0x0000003D09F80000L,0x0000000000200000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody4316 = new BitSet(new long[]{0x0000003D09F80000L,0x0000000000200000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_interfaceBody4344 = new BitSet(new long[]{0x0000003D09F80000L,0x0000000000200000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList4383 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList4386 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList4389 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit4439 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_type_in_inherit4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit4461 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_type_in_inherit4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl4488 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl4490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl4492 = new BitSet(new long[]{0x0008010000010000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend4510 = new BitSet(new long[]{0x0008010000010000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend4512 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType4533 = new BitSet(new long[]{0x0010020001F90000L,0x0000000000200000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4568 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4596 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType4625 = new BitSet(new long[]{0x0010000001F90000L,0x0000000000200000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4653 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4679 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4737 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList4740 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4743 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit4766 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit4769 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField4783 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField4785 = new BitSet(new long[]{0x0008010000010000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4800 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList4803 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4806 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem4823 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem4825 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_objLitElem4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_elementarySymbol0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred41_TinyHaxeTry11626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred42_TinyHaxeTry11695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred43_TinyHaxeTry11703 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_synpred43_TinyHaxeTry11705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred45_TinyHaxeTry11733 = new BitSet(new long[]{0x01EFAA4259F98000L,0x0000000FE02FC400L});
    public static final BitSet FOLLOW_statement_in_synpred45_TinyHaxeTry11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred53_TinyHaxeTry11951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred60_TinyHaxeTry12047 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_synpred60_TinyHaxeTry12050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred61_TinyHaxeTry12061 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_synpred61_TinyHaxeTry12063 = new BitSet(new long[]{0x01EFAA4259F98000L,0x0000000FE02FC400L});
    public static final BitSet FOLLOW_statement_in_synpred61_TinyHaxeTry12065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred64_TinyHaxeTry12175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred68_TinyHaxeTry12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred96_TinyHaxeTry12823 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred96_TinyHaxeTry12835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred99_TinyHaxeTry12932 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred99_TinyHaxeTry12934 = new BitSet(new long[]{0x0008020278010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_exprListOpt_in_synpred99_TinyHaxeTry12936 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred99_TinyHaxeTry12938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred100_TinyHaxeTry12958 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred100_TinyHaxeTry12960 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_synpred100_TinyHaxeTry12962 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred100_TinyHaxeTry12964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred101_TinyHaxeTry12969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred101_TinyHaxeTry12971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred102_TinyHaxeTry12989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred102_TinyHaxeTry12991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_synpred104_TinyHaxeTry13027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred108_TinyHaxeTry13091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred109_TinyHaxeTry13087 = new BitSet(new long[]{0x01EFAA4259F98000L,0x0000000FE02FC400L});
    public static final BitSet FOLLOW_expr_in_synpred109_TinyHaxeTry13091 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_statement_in_synpred109_TinyHaxeTry13093 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred109_TinyHaxeTry13096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred112_TinyHaxeTry13193 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred112_TinyHaxeTry13195 = new BitSet(new long[]{0x0008020258010000L,0x0000000FE00FC400L});
    public static final BitSet FOLLOW_expr_in_synpred112_TinyHaxeTry13197 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred112_TinyHaxeTry13200 = new BitSet(new long[]{0x0008010000010000L});
    public static final BitSet FOLLOW_funcType_in_synpred112_TinyHaxeTry13202 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred112_TinyHaxeTry13206 = new BitSet(new long[]{0x0000000000000002L});

}