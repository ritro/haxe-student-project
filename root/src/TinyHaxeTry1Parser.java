// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\antlr\\TinyHaxeTry1.g 2010-03-24 04:06:46

import tree.ExtendedCommonTree;

import tree.specific.ClassNode;
import tree.specific.DoWhileNode;
import tree.specific.ForNode;
import tree.specific.FunctionNode;
import tree.specific.IfNode;
import tree.specific.SwitchNode;
import tree.specific.TryNode;
import tree.specific.WhileNode;
import tree.specific.VarDeclaration;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class TinyHaxeTry1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROPERTY_DECL", "MODULE", "SUFFIX_EXPR", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG", "TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "DECL_ATTR_LIST", "VAR_INIT", "PACKAGE", "SEMI", "IDENTIFIER", "DOT", "IMPORT", "PUBLIC", "PRIVATE", "STATIC", "INLINE", "DYNAMIC", "OVERRIDE", "COMMA", "QUES", "FUNCTION", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "PP_IF", "BANG", "PP_ELSEIF", "PP_ELSE", "PP_END", "PP_ERROR", "COLON", "MINUS_BIGGER", "GT", "LT", "IF", "ELSE", "WHILE", "DO", "RETURN", "THROW", "BREAK", "CONTINUE", "LBRACE", "RBRACE", "FOR", "IN", "CASE", "DEFAULT", "SWITCH", "TRY", "CATCH", "ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ", "BAR", "AMP", "CARET", "LTLT", "GTGT", "GTGTGT", "PLUS", "SUB", "STAR", "SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "TILDE", "NULL", "NEW", "CAST", "ENUM", "VAR", "EQ", "EXTERN", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "TYPEDEF", "LONGLITERAL", "INTLITERAL", "STRINGLITERAL", "CHARLITERAL", "FLOATNUM", "WS", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "EscapeSequence", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CONST", "DOUBLE", "FINAL", "FINALLY", "FLOAT", "GOTO", "INSTANCEOF", "INT", "LONG", "NATIVE", "PROTECTED", "SHORT", "STRICTFP", "SUPER", "THIS", "THROWS", "TRANSIENT", "VOID", "VOLATILE", "TRUE", "FALSE", "PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", "PERCENTEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "MONKEYS_AT", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "INTNUM", "EXPONENT", "COMMENT", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ", "'<<='", "'>>='", "'>>>='"
    };
    public static final int FUNCTION=27;
    public static final int PACKAGE=14;
    public static final int CAST=82;
    public static final int EXPONENT=148;
    public static final int LT=41;
    public static final int STAR=74;
    public static final int WHILE=44;
    public static final int FLOATNUM=96;
    public static final int CONST=108;
    public static final int OCTAL_ESC=152;
    public static final int CASE=54;
    public static final int CHAR=107;
    public static final int NEW=81;
    public static final int DO=45;
    public static final int EXTERN=86;
    public static final int EOF=-1;
    public static final int GTGT=70;
    public static final int BREAK=48;
    public static final int LBRACKET=30;
    public static final int FINAL=110;
    public static final int RPAREN=29;
    public static final int IMPORT=18;
    public static final int SUBSUB=77;
    public static final int STAREQ=131;
    public static final int CARET=68;
    public static final int THIS=122;
    public static final int RETURN=46;
    public static final int DOUBLE=109;
    public static final int MONKEYS_AT=143;
    public static final int BARBAR=60;
    public static final int VAR=84;
    public static final int VOID=125;
    public static final int SUPER=121;
    public static final int GOTO=113;
    public static final int EQ=85;
    public static final int COMMENT=149;
    public static final int T__154=154;
    public static final int AMPAMP=61;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int VAR_INIT=13;
    public static final int QUES=26;
    public static final int EQEQ=62;
    public static final int HexPrefix=100;
    public static final int PP_IF=32;
    public static final int PERCENTDBBQ=139;
    public static final int RBRACE=51;
    public static final int STATIC=21;
    public static final int PRIVATE=20;
    public static final int BLOCK_SCOPE=7;
    public static final int SWITCH=56;
    public static final int NULL=80;
    public static final int STRICTFP=120;
    public static final int ELSE=43;
    public static final int NATIVE=117;
    public static final int ELLIPSIS=59;
    public static final int THROWS=123;
    public static final int INT=115;
    public static final int SLASHEQ=132;
    public static final int INTLITERAL=93;
    public static final int PERCENTBB=145;
    public static final int TRY=57;
    public static final int LongSuffix=99;
    public static final int LONGLITERAL=92;
    public static final int PERCENTLL=144;
    public static final int BANGEQQ=142;
    public static final int WS=97;
    public static final int PERCENTDLQ=137;
    public static final int INHERIT_LIST_OPT=11;
    public static final int CHARLITERAL=95;
    public static final int GT=40;
    public static final int INLINE=22;
    public static final int CATCH=58;
    public static final int FALSE=128;
    public static final int EscapeSequence=103;
    public static final int THROW=47;
    public static final int DYNAMIC=23;
    public static final int PROTECTED=118;
    public static final int CLASS=87;
    public static final int PP_ELSEIF=34;
    public static final int BAREQ=134;
    public static final int PP_ELSE=35;
    public static final int IntegerNumber=98;
    public static final int AMP=67;
    public static final int PLUSPLUS=78;
    public static final int LBRACE=50;
    public static final int TYPE_PARAM_OPT=10;
    public static final int LTEQ=65;
    public static final int SUBEQ=130;
    public static final int GTGTGT=71;
    public static final int Exponent=102;
    public static final int FOR=52;
    public static final int SUFFIX_EXPR=6;
    public static final int SUB=73;
    public static final int FLOAT=112;
    public static final int ABSTRACT=104;
    public static final int MINUS_BIGGER=39;
    public static final int PERCENTDBQ=138;
    public static final int HexDigit=101;
    public static final int PLUSEQ=129;
    public static final int LPAREN=28;
    public static final int IF=42;
    public static final int INTNUM=147;
    public static final int ESC_SEQ=153;
    public static final int BOOLEAN=105;
    public static final int PP_END=36;
    public static final int SLASH=75;
    public static final int IN=53;
    public static final int IMPLEMENTS=90;
    public static final int CONTINUE=49;
    public static final int COMMA=25;
    public static final int AMPEQ=133;
    public static final int TRANSIENT=124;
    public static final int IDENTIFIER=16;
    public static final int TILDE=79;
    public static final int BANGEQ=63;
    public static final int PLUS=72;
    public static final int RBRACKET=31;
    public static final int DOT=17;
    public static final int LTLT=69;
    public static final int BYTE=106;
    public static final int PERCENT=76;
    public static final int VOLATILE=126;
    public static final int DECL_ATTR_LIST=12;
    public static final int TYPEDEF=91;
    public static final int UNICODE_ESC=151;
    public static final int EQEQEQ=140;
    public static final int DEFAULT=55;
    public static final int HEX_DIGIT=150;
    public static final int SHORT=119;
    public static final int BANG=33;
    public static final int INSTANCEOF=114;
    public static final int PP_ERROR=37;
    public static final int GTEQ=64;
    public static final int MODULE=5;
    public static final int TRUE=127;
    public static final int SEMI=15;
    public static final int COLON=38;
    public static final int PARAM_LIST=8;
    public static final int PERCENTLESQ=141;
    public static final int ENUM=83;
    public static final int PERCENTEQ=136;
    public static final int FINALLY=111;
    public static final int PROPERTY_DECL=4;
    public static final int OVERRIDE=24;
    public static final int STRINGLITERAL=94;
    public static final int CARETEQ=135;
    public static final int PERCENTBBB=146;
    public static final int INTERFACE=88;
    public static final int LONG=116;
    public static final int EXTENDS=89;
    public static final int PUBLIC=19;
    public static final int TYPE_TAG=9;
    public static final int BAR=66;

    // delegates
    // delegators


        public TinyHaxeTry1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TinyHaxeTry1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[238+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TinyHaxeTry1Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\antlr\\TinyHaxeTry1.g"; }


    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // C:\\antlr\\TinyHaxeTry1.g:36:1: module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:36:19: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList ) )
            // C:\\antlr\\TinyHaxeTry1.g:36:21: ( myPackage )? topLevelList
            {
            // C:\\antlr\\TinyHaxeTry1.g:36:21: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:0:0: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module103);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_topLevelList_in_module106);
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
            // 36:45: -> ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList )
            {
                // C:\\antlr\\TinyHaxeTry1.g:36:47: ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(MODULE, "MODULE", true), root_1);

                // C:\\antlr\\TinyHaxeTry1.g:36:91: ( myPackage )?
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
    // C:\\antlr\\TinyHaxeTry1.g:39:1: topLevelList : ( topLevel )* ;
    public final TinyHaxeTry1Parser.topLevelList_return topLevelList() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelList_return retval = new TinyHaxeTry1Parser.topLevelList_return();
        retval.start = input.LT(1);
        int topLevelList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.topLevel_return topLevel3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:39:19: ( ( topLevel )* )
            // C:\\antlr\\TinyHaxeTry1.g:39:22: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:39:22: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT||LA2_0==PP_IF||(LA2_0>=PP_ELSEIF && LA2_0<=PP_ERROR)||LA2_0==ENUM||(LA2_0>=EXTERN && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:39:23: topLevel
            	    {
            	    pushFollow(FOLLOW_topLevel_in_topLevelList142);
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
    // C:\\antlr\\TinyHaxeTry1.g:41:1: topLevel : ( myImport | pp | topLevelDecl );
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
            // C:\\antlr\\TinyHaxeTry1.g:41:19: ( myImport | pp | topLevelDecl )
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
                    // C:\\antlr\\TinyHaxeTry1.g:41:21: myImport
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_myImport_in_topLevel161);
                    myImport4=myImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, myImport4.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:42:25: pp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_topLevel187);
                    pp5=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp5.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:43:25: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topLevelDecl_in_topLevel213);
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
    // C:\\antlr\\TinyHaxeTry1.g:45:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:45:21: ( PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) )
            // C:\\antlr\\TinyHaxeTry1.g:45:23: PACKAGE dotIdent SEMI
            {
            PACKAGE7=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage232); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE.add(PACKAGE7);

            pushFollow(FOLLOW_dotIdent_in_myPackage234);
            dotIdent8=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent8.getTree());
            SEMI9=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage236); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI9);



            // AST REWRITE
            // elements: PACKAGE, dotIdent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 45:45: -> ^( PACKAGE dotIdent )
            {
                // C:\\antlr\\TinyHaxeTry1.g:45:48: ^( PACKAGE dotIdent )
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
    // C:\\antlr\\TinyHaxeTry1.g:48:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:49:5: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // C:\\antlr\\TinyHaxeTry1.g:49:9: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:49:9: (a= IDENTIFIER -> $a)
            // C:\\antlr\\TinyHaxeTry1.g:49:12: a= IDENTIFIER
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier267); if (state.failed) return retval; 
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
            // 49:27: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            // C:\\antlr\\TinyHaxeTry1.g:49:37: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DOT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:49:41: DOT ident= IDENTIFIER
            	    {
            	    DOT10=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier283); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT10);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier287); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(ident);



            	    // AST REWRITE
            	    // elements: ident, qualifiedIdentifier, DOT
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
            	    // 49:63: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // C:\\antlr\\TinyHaxeTry1.g:49:67: ^( DOT $qualifiedIdentifier $ident)
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
    // C:\\antlr\\TinyHaxeTry1.g:52:1: myImport : IMPORT dotIdent SEMI ;
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
            // C:\\antlr\\TinyHaxeTry1.g:52:21: ( IMPORT dotIdent SEMI )
            // C:\\antlr\\TinyHaxeTry1.g:52:23: IMPORT dotIdent SEMI
            {
            root_0 = (Object)adaptor.nil();

            IMPORT11=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_myImport329); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPORT11_tree = (Object)adaptor.create(IMPORT11);
            root_0 = (Object)adaptor.becomeRoot(IMPORT11_tree, root_0);
            }
            pushFollow(FOLLOW_dotIdent_in_myImport332);
            dotIdent12=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent12.getTree());
            SEMI13=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport334); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:56:1: access : ( PUBLIC | PRIVATE );
    public final TinyHaxeTry1Parser.access_return access() throws RecognitionException {
        TinyHaxeTry1Parser.access_return retval = new TinyHaxeTry1Parser.access_return();
        retval.start = input.LT(1);
        int access_StartIndex = input.index();
        Object root_0 = null;

        Token set14=null;

        Object set14_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:56:19: ( PUBLIC | PRIVATE )
            // C:\\antlr\\TinyHaxeTry1.g:
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
    // C:\\antlr\\TinyHaxeTry1.g:59:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
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
            // C:\\antlr\\TinyHaxeTry1.g:59:19: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
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
                    // C:\\antlr\\TinyHaxeTry1.g:59:21: STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    STATIC15=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr421); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC15_tree = (Object)adaptor.create(STATIC15);
                    adaptor.addChild(root_0, STATIC15_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:60:24: INLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    INLINE16=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr446); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE16_tree = (Object)adaptor.create(INLINE16);
                    adaptor.addChild(root_0, INLINE16_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:61:25: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    DYNAMIC17=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr472); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC17_tree = (Object)adaptor.create(DYNAMIC17);
                    adaptor.addChild(root_0, DYNAMIC17_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:62:25: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    OVERRIDE18=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE18_tree = (Object)adaptor.create(OVERRIDE18);
                    adaptor.addChild(root_0, OVERRIDE18_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:63:25: access
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_access_in_declAttr524);
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
    // C:\\antlr\\TinyHaxeTry1.g:65:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ ) ;
    public final TinyHaxeTry1Parser.declAttrList_return declAttrList() throws RecognitionException {
        TinyHaxeTry1Parser.declAttrList_return retval = new TinyHaxeTry1Parser.declAttrList_return();
        retval.start = input.LT(1);
        int declAttrList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.declAttr_return declAttr20 = null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:65:19: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ ) )
            // C:\\antlr\\TinyHaxeTry1.g:65:21: ( declAttr )+
            {
            // C:\\antlr\\TinyHaxeTry1.g:65:21: ( declAttr )+
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
            	    // C:\\antlr\\TinyHaxeTry1.g:65:22: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList539);
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
            // 65:33: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ )
            {
                // C:\\antlr\\TinyHaxeTry1.g:65:36: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ )
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
    // C:\\antlr\\TinyHaxeTry1.g:68:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ ) | );
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
            // C:\\antlr\\TinyHaxeTry1.g:68:19: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ ) | )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENTIFIER||LA8_0==QUES) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=LPAREN && LA8_0<=RPAREN)) ) {
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
                    // C:\\antlr\\TinyHaxeTry1.g:68:21: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList580);
                    param21=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param21.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:68:27: ( COMMA param )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:68:28: COMMA param
                    	    {
                    	    COMMA22=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList583); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA22);

                    	    pushFollow(FOLLOW_param_in_paramList585);
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
                    // 68:42: -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:68:45: ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ )
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
                    // C:\\antlr\\TinyHaxeTry1.g:70:2: 
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
    // C:\\antlr\\TinyHaxeTry1.g:71:1: param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( IDENTIFIER typeTagOpt ( varInit )? ( QUES )? ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:71:19: ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( IDENTIFIER typeTagOpt ( varInit )? ( QUES )? ) )
            // C:\\antlr\\TinyHaxeTry1.g:71:20: ( QUES )? IDENTIFIER typeTagOpt varInit
            {
            // C:\\antlr\\TinyHaxeTry1.g:71:20: ( QUES )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==QUES) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:0:0: QUES
                    {
                    QUES24=(Token)match(input,QUES,FOLLOW_QUES_in_param624); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES24);


                    }
                    break;

            }

            IDENTIFIER25=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER25);

            pushFollow(FOLLOW_typeTagOpt_in_param629);
            typeTagOpt26=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt26.getTree());
            pushFollow(FOLLOW_varInit_in_param631);
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
            // 71:56: -> ^( IDENTIFIER typeTagOpt ( varInit )? ( QUES )? )
            {
                // C:\\antlr\\TinyHaxeTry1.g:71:59: ^( IDENTIFIER typeTagOpt ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IDENTIFIER.nextNode(), root_1);

                adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                // C:\\antlr\\TinyHaxeTry1.g:71:83: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();
                // C:\\antlr\\TinyHaxeTry1.g:71:92: ( QUES )?
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
    // C:\\antlr\\TinyHaxeTry1.g:73:1: dotIdent : ( IDENTIFIER -> IDENTIFIER ) ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:73:19: ( ( IDENTIFIER -> IDENTIFIER ) ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )* )
            // C:\\antlr\\TinyHaxeTry1.g:73:21: ( IDENTIFIER -> IDENTIFIER ) ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:73:21: ( IDENTIFIER -> IDENTIFIER )
            // C:\\antlr\\TinyHaxeTry1.g:73:22: IDENTIFIER
            {
            IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dotIdent664); if (state.failed) return retval; 
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
            // 73:33: -> IDENTIFIER
            {
                adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

            }

            retval.tree = root_0;}
            }

            // C:\\antlr\\TinyHaxeTry1.g:73:48: ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DOT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:73:49: DOT ident= IDENTIFIER
            	    {
            	    DOT29=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent672); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT29);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dotIdent676); if (state.failed) return retval; 
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
            	    // 73:70: -> ^( DOT $dotIdent $ident)
            	    {
            	        // C:\\antlr\\TinyHaxeTry1.g:73:72: ^( DOT $dotIdent $ident)
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
    // C:\\antlr\\TinyHaxeTry1.g:75:1: assignOp : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '>>>=' );
    public final TinyHaxeTry1Parser.assignOp_return assignOp() throws RecognitionException {
        TinyHaxeTry1Parser.assignOp_return retval = new TinyHaxeTry1Parser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token set30=null;

        Object set30_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:75:19: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '>>>=' )
            // C:\\antlr\\TinyHaxeTry1.g:
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
    // C:\\antlr\\TinyHaxeTry1.g:88:1: funcLit : FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION paramList typeTagOpt block ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:88:19: ( FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION paramList typeTagOpt block ) )
            // C:\\antlr\\TinyHaxeTry1.g:88:21: FUNCTION LPAREN paramList RPAREN typeTagOpt block
            {
            FUNCTION31=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit1012); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION31);

            LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit1014); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN32);

            pushFollow(FOLLOW_paramList_in_funcLit1016);
            paramList33=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList33.getTree());
            RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit1018); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN34);

            pushFollow(FOLLOW_typeTagOpt_in_funcLit1020);
            typeTagOpt35=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt35.getTree());
            pushFollow(FOLLOW_block_in_funcLit1022);
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
            // 88:71: -> ^( FUNCTION paramList typeTagOpt block )
            {
                // C:\\antlr\\TinyHaxeTry1.g:88:74: ^( FUNCTION paramList typeTagOpt block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

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
    // C:\\antlr\\TinyHaxeTry1.g:90:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
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
            // C:\\antlr\\TinyHaxeTry1.g:90:18: ( LBRACKET exprListOpt RBRACKET )
            // C:\\antlr\\TinyHaxeTry1.g:90:20: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            LBRACKET37=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit1051); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit1054);
            exprListOpt38=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt38.getTree());
            RBRACKET39=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit1056); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:97:1: pp : ( ppIf | ppElseIf | ppElse | ppEnd | ppError );
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
            // C:\\antlr\\TinyHaxeTry1.g:97:19: ( ppIf | ppElseIf | ppElse | ppEnd | ppError )
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
                    // C:\\antlr\\TinyHaxeTry1.g:97:21: ppIf
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppIf_in_pp1084);
                    ppIf40=ppIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppIf40.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:98:25: ppElseIf
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppElseIf_in_pp1110);
                    ppElseIf41=ppElseIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppElseIf41.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:99:25: ppElse
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppElse_in_pp1136);
                    ppElse42=ppElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppElse42.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:100:25: ppEnd
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppEnd_in_pp1162);
                    ppEnd43=ppEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppEnd43.getTree());

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:101:25: ppError
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppError_in_pp1188);
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
    // C:\\antlr\\TinyHaxeTry1.g:103:1: ppIf : ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER );
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
            // C:\\antlr\\TinyHaxeTry1.g:103:19: ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER )
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
                    // C:\\antlr\\TinyHaxeTry1.g:103:21: PP_IF IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_IF45=(Token)match(input,PP_IF,FOLLOW_PP_IF_in_ppIf1210); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_IF45_tree = (Object)adaptor.create(PP_IF45);
                    adaptor.addChild(root_0, PP_IF45_tree);
                    }
                    IDENTIFIER46=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1212); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER46_tree = (Object)adaptor.create(IDENTIFIER46);
                    adaptor.addChild(root_0, IDENTIFIER46_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:104:25: PP_IF BANG IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_IF47=(Token)match(input,PP_IF,FOLLOW_PP_IF_in_ppIf1238); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_IF47_tree = (Object)adaptor.create(PP_IF47);
                    adaptor.addChild(root_0, PP_IF47_tree);
                    }
                    BANG48=(Token)match(input,BANG,FOLLOW_BANG_in_ppIf1240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANG48_tree = (Object)adaptor.create(BANG48);
                    adaptor.addChild(root_0, BANG48_tree);
                    }
                    IDENTIFIER49=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1242); if (state.failed) return retval;
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
    // C:\\antlr\\TinyHaxeTry1.g:106:1: ppElseIf : ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER );
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
            // C:\\antlr\\TinyHaxeTry1.g:106:19: ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER )
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
                    // C:\\antlr\\TinyHaxeTry1.g:106:21: PP_ELSEIF IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_ELSEIF50=(Token)match(input,PP_ELSEIF,FOLLOW_PP_ELSEIF_in_ppElseIf1260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_ELSEIF50_tree = (Object)adaptor.create(PP_ELSEIF50);
                    adaptor.addChild(root_0, PP_ELSEIF50_tree);
                    }
                    IDENTIFIER51=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1262); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER51_tree = (Object)adaptor.create(IDENTIFIER51);
                    adaptor.addChild(root_0, IDENTIFIER51_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:107:24: PP_ELSEIF BANG IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_ELSEIF52=(Token)match(input,PP_ELSEIF,FOLLOW_PP_ELSEIF_in_ppElseIf1287); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_ELSEIF52_tree = (Object)adaptor.create(PP_ELSEIF52);
                    adaptor.addChild(root_0, PP_ELSEIF52_tree);
                    }
                    BANG53=(Token)match(input,BANG,FOLLOW_BANG_in_ppElseIf1289); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANG53_tree = (Object)adaptor.create(BANG53);
                    adaptor.addChild(root_0, BANG53_tree);
                    }
                    IDENTIFIER54=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1291); if (state.failed) return retval;
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
    // C:\\antlr\\TinyHaxeTry1.g:109:1: ppElse : PP_ELSE ;
    public final TinyHaxeTry1Parser.ppElse_return ppElse() throws RecognitionException {
        TinyHaxeTry1Parser.ppElse_return retval = new TinyHaxeTry1Parser.ppElse_return();
        retval.start = input.LT(1);
        int ppElse_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ELSE55=null;

        Object PP_ELSE55_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:109:19: ( PP_ELSE )
            // C:\\antlr\\TinyHaxeTry1.g:109:21: PP_ELSE
            {
            root_0 = (Object)adaptor.nil();

            PP_ELSE55=(Token)match(input,PP_ELSE,FOLLOW_PP_ELSE_in_ppElse1311); if (state.failed) return retval;
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
    // C:\\antlr\\TinyHaxeTry1.g:111:1: ppEnd : PP_END ;
    public final TinyHaxeTry1Parser.ppEnd_return ppEnd() throws RecognitionException {
        TinyHaxeTry1Parser.ppEnd_return retval = new TinyHaxeTry1Parser.ppEnd_return();
        retval.start = input.LT(1);
        int ppEnd_StartIndex = input.index();
        Object root_0 = null;

        Token PP_END56=null;

        Object PP_END56_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:111:19: ( PP_END )
            // C:\\antlr\\TinyHaxeTry1.g:111:21: PP_END
            {
            root_0 = (Object)adaptor.nil();

            PP_END56=(Token)match(input,PP_END,FOLLOW_PP_END_in_ppEnd1332); if (state.failed) return retval;
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
    // C:\\antlr\\TinyHaxeTry1.g:113:1: ppError : PP_ERROR ;
    public final TinyHaxeTry1Parser.ppError_return ppError() throws RecognitionException {
        TinyHaxeTry1Parser.ppError_return retval = new TinyHaxeTry1Parser.ppError_return();
        retval.start = input.LT(1);
        int ppError_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ERROR57=null;

        Object PP_ERROR57_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:113:19: ( PP_ERROR )
            // C:\\antlr\\TinyHaxeTry1.g:113:21: PP_ERROR
            {
            root_0 = (Object)adaptor.nil();

            PP_ERROR57=(Token)match(input,PP_ERROR,FOLLOW_PP_ERROR_in_ppError1351); if (state.failed) return retval;
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
    // C:\\antlr\\TinyHaxeTry1.g:118:1: typeTag : COLON funcType ;
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
            // C:\\antlr\\TinyHaxeTry1.g:118:19: ( COLON funcType )
            // C:\\antlr\\TinyHaxeTry1.g:118:21: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            COLON58=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1374); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_typeTag1377);
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
    // C:\\antlr\\TinyHaxeTry1.g:120:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag ) | );
    public final TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeTagOpt_return retval = new TinyHaxeTry1Parser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeTag_return typeTag60 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:120:19: ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag ) | )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLON) ) {
                alt14=1;
            }
            else if ( (LA14_0==EOF||LA14_0==SEMI||LA14_0==COMMA||(LA14_0>=LPAREN && LA14_0<=RPAREN)||LA14_0==LBRACE||LA14_0==EQ) ) {
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
                    // C:\\antlr\\TinyHaxeTry1.g:120:21: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt1393);
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
                    // 120:29: -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:120:32: ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag )
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
                    // C:\\antlr\\TinyHaxeTry1.g:122:2: 
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
    // C:\\antlr\\TinyHaxeTry1.g:123:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );
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
            // C:\\antlr\\TinyHaxeTry1.g:123:19: ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LBRACE) ) {
                alt17=1;
            }
            else if ( (LA17_0==IDENTIFIER) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==COLON) ) {
                    alt17=2;
                }
                else if ( (LA17_2==DOT||LA17_2==COMMA||LA17_2==RPAREN||(LA17_2>=MINUS_BIGGER && LA17_2<=LT)) ) {
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
                    // C:\\antlr\\TinyHaxeTry1.g:123:21: funcType ( COMMA funcType )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_typeList1445);
                    funcType61=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType61.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:123:30: ( COMMA funcType )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:123:31: COMMA funcType
                    	    {
                    	    COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1448); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_funcType_in_typeList1451);
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
                    // C:\\antlr\\TinyHaxeTry1.g:124:25: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeConstraint_in_typeList1479);
                    typeConstraint64=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint64.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:124:40: ( COMMA typeConstraint )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:124:41: COMMA typeConstraint
                    	    {
                    	    COMMA65=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1482); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList1485);
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
    // C:\\antlr\\TinyHaxeTry1.g:135:1: funcType : ( type ) ( MINUS_BIGGER type )* ;
    public final TinyHaxeTry1Parser.funcType_return funcType() throws RecognitionException {
        TinyHaxeTry1Parser.funcType_return retval = new TinyHaxeTry1Parser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token MINUS_BIGGER68=null;
        TinyHaxeTry1Parser.type_return type67 = null;

        TinyHaxeTry1Parser.type_return type69 = null;


        Object MINUS_BIGGER68_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:135:19: ( ( type ) ( MINUS_BIGGER type )* )
            // C:\\antlr\\TinyHaxeTry1.g:135:21: ( type ) ( MINUS_BIGGER type )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:135:21: ( type )
            // C:\\antlr\\TinyHaxeTry1.g:135:22: type
            {
            pushFollow(FOLLOW_type_in_funcType1528);
            type67=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type67.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:135:28: ( MINUS_BIGGER type )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==MINUS_BIGGER) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:135:29: MINUS_BIGGER type
            	    {
            	    MINUS_BIGGER68=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1532); if (state.failed) return retval;
            	    pushFollow(FOLLOW_type_in_funcType1535);
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

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:137:1: type : ( anonType | dotIdent ) ( typeParam )* ;
    public final TinyHaxeTry1Parser.type_return type() throws RecognitionException {
        TinyHaxeTry1Parser.type_return retval = new TinyHaxeTry1Parser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.anonType_return anonType70 = null;

        TinyHaxeTry1Parser.dotIdent_return dotIdent71 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam72 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:137:19: ( ( anonType | dotIdent ) ( typeParam )* )
            // C:\\antlr\\TinyHaxeTry1.g:137:21: ( anonType | dotIdent ) ( typeParam )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:137:21: ( anonType | dotIdent )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LBRACE) ) {
                alt19=1;
            }
            else if ( (LA19_0==IDENTIFIER) ) {
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
                    // C:\\antlr\\TinyHaxeTry1.g:137:22: anonType
                    {
                    pushFollow(FOLLOW_anonType_in_type1560);
                    anonType70=anonType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonType70.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:137:33: dotIdent
                    {
                    pushFollow(FOLLOW_dotIdent_in_type1564);
                    dotIdent71=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent71.getTree());

                    }
                    break;

            }

            // C:\\antlr\\TinyHaxeTry1.g:137:43: ( typeParam )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==GT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:137:44: typeParam
            	    {
            	    pushFollow(FOLLOW_typeParam_in_type1568);
            	    typeParam72=typeParam();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam72.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // C:\\antlr\\TinyHaxeTry1.g:139:1: typeParam : GT typeList LT ;
    public final TinyHaxeTry1Parser.typeParam_return typeParam() throws RecognitionException {
        TinyHaxeTry1Parser.typeParam_return retval = new TinyHaxeTry1Parser.typeParam_return();
        retval.start = input.LT(1);
        int typeParam_StartIndex = input.index();
        Object root_0 = null;

        Token GT73=null;
        Token LT75=null;
        TinyHaxeTry1Parser.typeList_return typeList74 = null;


        Object GT73_tree=null;
        Object LT75_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:139:19: ( GT typeList LT )
            // C:\\antlr\\TinyHaxeTry1.g:139:21: GT typeList LT
            {
            root_0 = (Object)adaptor.nil();

            GT73=(Token)match(input,GT,FOLLOW_GT_in_typeParam1587); if (state.failed) return retval;
            pushFollow(FOLLOW_typeList_in_typeParam1590);
            typeList74=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList74.getTree());
            LT75=(Token)match(input,LT,FOLLOW_LT_in_typeParam1592); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:141:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam ) | );
    public final TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeParamOpt_return retval = new TinyHaxeTry1Parser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam76 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:141:19: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam ) | )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==GT) ) {
                alt21=1;
            }
            else if ( (LA21_0==LPAREN||LA21_0==LBRACE||(LA21_0>=EXTENDS && LA21_0<=IMPLEMENTS)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:141:21: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1607);
                    typeParam76=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam76.getTree());


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
                        // C:\\antlr\\TinyHaxeTry1.g:141:32: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam )
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
                    // C:\\antlr\\TinyHaxeTry1.g:143:8: 
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
    // C:\\antlr\\TinyHaxeTry1.g:144:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint IDENTIFIER typeList ) ;
    public final TinyHaxeTry1Parser.typeConstraint_return typeConstraint() throws RecognitionException {
        TinyHaxeTry1Parser.typeConstraint_return retval = new TinyHaxeTry1Parser.typeConstraint_return();
        retval.start = input.LT(1);
        int typeConstraint_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER77=null;
        Token COLON78=null;
        Token LPAREN79=null;
        Token RPAREN81=null;
        TinyHaxeTry1Parser.typeList_return typeList80 = null;


        Object IDENTIFIER77_tree=null;
        Object COLON78_tree=null;
        Object LPAREN79_tree=null;
        Object RPAREN81_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:144:19: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint IDENTIFIER typeList ) )
            // C:\\antlr\\TinyHaxeTry1.g:144:21: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER77=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1639); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER77);

            COLON78=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1641); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON78);

            LPAREN79=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1643); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN79);

            pushFollow(FOLLOW_typeList_in_typeConstraint1645);
            typeList80=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList80.getTree());
            RPAREN81=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1647); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN81);



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
            // 144:61: -> ^( $typeConstraint IDENTIFIER typeList )
            {
                // C:\\antlr\\TinyHaxeTry1.g:144:64: ^( $typeConstraint IDENTIFIER typeList )
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
    // C:\\antlr\\TinyHaxeTry1.g:147:1: statement : ( block | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | forStmt | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO statement WHILE parExpression ) | tryStmt | switchStmt | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI );
    public final TinyHaxeTry1Parser.statement_return statement() throws RecognitionException {
        TinyHaxeTry1Parser.statement_return retval = new TinyHaxeTry1Parser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Token IF83=null;
        Token ELSE85=null;
        Token WHILE87=null;
        Token DO90=null;
        Token WHILE92=null;
        Token SEMI94=null;
        Token RETURN97=null;
        Token SEMI99=null;
        Token THROW100=null;
        Token SEMI102=null;
        Token BREAK103=null;
        Token IDENTIFIER104=null;
        Token SEMI105=null;
        Token CONTINUE106=null;
        Token IDENTIFIER107=null;
        Token SEMI108=null;
        Token SEMI110=null;
        Token IDENTIFIER111=null;
        Token COLON112=null;
        Token SEMI114=null;
        TinyHaxeTry1Parser.statement_return st1 = null;

        TinyHaxeTry1Parser.statement_return st2 = null;

        TinyHaxeTry1Parser.block_return block82 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression84 = null;

        TinyHaxeTry1Parser.forStmt_return forStmt86 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression88 = null;

        TinyHaxeTry1Parser.statement_return statement89 = null;

        TinyHaxeTry1Parser.statement_return statement91 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression93 = null;

        TinyHaxeTry1Parser.tryStmt_return tryStmt95 = null;

        TinyHaxeTry1Parser.switchStmt_return switchStmt96 = null;

        TinyHaxeTry1Parser.expr_return expr98 = null;

        TinyHaxeTry1Parser.expr_return expr101 = null;

        TinyHaxeTry1Parser.expr_return expr109 = null;

        TinyHaxeTry1Parser.statement_return statement113 = null;


        Object IF83_tree=null;
        Object ELSE85_tree=null;
        Object WHILE87_tree=null;
        Object DO90_tree=null;
        Object WHILE92_tree=null;
        Object SEMI94_tree=null;
        Object RETURN97_tree=null;
        Object SEMI99_tree=null;
        Object THROW100_tree=null;
        Object SEMI102_tree=null;
        Object BREAK103_tree=null;
        Object IDENTIFIER104_tree=null;
        Object SEMI105_tree=null;
        Object CONTINUE106_tree=null;
        Object IDENTIFIER107_tree=null;
        Object SEMI108_tree=null;
        Object SEMI110_tree=null;
        Object IDENTIFIER111_tree=null;
        Object COLON112_tree=null;
        Object SEMI114_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_THROW=new RewriteRuleTokenStream(adaptor,"token THROW");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:148:5: ( block | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | forStmt | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO statement WHILE parExpression ) | tryStmt | switchStmt | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI )
            int alt26=14;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:148:9: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement1676);
                    block82=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block82.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:149:9: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF83=(Token)match(input,IF,FOLLOW_IF_in_statement1686); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF83);

                    pushFollow(FOLLOW_parExpression_in_statement1688);
                    parExpression84=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression84.getTree());
                    pushFollow(FOLLOW_statement_in_statement1692);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:149:40: ( ELSE st2= statement )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==ELSE) ) {
                        int LA22_1 = input.LA(2);

                        if ( (synpred42_TinyHaxeTry1()) ) {
                            alt22=1;
                        }
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:149:41: ELSE st2= statement
                            {
                            ELSE85=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1695); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE85);

                            pushFollow(FOLLOW_statement_in_statement1699);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: st1, st2, IF, parExpression, ELSE
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
                    // 149:62: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:149:65: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // C:\\antlr\\TinyHaxeTry1.g:149:89: ( ^( ELSE $st2) )?
                        if ( stream_st2.hasNext()||stream_ELSE.hasNext() ) {
                            // C:\\antlr\\TinyHaxeTry1.g:149:89: ^( ELSE $st2)
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
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:150:9: forStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStmt_in_statement1740);
                    forStmt86=forStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStmt86.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:151:9: WHILE parExpression statement
                    {
                    WHILE87=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE87);

                    pushFollow(FOLLOW_parExpression_in_statement1752);
                    parExpression88=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression88.getTree());
                    pushFollow(FOLLOW_statement_in_statement1754);
                    statement89=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement89.getTree());


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
                    // 151:39: -> ^( WHILE parExpression statement )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:151:42: ^( WHILE parExpression statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:152:9: DO statement WHILE parExpression SEMI
                    {
                    DO90=(Token)match(input,DO,FOLLOW_DO_in_statement1774); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO90);

                    pushFollow(FOLLOW_statement_in_statement1776);
                    statement91=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement91.getTree());
                    WHILE92=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE92);

                    pushFollow(FOLLOW_parExpression_in_statement1780);
                    parExpression93=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression93.getTree());
                    SEMI94=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1782); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI94);



                    // AST REWRITE
                    // elements: WHILE, parExpression, statement, DO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 152:47: -> ^( DO statement WHILE parExpression )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:152:50: ^( DO statement WHILE parExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DO.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_statement.nextTree());
                        adaptor.addChild(root_1, stream_WHILE.nextNode());
                        adaptor.addChild(root_1, stream_parExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\antlr\\TinyHaxeTry1.g:153:9: tryStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStmt_in_statement1804);
                    tryStmt95=tryStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryStmt95.getTree());

                    }
                    break;
                case 7 :
                    // C:\\antlr\\TinyHaxeTry1.g:155:6: switchStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStmt_in_statement1814);
                    switchStmt96=switchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStmt96.getTree());

                    }
                    break;
                case 8 :
                    // C:\\antlr\\TinyHaxeTry1.g:156:9: RETURN ( expr )? SEMI
                    {
                    RETURN97=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1824); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN97);

                    // C:\\antlr\\TinyHaxeTry1.g:156:16: ( expr )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=IDENTIFIER && LA23_0<=DOT)||(LA23_0>=QUES && LA23_0<=LPAREN)||LA23_0==LBRACKET||LA23_0==BANG||(LA23_0>=GT && LA23_0<=LT)||LA23_0==LBRACE||(LA23_0>=ELLIPSIS && LA23_0<=CAST)||LA23_0==EQ||(LA23_0>=LONGLITERAL && LA23_0<=FLOATNUM)||(LA23_0>=PLUSEQ && LA23_0<=PERCENTEQ)||(LA23_0>=154 && LA23_0<=156)) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==SEMI) ) {
                        int LA23_2 = input.LA(2);

                        if ( (synpred49_TinyHaxeTry1()) ) {
                            alt23=1;
                        }
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:156:17: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1827);
                            expr98=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr98.getTree());

                            }
                            break;

                    }

                    SEMI99=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1831); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI99);



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
                    // 156:29: -> ^( RETURN ( expr )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:156:32: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // C:\\antlr\\TinyHaxeTry1.g:156:41: ( expr )?
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
                case 9 :
                    // C:\\antlr\\TinyHaxeTry1.g:157:9: THROW expr SEMI
                    {
                    THROW100=(Token)match(input,THROW,FOLLOW_THROW_in_statement1850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW100);

                    pushFollow(FOLLOW_expr_in_statement1852);
                    expr101=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr101.getTree());
                    SEMI102=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1854); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI102);



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
                    // 157:25: -> ^( THROW expr )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:157:28: ^( THROW expr )
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
                case 10 :
                    // C:\\antlr\\TinyHaxeTry1.g:158:9: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK103=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK103);

                    // C:\\antlr\\TinyHaxeTry1.g:158:15: ( IDENTIFIER )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==IDENTIFIER) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:158:16: IDENTIFIER
                            {
                            IDENTIFIER104=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1875); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER104);


                            }
                            break;

                    }

                    SEMI105=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI105);



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
                    // 158:34: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:158:37: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        // C:\\antlr\\TinyHaxeTry1.g:158:45: ( IDENTIFIER )?
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
                case 11 :
                    // C:\\antlr\\TinyHaxeTry1.g:159:9: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE106=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE106);

                    // C:\\antlr\\TinyHaxeTry1.g:159:18: ( IDENTIFIER )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==IDENTIFIER) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:159:19: IDENTIFIER
                            {
                            IDENTIFIER107=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1901); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER107);


                            }
                            break;

                    }

                    SEMI108=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI108);



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
                    // 159:37: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:159:40: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        // C:\\antlr\\TinyHaxeTry1.g:159:51: ( IDENTIFIER )?
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
                case 12 :
                    // C:\\antlr\\TinyHaxeTry1.g:160:9: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement1924);
                    expr109=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr109.getTree());
                    SEMI110=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1927); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // C:\\antlr\\TinyHaxeTry1.g:161:9: IDENTIFIER COLON statement
                    {
                    IDENTIFIER111=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1939); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER111);

                    COLON112=(Token)match(input,COLON,FOLLOW_COLON_in_statement1941); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON112);

                    pushFollow(FOLLOW_statement_in_statement1943);
                    statement113=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement113.getTree());


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
                    // 161:36: -> ^( COLON IDENTIFIER statement )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:161:39: ^( COLON IDENTIFIER statement )
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
                case 14 :
                    // C:\\antlr\\TinyHaxeTry1.g:162:9: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI114=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1963); if (state.failed) return retval;

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
    // C:\\antlr\\TinyHaxeTry1.g:165:1: parExpression : RPAREN expr LPAREN ;
    public final TinyHaxeTry1Parser.parExpression_return parExpression() throws RecognitionException {
        TinyHaxeTry1Parser.parExpression_return retval = new TinyHaxeTry1Parser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        Object root_0 = null;

        Token RPAREN115=null;
        Token LPAREN117=null;
        TinyHaxeTry1Parser.expr_return expr116 = null;


        Object RPAREN115_tree=null;
        Object LPAREN117_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:166:5: ( RPAREN expr LPAREN )
            // C:\\antlr\\TinyHaxeTry1.g:166:9: RPAREN expr LPAREN
            {
            root_0 = (Object)adaptor.nil();

            RPAREN115=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1988); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_parExpression1991);
            expr116=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr116.getTree());
            LPAREN117=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1993); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:169:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* ) | SEMI );
    public final TinyHaxeTry1Parser.block_return block() throws RecognitionException {
        TinyHaxeTry1Parser.block_return retval = new TinyHaxeTry1Parser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE118=null;
        Token RBRACE120=null;
        Token SEMI121=null;
        TinyHaxeTry1Parser.blockStmt_return blockStmt119 = null;


        Object LBRACE118_tree=null;
        Object RBRACE120_tree=null;
        Object SEMI121_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:169:15: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* ) | SEMI )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LBRACE) ) {
                alt28=1;
            }
            else if ( (LA28_0==SEMI) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:169:17: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE118=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE118);

                    // C:\\antlr\\TinyHaxeTry1.g:169:24: ( blockStmt )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=SEMI && LA27_0<=DOT)||(LA27_0>=PUBLIC && LA27_0<=OVERRIDE)||(LA27_0>=QUES && LA27_0<=LPAREN)||LA27_0==LBRACKET||LA27_0==BANG||(LA27_0>=GT && LA27_0<=IF)||(LA27_0>=WHILE && LA27_0<=LBRACE)||LA27_0==FOR||(LA27_0>=SWITCH && LA27_0<=TRY)||(LA27_0>=ELLIPSIS && LA27_0<=CAST)||(LA27_0>=VAR && LA27_0<=CLASS)||(LA27_0>=LONGLITERAL && LA27_0<=FLOATNUM)||(LA27_0>=PLUSEQ && LA27_0<=PERCENTEQ)||(LA27_0>=154 && LA27_0<=156)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:169:25: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block2018);
                    	    blockStmt119=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt119.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    RBRACE120=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2022); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE120);



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
                    // 169:44: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:169:46: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(BLOCK_SCOPE, "BLOCK_SCOPE", true), root_1);

                        // C:\\antlr\\TinyHaxeTry1.g:169:100: ( blockStmt )*
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
                    // C:\\antlr\\TinyHaxeTry1.g:170:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI121=(Token)match(input,SEMI,FOLLOW_SEMI_in_block2040); if (state.failed) return retval;

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
    // C:\\antlr\\TinyHaxeTry1.g:173:1: blockStmt : ( varDecl | classDecl | statement );
    public final TinyHaxeTry1Parser.blockStmt_return blockStmt() throws RecognitionException {
        TinyHaxeTry1Parser.blockStmt_return retval = new TinyHaxeTry1Parser.blockStmt_return();
        retval.start = input.LT(1);
        int blockStmt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl122 = null;

        TinyHaxeTry1Parser.classDecl_return classDecl123 = null;

        TinyHaxeTry1Parser.statement_return statement124 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:174:2: ( varDecl | classDecl | statement )
            int alt29=3;
            switch ( input.LA(1) ) {
            case PUBLIC:
            case PRIVATE:
            case STATIC:
            case INLINE:
            case DYNAMIC:
            case OVERRIDE:
            case VAR:
                {
                alt29=1;
                }
                break;
            case EXTERN:
            case CLASS:
                {
                alt29=2;
                }
                break;
            case EOF:
            case SEMI:
            case IDENTIFIER:
            case DOT:
            case COMMA:
            case QUES:
            case FUNCTION:
            case LPAREN:
            case RPAREN:
            case LBRACKET:
            case RBRACKET:
            case BANG:
            case COLON:
            case GT:
            case LT:
            case IF:
            case WHILE:
            case DO:
            case RETURN:
            case THROW:
            case BREAK:
            case CONTINUE:
            case LBRACE:
            case RBRACE:
            case FOR:
            case IN:
            case SWITCH:
            case TRY:
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
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:174:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_blockStmt2053);
                    varDecl122=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl122.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:175:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_blockStmt2058);
                    classDecl123=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl123.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:176:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStmt2063);
                    statement124=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement124.getTree());

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

    public static class forStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStmt"
    // C:\\antlr\\TinyHaxeTry1.g:179:1: forStmt : FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) ;
    public final TinyHaxeTry1Parser.forStmt_return forStmt() throws RecognitionException {
        TinyHaxeTry1Parser.forStmt_return retval = new TinyHaxeTry1Parser.forStmt_return();
        retval.start = input.LT(1);
        int forStmt_StartIndex = input.index();
        Object root_0 = null;

        Token FOR125=null;
        Token LPAREN126=null;
        Token IN127=null;
        Token RPAREN128=null;
        TinyHaxeTry1Parser.expr_return exp1 = null;

        TinyHaxeTry1Parser.expr_return exp2 = null;

        TinyHaxeTry1Parser.statement_return statement129 = null;


        Object FOR125_tree=null;
        Object LPAREN126_tree=null;
        Object IN127_tree=null;
        Object RPAREN128_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:179:19: ( FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) )
            // C:\\antlr\\TinyHaxeTry1.g:179:21: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
            {
            FOR125=(Token)match(input,FOR,FOLLOW_FOR_in_forStmt2095); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR125);

            LPAREN126=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forStmt2097); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN126);

            pushFollow(FOLLOW_expr_in_forStmt2101);
            exp1=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
            IN127=(Token)match(input,IN,FOLLOW_IN_in_forStmt2103); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN127);

            pushFollow(FOLLOW_expr_in_forStmt2107);
            exp2=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
            RPAREN128=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forStmt2109); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN128);

            pushFollow(FOLLOW_statement_in_forStmt2111);
            statement129=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement129.getTree());


            // AST REWRITE
            // elements: IN, exp2, exp1, FOR, statement
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
            // 179:72: -> ^( FOR ^( IN $exp1 $exp2) statement )
            {
                // C:\\antlr\\TinyHaxeTry1.g:179:75: ^( FOR ^( IN $exp1 $exp2) statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);

                // C:\\antlr\\TinyHaxeTry1.g:179:81: ^( IN $exp1 $exp2)
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

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, forStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forStmt"

    public static class breakStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStmt"
    // C:\\antlr\\TinyHaxeTry1.g:182:1: breakStmt : BREAK SEMI ;
    public final TinyHaxeTry1Parser.breakStmt_return breakStmt() throws RecognitionException {
        TinyHaxeTry1Parser.breakStmt_return retval = new TinyHaxeTry1Parser.breakStmt_return();
        retval.start = input.LT(1);
        int breakStmt_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK130=null;
        Token SEMI131=null;

        Object BREAK130_tree=null;
        Object SEMI131_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:182:19: ( BREAK SEMI )
            // C:\\antlr\\TinyHaxeTry1.g:182:21: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            BREAK130=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt2148); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK130_tree = (Object)adaptor.create(BREAK130);
            adaptor.addChild(root_0, BREAK130_tree);
            }
            SEMI131=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt2150); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, breakStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakStmt"

    public static class continueStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueStmt"
    // C:\\antlr\\TinyHaxeTry1.g:184:1: continueStmt : CONTINUE SEMI ;
    public final TinyHaxeTry1Parser.continueStmt_return continueStmt() throws RecognitionException {
        TinyHaxeTry1Parser.continueStmt_return retval = new TinyHaxeTry1Parser.continueStmt_return();
        retval.start = input.LT(1);
        int continueStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE132=null;
        Token SEMI133=null;

        Object CONTINUE132_tree=null;
        Object SEMI133_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:184:19: ( CONTINUE SEMI )
            // C:\\antlr\\TinyHaxeTry1.g:184:21: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE132=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt2165); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE132_tree = (Object)adaptor.create(CONTINUE132);
            adaptor.addChild(root_0, CONTINUE132_tree);
            }
            SEMI133=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt2167); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, continueStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueStmt"

    public static class caseStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseStmt"
    // C:\\antlr\\TinyHaxeTry1.g:186:1: caseStmt : CASE exprList COLON ;
    public final TinyHaxeTry1Parser.caseStmt_return caseStmt() throws RecognitionException {
        TinyHaxeTry1Parser.caseStmt_return retval = new TinyHaxeTry1Parser.caseStmt_return();
        retval.start = input.LT(1);
        int caseStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CASE134=null;
        Token COLON136=null;
        TinyHaxeTry1Parser.exprList_return exprList135 = null;


        Object CASE134_tree=null;
        Object COLON136_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:186:19: ( CASE exprList COLON )
            // C:\\antlr\\TinyHaxeTry1.g:186:21: CASE exprList COLON
            {
            root_0 = (Object)adaptor.nil();

            CASE134=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2186); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE134_tree = (Object)adaptor.create(CASE134);
            adaptor.addChild(root_0, CASE134_tree);
            }
            pushFollow(FOLLOW_exprList_in_caseStmt2188);
            exprList135=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList135.getTree());
            COLON136=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2190); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, caseStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "caseStmt"

    public static class defaultStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultStmt"
    // C:\\antlr\\TinyHaxeTry1.g:188:1: defaultStmt : DEFAULT COLON ;
    public final TinyHaxeTry1Parser.defaultStmt_return defaultStmt() throws RecognitionException {
        TinyHaxeTry1Parser.defaultStmt_return retval = new TinyHaxeTry1Parser.defaultStmt_return();
        retval.start = input.LT(1);
        int defaultStmt_StartIndex = input.index();
        Object root_0 = null;

        Token DEFAULT137=null;
        Token COLON138=null;

        Object DEFAULT137_tree=null;
        Object COLON138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:188:19: ( DEFAULT COLON )
            // C:\\antlr\\TinyHaxeTry1.g:188:21: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT137=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt2206); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT137_tree = (Object)adaptor.create(DEFAULT137);
            adaptor.addChild(root_0, DEFAULT137_tree);
            }
            COLON138=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt2208); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, defaultStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "defaultStmt"

    public static class switchStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchStmt"
    // C:\\antlr\\TinyHaxeTry1.g:190:1: switchStmt : SWITCH LPAREN expr RPAREN block -> ^( SWITCH expr block ) ;
    public final TinyHaxeTry1Parser.switchStmt_return switchStmt() throws RecognitionException {
        TinyHaxeTry1Parser.switchStmt_return retval = new TinyHaxeTry1Parser.switchStmt_return();
        retval.start = input.LT(1);
        int switchStmt_StartIndex = input.index();
        Object root_0 = null;

        Token SWITCH139=null;
        Token LPAREN140=null;
        Token RPAREN142=null;
        TinyHaxeTry1Parser.expr_return expr141 = null;

        TinyHaxeTry1Parser.block_return block143 = null;


        Object SWITCH139_tree=null;
        Object LPAREN140_tree=null;
        Object RPAREN142_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:190:19: ( SWITCH LPAREN expr RPAREN block -> ^( SWITCH expr block ) )
            // C:\\antlr\\TinyHaxeTry1.g:190:21: SWITCH LPAREN expr RPAREN block
            {
            SWITCH139=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchStmt2225); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH139);

            LPAREN140=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_switchStmt2227); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN140);

            pushFollow(FOLLOW_expr_in_switchStmt2229);
            expr141=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr141.getTree());
            RPAREN142=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_switchStmt2231); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN142);

            pushFollow(FOLLOW_block_in_switchStmt2233);
            block143=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block143.getTree());


            // AST REWRITE
            // elements: block, expr, SWITCH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 190:53: -> ^( SWITCH expr block )
            {
                // C:\\antlr\\TinyHaxeTry1.g:190:56: ^( SWITCH expr block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SWITCH.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
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
            if ( state.backtracking>0 ) { memoize(input, 39, switchStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchStmt"

    public static class tryStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryStmt"
    // C:\\antlr\\TinyHaxeTry1.g:192:1: tryStmt : TRY block catchStmtList -> ^( TRY block catchStmtList ) ;
    public final TinyHaxeTry1Parser.tryStmt_return tryStmt() throws RecognitionException {
        TinyHaxeTry1Parser.tryStmt_return retval = new TinyHaxeTry1Parser.tryStmt_return();
        retval.start = input.LT(1);
        int tryStmt_StartIndex = input.index();
        Object root_0 = null;

        Token TRY144=null;
        TinyHaxeTry1Parser.block_return block145 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList146 = null;


        Object TRY144_tree=null;
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_catchStmtList=new RewriteRuleSubtreeStream(adaptor,"rule catchStmtList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:192:19: ( TRY block catchStmtList -> ^( TRY block catchStmtList ) )
            // C:\\antlr\\TinyHaxeTry1.g:192:21: TRY block catchStmtList
            {
            TRY144=(Token)match(input,TRY,FOLLOW_TRY_in_tryStmt2262); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRY.add(TRY144);

            pushFollow(FOLLOW_block_in_tryStmt2264);
            block145=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block145.getTree());
            pushFollow(FOLLOW_catchStmtList_in_tryStmt2266);
            catchStmtList146=catchStmtList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList146.getTree());


            // AST REWRITE
            // elements: catchStmtList, block, TRY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 192:45: -> ^( TRY block catchStmtList )
            {
                // C:\\antlr\\TinyHaxeTry1.g:192:48: ^( TRY block catchStmtList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_TRY.nextNode(), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());
                adaptor.addChild(root_1, stream_catchStmtList.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 40, tryStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tryStmt"

    public static class catchStmtList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchStmtList"
    // C:\\antlr\\TinyHaxeTry1.g:194:1: catchStmtList : ( catchStmt catchStmtList | );
    public final TinyHaxeTry1Parser.catchStmtList_return catchStmtList() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmtList_return retval = new TinyHaxeTry1Parser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.catchStmt_return catchStmt147 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList148 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:194:19: ( catchStmt catchStmtList | )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==CATCH) ) {
                alt30=1;
            }
            else if ( (LA30_0==EOF||(LA30_0>=SEMI && LA30_0<=DOT)||(LA30_0>=PUBLIC && LA30_0<=RBRACKET)||LA30_0==BANG||LA30_0==COLON||(LA30_0>=GT && LA30_0<=IN)||(LA30_0>=SWITCH && LA30_0<=TRY)||(LA30_0>=ELLIPSIS && LA30_0<=CAST)||(LA30_0>=VAR && LA30_0<=CLASS)||(LA30_0>=LONGLITERAL && LA30_0<=FLOATNUM)||(LA30_0>=PLUSEQ && LA30_0<=PERCENTEQ)||(LA30_0>=154 && LA30_0<=156)) ) {
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
                    // C:\\antlr\\TinyHaxeTry1.g:194:21: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catchStmt_in_catchStmtList2289);
                    catchStmt147=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt147.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList2291);
                    catchStmtList148=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList148.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:196:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 41, catchStmtList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchStmtList"

    public static class catchStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchStmt"
    // C:\\antlr\\TinyHaxeTry1.g:197:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH param block ) ;
    public final TinyHaxeTry1Parser.catchStmt_return catchStmt() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmt_return retval = new TinyHaxeTry1Parser.catchStmt_return();
        retval.start = input.LT(1);
        int catchStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CATCH149=null;
        Token LPAREN150=null;
        Token RPAREN152=null;
        TinyHaxeTry1Parser.param_return param151 = null;

        TinyHaxeTry1Parser.block_return block153 = null;


        Object CATCH149_tree=null;
        Object LPAREN150_tree=null;
        Object RPAREN152_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:197:19: ( CATCH LPAREN param RPAREN block -> ^( CATCH param block ) )
            // C:\\antlr\\TinyHaxeTry1.g:197:21: CATCH LPAREN param RPAREN block
            {
            CATCH149=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2330); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH149);

            LPAREN150=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2332); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN150);

            pushFollow(FOLLOW_param_in_catchStmt2334);
            param151=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param151.getTree());
            RPAREN152=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2336); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN152);

            pushFollow(FOLLOW_block_in_catchStmt2338);
            block153=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block153.getTree());


            // AST REWRITE
            // elements: param, block, CATCH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 197:53: -> ^( CATCH param block )
            {
                // C:\\antlr\\TinyHaxeTry1.g:197:56: ^( CATCH param block )
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
            if ( state.backtracking>0 ) { memoize(input, 42, catchStmt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchStmt"

    public static class exprListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprListOpt"
    // C:\\antlr\\TinyHaxeTry1.g:201:1: exprListOpt : ( exprList | );
    public final TinyHaxeTry1Parser.exprListOpt_return exprListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.exprListOpt_return retval = new TinyHaxeTry1Parser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.exprList_return exprList154 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:201:19: ( exprList | )
            int alt31=2;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
            case DOT:
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
                alt31=1;
                }
                break;
            case RBRACKET:
                {
                int LA31_2 = input.LA(2);

                if ( (synpred63_TinyHaxeTry1()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
                }
                break;
            case RPAREN:
                {
                int LA31_3 = input.LA(2);

                if ( (synpred63_TinyHaxeTry1()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:201:21: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprList_in_exprListOpt2365);
                    exprList154=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList154.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:203:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 43, exprListOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprListOpt"

    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // C:\\antlr\\TinyHaxeTry1.g:204:1: exprList : expr ( COMMA expr )* ;
    public final TinyHaxeTry1Parser.exprList_return exprList() throws RecognitionException {
        TinyHaxeTry1Parser.exprList_return retval = new TinyHaxeTry1Parser.exprList_return();
        retval.start = input.LT(1);
        int exprList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA156=null;
        TinyHaxeTry1Parser.expr_return expr155 = null;

        TinyHaxeTry1Parser.expr_return expr157 = null;


        Object COMMA156_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:204:19: ( expr ( COMMA expr )* )
            // C:\\antlr\\TinyHaxeTry1.g:204:21: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList2405);
            expr155=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr155.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:204:26: ( COMMA expr )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:204:27: COMMA expr
            	    {
            	    COMMA156=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2408); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_exprList2411);
            	    expr157=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr157.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
            if ( state.backtracking>0 ) { memoize(input, 44, exprList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprList"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // C:\\antlr\\TinyHaxeTry1.g:206:1: expr : assignExpr ;
    public final TinyHaxeTry1Parser.expr_return expr() throws RecognitionException {
        TinyHaxeTry1Parser.expr_return retval = new TinyHaxeTry1Parser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.assignExpr_return assignExpr158 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:206:19: ( assignExpr )
            // C:\\antlr\\TinyHaxeTry1.g:206:21: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr2435);
            assignExpr158=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr158.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class assignExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpr"
    // C:\\antlr\\TinyHaxeTry1.g:208:1: assignExpr : iterExpr ( assignOp iterExpr )* ;
    public final TinyHaxeTry1Parser.assignExpr_return assignExpr() throws RecognitionException {
        TinyHaxeTry1Parser.assignExpr_return retval = new TinyHaxeTry1Parser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr159 = null;

        TinyHaxeTry1Parser.assignOp_return assignOp160 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr161 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:208:19: ( iterExpr ( assignOp iterExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:208:21: iterExpr ( assignOp iterExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iterExpr_in_assignExpr2451);
            iterExpr159=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr159.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:208:30: ( assignOp iterExpr )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==EQ||(LA33_0>=PLUSEQ && LA33_0<=PERCENTEQ)||(LA33_0>=154 && LA33_0<=156)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:208:31: assignOp iterExpr
            	    {
            	    pushFollow(FOLLOW_assignOp_in_assignExpr2454);
            	    assignOp160=assignOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp160.getTree(), root_0);
            	    pushFollow(FOLLOW_iterExpr_in_assignExpr2457);
            	    iterExpr161=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr161.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
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
            if ( state.backtracking>0 ) { memoize(input, 46, assignExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignExpr"

    public static class iterExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterExpr"
    // C:\\antlr\\TinyHaxeTry1.g:210:1: iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
    public final TinyHaxeTry1Parser.iterExpr_return iterExpr() throws RecognitionException {
        TinyHaxeTry1Parser.iterExpr_return retval = new TinyHaxeTry1Parser.iterExpr_return();
        retval.start = input.LT(1);
        int iterExpr_StartIndex = input.index();
        Object root_0 = null;

        Token ELLIPSIS163=null;
        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr162 = null;

        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr164 = null;


        Object ELLIPSIS163_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:210:19: ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:210:21: ternaryExpr ( ELLIPSIS ternaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2478);
            ternaryExpr162=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr162.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:210:33: ( ELLIPSIS ternaryExpr )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ELLIPSIS) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:210:34: ELLIPSIS ternaryExpr
            	    {
            	    ELLIPSIS163=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2481); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELLIPSIS163_tree = (Object)adaptor.create(ELLIPSIS163);
            	    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS163_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2484);
            	    ternaryExpr164=ternaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr164.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
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
            if ( state.backtracking>0 ) { memoize(input, 47, iterExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iterExpr"

    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // C:\\antlr\\TinyHaxeTry1.g:212:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
    public final TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        TinyHaxeTry1Parser.ternaryExpr_return retval = new TinyHaxeTry1Parser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        Token QUES166=null;
        Token COLON168=null;
        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr165 = null;

        TinyHaxeTry1Parser.expr_return expr167 = null;

        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr169 = null;


        Object QUES166_tree=null;
        Object COLON168_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:212:19: ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:212:21: logicOrExpr ( QUES expr COLON logicOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2507);
            logicOrExpr165=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr165.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:212:33: ( QUES expr COLON logicOrExpr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==QUES) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:212:34: QUES expr COLON logicOrExpr
            	    {
            	    QUES166=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2510); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    QUES166_tree = (Object)adaptor.create(QUES166);
            	    root_0 = (Object)adaptor.becomeRoot(QUES166_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_in_ternaryExpr2513);
            	    expr167=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr167.getTree());
            	    COLON168=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2515); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2518);
            	    logicOrExpr169=logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr169.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 48, ternaryExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"

    public static class logicOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicOrExpr"
    // C:\\antlr\\TinyHaxeTry1.g:214:1: logicOrExpr : ( logicAndExpr ) ( BARBAR logicAndExpr )* ;
    public final TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicOrExpr_return retval = new TinyHaxeTry1Parser.logicOrExpr_return();
        retval.start = input.LT(1);
        int logicOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BARBAR171=null;
        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr170 = null;

        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr172 = null;


        Object BARBAR171_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:214:19: ( ( logicAndExpr ) ( BARBAR logicAndExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:214:21: ( logicAndExpr ) ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:214:21: ( logicAndExpr )
            // C:\\antlr\\TinyHaxeTry1.g:214:22: logicAndExpr
            {
            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2536);
            logicAndExpr170=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr170.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:214:36: ( BARBAR logicAndExpr )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==BARBAR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:214:37: BARBAR logicAndExpr
            	    {
            	    BARBAR171=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2540); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR171_tree = (Object)adaptor.create(BARBAR171);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR171_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2543);
            	    logicAndExpr172=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr172.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 49, logicOrExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicOrExpr"

    public static class logicAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicAndExpr"
    // C:\\antlr\\TinyHaxeTry1.g:216:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
    public final TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicAndExpr_return retval = new TinyHaxeTry1Parser.logicAndExpr_return();
        retval.start = input.LT(1);
        int logicAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token AMPAMP174=null;
        TinyHaxeTry1Parser.cmpExpr_return cmpExpr173 = null;

        TinyHaxeTry1Parser.cmpExpr_return cmpExpr175 = null;


        Object AMPAMP174_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:216:19: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:216:21: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:216:21: ( cmpExpr )
            // C:\\antlr\\TinyHaxeTry1.g:216:22: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2560);
            cmpExpr173=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr173.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:216:31: ( AMPAMP cmpExpr )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==AMPAMP) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:216:32: AMPAMP cmpExpr
            	    {
            	    AMPAMP174=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2564); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP174_tree = (Object)adaptor.create(AMPAMP174);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP174_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2567);
            	    cmpExpr175=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr175.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 50, logicAndExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicAndExpr"

    public static class cmpExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cmpExpr"
    // C:\\antlr\\TinyHaxeTry1.g:218:1: cmpExpr : ( bitExpr ) ( EQEQ bitExpr | BANGEQ bitExpr | GTEQ bitExpr | LTEQ bitExpr | GT bitExpr | LT bitExpr )* ;
    public final TinyHaxeTry1Parser.cmpExpr_return cmpExpr() throws RecognitionException {
        TinyHaxeTry1Parser.cmpExpr_return retval = new TinyHaxeTry1Parser.cmpExpr_return();
        retval.start = input.LT(1);
        int cmpExpr_StartIndex = input.index();
        Object root_0 = null;

        Token EQEQ177=null;
        Token BANGEQ179=null;
        Token GTEQ181=null;
        Token LTEQ183=null;
        Token GT185=null;
        Token LT187=null;
        TinyHaxeTry1Parser.bitExpr_return bitExpr176 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr178 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr180 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr182 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr184 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr186 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr188 = null;


        Object EQEQ177_tree=null;
        Object BANGEQ179_tree=null;
        Object GTEQ181_tree=null;
        Object LTEQ183_tree=null;
        Object GT185_tree=null;
        Object LT187_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:218:19: ( ( bitExpr ) ( EQEQ bitExpr | BANGEQ bitExpr | GTEQ bitExpr | LTEQ bitExpr | GT bitExpr | LT bitExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:218:21: ( bitExpr ) ( EQEQ bitExpr | BANGEQ bitExpr | GTEQ bitExpr | LTEQ bitExpr | GT bitExpr | LT bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:218:21: ( bitExpr )
            // C:\\antlr\\TinyHaxeTry1.g:218:22: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2589);
            bitExpr176=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr176.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:218:31: ( EQEQ bitExpr | BANGEQ bitExpr | GTEQ bitExpr | LTEQ bitExpr | GT bitExpr | LT bitExpr )*
            loop38:
            do {
                int alt38=7;
                switch ( input.LA(1) ) {
                case EQEQ:
                    {
                    alt38=1;
                    }
                    break;
                case BANGEQ:
                    {
                    alt38=2;
                    }
                    break;
                case GTEQ:
                    {
                    alt38=3;
                    }
                    break;
                case LTEQ:
                    {
                    alt38=4;
                    }
                    break;
                case GT:
                    {
                    alt38=5;
                    }
                    break;
                case LT:
                    {
                    alt38=6;
                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:218:32: EQEQ bitExpr
            	    {
            	    EQEQ177=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2593); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    EQEQ177_tree = (Object)adaptor.create(EQEQ177);
            	    root_0 = (Object)adaptor.becomeRoot(EQEQ177_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2596);
            	    bitExpr178=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr178.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:218:48: BANGEQ bitExpr
            	    {
            	    BANGEQ179=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2600); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BANGEQ179_tree = (Object)adaptor.create(BANGEQ179);
            	    root_0 = (Object)adaptor.becomeRoot(BANGEQ179_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2603);
            	    bitExpr180=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr180.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:218:66: GTEQ bitExpr
            	    {
            	    GTEQ181=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2607); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTEQ181_tree = (Object)adaptor.create(GTEQ181);
            	    root_0 = (Object)adaptor.becomeRoot(GTEQ181_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2610);
            	    bitExpr182=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr182.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\antlr\\TinyHaxeTry1.g:218:82: LTEQ bitExpr
            	    {
            	    LTEQ183=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2614); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTEQ183_tree = (Object)adaptor.create(LTEQ183);
            	    root_0 = (Object)adaptor.becomeRoot(LTEQ183_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2617);
            	    bitExpr184=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr184.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\antlr\\TinyHaxeTry1.g:218:98: GT bitExpr
            	    {
            	    GT185=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2621); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT185_tree = (Object)adaptor.create(GT185);
            	    root_0 = (Object)adaptor.becomeRoot(GT185_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2625);
            	    bitExpr186=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr186.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\antlr\\TinyHaxeTry1.g:218:113: LT bitExpr
            	    {
            	    LT187=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2629); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LT187_tree = (Object)adaptor.create(LT187);
            	    root_0 = (Object)adaptor.becomeRoot(LT187_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2633);
            	    bitExpr188=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr188.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 51, cmpExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cmpExpr"

    public static class bitExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitExpr"
    // C:\\antlr\\TinyHaxeTry1.g:220:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
    public final TinyHaxeTry1Parser.bitExpr_return bitExpr() throws RecognitionException {
        TinyHaxeTry1Parser.bitExpr_return retval = new TinyHaxeTry1Parser.bitExpr_return();
        retval.start = input.LT(1);
        int bitExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BAR190=null;
        Token AMP192=null;
        Token CARET194=null;
        TinyHaxeTry1Parser.shiftExpr_return shiftExpr189 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr191 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr193 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr195 = null;


        Object BAR190_tree=null;
        Object AMP192_tree=null;
        Object CARET194_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:220:19: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:220:21: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:220:21: ( shiftExpr )
            // C:\\antlr\\TinyHaxeTry1.g:220:22: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2655);
            shiftExpr189=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr189.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:220:33: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            loop39:
            do {
                int alt39=4;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    alt39=1;
                    }
                    break;
                case AMP:
                    {
                    alt39=2;
                    }
                    break;
                case CARET:
                    {
                    alt39=3;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:220:34: BAR shiftExpr
            	    {
            	    BAR190=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2659); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR190_tree = (Object)adaptor.create(BAR190);
            	    root_0 = (Object)adaptor.becomeRoot(BAR190_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2662);
            	    shiftExpr191=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr191.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:220:51: AMP shiftExpr
            	    {
            	    AMP192=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2666); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP192_tree = (Object)adaptor.create(AMP192);
            	    root_0 = (Object)adaptor.becomeRoot(AMP192_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2669);
            	    shiftExpr193=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr193.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:220:67: CARET shiftExpr
            	    {
            	    CARET194=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2672); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET194_tree = (Object)adaptor.create(CARET194);
            	    root_0 = (Object)adaptor.becomeRoot(CARET194_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2675);
            	    shiftExpr195=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr195.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 52, bitExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitExpr"

    public static class shiftExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpr"
    // C:\\antlr\\TinyHaxeTry1.g:222:1: shiftExpr : ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )* ;
    public final TinyHaxeTry1Parser.shiftExpr_return shiftExpr() throws RecognitionException {
        TinyHaxeTry1Parser.shiftExpr_return retval = new TinyHaxeTry1Parser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LTLT197=null;
        Token GTGT199=null;
        Token GTGTGT201=null;
        TinyHaxeTry1Parser.addExpr_return addExpr196 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr198 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr200 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr202 = null;


        Object LTLT197_tree=null;
        Object GTGT199_tree=null;
        Object GTGTGT201_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:222:19: ( ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:222:21: ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:222:21: ( addExpr )
            // C:\\antlr\\TinyHaxeTry1.g:222:22: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2695);
            addExpr196=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr196.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:222:31: ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )*
            loop40:
            do {
                int alt40=4;
                switch ( input.LA(1) ) {
                case LTLT:
                    {
                    alt40=1;
                    }
                    break;
                case GTGT:
                    {
                    alt40=2;
                    }
                    break;
                case GTGTGT:
                    {
                    alt40=3;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:222:32: LTLT addExpr
            	    {
            	    LTLT197=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2699); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT197_tree = (Object)adaptor.create(LTLT197);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT197_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2703);
            	    addExpr198=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr198.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:222:49: GTGT addExpr
            	    {
            	    GTGT199=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr2707); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGT199_tree = (Object)adaptor.create(GTGT199);
            	    root_0 = (Object)adaptor.becomeRoot(GTGT199_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2711);
            	    addExpr200=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr200.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:222:66: GTGTGT addExpr
            	    {
            	    GTGTGT201=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2715); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT201_tree = (Object)adaptor.create(GTGTGT201);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT201_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2718);
            	    addExpr202=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr202.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 53, shiftExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "shiftExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // C:\\antlr\\TinyHaxeTry1.g:225:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
    public final TinyHaxeTry1Parser.addExpr_return addExpr() throws RecognitionException {
        TinyHaxeTry1Parser.addExpr_return retval = new TinyHaxeTry1Parser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUS204=null;
        Token SUB205=null;
        TinyHaxeTry1Parser.multExpr_return multExpr203 = null;

        TinyHaxeTry1Parser.multExpr_return multExpr206 = null;


        Object PLUS204_tree=null;
        Object SUB205_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:225:19: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:225:21: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:225:21: ( multExpr )
            // C:\\antlr\\TinyHaxeTry1.g:225:22: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2741);
            multExpr203=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr203.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:225:32: ( ( PLUS | SUB ) multExpr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=PLUS && LA42_0<=SUB)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:225:33: ( PLUS | SUB ) multExpr
            	    {
            	    // C:\\antlr\\TinyHaxeTry1.g:225:33: ( PLUS | SUB )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==PLUS) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==SUB) ) {
            	        alt41=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // C:\\antlr\\TinyHaxeTry1.g:225:34: PLUS
            	            {
            	            PLUS204=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2746); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS204_tree = (Object)adaptor.create(PLUS204);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS204_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\antlr\\TinyHaxeTry1.g:225:42: SUB
            	            {
            	            SUB205=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2751); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB205_tree = (Object)adaptor.create(SUB205);
            	            root_0 = (Object)adaptor.becomeRoot(SUB205_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2755);
            	    multExpr206=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr206.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 54, addExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // C:\\antlr\\TinyHaxeTry1.g:227:1: multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
    public final TinyHaxeTry1Parser.multExpr_return multExpr() throws RecognitionException {
        TinyHaxeTry1Parser.multExpr_return retval = new TinyHaxeTry1Parser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token STAR208=null;
        Token SLASH209=null;
        Token PERCENT210=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr207 = null;

        TinyHaxeTry1Parser.prefixExpr_return prefixExpr211 = null;


        Object STAR208_tree=null;
        Object SLASH209_tree=null;
        Object PERCENT210_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:227:19: ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:227:21: ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:227:21: ( prefixExpr )
            // C:\\antlr\\TinyHaxeTry1.g:227:22: prefixExpr
            {
            pushFollow(FOLLOW_prefixExpr_in_multExpr2777);
            prefixExpr207=prefixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr207.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:227:34: ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=STAR && LA44_0<=PERCENT)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:227:35: ( STAR | SLASH | PERCENT ) prefixExpr
            	    {
            	    // C:\\antlr\\TinyHaxeTry1.g:227:35: ( STAR | SLASH | PERCENT )
            	    int alt43=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt43=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt43=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt43=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 43, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt43) {
            	        case 1 :
            	            // C:\\antlr\\TinyHaxeTry1.g:227:36: STAR
            	            {
            	            STAR208=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2782); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR208_tree = (Object)adaptor.create(STAR208);
            	            root_0 = (Object)adaptor.becomeRoot(STAR208_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\antlr\\TinyHaxeTry1.g:227:42: SLASH
            	            {
            	            SLASH209=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2785); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH209_tree = (Object)adaptor.create(SLASH209);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH209_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\antlr\\TinyHaxeTry1.g:227:49: PERCENT
            	            {
            	            PERCENT210=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2788); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT210_tree = (Object)adaptor.create(PERCENT210);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT210_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2792);
            	    prefixExpr211=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr211.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 55, multExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multExpr"

    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // C:\\antlr\\TinyHaxeTry1.g:229:1: prefixExpr : ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr );
    public final TinyHaxeTry1Parser.prefixExpr_return prefixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.prefixExpr_return retval = new TinyHaxeTry1Parser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set212=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr213 = null;

        TinyHaxeTry1Parser.newExpr_return newExpr214 = null;

        TinyHaxeTry1Parser.cast_return cast215 = null;

        TinyHaxeTry1Parser.suffixExpr_return suffixExpr216 = null;


        Object set212_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:229:19: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr )
            int alt45=4;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                int LA45_1 = input.LA(2);

                if ( (synpred91_TinyHaxeTry1()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
                }
                break;
            case NEW:
                {
                alt45=2;
                }
                break;
            case CAST:
                {
                alt45=3;
                }
                break;
            case EOF:
            case SEMI:
            case IDENTIFIER:
            case DOT:
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
            case LBRACE:
            case RBRACE:
            case IN:
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
                alt45=4;
                }
                break;
            case SUBSUB:
                {
                int LA45_5 = input.LA(2);

                if ( (synpred91_TinyHaxeTry1()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 5, input);

                    throw nvae;
                }
                }
                break;
            case SUB:
                {
                int LA45_6 = input.LA(2);

                if ( (synpred91_TinyHaxeTry1()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 6, input);

                    throw nvae;
                }
                }
                break;
            case BANG:
            case TILDE:
                {
                alt45=1;
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
                    // C:\\antlr\\TinyHaxeTry1.g:229:21: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    set212=(Token)input.LT(1);
                    if ( input.LA(1)==BANG||input.LA(1)==SUB||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set212));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2822);
                    prefixExpr213=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr213.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:230:25: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_prefixExpr2848);
                    newExpr214=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr214.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:231:25: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cast_in_prefixExpr2874);
                    cast215=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast215.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:232:25: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr2900);
                    suffixExpr216=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr216.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 56, prefixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prefixExpr"

    public static class suffixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "suffixExpr"
    // C:\\antlr\\TinyHaxeTry1.g:244:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value exprListOpt ) | value DOT IDENTIFIER | value LBRACKET expr RBRACKET | value PLUSPLUS | value SUBSUB | value );
    public final TinyHaxeTry1Parser.suffixExpr_return suffixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.suffixExpr_return retval = new TinyHaxeTry1Parser.suffixExpr_return();
        retval.start = input.LT(1);
        int suffixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN218=null;
        Token RPAREN220=null;
        Token DOT222=null;
        Token IDENTIFIER223=null;
        Token LBRACKET225=null;
        Token RBRACKET227=null;
        Token PLUSPLUS229=null;
        Token SUBSUB231=null;
        TinyHaxeTry1Parser.value_return value217 = null;

        TinyHaxeTry1Parser.exprListOpt_return exprListOpt219 = null;

        TinyHaxeTry1Parser.value_return value221 = null;

        TinyHaxeTry1Parser.value_return value224 = null;

        TinyHaxeTry1Parser.expr_return expr226 = null;

        TinyHaxeTry1Parser.value_return value228 = null;

        TinyHaxeTry1Parser.value_return value230 = null;

        TinyHaxeTry1Parser.value_return value232 = null;


        Object LPAREN218_tree=null;
        Object RPAREN220_tree=null;
        Object DOT222_tree=null;
        Object IDENTIFIER223_tree=null;
        Object LBRACKET225_tree=null;
        Object RBRACKET227_tree=null;
        Object PLUSPLUS229_tree=null;
        Object SUBSUB231_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:245:2: ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value exprListOpt ) | value DOT IDENTIFIER | value LBRACKET expr RBRACKET | value PLUSPLUS | value SUBSUB | value )
            int alt46=6;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:245:4: value LPAREN exprListOpt RPAREN
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2921);
                    value217=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value217.getTree());
                    LPAREN218=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_suffixExpr2923); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN218);

                    pushFollow(FOLLOW_exprListOpt_in_suffixExpr2925);
                    exprListOpt219=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt219.getTree());
                    RPAREN220=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_suffixExpr2927); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN220);



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
                    // 245:36: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value exprListOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:245:39: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value exprListOpt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());
                        adaptor.addChild(root_1, stream_exprListOpt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:246:4: value DOT IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2946);
                    value221=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value221.getTree());
                    DOT222=(Token)match(input,DOT,FOLLOW_DOT_in_suffixExpr2948); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT222_tree = (Object)adaptor.create(DOT222);
                    adaptor.addChild(root_0, DOT222_tree);
                    }
                    IDENTIFIER223=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_suffixExpr2950); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER223_tree = (Object)adaptor.create(IDENTIFIER223);
                    adaptor.addChild(root_0, IDENTIFIER223_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:247:4: value LBRACKET expr RBRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2956);
                    value224=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value224.getTree());
                    LBRACKET225=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_suffixExpr2958); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACKET225_tree = (Object)adaptor.create(LBRACKET225);
                    adaptor.addChild(root_0, LBRACKET225_tree);
                    }
                    pushFollow(FOLLOW_expr_in_suffixExpr2960);
                    expr226=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr226.getTree());
                    RBRACKET227=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_suffixExpr2962); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACKET227_tree = (Object)adaptor.create(RBRACKET227);
                    adaptor.addChild(root_0, RBRACKET227_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:248:4: value PLUSPLUS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2967);
                    value228=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value228.getTree());
                    PLUSPLUS229=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr2969); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUSPLUS229_tree = (Object)adaptor.create(PLUSPLUS229);
                    adaptor.addChild(root_0, PLUSPLUS229_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:250:4: value SUBSUB
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2976);
                    value230=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value230.getTree());
                    SUBSUB231=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr2978); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUBSUB231_tree = (Object)adaptor.create(SUBSUB231);
                    adaptor.addChild(root_0, SUBSUB231_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\antlr\\TinyHaxeTry1.g:251:4: value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2983);
                    value232=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value232.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 57, suffixExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "suffixExpr"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // C:\\antlr\\TinyHaxeTry1.g:255:1: value : ( funcLit | arrayLit | objLit | NULL | IDENTIFIER | elementarySymbol | LPAREN ( expr | statement ) RPAREN | );
    public final TinyHaxeTry1Parser.value_return value() throws RecognitionException {
        TinyHaxeTry1Parser.value_return retval = new TinyHaxeTry1Parser.value_return();
        retval.start = input.LT(1);
        int value_StartIndex = input.index();
        Object root_0 = null;

        Token NULL236=null;
        Token IDENTIFIER237=null;
        Token LPAREN239=null;
        Token RPAREN242=null;
        TinyHaxeTry1Parser.funcLit_return funcLit233 = null;

        TinyHaxeTry1Parser.arrayLit_return arrayLit234 = null;

        TinyHaxeTry1Parser.objLit_return objLit235 = null;

        TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol238 = null;

        TinyHaxeTry1Parser.expr_return expr240 = null;

        TinyHaxeTry1Parser.statement_return statement241 = null;


        Object NULL236_tree=null;
        Object IDENTIFIER237_tree=null;
        Object LPAREN239_tree=null;
        Object RPAREN242_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:255:7: ( funcLit | arrayLit | objLit | NULL | IDENTIFIER | elementarySymbol | LPAREN ( expr | statement ) RPAREN | )
            int alt48=8;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:255:9: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcLit_in_value2994);
                    funcLit233=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit233.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:256:25: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLit_in_value3021);
                    arrayLit234=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit234.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:257:25: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objLit_in_value3047);
                    objLit235=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit235.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:258:25: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL236=(Token)match(input,NULL,FOLLOW_NULL_in_value3073); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL236_tree = (Object)adaptor.create(NULL236);
                    adaptor.addChild(root_0, NULL236_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:259:25: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER237=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_value3099); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER237_tree = (Object)adaptor.create(IDENTIFIER237);
                    adaptor.addChild(root_0, IDENTIFIER237_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\antlr\\TinyHaxeTry1.g:260:25: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elementarySymbol_in_value3125);
                    elementarySymbol238=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol238.getTree());

                    }
                    break;
                case 7 :
                    // C:\\antlr\\TinyHaxeTry1.g:261:25: LPAREN ( expr | statement ) RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN239=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value3151); if (state.failed) return retval;
                    // C:\\antlr\\TinyHaxeTry1.g:261:33: ( expr | statement )
                    int alt47=2;
                    alt47 = dfa47.predict(input);
                    switch (alt47) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:261:34: expr
                            {
                            pushFollow(FOLLOW_expr_in_value3155);
                            expr240=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr240.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\antlr\\TinyHaxeTry1.g:261:39: statement
                            {
                            pushFollow(FOLLOW_statement_in_value3157);
                            statement241=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement241.getTree());

                            }
                            break;

                    }

                    RPAREN242=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value3160); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // C:\\antlr\\TinyHaxeTry1.g:264:9: 
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
            if ( state.backtracking>0 ) { memoize(input, 58, value_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class newExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpr"
    // C:\\antlr\\TinyHaxeTry1.g:265:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW type exprListOpt ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:265:19: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW type exprListOpt ) )
            // C:\\antlr\\TinyHaxeTry1.g:265:21: NEW type LPAREN exprListOpt RPAREN
            {
            NEW243=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr3218); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW243);

            pushFollow(FOLLOW_type_in_newExpr3220);
            type244=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type244.getTree());
            LPAREN245=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr3222); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN245);

            pushFollow(FOLLOW_exprListOpt_in_newExpr3224);
            exprListOpt246=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt246.getTree());
            RPAREN247=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr3226); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN247);



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
            // 265:56: -> ^( NEW type exprListOpt )
            {
                // C:\\antlr\\TinyHaxeTry1.g:265:58: ^( NEW type exprListOpt )
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
            if ( state.backtracking>0 ) { memoize(input, 59, newExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newExpr"

    public static class cast_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cast"
    // C:\\antlr\\TinyHaxeTry1.g:267:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:267:19: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==CAST) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred108_TinyHaxeTry1()) ) {
                    alt50=1;
                }
                else if ( (true) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:267:21: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST248=(Token)match(input,CAST,FOLLOW_CAST_in_cast3257); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST248);

                    LPAREN249=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN249);

                    pushFollow(FOLLOW_expr_in_cast3261);
                    expr250=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr250.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:267:38: ( COMMA funcType )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==COMMA) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:267:39: COMMA funcType
                            {
                            COMMA251=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast3264); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA251);

                            pushFollow(FOLLOW_funcType_in_cast3266);
                            funcType252=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType252.getTree());

                            }
                            break;

                    }

                    RPAREN253=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3270); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN253);



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
                    // 267:63: -> ^( CAST expr ( funcType )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:267:66: ^( CAST expr ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // C:\\antlr\\TinyHaxeTry1.g:267:78: ( funcType )?
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
                    // C:\\antlr\\TinyHaxeTry1.g:268:4: CAST LPAREN expr RPAREN
                    {
                    CAST254=(Token)match(input,CAST,FOLLOW_CAST_in_cast3286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST254);

                    LPAREN255=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN255);

                    pushFollow(FOLLOW_expr_in_cast3290);
                    expr256=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr256.getTree());
                    RPAREN257=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3292); if (state.failed) return retval; 
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
                    // 268:28: -> ^( CAST expr )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:268:30: ^( CAST expr )
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
            if ( state.backtracking>0 ) { memoize(input, 60, cast_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cast"

    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevelDecl"
    // C:\\antlr\\TinyHaxeTry1.g:272:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:272:19: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt51=4;
            switch ( input.LA(1) ) {
            case EXTERN:
            case CLASS:
                {
                alt51=1;
                }
                break;
            case INTERFACE:
                {
                alt51=2;
                }
                break;
            case ENUM:
                {
                alt51=3;
                }
                break;
            case TYPEDEF:
                {
                alt51=4;
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
                    // C:\\antlr\\TinyHaxeTry1.g:272:21: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_topLevelDecl3315);
                    classDecl258=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl258.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:273:25: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl3341);
                    interfaceDecl259=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl259.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:274:25: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl3367);
                    enumDecl260=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl260.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:275:25: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl3393);
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
            if ( state.backtracking>0 ) { memoize(input, 61, topLevelDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"

    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDecl"
    // C:\\antlr\\TinyHaxeTry1.g:277:1: enumDecl : ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM IDENTIFIER typeParamOpt enumBody ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:277:19: ( ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM IDENTIFIER typeParamOpt enumBody ) )
            // C:\\antlr\\TinyHaxeTry1.g:277:21: ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
            {
            ENUM262=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl3411); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM262);

            IDENTIFIER263=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl3413); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER263);

            pushFollow(FOLLOW_typeParamOpt_in_enumDecl3415);
            typeParamOpt264=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt264.getTree());
            LBRACE265=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl3417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE265);

            pushFollow(FOLLOW_enumBody_in_enumDecl3419);
            enumBody266=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody266.getTree());
            RBRACE267=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl3421); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE267);



            // AST REWRITE
            // elements: IDENTIFIER, enumBody, typeParamOpt, ENUM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 277:73: -> ^( ENUM IDENTIFIER typeParamOpt enumBody )
            {
                // C:\\antlr\\TinyHaxeTry1.g:277:76: ^( ENUM IDENTIFIER typeParamOpt enumBody )
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
            if ( state.backtracking>0 ) { memoize(input, 62, enumDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumDecl"

    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumBody"
    // C:\\antlr\\TinyHaxeTry1.g:279:1: enumBody : ( enumValueDecl )+ ;
    public final TinyHaxeTry1Parser.enumBody_return enumBody() throws RecognitionException {
        TinyHaxeTry1Parser.enumBody_return retval = new TinyHaxeTry1Parser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl268 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:279:19: ( ( enumValueDecl )+ )
            // C:\\antlr\\TinyHaxeTry1.g:279:21: ( enumValueDecl )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:279:21: ( enumValueDecl )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==IDENTIFIER||LA52_0==PP_IF||(LA52_0>=PP_ELSEIF && LA52_0<=PP_ERROR)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:279:22: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody3452);
            	    enumValueDecl268=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValueDecl268.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
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
            if ( state.backtracking>0 ) { memoize(input, 63, enumBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumBody"

    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValueDecl"
    // C:\\antlr\\TinyHaxeTry1.g:281:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER SEMI | pp );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:281:19: ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER SEMI | pp )
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==IDENTIFIER) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==LPAREN) ) {
                    alt53=1;
                }
                else if ( (LA53_1==SEMI) ) {
                    alt53=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA53_0==PP_IF||(LA53_0>=PP_ELSEIF && LA53_0<=PP_ERROR)) ) {
                alt53=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:281:20: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER269=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3466); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER269_tree = (Object)adaptor.create(IDENTIFIER269);
                    adaptor.addChild(root_0, IDENTIFIER269_tree);
                    }
                    LPAREN270=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl3468); if (state.failed) return retval;
                    pushFollow(FOLLOW_paramList_in_enumValueDecl3471);
                    paramList271=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList271.getTree());
                    RPAREN272=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl3473); if (state.failed) return retval;
                    SEMI273=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3476); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:282:24: IDENTIFIER SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER274=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3502); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER274_tree = (Object)adaptor.create(IDENTIFIER274);
                    adaptor.addChild(root_0, IDENTIFIER274_tree);
                    }
                    SEMI275=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3504); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:283:25: pp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_enumValueDecl3531);
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
            if ( state.backtracking>0 ) { memoize(input, 64, enumValueDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"

    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclList"
    // C:\\antlr\\TinyHaxeTry1.g:285:1: varDeclList : varDecl varDeclList ;
    public final TinyHaxeTry1Parser.varDeclList_return varDeclList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclList_return retval = new TinyHaxeTry1Parser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl277 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList278 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:285:19: ( varDecl varDeclList )
            // C:\\antlr\\TinyHaxeTry1.g:285:21: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDecl_in_varDeclList3546);
            varDecl277=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl277.getTree());
            pushFollow(FOLLOW_varDeclList_in_varDeclList3548);
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
            if ( state.backtracking>0 ) { memoize(input, 65, varDeclList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclList"

    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDecl"
    // C:\\antlr\\TinyHaxeTry1.g:288:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? varDeclPartList ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:288:19: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? varDeclPartList ) )
            // C:\\antlr\\TinyHaxeTry1.g:288:21: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // C:\\antlr\\TinyHaxeTry1.g:288:21: ( declAttrList )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=PUBLIC && LA54_0<=OVERRIDE)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:288:22: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl3570);
                    declAttrList279=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList279.getTree());

                    }
                    break;

            }

            VAR280=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl3574); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR280);

            pushFollow(FOLLOW_varDeclPartList_in_varDecl3576);
            varDeclPartList281=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList281.getTree());
            SEMI282=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl3578); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI282);



            // AST REWRITE
            // elements: declAttrList, varDeclPartList, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 288:62: -> ^( VAR[$VAR] ( declAttrList )? varDeclPartList )
            {
                // C:\\antlr\\TinyHaxeTry1.g:288:64: ^( VAR[$VAR] ( declAttrList )? varDeclPartList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, VAR280), root_1);

                // C:\\antlr\\TinyHaxeTry1.g:288:92: ( declAttrList )?
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
            if ( state.backtracking>0 ) { memoize(input, 66, varDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDecl"

    public static class varDeclPartList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPartList"
    // C:\\antlr\\TinyHaxeTry1.g:291:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:291:19: ( varDeclPart ( COMMA varDeclPart )* )
            // C:\\antlr\\TinyHaxeTry1.g:291:21: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3606);
            varDeclPart283=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart283.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:291:33: ( COMMA varDeclPart )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==COMMA) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:291:34: COMMA varDeclPart
            	    {
            	    COMMA284=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList3609); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3612);
            	    varDeclPart285=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart285.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
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
            if ( state.backtracking>0 ) { memoize(input, 67, varDeclPartList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPartList"

    public static class varDeclPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPart"
    // C:\\antlr\\TinyHaxeTry1.g:293:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:293:19: ( IDENTIFIER propDeclOpt typeTagOpt varInit )
            // C:\\antlr\\TinyHaxeTry1.g:293:20: IDENTIFIER propDeclOpt typeTagOpt varInit
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER286=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart3628); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER286_tree = (Object)adaptor.create(IDENTIFIER286);
            adaptor.addChild(root_0, IDENTIFIER286_tree);
            }
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3630);
            propDeclOpt287=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt287.getTree());
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3632);
            typeTagOpt288=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt288.getTree());
            pushFollow(FOLLOW_varInit_in_varDeclPart3634);
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
            if ( state.backtracking>0 ) { memoize(input, 68, varDeclPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclPart"

    public static class propDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDecl"
    // C:\\antlr\\TinyHaxeTry1.g:295:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:295:19: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2) )
            // C:\\antlr\\TinyHaxeTry1.g:295:21: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN290=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl3652); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN290);

            pushFollow(FOLLOW_propAccessor_in_propDecl3656);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            COMMA291=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl3658); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA291);

            pushFollow(FOLLOW_propAccessor_in_propDecl3662);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            RPAREN292=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl3664); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN292);



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
            // 295:73: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2)
            {
                // C:\\antlr\\TinyHaxeTry1.g:295:76: ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2)
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
            if ( state.backtracking>0 ) { memoize(input, 69, propDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propDecl"

    public static class propAccessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propAccessor"
    // C:\\antlr\\TinyHaxeTry1.g:297:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final TinyHaxeTry1Parser.propAccessor_return propAccessor() throws RecognitionException {
        TinyHaxeTry1Parser.propAccessor_return retval = new TinyHaxeTry1Parser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set293=null;

        Object set293_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:297:19: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // C:\\antlr\\TinyHaxeTry1.g:
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
            if ( state.backtracking>0 ) { memoize(input, 70, propAccessor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propAccessor"

    public static class propDeclOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDeclOpt"
    // C:\\antlr\\TinyHaxeTry1.g:302:1: propDeclOpt : ( propDecl | );
    public final TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        TinyHaxeTry1Parser.propDeclOpt_return retval = new TinyHaxeTry1Parser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.propDecl_return propDecl294 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:302:19: ( propDecl | )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==LPAREN) ) {
                alt56=1;
            }
            else if ( (LA56_0==EOF||LA56_0==SEMI||LA56_0==COMMA||LA56_0==COLON||LA56_0==EQ) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:302:21: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propDecl_in_propDeclOpt3786);
                    propDecl294=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl294.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:304:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 71, propDeclOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "propDeclOpt"

    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInit"
    // C:\\antlr\\TinyHaxeTry1.g:305:1: varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] expr ) | );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:305:19: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] expr ) | )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==EQ) ) {
                alt57=1;
            }
            else if ( (LA57_0==EOF||LA57_0==SEMI||LA57_0==COMMA||(LA57_0>=LPAREN && LA57_0<=RPAREN)) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:305:21: EQ expr
                    {
                    EQ295=(Token)match(input,EQ,FOLLOW_EQ_in_varInit3827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ295);

                    pushFollow(FOLLOW_expr_in_varInit3829);
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
                    // 305:29: -> ^( VAR_INIT[\"VAR_INIT\",true] expr )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:305:31: ^( VAR_INIT[\"VAR_INIT\",true] expr )
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
                    // C:\\antlr\\TinyHaxeTry1.g:307:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 72, varInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varInit"

    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcDecl"
    // C:\\antlr\\TinyHaxeTry1.g:308:1: funcDecl : ( declAttrList FUNCTION NEW RPAREN paramList LPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER declAttrList ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) );
    public final TinyHaxeTry1Parser.funcDecl_return funcDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcDecl_return retval = new TinyHaxeTry1Parser.funcDecl_return();
        retval.start = input.LT(1);
        int funcDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION298=null;
        Token NEW299=null;
        Token RPAREN300=null;
        Token LPAREN302=null;
        Token FUNCTION306=null;
        Token IDENTIFIER307=null;
        Token LPAREN309=null;
        Token RPAREN311=null;
        Token FUNCTION314=null;
        Token NEW315=null;
        Token LPAREN316=null;
        Token RPAREN318=null;
        Token FUNCTION321=null;
        Token IDENTIFIER322=null;
        Token LPAREN324=null;
        Token RPAREN326=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList297 = null;

        TinyHaxeTry1Parser.paramList_return paramList301 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt303 = null;

        TinyHaxeTry1Parser.block_return block304 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList305 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt308 = null;

        TinyHaxeTry1Parser.paramList_return paramList310 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt312 = null;

        TinyHaxeTry1Parser.block_return block313 = null;

        TinyHaxeTry1Parser.paramList_return paramList317 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt319 = null;

        TinyHaxeTry1Parser.block_return block320 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt323 = null;

        TinyHaxeTry1Parser.paramList_return paramList325 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt327 = null;

        TinyHaxeTry1Parser.block_return block328 = null;


        Object FUNCTION298_tree=null;
        Object NEW299_tree=null;
        Object RPAREN300_tree=null;
        Object LPAREN302_tree=null;
        Object FUNCTION306_tree=null;
        Object IDENTIFIER307_tree=null;
        Object LPAREN309_tree=null;
        Object RPAREN311_tree=null;
        Object FUNCTION314_tree=null;
        Object NEW315_tree=null;
        Object LPAREN316_tree=null;
        Object RPAREN318_tree=null;
        Object FUNCTION321_tree=null;
        Object IDENTIFIER322_tree=null;
        Object LPAREN324_tree=null;
        Object RPAREN326_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:308:19: ( declAttrList FUNCTION NEW RPAREN paramList LPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER declAttrList ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) )
            int alt58=4;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:308:21: declAttrList FUNCTION NEW RPAREN paramList LPAREN typeTagOpt block
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcDecl3862);
                    declAttrList297=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList297.getTree());
                    FUNCTION298=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION298);

                    NEW299=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl3866); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW299);

                    RPAREN300=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN300);

                    pushFollow(FOLLOW_paramList_in_funcDecl3870);
                    paramList301=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList301.getTree());
                    LPAREN302=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN302);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3874);
                    typeTagOpt303=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt303.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3876);
                    block304=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block304.getTree());


                    // AST REWRITE
                    // elements: paramList, block, declAttrList, typeTagOpt, NEW, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 308:88: -> ^( FUNCTION NEW paramList typeTagOpt block declAttrList )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:308:91: ^( FUNCTION NEW paramList typeTagOpt block declAttrList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        adaptor.addChild(root_1, stream_paramList.nextTree());
                        adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                        adaptor.addChild(root_1, stream_block.nextTree());
                        adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:309:25: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcDecl3921);
                    declAttrList305=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList305.getTree());
                    FUNCTION306=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3923); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION306);

                    IDENTIFIER307=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl3925); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER307);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl3927);
                    typeParamOpt308=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt308.getTree());
                    LPAREN309=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN309);

                    pushFollow(FOLLOW_paramList_in_funcDecl3931);
                    paramList310=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList310.getTree());
                    RPAREN311=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3933); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN311);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3935);
                    typeTagOpt312=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt312.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3937);
                    block313=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block313.getTree());


                    // AST REWRITE
                    // elements: typeTagOpt, typeParamOpt, FUNCTION, block, paramList, declAttrList, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 309:112: -> ^( FUNCTION IDENTIFIER declAttrList ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:309:114: ^( FUNCTION IDENTIFIER declAttrList ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_1, stream_declAttrList.nextTree());
                        // C:\\antlr\\TinyHaxeTry1.g:309:163: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        // C:\\antlr\\TinyHaxeTry1.g:309:174: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        adaptor.addChild(root_1, stream_block.nextTree());
                        // C:\\antlr\\TinyHaxeTry1.g:309:192: ( typeParamOpt )?
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
                    // C:\\antlr\\TinyHaxeTry1.g:310:25: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    FUNCTION314=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3986); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION314);

                    NEW315=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl3988); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW315);

                    LPAREN316=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3990); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN316);

                    pushFollow(FOLLOW_paramList_in_funcDecl3992);
                    paramList317=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList317.getTree());
                    RPAREN318=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3994); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN318);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3996);
                    typeTagOpt319=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt319.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3998);
                    block320=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block320.getTree());


                    // AST REWRITE
                    // elements: typeTagOpt, paramList, block, FUNCTION, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 310:79: -> ^( FUNCTION NEW paramList typeTagOpt block )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:310:81: ^( FUNCTION NEW paramList typeTagOpt block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        adaptor.addChild(root_1, stream_paramList.nextTree());
                        adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:311:25: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    FUNCTION321=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4040); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION321);

                    IDENTIFIER322=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl4042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER322);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl4044);
                    typeParamOpt323=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt323.getTree());
                    LPAREN324=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4046); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN324);

                    pushFollow(FOLLOW_paramList_in_funcDecl4048);
                    paramList325=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList325.getTree());
                    RPAREN326=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4050); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN326);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4052);
                    typeTagOpt327=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt327.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4054);
                    block328=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block328.getTree());


                    // AST REWRITE
                    // elements: block, FUNCTION, IDENTIFIER, typeParamOpt, typeTagOpt, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 311:99: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:311:101: ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_1, stream_paramList.nextTree());
                        adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                        adaptor.addChild(root_1, stream_block.nextTree());
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
            if ( state.backtracking>0 ) { memoize(input, 73, funcDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcDecl"

    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcProtoDecl"
    // C:\\antlr\\TinyHaxeTry1.g:313:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );
    public final TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcProtoDecl_return retval = new TinyHaxeTry1Parser.funcProtoDecl_return();
        retval.start = input.LT(1);
        int funcProtoDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION330=null;
        Token NEW331=null;
        Token LPAREN332=null;
        Token RPAREN334=null;
        Token SEMI336=null;
        Token FUNCTION338=null;
        Token IDENTIFIER339=null;
        Token LPAREN341=null;
        Token RPAREN343=null;
        Token SEMI345=null;
        Token FUNCTION346=null;
        Token NEW347=null;
        Token LPAREN348=null;
        Token RPAREN350=null;
        Token SEMI352=null;
        Token FUNCTION353=null;
        Token IDENTIFIER354=null;
        Token LPAREN356=null;
        Token RPAREN358=null;
        Token SEMI360=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList329 = null;

        TinyHaxeTry1Parser.paramList_return paramList333 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt335 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList337 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt340 = null;

        TinyHaxeTry1Parser.paramList_return paramList342 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt344 = null;

        TinyHaxeTry1Parser.paramList_return paramList349 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt351 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt355 = null;

        TinyHaxeTry1Parser.paramList_return paramList357 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt359 = null;


        Object FUNCTION330_tree=null;
        Object NEW331_tree=null;
        Object LPAREN332_tree=null;
        Object RPAREN334_tree=null;
        Object SEMI336_tree=null;
        Object FUNCTION338_tree=null;
        Object IDENTIFIER339_tree=null;
        Object LPAREN341_tree=null;
        Object RPAREN343_tree=null;
        Object SEMI345_tree=null;
        Object FUNCTION346_tree=null;
        Object NEW347_tree=null;
        Object LPAREN348_tree=null;
        Object RPAREN350_tree=null;
        Object SEMI352_tree=null;
        Object FUNCTION353_tree=null;
        Object IDENTIFIER354_tree=null;
        Object LPAREN356_tree=null;
        Object RPAREN358_tree=null;
        Object SEMI360_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:313:19: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) )
            int alt59=4;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:313:21: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4085);
                    declAttrList329=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList329.getTree());
                    FUNCTION330=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4087); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION330);

                    NEW331=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4089); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW331);

                    LPAREN332=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN332);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4093);
                    paramList333=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList333.getTree());
                    RPAREN334=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4095); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN334);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4097);
                    typeTagOpt335=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt335.getTree());
                    SEMI336=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI336);



                    // AST REWRITE
                    // elements: NEW, FUNCTION, declAttrList, typeTagOpt, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 313:87: -> ^( FUNCTION NEW paramList typeTagOpt declAttrList )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:313:90: ^( FUNCTION NEW paramList typeTagOpt declAttrList )
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
                    // C:\\antlr\\TinyHaxeTry1.g:314:25: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4139);
                    declAttrList337=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList337.getTree());
                    FUNCTION338=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION338);

                    IDENTIFIER339=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER339);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4145);
                    typeParamOpt340=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt340.getTree());
                    LPAREN341=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN341);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4149);
                    paramList342=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList342.getTree());
                    RPAREN343=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN343);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4153);
                    typeTagOpt344=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt344.getTree());
                    SEMI345=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI345);



                    // AST REWRITE
                    // elements: typeTagOpt, paramList, IDENTIFIER, declAttrList, typeParamOpt, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 314:111: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:314:113: ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt )
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
                    // C:\\antlr\\TinyHaxeTry1.g:315:25: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION346=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION346);

                    NEW347=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4198); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW347);

                    LPAREN348=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN348);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4202);
                    paramList349=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList349.getTree());
                    RPAREN350=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN350);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4206);
                    typeTagOpt351=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt351.getTree());
                    SEMI352=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI352);



                    // AST REWRITE
                    // elements: paramList, NEW, typeTagOpt, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 315:78: -> ^( FUNCTION NEW paramList typeTagOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:315:81: ^( FUNCTION NEW paramList typeTagOpt )
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
                    // C:\\antlr\\TinyHaxeTry1.g:316:25: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION353=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION353);

                    IDENTIFIER354=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER354);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4250);
                    typeParamOpt355=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt355.getTree());
                    LPAREN356=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN356);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4254);
                    paramList357=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList357.getTree());
                    RPAREN358=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4256); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN358);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4258);
                    typeTagOpt359=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt359.getTree());
                    SEMI360=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4260); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI360);



                    // AST REWRITE
                    // elements: typeParamOpt, typeTagOpt, paramList, FUNCTION, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 316:98: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:316:100: ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt )
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
            if ( state.backtracking>0 ) { memoize(input, 74, funcProtoDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"

    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDecl"
    // C:\\antlr\\TinyHaxeTry1.g:318:1: classDecl : ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBody RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? classBody ) ;
    public final TinyHaxeTry1Parser.classDecl_return classDecl() throws RecognitionException {
        TinyHaxeTry1Parser.classDecl_return retval = new TinyHaxeTry1Parser.classDecl_return();
        retval.start = input.LT(1);
        int classDecl_StartIndex = input.index();
        Object root_0 = null;

        Token EXTERN361=null;
        Token CLASS362=null;
        Token IDENTIFIER363=null;
        Token LBRACE366=null;
        Token RBRACE368=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt364 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt365 = null;

        TinyHaxeTry1Parser.classBody_return classBody367 = null;


        Object EXTERN361_tree=null;
        Object CLASS362_tree=null;
        Object IDENTIFIER363_tree=null;
        Object LBRACE366_tree=null;
        Object RBRACE368_tree=null;
        RewriteRuleTokenStream stream_EXTERN=new RewriteRuleTokenStream(adaptor,"token EXTERN");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:318:19: ( ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBody RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? classBody ) )
            // C:\\antlr\\TinyHaxeTry1.g:318:21: ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBody RBRACE
            {
            // C:\\antlr\\TinyHaxeTry1.g:318:21: ( EXTERN )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==EXTERN) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:0:0: EXTERN
                    {
                    EXTERN361=(Token)match(input,EXTERN,FOLLOW_EXTERN_in_classDecl4290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTERN.add(EXTERN361);


                    }
                    break;

            }

            CLASS362=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4293); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS362);

            IDENTIFIER363=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4295); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER363);

            pushFollow(FOLLOW_typeParamOpt_in_classDecl4297);
            typeParamOpt364=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt364.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_classDecl4299);
            inheritListOpt365=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt365.getTree());
            LBRACE366=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classDecl4301); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE366);

            pushFollow(FOLLOW_classBody_in_classDecl4303);
            classBody367=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBody.add(classBody367.getTree());
            RBRACE368=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classDecl4305); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE368);



            // AST REWRITE
            // elements: classBody, CLASS, inheritListOpt, typeParamOpt, EXTERN, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 318:98: -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? classBody )
            {
                // C:\\antlr\\TinyHaxeTry1.g:318:100: ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? classBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CLASS.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\antlr\\TinyHaxeTry1.g:318:119: ( EXTERN )?
                if ( stream_EXTERN.hasNext() ) {
                    adaptor.addChild(root_1, stream_EXTERN.nextNode());

                }
                stream_EXTERN.reset();
                // C:\\antlr\\TinyHaxeTry1.g:318:127: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                // C:\\antlr\\TinyHaxeTry1.g:318:141: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();
                adaptor.addChild(root_1, stream_classBody.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 75, classDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDecl"

    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // C:\\antlr\\TinyHaxeTry1.g:320:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );
    public final TinyHaxeTry1Parser.classBody_return classBody() throws RecognitionException {
        TinyHaxeTry1Parser.classBody_return retval = new TinyHaxeTry1Parser.classBody_return();
        retval.start = input.LT(1);
        int classBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl369 = null;

        TinyHaxeTry1Parser.classBody_return classBody370 = null;

        TinyHaxeTry1Parser.funcDecl_return funcDecl371 = null;

        TinyHaxeTry1Parser.classBody_return classBody372 = null;

        TinyHaxeTry1Parser.pp_return pp373 = null;

        TinyHaxeTry1Parser.classBody_return classBody374 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:320:19: ( varDecl classBody | funcDecl classBody | pp classBody | )
            int alt61=4;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:320:21: varDecl classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_classBody4340);
                    varDecl369=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl369.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody4342);
                    classBody370=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody370.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:321:25: funcDecl classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcDecl_in_classBody4368);
                    funcDecl371=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl371.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody4370);
                    classBody372=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody372.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:322:25: pp classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_classBody4396);
                    pp373=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp373.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody4398);
                    classBody374=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody374.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:324:2: 
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

    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDecl"
    // C:\\antlr\\TinyHaxeTry1.g:325:1: interfaceDecl : INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
    public final TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceDecl_return retval = new TinyHaxeTry1Parser.interfaceDecl_return();
        retval.start = input.LT(1);
        int interfaceDecl_StartIndex = input.index();
        Object root_0 = null;

        Token INTERFACE375=null;
        Token LBRACE378=null;
        Token RBRACE380=null;
        TinyHaxeTry1Parser.type_return type376 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt377 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody379 = null;


        Object INTERFACE375_tree=null;
        Object LBRACE378_tree=null;
        Object RBRACE380_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:325:19: ( INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            // C:\\antlr\\TinyHaxeTry1.g:325:21: INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            INTERFACE375=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl4433); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE375_tree = (Object)adaptor.create(INTERFACE375);
            adaptor.addChild(root_0, INTERFACE375_tree);
            }
            pushFollow(FOLLOW_type_in_interfaceDecl4435);
            type376=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type376.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl4437);
            inheritListOpt377=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt377.getTree());
            LBRACE378=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl4439); if (state.failed) return retval;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl4442);
            interfaceBody379=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody379.getTree());
            RBRACE380=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl4444); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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

    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceBody"
    // C:\\antlr\\TinyHaxeTry1.g:327:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );
    public final TinyHaxeTry1Parser.interfaceBody_return interfaceBody() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceBody_return retval = new TinyHaxeTry1Parser.interfaceBody_return();
        retval.start = input.LT(1);
        int interfaceBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl381 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody382 = null;

        TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl383 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody384 = null;

        TinyHaxeTry1Parser.pp_return pp385 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody386 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:327:19: ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | )
            int alt62=4;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:327:21: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_interfaceBody4458);
                    varDecl381=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl381.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4460);
                    interfaceBody382=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody382.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:328:25: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody4486);
                    funcProtoDecl383=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl383.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4488);
                    interfaceBody384=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody384.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:329:25: pp interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_interfaceBody4514);
                    pp385=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp385.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4516);
                    interfaceBody386=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody386.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:331:1: 
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

    public static class inheritList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritList"
    // C:\\antlr\\TinyHaxeTry1.g:333:1: inheritList : inherit ( COMMA inherit )* ;
    public final TinyHaxeTry1Parser.inheritList_return inheritList() throws RecognitionException {
        TinyHaxeTry1Parser.inheritList_return retval = new TinyHaxeTry1Parser.inheritList_return();
        retval.start = input.LT(1);
        int inheritList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA388=null;
        TinyHaxeTry1Parser.inherit_return inherit387 = null;

        TinyHaxeTry1Parser.inherit_return inherit389 = null;


        Object COMMA388_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:333:19: ( inherit ( COMMA inherit )* )
            // C:\\antlr\\TinyHaxeTry1.g:333:21: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inherit_in_inheritList4553);
            inherit387=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit387.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:333:29: ( COMMA inherit )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==COMMA) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:333:30: COMMA inherit
            	    {
            	    COMMA388=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList4556); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inherit_in_inheritList4559);
            	    inherit389=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit389.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 79, inheritList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritList"

    public static class inheritListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritListOpt"
    // C:\\antlr\\TinyHaxeTry1.g:335:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList ) | );
    public final TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.inheritListOpt_return retval = new TinyHaxeTry1Parser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.inheritList_return inheritList390 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:335:19: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList ) | )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=EXTENDS && LA64_0<=IMPLEMENTS)) ) {
                alt64=1;
            }
            else if ( (LA64_0==LBRACE) ) {
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
                    // C:\\antlr\\TinyHaxeTry1.g:335:21: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt4573);
                    inheritList390=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList390.getTree());


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
                    // 335:33: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:335:35: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList )
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
                    // C:\\antlr\\TinyHaxeTry1.g:337:6: 
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

    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inherit"
    // C:\\antlr\\TinyHaxeTry1.g:338:1: inherit : ( EXTENDS type | IMPLEMENTS type );
    public final TinyHaxeTry1Parser.inherit_return inherit() throws RecognitionException {
        TinyHaxeTry1Parser.inherit_return retval = new TinyHaxeTry1Parser.inherit_return();
        retval.start = input.LT(1);
        int inherit_StartIndex = input.index();
        Object root_0 = null;

        Token EXTENDS391=null;
        Token IMPLEMENTS393=null;
        TinyHaxeTry1Parser.type_return type392 = null;

        TinyHaxeTry1Parser.type_return type394 = null;


        Object EXTENDS391_tree=null;
        Object IMPLEMENTS393_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:338:19: ( EXTENDS type | IMPLEMENTS type )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==EXTENDS) ) {
                alt65=1;
            }
            else if ( (LA65_0==IMPLEMENTS) ) {
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
                    // C:\\antlr\\TinyHaxeTry1.g:338:21: EXTENDS type
                    {
                    root_0 = (Object)adaptor.nil();

                    EXTENDS391=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit4611); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS391_tree = (Object)adaptor.create(EXTENDS391);
                    adaptor.addChild(root_0, EXTENDS391_tree);
                    }
                    pushFollow(FOLLOW_type_in_inherit4613);
                    type392=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type392.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:339:25: IMPLEMENTS type
                    {
                    root_0 = (Object)adaptor.nil();

                    IMPLEMENTS393=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit4639); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPLEMENTS393_tree = (Object)adaptor.create(IMPLEMENTS393);
                    adaptor.addChild(root_0, IMPLEMENTS393_tree);
                    }
                    pushFollow(FOLLOW_type_in_inherit4641);
                    type394=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type394.getTree());

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

    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedefDecl"
    // C:\\antlr\\TinyHaxeTry1.g:341:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final TinyHaxeTry1Parser.typedefDecl_return typedefDecl() throws RecognitionException {
        TinyHaxeTry1Parser.typedefDecl_return retval = new TinyHaxeTry1Parser.typedefDecl_return();
        retval.start = input.LT(1);
        int typedefDecl_StartIndex = input.index();
        Object root_0 = null;

        Token TYPEDEF395=null;
        Token IDENTIFIER396=null;
        Token EQ397=null;
        TinyHaxeTry1Parser.funcType_return funcType398 = null;


        Object TYPEDEF395_tree=null;
        Object IDENTIFIER396_tree=null;
        Object EQ397_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:341:19: ( TYPEDEF IDENTIFIER EQ funcType )
            // C:\\antlr\\TinyHaxeTry1.g:341:21: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            TYPEDEF395=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl4656); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF395_tree = (Object)adaptor.create(TYPEDEF395);
            adaptor.addChild(root_0, TYPEDEF395_tree);
            }
            IDENTIFIER396=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl4658); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER396_tree = (Object)adaptor.create(IDENTIFIER396);
            adaptor.addChild(root_0, IDENTIFIER396_tree);
            }
            EQ397=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl4660); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ397_tree = (Object)adaptor.create(EQ397);
            adaptor.addChild(root_0, EQ397_tree);
            }
            pushFollow(FOLLOW_funcType_in_typedefDecl4662);
            funcType398=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType398.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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

    public static class typeExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeExtend"
    // C:\\antlr\\TinyHaxeTry1.g:343:1: typeExtend : GT funcType COMMA ;
    public final TinyHaxeTry1Parser.typeExtend_return typeExtend() throws RecognitionException {
        TinyHaxeTry1Parser.typeExtend_return retval = new TinyHaxeTry1Parser.typeExtend_return();
        retval.start = input.LT(1);
        int typeExtend_StartIndex = input.index();
        Object root_0 = null;

        Token GT399=null;
        Token COMMA401=null;
        TinyHaxeTry1Parser.funcType_return funcType400 = null;


        Object GT399_tree=null;
        Object COMMA401_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:343:19: ( GT funcType COMMA )
            // C:\\antlr\\TinyHaxeTry1.g:343:21: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            GT399=(Token)match(input,GT,FOLLOW_GT_in_typeExtend4678); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT399_tree = (Object)adaptor.create(GT399);
            adaptor.addChild(root_0, GT399_tree);
            }
            pushFollow(FOLLOW_funcType_in_typeExtend4680);
            funcType400=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType400.getTree());
            COMMA401=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend4682); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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

    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonType"
    // C:\\antlr\\TinyHaxeTry1.g:345:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
    public final TinyHaxeTry1Parser.anonType_return anonType() throws RecognitionException {
        TinyHaxeTry1Parser.anonType_return retval = new TinyHaxeTry1Parser.anonType_return();
        retval.start = input.LT(1);
        int anonType_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE402=null;
        Token RBRACE408=null;
        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList403 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList404 = null;

        TinyHaxeTry1Parser.typeExtend_return typeExtend405 = null;

        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList406 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList407 = null;


        Object LBRACE402_tree=null;
        Object RBRACE408_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:345:19: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            // C:\\antlr\\TinyHaxeTry1.g:345:21: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            LBRACE402=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType4701); if (state.failed) return retval;
            // C:\\antlr\\TinyHaxeTry1.g:346:4: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt67=4;
            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt67=1;
                }
                break;
            case IDENTIFIER:
                {
                alt67=2;
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
                alt67=3;
                }
                break;
            case GT:
                {
                alt67=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:347:22: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:347:27: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType4736);
                    anonTypeFieldList403=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList403.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:348:26: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType4764);
                    varDeclList404=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList404.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:349:27: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType4793);
                    typeExtend405=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend405.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:349:38: ( | anonTypeFieldList | varDeclList )
                    int alt66=3;
                    switch ( input.LA(1) ) {
                    case RBRACE:
                        {
                        alt66=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt66=2;
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
                        alt66=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:350:24: 
                            {
                            }
                            break;
                        case 2 :
                            // C:\\antlr\\TinyHaxeTry1.g:350:25: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType4821);
                            anonTypeFieldList406=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList406.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\antlr\\TinyHaxeTry1.g:351:25: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType4847);
                            varDeclList407=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList407.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE408=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType4895); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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

    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeFieldList"
    // C:\\antlr\\TinyHaxeTry1.g:355:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
    public final TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeFieldList_return retval = new TinyHaxeTry1Parser.anonTypeFieldList_return();
        retval.start = input.LT(1);
        int anonTypeFieldList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA410=null;
        TinyHaxeTry1Parser.anonTypeField_return anonTypeField409 = null;

        TinyHaxeTry1Parser.anonTypeField_return anonTypeField411 = null;


        Object COMMA410_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:355:19: ( anonTypeField ( COMMA anonTypeField )* )
            // C:\\antlr\\TinyHaxeTry1.g:355:21: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4905);
            anonTypeField409=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField409.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:355:35: ( COMMA anonTypeField )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==COMMA) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:355:36: COMMA anonTypeField
            	    {
            	    COMMA410=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList4908); if (state.failed) return retval;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4911);
            	    anonTypeField411=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField411.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
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

    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLit"
    // C:\\antlr\\TinyHaxeTry1.g:358:1: objLit : '{' objLitElemList '}' ;
    public final TinyHaxeTry1Parser.objLit_return objLit() throws RecognitionException {
        TinyHaxeTry1Parser.objLit_return retval = new TinyHaxeTry1Parser.objLit_return();
        retval.start = input.LT(1);
        int objLit_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal412=null;
        Token char_literal414=null;
        TinyHaxeTry1Parser.objLitElemList_return objLitElemList413 = null;


        Object char_literal412_tree=null;
        Object char_literal414_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:358:19: ( '{' objLitElemList '}' )
            // C:\\antlr\\TinyHaxeTry1.g:358:21: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal412=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit4934); if (state.failed) return retval;
            pushFollow(FOLLOW_objLitElemList_in_objLit4937);
            objLitElemList413=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList413.getTree());
            char_literal414=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit4939); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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

    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeField"
    // C:\\antlr\\TinyHaxeTry1.g:360:1: anonTypeField : IDENTIFIER COLON funcType ;
    public final TinyHaxeTry1Parser.anonTypeField_return anonTypeField() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeField_return retval = new TinyHaxeTry1Parser.anonTypeField_return();
        retval.start = input.LT(1);
        int anonTypeField_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER415=null;
        Token COLON416=null;
        TinyHaxeTry1Parser.funcType_return funcType417 = null;


        Object IDENTIFIER415_tree=null;
        Object COLON416_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:360:19: ( IDENTIFIER COLON funcType )
            // C:\\antlr\\TinyHaxeTry1.g:360:20: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER415=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField4951); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER415_tree = (Object)adaptor.create(IDENTIFIER415);
            adaptor.addChild(root_0, IDENTIFIER415_tree);
            }
            COLON416=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField4953); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_anonTypeField4956);
            funcType417=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType417.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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

    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElemList"
    // C:\\antlr\\TinyHaxeTry1.g:362:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
    public final TinyHaxeTry1Parser.objLitElemList_return objLitElemList() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElemList_return retval = new TinyHaxeTry1Parser.objLitElemList_return();
        retval.start = input.LT(1);
        int objLitElemList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA419=null;
        TinyHaxeTry1Parser.objLitElem_return objLitElem418 = null;

        TinyHaxeTry1Parser.objLitElem_return objLitElem420 = null;


        Object COMMA419_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:362:19: ( objLitElem ( COMMA objLitElem )* )
            // C:\\antlr\\TinyHaxeTry1.g:362:21: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_objLitElem_in_objLitElemList4968);
            objLitElem418=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem418.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:362:32: ( COMMA objLitElem )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==COMMA) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:362:33: COMMA objLitElem
            	    {
            	    COMMA419=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList4971); if (state.failed) return retval;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList4974);
            	    objLitElem420=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem420.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 88, objLitElemList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLitElemList"

    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElem"
    // C:\\antlr\\TinyHaxeTry1.g:364:1: objLitElem : IDENTIFIER COLON expr ;
    public final TinyHaxeTry1Parser.objLitElem_return objLitElem() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElem_return retval = new TinyHaxeTry1Parser.objLitElem_return();
        retval.start = input.LT(1);
        int objLitElem_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER421=null;
        Token COLON422=null;
        TinyHaxeTry1Parser.expr_return expr423 = null;


        Object IDENTIFIER421_tree=null;
        Object COLON422_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:364:19: ( IDENTIFIER COLON expr )
            // C:\\antlr\\TinyHaxeTry1.g:364:20: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER421=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem4991); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER421_tree = (Object)adaptor.create(IDENTIFIER421);
            adaptor.addChild(root_0, IDENTIFIER421_tree);
            }
            COLON422=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem4993); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_objLitElem4996);
            expr423=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr423.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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

    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementarySymbol"
    // C:\\antlr\\TinyHaxeTry1.g:367:1: elementarySymbol : ( LONGLITERAL | INTLITERAL | STRINGLITERAL | CHARLITERAL | FLOATNUM );
    public final TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        TinyHaxeTry1Parser.elementarySymbol_return retval = new TinyHaxeTry1Parser.elementarySymbol_return();
        retval.start = input.LT(1);
        int elementarySymbol_StartIndex = input.index();
        Object root_0 = null;

        Token set424=null;

        Object set424_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:368:2: ( LONGLITERAL | INTLITERAL | STRINGLITERAL | CHARLITERAL | FLOATNUM )
            // C:\\antlr\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set424=(Token)input.LT(1);
            if ( (input.LA(1)>=LONGLITERAL && input.LA(1)<=FLOATNUM) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set424));
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
            if ( state.backtracking>0 ) { memoize(input, 90, elementarySymbol_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred41_TinyHaxeTry1
    public final void synpred41_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:148:9: ( block )
        // C:\\antlr\\TinyHaxeTry1.g:148:9: block
        {
        pushFollow(FOLLOW_block_in_synpred41_TinyHaxeTry11676);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_TinyHaxeTry1

    // $ANTLR start synpred42_TinyHaxeTry1
    public final void synpred42_TinyHaxeTry1_fragment() throws RecognitionException {   
        TinyHaxeTry1Parser.statement_return st2 = null;


        // C:\\antlr\\TinyHaxeTry1.g:149:41: ( ELSE st2= statement )
        // C:\\antlr\\TinyHaxeTry1.g:149:41: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred42_TinyHaxeTry11695); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred42_TinyHaxeTry11699);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_TinyHaxeTry1

    // $ANTLR start synpred49_TinyHaxeTry1
    public final void synpred49_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:156:17: ( expr )
        // C:\\antlr\\TinyHaxeTry1.g:156:17: expr
        {
        pushFollow(FOLLOW_expr_in_synpred49_TinyHaxeTry11827);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_TinyHaxeTry1

    // $ANTLR start synpred56_TinyHaxeTry1
    public final void synpred56_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:160:9: ( expr SEMI )
        // C:\\antlr\\TinyHaxeTry1.g:160:9: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred56_TinyHaxeTry11924);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred56_TinyHaxeTry11927); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_TinyHaxeTry1

    // $ANTLR start synpred57_TinyHaxeTry1
    public final void synpred57_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:161:9: ( IDENTIFIER COLON statement )
        // C:\\antlr\\TinyHaxeTry1.g:161:9: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred57_TinyHaxeTry11939); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred57_TinyHaxeTry11941); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred57_TinyHaxeTry11943);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_TinyHaxeTry1

    // $ANTLR start synpred63_TinyHaxeTry1
    public final void synpred63_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:201:21: ( exprList )
        // C:\\antlr\\TinyHaxeTry1.g:201:21: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred63_TinyHaxeTry12365);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_TinyHaxeTry1

    // $ANTLR start synpred91_TinyHaxeTry1
    public final void synpred91_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:229:21: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr )
        // C:\\antlr\\TinyHaxeTry1.g:229:21: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
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

        pushFollow(FOLLOW_prefixExpr_in_synpred91_TinyHaxeTry12822);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred91_TinyHaxeTry1

    // $ANTLR start synpred94_TinyHaxeTry1
    public final void synpred94_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:245:4: ( value LPAREN exprListOpt RPAREN )
        // C:\\antlr\\TinyHaxeTry1.g:245:4: value LPAREN exprListOpt RPAREN
        {
        pushFollow(FOLLOW_value_in_synpred94_TinyHaxeTry12921);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred94_TinyHaxeTry12923); if (state.failed) return ;
        pushFollow(FOLLOW_exprListOpt_in_synpred94_TinyHaxeTry12925);
        exprListOpt();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred94_TinyHaxeTry12927); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_TinyHaxeTry1

    // $ANTLR start synpred95_TinyHaxeTry1
    public final void synpred95_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:246:4: ( value DOT IDENTIFIER )
        // C:\\antlr\\TinyHaxeTry1.g:246:4: value DOT IDENTIFIER
        {
        pushFollow(FOLLOW_value_in_synpred95_TinyHaxeTry12946);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,DOT,FOLLOW_DOT_in_synpred95_TinyHaxeTry12948); if (state.failed) return ;
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred95_TinyHaxeTry12950); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred95_TinyHaxeTry1

    // $ANTLR start synpred96_TinyHaxeTry1
    public final void synpred96_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:247:4: ( value LBRACKET expr RBRACKET )
        // C:\\antlr\\TinyHaxeTry1.g:247:4: value LBRACKET expr RBRACKET
        {
        pushFollow(FOLLOW_value_in_synpred96_TinyHaxeTry12956);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred96_TinyHaxeTry12958); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred96_TinyHaxeTry12960);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred96_TinyHaxeTry12962); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_TinyHaxeTry1

    // $ANTLR start synpred97_TinyHaxeTry1
    public final void synpred97_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:248:4: ( value PLUSPLUS )
        // C:\\antlr\\TinyHaxeTry1.g:248:4: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred97_TinyHaxeTry12967);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred97_TinyHaxeTry12969); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_TinyHaxeTry1

    // $ANTLR start synpred98_TinyHaxeTry1
    public final void synpred98_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:250:4: ( value SUBSUB )
        // C:\\antlr\\TinyHaxeTry1.g:250:4: value SUBSUB
        {
        pushFollow(FOLLOW_value_in_synpred98_TinyHaxeTry12976);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred98_TinyHaxeTry12978); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred98_TinyHaxeTry1

    // $ANTLR start synpred100_TinyHaxeTry1
    public final void synpred100_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:256:25: ( arrayLit )
        // C:\\antlr\\TinyHaxeTry1.g:256:25: arrayLit
        {
        pushFollow(FOLLOW_arrayLit_in_synpred100_TinyHaxeTry13021);
        arrayLit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_TinyHaxeTry1

    // $ANTLR start synpred105_TinyHaxeTry1
    public final void synpred105_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:261:34: ( expr )
        // C:\\antlr\\TinyHaxeTry1.g:261:34: expr
        {
        pushFollow(FOLLOW_expr_in_synpred105_TinyHaxeTry13155);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_TinyHaxeTry1

    // $ANTLR start synpred106_TinyHaxeTry1
    public final void synpred106_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:261:25: ( LPAREN ( expr | statement ) RPAREN )
        // C:\\antlr\\TinyHaxeTry1.g:261:25: LPAREN ( expr | statement ) RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred106_TinyHaxeTry13151); if (state.failed) return ;
        // C:\\antlr\\TinyHaxeTry1.g:261:33: ( expr | statement )
        int alt77=2;
        alt77 = dfa77.predict(input);
        switch (alt77) {
            case 1 :
                // C:\\antlr\\TinyHaxeTry1.g:261:34: expr
                {
                pushFollow(FOLLOW_expr_in_synpred106_TinyHaxeTry13155);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\antlr\\TinyHaxeTry1.g:261:39: statement
                {
                pushFollow(FOLLOW_statement_in_synpred106_TinyHaxeTry13157);
                statement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred106_TinyHaxeTry13160); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_TinyHaxeTry1

    // $ANTLR start synpred108_TinyHaxeTry1
    public final void synpred108_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:267:21: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // C:\\antlr\\TinyHaxeTry1.g:267:21: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred108_TinyHaxeTry13257); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred108_TinyHaxeTry13259); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred108_TinyHaxeTry13261);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // C:\\antlr\\TinyHaxeTry1.g:267:38: ( COMMA funcType )?
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( (LA78_0==COMMA) ) {
            alt78=1;
        }
        switch (alt78) {
            case 1 :
                // C:\\antlr\\TinyHaxeTry1.g:267:39: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred108_TinyHaxeTry13264); if (state.failed) return ;
                pushFollow(FOLLOW_funcType_in_synpred108_TinyHaxeTry13266);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred108_TinyHaxeTry13270); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_TinyHaxeTry1

    // Delegated rules

    public final boolean synpred95_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred49_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred91_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred57_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred56_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA77 dfa77 = new DFA77(this);
    static final String DFA26_eotS =
        "\62\uffff";
    static final String DFA26_eofS =
        "\62\uffff";
    static final String DFA26_minS =
        "\1\17\2\0\20\uffff\1\0\36\uffff";
    static final String DFA26_maxS =
        "\1\u009c\2\0\20\uffff\1\0\36\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\41\uffff"+
        "\1\1\1\16\1\15";
    static final String DFA26_specialS =
        "\1\uffff\1\0\1\1\20\uffff\1\2\36\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\1\23\1\15\10\uffff\3\15\1\uffff\1\15\2\uffff\1\15\6\uffff"+
            "\2\15\1\3\1\uffff\1\5\1\6\1\11\1\12\1\13\1\14\1\1\1\uffff\1"+
            "\4\3\uffff\1\10\1\7\1\uffff\30\15\2\uffff\1\15\6\uffff\5\15"+
            "\40\uffff\10\15\21\uffff\3\15",
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
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "147:1: statement : ( block | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | forStmt | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO statement WHILE parExpression ) | tryStmt | switchStmt | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 47;}

                        else if ( (synpred56_TinyHaxeTry1()) ) {s = 13;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 47;}

                        else if ( (synpred56_TinyHaxeTry1()) ) {s = 13;}

                        else if ( (true) ) {s = 48;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_19 = input.LA(1);

                         
                        int index26_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_TinyHaxeTry1()) ) {s = 13;}

                        else if ( (synpred57_TinyHaxeTry1()) ) {s = 49;}

                         
                        input.seek(index26_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\53\uffff";
    static final String DFA46_eofS =
        "\1\13\52\uffff";
    static final String DFA46_minS =
        "\1\17\7\0\43\uffff";
    static final String DFA46_maxS =
        "\1\u009c\7\0\43\uffff";
    static final String DFA46_acceptS =
        "\10\uffff\1\2\1\4\1\5\1\6\35\uffff\1\1\1\3";
    static final String DFA46_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\43\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\13\1\5\1\10\7\uffff\2\13\1\1\1\7\1\13\1\2\1\13\6\uffff\1"+
            "\13\1\uffff\2\13\10\uffff\1\3\1\13\1\uffff\1\13\5\uffff\22\13"+
            "\1\12\1\11\1\uffff\1\4\4\uffff\1\13\6\uffff\5\6\40\uffff\10"+
            "\13\21\uffff\3\13",
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
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "244:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value exprListOpt ) | value DOT IDENTIFIER | value LBRACKET expr RBRACKET | value PLUSPLUS | value SUBSUB | value );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_1 = input.LA(1);

                         
                        int index46_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index46_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_2 = input.LA(1);

                         
                        int index46_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index46_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_3 = input.LA(1);

                         
                        int index46_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index46_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA46_4 = input.LA(1);

                         
                        int index46_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index46_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA46_5 = input.LA(1);

                         
                        int index46_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index46_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA46_6 = input.LA(1);

                         
                        int index46_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index46_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA46_7 = input.LA(1);

                         
                        int index46_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred98_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index46_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA48_eotS =
        "\53\uffff";
    static final String DFA48_eofS =
        "\1\10\52\uffff";
    static final String DFA48_minS =
        "\1\17\1\uffff\1\0\4\uffff\1\0\43\uffff";
    static final String DFA48_maxS =
        "\1\u009c\1\uffff\1\0\4\uffff\1\0\43\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\40\uffff\1\2"+
        "\1\7";
    static final String DFA48_specialS =
        "\2\uffff\1\0\4\uffff\1\1\43\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\10\1\5\1\10\7\uffff\2\10\1\1\1\7\1\10\1\2\1\10\6\uffff\1"+
            "\10\1\uffff\2\10\10\uffff\1\3\1\10\1\uffff\1\10\5\uffff\24\10"+
            "\1\uffff\1\4\4\uffff\1\10\6\uffff\5\6\40\uffff\10\10\21\uffff"+
            "\3\10",
            "",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "255:1: value : ( funcLit | arrayLit | objLit | NULL | IDENTIFIER | elementarySymbol | LPAREN ( expr | statement ) RPAREN | );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_2 = input.LA(1);

                         
                        int index48_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index48_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_7 = input.LA(1);

                         
                        int index48_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index48_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\60\uffff";
    static final String DFA47_eofS =
        "\60\uffff";
    static final String DFA47_minS =
        "\1\17\43\0\14\uffff";
    static final String DFA47_maxS =
        "\1\u009c\43\0\14\uffff";
    static final String DFA47_acceptS =
        "\44\uffff\1\1\1\2\12\uffff";
    static final String DFA47_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\14\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\45\1\10\1\13\10\uffff\1\41\1\4\1\12\1\44\1\5\2\uffff\1\22"+
            "\6\uffff\1\35\1\36\1\45\1\uffff\6\45\1\6\1\uffff\1\45\3\uffff"+
            "\2\45\1\uffff\1\42\1\40\1\37\1\31\1\32\1\33\1\34\1\26\1\27\1"+
            "\30\1\23\1\24\1\25\1\21\1\15\1\16\1\17\1\20\1\14\1\1\1\22\1"+
            "\7\1\2\1\3\2\uffff\1\43\6\uffff\5\11\40\uffff\10\43\21\uffff"+
            "\3\43",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "261:33: ( expr | statement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_1 = input.LA(1);

                         
                        int index47_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_2 = input.LA(1);

                         
                        int index47_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA47_3 = input.LA(1);

                         
                        int index47_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA47_4 = input.LA(1);

                         
                        int index47_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA47_5 = input.LA(1);

                         
                        int index47_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA47_6 = input.LA(1);

                         
                        int index47_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA47_7 = input.LA(1);

                         
                        int index47_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA47_8 = input.LA(1);

                         
                        int index47_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA47_9 = input.LA(1);

                         
                        int index47_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA47_10 = input.LA(1);

                         
                        int index47_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA47_11 = input.LA(1);

                         
                        int index47_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA47_12 = input.LA(1);

                         
                        int index47_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA47_13 = input.LA(1);

                         
                        int index47_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA47_14 = input.LA(1);

                         
                        int index47_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA47_15 = input.LA(1);

                         
                        int index47_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA47_16 = input.LA(1);

                         
                        int index47_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA47_17 = input.LA(1);

                         
                        int index47_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA47_18 = input.LA(1);

                         
                        int index47_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA47_19 = input.LA(1);

                         
                        int index47_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA47_20 = input.LA(1);

                         
                        int index47_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA47_21 = input.LA(1);

                         
                        int index47_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA47_22 = input.LA(1);

                         
                        int index47_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA47_23 = input.LA(1);

                         
                        int index47_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA47_24 = input.LA(1);

                         
                        int index47_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA47_25 = input.LA(1);

                         
                        int index47_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA47_26 = input.LA(1);

                         
                        int index47_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA47_27 = input.LA(1);

                         
                        int index47_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA47_28 = input.LA(1);

                         
                        int index47_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA47_29 = input.LA(1);

                         
                        int index47_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA47_30 = input.LA(1);

                         
                        int index47_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA47_31 = input.LA(1);

                         
                        int index47_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA47_32 = input.LA(1);

                         
                        int index47_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA47_33 = input.LA(1);

                         
                        int index47_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA47_34 = input.LA(1);

                         
                        int index47_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA47_35 = input.LA(1);

                         
                        int index47_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index47_35);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\14\uffff";
    static final String DFA58_eofS =
        "\14\uffff";
    static final String DFA58_minS =
        "\6\23\2\20\4\uffff";
    static final String DFA58_maxS =
        "\6\33\2\121\4\uffff";
    static final String DFA58_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA58_specialS =
        "\14\uffff}>";
    static final String[] DFA58_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\1\11\100\uffff\1\10",
            "\1\13\100\uffff\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

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
        public String getDescription() {
            return "308:1: funcDecl : ( declAttrList FUNCTION NEW RPAREN paramList LPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER declAttrList ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) );";
        }
    }
    static final String DFA59_eotS =
        "\14\uffff";
    static final String DFA59_eofS =
        "\14\uffff";
    static final String DFA59_minS =
        "\6\23\2\20\4\uffff";
    static final String DFA59_maxS =
        "\6\33\2\121\4\uffff";
    static final String DFA59_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA59_specialS =
        "\14\uffff}>";
    static final String[] DFA59_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7",
            "\1\11\100\uffff\1\10",
            "\1\13\100\uffff\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "313:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );";
        }
    }
    static final String DFA61_eotS =
        "\12\uffff";
    static final String DFA61_eofS =
        "\1\11\11\uffff";
    static final String DFA61_minS =
        "\6\23\4\uffff";
    static final String DFA61_maxS =
        "\6\124\4\uffff";
    static final String DFA61_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA61_specialS =
        "\12\uffff}>";
    static final String[] DFA61_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\4\uffff\1\10\1\uffff\4\10"+
            "\15\uffff\1\11\40\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\70\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "320:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );";
        }
    }
    static final String DFA62_eotS =
        "\12\uffff";
    static final String DFA62_eofS =
        "\1\11\11\uffff";
    static final String DFA62_minS =
        "\6\23\4\uffff";
    static final String DFA62_maxS =
        "\6\124\4\uffff";
    static final String DFA62_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA62_specialS =
        "\12\uffff}>";
    static final String[] DFA62_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\4\uffff\1\10\1\uffff\4\10"+
            "\15\uffff\1\11\40\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\70\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\2\uffff\1\7\70\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "327:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );";
        }
    }
    static final String DFA77_eotS =
        "\60\uffff";
    static final String DFA77_eofS =
        "\60\uffff";
    static final String DFA77_minS =
        "\1\17\43\0\14\uffff";
    static final String DFA77_maxS =
        "\1\u009c\43\0\14\uffff";
    static final String DFA77_acceptS =
        "\44\uffff\1\1\1\2\12\uffff";
    static final String DFA77_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\14\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\45\1\10\1\13\10\uffff\1\41\1\4\1\12\1\44\1\5\2\uffff\1\22"+
            "\6\uffff\1\35\1\36\1\45\1\uffff\6\45\1\6\1\uffff\1\45\3\uffff"+
            "\2\45\1\uffff\1\42\1\40\1\37\1\31\1\32\1\33\1\34\1\26\1\27\1"+
            "\30\1\23\1\24\1\25\1\21\1\15\1\16\1\17\1\20\1\14\1\1\1\22\1"+
            "\7\1\2\1\3\2\uffff\1\43\6\uffff\5\11\40\uffff\10\43\21\uffff"+
            "\3\43",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "261:33: ( expr | statement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_2 = input.LA(1);

                         
                        int index77_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA77_3 = input.LA(1);

                         
                        int index77_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA77_4 = input.LA(1);

                         
                        int index77_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA77_5 = input.LA(1);

                         
                        int index77_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA77_6 = input.LA(1);

                         
                        int index77_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA77_7 = input.LA(1);

                         
                        int index77_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA77_8 = input.LA(1);

                         
                        int index77_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA77_9 = input.LA(1);

                         
                        int index77_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA77_10 = input.LA(1);

                         
                        int index77_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA77_11 = input.LA(1);

                         
                        int index77_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA77_12 = input.LA(1);

                         
                        int index77_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA77_13 = input.LA(1);

                         
                        int index77_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA77_14 = input.LA(1);

                         
                        int index77_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA77_15 = input.LA(1);

                         
                        int index77_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA77_16 = input.LA(1);

                         
                        int index77_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA77_17 = input.LA(1);

                         
                        int index77_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA77_18 = input.LA(1);

                         
                        int index77_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA77_19 = input.LA(1);

                         
                        int index77_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA77_20 = input.LA(1);

                         
                        int index77_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA77_21 = input.LA(1);

                         
                        int index77_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA77_22 = input.LA(1);

                         
                        int index77_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA77_23 = input.LA(1);

                         
                        int index77_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA77_24 = input.LA(1);

                         
                        int index77_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA77_25 = input.LA(1);

                         
                        int index77_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA77_26 = input.LA(1);

                         
                        int index77_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA77_27 = input.LA(1);

                         
                        int index77_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA77_28 = input.LA(1);

                         
                        int index77_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA77_29 = input.LA(1);

                         
                        int index77_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA77_30 = input.LA(1);

                         
                        int index77_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA77_31 = input.LA(1);

                         
                        int index77_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA77_32 = input.LA(1);

                         
                        int index77_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA77_33 = input.LA(1);

                         
                        int index77_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA77_34 = input.LA(1);

                         
                        int index77_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA77_35 = input.LA(1);

                         
                        int index77_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index77_35);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module103 = new BitSet(new long[]{0x0000003D00040000L,0x0000000009C80000L});
    public static final BitSet FOLLOW_topLevelList_in_module106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList142 = new BitSet(new long[]{0x0000003D00040002L,0x0000000009C80000L});
    public static final BitSet FOLLOW_myImport_in_topLevel161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_topLevel187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage232 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage234 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_myPackage236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier267 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier283 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier287 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_IMPORT_in_myImport329 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport332 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_myImport334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_access0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_declAttr421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList539 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_param_in_paramList580 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList583 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_param_in_paramList585 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_QUES_in_param624 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param627 = new BitSet(new long[]{0x0000004000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_varInit_in_param631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dotIdent664 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_DOT_in_dotIdent672 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dotIdent676 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit1012 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit1014 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcLit1016 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit1018 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit1020 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_block_in_funcLit1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit1051 = new BitSet(new long[]{0x00040002D8030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit1054 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppIf_in_pp1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElseIf_in_pp1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElse_in_pp1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppEnd_in_pp1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppError_in_pp1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_IF_in_ppIf1210 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_IF_in_ppIf1238 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_BANG_in_ppIf1240 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1260 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1287 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_BANG_in_ppElseIf1289 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSE_in_ppElse1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_END_in_ppEnd1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ERROR_in_ppError1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1374 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_funcType_in_typeTag1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1445 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1448 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_funcType_in_typeList1451 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1479 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1482 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1485 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_type_in_funcType1528 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1532 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_type_in_funcType1535 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_anonType_in_type1560 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_dotIdent_in_type1564 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_typeParam_in_type1568 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_GT_in_typeParam1587 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1590 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1639 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1641 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1643 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1645 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1686 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1688 = new BitSet(new long[]{0x0317F44258038000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_statement_in_statement1692 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1695 = new BitSet(new long[]{0x0317F44258038000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_statement_in_statement1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStmt_in_statement1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1750 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1752 = new BitSet(new long[]{0x0317F44258038000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_statement_in_statement1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1774 = new BitSet(new long[]{0x0317F44258038000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_statement_in_statement1776 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1778 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1780 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_statement1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStmt_in_statement1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStmt_in_statement1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1824 = new BitSet(new long[]{0x0004000258038000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_statement1827 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_statement1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1850 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_statement1852 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_statement1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1872 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1875 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_statement1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1898 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1901 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_statement1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement1924 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_statement1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1939 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_statement1941 = new BitSet(new long[]{0x0317F44258038000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_statement_in_statement1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1988 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_parExpression1991 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2015 = new BitSet(new long[]{0x031FF44259FB8000L,0x00000001F0D7E200L});
    public static final BitSet FOLLOW_blockStmt_in_block2018 = new BitSet(new long[]{0x031FF44259FB8000L,0x00000001F0D7E200L});
    public static final BitSet FOLLOW_RBRACE_in_block2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStmt2095 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_forStmt2097 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_forStmt2101 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IN_in_forStmt2103 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_forStmt2107 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_forStmt2109 = new BitSet(new long[]{0x0317F44258038000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_statement_in_forStmt2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt2148 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt2165 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2186 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2188 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt2206 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStmt2225 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_switchStmt2227 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_switchStmt2229 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_switchStmt2231 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_block_in_switchStmt2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStmt2262 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_block_in_tryStmt2264 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_catchStmtList_in_tryStmt2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList2289 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2330 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2332 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_param_in_catchStmt2334 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2336 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_block_in_catchStmt2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2405 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2408 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_exprList2411 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L,0x000000001C0001FEL});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2454 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2457 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L,0x000000001C0001FEL});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2478 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2481 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2484 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2507 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2510 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2513 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2515 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2518 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2536 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2540 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2543 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2560 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2564 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2567 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2589 = new BitSet(new long[]{0xC000030000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2593 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2596 = new BitSet(new long[]{0xC000030000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2600 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2603 = new BitSet(new long[]{0xC000030000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2607 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2610 = new BitSet(new long[]{0xC000030000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2614 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2617 = new BitSet(new long[]{0xC000030000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2621 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2625 = new BitSet(new long[]{0xC000030000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2629 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2633 = new BitSet(new long[]{0xC000030000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2655 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_BAR_in_bitExpr2659 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2662 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_AMP_in_bitExpr2666 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2669 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_CARET_in_bitExpr2672 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2675 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2695 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2699 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2703 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr2707 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2711 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2715 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2718 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2741 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2746 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_SUB_in_addExpr2751 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2755 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_STAR_in_multExpr2782 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2785 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2788 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2792 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_set_in_prefixExpr2810 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2921 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_suffixExpr2923 = new BitSet(new long[]{0x0004000278030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2925 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_suffixExpr2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2946 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_suffixExpr2948 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_suffixExpr2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2956 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2958 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_suffixExpr2960 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RBRACKET_in_suffixExpr2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_value3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value3151 = new BitSet(new long[]{0x0317F44258038000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_value3155 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_statement_in_value3157 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_value3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr3218 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_type_in_newExpr3220 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr3222 = new BitSet(new long[]{0x0004000278030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr3224 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3257 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3259 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_cast3261 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_COMMA_in_cast3264 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_funcType_in_cast3266 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3286 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3288 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_cast3290 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl3411 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl3413 = new BitSet(new long[]{0x0004010000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3415 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumDecl3417 = new BitSet(new long[]{0x0000003D00010000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl3419 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumDecl3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody3452 = new BitSet(new long[]{0x0000003D00010002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3466 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3468 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl3471 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3473 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3502 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_enumValueDecl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList3546 = new BitSet(new long[]{0x0000000001F80000L,0x0000000000100000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl3570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_VAR_in_varDecl3574 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3576 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3606 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList3609 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3612 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3628 = new BitSet(new long[]{0x0000004010000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3630 = new BitSet(new long[]{0x0000004000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_varInit_in_varDeclPart3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl3652 = new BitSet(new long[]{0x0080000000810000L,0x0000000000010000L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3656 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl3658 = new BitSet(new long[]{0x0080000000810000L,0x0000000000010000L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3662 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit3827 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_varInit3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3862 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl3866 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3868 = new BitSet(new long[]{0x0000000014010000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3870 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3872 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3874 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_block_in_funcDecl3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3921 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3923 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3925 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3927 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3929 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3931 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3933 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3935 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_block_in_funcDecl3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl3988 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3990 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3992 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3994 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3996 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_block_in_funcDecl3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4040 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl4042 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl4044 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4046 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4048 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4050 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4052 = new BitSet(new long[]{0x0004004000008000L});
    public static final BitSet FOLLOW_block_in_funcDecl4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4085 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4089 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4091 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4093 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4095 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4097 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4139 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4141 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4143 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4145 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4147 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4149 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4151 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4153 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4198 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4200 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4202 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4204 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4206 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4246 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4248 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4250 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4252 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4254 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4256 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4258 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERN_in_classDecl4290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4293 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4295 = new BitSet(new long[]{0x0004010000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4297 = new BitSet(new long[]{0x0004000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4299 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_classDecl4301 = new BitSet(new long[]{0x0008003D09F80000L,0x0000000000100000L});
    public static final BitSet FOLLOW_classBody_in_classDecl4303 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_classDecl4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classBody4340 = new BitSet(new long[]{0x0000003D09F80000L,0x0000000000100000L});
    public static final BitSet FOLLOW_classBody_in_classBody4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classBody4368 = new BitSet(new long[]{0x0000003D09F80000L,0x0000000000100000L});
    public static final BitSet FOLLOW_classBody_in_classBody4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_classBody4396 = new BitSet(new long[]{0x0000003D09F80000L,0x0000000000100000L});
    public static final BitSet FOLLOW_classBody_in_classBody4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl4433 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl4435 = new BitSet(new long[]{0x0004000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl4437 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl4439 = new BitSet(new long[]{0x0008003D09F80000L,0x0000000000100000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl4442 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody4458 = new BitSet(new long[]{0x0000003D09F80000L,0x0000000000100000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody4486 = new BitSet(new long[]{0x0000003D09F80000L,0x0000000000100000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_interfaceBody4514 = new BitSet(new long[]{0x0000003D09F80000L,0x0000000000100000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList4553 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList4556 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList4559 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit4611 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_type_in_inherit4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit4639 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_type_in_inherit4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl4656 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl4658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl4660 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend4678 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend4680 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType4701 = new BitSet(new long[]{0x0008010001F90000L,0x0000000000100000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4736 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4764 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType4793 = new BitSet(new long[]{0x0008000001F90000L,0x0000000000100000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4821 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4847 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4905 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList4908 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4911 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit4934 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit4937 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField4951 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField4953 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4968 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList4971 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4974 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem4991 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem4993 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_objLitElem4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_elementarySymbol0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred41_TinyHaxeTry11676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred42_TinyHaxeTry11695 = new BitSet(new long[]{0x0317F44258038000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_statement_in_synpred42_TinyHaxeTry11699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred49_TinyHaxeTry11827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred56_TinyHaxeTry11924 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_SEMI_in_synpred56_TinyHaxeTry11927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred57_TinyHaxeTry11939 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_COLON_in_synpred57_TinyHaxeTry11941 = new BitSet(new long[]{0x0317F44258038000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_statement_in_synpred57_TinyHaxeTry11943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred63_TinyHaxeTry12365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred91_TinyHaxeTry12810 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred91_TinyHaxeTry12822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred94_TinyHaxeTry12921 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred94_TinyHaxeTry12923 = new BitSet(new long[]{0x0004000278030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_exprListOpt_in_synpred94_TinyHaxeTry12925 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred94_TinyHaxeTry12927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred95_TinyHaxeTry12946 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_synpred95_TinyHaxeTry12948 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred95_TinyHaxeTry12950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred96_TinyHaxeTry12956 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred96_TinyHaxeTry12958 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_synpred96_TinyHaxeTry12960 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred96_TinyHaxeTry12962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred97_TinyHaxeTry12967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred97_TinyHaxeTry12969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred98_TinyHaxeTry12976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred98_TinyHaxeTry12978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_synpred100_TinyHaxeTry13021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred105_TinyHaxeTry13155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred106_TinyHaxeTry13151 = new BitSet(new long[]{0x0317F44258038000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_synpred106_TinyHaxeTry13155 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_statement_in_synpred106_TinyHaxeTry13157 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred106_TinyHaxeTry13160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred108_TinyHaxeTry13257 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred108_TinyHaxeTry13259 = new BitSet(new long[]{0x0004000258030000L,0x00000001F007E200L});
    public static final BitSet FOLLOW_expr_in_synpred108_TinyHaxeTry13261 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred108_TinyHaxeTry13264 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_funcType_in_synpred108_TinyHaxeTry13266 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred108_TinyHaxeTry13270 = new BitSet(new long[]{0x0000000000000002L});

}