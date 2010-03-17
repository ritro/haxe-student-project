// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\antlr\\TinyHaxeTry1.g 2010-03-17 03:50:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class TinyHaxeTry1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "UNARY_MINUS", "UNARY_PLUS", "PREFIX_EXPR", "PROPERTY_DECL", "MODULE", "SUFFIX_EXPR", "STAtEMENT", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG", "TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "VAR_DECLARATION", "DECL_ATTR_LIST", "VAR_INIT", "PACKAGE", "SEMI", "IDENTIFIER", "DOT", "IMPORT", "PUBLIC", "PRIVATE", "STATIC", "INLINE", "DYNAMIC", "OVERRIDE", "COMMA", "QUES", "FUNCTION", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "PP_IF", "BANG", "PP_ELSEIF", "PP_ELSE", "PP_END", "PP_ERROR", "COLON", "MINUS_BIGGER", "GT", "LT", "IF", "ELSE", "WHILE", "DO", "RETURN", "THROW", "BREAK", "CONTINUE", "LBRACE", "RBRACE", "FOR", "IN", "CASE", "DEFAULT", "SWITCH", "TRY", "CATCH", "ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ", "BAR", "AMP", "CARET", "LTLT", "GTGT", "GTGTGT", "PLUS", "SUB", "STAR", "SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "TILDE", "NULL", "NEW", "CAST", "ENUM", "VAR", "EQ", "EXTERN", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "TYPEDEF", "LONGLITERAL", "INTLITERAL", "STRINGLITERAL", "CHARLITERAL", "FLOATNUM", "WS", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "EscapeSequence", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CONST", "DOUBLE", "FINAL", "FINALLY", "FLOAT", "GOTO", "INSTANCEOF", "INT", "LONG", "NATIVE", "PROTECTED", "SHORT", "STRICTFP", "SUPER", "THIS", "THROWS", "TRANSIENT", "VOID", "VOLATILE", "TRUE", "FALSE", "PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", "PERCENTEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "MONKEYS_AT", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "INTNUM", "EXPONENT", "COMMENT", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ", "'<<='", "'>>='", "'>>>='"
    };
    public static final int FUNCTION=32;
    public static final int PACKAGE=19;
    public static final int CAST=87;
    public static final int EXPONENT=153;
    public static final int LT=46;
    public static final int STAR=79;
    public static final int T__159=159;
    public static final int WHILE=49;
    public static final int FLOATNUM=101;
    public static final int CONST=113;
    public static final int OCTAL_ESC=157;
    public static final int CASE=59;
    public static final int CHAR=112;
    public static final int NEW=86;
    public static final int T__160=160;
    public static final int EXTERN=91;
    public static final int DO=50;
    public static final int VAR_DECLARATION=16;
    public static final int EOF=-1;
    public static final int GTGT=75;
    public static final int BREAK=53;
    public static final int UNARY_PLUS=5;
    public static final int T__161=161;
    public static final int LBRACKET=35;
    public static final int FINAL=115;
    public static final int RPAREN=34;
    public static final int IMPORT=23;
    public static final int SUBSUB=82;
    public static final int STAREQ=136;
    public static final int CARET=73;
    public static final int THIS=127;
    public static final int RETURN=51;
    public static final int DOUBLE=114;
    public static final int MONKEYS_AT=148;
    public static final int BARBAR=65;
    public static final int VAR=89;
    public static final int VOID=130;
    public static final int SUPER=126;
    public static final int GOTO=118;
    public static final int EQ=90;
    public static final int COMMENT=154;
    public static final int AMPAMP=66;
    public static final int VAR_INIT=18;
    public static final int QUES=31;
    public static final int EQEQ=67;
    public static final int HexPrefix=105;
    public static final int PP_IF=37;
    public static final int PERCENTDBBQ=144;
    public static final int RBRACE=56;
    public static final int STATIC=26;
    public static final int PRIVATE=25;
    public static final int BLOCK_SCOPE=11;
    public static final int SWITCH=61;
    public static final int NULL=85;
    public static final int STRICTFP=125;
    public static final int ELSE=48;
    public static final int NATIVE=122;
    public static final int ELLIPSIS=64;
    public static final int THROWS=128;
    public static final int UNARY_MINUS=4;
    public static final int INT=120;
    public static final int SLASHEQ=137;
    public static final int INTLITERAL=98;
    public static final int PERCENTBB=150;
    public static final int TRY=62;
    public static final int LongSuffix=104;
    public static final int LONGLITERAL=97;
    public static final int PERCENTLL=149;
    public static final int BANGEQQ=147;
    public static final int WS=102;
    public static final int PERCENTDLQ=142;
    public static final int INHERIT_LIST_OPT=15;
    public static final int CHARLITERAL=100;
    public static final int GT=45;
    public static final int INLINE=27;
    public static final int CATCH=63;
    public static final int FALSE=133;
    public static final int EscapeSequence=108;
    public static final int THROW=52;
    public static final int DYNAMIC=28;
    public static final int PROTECTED=123;
    public static final int CLASS=92;
    public static final int PP_ELSEIF=39;
    public static final int BAREQ=139;
    public static final int PP_ELSE=40;
    public static final int IntegerNumber=103;
    public static final int AMP=72;
    public static final int PLUSPLUS=83;
    public static final int LBRACE=55;
    public static final int TYPE_PARAM_OPT=14;
    public static final int LTEQ=70;
    public static final int SUBEQ=135;
    public static final int GTGTGT=76;
    public static final int Exponent=107;
    public static final int FOR=57;
    public static final int SUFFIX_EXPR=9;
    public static final int SUB=78;
    public static final int FLOAT=117;
    public static final int ABSTRACT=109;
    public static final int MINUS_BIGGER=44;
    public static final int PERCENTDBQ=143;
    public static final int HexDigit=106;
    public static final int PLUSEQ=134;
    public static final int LPAREN=33;
    public static final int IF=47;
    public static final int INTNUM=152;
    public static final int ESC_SEQ=158;
    public static final int BOOLEAN=110;
    public static final int PP_END=41;
    public static final int SLASH=80;
    public static final int IN=58;
    public static final int IMPLEMENTS=95;
    public static final int CONTINUE=54;
    public static final int COMMA=30;
    public static final int AMPEQ=138;
    public static final int TRANSIENT=129;
    public static final int IDENTIFIER=21;
    public static final int TILDE=84;
    public static final int BANGEQ=68;
    public static final int PLUS=77;
    public static final int RBRACKET=36;
    public static final int DOT=22;
    public static final int LTLT=74;
    public static final int BYTE=111;
    public static final int PERCENT=81;
    public static final int VOLATILE=131;
    public static final int DECL_ATTR_LIST=17;
    public static final int TYPEDEF=96;
    public static final int UNICODE_ESC=156;
    public static final int EQEQEQ=145;
    public static final int STAtEMENT=10;
    public static final int DEFAULT=60;
    public static final int PREFIX_EXPR=6;
    public static final int HEX_DIGIT=155;
    public static final int SHORT=124;
    public static final int BANG=38;
    public static final int INSTANCEOF=119;
    public static final int PP_ERROR=42;
    public static final int GTEQ=69;
    public static final int MODULE=8;
    public static final int TRUE=132;
    public static final int SEMI=20;
    public static final int COLON=43;
    public static final int PARAM_LIST=12;
    public static final int PERCENTLESQ=146;
    public static final int ENUM=88;
    public static final int PERCENTEQ=141;
    public static final int FINALLY=116;
    public static final int PROPERTY_DECL=7;
    public static final int OVERRIDE=29;
    public static final int STRINGLITERAL=99;
    public static final int CARETEQ=140;
    public static final int PERCENTBBB=151;
    public static final int INTERFACE=93;
    public static final int LONG=121;
    public static final int EXTENDS=94;
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
            this.state.ruleMemo = new HashMap[239+1];
             
             
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


           class FunctionNode extends CommonTree {
            public FunctionNode() {
                super();
            }

            /**
             * @param node
             */
            public FunctionNode(CommonTree node) {
                super(node);
                // TODO Auto-generated constructor stub
            }

            /**
             * @param t
             */
            public FunctionNode(Token t) {
                super(t);
                // TODO Auto-generated constructor stub
            }

        }

        class ForNode extends CommonTree {

            /**
             * 
             */
            public ForNode() {
                super();
                // TODO Auto-generated constructor stub
            }

            /**
             * @param node
             */
            public ForNode(CommonTree node) {
                super(node);
                // TODO Auto-generated constructor stub
            }

            /**
             * @param t
             */
            public ForNode(Token t) {
                super(t);
                // TODO Auto-generated constructor stub
            }

        }

        class WhileNode extends CommonTree {

            /**
             * 
             */
            public WhileNode() {
                super();
                // TODO Auto-generated constructor stub
            }

            /**
             * @param node
             */
            public WhileNode(CommonTree node) {
                super(node);
                // TODO Auto-generated constructor stub
            }

            /**
             * @param t
             */
            public WhileNode(Token t) {
                super(t);
                // TODO Auto-generated constructor stub
            }

        }

        class ClassNode extends CommonTree {

            /**
             * 
             */
            public ClassNode() {
                super();
                // TODO Auto-generated constructor stub
            }

            /**
             * @param node
             */
            public ClassNode(CommonTree node) {
                super(node);
                // TODO Auto-generated constructor stub
            }

            /**
             * @param t
             */
            public ClassNode(Token t) {
                super(t);
                // TODO Auto-generated constructor stub
            }

        }

        class IfNode extends CommonTree {

            /**
             * 
             */
            public IfNode() {
                super();
                // TODO Auto-generated constructor stub
            }

            /**
             * @param node
             */
            public IfNode(CommonTree node) {
                super(node);
                // TODO Auto-generated constructor stub
            }

            /**
             * @param t
             */
            public IfNode(Token t) {
                super(t);
                // TODO Auto-generated constructor stub
            }

        }

        class DoWhileNode extends CommonTree {

            /**
             * 
             */
            public DoWhileNode() {
                super();
                // TODO Auto-generated constructor stub
            }

            /**
             * @param node
             */
            public DoWhileNode(CommonTree node) {
                super(node);
                // TODO Auto-generated constructor stub
            }

            /**
             * @param t
             */
            public DoWhileNode(Token t) {
                super(t);
                // TODO Auto-generated constructor stub
            }
        }

        class TryNode extends CommonTree {

            /**
             * 
             */
            public TryNode() {
                super();
                // TODO Auto-generated constructor stub
            }

            /**
             * @param node
             */
            public TryNode(CommonTree node) {
                super(node);
                // TODO Auto-generated constructor stub
            }

            /**
             * @param t
             */
            public TryNode(Token t) {
                super(t);
                // TODO Auto-generated constructor stub
            }
        }

        class SwitchNode extends CommonTree {

            /**
             * 
             */
            public SwitchNode() {
                super();
                // TODO Auto-generated constructor stub
            }

            /**
             * @param node
             */
            public SwitchNode(CommonTree node) {
                super(node);
                // TODO Auto-generated constructor stub
            }

            /**
             * @param t
             */
            public SwitchNode(Token t) {
                super(t);
                // TODO Auto-generated constructor stub
            }
        }


    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // C:\\antlr\\TinyHaxeTry1.g:245:1: module : ( myPackage topLevelList -> ^( MODULE myPackage topLevelList ) | topLevelList -> ^( MODULE topLevelList ) );
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
            // C:\\antlr\\TinyHaxeTry1.g:245:19: ( myPackage topLevelList -> ^( MODULE myPackage topLevelList ) | topLevelList -> ^( MODULE topLevelList ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF||LA1_0==IMPORT||LA1_0==PP_IF||(LA1_0>=PP_ELSEIF && LA1_0<=PP_ERROR)||LA1_0==ENUM||(LA1_0>=EXTERN && LA1_0<=INTERFACE)||LA1_0==TYPEDEF) ) {
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
                    // C:\\antlr\\TinyHaxeTry1.g:245:21: myPackage topLevelList
                    {
                    pushFollow(FOLLOW_myPackage_in_module130);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());
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
                    // 245:44: -> ^( MODULE myPackage topLevelList )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:245:46: ^( MODULE myPackage topLevelList )
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
                    // C:\\antlr\\TinyHaxeTry1.g:246:25: topLevelList
                    {
                    pushFollow(FOLLOW_topLevelList_in_module167);
                    topLevelList3=topLevelList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelList.add(topLevelList3.getTree());


                    // AST REWRITE
                    // elements: topLevelList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 246:38: -> ^( MODULE topLevelList )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:246:40: ^( MODULE topLevelList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODULE, "MODULE"), root_1);

                        adaptor.addChild(root_1, stream_topLevelList.nextTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:248:1: topLevelList : ( topLevel )* ;
    public final TinyHaxeTry1Parser.topLevelList_return topLevelList() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelList_return retval = new TinyHaxeTry1Parser.topLevelList_return();
        retval.start = input.LT(1);
        int topLevelList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.topLevel_return topLevel4 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:248:19: ( ( topLevel )* )
            // C:\\antlr\\TinyHaxeTry1.g:248:22: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:248:22: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT||LA2_0==PP_IF||(LA2_0>=PP_ELSEIF && LA2_0<=PP_ERROR)||LA2_0==ENUM||(LA2_0>=EXTERN && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:248:23: topLevel
            	    {
            	    pushFollow(FOLLOW_topLevel_in_topLevelList190);
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
    // C:\\antlr\\TinyHaxeTry1.g:250:1: topLevel : ( myImport | pp | topLevelDecl );
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
            // C:\\antlr\\TinyHaxeTry1.g:250:19: ( myImport | pp | topLevelDecl )
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
                    // C:\\antlr\\TinyHaxeTry1.g:250:21: myImport
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_myImport_in_topLevel209);
                    myImport5=myImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, myImport5.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:251:25: pp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_topLevel235);
                    pp6=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp6.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:252:25: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_topLevelDecl_in_topLevel261);
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
    // C:\\antlr\\TinyHaxeTry1.g:254:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:254:21: ( PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) )
            // C:\\antlr\\TinyHaxeTry1.g:254:23: PACKAGE dotIdent SEMI
            {
            PACKAGE8=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage280); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE.add(PACKAGE8);

            pushFollow(FOLLOW_dotIdent_in_myPackage282);
            dotIdent9=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent9.getTree());
            SEMI10=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage284); if (state.failed) return retval; 
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
            // 254:45: -> ^( PACKAGE dotIdent )
            {
                // C:\\antlr\\TinyHaxeTry1.g:254:48: ^( PACKAGE dotIdent )
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
    // C:\\antlr\\TinyHaxeTry1.g:257:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:258:5: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            // C:\\antlr\\TinyHaxeTry1.g:258:9: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:258:9: (a= IDENTIFIER -> $a)
            // C:\\antlr\\TinyHaxeTry1.g:258:12: a= IDENTIFIER
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier315); if (state.failed) return retval; 
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
            // 258:27: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            // C:\\antlr\\TinyHaxeTry1.g:258:37: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DOT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:258:41: DOT ident= IDENTIFIER
            	    {
            	    DOT11=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier331); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT11);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier335); if (state.failed) return retval; 
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
            	    // 258:63: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        // C:\\antlr\\TinyHaxeTry1.g:258:67: ^( DOT $qualifiedIdentifier $ident)
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
    // C:\\antlr\\TinyHaxeTry1.g:261:1: myImport : IMPORT dotIdent SEMI ;
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
            // C:\\antlr\\TinyHaxeTry1.g:261:21: ( IMPORT dotIdent SEMI )
            // C:\\antlr\\TinyHaxeTry1.g:261:23: IMPORT dotIdent SEMI
            {
            root_0 = (Object)adaptor.nil();

            IMPORT12=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_myImport377); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPORT12_tree = (Object)adaptor.create(IMPORT12);
            root_0 = (Object)adaptor.becomeRoot(IMPORT12_tree, root_0);
            }
            pushFollow(FOLLOW_dotIdent_in_myImport380);
            dotIdent13=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent13.getTree());
            SEMI14=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport382); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:265:1: access : ( PUBLIC | PRIVATE );
    public final TinyHaxeTry1Parser.access_return access() throws RecognitionException {
        TinyHaxeTry1Parser.access_return retval = new TinyHaxeTry1Parser.access_return();
        retval.start = input.LT(1);
        int access_StartIndex = input.index();
        Object root_0 = null;

        Token set15=null;

        Object set15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:265:19: ( PUBLIC | PRIVATE )
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
    // C:\\antlr\\TinyHaxeTry1.g:268:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
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
            // C:\\antlr\\TinyHaxeTry1.g:268:19: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
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
                    // C:\\antlr\\TinyHaxeTry1.g:268:21: STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    STATIC16=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr469); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC16_tree = (Object)adaptor.create(STATIC16);
                    adaptor.addChild(root_0, STATIC16_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:269:24: INLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    INLINE17=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr494); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE17_tree = (Object)adaptor.create(INLINE17);
                    adaptor.addChild(root_0, INLINE17_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:270:25: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    DYNAMIC18=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr520); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC18_tree = (Object)adaptor.create(DYNAMIC18);
                    adaptor.addChild(root_0, DYNAMIC18_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:271:25: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    OVERRIDE19=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr546); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE19_tree = (Object)adaptor.create(OVERRIDE19);
                    adaptor.addChild(root_0, OVERRIDE19_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:272:25: access
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_access_in_declAttr572);
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
    // C:\\antlr\\TinyHaxeTry1.g:274:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST ( declAttr )+ ) ;
    public final TinyHaxeTry1Parser.declAttrList_return declAttrList() throws RecognitionException {
        TinyHaxeTry1Parser.declAttrList_return retval = new TinyHaxeTry1Parser.declAttrList_return();
        retval.start = input.LT(1);
        int declAttrList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.declAttr_return declAttr21 = null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:274:19: ( ( declAttr )+ -> ^( DECL_ATTR_LIST ( declAttr )+ ) )
            // C:\\antlr\\TinyHaxeTry1.g:274:21: ( declAttr )+
            {
            // C:\\antlr\\TinyHaxeTry1.g:274:21: ( declAttr )+
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
            	    // C:\\antlr\\TinyHaxeTry1.g:274:22: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList587);
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
            // 274:33: -> ^( DECL_ATTR_LIST ( declAttr )+ )
            {
                // C:\\antlr\\TinyHaxeTry1.g:274:36: ^( DECL_ATTR_LIST ( declAttr )+ )
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
    // C:\\antlr\\TinyHaxeTry1.g:277:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST ( param )+ ) | -> ^( PARAM_LIST ) );
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
            // C:\\antlr\\TinyHaxeTry1.g:277:19: ( param ( COMMA param )* -> ^( PARAM_LIST ( param )+ ) | -> ^( PARAM_LIST ) )
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
                    // C:\\antlr\\TinyHaxeTry1.g:277:21: param ( COMMA param )*
                    {
                    pushFollow(FOLLOW_param_in_paramList624);
                    param22=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param22.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:277:27: ( COMMA param )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:277:28: COMMA param
                    	    {
                    	    COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList627); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA23);

                    	    pushFollow(FOLLOW_param_in_paramList629);
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
                    // 277:42: -> ^( PARAM_LIST ( param )+ )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:277:45: ^( PARAM_LIST ( param )+ )
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
                    // C:\\antlr\\TinyHaxeTry1.g:278:4: 
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
                    // 278:4: -> ^( PARAM_LIST )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:278:6: ^( PARAM_LIST )
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
    // C:\\antlr\\TinyHaxeTry1.g:280:1: param : ( QUES )? IDENTIFIER typeTagOpt varInitOpt -> ^( IDENTIFIER typeTagOpt varInitOpt ( QUES )? ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:280:19: ( ( QUES )? IDENTIFIER typeTagOpt varInitOpt -> ^( IDENTIFIER typeTagOpt varInitOpt ( QUES )? ) )
            // C:\\antlr\\TinyHaxeTry1.g:280:20: ( QUES )? IDENTIFIER typeTagOpt varInitOpt
            {
            // C:\\antlr\\TinyHaxeTry1.g:280:20: ( QUES )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==QUES) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:0:0: QUES
                    {
                    QUES25=(Token)match(input,QUES,FOLLOW_QUES_in_param668); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES25);


                    }
                    break;

            }

            IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param671); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER26);

            pushFollow(FOLLOW_typeTagOpt_in_param673);
            typeTagOpt27=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt27.getTree());
            pushFollow(FOLLOW_varInitOpt_in_param675);
            varInitOpt28=varInitOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varInitOpt.add(varInitOpt28.getTree());


            // AST REWRITE
            // elements: IDENTIFIER, varInitOpt, typeTagOpt, QUES
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 280:59: -> ^( IDENTIFIER typeTagOpt varInitOpt ( QUES )? )
            {
                // C:\\antlr\\TinyHaxeTry1.g:280:62: ^( IDENTIFIER typeTagOpt varInitOpt ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IDENTIFIER.nextNode(), root_1);

                adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                adaptor.addChild(root_1, stream_varInitOpt.nextTree());
                // C:\\antlr\\TinyHaxeTry1.g:280:97: ( QUES )?
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
    // C:\\antlr\\TinyHaxeTry1.g:282:1: dotIdent : ( IDENTIFIER -> IDENTIFIER ) ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:282:19: ( ( IDENTIFIER -> IDENTIFIER ) ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )* )
            // C:\\antlr\\TinyHaxeTry1.g:282:21: ( IDENTIFIER -> IDENTIFIER ) ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:282:21: ( IDENTIFIER -> IDENTIFIER )
            // C:\\antlr\\TinyHaxeTry1.g:282:22: IDENTIFIER
            {
            IDENTIFIER29=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dotIdent707); if (state.failed) return retval; 
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
            // 282:33: -> IDENTIFIER
            {
                adaptor.addChild(root_0, stream_IDENTIFIER.nextNode());

            }

            retval.tree = root_0;}
            }

            // C:\\antlr\\TinyHaxeTry1.g:282:48: ( DOT ident= IDENTIFIER -> ^( DOT $dotIdent $ident) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DOT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:282:49: DOT ident= IDENTIFIER
            	    {
            	    DOT30=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent715); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT30);

            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dotIdent719); if (state.failed) return retval; 
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
            	    // 282:70: -> ^( DOT $dotIdent $ident)
            	    {
            	        // C:\\antlr\\TinyHaxeTry1.g:282:72: ^( DOT $dotIdent $ident)
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
    // C:\\antlr\\TinyHaxeTry1.g:284:1: assignOp : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '>>>=' );
    public final TinyHaxeTry1Parser.assignOp_return assignOp() throws RecognitionException {
        TinyHaxeTry1Parser.assignOp_return retval = new TinyHaxeTry1Parser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token set31=null;

        Object set31_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:284:19: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '>>>=' )
            // C:\\antlr\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set31=(Token)input.LT(1);
            if ( input.LA(1)==EQ||(input.LA(1)>=PLUSEQ && input.LA(1)<=PERCENTEQ)||(input.LA(1)>=159 && input.LA(1)<=161) ) {
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
    // C:\\antlr\\TinyHaxeTry1.g:297:1: funcLit : FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION paramList typeTagOpt block ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:297:19: ( FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION paramList typeTagOpt block ) )
            // C:\\antlr\\TinyHaxeTry1.g:297:21: FUNCTION LPAREN paramList RPAREN typeTagOpt block
            {
            FUNCTION32=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit1055); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION32);

            LPAREN33=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit1057); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN33);

            pushFollow(FOLLOW_paramList_in_funcLit1059);
            paramList34=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList34.getTree());
            RPAREN35=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit1061); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN35);

            pushFollow(FOLLOW_typeTagOpt_in_funcLit1063);
            typeTagOpt36=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt36.getTree());
            pushFollow(FOLLOW_block_in_funcLit1065);
            block37=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block37.getTree());


            // AST REWRITE
            // elements: block, typeTagOpt, paramList, FUNCTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 297:71: -> ^( FUNCTION paramList typeTagOpt block )
            {
                // C:\\antlr\\TinyHaxeTry1.g:297:74: ^( FUNCTION paramList typeTagOpt block )
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
    // C:\\antlr\\TinyHaxeTry1.g:299:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
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
            // C:\\antlr\\TinyHaxeTry1.g:299:18: ( LBRACKET exprListOpt RBRACKET )
            // C:\\antlr\\TinyHaxeTry1.g:299:20: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            LBRACKET38=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit1094); if (state.failed) return retval;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit1097);
            exprListOpt39=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt39.getTree());
            RBRACKET40=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit1099); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:306:1: pp : ( ppIf | ppElseIf | ppElse | ppEnd | ppError );
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
            // C:\\antlr\\TinyHaxeTry1.g:306:19: ( ppIf | ppElseIf | ppElse | ppEnd | ppError )
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
                    // C:\\antlr\\TinyHaxeTry1.g:306:21: ppIf
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppIf_in_pp1127);
                    ppIf41=ppIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppIf41.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:307:25: ppElseIf
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppElseIf_in_pp1153);
                    ppElseIf42=ppElseIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppElseIf42.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:308:25: ppElse
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppElse_in_pp1179);
                    ppElse43=ppElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppElse43.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:309:25: ppEnd
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppEnd_in_pp1205);
                    ppEnd44=ppEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppEnd44.getTree());

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:310:25: ppError
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ppError_in_pp1231);
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
    // C:\\antlr\\TinyHaxeTry1.g:312:1: ppIf : ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER );
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
            // C:\\antlr\\TinyHaxeTry1.g:312:19: ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER )
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
                    // C:\\antlr\\TinyHaxeTry1.g:312:21: PP_IF IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_IF46=(Token)match(input,PP_IF,FOLLOW_PP_IF_in_ppIf1253); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_IF46_tree = (Object)adaptor.create(PP_IF46);
                    adaptor.addChild(root_0, PP_IF46_tree);
                    }
                    IDENTIFIER47=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1255); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER47_tree = (Object)adaptor.create(IDENTIFIER47);
                    adaptor.addChild(root_0, IDENTIFIER47_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:313:25: PP_IF BANG IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_IF48=(Token)match(input,PP_IF,FOLLOW_PP_IF_in_ppIf1281); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_IF48_tree = (Object)adaptor.create(PP_IF48);
                    adaptor.addChild(root_0, PP_IF48_tree);
                    }
                    BANG49=(Token)match(input,BANG,FOLLOW_BANG_in_ppIf1283); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANG49_tree = (Object)adaptor.create(BANG49);
                    adaptor.addChild(root_0, BANG49_tree);
                    }
                    IDENTIFIER50=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1285); if (state.failed) return retval;
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
    // C:\\antlr\\TinyHaxeTry1.g:315:1: ppElseIf : ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER );
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
            // C:\\antlr\\TinyHaxeTry1.g:315:19: ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER )
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
                    // C:\\antlr\\TinyHaxeTry1.g:315:21: PP_ELSEIF IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_ELSEIF51=(Token)match(input,PP_ELSEIF,FOLLOW_PP_ELSEIF_in_ppElseIf1303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_ELSEIF51_tree = (Object)adaptor.create(PP_ELSEIF51);
                    adaptor.addChild(root_0, PP_ELSEIF51_tree);
                    }
                    IDENTIFIER52=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1305); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER52_tree = (Object)adaptor.create(IDENTIFIER52);
                    adaptor.addChild(root_0, IDENTIFIER52_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:316:24: PP_ELSEIF BANG IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    PP_ELSEIF53=(Token)match(input,PP_ELSEIF,FOLLOW_PP_ELSEIF_in_ppElseIf1330); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_ELSEIF53_tree = (Object)adaptor.create(PP_ELSEIF53);
                    adaptor.addChild(root_0, PP_ELSEIF53_tree);
                    }
                    BANG54=(Token)match(input,BANG,FOLLOW_BANG_in_ppElseIf1332); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANG54_tree = (Object)adaptor.create(BANG54);
                    adaptor.addChild(root_0, BANG54_tree);
                    }
                    IDENTIFIER55=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1334); if (state.failed) return retval;
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
    // C:\\antlr\\TinyHaxeTry1.g:318:1: ppElse : PP_ELSE ;
    public final TinyHaxeTry1Parser.ppElse_return ppElse() throws RecognitionException {
        TinyHaxeTry1Parser.ppElse_return retval = new TinyHaxeTry1Parser.ppElse_return();
        retval.start = input.LT(1);
        int ppElse_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ELSE56=null;

        Object PP_ELSE56_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:318:19: ( PP_ELSE )
            // C:\\antlr\\TinyHaxeTry1.g:318:21: PP_ELSE
            {
            root_0 = (Object)adaptor.nil();

            PP_ELSE56=(Token)match(input,PP_ELSE,FOLLOW_PP_ELSE_in_ppElse1354); if (state.failed) return retval;
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
    // C:\\antlr\\TinyHaxeTry1.g:320:1: ppEnd : PP_END ;
    public final TinyHaxeTry1Parser.ppEnd_return ppEnd() throws RecognitionException {
        TinyHaxeTry1Parser.ppEnd_return retval = new TinyHaxeTry1Parser.ppEnd_return();
        retval.start = input.LT(1);
        int ppEnd_StartIndex = input.index();
        Object root_0 = null;

        Token PP_END57=null;

        Object PP_END57_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:320:19: ( PP_END )
            // C:\\antlr\\TinyHaxeTry1.g:320:21: PP_END
            {
            root_0 = (Object)adaptor.nil();

            PP_END57=(Token)match(input,PP_END,FOLLOW_PP_END_in_ppEnd1375); if (state.failed) return retval;
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
    // C:\\antlr\\TinyHaxeTry1.g:322:1: ppError : PP_ERROR ;
    public final TinyHaxeTry1Parser.ppError_return ppError() throws RecognitionException {
        TinyHaxeTry1Parser.ppError_return retval = new TinyHaxeTry1Parser.ppError_return();
        retval.start = input.LT(1);
        int ppError_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ERROR58=null;

        Object PP_ERROR58_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:322:19: ( PP_ERROR )
            // C:\\antlr\\TinyHaxeTry1.g:322:21: PP_ERROR
            {
            root_0 = (Object)adaptor.nil();

            PP_ERROR58=(Token)match(input,PP_ERROR,FOLLOW_PP_ERROR_in_ppError1394); if (state.failed) return retval;
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
    // C:\\antlr\\TinyHaxeTry1.g:327:1: typeTag : COLON funcType ;
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
            // C:\\antlr\\TinyHaxeTry1.g:327:19: ( COLON funcType )
            // C:\\antlr\\TinyHaxeTry1.g:327:21: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            COLON59=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1417); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_typeTag1420);
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
    // C:\\antlr\\TinyHaxeTry1.g:329:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG typeTag ) | -> ^( TYPE_TAG ) );
    public final TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeTagOpt_return retval = new TinyHaxeTry1Parser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeTag_return typeTag61 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:329:19: ( typeTag -> ^( TYPE_TAG typeTag ) | -> ^( TYPE_TAG ) )
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
                    // C:\\antlr\\TinyHaxeTry1.g:329:21: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt1436);
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
                    // 329:29: -> ^( TYPE_TAG typeTag )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:329:32: ^( TYPE_TAG typeTag )
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
                    // C:\\antlr\\TinyHaxeTry1.g:330:23: 
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
                    // 330:23: -> ^( TYPE_TAG )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:330:26: ^( TYPE_TAG )
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
    // C:\\antlr\\TinyHaxeTry1.g:332:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );
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
            // C:\\antlr\\TinyHaxeTry1.g:332:19: ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* )
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
                    // C:\\antlr\\TinyHaxeTry1.g:332:21: funcType ( COMMA funcType )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcType_in_typeList1490);
                    funcType62=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType62.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:332:30: ( COMMA funcType )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:332:31: COMMA funcType
                    	    {
                    	    COMMA63=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1493); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_funcType_in_typeList1496);
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
                    // C:\\antlr\\TinyHaxeTry1.g:333:25: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typeConstraint_in_typeList1524);
                    typeConstraint65=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint65.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:333:40: ( COMMA typeConstraint )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:333:41: COMMA typeConstraint
                    	    {
                    	    COMMA66=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1527); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList1530);
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
    // C:\\antlr\\TinyHaxeTry1.g:344:1: funcType : ( type ) ( MINUS_BIGGER type )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:344:19: ( ( type ) ( MINUS_BIGGER type )* )
            // C:\\antlr\\TinyHaxeTry1.g:344:21: ( type ) ( MINUS_BIGGER type )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:344:21: ( type )
            // C:\\antlr\\TinyHaxeTry1.g:344:22: type
            {
            pushFollow(FOLLOW_type_in_funcType1573);
            type68=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type68.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:344:28: ( MINUS_BIGGER type )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==MINUS_BIGGER) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:344:29: MINUS_BIGGER type
            	    {
            	    MINUS_BIGGER69=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1577); if (state.failed) return retval;
            	    pushFollow(FOLLOW_type_in_funcType1580);
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
    // C:\\antlr\\TinyHaxeTry1.g:346:1: type : ( anonType | dotIdent ) ( typeParam )* ;
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
            // C:\\antlr\\TinyHaxeTry1.g:346:19: ( ( anonType | dotIdent ) ( typeParam )* )
            // C:\\antlr\\TinyHaxeTry1.g:346:21: ( anonType | dotIdent ) ( typeParam )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:346:21: ( anonType | dotIdent )
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
                    // C:\\antlr\\TinyHaxeTry1.g:346:22: anonType
                    {
                    pushFollow(FOLLOW_anonType_in_type1605);
                    anonType71=anonType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonType71.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:346:33: dotIdent
                    {
                    pushFollow(FOLLOW_dotIdent_in_type1609);
                    dotIdent72=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent72.getTree());

                    }
                    break;

            }

            // C:\\antlr\\TinyHaxeTry1.g:346:43: ( typeParam )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==GT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:346:44: typeParam
            	    {
            	    pushFollow(FOLLOW_typeParam_in_type1613);
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
    // C:\\antlr\\TinyHaxeTry1.g:348:1: typeParam : GT typeList LT ;
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
            // C:\\antlr\\TinyHaxeTry1.g:348:19: ( GT typeList LT )
            // C:\\antlr\\TinyHaxeTry1.g:348:21: GT typeList LT
            {
            root_0 = (Object)adaptor.nil();

            GT74=(Token)match(input,GT,FOLLOW_GT_in_typeParam1632); if (state.failed) return retval;
            pushFollow(FOLLOW_typeList_in_typeParam1635);
            typeList75=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList75.getTree());
            LT76=(Token)match(input,LT,FOLLOW_LT_in_typeParam1637); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:350:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT typeParam ) | -> ^( TYPE_PARAM_OPT ) );
    public final TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeParamOpt_return retval = new TinyHaxeTry1Parser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam77 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:350:19: ( typeParam -> ^( TYPE_PARAM_OPT typeParam ) | -> ^( TYPE_PARAM_OPT ) )
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
                    // C:\\antlr\\TinyHaxeTry1.g:350:21: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1652);
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
                    // 350:30: -> ^( TYPE_PARAM_OPT typeParam )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:350:32: ^( TYPE_PARAM_OPT typeParam )
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
                    // C:\\antlr\\TinyHaxeTry1.g:351:4: 
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
                    // 351:4: -> ^( TYPE_PARAM_OPT )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:351:6: ^( TYPE_PARAM_OPT )
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
    // C:\\antlr\\TinyHaxeTry1.g:353:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint IDENTIFIER typeList ) ;
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
            // C:\\antlr\\TinyHaxeTry1.g:353:19: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint IDENTIFIER typeList ) )
            // C:\\antlr\\TinyHaxeTry1.g:353:21: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            IDENTIFIER78=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1684); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER78);

            COLON79=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1686); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON79);

            LPAREN80=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1688); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN80);

            pushFollow(FOLLOW_typeList_in_typeConstraint1690);
            typeList81=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList81.getTree());
            RPAREN82=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1692); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN82);



            // AST REWRITE
            // elements: typeConstraint, typeList, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 353:61: -> ^( $typeConstraint IDENTIFIER typeList )
            {
                // C:\\antlr\\TinyHaxeTry1.g:353:64: ^( $typeConstraint IDENTIFIER typeList )
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
    // C:\\antlr\\TinyHaxeTry1.g:356:1: statement : ( block | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | forStmt | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO statement WHILE parExpression ) | tryStmt | switchStmt | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI );
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
            // C:\\antlr\\TinyHaxeTry1.g:357:5: ( block | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | forStmt | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO statement WHILE parExpression ) | tryStmt | switchStmt | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI )
            int alt26=14;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:357:9: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement1721);
                    block83=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block83.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:358:9: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    IF84=(Token)match(input,IF,FOLLOW_IF_in_statement1731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF84);

                    pushFollow(FOLLOW_parExpression_in_statement1733);
                    parExpression85=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression85.getTree());
                    pushFollow(FOLLOW_statement_in_statement1737);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:358:40: ( ELSE st2= statement )?
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
                            // C:\\antlr\\TinyHaxeTry1.g:358:41: ELSE st2= statement
                            {
                            ELSE86=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1740); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE86);

                            pushFollow(FOLLOW_statement_in_statement1744);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: st1, ELSE, st2, parExpression, IF
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
                    // 358:62: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:358:65: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        // C:\\antlr\\TinyHaxeTry1.g:358:89: ( ^( ELSE $st2) )?
                        if ( stream_ELSE.hasNext()||stream_st2.hasNext() ) {
                            // C:\\antlr\\TinyHaxeTry1.g:358:89: ^( ELSE $st2)
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
                    // C:\\antlr\\TinyHaxeTry1.g:359:9: forStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStmt_in_statement1785);
                    forStmt87=forStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStmt87.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:360:9: WHILE parExpression statement
                    {
                    WHILE88=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE88);

                    pushFollow(FOLLOW_parExpression_in_statement1797);
                    parExpression89=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression89.getTree());
                    pushFollow(FOLLOW_statement_in_statement1799);
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
                    // 360:39: -> ^( WHILE parExpression statement )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:360:42: ^( WHILE parExpression statement )
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
                    // C:\\antlr\\TinyHaxeTry1.g:361:9: DO statement WHILE parExpression SEMI
                    {
                    DO91=(Token)match(input,DO,FOLLOW_DO_in_statement1819); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO91);

                    pushFollow(FOLLOW_statement_in_statement1821);
                    statement92=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement92.getTree());
                    WHILE93=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE93);

                    pushFollow(FOLLOW_parExpression_in_statement1825);
                    parExpression94=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression94.getTree());
                    SEMI95=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI95);



                    // AST REWRITE
                    // elements: parExpression, WHILE, statement, DO
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 361:47: -> ^( DO statement WHILE parExpression )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:361:50: ^( DO statement WHILE parExpression )
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
                    // C:\\antlr\\TinyHaxeTry1.g:362:9: tryStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStmt_in_statement1849);
                    tryStmt96=tryStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryStmt96.getTree());

                    }
                    break;
                case 7 :
                    // C:\\antlr\\TinyHaxeTry1.g:364:6: switchStmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStmt_in_statement1859);
                    switchStmt97=switchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStmt97.getTree());

                    }
                    break;
                case 8 :
                    // C:\\antlr\\TinyHaxeTry1.g:365:9: RETURN ( expr )? SEMI
                    {
                    RETURN98=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1869); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN98);

                    // C:\\antlr\\TinyHaxeTry1.g:365:16: ( expr )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=IDENTIFIER && LA23_0<=DOT)||(LA23_0>=QUES && LA23_0<=LPAREN)||LA23_0==LBRACKET||LA23_0==BANG||(LA23_0>=GT && LA23_0<=LT)||LA23_0==LBRACE||(LA23_0>=ELLIPSIS && LA23_0<=CAST)||LA23_0==EQ||(LA23_0>=LONGLITERAL && LA23_0<=FLOATNUM)||(LA23_0>=PLUSEQ && LA23_0<=PERCENTEQ)||(LA23_0>=159 && LA23_0<=161)) ) {
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
                            // C:\\antlr\\TinyHaxeTry1.g:365:17: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1872);
                            expr99=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr99.getTree());

                            }
                            break;

                    }

                    SEMI100=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI100);



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
                    // 365:29: -> ^( RETURN ( expr )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:365:32: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        // C:\\antlr\\TinyHaxeTry1.g:365:41: ( expr )?
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
                    // C:\\antlr\\TinyHaxeTry1.g:366:9: THROW expr SEMI
                    {
                    THROW101=(Token)match(input,THROW,FOLLOW_THROW_in_statement1895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW101);

                    pushFollow(FOLLOW_expr_in_statement1897);
                    expr102=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr102.getTree());
                    SEMI103=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1899); if (state.failed) return retval; 
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
                    // 366:25: -> ^( THROW expr )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:366:28: ^( THROW expr )
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
                    // C:\\antlr\\TinyHaxeTry1.g:367:9: BREAK ( IDENTIFIER )? SEMI
                    {
                    BREAK104=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK104);

                    // C:\\antlr\\TinyHaxeTry1.g:367:15: ( IDENTIFIER )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==IDENTIFIER) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:367:16: IDENTIFIER
                            {
                            IDENTIFIER105=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1920); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER105);


                            }
                            break;

                    }

                    SEMI106=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1924); if (state.failed) return retval; 
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
                    // 367:34: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:367:37: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        // C:\\antlr\\TinyHaxeTry1.g:367:45: ( IDENTIFIER )?
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
                    // C:\\antlr\\TinyHaxeTry1.g:368:9: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    CONTINUE107=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE107);

                    // C:\\antlr\\TinyHaxeTry1.g:368:18: ( IDENTIFIER )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==IDENTIFIER) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:368:19: IDENTIFIER
                            {
                            IDENTIFIER108=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1946); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER108);


                            }
                            break;

                    }

                    SEMI109=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1950); if (state.failed) return retval; 
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
                    // 368:37: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:368:40: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        // C:\\antlr\\TinyHaxeTry1.g:368:51: ( IDENTIFIER )?
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
                    // C:\\antlr\\TinyHaxeTry1.g:369:9: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement1969);
                    expr110=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr110.getTree());
                    SEMI111=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1972); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // C:\\antlr\\TinyHaxeTry1.g:370:9: IDENTIFIER COLON statement
                    {
                    IDENTIFIER112=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1984); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER112);

                    COLON113=(Token)match(input,COLON,FOLLOW_COLON_in_statement1986); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON113);

                    pushFollow(FOLLOW_statement_in_statement1988);
                    statement114=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement114.getTree());


                    // AST REWRITE
                    // elements: IDENTIFIER, COLON, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 370:36: -> ^( COLON IDENTIFIER statement )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:370:39: ^( COLON IDENTIFIER statement )
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
                    // C:\\antlr\\TinyHaxeTry1.g:371:9: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMI115=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2008); if (state.failed) return retval;

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
    // C:\\antlr\\TinyHaxeTry1.g:374:1: parExpression : RPAREN expr LPAREN ;
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
            // C:\\antlr\\TinyHaxeTry1.g:375:5: ( RPAREN expr LPAREN )
            // C:\\antlr\\TinyHaxeTry1.g:375:9: RPAREN expr LPAREN
            {
            root_0 = (Object)adaptor.nil();

            RPAREN116=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2033); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_parExpression2036);
            expr117=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr117.getTree());
            LPAREN118=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2038); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:378:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE ( blockStmt )* ) | SEMI -> ^( BLOCK_SCOPE ) );
    public final TinyHaxeTry1Parser.block_return block() throws RecognitionException {
        TinyHaxeTry1Parser.block_return retval = new TinyHaxeTry1Parser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE119=null;
        Token RBRACE121=null;
        Token SEMI122=null;
        TinyHaxeTry1Parser.blockStmt_return blockStmt120 = null;


        Object LBRACE119_tree=null;
        Object RBRACE121_tree=null;
        Object SEMI122_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:378:15: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE ( blockStmt )* ) | SEMI -> ^( BLOCK_SCOPE ) )
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
                    // C:\\antlr\\TinyHaxeTry1.g:378:17: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE119=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE119);

                    // C:\\antlr\\TinyHaxeTry1.g:378:24: ( blockStmt )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=SEMI && LA27_0<=DOT)||(LA27_0>=PUBLIC && LA27_0<=OVERRIDE)||(LA27_0>=QUES && LA27_0<=LPAREN)||LA27_0==LBRACKET||LA27_0==BANG||(LA27_0>=GT && LA27_0<=IF)||(LA27_0>=WHILE && LA27_0<=LBRACE)||LA27_0==FOR||(LA27_0>=SWITCH && LA27_0<=TRY)||(LA27_0>=ELLIPSIS && LA27_0<=CAST)||(LA27_0>=VAR && LA27_0<=CLASS)||(LA27_0>=LONGLITERAL && LA27_0<=FLOATNUM)||(LA27_0>=PLUSEQ && LA27_0<=PERCENTEQ)||(LA27_0>=159 && LA27_0<=161)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:378:25: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block2063);
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

                    RBRACE121=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2067); if (state.failed) return retval; 
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
                    // 378:44: -> ^( BLOCK_SCOPE ( blockStmt )* )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:378:46: ^( BLOCK_SCOPE ( blockStmt )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                        // C:\\antlr\\TinyHaxeTry1.g:378:60: ( blockStmt )*
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
                    // C:\\antlr\\TinyHaxeTry1.g:379:4: SEMI
                    {
                    SEMI122=(Token)match(input,SEMI,FOLLOW_SEMI_in_block2081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI122);



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
                    // 379:9: -> ^( BLOCK_SCOPE )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:379:11: ^( BLOCK_SCOPE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

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
    // C:\\antlr\\TinyHaxeTry1.g:382:1: blockStmt : ( varDecl | classDecl | statement );
    public final TinyHaxeTry1Parser.blockStmt_return blockStmt() throws RecognitionException {
        TinyHaxeTry1Parser.blockStmt_return retval = new TinyHaxeTry1Parser.blockStmt_return();
        retval.start = input.LT(1);
        int blockStmt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl123 = null;

        TinyHaxeTry1Parser.classDecl_return classDecl124 = null;

        TinyHaxeTry1Parser.statement_return statement125 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:383:2: ( varDecl | classDecl | statement )
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
            case 159:
            case 160:
            case 161:
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
                    // C:\\antlr\\TinyHaxeTry1.g:383:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_blockStmt2098);
                    varDecl123=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl123.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:384:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_blockStmt2103);
                    classDecl124=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl124.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:385:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_blockStmt2108);
                    statement125=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement125.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:388:1: forStmt : FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) ;
    public final TinyHaxeTry1Parser.forStmt_return forStmt() throws RecognitionException {
        TinyHaxeTry1Parser.forStmt_return retval = new TinyHaxeTry1Parser.forStmt_return();
        retval.start = input.LT(1);
        int forStmt_StartIndex = input.index();
        Object root_0 = null;

        Token FOR126=null;
        Token LPAREN127=null;
        Token IN128=null;
        Token RPAREN129=null;
        TinyHaxeTry1Parser.expr_return exp1 = null;

        TinyHaxeTry1Parser.expr_return exp2 = null;

        TinyHaxeTry1Parser.statement_return statement130 = null;


        Object FOR126_tree=null;
        Object LPAREN127_tree=null;
        Object IN128_tree=null;
        Object RPAREN129_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:388:19: ( FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) )
            // C:\\antlr\\TinyHaxeTry1.g:388:21: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
            {
            FOR126=(Token)match(input,FOR,FOLLOW_FOR_in_forStmt2140); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(FOR126);

            LPAREN127=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forStmt2142); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN127);

            pushFollow(FOLLOW_expr_in_forStmt2146);
            exp1=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
            IN128=(Token)match(input,IN,FOLLOW_IN_in_forStmt2148); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN.add(IN128);

            pushFollow(FOLLOW_expr_in_forStmt2152);
            exp2=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
            RPAREN129=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forStmt2154); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN129);

            pushFollow(FOLLOW_statement_in_forStmt2156);
            statement130=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement130.getTree());


            // AST REWRITE
            // elements: IN, FOR, exp1, statement, exp2
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
            // 388:72: -> ^( FOR ^( IN $exp1 $exp2) statement )
            {
                // C:\\antlr\\TinyHaxeTry1.g:388:75: ^( FOR ^( IN $exp1 $exp2) statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);

                // C:\\antlr\\TinyHaxeTry1.g:388:81: ^( IN $exp1 $exp2)
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
    // C:\\antlr\\TinyHaxeTry1.g:391:1: breakStmt : BREAK SEMI ;
    public final TinyHaxeTry1Parser.breakStmt_return breakStmt() throws RecognitionException {
        TinyHaxeTry1Parser.breakStmt_return retval = new TinyHaxeTry1Parser.breakStmt_return();
        retval.start = input.LT(1);
        int breakStmt_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK131=null;
        Token SEMI132=null;

        Object BREAK131_tree=null;
        Object SEMI132_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:391:19: ( BREAK SEMI )
            // C:\\antlr\\TinyHaxeTry1.g:391:21: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            BREAK131=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt2193); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK131_tree = (Object)adaptor.create(BREAK131);
            adaptor.addChild(root_0, BREAK131_tree);
            }
            SEMI132=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt2195); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:393:1: continueStmt : CONTINUE SEMI ;
    public final TinyHaxeTry1Parser.continueStmt_return continueStmt() throws RecognitionException {
        TinyHaxeTry1Parser.continueStmt_return retval = new TinyHaxeTry1Parser.continueStmt_return();
        retval.start = input.LT(1);
        int continueStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE133=null;
        Token SEMI134=null;

        Object CONTINUE133_tree=null;
        Object SEMI134_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:393:19: ( CONTINUE SEMI )
            // C:\\antlr\\TinyHaxeTry1.g:393:21: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE133=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt2210); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE133_tree = (Object)adaptor.create(CONTINUE133);
            adaptor.addChild(root_0, CONTINUE133_tree);
            }
            SEMI134=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt2212); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:395:1: caseStmt : CASE exprList COLON ;
    public final TinyHaxeTry1Parser.caseStmt_return caseStmt() throws RecognitionException {
        TinyHaxeTry1Parser.caseStmt_return retval = new TinyHaxeTry1Parser.caseStmt_return();
        retval.start = input.LT(1);
        int caseStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CASE135=null;
        Token COLON137=null;
        TinyHaxeTry1Parser.exprList_return exprList136 = null;


        Object CASE135_tree=null;
        Object COLON137_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:395:19: ( CASE exprList COLON )
            // C:\\antlr\\TinyHaxeTry1.g:395:21: CASE exprList COLON
            {
            root_0 = (Object)adaptor.nil();

            CASE135=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2231); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE135_tree = (Object)adaptor.create(CASE135);
            adaptor.addChild(root_0, CASE135_tree);
            }
            pushFollow(FOLLOW_exprList_in_caseStmt2233);
            exprList136=exprList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList136.getTree());
            COLON137=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2235); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:397:1: defaultStmt : DEFAULT COLON ;
    public final TinyHaxeTry1Parser.defaultStmt_return defaultStmt() throws RecognitionException {
        TinyHaxeTry1Parser.defaultStmt_return retval = new TinyHaxeTry1Parser.defaultStmt_return();
        retval.start = input.LT(1);
        int defaultStmt_StartIndex = input.index();
        Object root_0 = null;

        Token DEFAULT138=null;
        Token COLON139=null;

        Object DEFAULT138_tree=null;
        Object COLON139_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:397:19: ( DEFAULT COLON )
            // C:\\antlr\\TinyHaxeTry1.g:397:21: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT138=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt2251); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT138_tree = (Object)adaptor.create(DEFAULT138);
            adaptor.addChild(root_0, DEFAULT138_tree);
            }
            COLON139=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt2253); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:399:1: switchStmt : SWITCH LPAREN expr RPAREN block -> ^( SWITCH expr block ) ;
    public final TinyHaxeTry1Parser.switchStmt_return switchStmt() throws RecognitionException {
        TinyHaxeTry1Parser.switchStmt_return retval = new TinyHaxeTry1Parser.switchStmt_return();
        retval.start = input.LT(1);
        int switchStmt_StartIndex = input.index();
        Object root_0 = null;

        Token SWITCH140=null;
        Token LPAREN141=null;
        Token RPAREN143=null;
        TinyHaxeTry1Parser.expr_return expr142 = null;

        TinyHaxeTry1Parser.block_return block144 = null;


        Object SWITCH140_tree=null;
        Object LPAREN141_tree=null;
        Object RPAREN143_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:399:19: ( SWITCH LPAREN expr RPAREN block -> ^( SWITCH expr block ) )
            // C:\\antlr\\TinyHaxeTry1.g:399:21: SWITCH LPAREN expr RPAREN block
            {
            SWITCH140=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchStmt2270); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH140);

            LPAREN141=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_switchStmt2272); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN141);

            pushFollow(FOLLOW_expr_in_switchStmt2274);
            expr142=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr142.getTree());
            RPAREN143=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_switchStmt2276); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN143);

            pushFollow(FOLLOW_block_in_switchStmt2278);
            block144=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block144.getTree());


            // AST REWRITE
            // elements: SWITCH, expr, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 399:53: -> ^( SWITCH expr block )
            {
                // C:\\antlr\\TinyHaxeTry1.g:399:56: ^( SWITCH expr block )
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
    // C:\\antlr\\TinyHaxeTry1.g:401:1: tryStmt : TRY block catchStmtList -> ^( TRY block catchStmtList ) ;
    public final TinyHaxeTry1Parser.tryStmt_return tryStmt() throws RecognitionException {
        TinyHaxeTry1Parser.tryStmt_return retval = new TinyHaxeTry1Parser.tryStmt_return();
        retval.start = input.LT(1);
        int tryStmt_StartIndex = input.index();
        Object root_0 = null;

        Token TRY145=null;
        TinyHaxeTry1Parser.block_return block146 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList147 = null;


        Object TRY145_tree=null;
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_catchStmtList=new RewriteRuleSubtreeStream(adaptor,"rule catchStmtList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:401:19: ( TRY block catchStmtList -> ^( TRY block catchStmtList ) )
            // C:\\antlr\\TinyHaxeTry1.g:401:21: TRY block catchStmtList
            {
            TRY145=(Token)match(input,TRY,FOLLOW_TRY_in_tryStmt2307); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TRY.add(TRY145);

            pushFollow(FOLLOW_block_in_tryStmt2309);
            block146=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block146.getTree());
            pushFollow(FOLLOW_catchStmtList_in_tryStmt2311);
            catchStmtList147=catchStmtList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList147.getTree());


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
            // 401:45: -> ^( TRY block catchStmtList )
            {
                // C:\\antlr\\TinyHaxeTry1.g:401:48: ^( TRY block catchStmtList )
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
    // C:\\antlr\\TinyHaxeTry1.g:403:1: catchStmtList : ( catchStmt catchStmtList | );
    public final TinyHaxeTry1Parser.catchStmtList_return catchStmtList() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmtList_return retval = new TinyHaxeTry1Parser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.catchStmt_return catchStmt148 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList149 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:403:19: ( catchStmt catchStmtList | )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==CATCH) ) {
                alt30=1;
            }
            else if ( (LA30_0==EOF||(LA30_0>=SEMI && LA30_0<=DOT)||(LA30_0>=PUBLIC && LA30_0<=RBRACKET)||LA30_0==BANG||LA30_0==COLON||(LA30_0>=GT && LA30_0<=IN)||(LA30_0>=SWITCH && LA30_0<=TRY)||(LA30_0>=ELLIPSIS && LA30_0<=CAST)||(LA30_0>=VAR && LA30_0<=CLASS)||(LA30_0>=LONGLITERAL && LA30_0<=FLOATNUM)||(LA30_0>=PLUSEQ && LA30_0<=PERCENTEQ)||(LA30_0>=159 && LA30_0<=161)) ) {
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
                    // C:\\antlr\\TinyHaxeTry1.g:403:21: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catchStmt_in_catchStmtList2334);
                    catchStmt148=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt148.getTree());
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList2336);
                    catchStmtList149=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList149.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:405:2: 
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
    // C:\\antlr\\TinyHaxeTry1.g:406:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH param block ) ;
    public final TinyHaxeTry1Parser.catchStmt_return catchStmt() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmt_return retval = new TinyHaxeTry1Parser.catchStmt_return();
        retval.start = input.LT(1);
        int catchStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CATCH150=null;
        Token LPAREN151=null;
        Token RPAREN153=null;
        TinyHaxeTry1Parser.param_return param152 = null;

        TinyHaxeTry1Parser.block_return block154 = null;


        Object CATCH150_tree=null;
        Object LPAREN151_tree=null;
        Object RPAREN153_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:406:19: ( CATCH LPAREN param RPAREN block -> ^( CATCH param block ) )
            // C:\\antlr\\TinyHaxeTry1.g:406:21: CATCH LPAREN param RPAREN block
            {
            CATCH150=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2375); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH150);

            LPAREN151=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2377); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN151);

            pushFollow(FOLLOW_param_in_catchStmt2379);
            param152=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param152.getTree());
            RPAREN153=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2381); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN153);

            pushFollow(FOLLOW_block_in_catchStmt2383);
            block154=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block154.getTree());


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
            // 406:53: -> ^( CATCH param block )
            {
                // C:\\antlr\\TinyHaxeTry1.g:406:56: ^( CATCH param block )
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
    // C:\\antlr\\TinyHaxeTry1.g:410:1: exprListOpt : ( exprList | );
    public final TinyHaxeTry1Parser.exprListOpt_return exprListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.exprListOpt_return retval = new TinyHaxeTry1Parser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.exprList_return exprList155 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:410:19: ( exprList | )
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
            case 159:
            case 160:
            case 161:
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
                    // C:\\antlr\\TinyHaxeTry1.g:410:21: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprList_in_exprListOpt2410);
                    exprList155=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList155.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:412:2: 
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
    // C:\\antlr\\TinyHaxeTry1.g:413:1: exprList : expr ( COMMA expr )* ;
    public final TinyHaxeTry1Parser.exprList_return exprList() throws RecognitionException {
        TinyHaxeTry1Parser.exprList_return retval = new TinyHaxeTry1Parser.exprList_return();
        retval.start = input.LT(1);
        int exprList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA157=null;
        TinyHaxeTry1Parser.expr_return expr156 = null;

        TinyHaxeTry1Parser.expr_return expr158 = null;


        Object COMMA157_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:413:19: ( expr ( COMMA expr )* )
            // C:\\antlr\\TinyHaxeTry1.g:413:21: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_in_exprList2450);
            expr156=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr156.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:413:26: ( COMMA expr )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:413:27: COMMA expr
            	    {
            	    COMMA157=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2453); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expr_in_exprList2456);
            	    expr158=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr158.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:415:1: expr : assignExpr ;
    public final TinyHaxeTry1Parser.expr_return expr() throws RecognitionException {
        TinyHaxeTry1Parser.expr_return retval = new TinyHaxeTry1Parser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.assignExpr_return assignExpr159 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:415:19: ( assignExpr )
            // C:\\antlr\\TinyHaxeTry1.g:415:21: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpr_in_expr2480);
            assignExpr159=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr159.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:417:1: assignExpr : iterExpr ( assignOp iterExpr )* ;
    public final TinyHaxeTry1Parser.assignExpr_return assignExpr() throws RecognitionException {
        TinyHaxeTry1Parser.assignExpr_return retval = new TinyHaxeTry1Parser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr160 = null;

        TinyHaxeTry1Parser.assignOp_return assignOp161 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr162 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:417:19: ( iterExpr ( assignOp iterExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:417:21: iterExpr ( assignOp iterExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_iterExpr_in_assignExpr2496);
            iterExpr160=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr160.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:417:30: ( assignOp iterExpr )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==EQ||(LA33_0>=PLUSEQ && LA33_0<=PERCENTEQ)||(LA33_0>=159 && LA33_0<=161)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:417:31: assignOp iterExpr
            	    {
            	    pushFollow(FOLLOW_assignOp_in_assignExpr2499);
            	    assignOp161=assignOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp161.getTree(), root_0);
            	    pushFollow(FOLLOW_iterExpr_in_assignExpr2502);
            	    iterExpr162=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr162.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:419:1: iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
    public final TinyHaxeTry1Parser.iterExpr_return iterExpr() throws RecognitionException {
        TinyHaxeTry1Parser.iterExpr_return retval = new TinyHaxeTry1Parser.iterExpr_return();
        retval.start = input.LT(1);
        int iterExpr_StartIndex = input.index();
        Object root_0 = null;

        Token ELLIPSIS164=null;
        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr163 = null;

        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr165 = null;


        Object ELLIPSIS164_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:419:19: ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:419:21: ternaryExpr ( ELLIPSIS ternaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2523);
            ternaryExpr163=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr163.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:419:33: ( ELLIPSIS ternaryExpr )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ELLIPSIS) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:419:34: ELLIPSIS ternaryExpr
            	    {
            	    ELLIPSIS164=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2526); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ELLIPSIS164_tree = (Object)adaptor.create(ELLIPSIS164);
            	    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS164_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2529);
            	    ternaryExpr165=ternaryExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr165.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:421:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
    public final TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        TinyHaxeTry1Parser.ternaryExpr_return retval = new TinyHaxeTry1Parser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        Token QUES167=null;
        Token COLON169=null;
        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr166 = null;

        TinyHaxeTry1Parser.expr_return expr168 = null;

        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr170 = null;


        Object QUES167_tree=null;
        Object COLON169_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:421:19: ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:421:21: logicOrExpr ( QUES expr COLON logicOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2552);
            logicOrExpr166=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr166.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:421:33: ( QUES expr COLON logicOrExpr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==QUES) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:421:34: QUES expr COLON logicOrExpr
            	    {
            	    QUES167=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2555); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    QUES167_tree = (Object)adaptor.create(QUES167);
            	    root_0 = (Object)adaptor.becomeRoot(QUES167_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_in_ternaryExpr2558);
            	    expr168=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr168.getTree());
            	    COLON169=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2560); if (state.failed) return retval;
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2563);
            	    logicOrExpr170=logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr170.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:423:1: logicOrExpr : ( logicAndExpr ) ( BARBAR logicAndExpr )* ;
    public final TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicOrExpr_return retval = new TinyHaxeTry1Parser.logicOrExpr_return();
        retval.start = input.LT(1);
        int logicOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BARBAR172=null;
        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr171 = null;

        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr173 = null;


        Object BARBAR172_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:423:19: ( ( logicAndExpr ) ( BARBAR logicAndExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:423:21: ( logicAndExpr ) ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:423:21: ( logicAndExpr )
            // C:\\antlr\\TinyHaxeTry1.g:423:22: logicAndExpr
            {
            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2581);
            logicAndExpr171=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr171.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:423:36: ( BARBAR logicAndExpr )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==BARBAR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:423:37: BARBAR logicAndExpr
            	    {
            	    BARBAR172=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2585); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR172_tree = (Object)adaptor.create(BARBAR172);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR172_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2588);
            	    logicAndExpr173=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr173.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:425:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
    public final TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicAndExpr_return retval = new TinyHaxeTry1Parser.logicAndExpr_return();
        retval.start = input.LT(1);
        int logicAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token AMPAMP175=null;
        TinyHaxeTry1Parser.cmpExpr_return cmpExpr174 = null;

        TinyHaxeTry1Parser.cmpExpr_return cmpExpr176 = null;


        Object AMPAMP175_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:425:19: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:425:21: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:425:21: ( cmpExpr )
            // C:\\antlr\\TinyHaxeTry1.g:425:22: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2605);
            cmpExpr174=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr174.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:425:31: ( AMPAMP cmpExpr )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==AMPAMP) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:425:32: AMPAMP cmpExpr
            	    {
            	    AMPAMP175=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2609); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP175_tree = (Object)adaptor.create(AMPAMP175);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP175_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2612);
            	    cmpExpr176=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr176.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:427:1: cmpExpr : ( bitExpr ) ( EQEQ bitExpr | BANGEQ bitExpr | GTEQ bitExpr | LTEQ bitExpr | GT bitExpr | LT bitExpr )* ;
    public final TinyHaxeTry1Parser.cmpExpr_return cmpExpr() throws RecognitionException {
        TinyHaxeTry1Parser.cmpExpr_return retval = new TinyHaxeTry1Parser.cmpExpr_return();
        retval.start = input.LT(1);
        int cmpExpr_StartIndex = input.index();
        Object root_0 = null;

        Token EQEQ178=null;
        Token BANGEQ180=null;
        Token GTEQ182=null;
        Token LTEQ184=null;
        Token GT186=null;
        Token LT188=null;
        TinyHaxeTry1Parser.bitExpr_return bitExpr177 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr179 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr181 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr183 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr185 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr187 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr189 = null;


        Object EQEQ178_tree=null;
        Object BANGEQ180_tree=null;
        Object GTEQ182_tree=null;
        Object LTEQ184_tree=null;
        Object GT186_tree=null;
        Object LT188_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:427:19: ( ( bitExpr ) ( EQEQ bitExpr | BANGEQ bitExpr | GTEQ bitExpr | LTEQ bitExpr | GT bitExpr | LT bitExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:427:21: ( bitExpr ) ( EQEQ bitExpr | BANGEQ bitExpr | GTEQ bitExpr | LTEQ bitExpr | GT bitExpr | LT bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:427:21: ( bitExpr )
            // C:\\antlr\\TinyHaxeTry1.g:427:22: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2634);
            bitExpr177=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr177.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:427:31: ( EQEQ bitExpr | BANGEQ bitExpr | GTEQ bitExpr | LTEQ bitExpr | GT bitExpr | LT bitExpr )*
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
            	    // C:\\antlr\\TinyHaxeTry1.g:427:32: EQEQ bitExpr
            	    {
            	    EQEQ178=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2638); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    EQEQ178_tree = (Object)adaptor.create(EQEQ178);
            	    root_0 = (Object)adaptor.becomeRoot(EQEQ178_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2641);
            	    bitExpr179=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr179.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:427:48: BANGEQ bitExpr
            	    {
            	    BANGEQ180=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2645); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BANGEQ180_tree = (Object)adaptor.create(BANGEQ180);
            	    root_0 = (Object)adaptor.becomeRoot(BANGEQ180_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2648);
            	    bitExpr181=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr181.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:427:66: GTEQ bitExpr
            	    {
            	    GTEQ182=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2652); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTEQ182_tree = (Object)adaptor.create(GTEQ182);
            	    root_0 = (Object)adaptor.becomeRoot(GTEQ182_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2655);
            	    bitExpr183=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr183.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\antlr\\TinyHaxeTry1.g:427:82: LTEQ bitExpr
            	    {
            	    LTEQ184=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2659); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTEQ184_tree = (Object)adaptor.create(LTEQ184);
            	    root_0 = (Object)adaptor.becomeRoot(LTEQ184_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2662);
            	    bitExpr185=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr185.getTree());

            	    }
            	    break;
            	case 5 :
            	    // C:\\antlr\\TinyHaxeTry1.g:427:98: GT bitExpr
            	    {
            	    GT186=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2666); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GT186_tree = (Object)adaptor.create(GT186);
            	    root_0 = (Object)adaptor.becomeRoot(GT186_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2670);
            	    bitExpr187=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr187.getTree());

            	    }
            	    break;
            	case 6 :
            	    // C:\\antlr\\TinyHaxeTry1.g:427:113: LT bitExpr
            	    {
            	    LT188=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2674); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LT188_tree = (Object)adaptor.create(LT188);
            	    root_0 = (Object)adaptor.becomeRoot(LT188_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2678);
            	    bitExpr189=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr189.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:429:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
    public final TinyHaxeTry1Parser.bitExpr_return bitExpr() throws RecognitionException {
        TinyHaxeTry1Parser.bitExpr_return retval = new TinyHaxeTry1Parser.bitExpr_return();
        retval.start = input.LT(1);
        int bitExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BAR191=null;
        Token AMP193=null;
        Token CARET195=null;
        TinyHaxeTry1Parser.shiftExpr_return shiftExpr190 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr192 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr194 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr196 = null;


        Object BAR191_tree=null;
        Object AMP193_tree=null;
        Object CARET195_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:429:19: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:429:21: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:429:21: ( shiftExpr )
            // C:\\antlr\\TinyHaxeTry1.g:429:22: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2700);
            shiftExpr190=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr190.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:429:33: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
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
            	    // C:\\antlr\\TinyHaxeTry1.g:429:34: BAR shiftExpr
            	    {
            	    BAR191=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2704); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR191_tree = (Object)adaptor.create(BAR191);
            	    root_0 = (Object)adaptor.becomeRoot(BAR191_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2707);
            	    shiftExpr192=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr192.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:429:51: AMP shiftExpr
            	    {
            	    AMP193=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2711); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP193_tree = (Object)adaptor.create(AMP193);
            	    root_0 = (Object)adaptor.becomeRoot(AMP193_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2714);
            	    shiftExpr194=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr194.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:429:67: CARET shiftExpr
            	    {
            	    CARET195=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2717); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET195_tree = (Object)adaptor.create(CARET195);
            	    root_0 = (Object)adaptor.becomeRoot(CARET195_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2720);
            	    shiftExpr196=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr196.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:431:1: shiftExpr : ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )* ;
    public final TinyHaxeTry1Parser.shiftExpr_return shiftExpr() throws RecognitionException {
        TinyHaxeTry1Parser.shiftExpr_return retval = new TinyHaxeTry1Parser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LTLT198=null;
        Token GTGT200=null;
        Token GTGTGT202=null;
        TinyHaxeTry1Parser.addExpr_return addExpr197 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr199 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr201 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr203 = null;


        Object LTLT198_tree=null;
        Object GTGT200_tree=null;
        Object GTGTGT202_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:431:19: ( ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:431:21: ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:431:21: ( addExpr )
            // C:\\antlr\\TinyHaxeTry1.g:431:22: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2740);
            addExpr197=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr197.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:431:31: ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )*
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
            	    // C:\\antlr\\TinyHaxeTry1.g:431:32: LTLT addExpr
            	    {
            	    LTLT198=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2744); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT198_tree = (Object)adaptor.create(LTLT198);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT198_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2748);
            	    addExpr199=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr199.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:431:49: GTGT addExpr
            	    {
            	    GTGT200=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr2752); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGT200_tree = (Object)adaptor.create(GTGT200);
            	    root_0 = (Object)adaptor.becomeRoot(GTGT200_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2756);
            	    addExpr201=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr201.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:431:66: GTGTGT addExpr
            	    {
            	    GTGTGT202=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2760); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT202_tree = (Object)adaptor.create(GTGTGT202);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT202_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2763);
            	    addExpr203=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr203.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:434:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
    public final TinyHaxeTry1Parser.addExpr_return addExpr() throws RecognitionException {
        TinyHaxeTry1Parser.addExpr_return retval = new TinyHaxeTry1Parser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUS205=null;
        Token SUB206=null;
        TinyHaxeTry1Parser.multExpr_return multExpr204 = null;

        TinyHaxeTry1Parser.multExpr_return multExpr207 = null;


        Object PLUS205_tree=null;
        Object SUB206_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:434:19: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:434:21: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:434:21: ( multExpr )
            // C:\\antlr\\TinyHaxeTry1.g:434:22: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2786);
            multExpr204=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr204.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:434:32: ( ( PLUS | SUB ) multExpr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=PLUS && LA42_0<=SUB)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:434:33: ( PLUS | SUB ) multExpr
            	    {
            	    // C:\\antlr\\TinyHaxeTry1.g:434:33: ( PLUS | SUB )
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
            	            // C:\\antlr\\TinyHaxeTry1.g:434:34: PLUS
            	            {
            	            PLUS205=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2791); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS205_tree = (Object)adaptor.create(PLUS205);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS205_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\antlr\\TinyHaxeTry1.g:434:42: SUB
            	            {
            	            SUB206=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2796); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB206_tree = (Object)adaptor.create(SUB206);
            	            root_0 = (Object)adaptor.becomeRoot(SUB206_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExpr_in_addExpr2800);
            	    multExpr207=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr207.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:436:1: multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
    public final TinyHaxeTry1Parser.multExpr_return multExpr() throws RecognitionException {
        TinyHaxeTry1Parser.multExpr_return retval = new TinyHaxeTry1Parser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token STAR209=null;
        Token SLASH210=null;
        Token PERCENT211=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr208 = null;

        TinyHaxeTry1Parser.prefixExpr_return prefixExpr212 = null;


        Object STAR209_tree=null;
        Object SLASH210_tree=null;
        Object PERCENT211_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:436:19: ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:436:21: ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:436:21: ( prefixExpr )
            // C:\\antlr\\TinyHaxeTry1.g:436:22: prefixExpr
            {
            pushFollow(FOLLOW_prefixExpr_in_multExpr2822);
            prefixExpr208=prefixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr208.getTree());

            }

            // C:\\antlr\\TinyHaxeTry1.g:436:34: ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=STAR && LA44_0<=PERCENT)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:436:35: ( STAR | SLASH | PERCENT ) prefixExpr
            	    {
            	    // C:\\antlr\\TinyHaxeTry1.g:436:35: ( STAR | SLASH | PERCENT )
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
            	            // C:\\antlr\\TinyHaxeTry1.g:436:36: STAR
            	            {
            	            STAR209=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2827); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR209_tree = (Object)adaptor.create(STAR209);
            	            root_0 = (Object)adaptor.becomeRoot(STAR209_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\antlr\\TinyHaxeTry1.g:436:42: SLASH
            	            {
            	            SLASH210=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2830); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH210_tree = (Object)adaptor.create(SLASH210);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH210_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\antlr\\TinyHaxeTry1.g:436:49: PERCENT
            	            {
            	            PERCENT211=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2833); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT211_tree = (Object)adaptor.create(PERCENT211);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT211_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2837);
            	    prefixExpr212=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr212.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:438:1: prefixExpr : ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr );
    public final TinyHaxeTry1Parser.prefixExpr_return prefixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.prefixExpr_return retval = new TinyHaxeTry1Parser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set213=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr214 = null;

        TinyHaxeTry1Parser.newExpr_return newExpr215 = null;

        TinyHaxeTry1Parser.cast_return cast216 = null;

        TinyHaxeTry1Parser.suffixExpr_return suffixExpr217 = null;


        Object set213_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:438:19: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr )
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
            case 159:
            case 160:
            case 161:
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
                    // C:\\antlr\\TinyHaxeTry1.g:438:21: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    set213=(Token)input.LT(1);
                    if ( input.LA(1)==BANG||input.LA(1)==SUB||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set213));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2867);
                    prefixExpr214=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr214.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:439:25: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpr_in_prefixExpr2893);
                    newExpr215=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr215.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:440:25: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cast_in_prefixExpr2919);
                    cast216=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast216.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:441:25: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr2945);
                    suffixExpr217=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr217.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:453:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR value exprListOpt ) | value DOT IDENTIFIER | value LBRACKET expr RBRACKET | value PLUSPLUS | value SUBSUB | value );
    public final TinyHaxeTry1Parser.suffixExpr_return suffixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.suffixExpr_return retval = new TinyHaxeTry1Parser.suffixExpr_return();
        retval.start = input.LT(1);
        int suffixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN219=null;
        Token RPAREN221=null;
        Token DOT223=null;
        Token IDENTIFIER224=null;
        Token LBRACKET226=null;
        Token RBRACKET228=null;
        Token PLUSPLUS230=null;
        Token SUBSUB232=null;
        TinyHaxeTry1Parser.value_return value218 = null;

        TinyHaxeTry1Parser.exprListOpt_return exprListOpt220 = null;

        TinyHaxeTry1Parser.value_return value222 = null;

        TinyHaxeTry1Parser.value_return value225 = null;

        TinyHaxeTry1Parser.expr_return expr227 = null;

        TinyHaxeTry1Parser.value_return value229 = null;

        TinyHaxeTry1Parser.value_return value231 = null;

        TinyHaxeTry1Parser.value_return value233 = null;


        Object LPAREN219_tree=null;
        Object RPAREN221_tree=null;
        Object DOT223_tree=null;
        Object IDENTIFIER224_tree=null;
        Object LBRACKET226_tree=null;
        Object RBRACKET228_tree=null;
        Object PLUSPLUS230_tree=null;
        Object SUBSUB232_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:454:2: ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR value exprListOpt ) | value DOT IDENTIFIER | value LBRACKET expr RBRACKET | value PLUSPLUS | value SUBSUB | value )
            int alt46=6;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:454:4: value LPAREN exprListOpt RPAREN
                    {
                    pushFollow(FOLLOW_value_in_suffixExpr2966);
                    value218=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value218.getTree());
                    LPAREN219=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_suffixExpr2968); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN219);

                    pushFollow(FOLLOW_exprListOpt_in_suffixExpr2970);
                    exprListOpt220=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt220.getTree());
                    RPAREN221=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_suffixExpr2972); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN221);



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
                    // 454:36: -> ^( SUFFIX_EXPR value exprListOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:454:39: ^( SUFFIX_EXPR value exprListOpt )
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
                    // C:\\antlr\\TinyHaxeTry1.g:455:4: value DOT IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2987);
                    value222=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value222.getTree());
                    DOT223=(Token)match(input,DOT,FOLLOW_DOT_in_suffixExpr2989); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT223_tree = (Object)adaptor.create(DOT223);
                    adaptor.addChild(root_0, DOT223_tree);
                    }
                    IDENTIFIER224=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_suffixExpr2991); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER224_tree = (Object)adaptor.create(IDENTIFIER224);
                    adaptor.addChild(root_0, IDENTIFIER224_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:456:4: value LBRACKET expr RBRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr2997);
                    value225=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value225.getTree());
                    LBRACKET226=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_suffixExpr2999); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACKET226_tree = (Object)adaptor.create(LBRACKET226);
                    adaptor.addChild(root_0, LBRACKET226_tree);
                    }
                    pushFollow(FOLLOW_expr_in_suffixExpr3001);
                    expr227=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr227.getTree());
                    RBRACKET228=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_suffixExpr3003); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACKET228_tree = (Object)adaptor.create(RBRACKET228);
                    adaptor.addChild(root_0, RBRACKET228_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:457:4: value PLUSPLUS
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr3008);
                    value229=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value229.getTree());
                    PLUSPLUS230=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr3010); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUSPLUS230_tree = (Object)adaptor.create(PLUSPLUS230);
                    adaptor.addChild(root_0, PLUSPLUS230_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:458:4: value SUBSUB
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr3016);
                    value231=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value231.getTree());
                    SUBSUB232=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr3018); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUBSUB232_tree = (Object)adaptor.create(SUBSUB232);
                    adaptor.addChild(root_0, SUBSUB232_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\antlr\\TinyHaxeTry1.g:459:4: value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_suffixExpr3023);
                    value233=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value233.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:463:1: value : ( funcLit | arrayLit | objLit | NULL | IDENTIFIER | elementarySymbol | LPAREN ( expr | statement ) RPAREN | );
    public final TinyHaxeTry1Parser.value_return value() throws RecognitionException {
        TinyHaxeTry1Parser.value_return retval = new TinyHaxeTry1Parser.value_return();
        retval.start = input.LT(1);
        int value_StartIndex = input.index();
        Object root_0 = null;

        Token NULL237=null;
        Token IDENTIFIER238=null;
        Token LPAREN240=null;
        Token RPAREN243=null;
        TinyHaxeTry1Parser.funcLit_return funcLit234 = null;

        TinyHaxeTry1Parser.arrayLit_return arrayLit235 = null;

        TinyHaxeTry1Parser.objLit_return objLit236 = null;

        TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol239 = null;

        TinyHaxeTry1Parser.expr_return expr241 = null;

        TinyHaxeTry1Parser.statement_return statement242 = null;


        Object NULL237_tree=null;
        Object IDENTIFIER238_tree=null;
        Object LPAREN240_tree=null;
        Object RPAREN243_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:463:7: ( funcLit | arrayLit | objLit | NULL | IDENTIFIER | elementarySymbol | LPAREN ( expr | statement ) RPAREN | )
            int alt48=8;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:463:9: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcLit_in_value3034);
                    funcLit234=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit234.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:464:25: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLit_in_value3061);
                    arrayLit235=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit235.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:465:25: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objLit_in_value3087);
                    objLit236=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit236.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:466:25: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL237=(Token)match(input,NULL,FOLLOW_NULL_in_value3113); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL237_tree = (Object)adaptor.create(NULL237);
                    adaptor.addChild(root_0, NULL237_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:467:25: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER238=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_value3139); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER238_tree = (Object)adaptor.create(IDENTIFIER238);
                    adaptor.addChild(root_0, IDENTIFIER238_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\antlr\\TinyHaxeTry1.g:468:25: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elementarySymbol_in_value3165);
                    elementarySymbol239=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol239.getTree());

                    }
                    break;
                case 7 :
                    // C:\\antlr\\TinyHaxeTry1.g:469:25: LPAREN ( expr | statement ) RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN240=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value3191); if (state.failed) return retval;
                    // C:\\antlr\\TinyHaxeTry1.g:469:33: ( expr | statement )
                    int alt47=2;
                    alt47 = dfa47.predict(input);
                    switch (alt47) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:469:34: expr
                            {
                            pushFollow(FOLLOW_expr_in_value3195);
                            expr241=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr241.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\antlr\\TinyHaxeTry1.g:469:39: statement
                            {
                            pushFollow(FOLLOW_statement_in_value3197);
                            statement242=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement242.getTree());

                            }
                            break;

                    }

                    RPAREN243=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value3200); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // C:\\antlr\\TinyHaxeTry1.g:472:9: 
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
    // C:\\antlr\\TinyHaxeTry1.g:473:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW type exprListOpt ) ;
    public final TinyHaxeTry1Parser.newExpr_return newExpr() throws RecognitionException {
        TinyHaxeTry1Parser.newExpr_return retval = new TinyHaxeTry1Parser.newExpr_return();
        retval.start = input.LT(1);
        int newExpr_StartIndex = input.index();
        Object root_0 = null;

        Token NEW244=null;
        Token LPAREN246=null;
        Token RPAREN248=null;
        TinyHaxeTry1Parser.type_return type245 = null;

        TinyHaxeTry1Parser.exprListOpt_return exprListOpt247 = null;


        Object NEW244_tree=null;
        Object LPAREN246_tree=null;
        Object RPAREN248_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:473:19: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW type exprListOpt ) )
            // C:\\antlr\\TinyHaxeTry1.g:473:21: NEW type LPAREN exprListOpt RPAREN
            {
            NEW244=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr3258); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW244);

            pushFollow(FOLLOW_type_in_newExpr3260);
            type245=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type245.getTree());
            LPAREN246=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr3262); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN246);

            pushFollow(FOLLOW_exprListOpt_in_newExpr3264);
            exprListOpt247=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt247.getTree());
            RPAREN248=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr3266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN248);



            // AST REWRITE
            // elements: exprListOpt, NEW, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 473:56: -> ^( NEW type exprListOpt )
            {
                // C:\\antlr\\TinyHaxeTry1.g:473:58: ^( NEW type exprListOpt )
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
    // C:\\antlr\\TinyHaxeTry1.g:475:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) );
    public final TinyHaxeTry1Parser.cast_return cast() throws RecognitionException {
        TinyHaxeTry1Parser.cast_return retval = new TinyHaxeTry1Parser.cast_return();
        retval.start = input.LT(1);
        int cast_StartIndex = input.index();
        Object root_0 = null;

        Token CAST249=null;
        Token LPAREN250=null;
        Token COMMA252=null;
        Token RPAREN254=null;
        Token CAST255=null;
        Token LPAREN256=null;
        Token RPAREN258=null;
        TinyHaxeTry1Parser.expr_return expr251 = null;

        TinyHaxeTry1Parser.funcType_return funcType253 = null;

        TinyHaxeTry1Parser.expr_return expr257 = null;


        Object CAST249_tree=null;
        Object LPAREN250_tree=null;
        Object COMMA252_tree=null;
        Object RPAREN254_tree=null;
        Object CAST255_tree=null;
        Object LPAREN256_tree=null;
        Object RPAREN258_tree=null;
        RewriteRuleTokenStream stream_CAST=new RewriteRuleTokenStream(adaptor,"token CAST");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:475:19: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) )
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
                    // C:\\antlr\\TinyHaxeTry1.g:475:21: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    CAST249=(Token)match(input,CAST,FOLLOW_CAST_in_cast3297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST249);

                    LPAREN250=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN250);

                    pushFollow(FOLLOW_expr_in_cast3301);
                    expr251=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr251.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:475:38: ( COMMA funcType )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==COMMA) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:475:39: COMMA funcType
                            {
                            COMMA252=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast3304); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA252);

                            pushFollow(FOLLOW_funcType_in_cast3306);
                            funcType253=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType253.getTree());

                            }
                            break;

                    }

                    RPAREN254=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN254);



                    // AST REWRITE
                    // elements: CAST, expr, funcType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 475:63: -> ^( CAST expr ( funcType )? )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:475:66: ^( CAST expr ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // C:\\antlr\\TinyHaxeTry1.g:475:78: ( funcType )?
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
                    // C:\\antlr\\TinyHaxeTry1.g:476:4: CAST LPAREN expr RPAREN
                    {
                    CAST255=(Token)match(input,CAST,FOLLOW_CAST_in_cast3326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST255);

                    LPAREN256=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast3328); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN256);

                    pushFollow(FOLLOW_expr_in_cast3330);
                    expr257=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr257.getTree());
                    RPAREN258=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast3332); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN258);



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
                    // 476:28: -> ^( CAST expr )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:476:30: ^( CAST expr )
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
    // C:\\antlr\\TinyHaxeTry1.g:480:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelDecl_return retval = new TinyHaxeTry1Parser.topLevelDecl_return();
        retval.start = input.LT(1);
        int topLevelDecl_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.classDecl_return classDecl259 = null;

        TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl260 = null;

        TinyHaxeTry1Parser.enumDecl_return enumDecl261 = null;

        TinyHaxeTry1Parser.typedefDecl_return typedefDecl262 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:480:19: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
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
                    // C:\\antlr\\TinyHaxeTry1.g:480:21: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDecl_in_topLevelDecl3355);
                    classDecl259=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl259.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:481:25: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl3381);
                    interfaceDecl260=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl260.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:482:25: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl3407);
                    enumDecl261=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl261.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:483:25: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl3433);
                    typedefDecl262=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl262.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:485:1: enumDecl : ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM IDENTIFIER typeParamOpt enumBody ) ;
    public final TinyHaxeTry1Parser.enumDecl_return enumDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumDecl_return retval = new TinyHaxeTry1Parser.enumDecl_return();
        retval.start = input.LT(1);
        int enumDecl_StartIndex = input.index();
        Object root_0 = null;

        Token ENUM263=null;
        Token IDENTIFIER264=null;
        Token LBRACE266=null;
        Token RBRACE268=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt265 = null;

        TinyHaxeTry1Parser.enumBody_return enumBody267 = null;


        Object ENUM263_tree=null;
        Object IDENTIFIER264_tree=null;
        Object LBRACE266_tree=null;
        Object RBRACE268_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:485:19: ( ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM IDENTIFIER typeParamOpt enumBody ) )
            // C:\\antlr\\TinyHaxeTry1.g:485:21: ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
            {
            ENUM263=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl3451); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM263);

            IDENTIFIER264=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl3453); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER264);

            pushFollow(FOLLOW_typeParamOpt_in_enumDecl3455);
            typeParamOpt265=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt265.getTree());
            LBRACE266=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl3457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE266);

            pushFollow(FOLLOW_enumBody_in_enumDecl3459);
            enumBody267=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody267.getTree());
            RBRACE268=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl3461); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE268);



            // AST REWRITE
            // elements: enumBody, typeParamOpt, ENUM, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 485:73: -> ^( ENUM IDENTIFIER typeParamOpt enumBody )
            {
                // C:\\antlr\\TinyHaxeTry1.g:485:76: ^( ENUM IDENTIFIER typeParamOpt enumBody )
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
    // C:\\antlr\\TinyHaxeTry1.g:487:1: enumBody : ( enumValueDecl )+ ;
    public final TinyHaxeTry1Parser.enumBody_return enumBody() throws RecognitionException {
        TinyHaxeTry1Parser.enumBody_return retval = new TinyHaxeTry1Parser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl269 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:487:19: ( ( enumValueDecl )+ )
            // C:\\antlr\\TinyHaxeTry1.g:487:21: ( enumValueDecl )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\antlr\\TinyHaxeTry1.g:487:21: ( enumValueDecl )+
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
            	    // C:\\antlr\\TinyHaxeTry1.g:487:22: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody3492);
            	    enumValueDecl269=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValueDecl269.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:489:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER SEMI | pp );
    public final TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumValueDecl_return retval = new TinyHaxeTry1Parser.enumValueDecl_return();
        retval.start = input.LT(1);
        int enumValueDecl_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER270=null;
        Token LPAREN271=null;
        Token RPAREN273=null;
        Token SEMI274=null;
        Token IDENTIFIER275=null;
        Token SEMI276=null;
        TinyHaxeTry1Parser.paramList_return paramList272 = null;

        TinyHaxeTry1Parser.pp_return pp277 = null;


        Object IDENTIFIER270_tree=null;
        Object LPAREN271_tree=null;
        Object RPAREN273_tree=null;
        Object SEMI274_tree=null;
        Object IDENTIFIER275_tree=null;
        Object SEMI276_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:489:19: ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER SEMI | pp )
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
                    // C:\\antlr\\TinyHaxeTry1.g:489:20: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER270=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3506); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER270_tree = (Object)adaptor.create(IDENTIFIER270);
                    adaptor.addChild(root_0, IDENTIFIER270_tree);
                    }
                    LPAREN271=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl3508); if (state.failed) return retval;
                    pushFollow(FOLLOW_paramList_in_enumValueDecl3511);
                    paramList272=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList272.getTree());
                    RPAREN273=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl3513); if (state.failed) return retval;
                    SEMI274=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3516); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:490:24: IDENTIFIER SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENTIFIER275=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3542); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER275_tree = (Object)adaptor.create(IDENTIFIER275);
                    adaptor.addChild(root_0, IDENTIFIER275_tree);
                    }
                    SEMI276=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3544); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:491:25: pp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_enumValueDecl3571);
                    pp277=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp277.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:493:1: varDeclList : varDecl varDeclList ;
    public final TinyHaxeTry1Parser.varDeclList_return varDeclList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclList_return retval = new TinyHaxeTry1Parser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl278 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList279 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:493:19: ( varDecl varDeclList )
            // C:\\antlr\\TinyHaxeTry1.g:493:21: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDecl_in_varDeclList3586);
            varDecl278=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl278.getTree());
            pushFollow(FOLLOW_varDeclList_in_varDeclList3588);
            varDeclList279=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList279.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:496:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR_DECLARATION ( declAttrList )? varDeclPartList ) ;
    public final TinyHaxeTry1Parser.varDecl_return varDecl() throws RecognitionException {
        TinyHaxeTry1Parser.varDecl_return retval = new TinyHaxeTry1Parser.varDecl_return();
        retval.start = input.LT(1);
        int varDecl_StartIndex = input.index();
        Object root_0 = null;

        Token VAR281=null;
        Token SEMI283=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList280 = null;

        TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList282 = null;


        Object VAR281_tree=null;
        Object SEMI283_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_varDeclPartList=new RewriteRuleSubtreeStream(adaptor,"rule varDeclPartList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:496:19: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR_DECLARATION ( declAttrList )? varDeclPartList ) )
            // C:\\antlr\\TinyHaxeTry1.g:496:21: ( declAttrList )? VAR varDeclPartList SEMI
            {
            // C:\\antlr\\TinyHaxeTry1.g:496:21: ( declAttrList )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=PUBLIC && LA54_0<=OVERRIDE)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:496:22: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl3610);
                    declAttrList280=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList280.getTree());

                    }
                    break;

            }

            VAR281=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl3614); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR281);

            pushFollow(FOLLOW_varDeclPartList_in_varDecl3616);
            varDeclPartList282=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList282.getTree());
            SEMI283=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl3618); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI283);



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
            // 496:62: -> ^( VAR_DECLARATION ( declAttrList )? varDeclPartList )
            {
                // C:\\antlr\\TinyHaxeTry1.g:496:64: ^( VAR_DECLARATION ( declAttrList )? varDeclPartList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DECLARATION, "VAR_DECLARATION"), root_1);

                // C:\\antlr\\TinyHaxeTry1.g:496:82: ( declAttrList )?
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
    // C:\\antlr\\TinyHaxeTry1.g:499:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
    public final TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclPartList_return retval = new TinyHaxeTry1Parser.varDeclPartList_return();
        retval.start = input.LT(1);
        int varDeclPartList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA285=null;
        TinyHaxeTry1Parser.varDeclPart_return varDeclPart284 = null;

        TinyHaxeTry1Parser.varDeclPart_return varDeclPart286 = null;


        Object COMMA285_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:499:19: ( varDeclPart ( COMMA varDeclPart )* )
            // C:\\antlr\\TinyHaxeTry1.g:499:21: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3642);
            varDeclPart284=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart284.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:499:33: ( COMMA varDeclPart )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==COMMA) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:499:34: COMMA varDeclPart
            	    {
            	    COMMA285=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList3645); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3648);
            	    varDeclPart286=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart286.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:501:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInitOpt ;
    public final TinyHaxeTry1Parser.varDeclPart_return varDeclPart() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclPart_return retval = new TinyHaxeTry1Parser.varDeclPart_return();
        retval.start = input.LT(1);
        int varDeclPart_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER287=null;
        TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt288 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt289 = null;

        TinyHaxeTry1Parser.varInitOpt_return varInitOpt290 = null;


        Object IDENTIFIER287_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:501:19: ( IDENTIFIER propDeclOpt typeTagOpt varInitOpt )
            // C:\\antlr\\TinyHaxeTry1.g:501:20: IDENTIFIER propDeclOpt typeTagOpt varInitOpt
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER287=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart3664); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER287_tree = (Object)adaptor.create(IDENTIFIER287);
            adaptor.addChild(root_0, IDENTIFIER287_tree);
            }
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3666);
            propDeclOpt288=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt288.getTree());
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3668);
            typeTagOpt289=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt289.getTree());
            pushFollow(FOLLOW_varInitOpt_in_varDeclPart3670);
            varInitOpt290=varInitOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varInitOpt290.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:503:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL $a1 $a2) ;
    public final TinyHaxeTry1Parser.propDecl_return propDecl() throws RecognitionException {
        TinyHaxeTry1Parser.propDecl_return retval = new TinyHaxeTry1Parser.propDecl_return();
        retval.start = input.LT(1);
        int propDecl_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN291=null;
        Token COMMA292=null;
        Token RPAREN293=null;
        TinyHaxeTry1Parser.propAccessor_return a1 = null;

        TinyHaxeTry1Parser.propAccessor_return a2 = null;


        Object LPAREN291_tree=null;
        Object COMMA292_tree=null;
        Object RPAREN293_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:503:19: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL $a1 $a2) )
            // C:\\antlr\\TinyHaxeTry1.g:503:21: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN291=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl3688); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN291);

            pushFollow(FOLLOW_propAccessor_in_propDecl3692);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            COMMA292=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl3694); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA292);

            pushFollow(FOLLOW_propAccessor_in_propDecl3698);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            RPAREN293=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl3700); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN293);



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
            // 503:73: -> ^( PROPERTY_DECL $a1 $a2)
            {
                // C:\\antlr\\TinyHaxeTry1.g:503:76: ^( PROPERTY_DECL $a1 $a2)
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
    // C:\\antlr\\TinyHaxeTry1.g:505:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final TinyHaxeTry1Parser.propAccessor_return propAccessor() throws RecognitionException {
        TinyHaxeTry1Parser.propAccessor_return retval = new TinyHaxeTry1Parser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set294=null;

        Object set294_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:505:19: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            // C:\\antlr\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set294=(Token)input.LT(1);
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==DYNAMIC||input.LA(1)==DEFAULT||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set294));
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
    // C:\\antlr\\TinyHaxeTry1.g:510:1: propDeclOpt : ( propDecl | );
    public final TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        TinyHaxeTry1Parser.propDeclOpt_return retval = new TinyHaxeTry1Parser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.propDecl_return propDecl295 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:510:19: ( propDecl | )
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
                    // C:\\antlr\\TinyHaxeTry1.g:510:21: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_propDecl_in_propDeclOpt3818);
                    propDecl295=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl295.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:512:2: 
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
    // C:\\antlr\\TinyHaxeTry1.g:513:1: varInitOpt : ( varInit | -> ^( VAR_INIT ) );
    public final TinyHaxeTry1Parser.varInitOpt_return varInitOpt() throws RecognitionException {
        TinyHaxeTry1Parser.varInitOpt_return retval = new TinyHaxeTry1Parser.varInitOpt_return();
        retval.start = input.LT(1);
        int varInitOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varInit_return varInit296 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:513:19: ( varInit | -> ^( VAR_INIT ) )
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
                    // C:\\antlr\\TinyHaxeTry1.g:513:21: varInit
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varInit_in_varInitOpt3856);
                    varInit296=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit296.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:514:23: 
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
                    // 514:23: -> ^( VAR_INIT )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:514:25: ^( VAR_INIT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_INIT, "VAR_INIT"), root_1);

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
    // C:\\antlr\\TinyHaxeTry1.g:516:1: varInit : EQ expr -> ^( VAR_INIT expr ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:516:19: ( EQ expr -> ^( VAR_INIT expr ) )
            // C:\\antlr\\TinyHaxeTry1.g:516:21: EQ expr
            {
            EQ297=(Token)match(input,EQ,FOLLOW_EQ_in_varInit3903); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ297);

            pushFollow(FOLLOW_expr_in_varInit3905);
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
            // 516:29: -> ^( VAR_INIT expr )
            {
                // C:\\antlr\\TinyHaxeTry1.g:516:31: ^( VAR_INIT expr )
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
    // C:\\antlr\\TinyHaxeTry1.g:518:1: funcDecl : ( declAttrList FUNCTION NEW RPAREN paramList LPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) );
    public final TinyHaxeTry1Parser.funcDecl_return funcDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcDecl_return retval = new TinyHaxeTry1Parser.funcDecl_return();
        retval.start = input.LT(1);
        int funcDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION300=null;
        Token NEW301=null;
        Token RPAREN302=null;
        Token LPAREN304=null;
        Token FUNCTION308=null;
        Token IDENTIFIER309=null;
        Token LPAREN311=null;
        Token RPAREN313=null;
        Token FUNCTION316=null;
        Token NEW317=null;
        Token LPAREN318=null;
        Token RPAREN320=null;
        Token FUNCTION323=null;
        Token IDENTIFIER324=null;
        Token LPAREN326=null;
        Token RPAREN328=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList299 = null;

        TinyHaxeTry1Parser.paramList_return paramList303 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt305 = null;

        TinyHaxeTry1Parser.block_return block306 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList307 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt310 = null;

        TinyHaxeTry1Parser.paramList_return paramList312 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt314 = null;

        TinyHaxeTry1Parser.block_return block315 = null;

        TinyHaxeTry1Parser.paramList_return paramList319 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt321 = null;

        TinyHaxeTry1Parser.block_return block322 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt325 = null;

        TinyHaxeTry1Parser.paramList_return paramList327 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt329 = null;

        TinyHaxeTry1Parser.block_return block330 = null;


        Object FUNCTION300_tree=null;
        Object NEW301_tree=null;
        Object RPAREN302_tree=null;
        Object LPAREN304_tree=null;
        Object FUNCTION308_tree=null;
        Object IDENTIFIER309_tree=null;
        Object LPAREN311_tree=null;
        Object RPAREN313_tree=null;
        Object FUNCTION316_tree=null;
        Object NEW317_tree=null;
        Object LPAREN318_tree=null;
        Object RPAREN320_tree=null;
        Object FUNCTION323_tree=null;
        Object IDENTIFIER324_tree=null;
        Object LPAREN326_tree=null;
        Object RPAREN328_tree=null;
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
            // C:\\antlr\\TinyHaxeTry1.g:518:19: ( declAttrList FUNCTION NEW RPAREN paramList LPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) )
            int alt58=4;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:518:21: declAttrList FUNCTION NEW RPAREN paramList LPAREN typeTagOpt block
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcDecl3930);
                    declAttrList299=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList299.getTree());
                    FUNCTION300=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION300);

                    NEW301=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl3934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW301);

                    RPAREN302=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3936); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN302);

                    pushFollow(FOLLOW_paramList_in_funcDecl3938);
                    paramList303=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList303.getTree());
                    LPAREN304=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN304);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3942);
                    typeTagOpt305=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt305.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl3944);
                    block306=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block306.getTree());


                    // AST REWRITE
                    // elements: FUNCTION, block, paramList, declAttrList, NEW, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 518:88: -> ^( FUNCTION NEW paramList typeTagOpt block declAttrList )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:518:91: ^( FUNCTION NEW paramList typeTagOpt block declAttrList )
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
                    // C:\\antlr\\TinyHaxeTry1.g:519:25: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcDecl3989);
                    declAttrList307=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList307.getTree());
                    FUNCTION308=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION308);

                    IDENTIFIER309=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl3993); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER309);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl3995);
                    typeParamOpt310=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt310.getTree());
                    LPAREN311=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN311);

                    pushFollow(FOLLOW_paramList_in_funcDecl3999);
                    paramList312=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList312.getTree());
                    RPAREN313=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4001); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN313);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4003);
                    typeTagOpt314=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt314.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4005);
                    block315=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block315.getTree());


                    // AST REWRITE
                    // elements: block, IDENTIFIER, paramList, typeTagOpt, FUNCTION, typeParamOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 519:112: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:519:114: ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt )
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
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:520:25: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    FUNCTION316=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4049); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION316);

                    NEW317=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl4051); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW317);

                    LPAREN318=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN318);

                    pushFollow(FOLLOW_paramList_in_funcDecl4055);
                    paramList319=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList319.getTree());
                    RPAREN320=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN320);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4059);
                    typeTagOpt321=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt321.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4061);
                    block322=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block322.getTree());


                    // AST REWRITE
                    // elements: FUNCTION, paramList, typeTagOpt, block, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 520:79: -> ^( FUNCTION NEW paramList typeTagOpt block )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:520:81: ^( FUNCTION NEW paramList typeTagOpt block )
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
                    // C:\\antlr\\TinyHaxeTry1.g:521:25: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    FUNCTION323=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl4103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION323);

                    IDENTIFIER324=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl4105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER324);

                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl4107);
                    typeParamOpt325=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt325.getTree());
                    LPAREN326=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl4109); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN326);

                    pushFollow(FOLLOW_paramList_in_funcDecl4111);
                    paramList327=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList327.getTree());
                    RPAREN328=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl4113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN328);

                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl4115);
                    typeTagOpt329=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt329.getTree());
                    pushFollow(FOLLOW_block_in_funcDecl4117);
                    block330=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block330.getTree());


                    // AST REWRITE
                    // elements: typeParamOpt, block, IDENTIFIER, typeTagOpt, paramList, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 521:99: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:521:101: ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt )
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
    // C:\\antlr\\TinyHaxeTry1.g:523:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );
    public final TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcProtoDecl_return retval = new TinyHaxeTry1Parser.funcProtoDecl_return();
        retval.start = input.LT(1);
        int funcProtoDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION332=null;
        Token NEW333=null;
        Token LPAREN334=null;
        Token RPAREN336=null;
        Token SEMI338=null;
        Token FUNCTION340=null;
        Token IDENTIFIER341=null;
        Token LPAREN343=null;
        Token RPAREN345=null;
        Token SEMI347=null;
        Token FUNCTION348=null;
        Token NEW349=null;
        Token LPAREN350=null;
        Token RPAREN352=null;
        Token SEMI354=null;
        Token FUNCTION355=null;
        Token IDENTIFIER356=null;
        Token LPAREN358=null;
        Token RPAREN360=null;
        Token SEMI362=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList331 = null;

        TinyHaxeTry1Parser.paramList_return paramList335 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt337 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList339 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt342 = null;

        TinyHaxeTry1Parser.paramList_return paramList344 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt346 = null;

        TinyHaxeTry1Parser.paramList_return paramList351 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt353 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt357 = null;

        TinyHaxeTry1Parser.paramList_return paramList359 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt361 = null;


        Object FUNCTION332_tree=null;
        Object NEW333_tree=null;
        Object LPAREN334_tree=null;
        Object RPAREN336_tree=null;
        Object SEMI338_tree=null;
        Object FUNCTION340_tree=null;
        Object IDENTIFIER341_tree=null;
        Object LPAREN343_tree=null;
        Object RPAREN345_tree=null;
        Object SEMI347_tree=null;
        Object FUNCTION348_tree=null;
        Object NEW349_tree=null;
        Object LPAREN350_tree=null;
        Object RPAREN352_tree=null;
        Object SEMI354_tree=null;
        Object FUNCTION355_tree=null;
        Object IDENTIFIER356_tree=null;
        Object LPAREN358_tree=null;
        Object RPAREN360_tree=null;
        Object SEMI362_tree=null;
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
            // C:\\antlr\\TinyHaxeTry1.g:523:19: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) )
            int alt59=4;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:523:21: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4148);
                    declAttrList331=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList331.getTree());
                    FUNCTION332=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION332);

                    NEW333=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW333);

                    LPAREN334=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4154); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN334);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4156);
                    paramList335=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList335.getTree());
                    RPAREN336=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN336);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4160);
                    typeTagOpt337=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt337.getTree());
                    SEMI338=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI338);



                    // AST REWRITE
                    // elements: declAttrList, NEW, paramList, FUNCTION, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 523:87: -> ^( FUNCTION NEW paramList typeTagOpt declAttrList )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:523:90: ^( FUNCTION NEW paramList typeTagOpt declAttrList )
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
                    // C:\\antlr\\TinyHaxeTry1.g:524:25: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl4202);
                    declAttrList339=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList339.getTree());
                    FUNCTION340=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION340);

                    IDENTIFIER341=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER341);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4208);
                    typeParamOpt342=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt342.getTree());
                    LPAREN343=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN343);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4212);
                    paramList344=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList344.getTree());
                    RPAREN345=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN345);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4216);
                    typeTagOpt346=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt346.getTree());
                    SEMI347=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4218); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI347);



                    // AST REWRITE
                    // elements: FUNCTION, declAttrList, paramList, IDENTIFIER, typeTagOpt, typeParamOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 524:111: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:524:113: ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt )
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
                    // C:\\antlr\\TinyHaxeTry1.g:525:25: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION348=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION348);

                    NEW349=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl4261); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW349);

                    LPAREN350=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN350);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4265);
                    paramList351=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList351.getTree());
                    RPAREN352=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4267); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN352);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4269);
                    typeTagOpt353=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt353.getTree());
                    SEMI354=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4271); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI354);



                    // AST REWRITE
                    // elements: typeTagOpt, NEW, FUNCTION, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 525:78: -> ^( FUNCTION NEW paramList typeTagOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:525:81: ^( FUNCTION NEW paramList typeTagOpt )
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
                    // C:\\antlr\\TinyHaxeTry1.g:526:25: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    FUNCTION355=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl4309); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION355);

                    IDENTIFIER356=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl4311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER356);

                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl4313);
                    typeParamOpt357=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt357.getTree());
                    LPAREN358=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl4315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN358);

                    pushFollow(FOLLOW_paramList_in_funcProtoDecl4317);
                    paramList359=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList359.getTree());
                    RPAREN360=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl4319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN360);

                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl4321);
                    typeTagOpt361=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt361.getTree());
                    SEMI362=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl4323); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI362);



                    // AST REWRITE
                    // elements: paramList, FUNCTION, IDENTIFIER, typeParamOpt, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 526:98: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:526:100: ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt )
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
    // C:\\antlr\\TinyHaxeTry1.g:528:1: classDecl : ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBody RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? typeParamOpt inheritListOpt classBody ) ;
    public final TinyHaxeTry1Parser.classDecl_return classDecl() throws RecognitionException {
        TinyHaxeTry1Parser.classDecl_return retval = new TinyHaxeTry1Parser.classDecl_return();
        retval.start = input.LT(1);
        int classDecl_StartIndex = input.index();
        Object root_0 = null;

        Token EXTERN363=null;
        Token CLASS364=null;
        Token IDENTIFIER365=null;
        Token LBRACE368=null;
        Token RBRACE370=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt366 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt367 = null;

        TinyHaxeTry1Parser.classBody_return classBody369 = null;


        Object EXTERN363_tree=null;
        Object CLASS364_tree=null;
        Object IDENTIFIER365_tree=null;
        Object LBRACE368_tree=null;
        Object RBRACE370_tree=null;
        RewriteRuleTokenStream stream_EXTERN=new RewriteRuleTokenStream(adaptor,"token EXTERN");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:528:19: ( ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBody RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? typeParamOpt inheritListOpt classBody ) )
            // C:\\antlr\\TinyHaxeTry1.g:528:21: ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBody RBRACE
            {
            // C:\\antlr\\TinyHaxeTry1.g:528:21: ( EXTERN )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==EXTERN) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:0:0: EXTERN
                    {
                    EXTERN363=(Token)match(input,EXTERN,FOLLOW_EXTERN_in_classDecl4353); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTERN.add(EXTERN363);


                    }
                    break;

            }

            CLASS364=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4356); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS364);

            IDENTIFIER365=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4358); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER365);

            pushFollow(FOLLOW_typeParamOpt_in_classDecl4360);
            typeParamOpt366=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt366.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_classDecl4362);
            inheritListOpt367=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt367.getTree());
            LBRACE368=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classDecl4364); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE368);

            pushFollow(FOLLOW_classBody_in_classDecl4366);
            classBody369=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBody.add(classBody369.getTree());
            RBRACE370=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classDecl4368); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE370);



            // AST REWRITE
            // elements: inheritListOpt, classBody, typeParamOpt, EXTERN, CLASS, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 528:98: -> ^( CLASS IDENTIFIER ( EXTERN )? typeParamOpt inheritListOpt classBody )
            {
                // C:\\antlr\\TinyHaxeTry1.g:528:100: ^( CLASS IDENTIFIER ( EXTERN )? typeParamOpt inheritListOpt classBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CLASS.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // C:\\antlr\\TinyHaxeTry1.g:528:119: ( EXTERN )?
                if ( stream_EXTERN.hasNext() ) {
                    adaptor.addChild(root_1, stream_EXTERN.nextNode());

                }
                stream_EXTERN.reset();
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
    // C:\\antlr\\TinyHaxeTry1.g:530:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );
    public final TinyHaxeTry1Parser.classBody_return classBody() throws RecognitionException {
        TinyHaxeTry1Parser.classBody_return retval = new TinyHaxeTry1Parser.classBody_return();
        retval.start = input.LT(1);
        int classBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl371 = null;

        TinyHaxeTry1Parser.classBody_return classBody372 = null;

        TinyHaxeTry1Parser.funcDecl_return funcDecl373 = null;

        TinyHaxeTry1Parser.classBody_return classBody374 = null;

        TinyHaxeTry1Parser.pp_return pp375 = null;

        TinyHaxeTry1Parser.classBody_return classBody376 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:530:19: ( varDecl classBody | funcDecl classBody | pp classBody | )
            int alt61=4;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:530:21: varDecl classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_classBody4401);
                    varDecl371=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl371.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody4403);
                    classBody372=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody372.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:531:25: funcDecl classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcDecl_in_classBody4429);
                    funcDecl373=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl373.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody4431);
                    classBody374=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody374.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:532:25: pp classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_classBody4457);
                    pp375=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp375.getTree());
                    pushFollow(FOLLOW_classBody_in_classBody4459);
                    classBody376=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody376.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:534:2: 
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
    // C:\\antlr\\TinyHaxeTry1.g:535:1: interfaceDecl : INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
    public final TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceDecl_return retval = new TinyHaxeTry1Parser.interfaceDecl_return();
        retval.start = input.LT(1);
        int interfaceDecl_StartIndex = input.index();
        Object root_0 = null;

        Token INTERFACE377=null;
        Token LBRACE380=null;
        Token RBRACE382=null;
        TinyHaxeTry1Parser.type_return type378 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt379 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody381 = null;


        Object INTERFACE377_tree=null;
        Object LBRACE380_tree=null;
        Object RBRACE382_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:535:19: ( INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            // C:\\antlr\\TinyHaxeTry1.g:535:21: INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            INTERFACE377=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl4494); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE377_tree = (Object)adaptor.create(INTERFACE377);
            adaptor.addChild(root_0, INTERFACE377_tree);
            }
            pushFollow(FOLLOW_type_in_interfaceDecl4496);
            type378=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type378.getTree());
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl4498);
            inheritListOpt379=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt379.getTree());
            LBRACE380=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl4500); if (state.failed) return retval;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl4503);
            interfaceBody381=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody381.getTree());
            RBRACE382=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl4505); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:537:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );
    public final TinyHaxeTry1Parser.interfaceBody_return interfaceBody() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceBody_return retval = new TinyHaxeTry1Parser.interfaceBody_return();
        retval.start = input.LT(1);
        int interfaceBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl383 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody384 = null;

        TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl385 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody386 = null;

        TinyHaxeTry1Parser.pp_return pp387 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody388 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:537:19: ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | )
            int alt62=4;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:537:21: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_interfaceBody4519);
                    varDecl383=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl383.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4521);
                    interfaceBody384=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody384.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:538:25: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody4547);
                    funcProtoDecl385=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl385.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4549);
                    interfaceBody386=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody386.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:539:25: pp interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pp_in_interfaceBody4575);
                    pp387=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp387.getTree());
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody4577);
                    interfaceBody388=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody388.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:541:1: 
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
    // C:\\antlr\\TinyHaxeTry1.g:543:1: inheritList : inherit ( COMMA inherit )* ;
    public final TinyHaxeTry1Parser.inheritList_return inheritList() throws RecognitionException {
        TinyHaxeTry1Parser.inheritList_return retval = new TinyHaxeTry1Parser.inheritList_return();
        retval.start = input.LT(1);
        int inheritList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA390=null;
        TinyHaxeTry1Parser.inherit_return inherit389 = null;

        TinyHaxeTry1Parser.inherit_return inherit391 = null;


        Object COMMA390_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:543:19: ( inherit ( COMMA inherit )* )
            // C:\\antlr\\TinyHaxeTry1.g:543:21: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_inherit_in_inheritList4614);
            inherit389=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit389.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:543:29: ( COMMA inherit )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==COMMA) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:543:30: COMMA inherit
            	    {
            	    COMMA390=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList4617); if (state.failed) return retval;
            	    pushFollow(FOLLOW_inherit_in_inheritList4620);
            	    inherit391=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit391.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:545:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT inheritList ) | -> ^( INHERIT_LIST_OPT ) );
    public final TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.inheritListOpt_return retval = new TinyHaxeTry1Parser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.inheritList_return inheritList392 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:545:19: ( inheritList -> ^( INHERIT_LIST_OPT inheritList ) | -> ^( INHERIT_LIST_OPT ) )
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
                    // C:\\antlr\\TinyHaxeTry1.g:545:21: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt4634);
                    inheritList392=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList392.getTree());


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
                    // 545:33: -> ^( INHERIT_LIST_OPT inheritList )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:545:35: ^( INHERIT_LIST_OPT inheritList )
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
                    // C:\\antlr\\TinyHaxeTry1.g:546:4: 
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
                    // 546:4: -> ^( INHERIT_LIST_OPT )
                    {
                        // C:\\antlr\\TinyHaxeTry1.g:546:6: ^( INHERIT_LIST_OPT )
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
    // C:\\antlr\\TinyHaxeTry1.g:548:1: inherit : ( EXTENDS type | IMPLEMENTS type );
    public final TinyHaxeTry1Parser.inherit_return inherit() throws RecognitionException {
        TinyHaxeTry1Parser.inherit_return retval = new TinyHaxeTry1Parser.inherit_return();
        retval.start = input.LT(1);
        int inherit_StartIndex = input.index();
        Object root_0 = null;

        Token EXTENDS393=null;
        Token IMPLEMENTS395=null;
        TinyHaxeTry1Parser.type_return type394 = null;

        TinyHaxeTry1Parser.type_return type396 = null;


        Object EXTENDS393_tree=null;
        Object IMPLEMENTS395_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:548:19: ( EXTENDS type | IMPLEMENTS type )
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
                    // C:\\antlr\\TinyHaxeTry1.g:548:21: EXTENDS type
                    {
                    root_0 = (Object)adaptor.nil();

                    EXTENDS393=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit4672); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS393_tree = (Object)adaptor.create(EXTENDS393);
                    adaptor.addChild(root_0, EXTENDS393_tree);
                    }
                    pushFollow(FOLLOW_type_in_inherit4674);
                    type394=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type394.getTree());

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:549:25: IMPLEMENTS type
                    {
                    root_0 = (Object)adaptor.nil();

                    IMPLEMENTS395=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit4700); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPLEMENTS395_tree = (Object)adaptor.create(IMPLEMENTS395);
                    adaptor.addChild(root_0, IMPLEMENTS395_tree);
                    }
                    pushFollow(FOLLOW_type_in_inherit4702);
                    type396=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type396.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:551:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final TinyHaxeTry1Parser.typedefDecl_return typedefDecl() throws RecognitionException {
        TinyHaxeTry1Parser.typedefDecl_return retval = new TinyHaxeTry1Parser.typedefDecl_return();
        retval.start = input.LT(1);
        int typedefDecl_StartIndex = input.index();
        Object root_0 = null;

        Token TYPEDEF397=null;
        Token IDENTIFIER398=null;
        Token EQ399=null;
        TinyHaxeTry1Parser.funcType_return funcType400 = null;


        Object TYPEDEF397_tree=null;
        Object IDENTIFIER398_tree=null;
        Object EQ399_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:551:19: ( TYPEDEF IDENTIFIER EQ funcType )
            // C:\\antlr\\TinyHaxeTry1.g:551:21: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            TYPEDEF397=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl4717); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF397_tree = (Object)adaptor.create(TYPEDEF397);
            adaptor.addChild(root_0, TYPEDEF397_tree);
            }
            IDENTIFIER398=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl4719); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER398_tree = (Object)adaptor.create(IDENTIFIER398);
            adaptor.addChild(root_0, IDENTIFIER398_tree);
            }
            EQ399=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl4721); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ399_tree = (Object)adaptor.create(EQ399);
            adaptor.addChild(root_0, EQ399_tree);
            }
            pushFollow(FOLLOW_funcType_in_typedefDecl4723);
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
    // C:\\antlr\\TinyHaxeTry1.g:553:1: typeExtend : GT funcType COMMA ;
    public final TinyHaxeTry1Parser.typeExtend_return typeExtend() throws RecognitionException {
        TinyHaxeTry1Parser.typeExtend_return retval = new TinyHaxeTry1Parser.typeExtend_return();
        retval.start = input.LT(1);
        int typeExtend_StartIndex = input.index();
        Object root_0 = null;

        Token GT401=null;
        Token COMMA403=null;
        TinyHaxeTry1Parser.funcType_return funcType402 = null;


        Object GT401_tree=null;
        Object COMMA403_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:553:19: ( GT funcType COMMA )
            // C:\\antlr\\TinyHaxeTry1.g:553:21: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            GT401=(Token)match(input,GT,FOLLOW_GT_in_typeExtend4739); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT401_tree = (Object)adaptor.create(GT401);
            adaptor.addChild(root_0, GT401_tree);
            }
            pushFollow(FOLLOW_funcType_in_typeExtend4741);
            funcType402=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType402.getTree());
            COMMA403=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend4743); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:555:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
    public final TinyHaxeTry1Parser.anonType_return anonType() throws RecognitionException {
        TinyHaxeTry1Parser.anonType_return retval = new TinyHaxeTry1Parser.anonType_return();
        retval.start = input.LT(1);
        int anonType_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE404=null;
        Token RBRACE410=null;
        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList405 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList406 = null;

        TinyHaxeTry1Parser.typeExtend_return typeExtend407 = null;

        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList408 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList409 = null;


        Object LBRACE404_tree=null;
        Object RBRACE410_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:555:19: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            // C:\\antlr\\TinyHaxeTry1.g:555:21: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            LBRACE404=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType4762); if (state.failed) return retval;
            // C:\\antlr\\TinyHaxeTry1.g:556:4: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
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
                    // C:\\antlr\\TinyHaxeTry1.g:557:22: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:557:27: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType4797);
                    anonTypeFieldList405=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList405.getTree());

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:558:26: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType4825);
                    varDeclList406=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList406.getTree());

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:559:27: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType4854);
                    typeExtend407=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend407.getTree());
                    // C:\\antlr\\TinyHaxeTry1.g:559:38: ( | anonTypeFieldList | varDeclList )
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
                            // C:\\antlr\\TinyHaxeTry1.g:560:24: 
                            {
                            }
                            break;
                        case 2 :
                            // C:\\antlr\\TinyHaxeTry1.g:560:25: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType4882);
                            anonTypeFieldList408=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList408.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\antlr\\TinyHaxeTry1.g:561:25: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType4908);
                            varDeclList409=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList409.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE410=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType4956); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:565:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
    public final TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeFieldList_return retval = new TinyHaxeTry1Parser.anonTypeFieldList_return();
        retval.start = input.LT(1);
        int anonTypeFieldList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA412=null;
        TinyHaxeTry1Parser.anonTypeField_return anonTypeField411 = null;

        TinyHaxeTry1Parser.anonTypeField_return anonTypeField413 = null;


        Object COMMA412_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:565:19: ( anonTypeField ( COMMA anonTypeField )* )
            // C:\\antlr\\TinyHaxeTry1.g:565:21: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4966);
            anonTypeField411=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField411.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:565:35: ( COMMA anonTypeField )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==COMMA) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:565:36: COMMA anonTypeField
            	    {
            	    COMMA412=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList4969); if (state.failed) return retval;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4972);
            	    anonTypeField413=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField413.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:568:1: objLit : '{' objLitElemList '}' ;
    public final TinyHaxeTry1Parser.objLit_return objLit() throws RecognitionException {
        TinyHaxeTry1Parser.objLit_return retval = new TinyHaxeTry1Parser.objLit_return();
        retval.start = input.LT(1);
        int objLit_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal414=null;
        Token char_literal416=null;
        TinyHaxeTry1Parser.objLitElemList_return objLitElemList415 = null;


        Object char_literal414_tree=null;
        Object char_literal416_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:568:19: ( '{' objLitElemList '}' )
            // C:\\antlr\\TinyHaxeTry1.g:568:21: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal414=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit4995); if (state.failed) return retval;
            pushFollow(FOLLOW_objLitElemList_in_objLit4998);
            objLitElemList415=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList415.getTree());
            char_literal416=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit5000); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:570:1: anonTypeField : IDENTIFIER COLON funcType ;
    public final TinyHaxeTry1Parser.anonTypeField_return anonTypeField() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeField_return retval = new TinyHaxeTry1Parser.anonTypeField_return();
        retval.start = input.LT(1);
        int anonTypeField_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER417=null;
        Token COLON418=null;
        TinyHaxeTry1Parser.funcType_return funcType419 = null;


        Object IDENTIFIER417_tree=null;
        Object COLON418_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:570:19: ( IDENTIFIER COLON funcType )
            // C:\\antlr\\TinyHaxeTry1.g:570:20: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER417=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField5012); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER417_tree = (Object)adaptor.create(IDENTIFIER417);
            adaptor.addChild(root_0, IDENTIFIER417_tree);
            }
            COLON418=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField5014); if (state.failed) return retval;
            pushFollow(FOLLOW_funcType_in_anonTypeField5017);
            funcType419=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType419.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:572:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
    public final TinyHaxeTry1Parser.objLitElemList_return objLitElemList() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElemList_return retval = new TinyHaxeTry1Parser.objLitElemList_return();
        retval.start = input.LT(1);
        int objLitElemList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA421=null;
        TinyHaxeTry1Parser.objLitElem_return objLitElem420 = null;

        TinyHaxeTry1Parser.objLitElem_return objLitElem422 = null;


        Object COMMA421_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:572:19: ( objLitElem ( COMMA objLitElem )* )
            // C:\\antlr\\TinyHaxeTry1.g:572:21: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_objLitElem_in_objLitElemList5029);
            objLitElem420=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem420.getTree());
            // C:\\antlr\\TinyHaxeTry1.g:572:32: ( COMMA objLitElem )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==COMMA) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:572:33: COMMA objLitElem
            	    {
            	    COMMA421=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList5032); if (state.failed) return retval;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList5035);
            	    objLitElem422=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem422.getTree());

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
    // C:\\antlr\\TinyHaxeTry1.g:574:1: objLitElem : IDENTIFIER COLON expr ;
    public final TinyHaxeTry1Parser.objLitElem_return objLitElem() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElem_return retval = new TinyHaxeTry1Parser.objLitElem_return();
        retval.start = input.LT(1);
        int objLitElem_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER423=null;
        Token COLON424=null;
        TinyHaxeTry1Parser.expr_return expr425 = null;


        Object IDENTIFIER423_tree=null;
        Object COLON424_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:574:19: ( IDENTIFIER COLON expr )
            // C:\\antlr\\TinyHaxeTry1.g:574:20: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER423=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem5052); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER423_tree = (Object)adaptor.create(IDENTIFIER423);
            adaptor.addChild(root_0, IDENTIFIER423_tree);
            }
            COLON424=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem5054); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_objLitElem5057);
            expr425=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr425.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
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
    // C:\\antlr\\TinyHaxeTry1.g:577:1: elementarySymbol : ( LONGLITERAL | INTLITERAL | STRINGLITERAL | CHARLITERAL | FLOATNUM );
    public final TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        TinyHaxeTry1Parser.elementarySymbol_return retval = new TinyHaxeTry1Parser.elementarySymbol_return();
        retval.start = input.LT(1);
        int elementarySymbol_StartIndex = input.index();
        Object root_0 = null;

        Token set426=null;

        Object set426_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // C:\\antlr\\TinyHaxeTry1.g:578:2: ( LONGLITERAL | INTLITERAL | STRINGLITERAL | CHARLITERAL | FLOATNUM )
            // C:\\antlr\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            set426=(Token)input.LT(1);
            if ( (input.LA(1)>=LONGLITERAL && input.LA(1)<=FLOATNUM) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set426));
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
        // C:\\antlr\\TinyHaxeTry1.g:357:9: ( block )
        // C:\\antlr\\TinyHaxeTry1.g:357:9: block
        {
        pushFollow(FOLLOW_block_in_synpred41_TinyHaxeTry11721);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_TinyHaxeTry1

    // $ANTLR start synpred42_TinyHaxeTry1
    public final void synpred42_TinyHaxeTry1_fragment() throws RecognitionException {   
        TinyHaxeTry1Parser.statement_return st2 = null;


        // C:\\antlr\\TinyHaxeTry1.g:358:41: ( ELSE st2= statement )
        // C:\\antlr\\TinyHaxeTry1.g:358:41: ELSE st2= statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred42_TinyHaxeTry11740); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred42_TinyHaxeTry11744);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_TinyHaxeTry1

    // $ANTLR start synpred49_TinyHaxeTry1
    public final void synpred49_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:365:17: ( expr )
        // C:\\antlr\\TinyHaxeTry1.g:365:17: expr
        {
        pushFollow(FOLLOW_expr_in_synpred49_TinyHaxeTry11872);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_TinyHaxeTry1

    // $ANTLR start synpred56_TinyHaxeTry1
    public final void synpred56_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:369:9: ( expr SEMI )
        // C:\\antlr\\TinyHaxeTry1.g:369:9: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred56_TinyHaxeTry11969);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred56_TinyHaxeTry11972); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_TinyHaxeTry1

    // $ANTLR start synpred57_TinyHaxeTry1
    public final void synpred57_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:370:9: ( IDENTIFIER COLON statement )
        // C:\\antlr\\TinyHaxeTry1.g:370:9: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred57_TinyHaxeTry11984); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred57_TinyHaxeTry11986); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred57_TinyHaxeTry11988);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_TinyHaxeTry1

    // $ANTLR start synpred63_TinyHaxeTry1
    public final void synpred63_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:410:21: ( exprList )
        // C:\\antlr\\TinyHaxeTry1.g:410:21: exprList
        {
        pushFollow(FOLLOW_exprList_in_synpred63_TinyHaxeTry12410);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_TinyHaxeTry1

    // $ANTLR start synpred91_TinyHaxeTry1
    public final void synpred91_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:438:21: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr )
        // C:\\antlr\\TinyHaxeTry1.g:438:21: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
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

        pushFollow(FOLLOW_prefixExpr_in_synpred91_TinyHaxeTry12867);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred91_TinyHaxeTry1

    // $ANTLR start synpred94_TinyHaxeTry1
    public final void synpred94_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:454:4: ( value LPAREN exprListOpt RPAREN )
        // C:\\antlr\\TinyHaxeTry1.g:454:4: value LPAREN exprListOpt RPAREN
        {
        pushFollow(FOLLOW_value_in_synpred94_TinyHaxeTry12966);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred94_TinyHaxeTry12968); if (state.failed) return ;
        pushFollow(FOLLOW_exprListOpt_in_synpred94_TinyHaxeTry12970);
        exprListOpt();

        state._fsp--;
        if (state.failed) return ;
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred94_TinyHaxeTry12972); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred94_TinyHaxeTry1

    // $ANTLR start synpred95_TinyHaxeTry1
    public final void synpred95_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:455:4: ( value DOT IDENTIFIER )
        // C:\\antlr\\TinyHaxeTry1.g:455:4: value DOT IDENTIFIER
        {
        pushFollow(FOLLOW_value_in_synpred95_TinyHaxeTry12987);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,DOT,FOLLOW_DOT_in_synpred95_TinyHaxeTry12989); if (state.failed) return ;
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred95_TinyHaxeTry12991); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred95_TinyHaxeTry1

    // $ANTLR start synpred96_TinyHaxeTry1
    public final void synpred96_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:456:4: ( value LBRACKET expr RBRACKET )
        // C:\\antlr\\TinyHaxeTry1.g:456:4: value LBRACKET expr RBRACKET
        {
        pushFollow(FOLLOW_value_in_synpred96_TinyHaxeTry12997);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred96_TinyHaxeTry12999); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred96_TinyHaxeTry13001);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred96_TinyHaxeTry13003); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_TinyHaxeTry1

    // $ANTLR start synpred97_TinyHaxeTry1
    public final void synpred97_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:457:4: ( value PLUSPLUS )
        // C:\\antlr\\TinyHaxeTry1.g:457:4: value PLUSPLUS
        {
        pushFollow(FOLLOW_value_in_synpred97_TinyHaxeTry13008);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred97_TinyHaxeTry13010); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_TinyHaxeTry1

    // $ANTLR start synpred98_TinyHaxeTry1
    public final void synpred98_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:458:4: ( value SUBSUB )
        // C:\\antlr\\TinyHaxeTry1.g:458:4: value SUBSUB
        {
        pushFollow(FOLLOW_value_in_synpred98_TinyHaxeTry13016);
        value();

        state._fsp--;
        if (state.failed) return ;
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred98_TinyHaxeTry13018); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred98_TinyHaxeTry1

    // $ANTLR start synpred100_TinyHaxeTry1
    public final void synpred100_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:464:25: ( arrayLit )
        // C:\\antlr\\TinyHaxeTry1.g:464:25: arrayLit
        {
        pushFollow(FOLLOW_arrayLit_in_synpred100_TinyHaxeTry13061);
        arrayLit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_TinyHaxeTry1

    // $ANTLR start synpred105_TinyHaxeTry1
    public final void synpred105_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:469:34: ( expr )
        // C:\\antlr\\TinyHaxeTry1.g:469:34: expr
        {
        pushFollow(FOLLOW_expr_in_synpred105_TinyHaxeTry13195);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred105_TinyHaxeTry1

    // $ANTLR start synpred106_TinyHaxeTry1
    public final void synpred106_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:469:25: ( LPAREN ( expr | statement ) RPAREN )
        // C:\\antlr\\TinyHaxeTry1.g:469:25: LPAREN ( expr | statement ) RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred106_TinyHaxeTry13191); if (state.failed) return ;
        // C:\\antlr\\TinyHaxeTry1.g:469:33: ( expr | statement )
        int alt77=2;
        alt77 = dfa77.predict(input);
        switch (alt77) {
            case 1 :
                // C:\\antlr\\TinyHaxeTry1.g:469:34: expr
                {
                pushFollow(FOLLOW_expr_in_synpred106_TinyHaxeTry13195);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\antlr\\TinyHaxeTry1.g:469:39: statement
                {
                pushFollow(FOLLOW_statement_in_synpred106_TinyHaxeTry13197);
                statement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred106_TinyHaxeTry13200); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_TinyHaxeTry1

    // $ANTLR start synpred108_TinyHaxeTry1
    public final void synpred108_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:475:21: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        // C:\\antlr\\TinyHaxeTry1.g:475:21: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        match(input,CAST,FOLLOW_CAST_in_synpred108_TinyHaxeTry13297); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred108_TinyHaxeTry13299); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred108_TinyHaxeTry13301);
        expr();

        state._fsp--;
        if (state.failed) return ;
        // C:\\antlr\\TinyHaxeTry1.g:475:38: ( COMMA funcType )?
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( (LA78_0==COMMA) ) {
            alt78=1;
        }
        switch (alt78) {
            case 1 :
                // C:\\antlr\\TinyHaxeTry1.g:475:39: COMMA funcType
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred108_TinyHaxeTry13304); if (state.failed) return ;
                pushFollow(FOLLOW_funcType_in_synpred108_TinyHaxeTry13306);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred108_TinyHaxeTry13310); if (state.failed) return ;

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
        "\1\24\2\0\20\uffff\1\0\36\uffff";
    static final String DFA26_maxS =
        "\1\u00a1\2\0\20\uffff\1\0\36\uffff";
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
            return "356:1: statement : ( block | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | forStmt | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO statement WHILE parExpression ) | tryStmt | switchStmt | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI );";
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
        "\1\24\7\0\43\uffff";
    static final String DFA46_maxS =
        "\1\u00a1\7\0\43\uffff";
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
            return "453:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR value exprListOpt ) | value DOT IDENTIFIER | value LBRACKET expr RBRACKET | value PLUSPLUS | value SUBSUB | value );";
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
        "\1\24\1\uffff\1\0\4\uffff\1\0\43\uffff";
    static final String DFA48_maxS =
        "\1\u00a1\1\uffff\1\0\4\uffff\1\0\43\uffff";
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
            return "463:1: value : ( funcLit | arrayLit | objLit | NULL | IDENTIFIER | elementarySymbol | LPAREN ( expr | statement ) RPAREN | );";
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
        "\1\24\43\0\14\uffff";
    static final String DFA47_maxS =
        "\1\u00a1\43\0\14\uffff";
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
            return "469:33: ( expr | statement )";
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
            return "518:1: funcDecl : ( declAttrList FUNCTION NEW RPAREN paramList LPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW paramList typeTagOpt block ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER paramList typeTagOpt block typeParamOpt ) );";
        }
    }
    static final String DFA59_eotS =
        "\14\uffff";
    static final String DFA59_eofS =
        "\14\uffff";
    static final String DFA59_minS =
        "\6\30\2\25\4\uffff";
    static final String DFA59_maxS =
        "\6\40\2\126\4\uffff";
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
            return "523:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );";
        }
    }
    static final String DFA61_eotS =
        "\12\uffff";
    static final String DFA61_eofS =
        "\1\11\11\uffff";
    static final String DFA61_minS =
        "\6\30\4\uffff";
    static final String DFA61_maxS =
        "\6\131\4\uffff";
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
            return "530:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );";
        }
    }
    static final String DFA62_eotS =
        "\12\uffff";
    static final String DFA62_eofS =
        "\1\11\11\uffff";
    static final String DFA62_minS =
        "\6\30\4\uffff";
    static final String DFA62_maxS =
        "\6\131\4\uffff";
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
            return "537:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );";
        }
    }
    static final String DFA77_eotS =
        "\60\uffff";
    static final String DFA77_eofS =
        "\60\uffff";
    static final String DFA77_minS =
        "\1\24\43\0\14\uffff";
    static final String DFA77_maxS =
        "\1\u00a1\43\0\14\uffff";
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
            return "469:33: ( expr | statement )";
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
 

    public static final BitSet FOLLOW_myPackage_in_module130 = new BitSet(new long[]{0x000007A000800000L,0x0000000139000000L});
    public static final BitSet FOLLOW_topLevelList_in_module132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelList_in_module167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList190 = new BitSet(new long[]{0x000007A000800002L,0x0000000139000000L});
    public static final BitSet FOLLOW_myImport_in_topLevel209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_topLevel235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage280 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage282 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_myPackage284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier315 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier331 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier335 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_IMPORT_in_myImport377 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport380 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_myImport382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_access0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_declAttr469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList587 = new BitSet(new long[]{0x000000003F000002L});
    public static final BitSet FOLLOW_param_in_paramList624 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList627 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_param_in_paramList629 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_QUES_in_param668 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param671 = new BitSet(new long[]{0x0000080000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param673 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_varInitOpt_in_param675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dotIdent707 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_DOT_in_dotIdent715 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dotIdent719 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit1055 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit1057 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcLit1059 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit1061 = new BitSet(new long[]{0x0080080000100000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit1063 = new BitSet(new long[]{0x0080080000100000L});
    public static final BitSet FOLLOW_block_in_funcLit1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit1094 = new BitSet(new long[]{0x0080005B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit1097 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppIf_in_pp1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElseIf_in_pp1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElse_in_pp1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppEnd_in_pp1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppError_in_pp1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_IF_in_ppIf1253 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_IF_in_ppIf1281 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_BANG_in_ppIf1283 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1303 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1330 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_BANG_in_ppElseIf1332 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSE_in_ppElse1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_END_in_ppEnd1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ERROR_in_ppError1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1417 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_typeTag1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1490 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1493 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_typeList1496 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1524 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1527 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1530 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_type_in_funcType1573 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1577 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_type_in_funcType1580 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_anonType_in_type1605 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_dotIdent_in_type1609 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_typeParam_in_type1613 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_GT_in_typeParam1632 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1635 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1684 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1686 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1688 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1690 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1731 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1733 = new BitSet(new long[]{0x62FE884B00700000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_statement_in_statement1737 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1740 = new BitSet(new long[]{0x62FE884B00700000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_statement_in_statement1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStmt_in_statement1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1795 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1797 = new BitSet(new long[]{0x62FE884B00700000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_statement_in_statement1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1819 = new BitSet(new long[]{0x62FE884B00700000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_statement_in_statement1821 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1823 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1825 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_statement1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStmt_in_statement1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStmt_in_statement1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1869 = new BitSet(new long[]{0x0080004B00700000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_statement1872 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_statement1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1895 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_statement1897 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_statement1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1917 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1920 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_statement1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1943 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1946 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_statement1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement1969 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_statement1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1984 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_statement1986 = new BitSet(new long[]{0x62FE884B00700000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_statement_in_statement1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2033 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_parExpression2036 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2060 = new BitSet(new long[]{0x63FE884B3F700000L,0x0000003E1AFC4000L});
    public static final BitSet FOLLOW_blockStmt_in_block2063 = new BitSet(new long[]{0x63FE884B3F700000L,0x0000003E1AFC4000L});
    public static final BitSet FOLLOW_RBRACE_in_block2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStmt2140 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_forStmt2142 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_forStmt2146 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_IN_in_forStmt2148 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_forStmt2152 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_forStmt2154 = new BitSet(new long[]{0x62FE884B00700000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_statement_in_forStmt2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt2193 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt2210 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2231 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2233 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt2251 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStmt2270 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_switchStmt2272 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_switchStmt2274 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_switchStmt2276 = new BitSet(new long[]{0x0080080000100000L});
    public static final BitSet FOLLOW_block_in_switchStmt2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStmt2307 = new BitSet(new long[]{0x0080080000100000L});
    public static final BitSet FOLLOW_block_in_tryStmt2309 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_catchStmtList_in_tryStmt2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList2334 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2375 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2377 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_param_in_catchStmt2379 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2381 = new BitSet(new long[]{0x0080080000100000L});
    public static final BitSet FOLLOW_block_in_catchStmt2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2450 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2453 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_exprList2456 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2496 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L,0x0000000380003FC0L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2499 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2502 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L,0x0000000380003FC0L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2526 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2529 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2552 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2555 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2558 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2560 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2563 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2581 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2585 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2588 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2605 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2609 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2612 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2634 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2638 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2641 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2645 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2648 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2652 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2655 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2659 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2662 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2666 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2670 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2674 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2678 = new BitSet(new long[]{0x0000600000000002L,0x0000000000000078L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2700 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2704 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2707 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2711 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2714 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2717 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2720 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2740 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2744 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2748 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr2752 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2756 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2760 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2763 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2791 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_SUB_in_addExpr2796 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2800 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2822 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_STAR_in_multExpr2827 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2830 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2833 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2837 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_set_in_prefixExpr2855 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2966 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_suffixExpr2968 = new BitSet(new long[]{0x0080004F00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2970 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_suffixExpr2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2987 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOT_in_suffixExpr2989 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_suffixExpr2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2997 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2999 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_suffixExpr3001 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_suffixExpr3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_value3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value3191 = new BitSet(new long[]{0x62FE884B00700000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_value3195 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_statement_in_value3197 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_value3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr3258 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_type_in_newExpr3260 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr3262 = new BitSet(new long[]{0x0080004F00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr3264 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3297 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3299 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_cast3301 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_COMMA_in_cast3304 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_cast3306 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast3326 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast3328 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_cast3330 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl3451 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl3453 = new BitSet(new long[]{0x0080200000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3455 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumDecl3457 = new BitSet(new long[]{0x000007A000200000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl3459 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumDecl3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody3492 = new BitSet(new long[]{0x000007A000200002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3506 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3508 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl3511 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3513 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3542 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_enumValueDecl3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList3586 = new BitSet(new long[]{0x000000003F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl3610 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_VAR_in_varDecl3614 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3616 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3642 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList3645 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3648 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3664 = new BitSet(new long[]{0x0000080200000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3666 = new BitSet(new long[]{0x0000080000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3668 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_varInitOpt_in_varDeclPart3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl3688 = new BitSet(new long[]{0x1000000010200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3692 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl3694 = new BitSet(new long[]{0x1000000010200000L,0x0000000000200000L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3698 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_varInitOpt3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit3903 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_varInit3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3930 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl3934 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3936 = new BitSet(new long[]{0x0000000280200000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3938 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3940 = new BitSet(new long[]{0x0080080000100000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3942 = new BitSet(new long[]{0x0080080000100000L});
    public static final BitSet FOLLOW_block_in_funcDecl3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3989 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3991 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3993 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3995 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3997 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3999 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4001 = new BitSet(new long[]{0x0080080000100000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4003 = new BitSet(new long[]{0x0080080000100000L});
    public static final BitSet FOLLOW_block_in_funcDecl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl4051 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4053 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4055 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4057 = new BitSet(new long[]{0x0080080000100000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4059 = new BitSet(new long[]{0x0080080000100000L});
    public static final BitSet FOLLOW_block_in_funcDecl4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl4103 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl4105 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl4107 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl4109 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl4111 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl4113 = new BitSet(new long[]{0x0080080000100000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl4115 = new BitSet(new long[]{0x0080080000100000L});
    public static final BitSet FOLLOW_block_in_funcDecl4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4148 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4152 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4154 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4156 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4158 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4160 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl4202 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4204 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4206 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4208 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4210 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4212 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4214 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4216 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl4261 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4263 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4265 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4267 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4269 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl4309 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl4311 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl4313 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl4315 = new BitSet(new long[]{0x0000000480200000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl4317 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl4319 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl4321 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERN_in_classDecl4353 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4356 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4358 = new BitSet(new long[]{0x0080200000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl4360 = new BitSet(new long[]{0x0080000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl4362 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_classDecl4364 = new BitSet(new long[]{0x010007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_classBody_in_classDecl4366 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_classDecl4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classBody4401 = new BitSet(new long[]{0x000007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_classBody_in_classBody4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classBody4429 = new BitSet(new long[]{0x000007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_classBody_in_classBody4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_classBody4457 = new BitSet(new long[]{0x000007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_classBody_in_classBody4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl4494 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl4496 = new BitSet(new long[]{0x0080000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl4498 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl4500 = new BitSet(new long[]{0x010007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl4503 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody4519 = new BitSet(new long[]{0x000007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody4547 = new BitSet(new long[]{0x000007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_interfaceBody4575 = new BitSet(new long[]{0x000007A13F000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList4614 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList4617 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList4620 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit4672 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_type_in_inherit4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit4700 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_type_in_inherit4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl4717 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl4719 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl4721 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend4739 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend4741 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType4762 = new BitSet(new long[]{0x010020003F200000L,0x0000000002000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4797 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4825 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType4854 = new BitSet(new long[]{0x010000003F200000L,0x0000000002000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4882 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4908 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType4956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4966 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList4969 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4972 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit4995 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit4998 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField5012 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField5014 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5029 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList5032 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5035 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem5052 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem5054 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_objLitElem5057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_elementarySymbol0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred41_TinyHaxeTry11721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred42_TinyHaxeTry11740 = new BitSet(new long[]{0x62FE884B00700000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_statement_in_synpred42_TinyHaxeTry11744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred49_TinyHaxeTry11872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred56_TinyHaxeTry11969 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_synpred56_TinyHaxeTry11972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred57_TinyHaxeTry11984 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_COLON_in_synpred57_TinyHaxeTry11986 = new BitSet(new long[]{0x62FE884B00700000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_statement_in_synpred57_TinyHaxeTry11988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred63_TinyHaxeTry12410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred91_TinyHaxeTry12855 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred91_TinyHaxeTry12867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred94_TinyHaxeTry12966 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred94_TinyHaxeTry12968 = new BitSet(new long[]{0x0080004F00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_exprListOpt_in_synpred94_TinyHaxeTry12970 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred94_TinyHaxeTry12972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred95_TinyHaxeTry12987 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOT_in_synpred95_TinyHaxeTry12989 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred95_TinyHaxeTry12991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred96_TinyHaxeTry12997 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred96_TinyHaxeTry12999 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_synpred96_TinyHaxeTry13001 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred96_TinyHaxeTry13003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred97_TinyHaxeTry13008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred97_TinyHaxeTry13010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred98_TinyHaxeTry13016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred98_TinyHaxeTry13018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_synpred100_TinyHaxeTry13061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred105_TinyHaxeTry13195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred106_TinyHaxeTry13191 = new BitSet(new long[]{0x62FE884B00700000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_synpred106_TinyHaxeTry13195 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_statement_in_synpred106_TinyHaxeTry13197 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred106_TinyHaxeTry13200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred108_TinyHaxeTry13297 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred108_TinyHaxeTry13299 = new BitSet(new long[]{0x0080004B00600000L,0x0000003E00FC4000L});
    public static final BitSet FOLLOW_expr_in_synpred108_TinyHaxeTry13301 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred108_TinyHaxeTry13304 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_funcType_in_synpred108_TinyHaxeTry13306 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred108_TinyHaxeTry13310 = new BitSet(new long[]{0x0000000000000002L});

}