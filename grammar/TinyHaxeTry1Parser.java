// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\antlr\\TinyHaxeTry1.g 2010-03-12 04:42:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class TinyHaxeTry1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "UNARY_MINUS", "UNARY_PLUS", "PREFIX_EXPR", "PROPERTY_DECL", "MODULE", "SUFFIX_EXPR", "STAtEMENT", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG", "TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "VAR_DECLARATION", "DECL_ATTR_LIST", "VAR_INIT", "PACKAGE", "SEMI", "IDENTIFIER", "DOT", "IMPORT", "PUBLIC", "PRIVATE", "STATIC", "INLINE", "DYNAMIC", "OVERRIDE", "COMMA", "QUES", "FUNCTION", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "PP_IF", "BANG", "PP_ELSEIF", "PP_ELSE", "PP_END", "PP_ERROR", "COLON", "MINUS_BIGGER", "GT", "LT", "IF", "ELSE", "WHILE", "DO", "RETURN", "THROW", "BREAK", "CONTINUE", "LBRACE", "RBRACE", "FOR", "IN", "CASE", "DEFAULT", "SWITCH", "TRY", "CATCH", "ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ", "BAR", "AMP", "CARET", "LTLT", "GTGT", "GTGTGT", "PLUS", "SUB", "STAR", "SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "TILDE", "NULL", "NEW", "CAST", "ENUM", "VAR", "EQ", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "TYPEDEF", "LONGLITERAL", "INTLITERAL", "STRINGLITERAL", "CHARLITERAL", "FLOATNUM", "WS", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "EscapeSequence", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CONST", "DOUBLE", "FINAL", "FINALLY", "FLOAT", "GOTO", "INSTANCEOF", "INT", "LONG", "NATIVE", "PROTECTED", "SHORT", "STRICTFP", "SUPER", "THIS", "THROWS", "TRANSIENT", "VOID", "VOLATILE", "TRUE", "FALSE", "PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", "PERCENTEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "MONKEYS_AT", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "INTNUM", "EXPONENT", "COMMENT", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ", "'<<='", "'>>='", "'>>>='"
    };
    public static final int FUNCTION=32;
    public static final int PACKAGE=19;
    public static final int CAST=87;
    public static final int EXPONENT=152;
    public static final int LT=46;
    public static final int STAR=79;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int WHILE=49;
    public static final int FLOATNUM=100;
    public static final int CONST=112;
    public static final int OCTAL_ESC=156;
    public static final int CASE=59;
    public static final int CHAR=111;
    public static final int NEW=86;
    public static final int T__160=160;
    public static final int DO=50;
    public static final int VAR_DECLARATION=16;
    public static final int EOF=-1;
    public static final int GTGT=75;
    public static final int BREAK=53;
    public static final int UNARY_PLUS=5;
    public static final int LBRACKET=35;
    public static final int FINAL=114;
    public static final int RPAREN=34;
    public static final int IMPORT=23;
    public static final int SUBSUB=82;
    public static final int STAREQ=135;
    public static final int CARET=73;
    public static final int THIS=126;
    public static final int RETURN=51;
    public static final int DOUBLE=113;
    public static final int MONKEYS_AT=147;
    public static final int BARBAR=65;
    public static final int VAR=89;
    public static final int VOID=129;
    public static final int SUPER=125;
    public static final int GOTO=117;
    public static final int EQ=90;
    public static final int COMMENT=153;
    public static final int AMPAMP=66;
    public static final int VAR_INIT=18;
    public static final int QUES=31;
    public static final int EQEQ=67;
    public static final int HexPrefix=104;
    public static final int PP_IF=37;
    public static final int PERCENTDBBQ=143;
    public static final int RBRACE=56;
    public static final int STATIC=26;
    public static final int PRIVATE=25;
    public static final int BLOCK_SCOPE=11;
    public static final int SWITCH=61;
    public static final int NULL=85;
    public static final int STRICTFP=124;
    public static final int ELSE=48;
    public static final int NATIVE=121;
    public static final int ELLIPSIS=64;
    public static final int THROWS=127;
    public static final int UNARY_MINUS=4;
    public static final int INT=119;
    public static final int SLASHEQ=136;
    public static final int INTLITERAL=97;
    public static final int PERCENTBB=149;
    public static final int TRY=62;
    public static final int LongSuffix=103;
    public static final int LONGLITERAL=96;
    public static final int PERCENTLL=148;
    public static final int BANGEQQ=146;
    public static final int WS=101;
    public static final int PERCENTDLQ=141;
    public static final int INHERIT_LIST_OPT=15;
    public static final int CHARLITERAL=99;
    public static final int GT=45;
    public static final int INLINE=27;
    public static final int CATCH=63;
    public static final int FALSE=132;
    public static final int EscapeSequence=107;
    public static final int THROW=52;
    public static final int DYNAMIC=28;
    public static final int PROTECTED=122;
    public static final int CLASS=91;
    public static final int PP_ELSEIF=39;
    public static final int BAREQ=138;
    public static final int PP_ELSE=40;
    public static final int IntegerNumber=102;
    public static final int AMP=72;
    public static final int PLUSPLUS=83;
    public static final int LBRACE=55;
    public static final int TYPE_PARAM_OPT=14;
    public static final int LTEQ=70;
    public static final int SUBEQ=134;
    public static final int GTGTGT=76;
    public static final int Exponent=106;
    public static final int FOR=57;
    public static final int SUFFIX_EXPR=9;
    public static final int SUB=78;
    public static final int FLOAT=116;
    public static final int ABSTRACT=108;
    public static final int MINUS_BIGGER=44;
    public static final int PERCENTDBQ=142;
    public static final int HexDigit=105;
    public static final int PLUSEQ=133;
    public static final int LPAREN=33;
    public static final int IF=47;
    public static final int INTNUM=151;
    public static final int ESC_SEQ=157;
    public static final int BOOLEAN=109;
    public static final int PP_END=41;
    public static final int SLASH=80;
    public static final int IN=58;
    public static final int IMPLEMENTS=94;
    public static final int CONTINUE=54;
    public static final int COMMA=30;
    public static final int AMPEQ=137;
    public static final int TRANSIENT=128;
    public static final int IDENTIFIER=21;
    public static final int TILDE=84;
    public static final int BANGEQ=68;
    public static final int PLUS=77;
    public static final int RBRACKET=36;
    public static final int DOT=22;
    public static final int LTLT=74;
    public static final int BYTE=110;
    public static final int PERCENT=81;
    public static final int VOLATILE=130;
    public static final int DECL_ATTR_LIST=17;
    public static final int TYPEDEF=95;
    public static final int UNICODE_ESC=155;
    public static final int EQEQEQ=144;
    public static final int STAtEMENT=10;
    public static final int DEFAULT=60;
    public static final int PREFIX_EXPR=6;
    public static final int HEX_DIGIT=154;
    public static final int SHORT=123;
    public static final int BANG=38;
    public static final int INSTANCEOF=118;
    public static final int PP_ERROR=42;
    public static final int GTEQ=69;
    public static final int MODULE=8;
    public static final int TRUE=131;
    public static final int SEMI=20;
    public static final int COLON=43;
    public static final int PARAM_LIST=12;
    public static final int PERCENTLESQ=145;
    public static final int ENUM=88;
    public static final int PERCENTEQ=140;
    public static final int FINALLY=115;
    public static final int PROPERTY_DECL=7;
    public static final int OVERRIDE=29;
    public static final int STRINGLITERAL=98;
    public static final int CARETEQ=139;
    public static final int PERCENTBBB=150;
    public static final int INTERFACE=92;
    public static final int LONG=120;
    public static final int EXTENDS=93;
    public static final int PUBLIC=24;
    public static final int TYPE_TAG=13;
    public static final int BAR=71;

    // delegates
    // delegators


        public TinyHaxeTry1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TinyHaxeTry1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[237+1];
             
             
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
    // C:\\antlr\\TinyHaxeTry1.g:27:1: module : ( myPackage topLevelList -> ^( MODULE myPackage topLevelList ) | topLevelList );
    public final TinyHaxeTry1Parser.module_return module() throws RecognitionException {
        TinyHaxeTry1Parser.module_return retval = new TinyHaxeTry1Parser.module_return();
        retval.start = input.LT(1);
        int module_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.myPackage_return myPackage1 = null;

        TinyHaxeTry1Parser.topLevelList_return topLevelList2 = null;

        TinyHaxeTry1Parser.topLevelList_return topLevelList3 = null;


        RewriteRuleSubtreeStream stream_myPackage=new RewriteRuleSubtreeStream(adaptor,"rule myPackage");
        RewriteRuleSubtreeStream stream_topLevelList=new RewriteRuleSubtreeStream(adaptor,"rule topLevelList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:27:19: ( myPackage topLevelList -> ^( MODULE myPackage topLevelList ) | topLevelList )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF||LA1_0==IMPORT||LA1_0==PP_IF||(LA1_0>=PP_ELSEIF && LA1_0<=PP_ERROR)||LA1_0==ENUM||(LA1_0>=CLASS && LA1_0<=INTERFACE)||LA1_0==TYPEDEF) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:27:21: myPackage topLevelList
                    {
                    pushFollow(FOLLOW_myPackage_in_module125);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());
                    pushFollow(FOLLOW_topLevelList_in_module127);
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
                    // 27:44: -> ^( MODULE myPackage topLevelList )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:27:46: ^( MODULE myPackage topLevelList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODULE, "MODULE"), root_1);

                        adaptor.addChild(root_1, stream_myPackage.nextTree());
                        adaptor.addChild(root_1, stream_topLevelList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:28:25: topLevelList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topLevelList_in_module162);
                    topLevelList3=topLevelList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelList3.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:30:1: topLevelList : ( topLevel )* ;
    public final TinyHaxeTry1Parser.topLevelList_return topLevelList() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelList_return retval = new TinyHaxeTry1Parser.topLevelList_return();
        retval.start = input.LT(1);
        int topLevelList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.topLevel_return topLevel4 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:30:19: ( ( topLevel )* )
            // C:\\antlr\\TinyHaxeTry1.g:30:22: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:30:22: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT||LA2_0==PP_IF||(LA2_0>=PP_ELSEIF && LA2_0<=PP_ERROR)||LA2_0==ENUM||(LA2_0>=CLASS && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:30:23: topLevel
            	    {
            	    pushFollow(FOLLOW_topLevel_in_topLevelList178);
            	    topLevel4=topLevel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevel4.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:32:1: topLevel : ( myImport | pp | topLevelDecl );
    public final TinyHaxeTry1Parser.topLevel_return topLevel() throws RecognitionException {
        TinyHaxeTry1Parser.topLevel_return retval = new TinyHaxeTry1Parser.topLevel_return();
        retval.start = input.LT(1);
        int topLevel_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.myImport_return myImport5 = null;

        TinyHaxeTry1Parser.pp_return pp6 = null;

        TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl7 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:32:19: ( myImport | pp | topLevelDecl )
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
                    // C:\\antlr\\TinyHaxeTry1.g:32:21: myImport
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_myImport_in_topLevel197);
                    myImport5=myImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, myImport5.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:33:25: pp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_topLevel223);
                    pp6=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp6.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:34:25: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topLevelDecl_in_topLevel249);
                    topLevelDecl7=topLevelDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelDecl7.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:36:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) ;
    public final TinyHaxeTry1Parser.myPackage_return myPackage() throws RecognitionException {
        TinyHaxeTry1Parser.myPackage_return retval = new TinyHaxeTry1Parser.myPackage_return();
        retval.start = input.LT(1);
        int myPackage_StartIndex = input.index();
        Object root_0 = null;

        Token PACKAGE8=null;
        Token SEMI10=null;
        TinyHaxeTry1Parser.dotIdent_return dotIdent9 = null;


        Object PACKAGE8_tree=null;
        Object SEMI10_tree=null;
        RewriteRuleTokenStream stream_PACKAGE=new RewriteRuleTokenStream(adaptor,"token PACKAGE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_dotIdent=new RewriteRuleSubtreeStream(adaptor,"rule dotIdent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:36:21: ( PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) )
            // C:\\antlr\\TinyHaxeTry1.g:36:23: PACKAGE dotIdent SEMI
            {
            PACKAGE8=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage268); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE.add(PACKAGE8);

            pushFollow(FOLLOW_dotIdent_in_myPackage270);
            dotIdent9=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent9.getTree());
            SEMI10=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage272); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI10);



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
            // 36:45: -> ^( PACKAGE dotIdent )
            {
                // C:\\antlr\\TinyHaxeTry1.g:36:48: ^( PACKAGE dotIdent )
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
    // C:\\antlr\\TinyHaxeTry1.g:39:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
    public final TinyHaxeTry1Parser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        TinyHaxeTry1Parser.qualifiedIdentifier_return retval = new TinyHaxeTry1Parser.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        Object root_0 = null;

        Token a=null;
        Token ident=null;
        Token DOT11=null;

        Object a_tree=null;
        Object ident_tree=null;
        Object DOT11_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:40:5: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // C:\\antlr\\TinyHaxeTry1.g:40:9: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:40:9: (a= IDENTIFIER -> $a)
            // C:\\antlr\\TinyHaxeTry1.g:40:12: a= IDENTIFIER
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier303); if (state.failed) return retval; 
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
            // 40:27: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            // C:\\antlr\\TinyHaxeTry1.g:40:37: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DOT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:40:41: DOT ident= IDENTIFIER
            	    {
            	    DOT11=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier319); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT11);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier323); if (state.failed) return retval; 
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
            	    // 40:63: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // C:\\antlr\\TinyHaxeTry1.g:40:67: ^( DOT $qualifiedIdentifier $ident)
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
    // C:\\antlr\\TinyHaxeTry1.g:43:1: myImport : IMPORT dotIdent SEMI ;
    public final TinyHaxeTry1Parser.myImport_return myImport() throws RecognitionException {
        TinyHaxeTry1Parser.myImport_return retval = new TinyHaxeTry1Parser.myImport_return();
        retval.start = input.LT(1);
        int myImport_StartIndex = input.index();
        Object root_0 = null;

        Token IMPORT12=null;
        Token SEMI14=null;
        TinyHaxeTry1Parser.dotIdent_return dotIdent13 = null;


        Object IMPORT12_tree=null;
        Object SEMI14_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:43:21: ( IMPORT dotIdent SEMI )
            // C:\\antlr\\TinyHaxeTry1.g:43:23: IMPORT dotIdent SEMI
            {
            root_0 = (Object)adaptor.nil();

            IMPORT12=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_myImport365); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPORT12_tree = (Object)adaptor.create(IMPORT12);
            root_0 = (Object)adaptor.becomeRoot(IMPORT12_tree, root_0);
            }
            pushFollow(FOLLOW_dotIdent_in_myImport368);
            dotIdent13=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent13.getTree());
            SEMI14=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport370); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:47:1: access : ( PUBLIC | PRIVATE );
    public final TinyHaxeTry1Parser.access_return access() throws RecognitionException {
        TinyHaxeTry1Parser.access_return retval = new TinyHaxeTry1Parser.access_return();
        retval.start = input.LT(1);
        int access_StartIndex = input.index();
        Object root_0 = null;

        Token set15=null;

        Object set15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:47:19: ( PUBLIC | PRIVATE )
            // C:\\antlr\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set15=(Token)input.LT(1);
            if ( (input.LA(1)>=PUBLIC && input.LA(1)<=PRIVATE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set15));
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
    // C:\\antlr\\TinyHaxeTry1.g:50:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
    public final TinyHaxeTry1Parser.declAttr_return declAttr() throws RecognitionException {
        TinyHaxeTry1Parser.declAttr_return retval = new TinyHaxeTry1Parser.declAttr_return();
        retval.start = input.LT(1);
        int declAttr_StartIndex = input.index();
        Object root_0 = null;

        Token STATIC16=null;
        Token INLINE17=null;
        Token DYNAMIC18=null;
        Token OVERRIDE19=null;
        TinyHaxeTry1Parser.access_return access20 = null;


        Object STATIC16_tree=null;
        Object INLINE17_tree=null;
        Object DYNAMIC18_tree=null;
        Object OVERRIDE19_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:50:19: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
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
                    // C:\\antlr\\TinyHaxeTry1.g:50:21: STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    STATIC16=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr457); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC16_tree = (Object)adaptor.create(STATIC16);
                    adaptor.addChild(root_0, STATIC16_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:51:24: INLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    INLINE17=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE17_tree = (Object)adaptor.create(INLINE17);
                    adaptor.addChild(root_0, INLINE17_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:52:25: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    DYNAMIC18=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr508); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC18_tree = (Object)adaptor.create(DYNAMIC18);
                    adaptor.addChild(root_0, DYNAMIC18_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:53:25: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    OVERRIDE19=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr534); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE19_tree = (Object)adaptor.create(OVERRIDE19);
                    adaptor.addChild(root_0, OVERRIDE19_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:54:25: access
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_access_in_declAttr560);
                    access20=access();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, access20.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:56:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST ( declAttr )+ ) ;
    public final TinyHaxeTry1Parser.declAttrList_return declAttrList() throws RecognitionException {
        TinyHaxeTry1Parser.declAttrList_return retval = new TinyHaxeTry1Parser.declAttrList_return();
        retval.start = input.LT(1);
        int declAttrList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.declAttr_return declAttr21 = null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:56:19: ( ( declAttr )+ -> ^( DECL_ATTR_LIST ( declAttr )+ ) )
            // C:\\antlr\\TinyHaxeTry1.g:56:21: ( declAttr )+
            {
            // C:\\antlr\\TinyHaxeTry1.g:56:21: ( declAttr )+
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
            	    // C:\\antlr\\TinyHaxeTry1.g:56:22: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList575);
            	    declAttr21=declAttr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declAttr.add(declAttr21.getTree());

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
            // 56:33: -> ^( DECL_ATTR_LIST ( declAttr )+ )
            {
                // C:\\antlr\\TinyHaxeTry1.g:56:36: ^( DECL_ATTR_LIST ( declAttr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL_ATTR_LIST, "DECL_ATTR_LIST"), root_1);

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
    // C:\\antlr\\TinyHaxeTry1.g:59:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST ( param )+ ) | -> ^( PARAM_LIST ) );
    public final TinyHaxeTry1Parser.paramList_return paramList() throws RecognitionException {
        TinyHaxeTry1Parser.paramList_return retval = new TinyHaxeTry1Parser.paramList_return();
        retval.start = input.LT(1);
        int paramList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA23=null;
        TinyHaxeTry1Parser.param_return param22 = null;

        TinyHaxeTry1Parser.param_return param24 = null;


        Object COMMA23_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:59:19: ( param ( COMMA param )* -> ^( PARAM_LIST ( param )+ ) | -> ^( PARAM_LIST ) )
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
                    // C:\\antlr\\TinyHaxeTry1.g:59:21: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList612);
                    param22=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param22.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:59:27: ( COMMA param )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:59:28: COMMA param
                    	    {
                    	    COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList615); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA23);

                    	    pushFollow(FOLLOW_param_in_paramList617);
                    	    param24=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_param.add(param24.getTree());

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
                    // 59:42: -> ^( PARAM_LIST ( param )+ )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:59:45: ^( PARAM_LIST ( param )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM_LIST, "PARAM_LIST"), root_1);

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
                    // C:\\antlr\\TinyHaxeTry1.g:60:4: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 60:4: -> ^( PARAM_LIST )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:60:6: ^( PARAM_LIST )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM_LIST, "PARAM_LIST"), root_1);

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
    // C:\\antlr\\TinyHaxeTry1.g:62:1: param : ( QUES )? IDENTIFIER typeTagOpt varInitOpt -> ^( $param IDENTIFIER typeTagOpt varInitOpt ) ;
    public final TinyHaxeTry1Parser.param_return param() throws RecognitionException {
        TinyHaxeTry1Parser.param_return retval = new TinyHaxeTry1Parser.param_return();
        retval.start = input.LT(1);
        int param_StartIndex = input.index();
        Object root_0 = null;

        Token QUES25=null;
        Token IDENTIFIER26=null;
        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt27 = null;

        TinyHaxeTry1Parser.varInitOpt_return varInitOpt28 = null;


        Object QUES25_tree=null;
        Object IDENTIFIER26_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_QUES=new RewriteRuleTokenStream(adaptor,"token QUES");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_varInitOpt=new RewriteRuleSubtreeStream(adaptor,"rule varInitOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:62:19: ( ( QUES )? IDENTIFIER typeTagOpt varInitOpt -> ^( $param IDENTIFIER typeTagOpt varInitOpt ) )
            // C:\\antlr\\TinyHaxeTry1.g:62:20: ( QUES )? IDENTIFIER typeTagOpt varInitOpt
            {
            // C:\\antlr\\TinyHaxeTry1.g:62:20: ( QUES )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==QUES) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:0:0: QUES
                    {
                    QUES25=(Token)match(input,QUES,FOLLOW_QUES_in_param656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES25);


                    }
                    break;

            }

            IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param659); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER26);

            pushFollow(FOLLOW_typeTagOpt_in_param661);
            typeTagOpt27=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt27.getTree());
            pushFollow(FOLLOW_varInitOpt_in_param663);
            varInitOpt28=varInitOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varInitOpt.add(varInitOpt28.getTree());


            // AST REWRITE
            // elements: IDENTIFIER, typeTagOpt, param, varInitOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:59: -> ^( $param IDENTIFIER typeTagOpt varInitOpt )
            {
                // C:\\antlr\\TinyHaxeTry1.g:62:62: ^( $param IDENTIFIER typeTagOpt varInitOpt )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                adaptor.addChild(root_1, stream_varInitOpt.nextTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:64:1: dotIdent : ( IDENTIFIER -> IDENTIFIER ) ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )* ;
    public final TinyHaxeTry1Parser.dotIdent_return dotIdent() throws RecognitionException {
        TinyHaxeTry1Parser.dotIdent_return retval = new TinyHaxeTry1Parser.dotIdent_return();
        retval.start = input.LT(1);
        int dotIdent_StartIndex = input.index();
        Object root_0 = null;

        Token ident=null;
        Token IDENTIFIER29=null;
        Token DOT30=null;

        Object ident_tree=null;
        Object IDENTIFIER29_tree=null;
        Object DOT30_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:64:19: ( ( IDENTIFIER -> IDENTIFIER ) ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )* )
            // C:\\antlr\\TinyHaxeTry1.g:64:21: ( IDENTIFIER -> IDENTIFIER ) ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:64:21: ( IDENTIFIER -> IDENTIFIER )
            // C:\\antlr\\TinyHaxeTry1.g:64:22: IDENTIFIER
            {
            IDENTIFIER29=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dotIdent695); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER29);



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
            // 64:33: -> IDENTIFIER
            {
                adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

            }

            retval.tree = root_0;}
            }

            // C:\\antlr\\TinyHaxeTry1.g:64:48: ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DOT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:64:49: DOT ident= IDENTIFIER
            	    {
            	    DOT30=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent703); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT30);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dotIdent707); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(ident);



            	    // AST REWRITE
            	    // elements: DOT, dotIdent, ident
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
            	    // 64:70: -> ^( DOT $dotIdent $ident)
            	    {
            	        // C:\\antlr\\TinyHaxeTry1.g:64:72: ^( DOT $dotIdent $ident)
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
    // C:\\antlr\\TinyHaxeTry1.g:66:1: assignOp : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '>>>=' );
    public final TinyHaxeTry1Parser.assignOp_return assignOp() throws RecognitionException {
        TinyHaxeTry1Parser.assignOp_return retval = new TinyHaxeTry1Parser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token set31=null;

        Object set31_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:66:19: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '>>>=' )
            // C:\\antlr\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set31=(Token)input.LT(1);
            if ( input.LA(1)==EQ||(input.LA(1)>=PLUSEQ && input.LA(1)<=PERCENTEQ)||(input.LA(1)>=158 && input.LA(1)<=160) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set31));
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
    // C:\\antlr\\TinyHaxeTry1.g:79:1: funcLit : FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION paramList typeTagOpt block ) ;
    public final TinyHaxeTry1Parser.funcLit_return funcLit() throws RecognitionException {
        TinyHaxeTry1Parser.funcLit_return retval = new TinyHaxeTry1Parser.funcLit_return();
        retval.start = input.LT(1);
        int funcLit_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION32=null;
        Token LPAREN33=null;
        Token RPAREN35=null;
        TinyHaxeTry1Parser.paramList_return paramList34 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt36 = null;

        TinyHaxeTry1Parser.block_return block37 = null;


        Object FUNCTION32_tree=null;
        Object LPAREN33_tree=null;
        Object RPAREN35_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:79:19: ( FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION paramList typeTagOpt block ) )
            // C:\\antlr\\TinyHaxeTry1.g:79:21: FUNCTION LPAREN paramList RPAREN typeTagOpt block
            {
            FUNCTION32=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit1043); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION32);

            LPAREN33=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit1045); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN33);

            pushFollow(FOLLOW_paramList_in_funcLit1047);
            paramList34=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList34.getTree());
            RPAREN35=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit1049); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN35);

            pushFollow(FOLLOW_typeTagOpt_in_funcLit1051);
            typeTagOpt36=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt36.getTree());
            pushFollow(FOLLOW_block_in_funcLit1053);
            block37=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block37.getTree());


            // AST REWRITE
            // elements: paramList, block, typeTagOpt, FUNCTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:71: -> ^( FUNCTION paramList typeTagOpt block )
            {
                // C:\\antlr\\TinyHaxeTry1.g:79:74: ^( FUNCTION paramList typeTagOpt block )
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
    // C:\\antlr\\TinyHaxeTry1.g:81:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
    public final TinyHaxeTry1Parser.arrayLit_return arrayLit() throws RecognitionException {
        TinyHaxeTry1Parser.arrayLit_return retval = new TinyHaxeTry1Parser.arrayLit_return();
        retval.start = input.LT(1);
        int arrayLit_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACKET38=null;
        Token RBRACKET40=null;
        TinyHaxeTry1Parser.exprListOpt_return exprListOpt39 = null;


        Object LBRACKET38_tree=null;
        Object RBRACKET40_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:81:18: ( LBRACKET exprListOpt RBRACKET )
            // C:\\antlr\\TinyHaxeTry1.g:81:20: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            LBRACKET38=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit1082); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit1085);
            exprListOpt39=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt39.getTree());
            RBRACKET40=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit1087); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:88:1: pp : ( ppIf | ppElseIf | ppElse | ppEnd | ppError );
    public final TinyHaxeTry1Parser.pp_return pp() throws RecognitionException {
        TinyHaxeTry1Parser.pp_return retval = new TinyHaxeTry1Parser.pp_return();
        retval.start = input.LT(1);
        int pp_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.ppIf_return ppIf41 = null;

        TinyHaxeTry1Parser.ppElseIf_return ppElseIf42 = null;

        TinyHaxeTry1Parser.ppElse_return ppElse43 = null;

        TinyHaxeTry1Parser.ppEnd_return ppEnd44 = null;

        TinyHaxeTry1Parser.ppError_return ppError45 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:88:19: ( ppIf | ppElseIf | ppElse | ppEnd | ppError )
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
                    // C:\\antlr\\TinyHaxeTry1.g:88:21: ppIf
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppIf_in_pp1115);
                    ppIf41=ppIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppIf41.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:89:25: ppElseIf
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppElseIf_in_pp1141);
                    ppElseIf42=ppElseIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppElseIf42.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:90:25: ppElse
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppElse_in_pp1167);
                    ppElse43=ppElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppElse43.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:91:25: ppEnd
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppEnd_in_pp1193);
                    ppEnd44=ppEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppEnd44.getTree());

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:92:25: ppError
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppError_in_pp1219);
                    ppError45=ppError();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppError45.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:94:1: ppIf : ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER );
    public final TinyHaxeTry1Parser.ppIf_return ppIf() throws RecognitionException {
        TinyHaxeTry1Parser.ppIf_return retval = new TinyHaxeTry1Parser.ppIf_return();
        retval.start = input.LT(1);
        int ppIf_StartIndex = input.index();
        Object root_0 = null;

        Token PP_IF46=null;
        Token IDENTIFIER47=null;
        Token PP_IF48=null;
        Token BANG49=null;
        Token IDENTIFIER50=null;

        Object PP_IF46_tree=null;
        Object IDENTIFIER47_tree=null;
        Object PP_IF48_tree=null;
        Object BANG49_tree=null;
        Object IDENTIFIER50_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:94:19: ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER )
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
                    // C:\\antlr\\TinyHaxeTry1.g:94:21: PP_IF IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_IF46=(Token)match(input,PP_IF,FOLLOW_PP_IF_in_ppIf1241); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_IF46_tree = (Object)adaptor.create(PP_IF46);
                    adaptor.addChild(root_0, PP_IF46_tree);
                    }
                    IDENTIFIER47=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1243); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER47_tree = (Object)adaptor.create(IDENTIFIER47);
                    adaptor.addChild(root_0, IDENTIFIER47_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:95:25: PP_IF BANG IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_IF48=(Token)match(input,PP_IF,FOLLOW_PP_IF_in_ppIf1269); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_IF48_tree = (Object)adaptor.create(PP_IF48);
                    adaptor.addChild(root_0, PP_IF48_tree);
                    }
                    BANG49=(Token)match(input,BANG,FOLLOW_BANG_in_ppIf1271); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANG49_tree = (Object)adaptor.create(BANG49);
                    adaptor.addChild(root_0, BANG49_tree);
                    }
                    IDENTIFIER50=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1273); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER50_tree = (Object)adaptor.create(IDENTIFIER50);
                    adaptor.addChild(root_0, IDENTIFIER50_tree);
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
    // C:\\antlr\\TinyHaxeTry1.g:97:1: ppElseIf : ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER );
    public final TinyHaxeTry1Parser.ppElseIf_return ppElseIf() throws RecognitionException {
        TinyHaxeTry1Parser.ppElseIf_return retval = new TinyHaxeTry1Parser.ppElseIf_return();
        retval.start = input.LT(1);
        int ppElseIf_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ELSEIF51=null;
        Token IDENTIFIER52=null;
        Token PP_ELSEIF53=null;
        Token BANG54=null;
        Token IDENTIFIER55=null;

        Object PP_ELSEIF51_tree=null;
        Object IDENTIFIER52_tree=null;
        Object PP_ELSEIF53_tree=null;
        Object BANG54_tree=null;
        Object IDENTIFIER55_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:97:19: ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER )
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
                    // C:\\antlr\\TinyHaxeTry1.g:97:21: PP_ELSEIF IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_ELSEIF51=(Token)match(input,PP_ELSEIF,FOLLOW_PP_ELSEIF_in_ppElseIf1291); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_ELSEIF51_tree = (Object)adaptor.create(PP_ELSEIF51);
                    adaptor.addChild(root_0, PP_ELSEIF51_tree);
                    }
                    IDENTIFIER52=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1293); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER52_tree = (Object)adaptor.create(IDENTIFIER52);
                    adaptor.addChild(root_0, IDENTIFIER52_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:98:24: PP_ELSEIF BANG IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_ELSEIF53=(Token)match(input,PP_ELSEIF,FOLLOW_PP_ELSEIF_in_ppElseIf1318); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_ELSEIF53_tree = (Object)adaptor.create(PP_ELSEIF53);
                    adaptor.addChild(root_0, PP_ELSEIF53_tree);
                    }
                    BANG54=(Token)match(input,BANG,FOLLOW_BANG_in_ppElseIf1320); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANG54_tree = (Object)adaptor.create(BANG54);
                    adaptor.addChild(root_0, BANG54_tree);
                    }
                    IDENTIFIER55=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1322); if (state.failed) return retval;
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
    // C:\\antlr\\TinyHaxeTry1.g:100:1: ppElse : PP_ELSE ;
    public final TinyHaxeTry1Parser.ppElse_return ppElse() throws RecognitionException {
        TinyHaxeTry1Parser.ppElse_return retval = new TinyHaxeTry1Parser.ppElse_return();
        retval.start = input.LT(1);
        int ppElse_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ELSE56=null;

        Object PP_ELSE56_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:100:19: ( PP_ELSE )
            // C:\\antlr\\TinyHaxeTry1.g:100:21: PP_ELSE
            {
            root_0 = (Object)adaptor.nil();

            PP_ELSE56=(Token)match(input,PP_ELSE,FOLLOW_PP_ELSE_in_ppElse1342); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PP_ELSE56_tree = (Object)adaptor.create(PP_ELSE56);
            adaptor.addChild(root_0, PP_ELSE56_tree);
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
    // C:\\antlr\\TinyHaxeTry1.g:102:1: ppEnd : PP_END ;
    public final TinyHaxeTry1Parser.ppEnd_return ppEnd() throws RecognitionException {
        TinyHaxeTry1Parser.ppEnd_return retval = new TinyHaxeTry1Parser.ppEnd_return();
        retval.start = input.LT(1);
        int ppEnd_StartIndex = input.index();
        Object root_0 = null;

        Token PP_END57=null;

        Object PP_END57_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:102:19: ( PP_END )
            // C:\\antlr\\TinyHaxeTry1.g:102:21: PP_END
            {
            root_0 = (Object)adaptor.nil();

            PP_END57=(Token)match(input,PP_END,FOLLOW_PP_END_in_ppEnd1363); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PP_END57_tree = (Object)adaptor.create(PP_END57);
            adaptor.addChild(root_0, PP_END57_tree);
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
    // C:\\antlr\\TinyHaxeTry1.g:104:1: ppError : PP_ERROR ;
    public final TinyHaxeTry1Parser.ppError_return ppError() throws RecognitionException {
        TinyHaxeTry1Parser.ppError_return retval = new TinyHaxeTry1Parser.ppError_return();
        retval.start = input.LT(1);
        int ppError_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ERROR58=null;

        Object PP_ERROR58_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:104:19: ( PP_ERROR )
            // C:\\antlr\\TinyHaxeTry1.g:104:21: PP_ERROR
            {
            root_0 = (Object)adaptor.nil();

            PP_ERROR58=(Token)match(input,PP_ERROR,FOLLOW_PP_ERROR_in_ppError1382); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PP_ERROR58_tree = (Object)adaptor.create(PP_ERROR58);
            adaptor.addChild(root_0, PP_ERROR58_tree);
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
    // C:\\antlr\\TinyHaxeTry1.g:109:1: typeTag : COLON funcType ;
    public final TinyHaxeTry1Parser.typeTag_return typeTag() throws RecognitionException {
        TinyHaxeTry1Parser.typeTag_return retval = new TinyHaxeTry1Parser.typeTag_return();
        retval.start = input.LT(1);
        int typeTag_StartIndex = input.index();
        Object root_0 = null;

        Token COLON59=null;
        TinyHaxeTry1Parser.funcType_return funcType60 = null;


        Object COLON59_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:109:19: ( COLON funcType )
            // C:\\antlr\\TinyHaxeTry1.g:109:21: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            COLON59=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1405); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_typeTag1408);
            funcType60=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType60.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:111:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG typeTag ) | -> ^( TYPE_TAG ) );
    public final TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeTagOpt_return retval = new TinyHaxeTry1Parser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeTag_return typeTag61 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:111:19: ( typeTag -> ^( TYPE_TAG typeTag ) | -> ^( TYPE_TAG ) )
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
                    // C:\\antlr\\TinyHaxeTry1.g:111:21: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt1424);
                    typeTag61=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag61.getTree());


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
                    // 111:29: -> ^( TYPE_TAG typeTag )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:111:32: ^( TYPE_TAG typeTag )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_TAG, "TYPE_TAG"), root_1);

                        adaptor.addChild(root_1, stream_typeTag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:112:23: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 112:23: -> ^( TYPE_TAG )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:112:26: ^( TYPE_TAG )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_TAG, "TYPE_TAG"), root_1);

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
    // C:\\antlr\\TinyHaxeTry1.g:114:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );
    public final TinyHaxeTry1Parser.typeList_return typeList() throws RecognitionException {
        TinyHaxeTry1Parser.typeList_return retval = new TinyHaxeTry1Parser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA63=null;
        Token COMMA66=null;
        TinyHaxeTry1Parser.funcType_return funcType62 = null;

        TinyHaxeTry1Parser.funcType_return funcType64 = null;

        TinyHaxeTry1Parser.typeConstraint_return typeConstraint65 = null;

        TinyHaxeTry1Parser.typeConstraint_return typeConstraint67 = null;


        Object COMMA63_tree=null;
        Object COMMA66_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:114:19: ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* )
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
                    // C:\\antlr\\TinyHaxeTry1.g:114:21: funcType ( COMMA funcType )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_typeList1478);
                    funcType62=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType62.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:114:30: ( COMMA funcType )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:114:31: COMMA funcType
                    	    {
                    	    COMMA63=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1481); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_funcType_in_typeList1484);
                    	    funcType64=funcType();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType64.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:115:25: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeConstraint_in_typeList1512);
                    typeConstraint65=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint65.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:115:40: ( COMMA typeConstraint )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:115:41: COMMA typeConstraint
                    	    {
                    	    COMMA66=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1515); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList1518);
                    	    typeConstraint67=typeConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint67.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:126:1: funcType : ( type ) ( MINUS_BIGGER type )* ;
    public final TinyHaxeTry1Parser.funcType_return funcType() throws RecognitionException {
        TinyHaxeTry1Parser.funcType_return retval = new TinyHaxeTry1Parser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token MINUS_BIGGER69=null;
        TinyHaxeTry1Parser.type_return type68 = null;

        TinyHaxeTry1Parser.type_return type70 = null;


        Object MINUS_BIGGER69_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:126:19: ( ( type ) ( MINUS_BIGGER type )* )
            // C:\\antlr\\TinyHaxeTry1.g:126:21: ( type ) ( MINUS_BIGGER type )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:126:21: ( type )
            // C:\\antlr\\TinyHaxeTry1.g:126:22: type
            {
            pushFollow(FOLLOW_type_in_funcType1561);
            type68=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type68.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:126:28: ( MINUS_BIGGER type )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==MINUS_BIGGER) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:126:29: MINUS_BIGGER type
            	    {
            	    MINUS_BIGGER69=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1565); if (state.failed) return retval;
            	    pushFollow(FOLLOW_type_in_funcType1568);
            	    type70=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type70.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:128:1: type : ( anonType | dotIdent ) ( typeParam )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:128:19: ( ( anonType | dotIdent ) ( typeParam )* )
            // C:\\antlr\\TinyHaxeTry1.g:128:21: ( anonType | dotIdent ) ( typeParam )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:128:21: ( anonType | dotIdent )
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
                    // C:\\antlr\\TinyHaxeTry1.g:128:22: anonType
                    {
                    pushFollow(FOLLOW_anonType_in_type1593);
                    anonType71=anonType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonType71.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:128:33: dotIdent
                    {
                    pushFollow(FOLLOW_dotIdent_in_type1597);
                    dotIdent72=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent72.getTree());

                    }
                    break;

            }

            // C:\\antlr\\TinyHaxeTry1.g:128:43: ( typeParam )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==GT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:128:44: typeParam
            	    {
            	    pushFollow(FOLLOW_typeParam_in_type1601);
            	    typeParam73=typeParam();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam73.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:130:1: typeParam : GT typeList LT ;
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
            // C:\\antlr\\TinyHaxeTry1.g:130:19: ( GT typeList LT )
            // C:\\antlr\\TinyHaxeTry1.g:130:21: GT typeList LT
            {
            root_0 = (Object)adaptor.nil();

            GT74=(Token)match(input,GT,FOLLOW_GT_in_typeParam1620); if (state.failed) return retval;
            pushFollow(FOLLOW_typeList_in_typeParam1623);
            typeList75=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList75.getTree());
            LT76=(Token)match(input,LT,FOLLOW_LT_in_typeParam1625); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:132:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT typeParam ) | -> ^( TYPE_PARAM_OPT ) );
    public final TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeParamOpt_return retval = new TinyHaxeTry1Parser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam77 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:132:19: ( typeParam -> ^( TYPE_PARAM_OPT typeParam ) | -> ^( TYPE_PARAM_OPT ) )
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
                    // C:\\antlr\\TinyHaxeTry1.g:132:21: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1640);
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
                    // 132:30: -> ^( TYPE_PARAM_OPT typeParam )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:132:32: ^( TYPE_PARAM_OPT typeParam )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAM_OPT, "TYPE_PARAM_OPT"), root_1);

                        adaptor.addChild(root_1, stream_typeParam.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:133:4: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 133:4: -> ^( TYPE_PARAM_OPT )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:133:6: ^( TYPE_PARAM_OPT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAM_OPT, "TYPE_PARAM_OPT"), root_1);

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
    // C:\\antlr\\TinyHaxeTry1.g:135:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint IDENTIFIER typeList ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:135:19: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint IDENTIFIER typeList ) )
            // C:\\antlr\\TinyHaxeTry1.g:135:21: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER78=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1672); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER78);

            COLON79=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1674); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON79);

            LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1676); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN80);

            pushFollow(FOLLOW_typeList_in_typeConstraint1678);
            typeList81=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList81.getTree());
            RPAREN82=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1680); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN82);



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
            // 135:61: -> ^( $typeConstraint IDENTIFIER typeList )
            {
                // C:\\antlr\\TinyHaxeTry1.g:135:64: ^( $typeConstraint IDENTIFIER typeList )
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
    // C:\\antlr\\TinyHaxeTry1.g:138:1: statement : ( block | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | forStmt | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO statement WHILE parExpression ) | tryStmt | switchStmt | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI );
    public final TinyHaxeTry1Parser.statement_return statement() throws RecognitionException {
        TinyHaxeTry1Parser.statement_return retval = new TinyHaxeTry1Parser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Token IF84=null;
        Token ELSE86=null;
        Token WHILE88=null;
        Token DO91=null;
        Token WHILE93=null;
        Token SEMI95=null;
        Token RETURN98=null;
        Token SEMI100=null;
        Token THROW101=null;
        Token SEMI103=null;
        Token BREAK104=null;
        Token IDENTIFIER105=null;
        Token SEMI106=null;
        Token CONTINUE107=null;
        Token IDENTIFIER108=null;
        Token SEMI109=null;
        Token SEMI111=null;
        Token IDENTIFIER112=null;
        Token COLON113=null;
        Token SEMI115=null;
        TinyHaxeTry1Parser.statement_return st1 = null;

        TinyHaxeTry1Parser.statement_return st2 = null;

        TinyHaxeTry1Parser.block_return block83 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression85 = null;

        TinyHaxeTry1Parser.forStmt_return forStmt87 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression89 = null;

        TinyHaxeTry1Parser.statement_return statement90 = null;

        TinyHaxeTry1Parser.statement_return statement92 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression94 = null;

        TinyHaxeTry1Parser.tryStmt_return tryStmt96 = null;

        TinyHaxeTry1Parser.switchStmt_return switchStmt97 = null;

        TinyHaxeTry1Parser.expr_return expr99 = null;

        TinyHaxeTry1Parser.expr_return expr102 = null;

        TinyHaxeTry1Parser.expr_return expr110 = null;

        TinyHaxeTry1Parser.statement_return statement114 = null;


        Object IF84_tree=null;
        Object ELSE86_tree=null;
        Object WHILE88_tree=null;
        Object DO91_tree=null;
        Object WHILE93_tree=null;
        Object SEMI95_tree=null;
        Object RETURN98_tree=null;
        Object SEMI100_tree=null;
        Object THROW101_tree=null;
        Object SEMI103_tree=null;
        Object BREAK104_tree=null;
        Object IDENTIFIER105_tree=null;
        Object SEMI106_tree=null;
        Object CONTINUE107_tree=null;
        Object IDENTIFIER108_tree=null;
        Object SEMI109_tree=null;
        Object SEMI111_tree=null;
        Object IDENTIFIER112_tree=null;
        Object COLON113_tree=null;
        Object SEMI115_tree=null;
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
            // C:\\antlr\\TinyHaxeTry1.g:139:5: ( block | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | forStmt | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO statement WHILE parExpression ) | tryStmt | switchStmt | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI )
            int alt26=14;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:139:9: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement1709);
                    block83=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block83.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:140:9: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF84=(Token)match(input,IF,FOLLOW_IF_in_statement1719); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF84);

                    pushFollow(FOLLOW_parExpression_in_statement1721);
                    parExpression85=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression85.getTree());
                    pushFollow(FOLLOW_statement_in_statement1725);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:140:40: ( ELSE st2= statement )?
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
                            // C:\\antlr\\TinyHaxeTry1.g:140:41: ELSE st2= statement
                            {
                            ELSE86=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1728); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE86);

                            pushFollow(FOLLOW_statement_in_statement1732);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: IF, ELSE, st2, st1, parExpression
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
                    // 140:62: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:140:65: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // C:\\antlr\\TinyHaxeTry1.g:140:89: ( ^( ELSE $st2) )?
                        if ( stream_ELSE.hasNext()||stream_st2.hasNext() ) {
                            // C:\\antlr\\TinyHaxeTry1.g:140:89: ^( ELSE $st2)
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
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:141:9: forStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStmt_in_statement1773);
                    forStmt87=forStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStmt87.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:142:9: WHILE parExpression statement
                    {
                    WHILE88=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1783); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE88);

                    pushFollow(FOLLOW_parExpression_in_statement1785);
                    parExpression89=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression89.getTree());
                    pushFollow(FOLLOW_statement_in_statement1787);
                    statement90=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement90.getTree());


                    // AST REWRITE
                    // elements: WHILE, parExpression, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:39: -> ^( WHILE parExpression statement )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:142:42: ^( WHILE parExpression statement )
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
                    // C:\\antlr\\TinyHaxeTry1.g:143:9: DO statement WHILE parExpression SEMI
                    {
                    DO91=(Token)match(input,DO,FOLLOW_DO_in_statement1807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO91);

                    pushFollow(FOLLOW_statement_in_statement1809);
                    statement92=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement92.getTree());
                    WHILE93=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE93);

                    pushFollow(FOLLOW_parExpression_in_statement1813);
                    parExpression94=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression94.getTree());
                    SEMI95=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1815); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI95);



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
                    // 143:47: -> ^( DO statement WHILE parExpression )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:143:50: ^( DO statement WHILE parExpression )
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
                    // C:\\antlr\\TinyHaxeTry1.g:144:9: tryStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStmt_in_statement1837);
                    tryStmt96=tryStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryStmt96.getTree());

                    }
                    break;
                case 7 :
                    // C:\\antlr\\TinyHaxeTry1.g:146:6: switchStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStmt_in_statement1847);
                    switchStmt97=switchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStmt97.getTree());

                    }
                    break;
                case 8 :
                    // C:\\antlr\\TinyHaxeTry1.g:147:9: RETURN ( expr )? SEMI
                    {
                    RETURN98=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1857); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN98);

                    // C:\\antlr\\TinyHaxeTry1.g:147:16: ( expr )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=IDENTIFIER && LA23_0<=DOT)||(LA23_0>=QUES && LA23_0<=LPAREN)||LA23_0==LBRACKET||LA23_0==BANG||(LA23_0>=GT && LA23_0<=LT)||LA23_0==LBRACE||(LA23_0>=ELLIPSIS && LA23_0<=CAST)||LA23_0==EQ||(LA23_0>=LONGLITERAL && LA23_0<=FLOATNUM)||(LA23_0>=PLUSEQ && LA23_0<=PERCENTEQ)||(LA23_0>=158 && LA23_0<=160)) ) {
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
                            // C:\\antlr\\TinyHaxeTry1.g:147:17: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1860);
                            expr99=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr99.getTree());

                            }
                            break;

                    }

                    SEMI100=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI100);



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
                    // 147:29: -> ^( RETURN ( expr )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:147:32: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // C:\\antlr\\TinyHaxeTry1.g:147:41: ( expr )?
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
                    // C:\\antlr\\TinyHaxeTry1.g:148:9: THROW expr SEMI
                    {
                    THROW101=(Token)match(input,THROW,FOLLOW_THROW_in_statement1883); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW101);

                    pushFollow(FOLLOW_expr_in_statement1885);
                    expr102=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr102.getTree());
                    SEMI103=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1887); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI103);



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
                    // 148:25: -> ^( THROW expr )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:148:28: ^( THROW expr )
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
                    // C:\\antlr\\TinyHaxeTry1.g:149:9: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK104=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK104);

                    // C:\\antlr\\TinyHaxeTry1.g:149:15: ( IDENTIFIER )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==IDENTIFIER) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:149:16: IDENTIFIER
                            {
                            IDENTIFIER105=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1908); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER105);


                            }
                            break;

                    }

                    SEMI106=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI106);



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
                    // 149:34: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:149:37: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        // C:\\antlr\\TinyHaxeTry1.g:149:45: ( IDENTIFIER )?
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
                    // C:\\antlr\\TinyHaxeTry1.g:150:9: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE107=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1931); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE107);

                    // C:\\antlr\\TinyHaxeTry1.g:150:18: ( IDENTIFIER )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==IDENTIFIER) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:150:19: IDENTIFIER
                            {
                            IDENTIFIER108=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1934); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER108);


                            }
                            break;

                    }

                    SEMI109=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1938); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI109);



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
                    // 150:37: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:150:40: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        // C:\\antlr\\TinyHaxeTry1.g:150:51: ( IDENTIFIER )?
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
                    // C:\\antlr\\TinyHaxeTry1.g:151:9: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement1957);
                    expr110=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr110.getTree());
                    SEMI111=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1960); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // C:\\antlr\\TinyHaxeTry1.g:152:9: IDENTIFIER COLON statement
                    {
                    IDENTIFIER112=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1972); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER112);

                    COLON113=(Token)match(input,COLON,FOLLOW_COLON_in_statement1974); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON113);

                    pushFollow(FOLLOW_statement_in_statement1976);
                    statement114=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement114.getTree());


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
                    // 152:36: -> ^( COLON IDENTIFIER statement )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:152:39: ^( COLON IDENTIFIER statement )
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
                    // C:\\antlr\\TinyHaxeTry1.g:153:9: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI115=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1996); if (state.failed) return retval;

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
    // C:\\antlr\\TinyHaxeTry1.g:156:1: parExpression : RPAREN expr LPAREN ;
    public final TinyHaxeTry1Parser.parExpression_return parExpression() throws RecognitionException {
        TinyHaxeTry1Parser.parExpression_return retval = new TinyHaxeTry1Parser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        Object root_0 = null;

        Token RPAREN116=null;
        Token LPAREN118=null;
        TinyHaxeTry1Parser.expr_return expr117 = null;


        Object RPAREN116_tree=null;
        Object LPAREN118_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:157:5: ( RPAREN expr LPAREN )
            // C:\\antlr\\TinyHaxeTry1.g:157:9: RPAREN expr LPAREN
            {
            root_0 = (Object)adaptor.nil();

            RPAREN116=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2021); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_parExpression2024);
            expr117=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr117.getTree());
            LPAREN118=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2026); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:160:1: block : LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE ( blockStmt )* ) ;
    public final TinyHaxeTry1Parser.block_return block() throws RecognitionException {
        TinyHaxeTry1Parser.block_return retval = new TinyHaxeTry1Parser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE119=null;
        Token RBRACE121=null;
        TinyHaxeTry1Parser.blockStmt_return blockStmt120 = null;


        Object LBRACE119_tree=null;
        Object RBRACE121_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:160:15: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE ( blockStmt )* ) )
            // C:\\antlr\\TinyHaxeTry1.g:160:17: LBRACE ( blockStmt )* RBRACE
            {
            LBRACE119=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2048); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE119);

            // C:\\antlr\\TinyHaxeTry1.g:160:24: ( blockStmt )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=SEMI && LA27_0<=DOT)||(LA27_0>=PUBLIC && LA27_0<=OVERRIDE)||(LA27_0>=QUES && LA27_0<=LPAREN)||LA27_0==LBRACKET||LA27_0==BANG||(LA27_0>=GT && LA27_0<=IF)||(LA27_0>=WHILE && LA27_0<=LBRACE)||LA27_0==FOR||(LA27_0>=SWITCH && LA27_0<=TRY)||(LA27_0>=ELLIPSIS && LA27_0<=CAST)||(LA27_0>=VAR && LA27_0<=CLASS)||(LA27_0>=LONGLITERAL && LA27_0<=FLOATNUM)||(LA27_0>=PLUSEQ && LA27_0<=PERCENTEQ)||(LA27_0>=158 && LA27_0<=160)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:160:25: blockStmt
            	    {
            	    pushFollow(FOLLOW_blockStmt_in_block2051);
            	    blockStmt120=blockStmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt120.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            RBRACE121=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2055); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE121);



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
            // 160:44: -> ^( BLOCK_SCOPE ( blockStmt )* )
            {
                // C:\\antlr\\TinyHaxeTry1.g:160:46: ^( BLOCK_SCOPE ( blockStmt )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                // C:\\antlr\\TinyHaxeTry1.g:160:60: ( blockStmt )*
                while ( stream_blockStmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_blockStmt.nextTree());

                }
                stream_blockStmt.reset();

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
    // C:\\antlr\\TinyHaxeTry1.g:163:1: blockStmt : ( varDecl | classDecl | statement );
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
            // C:\\antlr\\TinyHaxeTry1.g:164:2: ( varDecl | classDecl | statement )
            int alt28=3;
            switch ( input.LA(1) ) {
            case PUBLIC:
            case PRIVATE:
            case STATIC:
            case INLINE:
            case DYNAMIC:
            case OVERRIDE:
            case VAR:
                {
                alt28=1;
                }
                break;
            case CLASS:
                {
                alt28=2;
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
            case 158:
            case 159:
            case 160:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:164:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_blockStmt2076);
                    varDecl122=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl122.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:165:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_blockStmt2081);
                    classDecl123=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl123.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:166:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStmt2086);
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
    // C:\\antlr\\TinyHaxeTry1.g:169:1: forStmt : FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:169:19: ( FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) )
            // C:\\antlr\\TinyHaxeTry1.g:169:21: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
            {
            FOR125=(Token)match(input,FOR,FOLLOW_FOR_in_forStmt2118); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR125);

            LPAREN126=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forStmt2120); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN126);

            pushFollow(FOLLOW_expr_in_forStmt2124);
            exp1=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
            IN127=(Token)match(input,IN,FOLLOW_IN_in_forStmt2126); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN127);

            pushFollow(FOLLOW_expr_in_forStmt2130);
            exp2=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
            RPAREN128=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forStmt2132); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN128);

            pushFollow(FOLLOW_statement_in_forStmt2134);
            statement129=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement129.getTree());


            // AST REWRITE
            // elements: exp1, IN, FOR, statement, exp2
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
            // 169:72: -> ^( FOR ^( IN $exp1 $exp2) statement )
            {
                // C:\\antlr\\TinyHaxeTry1.g:169:75: ^( FOR ^( IN $exp1 $exp2) statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);

                // C:\\antlr\\TinyHaxeTry1.g:169:81: ^( IN $exp1 $exp2)
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
    // C:\\antlr\\TinyHaxeTry1.g:172:1: breakStmt : BREAK SEMI ;
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
            // C:\\antlr\\TinyHaxeTry1.g:172:19: ( BREAK SEMI )
            // C:\\antlr\\TinyHaxeTry1.g:172:21: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            BREAK130=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt2171); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK130_tree = (Object)adaptor.create(BREAK130);
            adaptor.addChild(root_0, BREAK130_tree);
            }
            SEMI131=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt2173); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:174:1: continueStmt : CONTINUE SEMI ;
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
            // C:\\antlr\\TinyHaxeTry1.g:174:19: ( CONTINUE SEMI )
            // C:\\antlr\\TinyHaxeTry1.g:174:21: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE132=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt2188); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE132_tree = (Object)adaptor.create(CONTINUE132);
            adaptor.addChild(root_0, CONTINUE132_tree);
            }
            SEMI133=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt2190); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:176:1: caseStmt : CASE exprList COLON ;
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
            // C:\\antlr\\TinyHaxeTry1.g:176:19: ( CASE exprList COLON )
            // C:\\antlr\\TinyHaxeTry1.g:176:21: CASE exprList COLON
            {
            root_0 = (Object)adaptor.nil();

            CASE134=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2209); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE134_tree = (Object)adaptor.create(CASE134);
            adaptor.addChild(root_0, CASE134_tree);
            }
            pushFollow(FOLLOW_exprList_in_caseStmt2211);
            exprList135=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList135.getTree());
            COLON136=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2213); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:178:1: defaultStmt : DEFAULT COLON ;
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
            // C:\\antlr\\TinyHaxeTry1.g:178:19: ( DEFAULT COLON )
            // C:\\antlr\\TinyHaxeTry1.g:178:21: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT137=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt2229); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT137_tree = (Object)adaptor.create(DEFAULT137);
            adaptor.addChild(root_0, DEFAULT137_tree);
            }
            COLON138=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt2231); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:180:1: switchStmt : SWITCH LPAREN expr RPAREN block -> ^( SWITCH expr block ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:180:19: ( SWITCH LPAREN expr RPAREN block -> ^( SWITCH expr block ) )
            // C:\\antlr\\TinyHaxeTry1.g:180:21: SWITCH LPAREN expr RPAREN block
            {
            SWITCH139=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchStmt2248); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH139);

            LPAREN140=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_switchStmt2250); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN140);

            pushFollow(FOLLOW_expr_in_switchStmt2252);
            expr141=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr141.getTree());
            RPAREN142=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_switchStmt2254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN142);

            pushFollow(FOLLOW_block_in_switchStmt2256);
            block143=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block143.getTree());


            // AST REWRITE
            // elements: SWITCH, block, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 180:53: -> ^( SWITCH expr block )
            {
                // C:\\antlr\\TinyHaxeTry1.g:180:56: ^( SWITCH expr block )
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
    // C:\\antlr\\TinyHaxeTry1.g:182:1: tryStmt : TRY block catchStmtList -> ^( TRY block catchStmtList ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:182:19: ( TRY block catchStmtList -> ^( TRY block catchStmtList ) )
            // C:\\antlr\\TinyHaxeTry1.g:182:21: TRY block catchStmtList
            {
            TRY144=(Token)match(input,TRY,FOLLOW_TRY_in_tryStmt2285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRY.add(TRY144);

            pushFollow(FOLLOW_block_in_tryStmt2287);
            block145=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block145.getTree());
            pushFollow(FOLLOW_catchStmtList_in_tryStmt2289);
            catchStmtList146=catchStmtList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList146.getTree());


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
            // 182:45: -> ^( TRY block catchStmtList )
            {
                // C:\\antlr\\TinyHaxeTry1.g:182:48: ^( TRY block catchStmtList )
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
    // C:\\antlr\\TinyHaxeTry1.g:184:1: catchStmtList : ( catchStmt catchStmtList | );
    public final TinyHaxeTry1Parser.catchStmtList_return catchStmtList() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmtList_return retval = new TinyHaxeTry1Parser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.catchStmt_return catchStmt147 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList148 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:184:19: ( catchStmt catchStmtList | )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==CATCH) ) {
                alt29=1;
            }
            else if ( (LA29_0==EOF||(LA29_0>=SEMI && LA29_0<=DOT)||(LA29_0>=PUBLIC && LA29_0<=RBRACKET)||LA29_0==BANG||LA29_0==COLON||(LA29_0>=GT && LA29_0<=IN)||(LA29_0>=SWITCH && LA29_0<=TRY)||(LA29_0>=ELLIPSIS && LA29_0<=CAST)||(LA29_0>=VAR && LA29_0<=CLASS)||(LA29_0>=LONGLITERAL && LA29_0<=FLOATNUM)||(LA29_0>=PLUSEQ && LA29_0<=PERCENTEQ)||(LA29_0>=158 && LA29_0<=160)) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:184:21: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catchStmt_in_catchStmtList2312);
                    catchStmt147=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt147.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList2314);
                    catchStmtList148=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList148.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:186:2: 
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
    // C:\\antlr\\TinyHaxeTry1.g:187:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH param block ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:187:19: ( CATCH LPAREN param RPAREN block -> ^( CATCH param block ) )
            // C:\\antlr\\TinyHaxeTry1.g:187:21: CATCH LPAREN param RPAREN block
            {
            CATCH149=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2353); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH149);

            LPAREN150=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2355); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN150);

            pushFollow(FOLLOW_param_in_catchStmt2357);
            param151=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param151.getTree());
            RPAREN152=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2359); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN152);

            pushFollow(FOLLOW_block_in_catchStmt2361);
            block153=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block153.getTree());


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
            // 187:53: -> ^( CATCH param block )
            {
                // C:\\antlr\\TinyHaxeTry1.g:187:56: ^( CATCH param block )
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
    // C:\\antlr\\TinyHaxeTry1.g:191:1: exprListOpt : ( exprList | );
    public final TinyHaxeTry1Parser.exprListOpt_return exprListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.exprListOpt_return retval = new TinyHaxeTry1Parser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.exprList_return exprList154 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:191:19: ( exprList | )
            int alt30=2;
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
            case 158:
            case 159:
            case 160:
                {
                alt30=1;
                }
                break;
            case RBRACKET:
                {
                int LA30_2 = input.LA(2);

                if ( (synpred62_TinyHaxeTry1()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case RPAREN:
                {
                int LA30_3 = input.LA(2);

                if ( (synpred62_TinyHaxeTry1()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:191:21: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprList_in_exprListOpt2388);
                    exprList154=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList154.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:193:2: 
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
    // C:\\antlr\\TinyHaxeTry1.g:194:1: exprList : expr ( COMMA expr )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:194:19: ( expr ( COMMA expr )* )
            // C:\\antlr\\TinyHaxeTry1.g:194:21: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList2428);
            expr155=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr155.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:194:26: ( COMMA expr )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==COMMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:194:27: COMMA expr
            	    {
            	    COMMA156=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2431); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_exprList2434);
            	    expr157=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr157.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // C:\\antlr\\TinyHaxeTry1.g:196:1: expr : assignExpr ;
    public final TinyHaxeTry1Parser.expr_return expr() throws RecognitionException {
        TinyHaxeTry1Parser.expr_return retval = new TinyHaxeTry1Parser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.assignExpr_return assignExpr158 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:196:19: ( assignExpr )
            // C:\\antlr\\TinyHaxeTry1.g:196:21: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr2458);
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
    // C:\\antlr\\TinyHaxeTry1.g:198:1: assignExpr : iterExpr ( assignOp iterExpr )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:198:19: ( iterExpr ( assignOp iterExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:198:21: iterExpr ( assignOp iterExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iterExpr_in_assignExpr2474);
            iterExpr159=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr159.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:198:30: ( assignOp iterExpr )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==EQ||(LA32_0>=PLUSEQ && LA32_0<=PERCENTEQ)||(LA32_0>=158 && LA32_0<=160)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:198:31: assignOp iterExpr
            	    {
            	    pushFollow(FOLLOW_assignOp_in_assignExpr2477);
            	    assignOp160=assignOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp160.getTree(), root_0);
            	    pushFollow(FOLLOW_iterExpr_in_assignExpr2480);
            	    iterExpr161=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr161.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:200:1: iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:200:19: ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:200:21: ternaryExpr ( ELLIPSIS ternaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2501);
            ternaryExpr162=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr162.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:200:33: ( ELLIPSIS ternaryExpr )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ELLIPSIS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:200:34: ELLIPSIS ternaryExpr
            	    {
            	    ELLIPSIS163=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2504); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELLIPSIS163_tree = (Object)adaptor.create(ELLIPSIS163);
            	    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS163_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2507);
            	    ternaryExpr164=ternaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr164.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:202:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:202:19: ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:202:21: logicOrExpr ( QUES expr COLON logicOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2530);
            logicOrExpr165=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr165.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:202:33: ( QUES expr COLON logicOrExpr )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==QUES) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:202:34: QUES expr COLON logicOrExpr
            	    {
            	    QUES166=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2533); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    QUES166_tree = (Object)adaptor.create(QUES166);
            	    root_0 = (Object)adaptor.becomeRoot(QUES166_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_in_ternaryExpr2536);
            	    expr167=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr167.getTree());
            	    COLON168=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2538); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2541);
            	    logicOrExpr169=logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr169.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:204:1: logicOrExpr : ( logicAndExpr ) ( BARBAR logicAndExpr )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:204:19: ( ( logicAndExpr ) ( BARBAR logicAndExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:204:21: ( logicAndExpr ) ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:204:21: ( logicAndExpr )
            // C:\\antlr\\TinyHaxeTry1.g:204:22: logicAndExpr
            {
            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2559);
            logicAndExpr170=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr170.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:204:36: ( BARBAR logicAndExpr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==BARBAR) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:204:37: BARBAR logicAndExpr
            	    {
            	    BARBAR171=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2563); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR171_tree = (Object)adaptor.create(BARBAR171);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR171_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2566);
            	    logicAndExpr172=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr172.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:206:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:206:19: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:206:21: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:206:21: ( cmpExpr )
            // C:\\antlr\\TinyHaxeTry1.g:206:22: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2583);
            cmpExpr173=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr173.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:206:31: ( AMPAMP cmpExpr )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==AMPAMP) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:206:32: AMPAMP cmpExpr
            	    {
            	    AMPAMP174=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2587); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP174_tree = (Object)adaptor.create(AMPAMP174);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP174_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2590);
            	    cmpExpr175=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr175.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:208:1: cmpExpr : ( bitExpr ) ( EQEQ bitExpr | BANGEQ bitExpr | GTEQ bitExpr | LTEQ bitExpr | GT bitExpr | LT bitExpr )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:208:19: ( ( bitExpr ) ( EQEQ bitExpr | BANGEQ bitExpr | GTEQ bitExpr | LTEQ bitExpr | GT bitExpr | LT bitExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:208:21: ( bitExpr ) ( EQEQ bitExpr | BANGEQ bitExpr | GTEQ bitExpr | LTEQ bitExpr | GT bitExpr | LT bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:208:21: ( bitExpr )
            // C:\\antlr\\TinyHaxeTry1.g:208:22: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2612);
            bitExpr176=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr176.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:208:31: ( EQEQ bitExpr | BANGEQ bitExpr | GTEQ bitExpr | LTEQ bitExpr | GT bitExpr | LT bitExpr )*
            loop37:
            do {
                int alt37=7;
                switch ( input.LA(1) ) {
                case EQEQ:
                    {
                    alt37=1;
                    }
                    break;
                case BANGEQ:
                    {
                    alt37=2;
                    }
                    break;
                case GTEQ:
                    {
                    alt37=3;
                    }
                    break;
                case LTEQ:
                    {
                    alt37=4;
                    }
                    break;
                case GT:
                    {
                    alt37=5;
                    }
                    break;
                case LT:
                    {
                    alt37=6;
                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:208:32: EQEQ bitExpr
            	    {
            	    EQEQ177=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2616); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    EQEQ177_tree = (Object)adaptor.create(EQEQ177);
            	    root_0 = (Object)adaptor.becomeRoot(EQEQ177_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2619);
            	    bitExpr178=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr178.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:208:48: BANGEQ bitExpr
            	    {
            	    BANGEQ179=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2623); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BANGEQ179_tree = (Object)adaptor.create(BANGEQ179);
            	    root_0 = (Object)adaptor.becomeRoot(BANGEQ179_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2626);
            	    bitExpr180=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr180.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:208:66: GTEQ bitExpr
            	    {
            	    GTEQ181=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2630); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTEQ181_tree = (Object)adaptor.create(GTEQ181);
            	    root_0 = (Object)adaptor.becomeRoot(GTEQ181_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2633);
            	    bitExpr182=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr182.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\antlr\\TinyHaxeTry1.g:208:82: LTEQ bitExpr
            	    {
            	    LTEQ183=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2637); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTEQ183_tree = (Object)adaptor.create(LTEQ183);
            	    root_0 = (Object)adaptor.becomeRoot(LTEQ183_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2640);
            	    bitExpr184=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr184.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\antlr\\TinyHaxeTry1.g:208:98: GT bitExpr
            	    {
            	    GT185=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2644); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT185_tree = (Object)adaptor.create(GT185);
            	    root_0 = (Object)adaptor.becomeRoot(GT185_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2648);
            	    bitExpr186=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr186.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\antlr\\TinyHaxeTry1.g:208:113: LT bitExpr
            	    {
            	    LT187=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2652); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LT187_tree = (Object)adaptor.create(LT187);
            	    root_0 = (Object)adaptor.becomeRoot(LT187_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2656);
            	    bitExpr188=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr188.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:210:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:210:19: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:210:21: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:210:21: ( shiftExpr )
            // C:\\antlr\\TinyHaxeTry1.g:210:22: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2678);
            shiftExpr189=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr189.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:210:33: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            loop38:
            do {
                int alt38=4;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    alt38=1;
                    }
                    break;
                case AMP:
                    {
                    alt38=2;
                    }
                    break;
                case CARET:
                    {
                    alt38=3;
                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:210:34: BAR shiftExpr
            	    {
            	    BAR190=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2682); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR190_tree = (Object)adaptor.create(BAR190);
            	    root_0 = (Object)adaptor.becomeRoot(BAR190_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2685);
            	    shiftExpr191=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr191.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:210:51: AMP shiftExpr
            	    {
            	    AMP192=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2689); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP192_tree = (Object)adaptor.create(AMP192);
            	    root_0 = (Object)adaptor.becomeRoot(AMP192_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2692);
            	    shiftExpr193=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr193.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:210:67: CARET shiftExpr
            	    {
            	    CARET194=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2695); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET194_tree = (Object)adaptor.create(CARET194);
            	    root_0 = (Object)adaptor.becomeRoot(CARET194_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2698);
            	    shiftExpr195=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr195.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:212:1: shiftExpr : ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:212:19: ( ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:212:21: ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:212:21: ( addExpr )
            // C:\\antlr\\TinyHaxeTry1.g:212:22: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2718);
            addExpr196=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr196.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:212:31: ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )*
            loop39:
            do {
                int alt39=4;
                switch ( input.LA(1) ) {
                case LTLT:
                    {
                    alt39=1;
                    }
                    break;
                case GTGT:
                    {
                    alt39=2;
                    }
                    break;
                case GTGTGT:
                    {
                    alt39=3;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:212:32: LTLT addExpr
            	    {
            	    LTLT197=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2722); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT197_tree = (Object)adaptor.create(LTLT197);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT197_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2726);
            	    addExpr198=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr198.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:212:49: GTGT addExpr
            	    {
            	    GTGT199=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr2730); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGT199_tree = (Object)adaptor.create(GTGT199);
            	    root_0 = (Object)adaptor.becomeRoot(GTGT199_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2734);
            	    addExpr200=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr200.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:212:66: GTGTGT addExpr
            	    {
            	    GTGTGT201=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2738); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT201_tree = (Object)adaptor.create(GTGTGT201);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT201_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2741);
            	    addExpr202=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr202.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:215:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:215:19: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:215:21: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:215:21: ( multExpr )
            // C:\\antlr\\TinyHaxeTry1.g:215:22: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2764);
            multExpr203=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr203.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:215:32: ( ( PLUS | SUB ) multExpr )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=PLUS && LA41_0<=SUB)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:215:33: ( PLUS | SUB ) multExpr
            	    {
            	    // C:\\antlr\\TinyHaxeTry1.g:215:33: ( PLUS | SUB )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==PLUS) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==SUB) ) {
            	        alt40=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // C:\\antlr\\TinyHaxeTry1.g:215:34: PLUS
            	            {
            	            PLUS204=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2769); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS204_tree = (Object)adaptor.create(PLUS204);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS204_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\antlr\\TinyHaxeTry1.g:215:42: SUB
            	            {
            	            SUB205=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2774); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB205_tree = (Object)adaptor.create(SUB205);
            	            root_0 = (Object)adaptor.becomeRoot(SUB205_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2778);
            	    multExpr206=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr206.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:217:1: multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:217:19: ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:217:21: ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:217:21: ( prefixExpr )
            // C:\\antlr\\TinyHaxeTry1.g:217:22: prefixExpr
            {
            pushFollow(FOLLOW_prefixExpr_in_multExpr2800);
            prefixExpr207=prefixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr207.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:217:34: ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=STAR && LA43_0<=PERCENT)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:217:35: ( STAR | SLASH | PERCENT ) prefixExpr
            	    {
            	    // C:\\antlr\\TinyHaxeTry1.g:217:35: ( STAR | SLASH | PERCENT )
            	    int alt42=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt42=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt42=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt42=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt42) {
            	        case 1 :
            	            // C:\\antlr\\TinyHaxeTry1.g:217:36: STAR
            	            {
            	            STAR208=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2805); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR208_tree = (Object)adaptor.create(STAR208);
            	            root_0 = (Object)adaptor.becomeRoot(STAR208_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\antlr\\TinyHaxeTry1.g:217:42: SLASH
            	            {
            	            SLASH209=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2808); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH209_tree = (Object)adaptor.create(SLASH209);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH209_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\antlr\\TinyHaxeTry1.g:217:49: PERCENT
            	            {
            	            PERCENT210=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2811); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT210_tree = (Object)adaptor.create(PERCENT210);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT210_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2815);
            	    prefixExpr211=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr211.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:219:1: prefixExpr : ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr );
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
            // C:\\antlr\\TinyHaxeTry1.g:219:19: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr )
            int alt44=4;
            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                int LA44_1 = input.LA(2);

                if ( (synpred90_TinyHaxeTry1()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
                }
                break;
            case NEW:
                {
                alt44=2;
                }
                break;
            case CAST:
                {
                alt44=3;
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
            case 158:
            case 159:
            case 160:
                {
                alt44=4;
                }
                break;
            case SUBSUB:
                {
                int LA44_5 = input.LA(2);

                if ( (synpred90_TinyHaxeTry1()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 5, input);

                    throw nvae;
                }
                }
                break;
            case SUB:
                {
                int LA44_6 = input.LA(2);

                if ( (synpred90_TinyHaxeTry1()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 6, input);

                    throw nvae;
                }
                }
                break;
            case BANG:
            case TILDE:
                {
                alt44=1;
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
                    // C:\\antlr\\TinyHaxeTry1.g:219:21: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
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

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2845);
                    prefixExpr213=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr213.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:220:25: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_prefixExpr2871);
                    newExpr214=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr214.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:221:25: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cast_in_prefixExpr2897);
                    cast215=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast215.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:222:25: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr2923);
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
    // C:\\antlr\\TinyHaxeTry1.g:234:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR value exprListOpt ) | value DOT IDENTIFIER | value LBRACKET expr RBRACKET | value PLUSPLUS | value SUBSUB | value );
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
            // C:\\antlr\\TinyHaxeTry1.g:235:2: ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR value exprListOpt ) | value DOT IDENTIFIER | value LBRACKET expr RBRACKET | value PLUSPLUS | value SUBSUB | value )
            int alt45=6;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:235:4: value LPAREN exprListOpt RPAREN
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2944);
                    value217=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value217.getTree());
                    LPAREN218=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_suffixExpr2946); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN218);

                    pushFollow(FOLLOW_exprListOpt_in_suffixExpr2948);
                    exprListOpt219=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt219.getTree());
                    RPAREN220=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_suffixExpr2950); if (state.failed) return retval; 
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
                    // 235:36: -> ^( SUFFIX_EXPR value exprListOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:235:39: ^( SUFFIX_EXPR value exprListOpt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUFFIX_EXPR, "SUFFIX_EXPR"), root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());
                        adaptor.addChild(root_1, stream_exprListOpt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:236:4: value DOT IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2965);
                    value221=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value221.getTree());
                    DOT222=(Token)match(input,DOT,FOLLOW_DOT_in_suffixExpr2967); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT222_tree = (Object)adaptor.create(DOT222);
                    adaptor.addChild(root_0, DOT222_tree);
                    }
                    IDENTIFIER223=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_suffixExpr2969); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER223_tree = (Object)adaptor.create(IDENTIFIER223);
                    adaptor.addChild(root_0, IDENTIFIER223_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:237:4: value LBRACKET expr RBRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2975);
                    value224=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value224.getTree());
                    LBRACKET225=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_suffixExpr2977); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACKET225_tree = (Object)adaptor.create(LBRACKET225);
                    adaptor.addChild(root_0, LBRACKET225_tree);
                    }
                    pushFollow(FOLLOW_expr_in_suffixExpr2979);
                    expr226=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr226.getTree());
                    RBRACKET227=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_suffixExpr2981); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACKET227_tree = (Object)adaptor.create(RBRACKET227);
                    adaptor.addChild(root_0, RBRACKET227_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:238:4: value PLUSPLUS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2986);
                    value228=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value228.getTree());
                    PLUSPLUS229=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr2988); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUSPLUS229_tree = (Object)adaptor.create(PLUSPLUS229);
                    adaptor.addChild(root_0, PLUSPLUS229_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:239:4: value SUBSUB
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2994);
                    value230=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value230.getTree());
                    SUBSUB231=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr2996); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUBSUB231_tree = (Object)adaptor.create(SUBSUB231);
                    adaptor.addChild(root_0, SUBSUB231_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\antlr\\TinyHaxeTry1.g:240:4: value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr3001);
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
    // C:\\antlr\\TinyHaxeTry1.g:244:1: value : ( funcLit | arrayLit | objLit | NULL | IDENTIFIER | elementarySymbol | LPAREN ( expr | statement ) RPAREN | );
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
            // C:\\antlr\\TinyHaxeTry1.g:244:7: ( funcLit | arrayLit | objLit | NULL | IDENTIFIER | elementarySymbol | LPAREN ( expr | statement ) RPAREN | )
            int alt47=8;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:244:9: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcLit_in_value3012);
                    funcLit233=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit233.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:245:25: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLit_in_value3039);
                    arrayLit234=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit234.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:246:25: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objLit_in_value3065);
                    objLit235=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit235.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:247:25: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL236=(Token)match(input,NULL,FOLLOW_NULL_in_value3091); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL236_tree = (Object)adaptor.create(NULL236);
                    adaptor.addChild(root_0, NULL236_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:248:25: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER237=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_value3117); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER237_tree = (Object)adaptor.create(IDENTIFIER237);
                    adaptor.addChild(root_0, IDENTIFIER237_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\antlr\\TinyHaxeTry1.g:249:25: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elementarySymbol_in_value3143);
                    elementarySymbol238=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol238.getTree());

                    }
                    break;
                case 7 :
                    // C:\\antlr\\TinyHaxeTry1.g:250:25: LPAREN ( expr | statement ) RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN239=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value3169); if (state.failed) return retval;
                    // C:\\antlr\\TinyHaxeTry1.g:250:33: ( expr | statement )
                    int alt46=2;
                    alt46 = dfa46.predict(input);
                    switch (alt46) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:250:34: expr
                            {
                            pushFollow(FOLLOW_expr_in_value3173);
                            expr240=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr240.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\antlr\\TinyHaxeTry1.g:250:39: statement
                            {
                            pushFollow(FOLLOW_statement_in_value3175);
                            statement241=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement241.getTree());

                            }
                            break;

                    }

                    RPAREN242=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value3178); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // C:\\antlr\\TinyHaxeTry1.g:253:9: 
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
    // C:\\antlr\\TinyHaxeTry1.g:254:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW type exprListOpt ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:254:19: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW type exprListOpt ) )
            // C:\\antlr\\TinyHaxeTry1.g:254:21: NEW type LPAREN exprListOpt RPAREN
            {
            NEW243=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr3236); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW243);

            pushFollow(FOLLOW_type_in_newExpr3238);
            type244=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type244.getTree());
            LPAREN245=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr3240); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN245);

            pushFollow(FOLLOW_exprListOpt_in_newExpr3242);
            exprListOpt246=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt246.getTree());
            RPAREN247=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr3244); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN247);



            // AST REWRITE
            // elements: type, NEW, exprListOpt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 254:56: -> ^( NEW type exprListOpt )
            {
                // C:\\antlr\\TinyHaxeTry1.g:254:58: ^( NEW type exprListOpt )
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
    // C:\\antlr\\TinyHaxeTry1.g:256:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) );
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
            // C:\\antlr\\TinyHaxeTry1.g:256:19: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==CAST) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred107_TinyHaxeTry1()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:256:21: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST248=(Token)match(input,CAST,FOLLOW_CAST_in_cast3275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST248);

                    LPAREN249=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN249);

                    pushFollow(FOLLOW_expr_in_cast3279);
                    expr250=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr250.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:256:38: ( COMMA funcType )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==COMMA) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:256:39: COMMA funcType
                            {
                            COMMA251=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast3282); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA251);

                            pushFollow(FOLLOW_funcType_in_cast3284);
                            funcType252=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType252.getTree());

                            }
                            break;

                    }

                    RPAREN253=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3288); if (state.failed) return retval; 
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
                    // 256:63: -> ^( CAST expr ( funcType )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:256:66: ^( CAST expr ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // C:\\antlr\\TinyHaxeTry1.g:256:78: ( funcType )?
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
                    // C:\\antlr\\TinyHaxeTry1.g:257:4: CAST LPAREN expr RPAREN
                    {
                    CAST254=(Token)match(input,CAST,FOLLOW_CAST_in_cast3304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST254);

                    LPAREN255=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN255);

                    pushFollow(FOLLOW_expr_in_cast3308);
                    expr256=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr256.getTree());
                    RPAREN257=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN257);



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
                    // 257:28: -> ^( CAST expr )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:257:30: ^( CAST expr )
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
    // C:\\antlr\\TinyHaxeTry1.g:261:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
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
            // C:\\antlr\\TinyHaxeTry1.g:261:19: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt50=4;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                alt50=1;
                }
                break;
            case INTERFACE:
                {
                alt50=2;
                }
                break;
            case ENUM:
                {
                alt50=3;
                }
                break;
            case TYPEDEF:
                {
                alt50=4;
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
                    // C:\\antlr\\TinyHaxeTry1.g:261:21: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_topLevelDecl3333);
                    classDecl258=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl258.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:262:25: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl3359);
                    interfaceDecl259=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl259.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:263:25: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl3385);
                    enumDecl260=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl260.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:264:25: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl3411);
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
    // C:\\antlr\\TinyHaxeTry1.g:266:1: enumDecl : ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM IDENTIFIER typeParamOpt enumBody ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:266:19: ( ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM IDENTIFIER typeParamOpt enumBody ) )
            // C:\\antlr\\TinyHaxeTry1.g:266:21: ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
            {
            ENUM262=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl3429); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM262);

            IDENTIFIER263=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl3431); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER263);

            pushFollow(FOLLOW_typeParamOpt_in_enumDecl3433);
            typeParamOpt264=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt264.getTree());
            LBRACE265=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl3435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE265);

            pushFollow(FOLLOW_enumBody_in_enumDecl3437);
            enumBody266=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody266.getTree());
            RBRACE267=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl3439); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE267);



            // AST REWRITE
            // elements: enumBody, IDENTIFIER, typeParamOpt, ENUM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 266:73: -> ^( ENUM IDENTIFIER typeParamOpt enumBody )
            {
                // C:\\antlr\\TinyHaxeTry1.g:266:76: ^( ENUM IDENTIFIER typeParamOpt enumBody )
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
    // C:\\antlr\\TinyHaxeTry1.g:268:1: enumBody : ( enumValueDecl )+ ;
    public final TinyHaxeTry1Parser.enumBody_return enumBody() throws RecognitionException {
        TinyHaxeTry1Parser.enumBody_return retval = new TinyHaxeTry1Parser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl268 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:268:19: ( ( enumValueDecl )+ )
            // C:\\antlr\\TinyHaxeTry1.g:268:21: ( enumValueDecl )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:268:21: ( enumValueDecl )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==IDENTIFIER||LA51_0==PP_IF||(LA51_0>=PP_ELSEIF && LA51_0<=PP_ERROR)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:268:22: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody3470);
            	    enumValueDecl268=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValueDecl268.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
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
    // C:\\antlr\\TinyHaxeTry1.g:270:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER SEMI | pp );
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
            // C:\\antlr\\TinyHaxeTry1.g:270:19: ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER SEMI | pp )
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==IDENTIFIER) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==LPAREN) ) {
                    alt52=1;
                }
                else if ( (LA52_1==SEMI) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==PP_IF||(LA52_0>=PP_ELSEIF && LA52_0<=PP_ERROR)) ) {
                alt52=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:270:20: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER269=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3484); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER269_tree = (Object)adaptor.create(IDENTIFIER269);
                    adaptor.addChild(root_0, IDENTIFIER269_tree);
                    }
                    LPAREN270=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl3486); if (state.failed) return retval;
                    pushFollow(FOLLOW_paramList_in_enumValueDecl3489);
                    paramList271=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList271.getTree());
                    RPAREN272=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl3491); if (state.failed) return retval;
                    SEMI273=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3494); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:271:24: IDENTIFIER SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER274=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3520); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER274_tree = (Object)adaptor.create(IDENTIFIER274);
                    adaptor.addChild(root_0, IDENTIFIER274_tree);
                    }
                    SEMI275=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3522); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:272:25: pp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_enumValueDecl3549);
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
    // C:\\antlr\\TinyHaxeTry1.g:274:1: varDeclList : varDecl varDeclList ;
    public final TinyHaxeTry1Parser.varDeclList_return varDeclList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclList_return retval = new TinyHaxeTry1Parser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl277 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList278 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:274:19: ( varDecl varDeclList )
            // C:\\antlr\\TinyHaxeTry1.g:274:21: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDecl_in_varDeclList3564);
            varDecl277=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl277.getTree());
            pushFollow(FOLLOW_varDeclList_in_varDeclList3566);
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
    // C:\\antlr\\TinyHaxeTry1.g:277:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR_DECLARATION ( declAttrList )? varDeclPartList ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:277:19: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR_DECLARATION ( declAttrList )? varDeclPartList ) )
            // C:\\antlr\\TinyHaxeTry1.g:277:21: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // C:\\antlr\\TinyHaxeTry1.g:277:21: ( declAttrList )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=PUBLIC && LA53_0<=OVERRIDE)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:277:22: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl3588);
                    declAttrList279=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList279.getTree());

                    }
                    break;

            }

            VAR280=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl3592); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR280);

            pushFollow(FOLLOW_varDeclPartList_in_varDecl3594);
            varDeclPartList281=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList281.getTree());
            SEMI282=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl3596); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI282);



            // AST REWRITE
            // elements: varDeclPartList, declAttrList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 277:62: -> ^( VAR_DECLARATION ( declAttrList )? varDeclPartList )
            {
                // C:\\antlr\\TinyHaxeTry1.g:277:64: ^( VAR_DECLARATION ( declAttrList )? varDeclPartList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DECLARATION, "VAR_DECLARATION"), root_1);

                // C:\\antlr\\TinyHaxeTry1.g:277:82: ( declAttrList )?
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
    // C:\\antlr\\TinyHaxeTry1.g:280:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:280:19: ( varDeclPart ( COMMA varDeclPart )* )
            // C:\\antlr\\TinyHaxeTry1.g:280:21: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3620);
            varDeclPart283=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart283.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:280:33: ( COMMA varDeclPart )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMA) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:280:34: COMMA varDeclPart
            	    {
            	    COMMA284=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList3623); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3626);
            	    varDeclPart285=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart285.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:282:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInitOpt ;
    public final TinyHaxeTry1Parser.varDeclPart_return varDeclPart() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclPart_return retval = new TinyHaxeTry1Parser.varDeclPart_return();
        retval.start = input.LT(1);
        int varDeclPart_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER286=null;
        TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt287 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt288 = null;

        TinyHaxeTry1Parser.varInitOpt_return varInitOpt289 = null;


        Object IDENTIFIER286_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:282:19: ( IDENTIFIER propDeclOpt typeTagOpt varInitOpt )
            // C:\\antlr\\TinyHaxeTry1.g:282:20: IDENTIFIER propDeclOpt typeTagOpt varInitOpt
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER286=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart3642); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER286_tree = (Object)adaptor.create(IDENTIFIER286);
            adaptor.addChild(root_0, IDENTIFIER286_tree);
            }
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3644);
            propDeclOpt287=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt287.getTree());
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3646);
            typeTagOpt288=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt288.getTree());
            pushFollow(FOLLOW_varInitOpt_in_varDeclPart3648);
            varInitOpt289=varInitOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varInitOpt289.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:284:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL $a1 $a2) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:284:19: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL $a1 $a2) )
            // C:\\antlr\\TinyHaxeTry1.g:284:21: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN290=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl3666); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN290);

            pushFollow(FOLLOW_propAccessor_in_propDecl3670);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            COMMA291=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl3672); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA291);

            pushFollow(FOLLOW_propAccessor_in_propDecl3676);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            RPAREN292=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl3678); if (state.failed) return retval; 
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
            // 284:73: -> ^( PROPERTY_DECL $a1 $a2)
            {
                // C:\\antlr\\TinyHaxeTry1.g:284:76: ^( PROPERTY_DECL $a1 $a2)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROPERTY_DECL, "PROPERTY_DECL"), root_1);

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
    // C:\\antlr\\TinyHaxeTry1.g:286:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final TinyHaxeTry1Parser.propAccessor_return propAccessor() throws RecognitionException {
        TinyHaxeTry1Parser.propAccessor_return retval = new TinyHaxeTry1Parser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set293=null;

        Object set293_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:286:19: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
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
    // C:\\antlr\\TinyHaxeTry1.g:291:1: propDeclOpt : ( propDecl | );
    public final TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        TinyHaxeTry1Parser.propDeclOpt_return retval = new TinyHaxeTry1Parser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.propDecl_return propDecl294 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:291:19: ( propDecl | )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==LPAREN) ) {
                alt55=1;
            }
            else if ( (LA55_0==EOF||LA55_0==SEMI||LA55_0==COMMA||LA55_0==COLON||LA55_0==EQ) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:291:21: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propDecl_in_propDeclOpt3796);
                    propDecl294=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl294.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:293:2: 
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

    public static class varInitOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInitOpt"
    // C:\\antlr\\TinyHaxeTry1.g:294:1: varInitOpt : ( varInit | );
    public final TinyHaxeTry1Parser.varInitOpt_return varInitOpt() throws RecognitionException {
        TinyHaxeTry1Parser.varInitOpt_return retval = new TinyHaxeTry1Parser.varInitOpt_return();
        retval.start = input.LT(1);
        int varInitOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varInit_return varInit295 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:294:19: ( varInit | )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==EQ) ) {
                alt56=1;
            }
            else if ( (LA56_0==EOF||LA56_0==SEMI||LA56_0==COMMA||(LA56_0>=LPAREN && LA56_0<=RPAREN)) ) {
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
                    // C:\\antlr\\TinyHaxeTry1.g:294:21: varInit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varInit_in_varInitOpt3834);
                    varInit295=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit295.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:296:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 72, varInitOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varInitOpt"

    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInit"
    // C:\\antlr\\TinyHaxeTry1.g:297:1: varInit : EQ expr -> ^( VAR_INIT expr ) ;
    public final TinyHaxeTry1Parser.varInit_return varInit() throws RecognitionException {
        TinyHaxeTry1Parser.varInit_return retval = new TinyHaxeTry1Parser.varInit_return();
        retval.start = input.LT(1);
        int varInit_StartIndex = input.index();
        Object root_0 = null;

        Token EQ296=null;
        TinyHaxeTry1Parser.expr_return expr297 = null;


        Object EQ296_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:297:19: ( EQ expr -> ^( VAR_INIT expr ) )
            // C:\\antlr\\TinyHaxeTry1.g:297:21: EQ expr
            {
            EQ296=(Token)match(input,EQ,FOLLOW_EQ_in_varInit3875); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ296);

            pushFollow(FOLLOW_expr_in_varInit3877);
            expr297=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr297.getTree());


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
            // 297:29: -> ^( VAR_INIT expr )
            {
                // C:\\antlr\\TinyHaxeTry1.g:297:31: ^( VAR_INIT expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_INIT, "VAR_INIT"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 73, varInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varInit"

    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcDecl"
    // C:\\antlr\\TinyHaxeTry1.g:299:1: funcDecl : ( declAttrList FUNCTION NEW RPAREN paramList LPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) );
    public final TinyHaxeTry1Parser.funcDecl_return funcDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcDecl_return retval = new TinyHaxeTry1Parser.funcDecl_return();
        retval.start = input.LT(1);
        int funcDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION299=null;
        Token NEW300=null;
        Token RPAREN301=null;
        Token LPAREN303=null;
        Token FUNCTION307=null;
        Token IDENTIFIER308=null;
        Token LPAREN310=null;
        Token RPAREN312=null;
        Token FUNCTION315=null;
        Token NEW316=null;
        Token LPAREN317=null;
        Token RPAREN319=null;
        Token FUNCTION322=null;
        Token IDENTIFIER323=null;
        Token LPAREN325=null;
        Token RPAREN327=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList298 = null;

        TinyHaxeTry1Parser.paramList_return paramList302 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt304 = null;

        TinyHaxeTry1Parser.block_return block305 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList306 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt309 = null;

        TinyHaxeTry1Parser.paramList_return paramList311 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt313 = null;

        TinyHaxeTry1Parser.block_return block314 = null;

        TinyHaxeTry1Parser.paramList_return paramList318 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt320 = null;

        TinyHaxeTry1Parser.block_return block321 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt324 = null;

        TinyHaxeTry1Parser.paramList_return paramList326 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt328 = null;

        TinyHaxeTry1Parser.block_return block329 = null;


        Object FUNCTION299_tree=null;
        Object NEW300_tree=null;
        Object RPAREN301_tree=null;
        Object LPAREN303_tree=null;
        Object FUNCTION307_tree=null;
        Object IDENTIFIER308_tree=null;
        Object LPAREN310_tree=null;
        Object RPAREN312_tree=null;
        Object FUNCTION315_tree=null;
        Object NEW316_tree=null;
        Object LPAREN317_tree=null;
        Object RPAREN319_tree=null;
        Object FUNCTION322_tree=null;
        Object IDENTIFIER323_tree=null;
        Object LPAREN325_tree=null;
        Object RPAREN327_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:299:19: ( declAttrList FUNCTION NEW RPAREN paramList LPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) )
            int alt57=4;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:299:21: declAttrList FUNCTION NEW RPAREN paramList LPAREN typeTagOpt block
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcDecl3902);
                    declAttrList298=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList298.getTree());
                    FUNCTION299=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3904); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION299);

                    NEW300=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl3906); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW300);

                    RPAREN301=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN301);

                    pushFollow(FOLLOW_paramList_in_funcDecl3910);
                    paramList302=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList302.getTree());
                    LPAREN303=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN303);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3914);
                    typeTagOpt304=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt304.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3916);
                    block305=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block305.getTree());


                    // AST REWRITE
                    // elements: declAttrList, NEW, paramList, typeTagOpt, block, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 299:88: -> ^( FUNCTION NEW paramList typeTagOpt block declAttrList )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:299:91: ^( FUNCTION NEW paramList typeTagOpt block declAttrList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

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
                    // C:\\antlr\\TinyHaxeTry1.g:300:25: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcDecl3958);
                    declAttrList306=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList306.getTree());
                    FUNCTION307=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3960); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION307);

                    IDENTIFIER308=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl3962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER308);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl3964);
                    typeParamOpt309=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt309.getTree());
                    LPAREN310=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3966); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN310);

                    pushFollow(FOLLOW_paramList_in_funcDecl3968);
                    paramList311=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList311.getTree());
                    RPAREN312=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3970); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN312);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3972);
                    typeTagOpt313=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt313.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3974);
                    block314=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block314.getTree());


                    // AST REWRITE
                    // elements: IDENTIFIER, typeParamOpt, FUNCTION, block, typeTagOpt, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 300:112: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:300:114: ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

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
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:301:25: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    FUNCTION315=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION315);

                    NEW316=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl4017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW316);

                    LPAREN317=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN317);

                    pushFollow(FOLLOW_paramList_in_funcDecl4021);
                    paramList318=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList318.getTree());
                    RPAREN319=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN319);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4025);
                    typeTagOpt320=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt320.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4027);
                    block321=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block321.getTree());


                    // AST REWRITE
                    // elements: FUNCTION, paramList, NEW, typeTagOpt, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 301:79: -> ^( FUNCTION NEW paramList typeTagOpt block )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:301:81: ^( FUNCTION NEW paramList typeTagOpt block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

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
                    // C:\\antlr\\TinyHaxeTry1.g:302:25: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    FUNCTION322=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4066); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION322);

                    IDENTIFIER323=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl4068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER323);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl4070);
                    typeParamOpt324=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt324.getTree());
                    LPAREN325=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4072); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN325);

                    pushFollow(FOLLOW_paramList_in_funcDecl4074);
                    paramList326=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList326.getTree());
                    RPAREN327=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4076); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN327);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4078);
                    typeTagOpt328=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt328.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4080);
                    block329=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block329.getTree());


                    // AST REWRITE
                    // elements: block, IDENTIFIER, paramList, typeParamOpt, typeTagOpt, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 302:99: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:302:101: ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 74, funcDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcDecl"

    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcProtoDecl"
    // C:\\antlr\\TinyHaxeTry1.g:304:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );
    public final TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcProtoDecl_return retval = new TinyHaxeTry1Parser.funcProtoDecl_return();
        retval.start = input.LT(1);
        int funcProtoDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION331=null;
        Token NEW332=null;
        Token LPAREN333=null;
        Token RPAREN335=null;
        Token SEMI337=null;
        Token FUNCTION339=null;
        Token IDENTIFIER340=null;
        Token LPAREN342=null;
        Token RPAREN344=null;
        Token SEMI346=null;
        Token FUNCTION347=null;
        Token NEW348=null;
        Token LPAREN349=null;
        Token RPAREN351=null;
        Token SEMI353=null;
        Token FUNCTION354=null;
        Token IDENTIFIER355=null;
        Token LPAREN357=null;
        Token RPAREN359=null;
        Token SEMI361=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList330 = null;

        TinyHaxeTry1Parser.paramList_return paramList334 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt336 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList338 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt341 = null;

        TinyHaxeTry1Parser.paramList_return paramList343 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt345 = null;

        TinyHaxeTry1Parser.paramList_return paramList350 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt352 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt356 = null;

        TinyHaxeTry1Parser.paramList_return paramList358 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt360 = null;


        Object FUNCTION331_tree=null;
        Object NEW332_tree=null;
        Object LPAREN333_tree=null;
        Object RPAREN335_tree=null;
        Object SEMI337_tree=null;
        Object FUNCTION339_tree=null;
        Object IDENTIFIER340_tree=null;
        Object LPAREN342_tree=null;
        Object RPAREN344_tree=null;
        Object SEMI346_tree=null;
        Object FUNCTION347_tree=null;
        Object NEW348_tree=null;
        Object LPAREN349_tree=null;
        Object RPAREN351_tree=null;
        Object SEMI353_tree=null;
        Object FUNCTION354_tree=null;
        Object IDENTIFIER355_tree=null;
        Object LPAREN357_tree=null;
        Object RPAREN359_tree=null;
        Object SEMI361_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:304:19: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) )
            int alt58=4;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:304:21: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4108);
                    declAttrList330=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList330.getTree());
                    FUNCTION331=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4110); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION331);

                    NEW332=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4112); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW332);

                    LPAREN333=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN333);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4116);
                    paramList334=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList334.getTree());
                    RPAREN335=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN335);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4120);
                    typeTagOpt336=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt336.getTree());
                    SEMI337=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4122); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI337);



                    // AST REWRITE
                    // elements: paramList, NEW, declAttrList, typeTagOpt, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 304:87: -> ^( FUNCTION NEW paramList typeTagOpt declAttrList )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:304:90: ^( FUNCTION NEW paramList typeTagOpt declAttrList )
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
                    // C:\\antlr\\TinyHaxeTry1.g:305:25: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4162);
                    declAttrList338=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList338.getTree());
                    FUNCTION339=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4164); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION339);

                    IDENTIFIER340=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4166); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER340);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4168);
                    typeParamOpt341=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt341.getTree());
                    LPAREN342=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN342);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4172);
                    paramList343=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList343.getTree());
                    RPAREN344=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN344);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4176);
                    typeTagOpt345=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt345.getTree());
                    SEMI346=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4178); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI346);



                    // AST REWRITE
                    // elements: declAttrList, typeTagOpt, typeParamOpt, IDENTIFIER, FUNCTION, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 305:111: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:305:113: ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt )
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
                    // C:\\antlr\\TinyHaxeTry1.g:306:25: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION347=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION347);

                    NEW348=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW348);

                    LPAREN349=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4223); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN349);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4225);
                    paramList350=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList350.getTree());
                    RPAREN351=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN351);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4229);
                    typeTagOpt352=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt352.getTree());
                    SEMI353=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI353);



                    // AST REWRITE
                    // elements: paramList, NEW, FUNCTION, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 306:78: -> ^( FUNCTION NEW paramList typeTagOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:306:81: ^( FUNCTION NEW paramList typeTagOpt )
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
                    // C:\\antlr\\TinyHaxeTry1.g:307:25: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION354=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4269); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION354);

                    IDENTIFIER355=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4271); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER355);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4273);
                    typeParamOpt356=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt356.getTree());
                    LPAREN357=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN357);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4277);
                    paramList358=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList358.getTree());
                    RPAREN359=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN359);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4281);
                    typeTagOpt360=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt360.getTree());
                    SEMI361=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI361);



                    // AST REWRITE
                    // elements: typeParamOpt, typeTagOpt, FUNCTION, paramList, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 307:98: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:307:100: ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt )
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
            if ( state.backtracking>0 ) { memoize(input, 75, funcProtoDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"

    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDecl"
    // C:\\antlr\\TinyHaxeTry1.g:309:1: classDecl : CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBody RBRACE -> ^( CLASS IDENTIFIER typeParamOpt inheritListOpt classBody ) ;
    public final TinyHaxeTry1Parser.classDecl_return classDecl() throws RecognitionException {
        TinyHaxeTry1Parser.classDecl_return retval = new TinyHaxeTry1Parser.classDecl_return();
        retval.start = input.LT(1);
        int classDecl_StartIndex = input.index();
        Object root_0 = null;

        Token CLASS362=null;
        Token IDENTIFIER363=null;
        Token LBRACE366=null;
        Token RBRACE368=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt364 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt365 = null;

        TinyHaxeTry1Parser.classBody_return classBody367 = null;


        Object CLASS362_tree=null;
        Object IDENTIFIER363_tree=null;
        Object LBRACE366_tree=null;
        Object RBRACE368_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:309:19: ( CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBody RBRACE -> ^( CLASS IDENTIFIER typeParamOpt inheritListOpt classBody ) )
            // C:\\antlr\\TinyHaxeTry1.g:309:21: CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBody RBRACE
            {
            CLASS362=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4313); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS362);

            IDENTIFIER363=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4315); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER363);

            pushFollow(FOLLOW_typeParamOpt_in_classDecl4317);
            typeParamOpt364=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt364.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_classDecl4319);
            inheritListOpt365=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt365.getTree());
            LBRACE366=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classDecl4321); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE366);

            pushFollow(FOLLOW_classBody_in_classDecl4323);
            classBody367=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBody.add(classBody367.getTree());
            RBRACE368=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classDecl4325); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE368);



            // AST REWRITE
            // elements: classBody, IDENTIFIER, inheritListOpt, typeParamOpt, CLASS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 309:90: -> ^( CLASS IDENTIFIER typeParamOpt inheritListOpt classBody )
            {
                // C:\\antlr\\TinyHaxeTry1.g:309:92: ^( CLASS IDENTIFIER typeParamOpt inheritListOpt classBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CLASS.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                adaptor.addChild(root_1, stream_typeParamOpt.nextTree());
                adaptor.addChild(root_1, stream_inheritListOpt.nextTree());
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
            if ( state.backtracking>0 ) { memoize(input, 76, classDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classDecl"

    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // C:\\antlr\\TinyHaxeTry1.g:311:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:311:19: ( varDecl classBody | funcDecl classBody | pp classBody | )
            int alt59=4;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:311:21: varDecl classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_classBody4355);
                    varDecl369=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl369.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody4357);
                    classBody370=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody370.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:312:25: funcDecl classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcDecl_in_classBody4383);
                    funcDecl371=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl371.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody4385);
                    classBody372=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody372.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:313:25: pp classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_classBody4411);
                    pp373=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp373.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody4413);
                    classBody374=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody374.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:315:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 77, classBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classBody"

    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDecl"
    // C:\\antlr\\TinyHaxeTry1.g:316:1: interfaceDecl : INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:316:19: ( INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            // C:\\antlr\\TinyHaxeTry1.g:316:21: INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            INTERFACE375=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl4448); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE375_tree = (Object)adaptor.create(INTERFACE375);
            adaptor.addChild(root_0, INTERFACE375_tree);
            }
            pushFollow(FOLLOW_type_in_interfaceDecl4450);
            type376=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type376.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl4452);
            inheritListOpt377=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt377.getTree());
            LBRACE378=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl4454); if (state.failed) return retval;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl4457);
            interfaceBody379=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody379.getTree());
            RBRACE380=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl4459); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, interfaceDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceDecl"

    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceBody"
    // C:\\antlr\\TinyHaxeTry1.g:318:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:318:19: ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | )
            int alt60=4;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:318:21: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_interfaceBody4473);
                    varDecl381=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl381.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4475);
                    interfaceBody382=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody382.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:319:25: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody4501);
                    funcProtoDecl383=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl383.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4503);
                    interfaceBody384=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody384.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:320:25: pp interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_interfaceBody4529);
                    pp385=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp385.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4531);
                    interfaceBody386=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody386.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:322:1: 
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
            if ( state.backtracking>0 ) { memoize(input, 79, interfaceBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceBody"

    public static class inheritList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritList"
    // C:\\antlr\\TinyHaxeTry1.g:324:1: inheritList : inherit ( COMMA inherit )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:324:19: ( inherit ( COMMA inherit )* )
            // C:\\antlr\\TinyHaxeTry1.g:324:21: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inherit_in_inheritList4568);
            inherit387=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit387.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:324:29: ( COMMA inherit )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==COMMA) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:324:30: COMMA inherit
            	    {
            	    COMMA388=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList4571); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inherit_in_inheritList4574);
            	    inherit389=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit389.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
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
            if ( state.backtracking>0 ) { memoize(input, 80, inheritList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritList"

    public static class inheritListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritListOpt"
    // C:\\antlr\\TinyHaxeTry1.g:326:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT inheritList ) | -> ^( INHERIT_LIST_OPT ) );
    public final TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.inheritListOpt_return retval = new TinyHaxeTry1Parser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.inheritList_return inheritList390 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:326:19: ( inheritList -> ^( INHERIT_LIST_OPT inheritList ) | -> ^( INHERIT_LIST_OPT ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=EXTENDS && LA62_0<=IMPLEMENTS)) ) {
                alt62=1;
            }
            else if ( (LA62_0==LBRACE) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:326:21: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt4588);
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
                    // 326:33: -> ^( INHERIT_LIST_OPT inheritList )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:326:35: ^( INHERIT_LIST_OPT inheritList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INHERIT_LIST_OPT, "INHERIT_LIST_OPT"), root_1);

                        adaptor.addChild(root_1, stream_inheritList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:327:4: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 327:4: -> ^( INHERIT_LIST_OPT )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:327:6: ^( INHERIT_LIST_OPT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INHERIT_LIST_OPT, "INHERIT_LIST_OPT"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 81, inheritListOpt_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inheritListOpt"

    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inherit"
    // C:\\antlr\\TinyHaxeTry1.g:329:1: inherit : ( EXTENDS type | IMPLEMENTS type );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:329:19: ( EXTENDS type | IMPLEMENTS type )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==EXTENDS) ) {
                alt63=1;
            }
            else if ( (LA63_0==IMPLEMENTS) ) {
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
                    // C:\\antlr\\TinyHaxeTry1.g:329:21: EXTENDS type
                    {
                    root_0 = (Object)adaptor.nil();

                    EXTENDS391=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit4626); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS391_tree = (Object)adaptor.create(EXTENDS391);
                    adaptor.addChild(root_0, EXTENDS391_tree);
                    }
                    pushFollow(FOLLOW_type_in_inherit4628);
                    type392=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type392.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:330:25: IMPLEMENTS type
                    {
                    root_0 = (Object)adaptor.nil();

                    IMPLEMENTS393=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit4654); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPLEMENTS393_tree = (Object)adaptor.create(IMPLEMENTS393);
                    adaptor.addChild(root_0, IMPLEMENTS393_tree);
                    }
                    pushFollow(FOLLOW_type_in_inherit4656);
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
            if ( state.backtracking>0 ) { memoize(input, 82, inherit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "inherit"

    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedefDecl"
    // C:\\antlr\\TinyHaxeTry1.g:332:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:332:19: ( TYPEDEF IDENTIFIER EQ funcType )
            // C:\\antlr\\TinyHaxeTry1.g:332:21: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            TYPEDEF395=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl4671); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF395_tree = (Object)adaptor.create(TYPEDEF395);
            adaptor.addChild(root_0, TYPEDEF395_tree);
            }
            IDENTIFIER396=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl4673); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER396_tree = (Object)adaptor.create(IDENTIFIER396);
            adaptor.addChild(root_0, IDENTIFIER396_tree);
            }
            EQ397=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl4675); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ397_tree = (Object)adaptor.create(EQ397);
            adaptor.addChild(root_0, EQ397_tree);
            }
            pushFollow(FOLLOW_funcType_in_typedefDecl4677);
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
            if ( state.backtracking>0 ) { memoize(input, 83, typedefDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typedefDecl"

    public static class typeExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeExtend"
    // C:\\antlr\\TinyHaxeTry1.g:334:1: typeExtend : GT funcType COMMA ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:334:19: ( GT funcType COMMA )
            // C:\\antlr\\TinyHaxeTry1.g:334:21: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            GT399=(Token)match(input,GT,FOLLOW_GT_in_typeExtend4693); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT399_tree = (Object)adaptor.create(GT399);
            adaptor.addChild(root_0, GT399_tree);
            }
            pushFollow(FOLLOW_funcType_in_typeExtend4695);
            funcType400=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType400.getTree());
            COMMA401=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend4697); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, typeExtend_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeExtend"

    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonType"
    // C:\\antlr\\TinyHaxeTry1.g:336:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:336:19: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            // C:\\antlr\\TinyHaxeTry1.g:336:21: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            LBRACE402=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType4716); if (state.failed) return retval;
            // C:\\antlr\\TinyHaxeTry1.g:337:4: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt65=1;
                }
                break;
            case IDENTIFIER:
                {
                alt65=2;
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
                alt65=3;
                }
                break;
            case GT:
                {
                alt65=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:338:22: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:338:27: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType4751);
                    anonTypeFieldList403=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList403.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:339:26: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType4779);
                    varDeclList404=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList404.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:340:27: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType4808);
                    typeExtend405=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend405.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:340:38: ( | anonTypeFieldList | varDeclList )
                    int alt64=3;
                    switch ( input.LA(1) ) {
                    case RBRACE:
                        {
                        alt64=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt64=2;
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
                        alt64=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }

                    switch (alt64) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:341:24: 
                            {
                            }
                            break;
                        case 2 :
                            // C:\\antlr\\TinyHaxeTry1.g:341:25: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType4836);
                            anonTypeFieldList406=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList406.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\antlr\\TinyHaxeTry1.g:342:25: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType4862);
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

            RBRACE408=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType4910); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, anonType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonType"

    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeFieldList"
    // C:\\antlr\\TinyHaxeTry1.g:346:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:346:19: ( anonTypeField ( COMMA anonTypeField )* )
            // C:\\antlr\\TinyHaxeTry1.g:346:21: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4920);
            anonTypeField409=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField409.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:346:35: ( COMMA anonTypeField )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==COMMA) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:346:36: COMMA anonTypeField
            	    {
            	    COMMA410=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList4923); if (state.failed) return retval;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4926);
            	    anonTypeField411=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField411.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
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
            if ( state.backtracking>0 ) { memoize(input, 86, anonTypeFieldList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonTypeFieldList"

    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLit"
    // C:\\antlr\\TinyHaxeTry1.g:349:1: objLit : '{' objLitElemList '}' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:349:19: ( '{' objLitElemList '}' )
            // C:\\antlr\\TinyHaxeTry1.g:349:21: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal412=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit4949); if (state.failed) return retval;
            pushFollow(FOLLOW_objLitElemList_in_objLit4952);
            objLitElemList413=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList413.getTree());
            char_literal414=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit4954); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, objLit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLit"

    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeField"
    // C:\\antlr\\TinyHaxeTry1.g:351:1: anonTypeField : IDENTIFIER COLON funcType ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:351:19: ( IDENTIFIER COLON funcType )
            // C:\\antlr\\TinyHaxeTry1.g:351:20: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER415=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField4966); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER415_tree = (Object)adaptor.create(IDENTIFIER415);
            adaptor.addChild(root_0, IDENTIFIER415_tree);
            }
            COLON416=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField4968); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_anonTypeField4971);
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
            if ( state.backtracking>0 ) { memoize(input, 88, anonTypeField_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "anonTypeField"

    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElemList"
    // C:\\antlr\\TinyHaxeTry1.g:353:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:353:19: ( objLitElem ( COMMA objLitElem )* )
            // C:\\antlr\\TinyHaxeTry1.g:353:21: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_objLitElem_in_objLitElemList4983);
            objLitElem418=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem418.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:353:32: ( COMMA objLitElem )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==COMMA) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:353:33: COMMA objLitElem
            	    {
            	    COMMA419=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList4986); if (state.failed) return retval;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList4989);
            	    objLitElem420=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem420.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
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
            if ( state.backtracking>0 ) { memoize(input, 89, objLitElemList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLitElemList"

    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElem"
    // C:\\antlr\\TinyHaxeTry1.g:355:1: objLitElem : IDENTIFIER COLON expr ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:355:19: ( IDENTIFIER COLON expr )
            // C:\\antlr\\TinyHaxeTry1.g:355:20: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER421=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem5006); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER421_tree = (Object)adaptor.create(IDENTIFIER421);
            adaptor.addChild(root_0, IDENTIFIER421_tree);
            }
            COLON422=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem5008); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_objLitElem5011);
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
            if ( state.backtracking>0 ) { memoize(input, 90, objLitElem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "objLitElem"

    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementarySymbol"
    // C:\\antlr\\TinyHaxeTry1.g:358:1: elementarySymbol : ( LONGLITERAL | INTLITERAL | STRINGLITERAL | CHARLITERAL | FLOATNUM );
    public final TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        TinyHaxeTry1Parser.elementarySymbol_return retval = new TinyHaxeTry1Parser.elementarySymbol_return();
        retval.start = input.LT(1);
        int elementarySymbol_StartIndex = input.index();
        Object root_0 = null;

        Token set424=null;

        Object set424_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:359:2: ( LONGLITERAL | INTLITERAL | STRINGLITERAL | CHARLITERAL | FLOATNUM )
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
            if ( state.backtracking>0 ) { memoize(input, 91, elementarySymbol_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred41_TinyHaxeTry1
    public final void synpred41_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:139:9: ( block )
        // C:\\antlr\\TinyHaxeTry1.g:139:9: block
        {
        pushFollow(FOLLOW_block_in_synpred41_TinyHaxeTry11709);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_TinyHaxeTry1

    // $ANTLR start synpred42_TinyHaxeTry1
    public final void synpred42_TinyHaxeTry1_fragment() throws RecognitionException {   
        TinyHaxeTry1Parser.statement_return st2 = null;


        // C:\\antlr\\TinyHaxeTry1.g:140:41: ( ELSE st2= statement )
        // C:\\antlr\\TinyHaxeTry1.g:140:41: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred42_TinyHaxeTry11728); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred42_TinyHaxeTry11732);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_TinyHaxeTry1

    // $ANTLR start synpred49_TinyHaxeTry1
    public final void synpred49_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:147:17: ( expr )
        // C:\\antlr\\TinyHaxeTry1.g:147:17: expr
        {
        pushFollow(FOLLOW_expr_in_synpred49_TinyHaxeTry11860);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_TinyHaxeTry1

    // $ANTLR start synpred56_TinyHaxeTry1
    public final void synpred56_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:151:9: ( expr SEMI )
        // C:\\antlr\\TinyHaxeTry1.g:151:9: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred56_TinyHaxeTry11957);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred56_TinyHaxeTry11960); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_TinyHaxeTry1

    // $ANTLR start synpred57_TinyHaxeTry1
    public final void synpred57_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:152:9: ( IDENTIFIER COLON statement )
        // C:\\antlr\\TinyHaxeTry1.g:152:9: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred57_TinyHaxeTry11972); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred57_TinyHaxeTry11974); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred57_TinyHaxeTry11976);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_TinyHaxeTry1

    // $ANTLR start synpred62_TinyHaxeTry1
    public final void synpred62_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:191:21: ( exprList )
        // C:\\antlr\\TinyHaxeTry1.g:191:21: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred62_TinyHaxeTry12388);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_TinyHaxeTry1

    // $ANTLR start synpred90_TinyHaxeTry1
    public final void synpred90_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:219:21: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr )
        // C:\\antlr\\TinyHaxeTry1.g:219:21: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
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

        pushFollow(FOLLOW_prefixExpr_in_synpred90_TinyHaxeTry12845);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred90_TinyHaxeTry1

    // $ANTLR start synpred93_TinyHaxeTry1
    public final void synpred93_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:235:4: ( value LPAREN exprListOpt RPAREN )
        // C:\\antlr\\TinyHaxeTry1.g:235:4: value LPAREN exprListOpt RPAREN
        {
        pushFollow(FOLLOW_value_in_synpred93_TinyHaxeTry12944);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred93_TinyHaxeTry12946); if (state.failed) return ;
        pushFollow(FOLLOW_exprListOpt_in_synpred93_TinyHaxeTry12948);
        exprListOpt();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred93_TinyHaxeTry12950); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred93_TinyHaxeTry1

    // $ANTLR start synpred94_TinyHaxeTry1
    public final void synpred94_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:236:4: ( value DOT IDENTIFIER )
        // C:\\antlr\\TinyHaxeTry1.g:236:4: value DOT IDENTIFIER
        {
        pushFollow(FOLLOW_value_in_synpred94_TinyHaxeTry12965);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,DOT,FOLLOW_DOT_in_synpred94_TinyHaxeTry12967); if (state.failed) return ;
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred94_TinyHaxeTry12969); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_TinyHaxeTry1

    // $ANTLR start synpred95_TinyHaxeTry1
    public final void synpred95_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:237:4: ( value LBRACKET expr RBRACKET )
        // C:\\antlr\\TinyHaxeTry1.g:237:4: value LBRACKET expr RBRACKET
        {
        pushFollow(FOLLOW_value_in_synpred95_TinyHaxeTry12975);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred95_TinyHaxeTry12977); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred95_TinyHaxeTry12979);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred95_TinyHaxeTry12981); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred95_TinyHaxeTry1

    // $ANTLR start synpred96_TinyHaxeTry1
    public final void synpred96_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:238:4: ( value PLUSPLUS )
        // C:\\antlr\\TinyHaxeTry1.g:238:4: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred96_TinyHaxeTry12986);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred96_TinyHaxeTry12988); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_TinyHaxeTry1

    // $ANTLR start synpred97_TinyHaxeTry1
    public final void synpred97_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:239:4: ( value SUBSUB )
        // C:\\antlr\\TinyHaxeTry1.g:239:4: value SUBSUB
        {
        pushFollow(FOLLOW_value_in_synpred97_TinyHaxeTry12994);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred97_TinyHaxeTry12996); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_TinyHaxeTry1

    // $ANTLR start synpred99_TinyHaxeTry1
    public final void synpred99_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:245:25: ( arrayLit )
        // C:\\antlr\\TinyHaxeTry1.g:245:25: arrayLit
        {
        pushFollow(FOLLOW_arrayLit_in_synpred99_TinyHaxeTry13039);
        arrayLit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_TinyHaxeTry1

    // $ANTLR start synpred104_TinyHaxeTry1
    public final void synpred104_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:250:34: ( expr )
        // C:\\antlr\\TinyHaxeTry1.g:250:34: expr
        {
        pushFollow(FOLLOW_expr_in_synpred104_TinyHaxeTry13173);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_TinyHaxeTry1

    // $ANTLR start synpred105_TinyHaxeTry1
    public final void synpred105_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:250:25: ( LPAREN ( expr | statement ) RPAREN )
        // C:\\antlr\\TinyHaxeTry1.g:250:25: LPAREN ( expr | statement ) RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred105_TinyHaxeTry13169); if (state.failed) return ;
        // C:\\antlr\\TinyHaxeTry1.g:250:33: ( expr | statement )
        int alt74=2;
        alt74 = dfa74.predict(input);
        switch (alt74) {
            case 1 :
                // C:\\antlr\\TinyHaxeTry1.g:250:34: expr
                {
                pushFollow(FOLLOW_expr_in_synpred105_TinyHaxeTry13173);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\antlr\\TinyHaxeTry1.g:250:39: statement
                {
                pushFollow(FOLLOW_statement_in_synpred105_TinyHaxeTry13175);
                statement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred105_TinyHaxeTry13178); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_TinyHaxeTry1

    // $ANTLR start synpred107_TinyHaxeTry1
    public final void synpred107_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:256:21: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // C:\\antlr\\TinyHaxeTry1.g:256:21: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred107_TinyHaxeTry13275); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred107_TinyHaxeTry13277); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred107_TinyHaxeTry13279);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // C:\\antlr\\TinyHaxeTry1.g:256:38: ( COMMA funcType )?
        int alt75=2;
        int LA75_0 = input.LA(1);

        if ( (LA75_0==COMMA) ) {
            alt75=1;
        }
        switch (alt75) {
            case 1 :
                // C:\\antlr\\TinyHaxeTry1.g:256:39: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred107_TinyHaxeTry13282); if (state.failed) return ;
                pushFollow(FOLLOW_funcType_in_synpred107_TinyHaxeTry13284);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred107_TinyHaxeTry13288); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred107_TinyHaxeTry1

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
    public final boolean synpred93_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_TinyHaxeTry1_fragment(); // can never throw exception
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


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA74 dfa74 = new DFA74(this);
    static final String DFA26_eotS =
        "\62\uffff";
    static final String DFA26_eofS =
        "\62\uffff";
    static final String DFA26_minS =
        "\1\24\1\0\20\uffff\1\0\33\uffff\1\0\3\uffff";
    static final String DFA26_maxS =
        "\1\u00a0\1\0\20\uffff\1\0\33\uffff\1\0\3\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\42\uffff"+
        "\1\1\1\15\1\16";
    static final String DFA26_specialS =
        "\1\uffff\1\0\20\uffff\1\1\33\uffff\1\2\3\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\56\1\22\1\14\10\uffff\3\14\1\uffff\1\14\2\uffff\1\14\6\uffff"+
            "\2\14\1\2\1\uffff\1\4\1\5\1\10\1\11\1\12\1\13\1\1\1\uffff\1"+
            "\3\3\uffff\1\7\1\6\1\uffff\30\14\2\uffff\1\14\5\uffff\5\14\40"+
            "\uffff\10\14\21\uffff\3\14",
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
            "\1\uffff",
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
            return "138:1: statement : ( block | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | forStmt | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO statement WHILE parExpression ) | tryStmt | switchStmt | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI );";
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

                        else if ( (synpred56_TinyHaxeTry1()) ) {s = 12;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_18 = input.LA(1);

                         
                        int index26_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_TinyHaxeTry1()) ) {s = 12;}

                        else if ( (synpred57_TinyHaxeTry1()) ) {s = 48;}

                         
                        input.seek(index26_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_46 = input.LA(1);

                         
                        int index26_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_TinyHaxeTry1()) ) {s = 12;}

                        else if ( (true) ) {s = 49;}

                         
                        input.seek(index26_46);
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
    static final String DFA45_eotS =
        "\53\uffff";
    static final String DFA45_eofS =
        "\1\13\52\uffff";
    static final String DFA45_minS =
        "\1\24\7\0\43\uffff";
    static final String DFA45_maxS =
        "\1\u00a0\7\0\43\uffff";
    static final String DFA45_acceptS =
        "\10\uffff\1\2\1\4\1\5\1\6\35\uffff\1\1\1\3";
    static final String DFA45_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\43\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\13\1\5\1\10\7\uffff\2\13\1\1\1\7\1\13\1\2\1\13\6\uffff\1"+
            "\13\1\uffff\2\13\10\uffff\1\3\1\13\1\uffff\1\13\5\uffff\22\13"+
            "\1\12\1\11\1\uffff\1\4\4\uffff\1\13\5\uffff\5\6\40\uffff\10"+
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

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "234:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR value exprListOpt ) | value DOT IDENTIFIER | value LBRACKET expr RBRACKET | value PLUSPLUS | value SUBSUB | value );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_1 = input.LA(1);

                         
                        int index45_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred94_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_2 = input.LA(1);

                         
                        int index45_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred94_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index45_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_3 = input.LA(1);

                         
                        int index45_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred94_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index45_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA45_4 = input.LA(1);

                         
                        int index45_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred94_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index45_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA45_5 = input.LA(1);

                         
                        int index45_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred94_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index45_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA45_6 = input.LA(1);

                         
                        int index45_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred94_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index45_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA45_7 = input.LA(1);

                         
                        int index45_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (synpred94_TinyHaxeTry1()) ) {s = 8;}

                        else if ( (synpred95_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (synpred96_TinyHaxeTry1()) ) {s = 9;}

                        else if ( (synpred97_TinyHaxeTry1()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index45_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\53\uffff";
    static final String DFA47_eofS =
        "\1\10\52\uffff";
    static final String DFA47_minS =
        "\1\24\1\uffff\1\0\4\uffff\1\0\43\uffff";
    static final String DFA47_maxS =
        "\1\u00a0\1\uffff\1\0\4\uffff\1\0\43\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\40\uffff\1\2"+
        "\1\7";
    static final String DFA47_specialS =
        "\2\uffff\1\0\4\uffff\1\1\43\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\10\1\5\1\10\7\uffff\2\10\1\1\1\7\1\10\1\2\1\10\6\uffff\1"+
            "\10\1\uffff\2\10\10\uffff\1\3\1\10\1\uffff\1\10\5\uffff\24\10"+
            "\1\uffff\1\4\4\uffff\1\10\5\uffff\5\6\40\uffff\10\10\21\uffff"+
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
            return "244:1: value : ( funcLit | arrayLit | objLit | NULL | IDENTIFIER | elementarySymbol | LPAREN ( expr | statement ) RPAREN | );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_2 = input.LA(1);

                         
                        int index47_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_TinyHaxeTry1()) ) {s = 41;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index47_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_7 = input.LA(1);

                         
                        int index47_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred105_TinyHaxeTry1()) ) {s = 42;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index47_7);
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
    static final String DFA46_eotS =
        "\60\uffff";
    static final String DFA46_eofS =
        "\60\uffff";
    static final String DFA46_minS =
        "\1\24\43\0\14\uffff";
    static final String DFA46_maxS =
        "\1\u00a0\43\0\14\uffff";
    static final String DFA46_acceptS =
        "\44\uffff\1\1\1\2\12\uffff";
    static final String DFA46_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\14\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\45\1\10\1\13\10\uffff\1\41\1\4\1\12\1\44\1\5\2\uffff\1\22"+
            "\6\uffff\1\35\1\36\1\45\1\uffff\6\45\1\6\1\uffff\1\45\3\uffff"+
            "\2\45\1\uffff\1\42\1\40\1\37\1\31\1\32\1\33\1\34\1\26\1\27\1"+
            "\30\1\23\1\24\1\25\1\21\1\15\1\16\1\17\1\20\1\14\1\1\1\22\1"+
            "\7\1\2\1\3\2\uffff\1\43\5\uffff\5\11\40\uffff\10\43\21\uffff"+
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
            return "250:33: ( expr | statement )";
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
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_2 = input.LA(1);

                         
                        int index46_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_3 = input.LA(1);

                         
                        int index46_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA46_4 = input.LA(1);

                         
                        int index46_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA46_5 = input.LA(1);

                         
                        int index46_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA46_6 = input.LA(1);

                         
                        int index46_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA46_7 = input.LA(1);

                         
                        int index46_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA46_8 = input.LA(1);

                         
                        int index46_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA46_9 = input.LA(1);

                         
                        int index46_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA46_10 = input.LA(1);

                         
                        int index46_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA46_11 = input.LA(1);

                         
                        int index46_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA46_12 = input.LA(1);

                         
                        int index46_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA46_13 = input.LA(1);

                         
                        int index46_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA46_14 = input.LA(1);

                         
                        int index46_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA46_15 = input.LA(1);

                         
                        int index46_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA46_16 = input.LA(1);

                         
                        int index46_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA46_17 = input.LA(1);

                         
                        int index46_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA46_18 = input.LA(1);

                         
                        int index46_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA46_19 = input.LA(1);

                         
                        int index46_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA46_20 = input.LA(1);

                         
                        int index46_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA46_21 = input.LA(1);

                         
                        int index46_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA46_22 = input.LA(1);

                         
                        int index46_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA46_23 = input.LA(1);

                         
                        int index46_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA46_24 = input.LA(1);

                         
                        int index46_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA46_25 = input.LA(1);

                         
                        int index46_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA46_26 = input.LA(1);

                         
                        int index46_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA46_27 = input.LA(1);

                         
                        int index46_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA46_28 = input.LA(1);

                         
                        int index46_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA46_29 = input.LA(1);

                         
                        int index46_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA46_30 = input.LA(1);

                         
                        int index46_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA46_31 = input.LA(1);

                         
                        int index46_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA46_32 = input.LA(1);

                         
                        int index46_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA46_33 = input.LA(1);

                         
                        int index46_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA46_34 = input.LA(1);

                         
                        int index46_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA46_35 = input.LA(1);

                         
                        int index46_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index46_35);
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
    static final String DFA57_eotS =
        "\14\uffff";
    static final String DFA57_eofS =
        "\14\uffff";
    static final String DFA57_minS =
        "\6\30\2\25\4\uffff";
    static final String DFA57_maxS =
        "\6\40\2\126\4\uffff";
    static final String DFA57_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA57_specialS =
        "\14\uffff}>";
    static final String[] DFA57_transitionS = {
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

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

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
        public String getDescription() {
            return "299:1: funcDecl : ( declAttrList FUNCTION NEW RPAREN paramList LPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) );";
        }
    }
    static final String DFA58_eotS =
        "\14\uffff";
    static final String DFA58_eofS =
        "\14\uffff";
    static final String DFA58_minS =
        "\6\30\2\25\4\uffff";
    static final String DFA58_maxS =
        "\6\40\2\126\4\uffff";
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
            return "304:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );";
        }
    }
    static final String DFA59_eotS =
        "\12\uffff";
    static final String DFA59_eofS =
        "\1\11\11\uffff";
    static final String DFA59_minS =
        "\6\30\4\uffff";
    static final String DFA59_maxS =
        "\6\131\4\uffff";
    static final String DFA59_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA59_specialS =
        "\12\uffff}>";
    static final String[] DFA59_transitionS = {
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
            return "311:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );";
        }
    }
    static final String DFA60_eotS =
        "\12\uffff";
    static final String DFA60_eofS =
        "\1\11\11\uffff";
    static final String DFA60_minS =
        "\6\30\4\uffff";
    static final String DFA60_maxS =
        "\6\131\4\uffff";
    static final String DFA60_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA60_specialS =
        "\12\uffff}>";
    static final String[] DFA60_transitionS = {
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

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "318:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );";
        }
    }
    static final String DFA74_eotS =
        "\60\uffff";
    static final String DFA74_eofS =
        "\60\uffff";
    static final String DFA74_minS =
        "\1\24\43\0\14\uffff";
    static final String DFA74_maxS =
        "\1\u00a0\43\0\14\uffff";
    static final String DFA74_acceptS =
        "\44\uffff\1\1\1\2\12\uffff";
    static final String DFA74_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\14\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\45\1\10\1\13\10\uffff\1\41\1\4\1\12\1\44\1\5\2\uffff\1\22"+
            "\6\uffff\1\35\1\36\1\45\1\uffff\6\45\1\6\1\uffff\1\45\3\uffff"+
            "\2\45\1\uffff\1\42\1\40\1\37\1\31\1\32\1\33\1\34\1\26\1\27\1"+
            "\30\1\23\1\24\1\25\1\21\1\15\1\16\1\17\1\20\1\14\1\1\1\22\1"+
            "\7\1\2\1\3\2\uffff\1\43\5\uffff\5\11\40\uffff\10\43\21\uffff"+
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

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

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
        public String getDescription() {
            return "250:33: ( expr | statement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_3 = input.LA(1);

                         
                        int index74_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA74_4 = input.LA(1);

                         
                        int index74_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA74_5 = input.LA(1);

                         
                        int index74_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA74_6 = input.LA(1);

                         
                        int index74_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA74_7 = input.LA(1);

                         
                        int index74_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA74_8 = input.LA(1);

                         
                        int index74_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA74_9 = input.LA(1);

                         
                        int index74_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA74_10 = input.LA(1);

                         
                        int index74_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA74_11 = input.LA(1);

                         
                        int index74_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA74_12 = input.LA(1);

                         
                        int index74_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA74_13 = input.LA(1);

                         
                        int index74_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA74_14 = input.LA(1);

                         
                        int index74_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA74_15 = input.LA(1);

                         
                        int index74_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA74_16 = input.LA(1);

                         
                        int index74_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA74_17 = input.LA(1);

                         
                        int index74_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA74_18 = input.LA(1);

                         
                        int index74_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA74_19 = input.LA(1);

                         
                        int index74_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA74_20 = input.LA(1);

                         
                        int index74_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA74_21 = input.LA(1);

                         
                        int index74_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA74_22 = input.LA(1);

                         
                        int index74_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA74_23 = input.LA(1);

                         
                        int index74_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA74_24 = input.LA(1);

                         
                        int index74_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA74_25 = input.LA(1);

                         
                        int index74_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA74_26 = input.LA(1);

                         
                        int index74_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA74_27 = input.LA(1);

                         
                        int index74_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA74_28 = input.LA(1);

                         
                        int index74_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA74_29 = input.LA(1);

                         
                        int index74_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA74_30 = input.LA(1);

                         
                        int index74_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA74_31 = input.LA(1);

                         
                        int index74_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA74_32 = input.LA(1);

                         
                        int index74_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA74_33 = input.LA(1);

                         
                        int index74_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA74_34 = input.LA(1);

                         
                        int index74_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA74_35 = input.LA(1);

                         
                        int index74_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_TinyHaxeTry1()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index74_35);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module125 = new BitSet(new long[]{0x000007A000800000L,0x0000000099000000L});
    public static final BitSet FOLLOW_topLevelList_in_module127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelList_in_module162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList178 = new BitSet(new long[]{0x000007A000800002L,0x0000000099000000L});
    public static final BitSet FOLLOW_myImport_in_topLevel197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_topLevel223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage268 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage270 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_myPackage272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier303 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier319 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier323 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_IMPORT_in_myImport365 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport368 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_myImport370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_access0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_declAttr457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList575 = new BitSet(new long[]{0x000000003F000002L});
    public static final BitSet FOLLOW_param_in_paramList612 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList615 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_param_in_paramList617 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_QUES_in_param656 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param659 = new BitSet(new long[]{0x0000080000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param661 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_varInitOpt_in_param663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dotIdent695 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_DOT_in_dotIdent703 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dotIdent707 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit1043 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit1045 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcLit1047 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit1049 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit1051 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_block_in_funcLit1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit1082 = new BitSet(new long[]{0x0080005B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit1085 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppIf_in_pp1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElseIf_in_pp1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElse_in_pp1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppEnd_in_pp1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppError_in_pp1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_IF_in_ppIf1241 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_IF_in_ppIf1269 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_BANG_in_ppIf1271 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1291 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1318 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_BANG_in_ppElseIf1320 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSE_in_ppElse1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_END_in_ppEnd1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ERROR_in_ppError1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1405 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_typeTag1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1478 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1481 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_typeList1484 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1512 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1515 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1518 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_type_in_funcType1561 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1565 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_type_in_funcType1568 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_anonType_in_type1593 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_dotIdent_in_type1597 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_typeParam_in_type1601 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_GT_in_typeParam1620 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1623 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1672 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1674 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1676 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1678 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1719 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1721 = new BitSet(new long[]{0x62FE884B00700000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_statement_in_statement1725 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1728 = new BitSet(new long[]{0x62FE884B00700000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_statement_in_statement1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStmt_in_statement1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1783 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1785 = new BitSet(new long[]{0x62FE884B00700000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_statement_in_statement1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1807 = new BitSet(new long[]{0x62FE884B00700000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_statement_in_statement1809 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1811 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1813 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_statement1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStmt_in_statement1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStmt_in_statement1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1857 = new BitSet(new long[]{0x0080004B00700000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_statement1860 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_statement1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1883 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_statement1885 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_statement1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1905 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1908 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_statement1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1931 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1934 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_statement1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement1957 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_statement1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1972 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_statement1974 = new BitSet(new long[]{0x62FE884B00700000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_statement_in_statement1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2021 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_parExpression2024 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2048 = new BitSet(new long[]{0x63FE884B3F700000L,0x0000001F0AFC4000L});
    public static final BitSet FOLLOW_blockStmt_in_block2051 = new BitSet(new long[]{0x63FE884B3F700000L,0x0000001F0AFC4000L});
    public static final BitSet FOLLOW_RBRACE_in_block2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStmt2118 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_forStmt2120 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_forStmt2124 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_IN_in_forStmt2126 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_forStmt2130 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_forStmt2132 = new BitSet(new long[]{0x62FE884B00700000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_statement_in_forStmt2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt2171 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt2188 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2209 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2211 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt2229 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStmt2248 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_switchStmt2250 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_switchStmt2252 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_switchStmt2254 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_block_in_switchStmt2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStmt2285 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_block_in_tryStmt2287 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_catchStmtList_in_tryStmt2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList2312 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2353 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2355 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_param_in_catchStmt2357 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2359 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_block_in_catchStmt2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2428 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2431 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_exprList2434 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2474 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L,0x00000001C0001FE0L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2477 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2480 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L,0x00000001C0001FE0L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2501 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2504 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2507 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2530 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2533 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2536 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2538 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2541 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2559 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2563 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2566 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2583 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2587 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2590 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2612 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2616 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2619 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2623 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2626 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2630 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2633 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2637 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2640 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2644 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2648 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2652 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2656 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2678 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2682 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2685 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2689 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2692 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2695 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2698 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2718 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2722 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2726 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr2730 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2734 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2738 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2741 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2764 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2769 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_SUB_in_addExpr2774 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2778 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2800 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_STAR_in_multExpr2805 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2808 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2811 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2815 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_set_in_prefixExpr2833 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2944 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_suffixExpr2946 = new BitSet(new long[]{0x0080004F00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2948 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_suffixExpr2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2965 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOT_in_suffixExpr2967 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_suffixExpr2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2975 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2977 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_suffixExpr2979 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_suffixExpr2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_value3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value3169 = new BitSet(new long[]{0x62FE884B00700000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_value3173 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_statement_in_value3175 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_value3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr3236 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_type_in_newExpr3238 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr3240 = new BitSet(new long[]{0x0080004F00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr3242 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3275 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3277 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_cast3279 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_COMMA_in_cast3282 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_cast3284 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3304 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3306 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_cast3308 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl3429 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl3431 = new BitSet(new long[]{0x0080200000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3433 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumDecl3435 = new BitSet(new long[]{0x000007A000200000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl3437 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumDecl3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody3470 = new BitSet(new long[]{0x000007A000200002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3484 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3486 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl3489 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3491 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3520 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_enumValueDecl3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList3564 = new BitSet(new long[]{0x000000003F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl3588 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_VAR_in_varDecl3592 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3594 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3620 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList3623 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3626 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3642 = new BitSet(new long[]{0x0000080200000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3644 = new BitSet(new long[]{0x0000080000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3646 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_varInitOpt_in_varDeclPart3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl3666 = new BitSet(new long[]{0x1000000010200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3670 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl3672 = new BitSet(new long[]{0x1000000010200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3676 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_varInitOpt3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit3875 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_varInit3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3902 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl3906 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3908 = new BitSet(new long[]{0x0000000280200000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3910 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3912 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3914 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_block_in_funcDecl3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3958 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3960 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3962 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3964 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3966 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3968 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3970 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3972 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_block_in_funcDecl3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl4017 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4019 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4021 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4023 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4025 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_block_in_funcDecl4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4066 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl4068 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl4070 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4072 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4074 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4076 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4078 = new BitSet(new long[]{0x0080080000000000L});
    public static final BitSet FOLLOW_block_in_funcDecl4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4108 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4112 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4114 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4116 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4118 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4120 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4162 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4164 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4166 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4168 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4170 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4172 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4174 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4176 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4221 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4223 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4225 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4227 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4229 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4269 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4271 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4273 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4275 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4277 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4279 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4281 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4313 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4315 = new BitSet(new long[]{0x0080200000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4317 = new BitSet(new long[]{0x0080000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4319 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_classDecl4321 = new BitSet(new long[]{0x010007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_classBody_in_classDecl4323 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_classDecl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classBody4355 = new BitSet(new long[]{0x000007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_classBody_in_classBody4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classBody4383 = new BitSet(new long[]{0x000007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_classBody_in_classBody4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_classBody4411 = new BitSet(new long[]{0x000007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_classBody_in_classBody4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl4448 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl4450 = new BitSet(new long[]{0x0080000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl4452 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl4454 = new BitSet(new long[]{0x010007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl4457 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody4473 = new BitSet(new long[]{0x000007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody4501 = new BitSet(new long[]{0x000007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_interfaceBody4529 = new BitSet(new long[]{0x000007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList4568 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList4571 = new BitSet(new long[]{0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList4574 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit4626 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_type_in_inherit4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit4654 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_type_in_inherit4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl4671 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl4673 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl4675 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend4693 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend4695 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType4716 = new BitSet(new long[]{0x010020003F200000L,0x0000000002000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4751 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4779 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType4808 = new BitSet(new long[]{0x010000003F200000L,0x0000000002000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4836 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4862 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4920 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList4923 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4926 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit4949 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit4952 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField4966 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField4968 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4983 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList4986 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4989 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem5006 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem5008 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_objLitElem5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_elementarySymbol0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred41_TinyHaxeTry11709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred42_TinyHaxeTry11728 = new BitSet(new long[]{0x62FE884B00700000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_statement_in_synpred42_TinyHaxeTry11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred49_TinyHaxeTry11860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred56_TinyHaxeTry11957 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_synpred56_TinyHaxeTry11960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred57_TinyHaxeTry11972 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_synpred57_TinyHaxeTry11974 = new BitSet(new long[]{0x62FE884B00700000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_statement_in_synpred57_TinyHaxeTry11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred62_TinyHaxeTry12388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred90_TinyHaxeTry12833 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred90_TinyHaxeTry12845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred93_TinyHaxeTry12944 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred93_TinyHaxeTry12946 = new BitSet(new long[]{0x0080004F00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_exprListOpt_in_synpred93_TinyHaxeTry12948 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred93_TinyHaxeTry12950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred94_TinyHaxeTry12965 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOT_in_synpred94_TinyHaxeTry12967 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred94_TinyHaxeTry12969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred95_TinyHaxeTry12975 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred95_TinyHaxeTry12977 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_synpred95_TinyHaxeTry12979 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred95_TinyHaxeTry12981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred96_TinyHaxeTry12986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred96_TinyHaxeTry12988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred97_TinyHaxeTry12994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred97_TinyHaxeTry12996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_synpred99_TinyHaxeTry13039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred104_TinyHaxeTry13173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred105_TinyHaxeTry13169 = new BitSet(new long[]{0x62FE884B00700000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_synpred105_TinyHaxeTry13173 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_statement_in_synpred105_TinyHaxeTry13175 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred105_TinyHaxeTry13178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred107_TinyHaxeTry13275 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred107_TinyHaxeTry13277 = new BitSet(new long[]{0x0080004B00600000L,0x0000001F00FC4000L});
    public static final BitSet FOLLOW_expr_in_synpred107_TinyHaxeTry13279 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred107_TinyHaxeTry13282 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_synpred107_TinyHaxeTry13284 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred107_TinyHaxeTry13288 = new BitSet(new long[]{0x0000000000000002L});

}